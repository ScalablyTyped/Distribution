package typings.postcssValueParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A CSS dimension, decomposed into its numeric and unit parts
  */
trait Dimension extends js.Object {
  var number: String
  var unit: String
}

object Dimension {
  @scala.inline
  def apply(number: String, unit: String): Dimension = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
}

