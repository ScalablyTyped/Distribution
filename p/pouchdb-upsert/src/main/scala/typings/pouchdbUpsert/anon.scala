package typings.pouchdbUpsert

import typings.pouchdbCore.PouchDB.Core.DocumentId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<pouchdb-core.PouchDB.Core.IdMeta> */
  @js.native
  trait PartialIdMeta extends StObject {
    
    var _id: js.UndefOr[DocumentId] = js.native
  }
  object PartialIdMeta {
    
    @scala.inline
    def apply(): PartialIdMeta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIdMeta]
    }
    
    @scala.inline
    implicit class PartialIdMetaMutableBuilder[Self <: PartialIdMeta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_id(value: DocumentId): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
    }
  }
}
