package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQuery extends _IMinecraftObject {
  
  /**
    * The type of the object
    */
  val __type__ : query = js.native
  
  /**
    * READ ONLY. This is the unique identifier of the query
    */
  val query_id: Double = js.native
}
object IQuery {
  
  @scala.inline
  def apply(__type__ : query, query_id: Double): IQuery = {
    val __obj = js.Dynamic.literal(__type__ = __type__.asInstanceOf[js.Any], query_id = query_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQuery]
  }
  
  @scala.inline
  implicit class IQueryMutableBuilder[Self <: IQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery_id(value: Double): Self = StObject.set(x, "query_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__type__(value: query): Self = StObject.set(x, "__type__", value.asInstanceOf[js.Any])
  }
}
