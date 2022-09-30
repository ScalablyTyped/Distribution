package typings.pkijs.mod

import typings.asn1js.mod.Integer
import typings.asn1js.mod.OctetString
import typings.pkijs.anon.AuthorityCertIssuer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the AuthorityKeyIdentifier structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "AuthorityKeyIdentifier")
@js.native
/**
  * Initializes a new instance of the {@link AuthorityKeyIdentifier} class
  * @param parameters Initialization parameters
  */
open class AuthorityKeyIdentifier ()
  extends PkiObject
     with IAuthorityKeyIdentifier {
  def this(parameters: AuthorityKeyIdentifierParameters) = this()
}
object AuthorityKeyIdentifier {
  
  @JSImport("pkijs", "AuthorityKeyIdentifier")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "AuthorityKeyIdentifier.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "authorityCertIssuer" */ String): js.Array[GeneralName] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[GeneralName]]
  
  /* static member */
  inline def defaultValues_Integer(memberName: /* "authorityCertSerialNumber" */ String): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Integer]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_OctetString(memberName: /* "keyIdentifier" */ String): OctetString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OctetString]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * AuthorityKeyIdentifier OID ::= 2.5.29.35
    *
    * AuthorityKeyIdentifier ::= SEQUENCE {
    *    keyIdentifier             [0] KeyIdentifier           OPTIONAL,
    *    authorityCertIssuer       [1] GeneralNames            OPTIONAL,
    *    authorityCertSerialNumber [2] CertificateSerialNumber OPTIONAL  }
    *
    * KeyIdentifier ::= OCTET STRING
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[AuthorityCertIssuer]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
