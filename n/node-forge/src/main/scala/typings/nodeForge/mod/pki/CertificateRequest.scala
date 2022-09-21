package typings.nodeForge.mod.pki

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateRequest
  extends StObject
     with Certificate {
  
  /**
    * Gets an issuer or subject attribute from its name, type, or short name.
    *
    * @param opts a short name string or an object with:
    *          shortName the short name for the attribute.
    *          name the name for the attribute.
    *          type the type for the attribute.
    *
    * @return the attribute.
    */
  def getAttribute(opts: String): Attribute | Null = js.native
  def getAttribute(opts: GetAttributeOpts): Attribute | Null = js.native
}
