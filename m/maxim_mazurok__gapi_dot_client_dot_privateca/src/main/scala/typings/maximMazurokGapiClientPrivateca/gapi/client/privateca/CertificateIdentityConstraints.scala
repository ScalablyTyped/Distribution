package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateIdentityConstraints extends StObject {
  
  /**
    * Required. If this is true, the SubjectAltNames extension may be copied from a certificate request into the signed certificate. Otherwise, the requested SubjectAltNames will be
    * discarded.
    */
  var allowSubjectAltNamesPassthrough: js.UndefOr[Boolean] = js.undefined
  
  /** Required. If this is true, the Subject field may be copied from a certificate request into the signed certificate. Otherwise, the requested Subject will be discarded. */
  var allowSubjectPassthrough: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. A CEL expression that may be used to validate the resolved X.509 Subject and/or Subject Alternative Name before a certificate is signed. To see the full allowed syntax and
    * some examples, see https://cloud.google.com/certificate-authority-service/docs/using-cel
    */
  var celExpression: js.UndefOr[Expr] = js.undefined
}
object CertificateIdentityConstraints {
  
  inline def apply(): CertificateIdentityConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateIdentityConstraints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificateIdentityConstraints] (val x: Self) extends AnyVal {
    
    inline def setAllowSubjectAltNamesPassthrough(value: Boolean): Self = StObject.set(x, "allowSubjectAltNamesPassthrough", value.asInstanceOf[js.Any])
    
    inline def setAllowSubjectAltNamesPassthroughUndefined: Self = StObject.set(x, "allowSubjectAltNamesPassthrough", js.undefined)
    
    inline def setAllowSubjectPassthrough(value: Boolean): Self = StObject.set(x, "allowSubjectPassthrough", value.asInstanceOf[js.Any])
    
    inline def setAllowSubjectPassthroughUndefined: Self = StObject.set(x, "allowSubjectPassthrough", js.undefined)
    
    inline def setCelExpression(value: Expr): Self = StObject.set(x, "celExpression", value.asInstanceOf[js.Any])
    
    inline def setCelExpressionUndefined: Self = StObject.set(x, "celExpression", js.undefined)
  }
}
