package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFolderContentItems extends StObject {
  
  val Count: Double
  
  def Item(Index: Double): IFolderContentItem
  
  val MoreResults: Boolean
}
object IFolderContentItems {
  
  @scala.inline
  def apply(Count: Double, Item: Double => IFolderContentItem, MoreResults: Boolean): IFolderContentItems = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), MoreResults = MoreResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderContentItems]
  }
  
  @scala.inline
  implicit class IFolderContentItemsMutableBuilder[Self <: IFolderContentItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IFolderContentItem): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoreResults(value: Boolean): Self = StObject.set(x, "MoreResults", value.asInstanceOf[js.Any])
  }
}
