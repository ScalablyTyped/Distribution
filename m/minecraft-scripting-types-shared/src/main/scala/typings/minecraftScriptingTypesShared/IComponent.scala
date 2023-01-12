package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IComponent[T] extends StObject {
  
  /**
    * The identifier of the component, e.g., "minecraft:position", or "minecraft:nameable"
    */
  val __identifier__ : String
  
  /**
    * The type of the object
    */
  val __type__ : component
  
  var data: T
}
object IComponent {
  
  inline def apply[T](__identifier__ : String, data: T): IComponent[T] = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = "component", data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComponent[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IComponent[?], T] (val x: Self & IComponent[T]) extends AnyVal {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def set__identifier__(value: String): Self = StObject.set(x, "__identifier__", value.asInstanceOf[js.Any])
    
    inline def set__type__(value: component): Self = StObject.set(x, "__type__", value.asInstanceOf[js.Any])
  }
}
