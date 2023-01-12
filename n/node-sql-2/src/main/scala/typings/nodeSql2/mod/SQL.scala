package typings.nodeSql2.mod

import typings.nodeSql2.anon.LOWER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SQL extends StObject {
  
  def array[T](arr: js.Array[T]): BinaryNode
  
  var functions: LOWER
}
object SQL {
  
  inline def apply(array: js.Array[Any] => BinaryNode, functions: LOWER): SQL = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction1(array), functions = functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SQL] (val x: Self) extends AnyVal {
    
    inline def setArray(value: js.Array[Any] => BinaryNode): Self = StObject.set(x, "array", js.Any.fromFunction1(value))
    
    inline def setFunctions(value: LOWER): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
  }
}
