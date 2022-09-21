package typings.newrelic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CollectPendingData extends StObject {
    
    var collectPendingData: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var waitForIdle: js.UndefOr[Boolean] = js.undefined
  }
  object CollectPendingData {
    
    inline def apply(): CollectPendingData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollectPendingData]
    }
    
    extension [Self <: CollectPendingData](x: Self) {
      
      inline def setCollectPendingData(value: Boolean): Self = StObject.set(x, "collectPendingData", value.asInstanceOf[js.Any])
      
      inline def setCollectPendingDataUndefined: Self = StObject.set(x, "collectPendingData", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWaitForIdle(value: Boolean): Self = StObject.set(x, "waitForIdle", value.asInstanceOf[js.Any])
      
      inline def setWaitForIdleUndefined: Self = StObject.set(x, "waitForIdle", js.undefined)
    }
  }
  
  trait ModuleName extends StObject {
    
    var moduleName: String
    
    var onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
    
    def onRequire(): Unit
  }
  object ModuleName {
    
    inline def apply(moduleName: String, onRequire: () => Unit): ModuleName = {
      val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any], onRequire = js.Any.fromFunction0(onRequire))
      __obj.asInstanceOf[ModuleName]
    }
    
    extension [Self <: ModuleName](x: Self) {
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      inline def setOnError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnRequire(value: () => Unit): Self = StObject.set(x, "onRequire", js.Any.fromFunction0(value))
    }
  }
}
