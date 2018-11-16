package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyValueSuggestions extends js.Object {
  val Count: scala.Double = js.native
  def Add(Index: scala.Double, IPropertyValueSuggestion: IPropertyValueSuggestion): scala.Unit = js.native
  def Clone(): IPropertyValueSuggestions = js.native
  def Item(Index: scala.Double): IPropertyValueSuggestion = js.native
  def Item(Index: scala.Double, value: IPropertyValueSuggestion): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

