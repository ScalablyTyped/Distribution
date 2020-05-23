package typings.minecraftScriptingTypesServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  /**
    * File path, relative to the behavior pack's path, to the loot table file
    */
  var table: String
}

object Table {
  @scala.inline
  def apply(table: String): Table = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
}

