package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuery extends _IMinecraftObject {
  /**
    * The type of the object
    */
  val __type__ : query
  /**
    * READ ONLY. This is the unique identifier of the query
    */
  val query_id: Double
}

object IQuery {
  @scala.inline
  def apply(__type__ : query, query_id: Double): IQuery = {
    val __obj = js.Dynamic.literal(__type__ = __type__.asInstanceOf[js.Any], query_id = query_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IQuery]
  }
}

