package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the SignedCertificateTimestampList structure described in [RFC6962](https://datatracker.ietf.org/doc/html/rfc6962)
  */
@JSImport("pkijs", "SignedCertificateTimestampList")
@js.native
/**
  * Initializes a new instance of the {@link SignedCertificateTimestampList} class
  * @param parameters Initialization parameters
  */
open class SignedCertificateTimestampList ()
  extends PkiObject
     with ISignedCertificateTimestampList {
  def this(parameters: SignedCertificateTimestampListParameters) = this()
  
  /* CompleteClass */
  var timestamps: js.Array[SignedCertificateTimestamp] = js.native
}
object SignedCertificateTimestampList {
  
  @JSImport("pkijs", "SignedCertificateTimestampList")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "SignedCertificateTimestampList.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "timestamps" */ String): js.Array[SignedCertificateTimestamp] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[SignedCertificateTimestamp]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * SignedCertificateTimestampList ::= OCTET STRING
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[js.Object]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
