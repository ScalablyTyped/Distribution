package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BloomrunConfig extends js.Object {
  var indexing: natsDashHemeraLib.natsDashHemeraLibStrings.insertion | natsDashHemeraLib.natsDashHemeraLibStrings.depth
  var lookupBeforeAdd: scala.Boolean
}

object BloomrunConfig {
  @scala.inline
  def apply(
    indexing: natsDashHemeraLib.natsDashHemeraLibStrings.insertion | natsDashHemeraLib.natsDashHemeraLibStrings.depth,
    lookupBeforeAdd: scala.Boolean
  ): BloomrunConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("indexing")(indexing.asInstanceOf[js.Any])
    __obj.updateDynamic("lookupBeforeAdd")(lookupBeforeAdd)
    __obj.asInstanceOf[BloomrunConfig]
  }
}

