package typings
package nextLib.documentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultDocumentIProps extends RenderPageResponse {
  var styles: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object DefaultDocumentIProps {
  @scala.inline
  def apply(
    head: reactLib.reactMod.ReactNode = null,
    html: java.lang.String = null,
    styles: reactLib.reactMod.ReactNode = null
  ): DefaultDocumentIProps = {
    val __obj = js.Dynamic.literal()
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDocumentIProps]
  }
}

