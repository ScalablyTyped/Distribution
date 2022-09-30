package typings.pkijs.mod

import typings.pkijs.anon.OtherRevInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the OtherRevocationInfoFormat structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@JSImport("pkijs", "OtherRevocationInfoFormat")
@js.native
/**
  * Initializes a new instance of the {@link OtherRevocationInfoFormat} class
  * @param parameters Initialization parameters
  */
open class OtherRevocationInfoFormat ()
  extends PkiObject
     with IOtherRevocationInfoFormat
     with SignedDataCRL {
  def this(parameters: OtherRevocationInfoFormatParameters) = this()
  
  /* CompleteClass */
  var otherRevInfo: Any = js.native
  
  /* CompleteClass */
  var otherRevInfoFormat: String = js.native
}
object OtherRevocationInfoFormat {
  
  @JSImport("pkijs", "OtherRevocationInfoFormat")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "OtherRevocationInfoFormat.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "otherRevInfo" */ String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_String(memberName: /* "otherRevInfoFormat" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * OtherCertificateFormat ::= SEQUENCE {
    *    otherRevInfoFormat OBJECT IDENTIFIER,
    *    otherRevInfo ANY DEFINED BY otherCertFormat }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[OtherRevInfo]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
