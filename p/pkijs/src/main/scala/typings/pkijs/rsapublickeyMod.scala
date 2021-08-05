package typings.pkijs

import typings.asn1js.mod.Integer
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsapublickeyMod {
  
  @JSImport("pkijs/src/RSAPublicKey", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with RSAPublicKey {
    def this(params: js.Any) = this()
    
    /**
      * Convert JSON value into current object
      * @param {JsonWebKey} json
      */
    /* CompleteClass */
    override def fromJSON(json: JsonWebKey): Unit = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var modulus: Integer = js.native
    
    /* CompleteClass */
    var publicExponent: Integer = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/RSAPublicKey", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait RSAPublicKey extends StObject {
    
    /**
      * Convert JSON value into current object
      * @param {JsonWebKey} json
      */
    def fromJSON(json: JsonWebKey): Unit
    
    def fromSchema(schema: js.Any): Unit
    
    var modulus: Integer
    
    var publicExponent: Integer
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object RSAPublicKey {
    
    inline def apply(
      fromJSON: JsonWebKey => Unit,
      fromSchema: js.Any => Unit,
      modulus: Integer,
      publicExponent: Integer,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): RSAPublicKey = {
      val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), modulus = modulus.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[RSAPublicKey]
    }
    
    extension [Self <: RSAPublicKey](x: Self) {
      
      inline def setFromJSON(value: JsonWebKey => Unit): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setModulus(value: Integer): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
      
      inline def setPublicExponent(value: Integer): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
