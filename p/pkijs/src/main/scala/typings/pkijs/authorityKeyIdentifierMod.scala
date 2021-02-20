package typings.pkijs

import typings.asn1js.mod.Integer
import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authorityKeyIdentifierMod {
  
  @JSImport("pkijs/src/AuthorityKeyIdentifier", JSImport.Default)
  @js.native
  class default () extends AuthorityKeyIdentifier {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/AuthorityKeyIdentifier", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/AuthorityKeyIdentifier", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/AuthorityKeyIdentifier", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait AuthorityKeyIdentifier extends StObject {
    
    var authorityCertIssuer: js.Array[typings.pkijs.accessDescriptionMod.default] = js.native
    
    var authorityCertSerialNumber: Integer = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var keyIdentifier: OctetString = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object AuthorityKeyIdentifier {
    
    @scala.inline
    def apply(
      authorityCertIssuer: js.Array[typings.pkijs.accessDescriptionMod.default],
      authorityCertSerialNumber: Integer,
      fromSchema: js.Any => Unit,
      keyIdentifier: OctetString,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): AuthorityKeyIdentifier = {
      val __obj = js.Dynamic.literal(authorityCertIssuer = authorityCertIssuer.asInstanceOf[js.Any], authorityCertSerialNumber = authorityCertSerialNumber.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), keyIdentifier = keyIdentifier.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[AuthorityKeyIdentifier]
    }
    
    @scala.inline
    implicit class AuthorityKeyIdentifierMutableBuilder[Self <: AuthorityKeyIdentifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorityCertIssuer(value: js.Array[typings.pkijs.accessDescriptionMod.default]): Self = StObject.set(x, "authorityCertIssuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorityCertIssuerVarargs(value: typings.pkijs.accessDescriptionMod.default*): Self = StObject.set(x, "authorityCertIssuer", js.Array(value :_*))
      
      @scala.inline
      def setAuthorityCertSerialNumber(value: Integer): Self = StObject.set(x, "authorityCertSerialNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyIdentifier(value: OctetString): Self = StObject.set(x, "keyIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
