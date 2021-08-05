package typings.pouchdbFind

import org.scalablytyped.runtime.StringDictionary
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
    
    /** Only supports 'json', and it's also the default */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Ddoc {
    
    inline def apply(fields: js.Array[String]): Ddoc = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ddoc]
    }
    
    extension [Self <: Ddoc](x: Self) {
      
      inline def setDdoc(value: String): Self = StObject.set(x, "ddoc", value.asInstanceOf[js.Any])
      
      inline def setDdocUndefined: Self = StObject.set(x, "ddoc", js.undefined)
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
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
    
    extension [Self <: Fields](x: Self) {
      
      inline def setFields(value: js.Array[StringDictionary[String]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: StringDictionary[String]*): Self = StObject.set(x, "fields", js.Array(value :_*))
    }
  }
}
