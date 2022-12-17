package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import typings.pkijs.anon.EntityUInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the ECCCMSSharedInfo structure described in [RFC6318](https://datatracker.ietf.org/doc/html/rfc6318)
  */
@JSImport("pkijs", "ECCCMSSharedInfo")
@js.native
/**
  * Initializes a new instance of the {@link ECCCMSSharedInfo} class
  * @param parameters Initialization parameters
  */
open class ECCCMSSharedInfo ()
  extends PkiObject
     with IECCCMSSharedInfo {
  def this(parameters: ECCCMSSharedInfoParameters) = this()
  
  /* CompleteClass */
  var keyInfo: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var suppPubInfo: OctetString = js.native
}
object ECCCMSSharedInfo {
  
  @JSImport("pkijs", "ECCCMSSharedInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "ECCCMSSharedInfo.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "keyInfo" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /* static member */
  inline def defaultValues_OctetString(memberName: /* "entityUInfo" */ String): OctetString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OctetString]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * ECC-CMS-SharedInfo ::= SEQUENCE {
    *    keyInfo      AlgorithmIdentifier,
    *    entityUInfo  [0] EXPLICIT OCTET STRING OPTIONAL,
    *    suppPubInfo  [2] EXPLICIT OCTET STRING }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[EntityUInfo]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
