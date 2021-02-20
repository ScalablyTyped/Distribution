package typings.pkijs

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issuerAndSerialNumberMod {
  
  @JSImport("pkijs/src/IssuerAndSerialNumber", JSImport.Default)
  @js.native
  class default () extends IssuerAndSerialNumber {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/IssuerAndSerialNumber", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/IssuerAndSerialNumber", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/IssuerAndSerialNumber", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait IssuerAndSerialNumber extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var issuer: typings.pkijs.relativeDistinguishedNamesMod.default = js.native
    
    var serialNumber: Integer = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object IssuerAndSerialNumber {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      issuer: typings.pkijs.relativeDistinguishedNamesMod.default,
      serialNumber: Integer,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): IssuerAndSerialNumber = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), issuer = issuer.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[IssuerAndSerialNumber]
    }
    
    @scala.inline
    implicit class IssuerAndSerialNumberMutableBuilder[Self <: IssuerAndSerialNumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIssuer(value: typings.pkijs.relativeDistinguishedNamesMod.default): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
