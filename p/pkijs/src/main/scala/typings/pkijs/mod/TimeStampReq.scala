package typings.pkijs.mod

import typings.asn1js.mod.Integer
import typings.pkijs.anon.CertReq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the TimeStampReq structure described in [RFC3161](https://www.ietf.org/rfc/rfc3161.txt)
  *
  * @example The following example demonstrates how to create Time-Stamp Request
  * ```js
  * const nonce = pkijs.getRandomValues(new Uint8Array(10)).buffer;
  *
  * const tspReq = new pkijs.TimeStampReq({
  *   version: 1,
  *   messageImprint: await pkijs.MessageImprint.create("SHA-256", message),
  *   reqPolicy: "1.2.3.4.5.6",
  *   certReq: true,
  *   nonce: new asn1js.Integer({ valueHex: nonce }),
  * });
  *
  * const tspReqRaw = tspReq.toSchema().toBER();
  */
@JSImport("pkijs", "TimeStampReq")
@js.native
/**
  * Initializes a new instance of the {@link TimeStampReq} class
  * @param parameters Initialization parameters
  */
open class TimeStampReq ()
  extends PkiObject
     with ITimeStampReq {
  def this(parameters: TimeStampReqParameters) = this()
  
  /**
    * Contains the hash of the datum to be time-stamped
    */
  /* CompleteClass */
  var messageImprint: MessageImprint = js.native
  
  /**
    * Version of the Time-Stamp request. Should be version 1.
    */
  /* CompleteClass */
  var version: Double = js.native
}
object TimeStampReq {
  
  @JSImport("pkijs", "TimeStampReq")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "TimeStampReq.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "nonce" */ String): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Integer]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "extensions" */ String): js.Array[Extension] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Extension]]
  
  /* static member */
  inline def defaultValues_Boolean(memberName: /* "certReq" */ String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_Double(memberName: /* "version" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def defaultValues_MessageImprint(memberName: /* "messageImprint" */ String): MessageImprint = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[MessageImprint]
  
  /* static member */
  inline def defaultValues_String(memberName: /* "reqPolicy" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * TimeStampReq ::= SEQUENCE  {
    *    version               INTEGER  { v1(1) },
    *    messageImprint        MessageImprint,
    *    reqPolicy             TSAPolicyId              OPTIONAL,
    *    nonce                 INTEGER                  OPTIONAL,
    *    certReq               BOOLEAN                  DEFAULT FALSE,
    *    extensions            [0] IMPLICIT Extensions  OPTIONAL  }
    *
    * TSAPolicyId ::= OBJECT IDENTIFIER
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[CertReq]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
