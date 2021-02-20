package typings.pouchdbUpsert

import typings.pouchdbCore.PouchDB.Core.Callback
import typings.pouchdbCore.PouchDB.Core.Document
import typings.pouchdbCore.PouchDB.Core.DocumentId
import typings.pouchdbCore.PouchDB.Core.RevisionId
import typings.pouchdbUpsert.anon.PartialIdMeta
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PouchDB {
  
  /* Rewritten from type alias, can be one of: 
    - typings.pouchdbUpsert.pouchdbUpsertStrings._empty
    - typings.pouchdbUpsert.pouchdbUpsertNumbers.`0`
    - typings.pouchdbUpsert.pouchdbUpsertBooleans.`false`
    - scala.Null
    - js.UndefOr[scala.Nothing]
  */
  type CancelUpsert = js.UndefOr[_CancelUpsert | Null]
  
  @js.native
  trait Database[Content /* <: js.Object */] extends StObject {
    
    /**
      * Put a new document with the given docId, if it doesn't already exist. Returns a Promise.
      *
      * @param doc - the document to insert. Should contain an _id if docId is not specified
      * If the document already exists, then the Promise will just resolve immediately.
      */
    def putIfNotExists[Model](doc: Document[Content with Model]): js.Promise[UpsertResponse] = js.native
    //
    /**
      * Put a new document with the given docId, if it doesn't already exist.  If a callback is not provided,
      * the Promise based version of this function will be called.
      *
      * @param doc - the document to insert. Should contain an _id if docId is not specified
      * If the document already exists, then the Promise will just resolve immediately.
      * @param callback - called with the results after operation is completed.
      * If you don't specify a callback, then the Promise version of this function will be invoked and it
      * will return a Promise.
      */
    def putIfNotExists[Model](doc: Document[Content with Model], callback: Callback[UpsertResponse]): Unit = js.native
    
    /**
      * Perform an upsert (update or insert) operation. Returns a Promise.
      *
      * @param docId - the _id of the document.
      * @param diffFun - function that takes the existing doc as input and returns an updated doc.
      * If this diffFunc returns falsey, then the update won't be performed (as an optimization).
      * If the document does not already exist, then {} will be the input to diffFunc.
      *
      */
    def upsert[Model](docId: DocumentId, diffFun: UpsertDiffCallback[Content with Model]): js.Promise[UpsertResponse] = js.native
    /**
      * Perform an upsert (update or insert) operation. If a callback is not provided, the Promise based version
      * of this function will be called.
      *
      * @param docId - the _id of the document.
      * @param diffFun - function that takes the existing doc as input and returns an updated doc.
      * If this diffFunc returns falsey, then the update won't be performed (as an optimization).
      * If the document does not already exist, then {} will be the input to diffFunc.
      * @param callback - called with the results after operation is completed.
      */
    def upsert[Model](
      docId: DocumentId,
      diffFun: UpsertDiffCallback[Content with Model],
      callback: Callback[UpsertResponse]
    ): Unit = js.native
  }
  
  // falsey values
  // `Partial<Core.Document<Content>>` seems more useful than
  // `{} | Core.Document<Content>` since there isn't an easy way to narrow
  // `{} | Core.Document<Content>` to `Core.Document<Content>`.
  type UpsertDiffCallback[Content /* <: js.Object */] = js.Function1[/* doc */ Partial[Document[Content]], (Content with PartialIdMeta) | CancelUpsert]
  
  @js.native
  trait UpsertResponse extends StObject {
    
    var id: DocumentId = js.native
    
    var rev: RevisionId = js.native
    
    var updated: Boolean = js.native
  }
  object UpsertResponse {
    
    @scala.inline
    def apply(id: DocumentId, rev: RevisionId, updated: Boolean): UpsertResponse = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpsertResponse]
    }
    
    @scala.inline
    implicit class UpsertResponseMutableBuilder[Self <: UpsertResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: DocumentId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRev(value: RevisionId): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated(value: Boolean): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  trait _CancelUpsert extends StObject
}
