package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IFolderNameListing extends js.Object {
  val Count: scala.Double
  val MoreValues: scala.Boolean
  def Item(Index: scala.Double): ITypedValue
  def SortWithExpression(Expression: IExpression, Locale: scala.Double): scala.Unit
}

