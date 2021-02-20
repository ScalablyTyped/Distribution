package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.pouchdbCoreStrings.all
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOpenRevisions extends Options {
  
  /**
    * Fetch all leaf revisions if open_revs="all" or fetch all leaf
    * revisions specified in open_revs array. Leaves will be returned
    * in the same order as specified in input array.
    */
  var open_revs: all | js.Array[RevisionId] = js.native
  
  /** Include revision history of the document. */
  var revs: js.UndefOr[Boolean] = js.native
}
object GetOpenRevisions {
  
  @scala.inline
  def apply(open_revs: all | js.Array[RevisionId]): GetOpenRevisions = {
    val __obj = js.Dynamic.literal(open_revs = open_revs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpenRevisions]
  }
  
  @scala.inline
  implicit class GetOpenRevisionsMutableBuilder[Self <: GetOpenRevisions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpen_revs(value: all | js.Array[RevisionId]): Self = StObject.set(x, "open_revs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen_revsVarargs(value: RevisionId*): Self = StObject.set(x, "open_revs", js.Array(value :_*))
    
    @scala.inline
    def setRevs(value: Boolean): Self = StObject.set(x, "revs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevsUndefined: Self = StObject.set(x, "revs", js.undefined)
  }
}
