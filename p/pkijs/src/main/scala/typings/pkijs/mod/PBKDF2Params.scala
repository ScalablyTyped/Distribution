package typings.pkijs.mod

import typings.pkijs.anon.IterationCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PBKDF2Params structure described in [RFC2898](https://www.ietf.org/rfc/rfc2898.txt)
  */
@JSImport("pkijs", "PBKDF2Params")
@js.native
/**
  * Initializes a new instance of the {@link PBKDF2Params} class
  * @param parameters Initialization parameters
  */
open class PBKDF2Params ()
  extends PkiObject
     with IPBKDF2Params {
  def this(parameters: PBKDF2ParamsParameters) = this()
  
  /* CompleteClass */
  var iterationCount: Double = js.native
  
  /* CompleteClass */
  var salt: Any = js.native
}
object PBKDF2Params {
  
  @JSImport("pkijs", "PBKDF2Params")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "PBKDF2Params.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "salt" */ String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* static member */
  inline def defaultValues_AlgorithmIdentifier(memberName: /* "prf" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /* static member */
  inline def defaultValues_Double(memberName: /* "iterationCount" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * PBKDF2-params ::= SEQUENCE {
    *    salt CHOICE {
    *        specified OCTET STRING,
    *        otherSource AlgorithmIdentifier },
    *  iterationCount INTEGER (1..MAX),
    *  keyLength INTEGER (1..MAX) OPTIONAL,
    *  prf AlgorithmIdentifier
    *    DEFAULT { algorithm hMAC-SHA1, parameters NULL } }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[IterationCount]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
