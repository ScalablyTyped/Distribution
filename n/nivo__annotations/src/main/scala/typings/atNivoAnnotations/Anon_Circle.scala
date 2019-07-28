package typings.atNivoAnnotations

import typings.atNivoAnnotations.atNivoAnnotationsStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Circle extends js.Object {
  var size: Double
  var `type`: circle
}

object Anon_Circle {
  @scala.inline
  def apply(size: Double, `type`: circle): Anon_Circle = {
    val __obj = js.Dynamic.literal(size = size)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Circle]
  }
}

