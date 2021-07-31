package typings.pkijs

import typings.asn1js.mod.Integer
import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authorityKeyIdentifierMod {
  
  @JSImport("pkijs/src/AuthorityKeyIdentifier", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with AuthorityKeyIdentifier {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var authorityCertIssuer: js.Array[typings.pkijs.accessDescriptionMod.default] = js.native
    
    /* CompleteClass */
    var authorityCertSerialNumber: Integer = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var keyIdentifier: OctetString = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/AuthorityKeyIdentifier", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait AuthorityKeyIdentifier extends StObject {
    
    var authorityCertIssuer: js.Array[typings.pkijs.accessDescriptionMod.default]
    
    var authorityCertSerialNumber: Integer
    
    def fromSchema(schema: js.Any): Unit
    
    var keyIdentifier: OctetString
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
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
