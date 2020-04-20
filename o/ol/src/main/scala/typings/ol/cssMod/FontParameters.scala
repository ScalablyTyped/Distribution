package typings.ol.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontParameters extends js.Object {
  var families: js.Array[String]
  var family: String
  var lineHeight: String
  var size: String
  var style: String
  var variant: String
  var weight: String
}

object FontParameters {
  @scala.inline
  def apply(
    families: js.Array[String],
    family: String,
    lineHeight: String,
    size: String,
    style: String,
    variant: String,
    weight: String
  ): FontParameters = {
    val __obj = js.Dynamic.literal(families = families.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontParameters]
  }
}

