package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import typings.pkijs.anon.PrivateKeyAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PrivateKeyInfo structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5208)
  */
@JSImport("pkijs", "PrivateKeyInfo")
@js.native
/**
  * Initializes a new instance of the {@link PrivateKeyInfo} class
  * @param parameters Initialization parameters
  */
open class PrivateKeyInfo ()
  extends PkiObject
     with IPrivateKeyInfo
     with BagType {
  def this(parameters: PrivateKeyInfoParameters) = this()
  
  /**
    * Converts JSON value into current object
    * @param json JSON object
    */
  def fromJSON(json: Any): Unit = js.native
  
  /* CompleteClass */
  var privateKey: OctetString = js.native
  
  /* CompleteClass */
  var privateKeyAlgorithm: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var version: Double = js.native
}
object PrivateKeyInfo {
  
  @JSImport("pkijs", "PrivateKeyInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "PrivateKeyInfo.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * PrivateKeyInfo ::= SEQUENCE {
    *    version Version,
    *    privateKeyAlgorithm AlgorithmIdentifier {{PrivateKeyAlgorithms}},
    *    privateKey PrivateKey,
    *    attributes [0] Attributes OPTIONAL }
    *
    * Version ::= INTEGER {v1(0)} (v1,...)
    *
    * PrivateKey ::= OCTET STRING
    *
    * Attributes ::= SET OF Attribute
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[PrivateKeyAlgorithm]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
