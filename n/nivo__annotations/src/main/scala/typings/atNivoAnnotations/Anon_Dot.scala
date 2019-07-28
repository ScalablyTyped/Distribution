package typings.atNivoAnnotations

import typings.atNivoAnnotations.atNivoAnnotationsStrings.dot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dot extends js.Object {
  var size: js.UndefOr[Double] = js.undefined
  var `type`: dot
}

object Anon_Dot {
  @scala.inline
  def apply(`type`: dot, size: Int | Double = null): Anon_Dot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Dot]
  }
}

