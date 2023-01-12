package typings.nodeMysqlWrapper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var multi: js.UndefOr[Boolean] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    }
  }
  
  trait Connection extends StObject {
    
    var connection: js.UndefOr[js.Object] = js.undefined
    
    var idGeneration: js.UndefOr[String] = js.undefined
    
    var transform: js.UndefOr[js.Function] = js.undefined
  }
  object Connection {
    
    inline def apply(): Connection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Connection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
      
      inline def setConnection(value: js.Object): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      inline def setIdGeneration(value: String): Self = StObject.set(x, "idGeneration", value.asInstanceOf[js.Any])
      
      inline def setIdGenerationUndefined: Self = StObject.set(x, "idGeneration", js.undefined)
      
      inline def setTransform(value: js.Function): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  trait Fetch[T] extends StObject {
    
    var fetch: js.UndefOr[js.Array[String]] = js.undefined
    
    var insert: js.UndefOr[js.Function2[/* userId */ String, /* doc */ T, Boolean]] = js.undefined
    
    var remove: js.UndefOr[js.Function2[/* userId */ String, /* doc */ T, Boolean]] = js.undefined
    
    var transform: js.UndefOr[js.Function] = js.undefined
    
    var update: js.UndefOr[
        js.Function4[
          /* userId */ String, 
          /* doc */ T, 
          /* fieldNames */ js.Array[String], 
          /* modifier */ Any, 
          Boolean
        ]
      ] = js.undefined
  }
  object Fetch {
    
    inline def apply[T](): Fetch[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fetch[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fetch[?], T] (val x: Self & Fetch[T]) extends AnyVal {
      
      inline def setFetch(value: js.Array[String]): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setFetchVarargs(value: String*): Self = StObject.set(x, "fetch", js.Array(value*))
      
      inline def setInsert(value: (/* userId */ String, /* doc */ T) => Boolean): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setRemove(value: (/* userId */ String, /* doc */ T) => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setTransform(value: js.Function): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setUpdate(
        value: (/* userId */ String, /* doc */ T, /* fieldNames */ js.Array[String], /* modifier */ Any) => Boolean
      ): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    var fields: js.UndefOr[Any] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var reactive: js.UndefOr[Boolean] = js.undefined
    
    var skip: js.UndefOr[Double] = js.undefined
    
    var sort: js.UndefOr[Any] = js.undefined
    
    var transform: js.UndefOr[js.Function] = js.undefined
  }
  object Fields {
    
    inline def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      inline def setFields(value: Any): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setReactive(value: Boolean): Self = StObject.set(x, "reactive", value.asInstanceOf[js.Any])
      
      inline def setReactiveUndefined: Self = StObject.set(x, "reactive", js.undefined)
      
      inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setSort(value: Any): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setTransform(value: js.Function): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  trait InsertedId extends StObject {
    
    var insertedId: js.UndefOr[String] = js.undefined
    
    var numberAffected: js.UndefOr[Double] = js.undefined
  }
  object InsertedId {
    
    inline def apply(): InsertedId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InsertedId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InsertedId] (val x: Self) extends AnyVal {
      
      inline def setInsertedId(value: String): Self = StObject.set(x, "insertedId", value.asInstanceOf[js.Any])
      
      inline def setInsertedIdUndefined: Self = StObject.set(x, "insertedId", js.undefined)
      
      inline def setNumberAffected(value: Double): Self = StObject.set(x, "numberAffected", value.asInstanceOf[js.Any])
      
      inline def setNumberAffectedUndefined: Self = StObject.set(x, "numberAffected", js.undefined)
    }
  }
  
  trait Multi extends StObject {
    
    var multi: js.UndefOr[Boolean] = js.undefined
    
    var upsert: js.UndefOr[Boolean] = js.undefined
  }
  object Multi {
    
    inline def apply(): Multi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Multi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Multi] (val x: Self) extends AnyVal {
      
      inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
      
      inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
    }
  }
  
  trait Reactive extends StObject {
    
    var fields: js.UndefOr[Any] = js.undefined
    
    var reactive: js.UndefOr[Boolean] = js.undefined
    
    var skip: js.UndefOr[Double] = js.undefined
    
    var sort: js.UndefOr[Any] = js.undefined
    
    var transform: js.UndefOr[js.Function] = js.undefined
  }
  object Reactive {
    
    inline def apply(): Reactive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Reactive]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reactive] (val x: Self) extends AnyVal {
      
      inline def setFields(value: Any): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setReactive(value: Boolean): Self = StObject.set(x, "reactive", value.asInstanceOf[js.Any])
      
      inline def setReactiveUndefined: Self = StObject.set(x, "reactive", js.undefined)
      
      inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setSort(value: Any): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setTransform(value: js.Function): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
