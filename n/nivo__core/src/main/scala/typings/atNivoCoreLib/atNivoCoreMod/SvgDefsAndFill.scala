package typings
package atNivoCoreLib.atNivoCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgDefsAndFill[T] extends js.Object {
  var defs: js.UndefOr[js.Array[atNivoCoreLib.Anon_Id]] = js.undefined
  var fill: js.UndefOr[js.Array[atNivoCoreLib.Anon_[T]]] = js.undefined
}

object SvgDefsAndFill {
  @scala.inline
  def apply[T](defs: js.Array[atNivoCoreLib.Anon_Id] = null, fill: js.Array[atNivoCoreLib.Anon_[T]] = null): SvgDefsAndFill[T] = {
    val __obj = js.Dynamic.literal()
    if (defs != null) __obj.updateDynamic("defs")(defs)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    __obj.asInstanceOf[SvgDefsAndFill[T]]
  }
}

