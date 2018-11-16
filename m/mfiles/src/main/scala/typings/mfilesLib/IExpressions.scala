package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpressions extends js.Object {
  val Count: scala.Double = js.native
  def Add(Index: scala.Double, Expression: IExpression): scala.Unit = js.native
  def Clone(): IExpressions = js.native
  def Item(Index: scala.Double): IExpression = js.native
  def Item(Index: scala.Double, value: IExpression): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

