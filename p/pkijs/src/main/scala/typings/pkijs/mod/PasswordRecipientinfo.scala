package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import typings.pkijs.anon.KeyDerivationAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PasswordRecipientInfo structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@JSImport("pkijs", "PasswordRecipientinfo")
@js.native
/**
  * Initializes a new instance of the {@link PasswordRecipientinfo} class
  * @param parameters Initialization parameters
  */
open class PasswordRecipientinfo ()
  extends PkiObject
     with IPasswordRecipientInfo
     with RecipientInfoValue {
  def this(parameters: PasswordRecipientinfoParameters) = this()
  
  /* CompleteClass */
  var encryptedKey: OctetString = js.native
  
  /* CompleteClass */
  var keyEncryptionAlgorithm: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var password: js.typedarray.ArrayBuffer = js.native
  
  /* CompleteClass */
  var version: Double = js.native
}
object PasswordRecipientinfo {
  
  @JSImport("pkijs", "PasswordRecipientinfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "PasswordRecipientinfo.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "keyDerivationAlgorithm" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /* static member */
  inline def defaultValues_ArrayBuffer(memberName: /* "password" */ String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
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
    * PasswordRecipientInfo ::= SEQUENCE {
    *    version CMSVersion,   -- Always set to 0
    *    keyDerivationAlgorithm [0] KeyDerivationAlgorithmIdentifier OPTIONAL,
    *    keyEncryptionAlgorithm KeyEncryptionAlgorithmIdentifier,
    *    encryptedKey EncryptedKey }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[KeyDerivationAlgorithm]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
