package typings.next.distPagesUnderscoreDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginProps extends js.Object {
  var crossOrigin: js.UndefOr[String] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
}

object OriginProps {
  @scala.inline
  def apply(crossOrigin: String = null, nonce: String = null): OriginProps = {
    val __obj = js.Dynamic.literal()
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[OriginProps]
  }
}

