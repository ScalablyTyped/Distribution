package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFolderNameListing extends js.Object {
  
  val Count: Double = js.native
  
  def Item(Index: Double): ITypedValue = js.native
  
  val MoreValues: Boolean = js.native
  
  def SortWithExpression(Expression: IExpression, Locale: Double): Unit = js.native
}
object IFolderNameListing {
  
  @scala.inline
  def apply(
    Count: Double,
    Item: Double => ITypedValue,
    MoreValues: Boolean,
    SortWithExpression: (IExpression, Double) => Unit
  ): IFolderNameListing = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), MoreValues = MoreValues.asInstanceOf[js.Any], SortWithExpression = js.Any.fromFunction2(SortWithExpression))
    __obj.asInstanceOf[IFolderNameListing]
  }
  
  @scala.inline
  implicit class IFolderNameListingOps[Self <: IFolderNameListing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => ITypedValue): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoreValues(value: Boolean): Self = this.set("MoreValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortWithExpression(value: (IExpression, Double) => Unit): Self = this.set("SortWithExpression", js.Any.fromFunction2(value))
  }
}
