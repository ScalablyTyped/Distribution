package typings.next

import typings.next.documentMod.Enhancer
import typings.next.documentMod.PageProps
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnhanceApp[EA /* <: PageProps */, PA, E /* <: PageProps */, P] extends js.Object {
  var enhanceApp: js.UndefOr[Enhancer[EA, PA]] = js.undefined
  var enhanceComponent: js.UndefOr[Enhancer[E, P]] = js.undefined
}

object Anon_EnhanceApp {
  @scala.inline
  def apply[EA /* <: PageProps */, PA, E /* <: PageProps */, P](
    enhanceApp: /* page */ ComponentType[PA] => ComponentType[EA] = null,
    enhanceComponent: /* page */ ComponentType[P] => ComponentType[E] = null
  ): Anon_EnhanceApp[EA, PA, E, P] = {
    val __obj = js.Dynamic.literal()
    if (enhanceApp != null) __obj.updateDynamic("enhanceApp")(js.Any.fromFunction1(enhanceApp))
    if (enhanceComponent != null) __obj.updateDynamic("enhanceComponent")(js.Any.fromFunction1(enhanceComponent))
    __obj.asInstanceOf[Anon_EnhanceApp[EA, PA, E, P]]
  }
}

