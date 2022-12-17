package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the QCStatement structure described in [RFC3739](https://datatracker.ietf.org/doc/html/rfc3739)
  */
@JSImport("pkijs", "QCStatement")
@js.native
/**
  * Initializes a new instance of the {@link QCStatement} class
  * @param parameters Initialization parameters
  */
open class QCStatement ()
  extends PkiObject
     with IQCStatement {
  def this(parameters: QCStatementParameters) = this()
  
  /* CompleteClass */
  var id: String = js.native
}
object QCStatement {
  
  @JSImport("pkijs", "QCStatement")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "QCStatement.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "type" */ String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_String(memberName: /* "id" */ String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * QCStatement ::= SEQUENCE {
    *       statementId   QC-STATEMENT.&id({SupportedStatements}),
    *       statementInfo QC-STATEMENT.&Type({SupportedStatements}{@statementId}) OPTIONAL
    *   }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: QCStatementSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
