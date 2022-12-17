package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import typings.pkijs.anon.Password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PKCS8ShroudedKeyBag structure described in [RFC7292](https://datatracker.ietf.org/doc/html/rfc7292)
  */
@JSImport("pkijs", "PKCS8ShroudedKeyBag")
@js.native
/**
  * Initializes a new instance of the {@link PKCS8ShroudedKeyBag} class
  * @param parameters Initialization parameters
  */
open class PKCS8ShroudedKeyBag ()
  extends PkiObject
     with IPKCS8ShroudedKeyBag
     with BagType {
  def this(parameters: PKCS8ShroudedKeyBagParameters) = this()
  
  /* CompleteClass */
  var encryptedData: OctetString = js.native
  
  /* CompleteClass */
  var encryptionAlgorithm: AlgorithmIdentifier = js.native
  
  def makeInternalValues(parameters: PKCS8ShroudedKeyBagMakeInternalValuesParams): js.Promise[Unit] = js.native
  
  /* protected */ def parseInternalValues(parameters: Password): js.Promise[Unit] = js.native
  /* protected */ def parseInternalValues(parameters: Password, crypto: ICryptoEngine): js.Promise[Unit] = js.native
}
object PKCS8ShroudedKeyBag {
  
  @JSImport("pkijs", "PKCS8ShroudedKeyBag")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "PKCS8ShroudedKeyBag.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Compare values with default values for all class members
    * @param memberName String name for a class member
    * @param memberValue Value to compare with default value
    */
  /* static member */
  inline def compareWithDefault(memberName: String, memberValue: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def defaultValues(memberName: /* "parsedValue" */ String): PrivateKeyInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[PrivateKeyInfo]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_AlgorithmIdentifier(memberName: /* "encryptionAlgorithm" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /* static member */
  inline def defaultValues_OctetString(memberName: /* "encryptedData" */ String): OctetString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OctetString]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * PKCS8ShroudedKeyBag ::= EncryptedPrivateKeyInfo
    *
    * EncryptedPrivateKeyInfo ::= SEQUENCE {
    *    encryptionAlgorithm AlgorithmIdentifier {{KeyEncryptionAlgorithms}},
    *    encryptedData EncryptedData
    * }
    *
    * EncryptedData ::= OCTET STRING
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[typings.pkijs.anon.EncryptedData]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
