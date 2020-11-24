package typings.pouchdbCore.PouchDB.Core

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
  implicit class AllDocsWithinRangeOptionsOps[Self <: AllDocsWithinRangeOptions] (val x: Self) extends AnyVal {
    
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
    def setEndkey(value: DocumentKey): Self = this.set("endkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartkey(value: DocumentKey): Self = this.set("startkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusive_end(value: Boolean): Self = this.set("inclusive_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclusive_end: Self = this.set("inclusive_end", js.undefined)
  }
}
