package typings.pkijs.mod

import typings.pkijs.anon.MaskGenAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class from RFC3447
  */
@JSImport("pkijs", "RSAESOAEPParams")
@js.native
/**
  * Initializes a new instance of the {@link RSAESOAEPParams} class
  * @param parameters Initialization parameters
  */
open class RSAESOAEPParams ()
  extends PkiObject
     with IRSAESOAEPParams {
  def this(parameters: RSAESOAEPParamsParameters) = this()
  
  /* CompleteClass */
  var hashAlgorithm: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var maskGenAlgorithm: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var pSourceAlgorithm: AlgorithmIdentifier = js.native
}
object RSAESOAEPParams {
  
  @JSImport("pkijs", "RSAESOAEPParams")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "RSAESOAEPParams.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "hashAlgorithm" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * RSAES-OAEP-params ::= SEQUENCE {
    *    hashAlgorithm     [0] HashAlgorithm    DEFAULT sha1,
    *    maskGenAlgorithm  [1] MaskGenAlgorithm DEFAULT mgf1SHA1,
    *    pSourceAlgorithm  [2] PSourceAlgorithm DEFAULT pSpecifiedEmpty
    * }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[MaskGenAlgorithm]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
