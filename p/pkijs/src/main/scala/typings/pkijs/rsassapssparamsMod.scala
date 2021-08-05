package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsassapssparamsMod {
  
  @JSImport("pkijs/src/RSASSAPSSParams", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with RSASSAPSSParams {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /**
      * Algorithms of hashing (DEFAULT sha1)
      *
      * @type {AlgorithmIdentifier}
      * @memberOf RSASSAPSSParams
      */
    /* CompleteClass */
    var hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    /**
      * Algorithm of "mask generaion function (MGF)" (DEFAULT mgf1SHA1)
      *
      * @type {AlgorithmIdentifier}
      * @memberOf RSASSAPSSParams
      */
    /* CompleteClass */
    var maskGenAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    /**
      * Salt length (DEFAULT 20)
      *
      * @type {number}
      * @memberOf RSASSAPSSParams
      */
    /* CompleteClass */
    var saltLength: Double = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
    
    /**
      * (DEFAULT 1)
      *
      * @type {number}
      * @memberOf RSASSAPSSParams
      */
    /* CompleteClass */
    var trailerField: Double = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/RSASSAPSSParams", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait RSASSAPSSParams extends StObject {
    
    def fromSchema(schema: js.Any): Unit
    
    /**
      * Algorithms of hashing (DEFAULT sha1)
      *
      * @type {AlgorithmIdentifier}
      * @memberOf RSASSAPSSParams
      */
    var hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default
    
    /**
      * Algorithm of "mask generaion function (MGF)" (DEFAULT mgf1SHA1)
      *
      * @type {AlgorithmIdentifier}
      * @memberOf RSASSAPSSParams
      */
    var maskGenAlgorithm: typings.pkijs.algorithmIdentifierMod.default
    
    /**
      * Salt length (DEFAULT 20)
      *
      * @type {number}
      * @memberOf RSASSAPSSParams
      */
    var saltLength: Double
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
    
    /**
      * (DEFAULT 1)
      *
      * @type {number}
      * @memberOf RSASSAPSSParams
      */
    var trailerField: Double
  }
  object RSASSAPSSParams {
    
    inline def apply(
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
    
    extension [Self <: RSASSAPSSParams](x: Self) {
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setHashAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setMaskGenAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "maskGenAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      inline def setTrailerField(value: Double): Self = StObject.set(x, "trailerField", value.asInstanceOf[js.Any])
    }
  }
}
