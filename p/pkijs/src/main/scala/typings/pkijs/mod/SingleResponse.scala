package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an SingleResponse described in [RFC6960](https://datatracker.ietf.org/doc/html/rfc6960)
  */
@JSImport("pkijs", "SingleResponse")
@js.native
/**
  * Initializes a new instance of the {@link SingleResponse} class
  * @param parameters Initialization parameters
  */
open class SingleResponse ()
  extends PkiObject
     with ISingleResponse {
  def this(parameters: SingleResponseParameters) = this()
  
  /* CompleteClass */
  var certID: CertID = js.native
  
  /* CompleteClass */
  var certStatus: Any = js.native
  
  /* CompleteClass */
  var thisUpdate: js.Date = js.native
}
object SingleResponse {
  
  @JSImport("pkijs", "SingleResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "SingleResponse.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "certID" */ String): CertID = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[CertID]
  
  /* static member */
  inline def defaultValues_Any(memberName: /* "certStatus" */ String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "singleExtensions" */ String): js.Array[Extension] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Extension]]
  
  /* static member */
  inline def defaultValues_Date(memberName: /* "thisUpdate" */ String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * SingleResponse ::= SEQUENCE {
    *    certID                       CertID,
    *    certStatus                   CertStatus,
    *    thisUpdate                   GeneralizedTime,
    *    nextUpdate         [0]       EXPLICIT GeneralizedTime OPTIONAL,
    *    singleExtensions   [1]       EXPLICIT Extensions OPTIONAL }
    *
    * CertStatus ::= CHOICE {
    *    good        [0]     IMPLICIT NULL,
    *    revoked     [1]     IMPLICIT RevokedInfo,
    *    unknown     [2]     IMPLICIT UnknownInfo }
    *
    * RevokedInfo ::= SEQUENCE {
    *    revocationTime              GeneralizedTime,
    *    revocationReason    [0]     EXPLICIT CRLReason OPTIONAL }
    *
    * UnknownInfo ::= NULL
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SingleResponseSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
