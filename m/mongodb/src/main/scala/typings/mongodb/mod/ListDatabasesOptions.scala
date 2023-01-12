package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatabasesOptions
  extends StObject
     with CommandOperationOptions {
  
  /** A flag that determines which databases are returned based on the user privileges when access control is enabled */
  var authorizedDatabases: js.UndefOr[Boolean] = js.undefined
  
  /** A query predicate that determines which databases are listed */
  var filter: js.UndefOr[Document] = js.undefined
  
  /** A flag to indicate whether the command should return just the database names, or return both database names and size information */
  var nameOnly: js.UndefOr[Boolean] = js.undefined
}
object ListDatabasesOptions {
  
  inline def apply(): ListDatabasesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatabasesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDatabasesOptions] (val x: Self) extends AnyVal {
    
    inline def setAuthorizedDatabases(value: Boolean): Self = StObject.set(x, "authorizedDatabases", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedDatabasesUndefined: Self = StObject.set(x, "authorizedDatabases", js.undefined)
    
    inline def setFilter(value: Document): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setNameOnly(value: Boolean): Self = StObject.set(x, "nameOnly", value.asInstanceOf[js.Any])
    
    inline def setNameOnlyUndefined: Self = StObject.set(x, "nameOnly", js.undefined)
  }
}
