package typings.pkijs

import typings.asn1js.mod.Integer
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsaprivatekeyMod {
  
  @JSImport("pkijs/src/RSAPrivateKey", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with RSAPrivateKey {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var coefficient: Integer = js.native
    
    /* CompleteClass */
    var exponent1: Integer = js.native
    
    /* CompleteClass */
    var exponent2: Integer = js.native
    
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
    var prime1: Integer = js.native
    
    /* CompleteClass */
    var prime2: Integer = js.native
    
    /* CompleteClass */
    var privateExponent: Integer = js.native
    
    /* CompleteClass */
    var publicExponent: Integer = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
    
    /* CompleteClass */
    var version: Double = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/RSAPrivateKey", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait RSAPrivateKey extends StObject {
    
    var coefficient: Integer
    
    var exponent1: Integer
    
    var exponent2: Integer
    
    /**
      * Convert JSON value into current object
      * @param {JsonWebKey} json
      */
    def fromJSON(json: JsonWebKey): Unit
    
    def fromSchema(schema: js.Any): Unit
    
    var modulus: Integer
    
    var otherPrimeInfos: js.UndefOr[js.Array[typings.pkijs.otherPrimeInfoMod.default]] = js.undefined
    
    var prime1: Integer
    
    var prime2: Integer
    
    var privateExponent: Integer
    
    var publicExponent: Integer
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
    
    var version: Double
  }
  object RSAPrivateKey {
    
    @scala.inline
    def apply(
      coefficient: Integer,
      exponent1: Integer,
      exponent2: Integer,
      fromJSON: JsonWebKey => Unit,
      fromSchema: js.Any => Unit,
      modulus: Integer,
      prime1: Integer,
      prime2: Integer,
      privateExponent: Integer,
      publicExponent: Integer,
      toJSON: () => js.Any,
      toSchema: () => js.Any,
      version: Double
    ): RSAPrivateKey = {
      val __obj = js.Dynamic.literal(coefficient = coefficient.asInstanceOf[js.Any], exponent1 = exponent1.asInstanceOf[js.Any], exponent2 = exponent2.asInstanceOf[js.Any], fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), modulus = modulus.asInstanceOf[js.Any], prime1 = prime1.asInstanceOf[js.Any], prime2 = prime2.asInstanceOf[js.Any], privateExponent = privateExponent.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RSAPrivateKey]
    }
    
    @scala.inline
    implicit class RSAPrivateKeyMutableBuilder[Self <: RSAPrivateKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoefficient(value: Integer): Self = StObject.set(x, "coefficient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExponent1(value: Integer): Self = StObject.set(x, "exponent1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExponent2(value: Integer): Self = StObject.set(x, "exponent2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromJSON(value: JsonWebKey => Unit): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setModulus(value: Integer): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherPrimeInfos(value: js.Array[typings.pkijs.otherPrimeInfoMod.default]): Self = StObject.set(x, "otherPrimeInfos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherPrimeInfosUndefined: Self = StObject.set(x, "otherPrimeInfos", js.undefined)
      
      @scala.inline
      def setOtherPrimeInfosVarargs(value: typings.pkijs.otherPrimeInfoMod.default*): Self = StObject.set(x, "otherPrimeInfos", js.Array(value :_*))
      
      @scala.inline
      def setPrime1(value: Integer): Self = StObject.set(x, "prime1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrime2(value: Integer): Self = StObject.set(x, "prime2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateExponent(value: Integer): Self = StObject.set(x, "privateExponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicExponent(value: Integer): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
