package typings.pkijs

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issuerAndSerialNumberMod {
  
  @JSImport("pkijs/src/IssuerAndSerialNumber", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with IssuerAndSerialNumber {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var issuer: typings.pkijs.relativeDistinguishedNamesMod.default = js.native
    
    /* CompleteClass */
    var serialNumber: Integer = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/IssuerAndSerialNumber", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait IssuerAndSerialNumber extends StObject {
    
    def fromSchema(schema: js.Any): Unit
    
    var issuer: typings.pkijs.relativeDistinguishedNamesMod.default
    
    var serialNumber: Integer
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
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
