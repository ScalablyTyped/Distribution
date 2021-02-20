package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyDefs extends StObject {
  
  def Clone(): IPropertyDefs = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IPropertyDef = js.native
}
object IPropertyDefs {
  
  @scala.inline
  def apply(Clone: () => IPropertyDefs, Count: Double, Item: Double => IPropertyDef): IPropertyDefs = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IPropertyDefs]
  }
  
  @scala.inline
  implicit class IPropertyDefsMutableBuilder[Self <: IPropertyDefs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IPropertyDefs): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IPropertyDef): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
