package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.item_stack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IItemStack
  extends StObject
     with _IMinecraftObject {
  
  /**
    * The identifier of the item stack
    */
  val __identifier__ : String
  
  /**
    * The type of the object
    */
  val __type__ : item_stack
  
  /**
    * The number of items in the stack
    */
  val count: Double
  
  /**
    * The identifier of the item
    */
  val item: String
}
object IItemStack {
  
  inline def apply(__identifier__ : String, count: Double, item: String): IItemStack = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = "item_stack", count = count.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemStack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IItemStack] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def set__identifier__(value: String): Self = StObject.set(x, "__identifier__", value.asInstanceOf[js.Any])
    
    inline def set__type__(value: item_stack): Self = StObject.set(x, "__type__", value.asInstanceOf[js.Any])
  }
}
