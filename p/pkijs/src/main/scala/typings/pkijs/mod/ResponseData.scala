package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an ResponseData described in [RFC6960](https://datatracker.ietf.org/doc/html/rfc6960)
  */
@JSImport("pkijs", "ResponseData")
@js.native
/**
  * Initializes a new instance of the {@link ResponseData} class
  * @param parameters Initialization parameters
  */
open class ResponseData ()
  extends PkiObject
     with IResponseData {
  def this(parameters: ResponseDataParameters) = this()
  
  /* CompleteClass */
  var producedAt: js.Date = js.native
  
  /* CompleteClass */
  var responderID: Any = js.native
  
  /* CompleteClass */
  var responses: js.Array[SingleResponse] = js.native
  
  /* CompleteClass */
  var tbs: js.typedarray.ArrayBuffer = js.native
  
  var tbsView: js.typedarray.Uint8Array = js.native
  
  /**
    * @deprecated Since version 3.0.0
    */
  @JSName("tbs")
  def tbs_MResponseData: js.typedarray.ArrayBuffer = js.native
}
object ResponseData {
  
  @JSImport("pkijs", "ResponseData")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "ResponseData.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "version" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def defaultValues_Any(memberName: /* "responderID" */ String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "responses" */ /* "responseExtensions" */ String): js.Array[SingleResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[SingleResponse]]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_ArrayBuffer(memberName: /* "tbs" */ String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  /* static member */
  inline def defaultValues_Date(memberName: /* "producedAt" */ String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * ResponseData ::= SEQUENCE {
    *    version              [0] EXPLICIT Version DEFAULT v1,
    *    responderID              ResponderID,
    *    producedAt               GeneralizedTime,
    *    responses                SEQUENCE OF SingleResponse,
    *    responseExtensions   [1] EXPLICIT Extensions OPTIONAL }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: ResponseDataSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
