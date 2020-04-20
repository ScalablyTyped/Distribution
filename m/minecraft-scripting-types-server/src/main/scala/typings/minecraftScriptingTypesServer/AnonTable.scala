package typings.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTable extends js.Object {
  /**
    * File path, relative to the behavior pack's path, to the loot table file
    */
  var table: String
}

object AnonTable {
  @scala.inline
  def apply(table: String): AnonTable = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTable]
  }
}

