package typings.pkijs.mod

import typings.pkijs.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the CRLBag structure described in [RFC7292](https://datatracker.ietf.org/doc/html/rfc7292)
  */
@JSImport("pkijs", "CRLBag")
@js.native
/**
  * Initializes a new instance of the {@link CRLBag} class
  * @param parameters Initialization parameters
  */
open class CRLBag ()
  extends PkiObject
     with ICRLBag
     with BagType {
  def this(parameters: CRLBagParameters) = this()
  
  /* CompleteClass */
  var crlId: String = js.native
  
  /* CompleteClass */
  var crlValue: Any = js.native
}
object CRLBag {
  
  @JSImport("pkijs", "CRLBag")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "CRLBag.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "crlValue" */ String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_String(memberName: /* "crlId" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * CRLBag ::= SEQUENCE {
    *    crlId      BAG-TYPE.&id ({CRLTypes}),
    *    crlValue   [0] EXPLICIT BAG-TYPE.&Type ({CRLTypes}{@crlId})
    *}
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[Id]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
