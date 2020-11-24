package typings.natsHemera.mod

import typings.natsHemera.natsHemeraStrings.depth
import typings.natsHemera.natsHemeraStrings.insertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BloomrunConfig extends js.Object {
  
  var indexing: insertion | depth = js.native
  
  var lookupBeforeAdd: Boolean = js.native
}
object BloomrunConfig {
  
  @scala.inline
  def apply(indexing: insertion | depth, lookupBeforeAdd: Boolean): BloomrunConfig = {
    val __obj = js.Dynamic.literal(indexing = indexing.asInstanceOf[js.Any], lookupBeforeAdd = lookupBeforeAdd.asInstanceOf[js.Any])
    __obj.asInstanceOf[BloomrunConfig]
  }
  
  @scala.inline
  implicit class BloomrunConfigOps[Self <: BloomrunConfig] (val x: Self) extends AnyVal {
    
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
    def setIndexing(value: insertion | depth): Self = this.set("indexing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookupBeforeAdd(value: Boolean): Self = this.set("lookupBeforeAdd", value.asInstanceOf[js.Any])
  }
}
