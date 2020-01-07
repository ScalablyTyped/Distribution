package typings.ol.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontParameters extends js.Object {
  var families: js.Array[String]
  var style: String
  var weight: String
}

object FontParameters {
  @scala.inline
  def apply(families: js.Array[String], style: String, weight: String): FontParameters = {
    val __obj = js.Dynamic.literal(families = families.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FontParameters]
  }
}

