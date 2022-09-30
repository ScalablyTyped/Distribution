package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an CAVersion described in [Certification Authority Renewal](https://docs.microsoft.com/en-us/windows/desktop/seccrypto/certification-authority-renewal)
  */
@JSImport("pkijs", "CAVersion")
@js.native
/**
  * Initializes a new instance of the {@link CAVersion} class
  * @param parameters Initialization parameters
  */
open class CAVersion ()
  extends PkiObject
     with ICAVersion {
  def this(parameters: CAVersionParameters) = this()
  
  /* CompleteClass */
  var certificateIndex: Double = js.native
  
  /* CompleteClass */
  var keyIndex: Double = js.native
}
object CAVersion {
  
  @JSImport("pkijs", "CAVersion")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "CAVersion.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "certificateIndex" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * CAVersion ::= INTEGER
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
}
