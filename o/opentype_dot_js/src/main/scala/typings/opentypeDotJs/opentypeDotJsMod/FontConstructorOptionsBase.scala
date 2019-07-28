package typings.opentypeDotJs.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontConstructorOptionsBase extends js.Object {
  var ascender: Double
  var descender: Double
  var familyName: String
  var styleName: String
  var unitsPerEm: Double
}

object FontConstructorOptionsBase {
  @scala.inline
  def apply(ascender: Double, descender: Double, familyName: String, styleName: String, unitsPerEm: Double): FontConstructorOptionsBase = {
    val __obj = js.Dynamic.literal(ascender = ascender, descender = descender, familyName = familyName, styleName = styleName, unitsPerEm = unitsPerEm)
  
    __obj.asInstanceOf[FontConstructorOptionsBase]
  }
}

