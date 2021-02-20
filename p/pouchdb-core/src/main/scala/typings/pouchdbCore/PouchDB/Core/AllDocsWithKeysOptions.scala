package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllDocsWithKeysOptions extends AllDocsOptions {
  
  /** Constrains results to documents matching any of these keys. */
  var keys: js.Array[DocumentId] = js.native
}
object AllDocsWithKeysOptions {
  
  @scala.inline
  def apply(keys: js.Array[DocumentId]): AllDocsWithKeysOptions = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDocsWithKeysOptions]
  }
  
  @scala.inline
  implicit class AllDocsWithKeysOptionsMutableBuilder[Self <: AllDocsWithKeysOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeys(value: js.Array[DocumentId]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: DocumentId*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
