package typings.pouchReduxMiddleware

import typings.pouchReduxMiddleware.mod.Document
import typings.redux.mod.AnyAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BatchInsert[T] extends StObject {
    
    def batchInsert(docs: js.Array[Document[T]]): AnyAction = js.native
    
    def insert(doc: Document[T]): AnyAction = js.native
    
    def remove(doc: Document[T]): AnyAction = js.native
    
    def update(doc: Document[T]): AnyAction = js.native
  }
  object BatchInsert {
    
    @scala.inline
    def apply[T](
      batchInsert: js.Array[Document[T]] => AnyAction,
      insert: Document[T] => AnyAction,
      remove: Document[T] => AnyAction,
      update: Document[T] => AnyAction
    ): BatchInsert[T] = {
      val __obj = js.Dynamic.literal(batchInsert = js.Any.fromFunction1(batchInsert), insert = js.Any.fromFunction1(insert), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[BatchInsert[T]]
    }
    
    @scala.inline
    implicit class BatchInsertMutableBuilder[Self <: BatchInsert[_], T] (val x: Self with BatchInsert[T]) extends AnyVal {
      
      @scala.inline
      def setBatchInsert(value: js.Array[Document[T]] => AnyAction): Self = StObject.set(x, "batchInsert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsert(value: Document[T] => AnyAction): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: Document[T] => AnyAction): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdate(value: Document[T] => AnyAction): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
