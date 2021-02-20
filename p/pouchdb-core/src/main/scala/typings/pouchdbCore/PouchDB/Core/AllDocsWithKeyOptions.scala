package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllDocsWithKeyOptions extends AllDocsOptions {
  
  /** Constrain results to documents matching this key. */
  var key: DocumentKey = js.native
}
object AllDocsWithKeyOptions {
  
  @scala.inline
  def apply(key: DocumentKey): AllDocsWithKeyOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDocsWithKeyOptions]
  }
  
  @scala.inline
  implicit class AllDocsWithKeyOptionsMutableBuilder[Self <: AllDocsWithKeyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: DocumentKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
