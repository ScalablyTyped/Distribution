package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import typings.pkijs.anon.EncryptedKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the KEKRecipientInfo structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@JSImport("pkijs", "KEKRecipientInfo")
@js.native
/**
  * Initializes a new instance of the {@link KEKRecipientInfo} class
  * @param parameters Initialization parameters
  */
open class KEKRecipientInfo ()
  extends PkiObject
     with IKEKRecipientInfo
     with RecipientInfoValue {
  def this(parameters: KEKRecipientInfoParameters) = this()
  
  /* CompleteClass */
  var encryptedKey: OctetString = js.native
  
  /* CompleteClass */
  var kekid: KEKIdentifier = js.native
  
  /* CompleteClass */
  var keyEncryptionAlgorithm: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var preDefinedKEK: js.typedarray.ArrayBuffer = js.native
  
  /* CompleteClass */
  var version: Double = js.native
}
object KEKRecipientInfo {
  
  @JSImport("pkijs", "KEKRecipientInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "KEKRecipientInfo.CLASS_NAME")
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
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "version" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def defaultValues_AlgorithmIdentifier(memberName: /* "keyEncryptionAlgorithm" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /* static member */
  inline def defaultValues_ArrayBuffer(memberName: /* "preDefinedKEK" */ String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  /* static member */
  inline def defaultValues_KEKIdentifier(memberName: /* "kekid" */ String): KEKIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[KEKIdentifier]
  
  /* static member */
  inline def defaultValues_OctetString(memberName: /* "encryptedKey" */ String): OctetString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OctetString]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * KEKRecipientInfo ::= SEQUENCE {
    *    version CMSVersion,  -- always set to 4
    *    kekid KEKIdentifier,
    *    keyEncryptionAlgorithm KeyEncryptionAlgorithmIdentifier,
    *    encryptedKey EncryptedKey }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[EncryptedKey]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
