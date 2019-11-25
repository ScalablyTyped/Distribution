package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderNameListing extends js.Object {
  val Count: Double
  val MoreValues: Boolean
  def Item(Index: Double): ITypedValue
  def SortWithExpression(Expression: IExpression, Locale: Double): Unit
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
}

