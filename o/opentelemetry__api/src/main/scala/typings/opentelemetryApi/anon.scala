package typings.opentelemetryApi

import typings.opentelemetryApi.metricMod.BaseObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Observer extends StObject {
    
    var observer: BaseObserver
    
    var value: Double
  }
  object Observer {
    
    inline def apply(observer: BaseObserver, value: Double): Observer = {
      val __obj = js.Dynamic.literal(observer = observer.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Observer]
    }
    
    extension [Self <: Observer](x: Self) {
      
      inline def setObserver(value: BaseObserver): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var observer: BaseObserver
    
    var value: Double
  }
  object Value {
    
    inline def apply(observer: BaseObserver, value: Double): Value = {
      val __obj = js.Dynamic.literal(observer = observer.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setObserver(value: BaseObserver): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
