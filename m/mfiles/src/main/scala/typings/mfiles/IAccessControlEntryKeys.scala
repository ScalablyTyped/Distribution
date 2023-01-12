package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessControlEntryKeys extends StObject {
  
  def Clone(): IAccessControlEntryKeys
  
  val Count: Double
  
  def Item(Index: Double): IAccessControlEntryKey
}
object IAccessControlEntryKeys {
  
  inline def apply(Clone: () => IAccessControlEntryKeys, Count: Double, Item: Double => IAccessControlEntryKey): IAccessControlEntryKeys = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IAccessControlEntryKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAccessControlEntryKeys] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => IAccessControlEntryKeys): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IAccessControlEntryKey): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
