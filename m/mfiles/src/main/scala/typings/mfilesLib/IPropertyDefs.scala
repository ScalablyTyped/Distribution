package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyDefs extends js.Object {
  val Count: scala.Double
  def Clone(): IPropertyDefs
  def Item(Index: scala.Double): IPropertyDef
}

object IPropertyDefs {
  @scala.inline
  def apply(
    Clone: js.Function0[IPropertyDefs],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IPropertyDef]
  ): IPropertyDefs = {
    val __obj = js.Dynamic.literal(Clone = Clone, Count = Count, Item = Item)
  
    __obj.asInstanceOf[IPropertyDefs]
  }
}

