package typings.nodemailer.mimeNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new mime tree node. Assumes 'multipart/ *' as the content type
  * if it is a branch, anything else counts as leaf. If rootNode is missing from
  * the options, assumes this is the root.
  */
@JSImport("nodemailer/lib/mime-node", JSImport.Namespace)
@js.native
class ^ () extends MimeNode {
  def this(contentType: String) = this()
  def this(contentType: js.UndefOr[scala.Nothing], options: Options) = this()
  def this(contentType: String, options: Options) = this()
}
