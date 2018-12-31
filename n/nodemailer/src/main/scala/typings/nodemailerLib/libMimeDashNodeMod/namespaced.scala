package typings
package nodemailerLib.libMimeDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new mime tree node. Assumes 'multipart/ *' as the content type
  * if it is a branch, anything else counts as leaf. If rootNode is missing from
  * the options, assumes this is the root.
  */
@JSImport("nodemailer/lib/mime-node", JSImport.Namespace)
@js.native
class namespaced protected () extends MimeNode {
  def this(contentType: java.lang.String) = this()
  def this(contentType: java.lang.String, options: nodemailerLib.libMimeDashNodeMod.MimeNodeNs.Options) = this()
}

