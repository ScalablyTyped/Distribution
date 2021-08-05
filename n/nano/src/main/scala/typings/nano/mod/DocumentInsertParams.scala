package typings.nano.mod

import typings.nano.nanoStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/database/common.html#post--db
// http://docs.couchdb.org/en/latest/api/document/common.html#put--db-docid
trait DocumentInsertParams extends StObject {
  
  // Stores document in batch mode.
  var batch: js.UndefOr[ok] = js.undefined
  
  // Prevents insertion of a conflicting document. Possible values: true (default) and false. If false, a
  // well-formed _rev must be included in the document. new_edits=false is used by the replicator to insert
  // documents into the target database even if that leads to the creation of conflicts.
  var new_edits: js.UndefOr[Boolean] = js.undefined
  
  // Document’s revision if updating an existing document. Alternative to If-Match header or document key.
  var rev: js.UndefOr[String] = js.undefined
}
object DocumentInsertParams {
  
  inline def apply(): DocumentInsertParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentInsertParams]
  }
  
  extension [Self <: DocumentInsertParams](x: Self) {
    
    inline def setBatch(value: ok): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setNew_edits(value: Boolean): Self = StObject.set(x, "new_edits", value.asInstanceOf[js.Any])
    
    inline def setNew_editsUndefined: Self = StObject.set(x, "new_edits", js.undefined)
    
    inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
    inline def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
  }
}
