package typings.atNivoCore.atNivoCoreMod

import typings.atNivoCore.Anon_
import typings.atNivoCore.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgDefsAndFill[T] extends js.Object {
  var defs: js.UndefOr[js.Array[Anon_Id]] = js.undefined
  var fill: js.UndefOr[js.Array[Anon_[T]]] = js.undefined
}

object SvgDefsAndFill {
  @scala.inline
  def apply[T](defs: js.Array[Anon_Id] = null, fill: js.Array[Anon_[T]] = null): SvgDefsAndFill[T] = {
    val __obj = js.Dynamic.literal()
    if (defs != null) __obj.updateDynamic("defs")(defs.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgDefsAndFill[T]]
  }
}

