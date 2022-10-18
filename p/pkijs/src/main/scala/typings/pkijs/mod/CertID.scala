package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an CertID described in [RFC6960](https://datatracker.ietf.org/doc/html/rfc6960)
  */
@js.native
trait CertID
  extends StObject
     with PkiObject
     with ICertID {
  
  /**
    * Making OCSP certificate identifier for specific certificate
    * @param certificate Certificate making OCSP Request for
    * @param parameters Additional parameters
    * @param crypto Crypto engine
    */
  def createForCertificate(certificate: Certificate, parameters: CertIDCreateParams): js.Promise[Unit] = js.native
  def createForCertificate(certificate: Certificate, parameters: CertIDCreateParams, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  
  /**
    * Checks that two "CertIDs" are equal
    * @param certificateID Identifier of the certificate to be checked
    */
  def isEqual(certificateID: CertID): Boolean = js.native
}
