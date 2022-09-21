package typings.mischnicJsonSourcemap

import typings.mischnicJsonSourcemap.anon.Data
import typings.mischnicJsonSourcemap.anon.Dialect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mischnic/json-sourcemap/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(json: String): Data = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any]).asInstanceOf[Data]
  inline def parse(json: String, reviver: js.Function2[/* key */ Any, /* value */ Any, Any]): Data = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Data]
  inline def parse(json: String, reviver: js.Function2[/* key */ Any, /* value */ Any, Any], options: Dialect): Data = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Data]
  inline def parse(json: String, reviver: Unit, options: Dialect): Data = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Data]
  
  /* Rewritten from type alias, can be one of: 
    - typings.mischnicJsonSourcemap.anon.Value
    - typings.mischnicJsonSourcemap.anon.Key
  */
  trait Mapping extends StObject
  object Mapping {
    
    inline def Key(value: Position, valueEnd: Position): typings.mischnicJsonSourcemap.anon.Key = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], valueEnd = valueEnd.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mischnicJsonSourcemap.anon.Key]
    }
    
    inline def Value(value: Position, valueEnd: Position): typings.mischnicJsonSourcemap.anon.Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], valueEnd = valueEnd.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mischnicJsonSourcemap.anon.Value]
    }
  }
  
  trait Position extends StObject {
    
    var column: Double
    
    var line: Double
    
    var pos: Double
  }
  object Position {
    
    inline def apply(column: Double, line: Double, pos: Double): Position = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
}
