package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpressionExs extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, ExpressionEx: IExpressionEx): Unit = js.native
  def Clone(): IExpressionExs = js.native
  def Item(Index: Double): IExpressionEx = js.native
  def Item(Index: Double, value: IExpressionEx): Unit = js.native
  def Remove(Index: Double): Unit = js.native
}

