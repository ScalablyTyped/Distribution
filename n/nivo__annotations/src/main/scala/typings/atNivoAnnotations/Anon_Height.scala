package typings.atNivoAnnotations

import typings.atNivoAnnotations.atNivoAnnotationsStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: Double
  var `type`: rect
  var width: Double
}

object Anon_Height {
  @scala.inline
  def apply(height: Double, `type`: rect, width: Double): Anon_Height = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Height]
  }
}

