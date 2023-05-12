package typings.postgres.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostgresType[T] extends StObject {
  
  var from: js.Array[Double]
  
  def parse(raw: Any): T
  
  def serialize(value: T): Any
  
  var to: Double
}
object PostgresType {
  
  inline def apply[T](from: js.Array[Double], parse: Any => T, serialize: T => Any, to: Double): PostgresType[T] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction1(serialize), to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostgresType[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostgresType[?], T] (val x: Self & PostgresType[T]) extends AnyVal {
    
    inline def setFrom(value: js.Array[Double]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromVarargs(value: Double*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setParse(value: Any => T): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setSerialize(value: T => Any): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
