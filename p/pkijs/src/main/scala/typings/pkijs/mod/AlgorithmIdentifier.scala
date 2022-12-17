package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the AlgorithmIdentifier structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@JSImport("pkijs", "AlgorithmIdentifier")
@js.native
/**
  * Initializes a new instance of the {@link AlgorithmIdentifier} class
  * @param parameters Initialization parameters
  */
open class AlgorithmIdentifier ()
  extends PkiObject
     with IAlgorithmIdentifier {
  def this(parameters: AlgorithmIdentifierParameters) = this()
  
  /**
    * ObjectIdentifier for algorithm (string representation)
    */
  /* CompleteClass */
  var algorithmId: String = js.native
  
  /**
    * Checks that two "AlgorithmIdentifiers" are equal
    * @param algorithmIdentifier
    */
  def isEqual(algorithmIdentifier: Any): Boolean = js.native
}
object AlgorithmIdentifier {
  
  @JSImport("pkijs", "AlgorithmIdentifier")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "AlgorithmIdentifier.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Compares values with default values for all class members
    * @param memberName String name for a class member
    * @param memberValue Value to compare with default value
    */
  /* static member */
  inline def compareWithDefault(memberName: String, memberValue: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def defaultValues(memberName: /* "algorithmParams" */ String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_String(memberName: /* "algorithmId" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * AlgorithmIdentifier ::= Sequence  {
    *    algorithm               OBJECT IDENTIFIER,
    *    parameters              ANY DEFINED BY algorithm OPTIONAL  }
    *```
    */
  /* static member */
  inline def schema(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[Any]
  inline def schema(parameters: AlgorithmIdentifierSchema): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[Any]
}
