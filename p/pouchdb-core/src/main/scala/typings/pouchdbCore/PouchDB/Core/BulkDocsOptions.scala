package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkDocsOptions extends Options {
  
  var new_edits: js.UndefOr[Boolean] = js.native
}
object BulkDocsOptions {
  
  @scala.inline
  def apply(): BulkDocsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkDocsOptions]
  }
  
  @scala.inline
  implicit class BulkDocsOptionsMutableBuilder[Self <: BulkDocsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNew_edits(value: Boolean): Self = StObject.set(x, "new_edits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_editsUndefined: Self = StObject.set(x, "new_edits", js.undefined)
  }
}
