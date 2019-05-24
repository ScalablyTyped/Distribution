package typings
package atNivoAnnotationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dot extends js.Object {
  var size: js.UndefOr[scala.Double] = js.undefined
  var `type`: atNivoAnnotationsLib.atNivoAnnotationsLibStrings.dot
}

object Anon_Dot {
  @scala.inline
  def apply(
    `type`: atNivoAnnotationsLib.atNivoAnnotationsLibStrings.dot,
    size: scala.Int | scala.Double = null
  ): Anon_Dot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Dot]
  }
}

