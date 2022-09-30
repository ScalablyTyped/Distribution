package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the MessageImprint structure described in [RFC3161](https://www.ietf.org/rfc/rfc3161.txt)
  */
@JSImport("pkijs", "MessageImprint")
@js.native
/**
  * Initializes a new instance of the {@link MessageImprint} class
  * @param parameters Initialization parameters
  */
open class MessageImprint ()
  extends PkiObject
     with IMessageImprint {
  def this(parameters: MessageImprintParameters) = this()
  
  /* CompleteClass */
  var hashAlgorithm: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var hashedMessage: OctetString = js.native
}
object MessageImprint {
  
  @JSImport("pkijs", "MessageImprint")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "MessageImprint.CLASS_NAME")
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
    * Creates and fills a new instance of {@link MessageImprint}
    * @param hashAlgorithm
    * @param message
    * @param crypto Crypto engine
    * @returns New instance of {@link MessageImprint}
    */
  /* static member */
  inline def create(hashAlgorithm: String, message: BufferSource): js.Promise[MessageImprint] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(hashAlgorithm.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MessageImprint]]
  inline def create(hashAlgorithm: String, message: BufferSource, crypto: ICryptoEngine): js.Promise[MessageImprint] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(hashAlgorithm.asInstanceOf[js.Any], message.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MessageImprint]]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "hashAlgorithm" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /* static member */
  inline def defaultValues_OctetString(memberName: /* "hashedMessage" */ String): OctetString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OctetString]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * MessageImprint ::= SEQUENCE  {
    *    hashAlgorithm                AlgorithmIdentifier,
    *    hashedMessage                OCTET STRING  }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: MessageImprintSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
