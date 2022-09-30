package typings.pkijs.mod

import typings.asn1js.mod.Sequence
import typings.pkijs.anon.AccessLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the AccessDescription structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  *
  * The authority information access extension indicates how to access
  * information and services for the issuer of the certificate in which
  * the extension appears. Information and services may include on-line
  * validation services and CA policy data. This extension may be included in
  * end entity or CA certificates. Conforming CAs MUST mark this
  * extension as non-critical.
  */
@JSImport("pkijs", "AccessDescription")
@js.native
/**
  * Initializes a new instance of the {@link AccessDescription} class
  * @param parameters Initialization parameters
  */
open class AccessDescription ()
  extends PkiObject
     with IAccessDescription {
  def this(parameters: AccessDescriptionParameters) = this()
  
  /**
    * The accessLocation field specifies the location of the information
    */
  /* CompleteClass */
  var accessLocation: GeneralName = js.native
  
  /**
    * The type and format of the information are specified by the accessMethod field. This profile defines two accessMethod OIDs: id-ad-caIssuers and id-ad-ocsp
    */
  /* CompleteClass */
  var accessMethod: String = js.native
}
object AccessDescription {
  
  @JSImport("pkijs", "AccessDescription")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "AccessDescription.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "accessMethod" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def defaultValues_GeneralName(memberName: /* "accessLocation" */ String): GeneralName = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[GeneralName]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * AccessDescription ::= SEQUENCE {
    *    accessMethod          OBJECT IDENTIFIER,
    *    accessLocation        GeneralName  }
    *```
    */
  /* static member */
  inline def schema(): Sequence = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[Sequence]
  inline def schema(parameters: SchemaParameters[AccessLocation]): Sequence = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[Sequence]
}
