package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the TBSRequest structure described in [RFC6960](https://datatracker.ietf.org/doc/html/rfc6960)
  */
@JSImport("pkijs", "TBSRequest")
@js.native
/**
  * Initializes a new instance of the {@link TBSRequest} class
  * @param parameters Initialization parameters
  */
open class TBSRequest ()
  extends PkiObject
     with ITBSRequest {
  def this(parameters: TBSRequestParameters) = this()
  
  /* CompleteClass */
  var requestList: js.Array[Request] = js.native
  
  /* CompleteClass */
  var tbs: js.typedarray.ArrayBuffer = js.native
  
  var tbsView: js.typedarray.Uint8Array = js.native
  
  /**
    * @deprecated Since version 3.0.0
    */
  @JSName("tbs")
  def tbs_MTBSRequest: js.typedarray.ArrayBuffer = js.native
}
object TBSRequest {
  
  @JSImport("pkijs", "TBSRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "TBSRequest.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "requestorName" */ String): GeneralName = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[GeneralName]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "requestList" */ /* "requestExtensions" */ String): js.Array[Request] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Request]]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_ArrayBuffer(memberName: /* "tbs" */ String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  /* static member */
  inline def defaultValues_Double(memberName: /* "version" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * TBSRequest ::= SEQUENCE {
    *    version             [0]     EXPLICIT Version DEFAULT v1,
    *    requestorName       [1]     EXPLICIT GeneralName OPTIONAL,
    *    requestList                 SEQUENCE OF Request,
    *    requestExtensions   [2]     EXPLICIT Extensions OPTIONAL }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: TBSRequestSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
