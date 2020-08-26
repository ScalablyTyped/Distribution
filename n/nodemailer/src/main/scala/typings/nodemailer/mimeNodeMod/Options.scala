package typings.nodemailer.mimeNodeMod

import typings.nodemailer.nodemailerStrings.B
import typings.nodemailer.nodemailerStrings.Q
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** shared part of the unique multipart boundary */
  var baseBoundary: js.UndefOr[String] = js.native
  /** filename for an attachment node */
  var filename: js.UndefOr[String] = js.native
  /** If true, do not exclude Bcc from the generated headers */
  var keepBcc: js.UndefOr[Boolean] = js.native
  /** method to normalize header keys for custom caseing */
  var normalizeHeaderKey: js.UndefOr[js.Function1[/* key */ String, String]] = js.native
  /** immediate parent for this node */
  var parentNode: js.UndefOr[MimeNode] = js.native
  /** root node for this tree */
  var rootNode: js.UndefOr[MimeNode] = js.native
  /** either 'Q' (the default) or 'B' */
  var textEncoding: js.UndefOr[B | Q] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaseBoundary(value: String): Self = this.set("baseBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseBoundary: Self = this.set("baseBoundary", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setKeepBcc(value: Boolean): Self = this.set("keepBcc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepBcc: Self = this.set("keepBcc", js.undefined)
    @scala.inline
    def setNormalizeHeaderKey(value: /* key */ String => String): Self = this.set("normalizeHeaderKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNormalizeHeaderKey: Self = this.set("normalizeHeaderKey", js.undefined)
    @scala.inline
    def setParentNode(value: MimeNode): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentNode: Self = this.set("parentNode", js.undefined)
    @scala.inline
    def setRootNode(value: MimeNode): Self = this.set("rootNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootNode: Self = this.set("rootNode", js.undefined)
    @scala.inline
    def setTextEncoding(value: B | Q): Self = this.set("textEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextEncoding: Self = this.set("textEncoding", js.undefined)
  }
  
}

