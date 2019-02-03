package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- postmanDashCollectionLib.postmanDashCollectionMod.CertificateDefinition because var conflicts: description, disabled, id, name. Inlined matches, key, cert, passphrase */ @JSImport("postman-collection", "Certificate")
@js.native
class Certificate protected () extends Property[CertificateDefinition] {
  def this(options: CertificateDefinition) = this()
  var cert: postmanDashCollectionLib.Anon_Src | (js.UndefOr[postmanDashCollectionLib.Anon_Src | java.lang.String]) = js.native
  var key: postmanDashCollectionLib.Anon_Src | (js.UndefOr[postmanDashCollectionLib.Anon_Src | java.lang.String]) = js.native
  var matches: (js.UndefOr[js.Array[java.lang.String] | UrlMatchPatternList]) | UrlMatchPatternList = js.native
  var passphrase: java.lang.String | js.UndefOr[java.lang.String] = js.native
  def canApplyTo(url: java.lang.String): scala.Boolean = js.native
  def canApplyTo(url: Url): scala.Boolean = js.native
  def update(options: CertificateDefinition): scala.Unit = js.native
}

/* static members */
@JSImport("postman-collection", "Certificate")
@js.native
object Certificate extends js.Object {
  def isCertificate(obj: js.Any): scala.Boolean = js.native
}

