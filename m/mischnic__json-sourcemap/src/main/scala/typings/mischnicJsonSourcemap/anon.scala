package typings.mischnicJsonSourcemap

import typings.mischnicJsonSourcemap.mischnicJsonSourcemapStrings.JSON
import typings.mischnicJsonSourcemap.mischnicJsonSourcemapStrings.JSON5
import typings.mischnicJsonSourcemap.mod.Mapping
import typings.mischnicJsonSourcemap.mod.Position
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: Any
    
    var pointers: Record[String, Mapping]
  }
  object Data {
    
    inline def apply(data: Any, pointers: Record[String, Mapping]): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPointers(value: Record[String, Mapping]): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dialect extends StObject {
    
    var dialect: js.UndefOr[JSON5 | JSON] = js.undefined
    
    var tabWidth: js.UndefOr[Double] = js.undefined
  }
  object Dialect {
    
    inline def apply(): Dialect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dialect]
    }
    
    extension [Self <: Dialect](x: Self) {
      
      inline def setDialect(value: JSON5 | JSON): Self = StObject.set(x, "dialect", value.asInstanceOf[js.Any])
      
      inline def setDialectUndefined: Self = StObject.set(x, "dialect", js.undefined)
      
      inline def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
      
      inline def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
    }
  }
  
  trait Key
    extends StObject
       with Mapping {
    
    var key: js.UndefOr[Position] = js.undefined
    
    var keyEnd: js.UndefOr[Position] = js.undefined
    
    var value: Position
    
    var valueEnd: Position
  }
  object Key {
    
    inline def apply(value: Position, valueEnd: Position): Key = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], valueEnd = valueEnd.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: Position): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyEnd(value: Position): Self = StObject.set(x, "keyEnd", value.asInstanceOf[js.Any])
      
      inline def setKeyEndUndefined: Self = StObject.set(x, "keyEnd", js.undefined)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setValue(value: Position): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueEnd(value: Position): Self = StObject.set(x, "valueEnd", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value
    extends StObject
       with Mapping {
    
    var value: Position
    
    var valueEnd: Position
  }
  object Value {
    
    inline def apply(value: Position, valueEnd: Position): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], valueEnd = valueEnd.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: Position): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueEnd(value: Position): Self = StObject.set(x, "valueEnd", value.asInstanceOf[js.Any])
    }
  }
}
