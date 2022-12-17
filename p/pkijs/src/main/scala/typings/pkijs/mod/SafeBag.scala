package typings.pkijs.mod

import typings.pkijs.anon.BagAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the SafeBag structure described in [RFC7292](https://datatracker.ietf.org/doc/html/rfc7292)
  */
@JSImport("pkijs", "SafeBag")
@js.native
/**
  * Initializes a new instance of the {@link SafeBag} class
  * @param parameters Initialization parameters
  */
open class SafeBag[T /* <: BagType */] ()
  extends PkiObject
     with ISafeBag[T] {
  def this(parameters: SafeBagParameters[T]) = this()
  
  /* CompleteClass */
  var bagId: String = js.native
  
  /* CompleteClass */
  var bagValue: T = js.native
}
object SafeBag {
  
  @JSImport("pkijs", "SafeBag")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "SafeBag.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "bagId" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "bagAttributes" */ String): js.Array[Attribute] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Attribute]]
  
  /* static member */
  inline def defaultValues_BagType(memberName: /* "bagValue" */ String): BagType = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[BagType]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * SafeBag ::= SEQUENCE {
    *    bagId         BAG-TYPE.&id ({PKCS12BagSet}),
    *    bagValue      [0] EXPLICIT BAG-TYPE.&Type({PKCS12BagSet}{@bagId}),
    *    bagAttributes SET OF PKCS12Attribute OPTIONAL
    * }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[BagAttributes]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
