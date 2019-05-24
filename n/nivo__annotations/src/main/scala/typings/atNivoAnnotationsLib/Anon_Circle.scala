package typings
package atNivoAnnotationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Circle extends js.Object {
  var size: scala.Double
  var `type`: atNivoAnnotationsLib.atNivoAnnotationsLibStrings.circle
}

object Anon_Circle {
  @scala.inline
  def apply(size: scala.Double, `type`: atNivoAnnotationsLib.atNivoAnnotationsLibStrings.circle): Anon_Circle = {
    val __obj = js.Dynamic.literal(size = size)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Circle]
  }
}

