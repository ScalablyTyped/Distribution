package typings.postmanDashCollection.postmanDashCollectionMod

import typings.postmanDashCollection.Anon_Src
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.postmanDashCollection.postmanDashCollectionMod.PropertyBaseDefinition because Already inherited
- typings.postmanDashCollection.postmanDashCollectionMod.PropertyDefinition because Already inherited
- typings.postmanDashCollection.postmanDashCollectionMod.CertificateDefinition because var conflicts: description, disabled, id, name. Inlined matches, key, cert, passphrase */ @JSImport("postman-collection", "Certificate")
@js.native
class Certificate protected () extends Property[CertificateDefinition] {
  def this(options: CertificateDefinition) = this()
  var cert: js.UndefOr[Anon_Src | String] = js.native
  var key: js.UndefOr[Anon_Src | String] = js.native
  var matches: js.UndefOr[js.Array[String] | UrlMatchPatternList] = js.native
  var passphrase: js.UndefOr[String] = js.native
  def canApplyTo(url: String): Boolean = js.native
  def canApplyTo(url: Url): Boolean = js.native
  def update(options: CertificateDefinition): Unit = js.native
}

/* static members */
@JSImport("postman-collection", "Certificate")
@js.native
object Certificate extends js.Object {
  def isCertificate(obj: js.Any): Boolean = js.native
}

