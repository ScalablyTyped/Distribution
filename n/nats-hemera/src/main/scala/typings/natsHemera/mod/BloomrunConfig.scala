package typings.natsHemera.mod

import typings.natsHemera.natsHemeraStrings.depth
import typings.natsHemera.natsHemeraStrings.insertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BloomrunConfig extends StObject {
  
  var indexing: insertion | depth
  
  var lookupBeforeAdd: Boolean
}
object BloomrunConfig {
  
  @scala.inline
  def apply(indexing: insertion | depth, lookupBeforeAdd: Boolean): BloomrunConfig = {
    val __obj = js.Dynamic.literal(indexing = indexing.asInstanceOf[js.Any], lookupBeforeAdd = lookupBeforeAdd.asInstanceOf[js.Any])
    __obj.asInstanceOf[BloomrunConfig]
  }
  
  @scala.inline
  implicit class BloomrunConfigMutableBuilder[Self <: BloomrunConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexing(value: insertion | depth): Self = StObject.set(x, "indexing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookupBeforeAdd(value: Boolean): Self = StObject.set(x, "lookupBeforeAdd", value.asInstanceOf[js.Any])
  }
}
