package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventQuery extends StObject {
  
  /**
    * Represents unique identification for the query. 'Asset ID' for SharePoint Online and OneDrive for Business, 'keywords'
    * for Exchange Online.
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the type of query associated with an event. 'files' for SPO and ODB and 'messages' for EXO.The possible
    * values are: files, messages, unknownFutureValue.
    */
  var queryType: js.UndefOr[NullableOption[QueryType]] = js.undefined
}
object EventQuery {
  
  inline def apply(): EventQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventQuery] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryType(value: NullableOption[QueryType]): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    inline def setQueryTypeNull: Self = StObject.set(x, "queryType", null)
    
    inline def setQueryTypeUndefined: Self = StObject.set(x, "queryType", js.undefined)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
