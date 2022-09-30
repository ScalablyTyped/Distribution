package typings.pkijs.mod

import typings.pkijs.anon.Values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the QCStatements structure described in [RFC3739](https://datatracker.ietf.org/doc/html/rfc3739)
  */
@JSImport("pkijs", "QCStatements")
@js.native
/**
  * Initializes a new instance of the {@link QCStatement} class
  * @param parameters Initialization parameters
  */
open class QCStatements ()
  extends PkiObject
     with IQCStatements {
  def this(parameters: QCStatementParameters) = this()
  
  /* CompleteClass */
  var values: js.Array[QCStatement] = js.native
}
object QCStatements {
  
  @JSImport("pkijs", "QCStatements")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "QCStatements.CLASS_NAME")
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
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "values" */ String): js.Array[QCStatement] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[QCStatement]]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * QCStatements ::= SEQUENCE OF QCStatement
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[Values]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
