package typings.meteorDburlesCollectionHelpers

import org.scalablytyped.runtime.StringDictionary
import typings.meteor.mongoMod.Mongo.FieldSpecifier
import typings.meteor.mongoMod.Mongo.SortSpecifier
import typings.meteorDburlesCollectionHelpers.mod.Full
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ArrayFilters extends StObject {
    
    var arrayFilters: js.UndefOr[js.Array[StringDictionary[js.Any]]] = js.undefined
    
    var multi: js.UndefOr[Boolean] = js.undefined
    
    var upsert: js.UndefOr[Boolean] = js.undefined
  }
  object ArrayFilters {
    
    @scala.inline
    def apply(): ArrayFilters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrayFilters]
    }
    
    @scala.inline
    implicit class ArrayFiltersMutableBuilder[Self <: ArrayFilters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayFilters(value: js.Array[StringDictionary[js.Any]]): Self = StObject.set(x, "arrayFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayFiltersUndefined: Self = StObject.set(x, "arrayFilters", js.undefined)
      
      @scala.inline
      def setArrayFiltersVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "arrayFilters", js.Array(value :_*))
      
      @scala.inline
      def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      @scala.inline
      def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
    }
  }
  
  trait Fetch[T] extends StObject {
    
    var fetch: js.UndefOr[js.Array[String]] = js.undefined
    
    var insert: js.UndefOr[js.Function2[/* userId */ String, /* doc */ Full[T] & T, Boolean]] = js.undefined
    
    var remove: js.UndefOr[js.Function2[/* userId */ String, /* doc */ Full[T] & T, Boolean]] = js.undefined
    
    // ditto
    // tslint:disable-next-line ban-types
    var transform: js.UndefOr[js.Function | Null] = js.undefined
    
    var update: js.UndefOr[
        js.Function4[
          /* userId */ String, 
          /* doc */ Full[T] & T, 
          /* fieldNames */ js.Array[String], 
          /* modifier */ js.Any, 
          Boolean
        ]
      ] = js.undefined
  }
  object Fetch {
    
    @scala.inline
    def apply[T](): Fetch[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fetch[T]]
    }
    
    @scala.inline
    implicit class FetchMutableBuilder[Self <: Fetch[?], T] (val x: Self & Fetch[T]) extends AnyVal {
      
      @scala.inline
      def setFetch(value: js.Array[String]): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setFetchVarargs(value: String*): Self = StObject.set(x, "fetch", js.Array(value :_*))
      
      @scala.inline
      def setInsert(value: (/* userId */ String, /* doc */ Full[T] & T) => Boolean): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      @scala.inline
      def setRemove(value: (/* userId */ String, /* doc */ Full[T] & T) => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setTransform(value: js.Function): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformNull: Self = StObject.set(x, "transform", null)
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setUpdate(
        value: (/* userId */ String, /* doc */ Full[T] & T, /* fieldNames */ js.Array[String], /* modifier */ js.Any) => Boolean
      ): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    var fields: js.UndefOr[FieldSpecifier] = js.undefined
    
    var reactive: js.UndefOr[Boolean] = js.undefined
    
    var skip: js.UndefOr[Double] = js.undefined
    
    var sort: js.UndefOr[SortSpecifier] = js.undefined
    
    // ditto
    // tslint:disable-next-line ban-types
    var transform: js.UndefOr[js.Function | Null] = js.undefined
  }
  object Fields {
    
    @scala.inline
    def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: FieldSpecifier): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setReactive(value: Boolean): Self = StObject.set(x, "reactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReactiveUndefined: Self = StObject.set(x, "reactive", js.undefined)
      
      @scala.inline
      def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setSort(value: SortSpecifier): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setTransform(value: js.Function): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformNull: Self = StObject.set(x, "transform", null)
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  trait InsertedId extends StObject {
    
    var insertedId: js.UndefOr[String] = js.undefined
    
    var numberAffected: js.UndefOr[Double] = js.undefined
  }
  object InsertedId {
    
    @scala.inline
    def apply(): InsertedId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InsertedId]
    }
    
    @scala.inline
    implicit class InsertedIdMutableBuilder[Self <: InsertedId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInsertedId(value: String): Self = StObject.set(x, "insertedId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertedIdUndefined: Self = StObject.set(x, "insertedId", js.undefined)
      
      @scala.inline
      def setNumberAffected(value: Double): Self = StObject.set(x, "numberAffected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberAffectedUndefined: Self = StObject.set(x, "numberAffected", js.undefined)
    }
  }
  
  trait Multi extends StObject {
    
    var multi: js.UndefOr[Boolean] = js.undefined
  }
  object Multi {
    
    @scala.inline
    def apply(): Multi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Multi]
    }
    
    @scala.inline
    implicit class MultiMutableBuilder[Self <: Multi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    }
  }
}
