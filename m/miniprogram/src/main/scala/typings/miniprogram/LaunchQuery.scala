package typings.miniprogram

import typings.miniprogram.anon.AppId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchQuery extends StObject {
  
  var path: String = js.native
  
  /**
    * Current Mini Program query, parsed from the query field in the startup parameter
    */
  var query: js.Any = js.native
  
  var referrerInfo: js.UndefOr[AppId] = js.native
}
object LaunchQuery {
  
  @scala.inline
  def apply(path: String, query: js.Any): LaunchQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchQuery]
  }
  
  @scala.inline
  implicit class LaunchQueryMutableBuilder[Self <: LaunchQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerInfo(value: AppId): Self = StObject.set(x, "referrerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerInfoUndefined: Self = StObject.set(x, "referrerInfo", js.undefined)
  }
}
