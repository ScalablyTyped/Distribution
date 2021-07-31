package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boundInstrumentMod {
  
  trait BoundBaseObserver extends StObject {
    
    def update(value: Double): Unit
  }
  object BoundBaseObserver {
    
    @scala.inline
    def apply(update: Double => Unit): BoundBaseObserver = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[BoundBaseObserver]
    }
    
    @scala.inline
    implicit class BoundBaseObserverMutableBuilder[Self <: BoundBaseObserver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUpdate(value: Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
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
    
    @scala.inline
    def apply(add: Double => Unit): BoundCounter = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
      __obj.asInstanceOf[BoundCounter]
    }
    
    @scala.inline
    implicit class BoundCounterMutableBuilder[Self <: BoundCounter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: Double => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
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
    
    @scala.inline
    def apply(record: Double => Unit): BoundValueRecorder = {
      val __obj = js.Dynamic.literal(record = js.Any.fromFunction1(record))
      __obj.asInstanceOf[BoundValueRecorder]
    }
    
    @scala.inline
    implicit class BoundValueRecorderMutableBuilder[Self <: BoundValueRecorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecord(value: Double => Unit): Self = StObject.set(x, "record", js.Any.fromFunction1(value))
    }
  }
}
