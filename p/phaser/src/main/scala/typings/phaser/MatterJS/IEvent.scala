package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEvent[T] extends StObject {
  
  /**
    * The name of the event
    */
  var name: String
  
  /**
    * The source object of the event
    */
  var source: T
}
object IEvent {
  
  @scala.inline
  def apply[T](name: String, source: T): IEvent[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent[T]]
  }
  
  @scala.inline
  implicit class IEventMutableBuilder[Self <: IEvent[?], T] (val x: Self & IEvent[T]) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: T): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
