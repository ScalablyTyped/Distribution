package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyDefs extends js.Object {
  val Count: Double
  def Clone(): IPropertyDefs
  def Item(Index: Double): IPropertyDef
}

object IPropertyDefs {
  @scala.inline
  def apply(Clone: () => IPropertyDefs, Count: Double, Item: Double => IPropertyDef): IPropertyDefs = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IPropertyDefs]
  }
}

