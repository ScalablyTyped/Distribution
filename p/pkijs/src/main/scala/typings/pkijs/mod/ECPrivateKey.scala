package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import typings.pkijs.anon.NamedCurve
import typings.pkijs.pkijsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PrivateKeyInfo structure described in [RFC5915](https://datatracker.ietf.org/doc/html/rfc5915)
  */
@JSImport("pkijs", "ECPrivateKey")
@js.native
/**
  * Initializes a new instance of the {@link ECPrivateKey} class
  * @param parameters Initialization parameters
  */
open class ECPrivateKey ()
  extends PkiObject
     with IECPrivateKey {
  def this(parameters: ECPrivateKeyParameters) = this()
  
  /**
    * Converts JSON value into current object
    * @param json JSON object
    */
  def fromJSON(json: Any): Unit = js.native
  
  /* CompleteClass */
  var privateKey: OctetString = js.native
  
  /* CompleteClass */
  var version: Double = js.native
}
object ECPrivateKey {
  
  @JSImport("pkijs", "ECPrivateKey")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "ECPrivateKey.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "publicKey" */ String): ECPublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[ECPublicKey]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_1(memberName: /* "version" */ String): `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[`1`]
  
  /* static member */
  inline def defaultValues_OctetString(memberName: /* "privateKey" */ String): OctetString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OctetString]
  
  /* static member */
  inline def defaultValues_String(memberName: /* "namedCurve" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * ECPrivateKey ::= SEQUENCE {
    * version        INTEGER { ecPrivkeyVer1(1) } (ecPrivkeyVer1),
    * privateKey     OCTET STRING,
    * parameters [0] ECParameters {{ NamedCurve }} OPTIONAL,
    * publicKey  [1] BIT STRING OPTIONAL
    * }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[NamedCurve]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
