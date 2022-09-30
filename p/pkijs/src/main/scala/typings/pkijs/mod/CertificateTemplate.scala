package typings.pkijs.mod

import typings.pkijs.anon.TemplateID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class from "[MS-WCCE]: Windows Client Certificate Enrollment Protocol"
  */
@JSImport("pkijs", "CertificateTemplate")
@js.native
/**
  * Initializes a new instance of the {@link CertificateTemplate} class
  * @param parameters Initialization parameters
  */
open class CertificateTemplate ()
  extends PkiObject
     with ICertificateTemplate {
  def this(parameters: CertificateTemplateParameters) = this()
  
  /* CompleteClass */
  var templateID: String = js.native
}
object CertificateTemplate {
  
  @JSImport("pkijs", "CertificateTemplate")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def defaultValues(memberName: /* "templateID" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_Double(memberName: /* "templateMinorVersion" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * CertificateTemplateOID ::= SEQUENCE {
    *    templateID              OBJECT IDENTIFIER,
    *    templateMajorVersion    INTEGER (0..4294967295) OPTIONAL,
    *    templateMinorVersion    INTEGER (0..4294967295) OPTIONAL
    * }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[TemplateID]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
