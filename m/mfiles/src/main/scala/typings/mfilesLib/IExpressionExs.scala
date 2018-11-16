package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpressionExs extends js.Object {
  val Count: scala.Double = js.native
  def Add(Index: scala.Double, ExpressionEx: IExpressionEx): scala.Unit = js.native
  def Clone(): IExpressionExs = js.native
  def Item(Index: scala.Double): IExpressionEx = js.native
  def Item(Index: scala.Double, value: IExpressionEx): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

