package typings.pkijs.mod

import typings.pkijs.anon.EncryptionScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PBES2Params structure described in [RFC2898](https://www.ietf.org/rfc/rfc2898.txt)
  */
@JSImport("pkijs", "PBES2Params")
@js.native
/**
  * Initializes a new instance of the {@link PBES2Params} class
  * @param parameters Initialization parameters
  */
open class PBES2Params ()
  extends PkiObject
     with IPBES2Params {
  def this(parameters: PBES2ParamsParameters) = this()
  
  /* CompleteClass */
  var encryptionScheme: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var keyDerivationFunc: AlgorithmIdentifier = js.native
}
object PBES2Params {
  
  @JSImport("pkijs", "PBES2Params")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "PBES2Params.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "keyDerivationFunc" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * PBES2-params ::= SEQUENCE {
    *    keyDerivationFunc AlgorithmIdentifier {{PBES2-KDFs}},
    *    encryptionScheme AlgorithmIdentifier {{PBES2-Encs}} }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[EncryptionScheme]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
