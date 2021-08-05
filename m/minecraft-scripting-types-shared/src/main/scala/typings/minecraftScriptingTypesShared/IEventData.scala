package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.event_data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventData[T] extends StObject {
  
  /**
    * The identifier of the event
    */
  val __identifier__ : String
  
  /**
    * The type of the object
    */
  val __type__ : event_data
  
  var data: T
}
object IEventData {
  
  inline def apply[T](__identifier__ : String, data: T): IEventData[T] = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = "event_data", data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventData[T]]
  }
  
  extension [Self <: IEventData[?], T](x: Self & IEventData[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def set__identifier__(value: String): Self = StObject.set(x, "__identifier__", value.asInstanceOf[js.Any])
    
    inline def set__type__(value: event_data): Self = StObject.set(x, "__type__", value.asInstanceOf[js.Any])
  }
}
