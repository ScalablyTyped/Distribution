package typings.postmanCollection.mod

import typings.postmanCollection.anon.Src
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typings.postmanCollection.mod.PropertyDefinition because Already inherited
- typings.postmanCollection.mod.CertificateDefinition because var conflicts: description, disabled, id, name. Inlined matches, key, cert, passphrase */ @JSImport("postman-collection", "Certificate")
@js.native
class Certificate protected () extends Property[CertificateDefinition] {
  def this(options: CertificateDefinition) = this()
  
  def canApplyTo(url: String): Boolean = js.native
  def canApplyTo(url: Url): Boolean = js.native
  
  var cert: js.UndefOr[Src | String] = js.native
  
  var key: js.UndefOr[Src | String] = js.native
  
  var matches: js.UndefOr[js.Array[String] | UrlMatchPatternList] = js.native
  
  var passphrase: js.UndefOr[String] = js.native
  
  def update(options: CertificateDefinition): Unit = js.native
}
/* static members */
object Certificate {
  
  @JSImport("postman-collection", "Certificate.isCertificate")
  @js.native
  def isCertificate(obj: js.Any): Boolean = js.native
}
