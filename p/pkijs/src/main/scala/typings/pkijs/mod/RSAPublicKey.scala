package typings.pkijs.mod

import typings.asn1js.mod.AsnType
import typings.asn1js.mod.Integer
import typings.pkijs.anon.Modulus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the RSAPublicKey structure described in [RFC3447](https://datatracker.ietf.org/doc/html/rfc3447)
  */
@JSImport("pkijs", "RSAPublicKey")
@js.native
/**
  * Initializes a new instance of the {@link RSAPublicKey} class
  * @param parameters Initialization parameters
  */
open class RSAPublicKey ()
  extends PkiObject
     with IRSAPublicKey {
  def this(parameters: RSAPublicKeyParameters) = this()
  
  /**
    * Converts JSON value into current object
    * @param json JSON object
    */
  def fromJSON(json: RSAPublicKeyJson): Unit = js.native
  
  def fromSchema(schema: AsnType): Unit = js.native
  
  /**
    * Modulus part of RSA public key
    */
  /* CompleteClass */
  var modulus: Integer = js.native
  
  /**
    * Public exponent of RSA public key
    */
  /* CompleteClass */
  var publicExponent: Integer = js.native
}
object RSAPublicKey {
  
  @JSImport("pkijs", "RSAPublicKey")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "RSAPublicKey.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "modulus" */ /* "publicExponent" */ String): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Integer]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * RSAPublicKey ::= Sequence {
    *    modulus           Integer,  -- n
    *    publicExponent    Integer   -- e
    * }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[Modulus]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
