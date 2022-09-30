package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the RecipientEncryptedKeys structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@JSImport("pkijs", "RecipientEncryptedKeys")
@js.native
/**
  * Initializes a new instance of the {@link RecipientEncryptedKeys} class
  * @param parameters Initialization parameters
  */
open class RecipientEncryptedKeys ()
  extends PkiObject
     with IRecipientEncryptedKeys {
  def this(parameters: RecipientEncryptedKeysParameters) = this()
  
  /* CompleteClass */
  var encryptedKeys: js.Array[RecipientEncryptedKey] = js.native
}
object RecipientEncryptedKeys {
  
  @JSImport("pkijs", "RecipientEncryptedKeys")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "RecipientEncryptedKeys.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "encryptedKeys" */ String): js.Array[RecipientEncryptedKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[RecipientEncryptedKey]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * RecipientEncryptedKeys ::= SEQUENCE OF RecipientEncryptedKey
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: RecipientEncryptedKeysSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
