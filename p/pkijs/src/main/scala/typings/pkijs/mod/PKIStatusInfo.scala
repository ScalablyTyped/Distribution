package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Utf8String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PKIStatusInfo structure described in [RFC3161](https://www.ietf.org/rfc/rfc3161.txt)
  */
@JSImport("pkijs", "PKIStatusInfo")
@js.native
/**
  * Initializes a new instance of the {@link PBKDF2Params} class
  * @param parameters Initialization parameters
  */
open class PKIStatusInfo ()
  extends PkiObject
     with IPKIStatusInfo {
  def this(parameters: PKIStatusInfoParameters) = this()
  
  /* CompleteClass */
  var status: PKIStatus = js.native
}
object PKIStatusInfo {
  
  @JSImport("pkijs", "PKIStatusInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "PKIStatusInfo.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "failInfo" */ String): BitString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[BitString]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "statusStrings" */ String): js.Array[Utf8String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Utf8String]]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_Double(memberName: /* "status" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * PKIStatusInfo ::= SEQUENCE {
    *    status        PKIStatus,
    *    statusString  PKIFreeText     OPTIONAL,
    *    failInfo      PKIFailureInfo  OPTIONAL  }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: PKIStatusInfoSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
