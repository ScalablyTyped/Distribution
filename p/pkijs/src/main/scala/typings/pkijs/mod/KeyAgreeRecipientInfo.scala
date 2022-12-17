package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import typings.pkijs.anon.KeyEncryptionAlgorithm
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the KeyAgreeRecipientInfo structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@JSImport("pkijs", "KeyAgreeRecipientInfo")
@js.native
/**
  * Initializes a new instance of the {@link KeyAgreeRecipientInfo} class
  * @param parameters Initialization parameters
  */
open class KeyAgreeRecipientInfo ()
  extends PkiObject
     with IKeyAgreeRecipientInfo
     with RecipientInfoValue {
  def this(parameters: KeyAgreeRecipientInfoParameters) = this()
  
  /* CompleteClass */
  var keyEncryptionAlgorithm: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var originator: OriginatorIdentifierOrKey = js.native
  
  /* CompleteClass */
  var recipientCertificate: Certificate = js.native
  
  /* CompleteClass */
  var recipientEncryptedKeys: RecipientEncryptedKeys = js.native
  
  /* CompleteClass */
  var recipientPublicKey: CryptoKey | Null = js.native
  
  /* CompleteClass */
  var version: Double = js.native
}
object KeyAgreeRecipientInfo {
  
  @JSImport("pkijs", "KeyAgreeRecipientInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "KeyAgreeRecipientInfo.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "recipientEncryptedKeys" */ String): RecipientEncryptedKeys = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[RecipientEncryptedKeys]
  
  /* static member */
  inline def defaultValues_AlgorithmIdentifier(memberName: /* "keyEncryptionAlgorithm" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /* static member */
  inline def defaultValues_Certificate(memberName: /* "recipientCertificate" */ String): Certificate = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Certificate]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_Double(memberName: /* "version" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def defaultValues_Null(memberName: /* "recipientPublicKey" */ String): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  /* static member */
  inline def defaultValues_OctetString(memberName: /* "ukm" */ String): OctetString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OctetString]
  
  /* static member */
  inline def defaultValues_OriginatorIdentifierOrKey(memberName: /* "originator" */ String): OriginatorIdentifierOrKey = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OriginatorIdentifierOrKey]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * KeyAgreeRecipientInfo ::= SEQUENCE {
    *    version CMSVersion,  -- always set to 3
    *    originator [0] EXPLICIT OriginatorIdentifierOrKey,
    *    ukm [1] EXPLICIT UserKeyingMaterial OPTIONAL,
    *    keyEncryptionAlgorithm KeyEncryptionAlgorithmIdentifier,
    *    recipientEncryptedKeys RecipientEncryptedKeys }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[KeyEncryptionAlgorithm]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
