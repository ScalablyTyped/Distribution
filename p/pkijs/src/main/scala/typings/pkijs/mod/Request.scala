package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an Request described in [RFC6960](https://datatracker.ietf.org/doc/html/rfc6960)
  */
@JSImport("pkijs", "Request")
@js.native
/**
  * Initializes a new instance of the {@link Request} class
  * @param parameters Initialization parameters
  */
open class Request ()
  extends PkiObject
     with IRequest {
  def this(parameters: RequestParameters) = this()
  
  /* CompleteClass */
  var reqCert: CertID = js.native
}
object Request {
  
  @JSImport("pkijs", "Request")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "Request.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "reqCert" */ String): CertID = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[CertID]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "singleRequestExtensions" */ String): js.Array[Extension] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Extension]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * Request ::= SEQUENCE {
    *    reqCert                     CertID,
    *    singleRequestExtensions     [0] EXPLICIT Extensions OPTIONAL }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: RequestSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
