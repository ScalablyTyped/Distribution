package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpressions extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, Expression: IExpression): Unit = js.native
  def Clone(): IExpressions = js.native
  def Item(Index: Double): IExpression = js.native
  def Item(Index: Double, value: IExpression): Unit = js.native
  def Remove(Index: Double): Unit = js.native
}

