package typings.nano

import org.scalablytyped.runtime.StringDictionary
import typings.nano.mod.Callback
import typings.nano.mod.DatabaseCreateResponse
import typings.nano.mod.DatabaseGetResponse
import typings.nano.mod.Document
import typings.nano.mod.MangoSelector
import typings.nano.mod.SortOrder
import typings.nano.nanoStrings.DELETE
import typings.nano.nanoStrings.GET
import typings.nano.nanoStrings.POST
import typings.nano.nanoStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Active extends StObject {
    
    /** The size of live data inside the database, in bytes. */
    var active: Double
    
    /** The uncompressed size of database contents in bytes. */
    var external: Double
    
    /** The size of the database file on disk in bytes. Views indexes */
    var file: Double
  }
  object Active {
    
    inline def apply(active: Double, external: Double, file: Double): Active = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[Active]
    }
    
    extension [Self <: Active](x: Self) {
      
      inline def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setExternal(value: Double): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setFile(value: Double): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Disable extends StObject {
    
    def disable(id: String, rev: String, opts0: js.Object): js.Promise[DatabaseCreateResponse] = js.native
    def disable(id: String, rev: String, opts0: js.Object, callback0: Callback[DatabaseCreateResponse]): js.Promise[DatabaseCreateResponse] = js.native
    
    def enable(source: String, target: String, opts0: js.Object): js.Promise[DatabaseCreateResponse] = js.native
    def enable(source: String, target: String, opts0: js.Object, callback0: Callback[DatabaseCreateResponse]): js.Promise[DatabaseCreateResponse] = js.native
    
    def query(id: String, opts0: js.Object): js.Promise[DatabaseGetResponse] = js.native
    def query(id: String, opts0: js.Object, callback0: Callback[DatabaseGetResponse]): js.Promise[DatabaseGetResponse] = js.native
  }
  
  trait Doc[V] extends StObject {
    
    var doc: js.UndefOr[V] = js.undefined
    
    var fields: js.Object
    
    var id: String
    
    var key: String
    
    var order: js.Array[Double]
  }
  object Doc {
    
    inline def apply[V](fields: js.Object, id: String, key: String, order: js.Array[Double]): Doc[V] = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
      __obj.asInstanceOf[Doc[V]]
    }
    
    extension [Self <: Doc[?], V](x: Self & Doc[V]) {
      
      inline def setDoc(value: V): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
      
      inline def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: js.Array[Double]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderVarargs(value: Double*): Self = StObject.set(x, "order", js.Array(value*))
    }
  }
  
  trait External extends StObject {
    
    var active: Double
    
    var external: Double
  }
  object External {
    
    inline def apply(active: Double, external: Double): External = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any])
      __obj.asInstanceOf[External]
    }
    
    extension [Self <: External](x: Self) {
      
      inline def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setExternal(value: Double): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fields extends StObject {
    
    /** Array of field names following the sort syntax. */
    var fields: js.Array[SortOrder]
    
    /** A selector to apply to documents at indexing time, creating a partial index. */
    var partial_filter_selector: js.UndefOr[MangoSelector] = js.undefined
  }
  object Fields {
    
    inline def apply(fields: js.Array[SortOrder]): Fields = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def setFields(value: js.Array[SortOrder]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: SortOrder*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setPartial_filter_selector(value: MangoSelector): Self = StObject.set(x, "partial_filter_selector", value.asInstanceOf[js.Any])
      
      inline def setPartial_filter_selectorUndefined: Self = StObject.set(x, "partial_filter_selector", js.undefined)
    }
  }
  
  trait Headers extends StObject {
    
    var headers: js.UndefOr[StringDictionary[String | Double]] = js.undefined
    
    var method: js.UndefOr[GET | POST | PUT | DELETE] = js.undefined
    
    // 'http://couchhost:5984/db/tsp2',
    var qs: js.UndefOr[Any] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
  }
  object Headers {
    
    inline def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: StringDictionary[String | Double]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: GET | POST | PUT | DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setQs(value: Any): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
      
      inline def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
  
  trait Id[V, D] extends StObject {
    
    var doc: js.UndefOr[D & Document] = js.undefined
    
    var id: String
    
    var key: String
    
    var value: V
  }
  object Id {
    
    inline def apply[V, D](id: String, key: String, value: V): Id[V, D] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id[V, D]]
    }
    
    extension [Self <: Id[?, ?], V, D](x: Self & (Id[V, D])) {
      
      inline def setDoc(value: D & Document): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdRev extends StObject {
    
    var _id: String
    
    var _rev: String
  }
  object IdRev {
    
    inline def apply(_id: String, _rev: String): IdRev = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdRev]
    }
    
    extension [Self <: IdRev](x: Self) {
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      inline def set_rev(value: String): Self = StObject.set(x, "_rev", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rev extends StObject {
    
    var rev: String
  }
  object Rev {
    
    inline def apply(rev: String): Rev = {
      val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rev]
    }
    
    extension [Self <: Rev](x: Self) {
      
      inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    }
  }
}
