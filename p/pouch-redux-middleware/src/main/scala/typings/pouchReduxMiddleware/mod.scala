package typings.pouchReduxMiddleware

import typings.pouchReduxMiddleware.anon.BatchInsert
import typings.pouchdbCore.PouchDB.Core.IdMeta
import typings.pouchdbCore.PouchDB.Database
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pouch-redux-middleware", JSImport.Default)
  @js.native
  def default[T](): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("pouch-redux-middleware", JSImport.Default)
  @js.native
  def default[T](paths: js.Array[Path[T]]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("pouch-redux-middleware", JSImport.Default)
  @js.native
  def default[T](paths: Path[T]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  
  type Document[T] = IdMeta with T
  
  @js.native
  trait Path[T] extends StObject {
    
    var actions: BatchInsert[T] = js.native
    
    var db: Database[T] = js.native
    
    var docs: js.UndefOr[js.Any] = js.native
    
    var handleResponse: js.UndefOr[
        js.Function3[
          /* err */ Error, 
          /* data */ js.Any, 
          /* errorCallback */ js.Function1[/* err */ Error, Unit], 
          Unit
        ]
      ] = js.native
    
    var initialBatchDispatched: js.UndefOr[js.Function1[/* err */ js.UndefOr[Error], Unit]] = js.native
    
    var path: String = js.native
    
    var propagateBatchInsert: js.UndefOr[js.Function2[/* doc */ js.Array[Document[T]], /* dispatch */ Dispatch[_], Unit]] = js.native
    
    var propagateDelete: js.UndefOr[js.Function2[/* doc */ Document[T], /* dispatch */ Dispatch[_], Unit]] = js.native
    
    var propagateInsert: js.UndefOr[js.Function2[/* doc */ Document[T], /* dispatch */ Dispatch[_], Unit]] = js.native
    
    var propagateUpdate: js.UndefOr[js.Function2[/* doc */ Document[T], /* dispatch */ Dispatch[_], Unit]] = js.native
    
    var queue: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var scheduleInset: js.UndefOr[js.Function1[/* doc */ Document[T], Unit]] = js.native
    
    var scheduleRemove: js.UndefOr[js.Function1[/* doc */ Document[T], Unit]] = js.native
  }
  object Path {
    
    @scala.inline
    def apply[T](actions: BatchInsert[T], db: Database[T], path: String): Path[T] = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path[T]]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path[_], T] (val x: Self with Path[T]) extends AnyVal {
      
      @scala.inline
      def setActions(value: BatchInsert[T]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDb(value: Database[T]): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocs(value: js.Any): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
      
      @scala.inline
      def setHandleResponse(
        value: (/* err */ Error, /* data */ js.Any, /* errorCallback */ js.Function1[/* err */ Error, Unit]) => Unit
      ): Self = StObject.set(x, "handleResponse", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHandleResponseUndefined: Self = StObject.set(x, "handleResponse", js.undefined)
      
      @scala.inline
      def setInitialBatchDispatched(value: /* err */ js.UndefOr[Error] => Unit): Self = StObject.set(x, "initialBatchDispatched", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitialBatchDispatchedUndefined: Self = StObject.set(x, "initialBatchDispatched", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropagateBatchInsert(value: (/* doc */ js.Array[Document[T]], /* dispatch */ Dispatch[_]) => Unit): Self = StObject.set(x, "propagateBatchInsert", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPropagateBatchInsertUndefined: Self = StObject.set(x, "propagateBatchInsert", js.undefined)
      
      @scala.inline
      def setPropagateDelete(value: (/* doc */ Document[T], /* dispatch */ Dispatch[_]) => Unit): Self = StObject.set(x, "propagateDelete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPropagateDeleteUndefined: Self = StObject.set(x, "propagateDelete", js.undefined)
      
      @scala.inline
      def setPropagateInsert(value: (/* doc */ Document[T], /* dispatch */ Dispatch[_]) => Unit): Self = StObject.set(x, "propagateInsert", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPropagateInsertUndefined: Self = StObject.set(x, "propagateInsert", js.undefined)
      
      @scala.inline
      def setPropagateUpdate(value: (/* doc */ Document[T], /* dispatch */ Dispatch[_]) => Unit): Self = StObject.set(x, "propagateUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPropagateUpdateUndefined: Self = StObject.set(x, "propagateUpdate", js.undefined)
      
      @scala.inline
      def setQueue(value: /* repeated */ js.Any => _): Self = StObject.set(x, "queue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
      
      @scala.inline
      def setScheduleInset(value: /* doc */ Document[T] => Unit): Self = StObject.set(x, "scheduleInset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScheduleInsetUndefined: Self = StObject.set(x, "scheduleInset", js.undefined)
      
      @scala.inline
      def setScheduleRemove(value: /* doc */ Document[T] => Unit): Self = StObject.set(x, "scheduleRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScheduleRemoveUndefined: Self = StObject.set(x, "scheduleRemove", js.undefined)
    }
  }
}
