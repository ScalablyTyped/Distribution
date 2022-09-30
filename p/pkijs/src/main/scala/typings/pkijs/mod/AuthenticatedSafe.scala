package typings.pkijs.mod

import typings.pkijs.anon.ContentInfos
import typings.pkijs.anon.SafeContentsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the AuthenticatedSafe structure described in [RFC7292](https://datatracker.ietf.org/doc/html/rfc7292)
  */
@JSImport("pkijs", "AuthenticatedSafe")
@js.native
/**
  * Initializes a new instance of the {@link AuthenticatedSafe} class
  * @param parameters Initialization parameters
  */
open class AuthenticatedSafe ()
  extends PkiObject
     with IAuthenticatedSafe {
  def this(parameters: AuthenticatedSafeParameters) = this()
  
  def makeInternalValues(parameters: SafeContentsArray): js.Promise[this.type] = js.native
  def makeInternalValues(parameters: SafeContentsArray, crypto: ICryptoEngine): js.Promise[this.type] = js.native
  
  def parseInternalValues(parameters: typings.pkijs.anon.SafeContents): js.Promise[Unit] = js.native
  def parseInternalValues(parameters: typings.pkijs.anon.SafeContents, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  
  /* CompleteClass */
  var parsedValue: Any = js.native
  
  /* CompleteClass */
  var safeContents: js.Array[ContentInfo] = js.native
}
object AuthenticatedSafe {
  
  @JSImport("pkijs", "AuthenticatedSafe")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "AuthenticatedSafe.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "parsedValue" */ String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_Array(memberName: /* "safeContents" */ String): js.Array[ContentInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[ContentInfo]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * AuthenticatedSafe ::= SEQUENCE OF ContentInfo
    * -- Data if unencrypted
    * -- EncryptedData if password-encrypted
    * -- EnvelopedData if public key-encrypted
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[ContentInfos]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
