package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the MacData structure described in [RFC7292](https://datatracker.ietf.org/doc/html/rfc7292)
  */
@JSImport("pkijs", "MacData")
@js.native
/**
  * Initializes a new instance of the {@link MacData} class
  * @param parameters Initialization parameters
  */
open class MacData ()
  extends PkiObject
     with IMacData {
  def this(parameters: MacDataParameters) = this()
  
  /* CompleteClass */
  var mac: DigestInfo = js.native
  
  /* CompleteClass */
  var macSalt: OctetString = js.native
}
object MacData {
  
  @JSImport("pkijs", "MacData")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "MacData.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "iterations" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_DigestInfo(memberName: /* "mac" */ String): DigestInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[DigestInfo]
  
  /* static member */
  inline def defaultValues_OctetString(memberName: /* "macSalt" */ String): OctetString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OctetString]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * MacData ::= SEQUENCE {
    *    mac           DigestInfo,
    *    macSalt       OCTET STRING,
    *    iterations    INTEGER DEFAULT 1
    *    -- Note: The default is for historical reasons and its use is
    *    -- deprecated. A higher value, like 1024 is recommended.
    *    }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: MacDataSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
