package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(postmanDashCollectionLib.postmanDashCollectionMod.CertificateDefinition because Would inherit conflicting mutable fields List(description, name, disabled, id))*/
@JSImport("postman-collection", "Certificate")
@js.native
class Certificate protected () extends Property[CertificateDefinition] {
  def this(options: CertificateDefinition) = this()
  var cert: postmanDashCollectionLib.Anon_SrcString = js.native
  var key: postmanDashCollectionLib.Anon_SrcString = js.native
  var matches: UrlMatchPatternList = js.native
  var passphrase: java.lang.String = js.native
  def canApplyTo(url: java.lang.String): scala.Boolean = js.native
  def canApplyTo(url: Url): scala.Boolean = js.native
  def update(options: CertificateDefinition): scala.Unit = js.native
}

@JSImport("postman-collection", "Certificate")
@js.native
object Certificate extends js.Object {
  def isCertificate(obj: js.Any): scala.Boolean = js.native
}

