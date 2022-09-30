package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the TSTInfo structure described in [RFC3161](https://www.ietf.org/rfc/rfc3161.txt)
  */
@JSImport("pkijs", "TSTInfo")
@js.native
/**
  * Initializes a new instance of the {@link TSTInfo} class
  * @param parameters Initialization parameters
  */
open class TSTInfo ()
  extends PkiObject
     with ITSTInfo {
  def this(parameters: TSTInfoParameters) = this()
  
  /**
    * Time at which the time-stamp token has been created by the TSA
    */
  /* CompleteClass */
  var genTime: js.Date = js.native
  
  /**
    * The messageImprint MUST have the same value as the similar field in
    * TimeStampReq, provided that the size of the hash value matches the
    * expected size of the hash algorithm identified in hashAlgorithm.
    */
  /* CompleteClass */
  var messageImprint: MessageImprint = js.native
  
  /**
    * TSA's policy under which the response was produced.
    *
    * If a similar field was present in the TimeStampReq, then it MUST have the same value,
    * otherwise an error (unacceptedPolicy) MUST be returned
    */
  /* CompleteClass */
  var policy: String = js.native
  
  /**
    * Integer assigned by the TSA to each TimeStampToken.
    *
    * It MUST be unique for each TimeStampToken issued by a given TSA.
    */
  /* CompleteClass */
  var serialNumber: Integer = js.native
  
  /**
    * Verify current TST Info value
    * @param params Input parameters
    * @param crypto Crypto engine
    */
  def verify(params: TSTInfoVerifyParams): js.Promise[Boolean] = js.native
  def verify(params: TSTInfoVerifyParams, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  
  /**
    * Version of the time-stamp token.
    *
    * Conforming time-stamping servers MUST be able to provide version 1 time-stamp tokens.
    */
  /* CompleteClass */
  var version: Double = js.native
}
object TSTInfo {
  
  @JSImport("pkijs", "TSTInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "TSTInfo.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "serialNumber" */ String): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Integer]
  
  /* static member */
  inline def defaultValues_Accuracy(memberName: /* "accuracy" */ String): Accuracy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Accuracy]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "extensions" */ String): js.Array[Extension] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Extension]]
  
  /* static member */
  inline def defaultValues_Boolean(memberName: /* "ordering" */ String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def defaultValues_Date(memberName: /* "genTime" */ String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_Double(memberName: /* "version" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def defaultValues_GeneralName(memberName: /* "tsa" */ String): GeneralName = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[GeneralName]
  
  /* static member */
  inline def defaultValues_MessageImprint(memberName: /* "messageImprint" */ String): MessageImprint = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[MessageImprint]
  
  /* static member */
  inline def defaultValues_String(memberName: /* "policy" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * TSTInfo ::= SEQUENCE  {
    *   version                      INTEGER  { v1(1) },
    *   policy                       TSAPolicyId,
    *   messageImprint               MessageImprint,
    *   serialNumber                 INTEGER,
    *   genTime                      GeneralizedTime,
    *   accuracy                     Accuracy                 OPTIONAL,
    *   ordering                     BOOLEAN             DEFAULT FALSE,
    *   nonce                        INTEGER                  OPTIONAL,
    *   tsa                          [0] GeneralName          OPTIONAL,
    *   extensions                   [1] IMPLICIT Extensions  OPTIONAL  }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[typings.pkijs.anon.Accuracy]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
