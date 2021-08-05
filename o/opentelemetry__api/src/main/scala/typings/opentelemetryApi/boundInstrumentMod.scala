package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boundInstrumentMod {
  
  trait BoundBaseObserver extends StObject {
    
    def update(value: Double): Unit
  }
  object BoundBaseObserver {
    
    inline def apply(update: Double => Unit): BoundBaseObserver = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[BoundBaseObserver]
    }
    
    extension [Self <: BoundBaseObserver](x: Self) {
      
      inline def setUpdate(value: Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  trait BoundCounter extends StObject {
    
    /**
      * Adds the given value to the current value. Values cannot be negative.
      * @param value the value to add.
      */
    def add(value: Double): Unit
  }
  object BoundCounter {
    
    inline def apply(add: Double => Unit): BoundCounter = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
      __obj.asInstanceOf[BoundCounter]
    }
    
    extension [Self <: BoundCounter](x: Self) {
      
      inline def setAdd(value: Double => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    }
  }
  
  trait BoundValueRecorder extends StObject {
    
    /**
      * Records the given value to this value recorder.
      * @param value to record.
      */
    def record(value: Double): Unit
  }
  object BoundValueRecorder {
    
    inline def apply(record: Double => Unit): BoundValueRecorder = {
      val __obj = js.Dynamic.literal(record = js.Any.fromFunction1(record))
      __obj.asInstanceOf[BoundValueRecorder]
    }
    
    extension [Self <: BoundValueRecorder](x: Self) {
      
      inline def setRecord(value: Double => Unit): Self = StObject.set(x, "record", js.Any.fromFunction1(value))
    }
  }
}
