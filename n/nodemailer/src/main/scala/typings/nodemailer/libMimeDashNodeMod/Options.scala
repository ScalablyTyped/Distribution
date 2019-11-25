package typings.nodemailer.libMimeDashNodeMod

import typings.nodemailer.nodemailerStrings.B
import typings.nodemailer.nodemailerStrings.Q
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** shared part of the unique multipart boundary */
  var baseBoundary: js.UndefOr[String] = js.undefined
  /** filename for an attachment node */
  var filename: js.UndefOr[String] = js.undefined
  /** If true, do not exclude Bcc from the generated headers */
  var keepBcc: js.UndefOr[Boolean] = js.undefined
  /** method to normalize header keys for custom caseing */
  var normalizeHeaderKey: js.UndefOr[js.Function1[/* key */ String, String]] = js.undefined
  /** immediate parent for this node */
  var parentNode: js.UndefOr[MimeNode] = js.undefined
  /** root node for this tree */
  var rootNode: js.UndefOr[MimeNode] = js.undefined
  /** either 'Q' (the default) or 'B' */
  var textEncoding: js.UndefOr[B | Q] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    baseBoundary: String = null,
    filename: String = null,
    keepBcc: js.UndefOr[Boolean] = js.undefined,
    normalizeHeaderKey: /* key */ String => String = null,
    parentNode: MimeNode = null,
    rootNode: MimeNode = null,
    textEncoding: B | Q = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (baseBoundary != null) __obj.updateDynamic("baseBoundary")(baseBoundary.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(keepBcc)) __obj.updateDynamic("keepBcc")(keepBcc.asInstanceOf[js.Any])
    if (normalizeHeaderKey != null) __obj.updateDynamic("normalizeHeaderKey")(js.Any.fromFunction1(normalizeHeaderKey))
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    if (rootNode != null) __obj.updateDynamic("rootNode")(rootNode.asInstanceOf[js.Any])
    if (textEncoding != null) __obj.updateDynamic("textEncoding")(textEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

