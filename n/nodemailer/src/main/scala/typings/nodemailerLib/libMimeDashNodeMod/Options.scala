package typings
package nodemailerLib.libMimeDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** shared part of the unique multipart boundary */
  var baseBoundary: js.UndefOr[java.lang.String] = js.undefined
  /** filename for an attachment node */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /** If true, do not exclude Bcc from the generated headers */
  var keepBcc: js.UndefOr[scala.Boolean] = js.undefined
  /** method to normalize header keys for custom caseing */
  var normalizeHeaderKey: js.UndefOr[js.Function1[/* key */ java.lang.String, java.lang.String]] = js.undefined
  /** immediate parent for this node */
  var parentNode: js.UndefOr[MimeNode] = js.undefined
  /** root node for this tree */
  var rootNode: js.UndefOr[MimeNode] = js.undefined
  /** either 'Q' (the default) or 'B' */
  var textEncoding: js.UndefOr[nodemailerLib.nodemailerLibStrings.B | nodemailerLib.nodemailerLibStrings.Q] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    baseBoundary: java.lang.String = null,
    filename: java.lang.String = null,
    keepBcc: js.UndefOr[scala.Boolean] = js.undefined,
    normalizeHeaderKey: /* key */ java.lang.String => java.lang.String = null,
    parentNode: MimeNode = null,
    rootNode: MimeNode = null,
    textEncoding: nodemailerLib.nodemailerLibStrings.B | nodemailerLib.nodemailerLibStrings.Q = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (baseBoundary != null) __obj.updateDynamic("baseBoundary")(baseBoundary)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(keepBcc)) __obj.updateDynamic("keepBcc")(keepBcc)
    if (normalizeHeaderKey != null) __obj.updateDynamic("normalizeHeaderKey")(js.Any.fromFunction1(normalizeHeaderKey))
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode)
    if (rootNode != null) __obj.updateDynamic("rootNode")(rootNode)
    if (textEncoding != null) __obj.updateDynamic("textEncoding")(textEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

