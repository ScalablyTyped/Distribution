package typings.microsoftLiveConnect.Microsoft.Live

import typings.microsoftLiveConnect.anon.Next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Search object contains info about the objects found in a user's
  * SkyDrive that match the search query. See Search query parameters for
  * info about formatting a search query request.
  */
trait ISearch extends StObject {
  
  /**
    * An array of file and folder objects found in a user's SkyDrive that
    * match the search query.
    */
  var data: js.Array[IObject]
  
  /**
    * The path strings that reference the next and previous sets in a
    * paginated response.
    */
  var paging: js.UndefOr[Next] = js.undefined
}
object ISearch {
  
  inline def apply(data: js.Array[IObject]): ISearch = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISearch] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[IObject]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: IObject*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setPaging(value: Next): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
  }
}
