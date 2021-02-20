package typings.pouchdbLiveFind

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbCore.EventEmitter
import typings.pouchdbFind.PouchDB.Find.Selector
import typings.pouchdbLiveFind.PouchDB.LiveFind.LiveFeed
import typings.pouchdbLiveFind.PouchDB.LiveFind.RequestDef
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.ADD
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.REMOVE
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.UPDATE
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.asc
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.cancelled
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.desc
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.error
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.ready
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.update_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PouchDB {
  
  @js.native
  trait Database[Content /* <: js.Object */] extends StObject {
    
    def liveFind(requestDef: RequestDef[Content]): LiveFeed[Content] = js.native
  }
  object Database {
    
    @scala.inline
    def apply[Content /* <: js.Object */](liveFind: RequestDef[Content] => LiveFeed[Content]): Database[Content] = {
      val __obj = js.Dynamic.literal(liveFind = js.Any.fromFunction1(liveFind))
      __obj.asInstanceOf[Database[Content]]
    }
    
    @scala.inline
    implicit class DatabaseMutableBuilder[Self <: Database[_], Content /* <: js.Object */] (val x: Self with Database[Content]) extends AnyVal {
      
      @scala.inline
      def setLiveFind(value: RequestDef[Content] => LiveFeed[Content]): Self = StObject.set(x, "liveFind", js.Any.fromFunction1(value))
    }
  }
  
  object LiveFind {
    
    @js.native
    trait LiveFeed[Content /* <: js.Object */] extends EventEmitter {
      
      // stops the query and removes all listeners
      def cancel(): Unit = js.native
      
      def `catch`(callbackFailure: js.Function0[_]): Unit = js.native
      
      @JSName("on")
      def on_cancelled(event: cancelled, listener: js.Function0[Unit]): this.type = js.native
      @JSName("on")
      def on_error(event: error, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
      @JSName("on")
      def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
      @JSName("on")
      def on_update(event: update_, listener: js.Function2[/* event */ UpdateEvent, /* list */ js.Any, Unit]): this.type = js.native
      
      // updates the pagination and sorting of the aggregate list and immediately returns the updated list. Available options are sort, skip, and limit.
      def paginate(options: PaginateOptions[Content]): js.Array[js.Any] = js.native
      
      // a convenience function to sort any list in place by the sort order you provided. (This will mutate the Array.)
      def sort(list: js.Array[js.Any]): js.Array[js.Any] = js.native
      
      def `then`(callbackSuccess: js.Function0[_]): Unit = js.native
    }
    
    /* Inlined parent std.Pick<pouchdb-find.PouchDB.Find.FindRequest<Content>, 'sort' | 'skip' | 'limit'> */
    @js.native
    trait PaginateOptions[Content /* <: js.Object */] extends StObject {
      
      var limit: js.UndefOr[Double] = js.native
      
      var skip: js.UndefOr[Double] = js.native
      
      var sort: js.UndefOr[js.Array[String | (StringDictionary[asc | desc])]] = js.native
    }
    object PaginateOptions {
      
      @scala.inline
      def apply[Content /* <: js.Object */](): PaginateOptions[Content] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PaginateOptions[Content]]
      }
      
      @scala.inline
      implicit class PaginateOptionsMutableBuilder[Self <: PaginateOptions[_], Content /* <: js.Object */] (val x: Self with PaginateOptions[Content]) extends AnyVal {
        
        @scala.inline
        def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        @scala.inline
        def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
        
        @scala.inline
        def setSort(value: js.Array[String | (StringDictionary[asc | desc])]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
        
        @scala.inline
        def setSortVarargs(value: (String | (StringDictionary[asc | desc]))*): Self = StObject.set(x, "sort", js.Array(value :_*))
      }
    }
    
    /* Inlined parent std.Pick<pouchdb-find.PouchDB.Find.FindRequest<Content>, std.Exclude<keyof pouchdb-find.PouchDB.Find.FindRequest<Content>, 'use_index'>> */
    @js.native
    trait RequestDef[Content /* <: js.Object */] extends StObject {
      
      var aggregate: js.UndefOr[Boolean] = js.native
      
      var fields: js.UndefOr[js.Array[String]] = js.native
      
      var limit: js.UndefOr[Double] = js.native
      
      var selector: Selector = js.native
      
      var skip: js.UndefOr[Double] = js.native
      
      var sort: js.UndefOr[js.Array[String | (StringDictionary[asc | desc])]] = js.native
    }
    object RequestDef {
      
      @scala.inline
      def apply[Content /* <: js.Object */](selector: Selector): RequestDef[Content] = {
        val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[RequestDef[Content]]
      }
      
      @scala.inline
      implicit class RequestDefMutableBuilder[Self <: RequestDef[_], Content /* <: js.Object */] (val x: Self with RequestDef[Content]) extends AnyVal {
        
        @scala.inline
        def setAggregate(value: Boolean): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
        
        @scala.inline
        def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
        
        @scala.inline
        def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        @scala.inline
        def setSelector(value: Selector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
        
        @scala.inline
        def setSort(value: js.Array[String | (StringDictionary[asc | desc])]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
        
        @scala.inline
        def setSortVarargs(value: (String | (StringDictionary[asc | desc]))*): Self = StObject.set(x, "sort", js.Array(value :_*))
      }
    }
    
    @js.native
    trait UpdateEvent extends StObject {
      
      var action: REMOVE | ADD | UPDATE = js.native
      
      var doc: js.Any = js.native
      
      var id: js.Any = js.native
      
      var rev: js.Any = js.native
    }
    object UpdateEvent {
      
      @scala.inline
      def apply(action: REMOVE | ADD | UPDATE, doc: js.Any, id: js.Any, rev: js.Any): UpdateEvent = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], doc = doc.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
        __obj.asInstanceOf[UpdateEvent]
      }
      
      @scala.inline
      implicit class UpdateEventMutableBuilder[Self <: UpdateEvent] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAction(value: REMOVE | ADD | UPDATE): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDoc(value: js.Any): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRev(value: js.Any): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
      }
    }
  }
}
