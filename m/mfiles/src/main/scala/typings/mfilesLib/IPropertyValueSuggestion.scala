package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValueSuggestion extends js.Object {
  val IsFact: scala.Boolean
  val Quality: scala.Double
  val TypedValue: ITypedValue
  def Clone(): IPropertyValueSuggestion
}

