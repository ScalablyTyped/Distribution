package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import typings.pkijs.anon.Rid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the KeyTransRecipientInfo structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@JSImport("pkijs", "KeyTransRecipientInfo")
@js.native
/**
  * Initializes a new instance of the {@link KeyTransRecipientInfo} class
  * @param parameters Initialization parameters
  */
open class KeyTransRecipientInfo ()
  extends PkiObject
     with IKeyTransRecipientInfo
     with RecipientInfoValue {
  def this(parameters: KeyTransRecipientInfoParameters) = this()
  
  /* CompleteClass */
  var encryptedKey: OctetString = js.native
  
  /* CompleteClass */
  var keyEncryptionAlgorithm: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var recipientCertificate: Certificate = js.native
  
  /* CompleteClass */
  var rid: RecipientIdentifierType = js.native
  
  /* CompleteClass */
  var version: Double = js.native
}
object KeyTransRecipientInfo {
  
  @JSImport("pkijs", "KeyTransRecipientInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "KeyTransRecipientInfo.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "rid" */ String): RecipientIdentifierType = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[RecipientIdentifierType]
  
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
  inline def defaultValues_OctetString(memberName: /* "encryptedKey" */ String): OctetString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OctetString]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * KeyTransRecipientInfo ::= SEQUENCE {
    *    version CMSVersion,  -- always set to 0 or 2
    *    rid RecipientIdentifier,
    *    keyEncryptionAlgorithm KeyEncryptionAlgorithmIdentifier,
    *    encryptedKey EncryptedKey }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[Rid]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
