package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the time deviation around the UTC time contained in GeneralizedTime. Described in [RFC3161](https://www.ietf.org/rfc/rfc3161.txt)
  */
@JSImport("pkijs", "Accuracy")
@js.native
/**
  * Initializes a new instance of the {@link Accuracy} class
  * @param parameters Initialization parameters
  */
open class Accuracy ()
  extends PkiObject
     with IAccuracy {
  def this(parameters: AccuracyParameters) = this()
}
object Accuracy {
  
  @JSImport("pkijs", "Accuracy")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "Accuracy.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def compareWithDefault(memberName: String, memberValue: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  /**
    * Compare values with default values for all class members
    * @param memberName String name for a class member
    * @param memberValue Value to compare with default value
    */
  /* static member */
  inline def compareWithDefault(memberName: /* "seconds" */ /* "millis" */ /* "micros" */ String, memberValue: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def defaultValues(memberName: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_Double(memberName: /* "seconds" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * Accuracy ::= SEQUENCE {
    *    seconds        INTEGER              OPTIONAL,
    *    millis     [0] INTEGER  (1..999)    OPTIONAL,
    *    micros     [1] INTEGER  (1..999)    OPTIONAL  }
    *```
    */
  /* static member */
  inline def schema(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[Any]
  inline def schema(parameters: AccuracySchema): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[Any]
}
