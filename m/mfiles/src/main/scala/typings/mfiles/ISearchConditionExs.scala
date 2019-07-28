package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchConditionExs extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, SearchConditionEx: ISearchConditionEx): Unit = js.native
  def Clone(): ISearchConditionExs = js.native
  def Item(Index: Double): ISearchConditionEx = js.native
  def Item(Index: Double, value: ISearchConditionEx): Unit = js.native
  def Remove(Index: Double): Unit = js.native
}

