package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsassapssparamsMod {
  
  @JSImport("pkijs/src/RSASSAPSSParams", JSImport.Default)
  @js.native
  class default () extends RSASSAPSSParams {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/RSASSAPSSParams", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/RSASSAPSSParams", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/RSASSAPSSParams", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait RSASSAPSSParams extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    /**
      * Algorithms of hashing (DEFAULT sha1)
      *
      * @type {AlgorithmIdentifier}
      * @memberOf RSASSAPSSParams
      */
    var hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    /**
      * Algorithm of "mask generaion function (MGF)" (DEFAULT mgf1SHA1)
      *
      * @type {AlgorithmIdentifier}
      * @memberOf RSASSAPSSParams
      */
    var maskGenAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    /**
      * Salt length (DEFAULT 20)
      *
      * @type {number}
      * @memberOf RSASSAPSSParams
      */
    var saltLength: Double = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    /**
      * (DEFAULT 1)
      *
      * @type {number}
      * @memberOf RSASSAPSSParams
      */
    var trailerField: Double = js.native
  }
  object RSASSAPSSParams {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
      maskGenAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
      saltLength: Double,
      toJSON: () => js.Any,
      toSchema: () => js.Any,
      trailerField: Double
    ): RSASSAPSSParams = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], maskGenAlgorithm = maskGenAlgorithm.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), trailerField = trailerField.asInstanceOf[js.Any])
      __obj.asInstanceOf[RSASSAPSSParams]
    }
    
    @scala.inline
    implicit class RSASSAPSSParamsMutableBuilder[Self <: RSASSAPSSParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHashAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskGenAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "maskGenAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTrailerField(value: Double): Self = StObject.set(x, "trailerField", value.asInstanceOf[js.Any])
    }
  }
}
