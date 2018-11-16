package typings
package nodemailerLib.libMimeDashNodeMod.MimeNodeNs

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
  var parentNode: js.UndefOr[nodemailerLib.libMimeDashNodeMod.MimeNode] = js.undefined
  /** root node for this tree */
  var rootNode: js.UndefOr[nodemailerLib.libMimeDashNodeMod.MimeNode] = js.undefined
  /** either 'Q' (the default) or 'B' */
  var textEncoding: js.UndefOr[nodemailerLib.nodemailerLibStrings.B | nodemailerLib.nodemailerLibStrings.Q] = js.undefined
}

