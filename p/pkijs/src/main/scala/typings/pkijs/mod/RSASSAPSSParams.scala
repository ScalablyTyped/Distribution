package typings.pkijs.mod

import typings.pkijs.anon.SaltLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the RSASSAPSSParams structure described in [RFC4055](https://datatracker.ietf.org/doc/html/rfc4055)
  */
@JSImport("pkijs", "RSASSAPSSParams")
@js.native
/**
  * Initializes a new instance of the {@link RSASSAPSSParams} class
  * @param parameters Initialization parameters
  */
open class RSASSAPSSParams ()
  extends PkiObject
     with IRSASSAPSSParams {
  def this(parameters: RSASSAPSSParamsParameters) = this()
  
  /**
    * Algorithms of hashing (DEFAULT sha1)
    */
  /* CompleteClass */
  var hashAlgorithm: AlgorithmIdentifier = js.native
  
  /**
    * Salt length (DEFAULT 20)
    */
  /* CompleteClass */
  var maskGenAlgorithm: AlgorithmIdentifier = js.native
  
  /**
    * Salt length (DEFAULT 20)
    */
  /* CompleteClass */
  var saltLength: Double = js.native
  
  /**
    * (DEFAULT 1)
    */
  /* CompleteClass */
  var trailerField: Double = js.native
}
object RSASSAPSSParams {
  
  @JSImport("pkijs", "RSASSAPSSParams")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "RSASSAPSSParams.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "saltLength" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_AlgorithmIdentifier(memberName: /* "hashAlgorithm" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * RSASSA-PSS-params ::= Sequence  {
    *    hashAlgorithm      [0] HashAlgorithm DEFAULT sha1Identifier,
    *    maskGenAlgorithm   [1] MaskGenAlgorithm DEFAULT mgf1SHA1Identifier,
    *    saltLength         [2] Integer DEFAULT 20,
    *    trailerField       [3] Integer DEFAULT 1  }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[SaltLength]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
