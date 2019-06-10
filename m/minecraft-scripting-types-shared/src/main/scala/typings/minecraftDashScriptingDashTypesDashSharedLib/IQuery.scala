package typings
package minecraftDashScriptingDashTypesDashSharedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuery extends _IMinecraftObject {
  /**
    * The type of the object
    */
  val __type__ : minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.query
  /**
    * READ ONLY. This is the unique identifier of the query
    */
  val query_id: scala.Double
}

object IQuery {
  @scala.inline
  def apply(
    __type__ : minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.query,
    query_id: scala.Double
  ): IQuery = {
    val __obj = js.Dynamic.literal(__type__ = __type__, query_id = query_id)
  
    __obj.asInstanceOf[IQuery]
  }
}

