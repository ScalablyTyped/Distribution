package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X509CertificateUserBinding extends StObject {
  
  /**
    * The priority of the binding. Azure AD uses the binding with the highest priority. This value must be a non-negative
    * integer and unique in the collection of objects in the certificateUserBindings property of an
    * x509CertificateAuthenticationMethodConfiguration object. Required
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the Azure AD user property of the user object to use for the binding. The possible values are:
    * userPrincipalName, onPremisesUserPrincipalName, certificateUserIds. Required.
    */
  var userProperty: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The field on the X.509 certificate to use for the binding. The possible values are: PrincipalName, RFC822Name,
    * SubjectKeyIdentifier, SHA1PublicKey.
    */
  var x509CertificateField: js.UndefOr[NullableOption[String]] = js.undefined
}
object X509CertificateUserBinding {
  
  inline def apply(): X509CertificateUserBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X509CertificateUserBinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X509CertificateUserBinding] (val x: Self) extends AnyVal {
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setUserProperty(value: NullableOption[String]): Self = StObject.set(x, "userProperty", value.asInstanceOf[js.Any])
    
    inline def setUserPropertyNull: Self = StObject.set(x, "userProperty", null)
    
    inline def setUserPropertyUndefined: Self = StObject.set(x, "userProperty", js.undefined)
    
    inline def setX509CertificateField(value: NullableOption[String]): Self = StObject.set(x, "x509CertificateField", value.asInstanceOf[js.Any])
    
    inline def setX509CertificateFieldNull: Self = StObject.set(x, "x509CertificateField", null)
    
    inline def setX509CertificateFieldUndefined: Self = StObject.set(x, "x509CertificateField", js.undefined)
  }
}
