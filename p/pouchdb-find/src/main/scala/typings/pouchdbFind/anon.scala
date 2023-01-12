package typings.pouchdbFind

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbFind.PouchDB.Find.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ddoc extends StObject {
    
    /** Design document name (i.e. the part after '_design/', auto-generated if you don't include it */
    var ddoc: js.UndefOr[String] = js.undefined
    
    /** List of fields to index */
    var fields: js.Array[String]
    
    /** Name of the index, auto-generated if you don't include it */
    var name: js.UndefOr[String] = js.undefined
    
    /** The same syntax as the selector you’d pass to find(), and only documents matching the selector will be included in the index. */
    var partial_filter_selector: js.UndefOr[Selector] = js.undefined
    
    /** Only supports 'json', and it's also the default */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Ddoc {
    
    inline def apply(fields: js.Array[String]): Ddoc = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ddoc]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ddoc] (val x: Self) extends AnyVal {
      
      inline def setDdoc(value: String): Self = StObject.set(x, "ddoc", value.asInstanceOf[js.Any])
      
      inline def setDdocUndefined: Self = StObject.set(x, "ddoc", js.undefined)
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPartial_filter_selector(value: Selector): Self = StObject.set(x, "partial_filter_selector", value.asInstanceOf[js.Any])
      
      inline def setPartial_filter_selectorUndefined: Self = StObject.set(x, "partial_filter_selector", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    var fields: js.Array[StringDictionary[String]]
  }
  object Fields {
    
    inline def apply(fields: js.Array[StringDictionary[String]]): Fields = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      inline def setFields(value: js.Array[StringDictionary[String]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: StringDictionary[String]*): Self = StObject.set(x, "fields", js.Array(value*))
    }
  }
}
