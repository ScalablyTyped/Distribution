package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import typings.pkijs.anon.EncryptedKeyRid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the RecipientEncryptedKey structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@JSImport("pkijs", "RecipientEncryptedKey")
@js.native
/**
  * Initializes a new instance of the {@link RecipientEncryptedKey} class
  * @param parameters Initialization parameters
  */
open class RecipientEncryptedKey ()
  extends PkiObject
     with IRecipientEncryptedKey {
  def this(parameters: RecipientEncryptedKeyParameters) = this()
  
  /* CompleteClass */
  var encryptedKey: OctetString = js.native
  
  /* CompleteClass */
  var rid: KeyAgreeRecipientIdentifier = js.native
}
object RecipientEncryptedKey {
  
  @JSImport("pkijs", "RecipientEncryptedKey")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "RecipientEncryptedKey.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "encryptedKey" */ String): OctetString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OctetString]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_KeyAgreeRecipientIdentifier(memberName: /* "rid" */ String): KeyAgreeRecipientIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[KeyAgreeRecipientIdentifier]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * RecipientEncryptedKey ::= SEQUENCE {
    *    rid KeyAgreeRecipientIdentifier,
    *    encryptedKey EncryptedKey }
    *
    * EncryptedKey ::= OCTET STRING
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[EncryptedKeyRid]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
