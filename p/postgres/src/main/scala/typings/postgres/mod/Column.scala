package typings.postgres.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column[T /* <: String */] extends StObject {
  
  var name: T
  
  var number: Double
  
  var parser: js.UndefOr[js.Function1[/* raw */ String, Any]] = js.undefined
  
  var table: Double
  
  var `type`: Double
}
object Column {
  
  inline def apply[T /* <: String */](name: T, number: Double, table: Double, `type`: Double): Column[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Column[?], T /* <: String */] (val x: Self & Column[T]) extends AnyVal {
    
    inline def setName(value: T): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setParser(value: /* raw */ String => Any): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
    
    inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    inline def setTable(value: Double): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
