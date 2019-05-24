package typings
package atNivoAnnotationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: scala.Double
  var `type`: atNivoAnnotationsLib.atNivoAnnotationsLibStrings.rect
  var width: scala.Double
}

object Anon_Height {
  @scala.inline
  def apply(
    height: scala.Double,
    `type`: atNivoAnnotationsLib.atNivoAnnotationsLibStrings.rect,
    width: scala.Double
  ): Anon_Height = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Height]
  }
}

