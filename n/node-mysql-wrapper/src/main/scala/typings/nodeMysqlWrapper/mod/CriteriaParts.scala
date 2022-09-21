package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "CriteriaParts")
@js.native
open class CriteriaParts protected ()
  extends StObject
     with ICriteriaParts {
  def this(
    rawCriteriaObject: Any,
    tables: js.Array[TableToSearchPart],
    noDatabaseProperties: js.Array[String],
    whereClause: String
  ) = this()
  
  /* CompleteClass */
  var noDatabaseProperties: js.Array[String] = js.native
  
  /* CompleteClass */
  var rawCriteriaObject: Any = js.native
  
  /* CompleteClass */
  override def selectFromClause[T](_table: Table[T]): String = js.native
  
  /* CompleteClass */
  var tables: js.Array[TableToSearchPart] = js.native
  
  /* CompleteClass */
  var whereClause: String = js.native
}
