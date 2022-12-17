package typings.pkijs.mod

import typings.pkijs.anon.AuthSafe
import typings.pkijs.anon.CheckIntegrity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PFX structure described in [RFC7292](https://datatracker.ietf.org/doc/html/rfc7292)
  */
@JSImport("pkijs", "PFX")
@js.native
/**
  * Initializes a new instance of the {@link PFX} class
  * @param parameters Initialization parameters
  */
open class PFX ()
  extends PkiObject
     with IPFX {
  def this(parameters: PFXParameters) = this()
  
  /* CompleteClass */
  var authSafe: ContentInfo = js.native
  
  /**
    * Making ContentInfo from PARSED_VALUE object
    * @param parameters Parameters, specific to each "integrity mode"
    * @param crypto Crypto engine
    */
  def makeInternalValues(): js.Promise[Unit] = js.native
  def makeInternalValues(parameters: Unit, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  def makeInternalValues(parameters: MakeInternalValuesParams): js.Promise[Unit] = js.native
  def makeInternalValues(parameters: MakeInternalValuesParams, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  
  def parseInternalValues(parameters: CheckIntegrity): js.Promise[Unit] = js.native
  def parseInternalValues(parameters: CheckIntegrity, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  
  /* CompleteClass */
  var version: Double = js.native
}
object PFX {
  
  @JSImport("pkijs", "PFX")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "PFX.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "authSafe" */ String): ContentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[ContentInfo]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_Double(memberName: /* "version" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def defaultValues_MacData(memberName: /* "macData" */ String): MacData = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[MacData]
  
  /* static member */
  inline def defaultValues_PFXParsedValue(memberName: /* "parsedValue" */ String): PFXParsedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[PFXParsedValue]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * PFX ::= SEQUENCE {
    *    version     INTEGER {v3(3)}(v3,...),
    *    authSafe    ContentInfo,
    *    macData     MacData OPTIONAL
    * }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[AuthSafe]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
