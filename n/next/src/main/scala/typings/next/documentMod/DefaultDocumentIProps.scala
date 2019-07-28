package typings.next.documentMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultDocumentIProps extends RenderPageResponse {
  var styles: js.UndefOr[ReactNode] = js.undefined
}

object DefaultDocumentIProps {
  @scala.inline
  def apply(head: ReactNode = null, html: String = null, styles: ReactNode = null): DefaultDocumentIProps = {
    val __obj = js.Dynamic.literal()
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDocumentIProps]
  }
}

