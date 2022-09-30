package typings.pkijs.mod

import typings.asn1js.mod.BaseBlock
import typings.asn1js.mod.ValueBlock
import typings.asn1js.mod.ValueBlockJson
import typings.bytestreamjs.mod.SeqStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkijs", "SignedCertificateTimestamp")
@js.native
/**
  * Initializes a new instance of the {@link SignedCertificateTimestamp} class
  * @param parameters Initialization parameters
  */
open class SignedCertificateTimestamp ()
  extends PkiObject
     with ISignedCertificateTimestamp {
  def this(parameters: SignedCertificateTimestampParameters) = this()
  
  /* CompleteClass */
  var extensions: js.typedarray.ArrayBuffer = js.native
  
  /**
    * Converts SeqStream data into current class
    * @param stream
    */
  def fromStream(stream: SeqStream): Unit = js.native
  
  /* CompleteClass */
  var hashAlgorithm: String = js.native
  
  /* CompleteClass */
  var logID: js.typedarray.ArrayBuffer = js.native
  
  /* CompleteClass */
  var signature: SchemaType = js.native
  
  /* CompleteClass */
  var signatureAlgorithm: String = js.native
  
  @JSName("signature")
  var signature_SignedCertificateTimestamp: BaseBlock[ValueBlock, ValueBlockJson] = js.native
  
  /* CompleteClass */
  var timestamp: js.Date = js.native
  
  /**
    * Converts current object to SeqStream data
    * @returns SeqStream object
    */
  def toStream(): SeqStream = js.native
  
  /**
    * Verify SignedCertificateTimestamp for specific input data
    * @param logs Array of objects with information about each CT Log (like here: https://ct.grahamedgecombe.com/logs.json)
    * @param data Data to verify signature against. Could be encoded Certificate or encoded PreCert
    * @param dataType Type = 0 (data is encoded Certificate), type = 1 (data is encoded PreCert)
    * @param crypto Crypto engine
    */
  def verify(logs: js.Array[Log], data: js.typedarray.ArrayBuffer): js.Promise[Boolean] = js.native
  def verify(logs: js.Array[Log], data: js.typedarray.ArrayBuffer, dataType: Double): js.Promise[Boolean] = js.native
  def verify(logs: js.Array[Log], data: js.typedarray.ArrayBuffer, dataType: Double, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  def verify(logs: js.Array[Log], data: js.typedarray.ArrayBuffer, dataType: Unit, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  
  /* CompleteClass */
  var version: Double = js.native
}
object SignedCertificateTimestamp {
  
  @JSImport("pkijs", "SignedCertificateTimestamp")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "SignedCertificateTimestamp.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "hashAlgorithm" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def defaultValues_ArrayBuffer(memberName: /* "logID" */ String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  /* static member */
  inline def defaultValues_Date(memberName: /* "timestamp" */ String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_Double(memberName: /* "version" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def defaultValues_SchemaType(memberName: /* "signature" */ String): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
