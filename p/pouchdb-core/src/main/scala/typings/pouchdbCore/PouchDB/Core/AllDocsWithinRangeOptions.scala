package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllDocsWithinRangeOptions extends AllDocsOptions {
  
  /** High end of range, or low end if `descending` is `true`. */
  var endkey: DocumentKey = js.native
  
  /**
    * Include any documents identified by `endkey`.
    *
    * Defaults to `true`.
    */
  var inclusive_end: js.UndefOr[Boolean] = js.native
  
  /** Low end of range, or high end if `descending` is `true`. */
  var startkey: DocumentKey = js.native
}
object AllDocsWithinRangeOptions {
  
  @scala.inline
  def apply(endkey: DocumentKey, startkey: DocumentKey): AllDocsWithinRangeOptions = {
    val __obj = js.Dynamic.literal(endkey = endkey.asInstanceOf[js.Any], startkey = startkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDocsWithinRangeOptions]
  }
  
  @scala.inline
  implicit class AllDocsWithinRangeOptionsMutableBuilder[Self <: AllDocsWithinRangeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndkey(value: DocumentKey): Self = StObject.set(x, "endkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusive_end(value: Boolean): Self = StObject.set(x, "inclusive_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusive_endUndefined: Self = StObject.set(x, "inclusive_end", js.undefined)
    
    @scala.inline
    def setStartkey(value: DocumentKey): Self = StObject.set(x, "startkey", value.asInstanceOf[js.Any])
  }
}
