package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyValueSuggestions extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, IPropertyValueSuggestion: IPropertyValueSuggestion): Unit = js.native
  def Clone(): IPropertyValueSuggestions = js.native
  def Item(Index: Double): IPropertyValueSuggestion = js.native
  def Item(Index: Double, value: IPropertyValueSuggestion): Unit = js.native
  def Remove(Index: Double): Unit = js.native
}

