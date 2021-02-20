package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.event_data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventData[T] extends StObject {
  
  /**
    * The identifier of the event
    */
  val __identifier__ : String = js.native
  
  /**
    * The type of the object
    */
  val __type__ : event_data = js.native
  
  var data: T = js.native
}
object IEventData {
  
  @scala.inline
  def apply[T](__identifier__ : String, __type__ : event_data, data: T): IEventData[T] = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = __type__.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventData[T]]
  }
  
  @scala.inline
  implicit class IEventDataMutableBuilder[Self <: IEventData[_], T] (val x: Self with IEventData[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__identifier__(value: String): Self = StObject.set(x, "__identifier__", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__type__(value: event_data): Self = StObject.set(x, "__type__", value.asInstanceOf[js.Any])
  }
}
