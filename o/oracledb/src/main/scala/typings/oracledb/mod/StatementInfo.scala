package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of connection.getStatementInfo().
  */
trait StatementInfo[T] extends StObject {
  
  /** Array of strings corresponding to the unique names of the bind variables used in the SQL statement. */
  var bindNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Extended metadata properties. */
  var metaData: js.UndefOr[js.Array[Metadata[T]]] = js.undefined
  
  /** One of the SQL Statement Type Constants. */
  var statementType: js.UndefOr[Double] = js.undefined
}
object StatementInfo {
  
  inline def apply[T](): StatementInfo[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatementInfo[T]]
  }
  
  extension [Self <: StatementInfo[?], T](x: Self & StatementInfo[T]) {
    
    inline def setBindNames(value: js.Array[String]): Self = StObject.set(x, "bindNames", value.asInstanceOf[js.Any])
    
    inline def setBindNamesUndefined: Self = StObject.set(x, "bindNames", js.undefined)
    
    inline def setBindNamesVarargs(value: String*): Self = StObject.set(x, "bindNames", js.Array(value*))
    
    inline def setMetaData(value: js.Array[Metadata[T]]): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
    
    inline def setMetaDataUndefined: Self = StObject.set(x, "metaData", js.undefined)
    
    inline def setMetaDataVarargs(value: Metadata[T]*): Self = StObject.set(x, "metaData", js.Array(value*))
    
    inline def setStatementType(value: Double): Self = StObject.set(x, "statementType", value.asInstanceOf[js.Any])
    
    inline def setStatementTypeUndefined: Self = StObject.set(x, "statementType", js.undefined)
  }
}
