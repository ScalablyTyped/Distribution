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
    
    @scala.inline
    def apply(observer: BaseObserver, value: Double): Observer = {
      val __obj = js.Dynamic.literal(observer = observer.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Observer]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObserver(value: BaseObserver): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var observer: BaseObserver
    
    var value: Double
  }
  object Value {
    
    @scala.inline
    def apply(observer: BaseObserver, value: Double): Value = {
      val __obj = js.Dynamic.literal(observer = observer.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObserver(value: BaseObserver): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
