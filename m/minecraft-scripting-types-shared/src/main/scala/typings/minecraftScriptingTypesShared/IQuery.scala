package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.query
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
  implicit class IQueryOps[Self <: IQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set__type__(value: query): Self = this.set("__type__", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_id(value: Double): Self = this.set("query_id", value.asInstanceOf[js.Any])
  }
}
