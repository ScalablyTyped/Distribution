package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PublicKeyInfo structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "PublicKeyInfo")
@js.native
/**
  * Initializes a new instance of the {@link PublicKeyInfo} class
  * @param parameters Initialization parameters
  */
open class PublicKeyInfo ()
  extends PkiObject
     with IPublicKeyInfo {
  def this(parameters: PublicKeyInfoParameters) = this()
  
  /* private */ var _parsedKey: Any = js.native
  
  /**
    * Algorithm identifier
    */
  /* CompleteClass */
  var algorithm: AlgorithmIdentifier = js.native
  
  /**
    * Converts JSON value into current object
    * @param json JSON object
    */
  def fromJSON(json: Any): Unit = js.native
  
  def importKey(publicKey: CryptoKey): js.Promise[Unit] = js.native
  def importKey(publicKey: CryptoKey, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  
  @JSName("parsedKey")
  def parsedKey_MPublicKeyInfo: js.UndefOr[ECPublicKey | RSAPublicKey] = js.native
  
  /**
    * Subject public key value
    */
  /* CompleteClass */
  var subjectPublicKey: BitString = js.native
}
object PublicKeyInfo {
  
  @JSImport("pkijs", "PublicKeyInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "PublicKeyInfo.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "subjectPublicKey" */ String): BitString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[BitString]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_AlgorithmIdentifier(memberName: /* "algorithm" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * SubjectPublicKeyInfo ::= Sequence  {
    *    algorithm            AlgorithmIdentifier,
    *    subjectPublicKey     BIT STRING  }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: PublicKeyInfoSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
