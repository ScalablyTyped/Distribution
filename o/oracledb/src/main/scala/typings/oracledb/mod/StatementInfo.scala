package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of connection.getStatementInfo().
  */
@js.native
trait StatementInfo[T] extends StObject {
  
  /** Array of strings corresponding to the unique names of the bind variables used in the SQL statement. */
  var bindNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Extended metadata properties. */
  var metaData: js.UndefOr[js.Array[Metadata[T]]] = js.native
  
  /** One of the SQL Statement Type Constants. */
  var statementType: js.UndefOr[Double] = js.native
}
object StatementInfo {
  
  @scala.inline
  def apply[T](): StatementInfo[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatementInfo[T]]
  }
  
  @scala.inline
  implicit class StatementInfoMutableBuilder[Self <: StatementInfo[_], T] (val x: Self with StatementInfo[T]) extends AnyVal {
    
    @scala.inline
    def setBindNames(value: js.Array[String]): Self = StObject.set(x, "bindNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindNamesUndefined: Self = StObject.set(x, "bindNames", js.undefined)
    
    @scala.inline
    def setBindNamesVarargs(value: String*): Self = StObject.set(x, "bindNames", js.Array(value :_*))
    
    @scala.inline
    def setMetaData(value: js.Array[Metadata[T]]): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaDataUndefined: Self = StObject.set(x, "metaData", js.undefined)
    
    @scala.inline
    def setMetaDataVarargs(value: Metadata[T]*): Self = StObject.set(x, "metaData", js.Array(value :_*))
    
    @scala.inline
    def setStatementType(value: Double): Self = StObject.set(x, "statementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementTypeUndefined: Self = StObject.set(x, "statementType", js.undefined)
  }
}
