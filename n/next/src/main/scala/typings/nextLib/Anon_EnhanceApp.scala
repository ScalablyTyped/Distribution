package typings
package nextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnhanceApp[EA /* <: nextLib.documentMod.PageProps */, PA, E /* <: nextLib.documentMod.PageProps */, P] extends js.Object {
  var enhanceApp: js.UndefOr[nextLib.documentMod.Enhancer[EA, PA]] = js.undefined
  var enhanceComponent: js.UndefOr[nextLib.documentMod.Enhancer[E, P]] = js.undefined
}

object Anon_EnhanceApp {
  @scala.inline
  def apply[EA /* <: nextLib.documentMod.PageProps */, PA, E /* <: nextLib.documentMod.PageProps */, P](
    enhanceApp: nextLib.documentMod.Enhancer[EA, PA] = null,
    enhanceComponent: nextLib.documentMod.Enhancer[E, P] = null
  ): Anon_EnhanceApp[EA, PA, E, P] = {
    val __obj = js.Dynamic.literal()
    if (enhanceApp != null) __obj.updateDynamic("enhanceApp")(enhanceApp)
    if (enhanceComponent != null) __obj.updateDynamic("enhanceComponent")(enhanceComponent)
    __obj.asInstanceOf[Anon_EnhanceApp[EA, PA, E, P]]
  }
}

