package typings.pkijs.mod

import typings.asn1js.mod.Integer
import typings.pkijs.anon.Exponent1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PrivateKeyInfo structure described in [RFC3447](https://datatracker.ietf.org/doc/html/rfc3447)
  */
@JSImport("pkijs", "RSAPrivateKey")
@js.native
/**
  * Initializes a new instance of the {@link RSAPrivateKey} class
  * @param parameters Initialization parameters
  */
open class RSAPrivateKey ()
  extends PkiObject
     with IRSAPrivateKey {
  def this(parameters: RSAPrivateKeyParameters) = this()
  
  /* CompleteClass */
  var coefficient: Integer = js.native
  
  /* CompleteClass */
  var exponent1: Integer = js.native
  
  /* CompleteClass */
  var exponent2: Integer = js.native
  
  /**
    * Converts JSON value into current object
    * @param json JSON object
    */
  def fromJSON(json: Any): Unit = js.native
  
  /* CompleteClass */
  var modulus: Integer = js.native
  
  /* CompleteClass */
  var prime1: Integer = js.native
  
  /* CompleteClass */
  var prime2: Integer = js.native
  
  /* CompleteClass */
  var privateExponent: Integer = js.native
  
  /* CompleteClass */
  var publicExponent: Integer = js.native
  
  /* CompleteClass */
  var version: Double = js.native
}
object RSAPrivateKey {
  
  @JSImport("pkijs", "RSAPrivateKey")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "RSAPrivateKey.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "version" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "otherPrimeInfos" */ String): js.Array[OtherPrimeInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[OtherPrimeInfo]]
  
  /* static member */
  inline def defaultValues_Integer(memberName: /* "modulus" */ String): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Integer]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * RSAPrivateKey ::= Sequence {
    *    version           Version,
    *    modulus           Integer,  -- n
    *    publicExponent    Integer,  -- e
    *    privateExponent   Integer,  -- d
    *    prime1            Integer,  -- p
    *    prime2            Integer,  -- q
    *    exponent1         Integer,  -- d mod (p-1)
    *    exponent2         Integer,  -- d mod (q-1)
    *    coefficient       Integer,  -- (inverse of q) mod p
    *    otherPrimeInfos   OtherPrimeInfos OPTIONAL
    * }
    *
    * OtherPrimeInfos ::= Sequence SIZE(1..MAX) OF OtherPrimeInfo
    * ```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[Exponent1]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
