package typings.natsHemera.mod

import typings.natsHemera.natsHemeraStrings.depth
import typings.natsHemera.natsHemeraStrings.insertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BloomrunConfig extends js.Object {
  var indexing: insertion | depth
  var lookupBeforeAdd: Boolean
}

object BloomrunConfig {
  @scala.inline
  def apply(indexing: insertion | depth, lookupBeforeAdd: Boolean): BloomrunConfig = {
    val __obj = js.Dynamic.literal(indexing = indexing.asInstanceOf[js.Any], lookupBeforeAdd = lookupBeforeAdd.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BloomrunConfig]
  }
}

