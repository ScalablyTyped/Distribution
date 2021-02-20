package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IComponent[T] extends StObject {
  
  /**
    * The identifier of the component, e.g., "minecraft:position", or "minecraft:nameable"
    */
  val __identifier__ : String = js.native
  
  /**
    * The type of the object
    */
  val __type__ : component = js.native
  
  var data: T = js.native
}
object IComponent {
  
  @scala.inline
  def apply[T](__identifier__ : String, __type__ : component, data: T): IComponent[T] = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = __type__.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComponent[T]]
  }
  
  @scala.inline
  implicit class IComponentMutableBuilder[Self <: IComponent[_], T] (val x: Self with IComponent[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__identifier__(value: String): Self = StObject.set(x, "__identifier__", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__type__(value: component): Self = StObject.set(x, "__type__", value.asInstanceOf[js.Any])
  }
}
