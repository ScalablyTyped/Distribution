package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.pkijs.anon.Algorithm
import typings.pkijs.anon.IsEqual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the OriginatorPublicKey structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@JSImport("pkijs", "OriginatorPublicKey")
@js.native
/**
  * Initializes a new instance of the {@link OriginatorPublicKey} class
  * @param parameters Initialization parameters
  */
open class OriginatorPublicKey ()
  extends PkiObject
     with IOriginatorPublicKey {
  def this(parameters: OriginatorPublicKeyParameters) = this()
  
  /* CompleteClass */
  var algorithm: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var publicKey: BitString = js.native
}
object OriginatorPublicKey {
  
  @JSImport("pkijs", "OriginatorPublicKey")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "OriginatorPublicKey.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Compare values with default values for all class members
    * @param memberName String name for a class member
    * @param memberValue Value to compare with default value
    */
  /* static member */
  inline def compareWithDefault[T /* <: IsEqual */](memberName: String, memberValue: T): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  
  /* static member */
  inline def defaultValues(memberName: /* "publicKey" */ String): BitString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[BitString]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_AlgorithmIdentifier(memberName: /* "algorithm" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /* static member */
  inline def defaultValues_Any(memberName: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * OriginatorPublicKey ::= SEQUENCE {
    *    algorithm AlgorithmIdentifier,
    *    publicKey BIT STRING }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[Algorithm]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
