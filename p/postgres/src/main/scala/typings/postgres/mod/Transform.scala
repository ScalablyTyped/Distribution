package typings.postgres.mod

import typings.postgres.anon.From
import typings.postgres.anon.FromTo
import typings.postgres.anon.To
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transform extends StObject {
  
  var column: From
  
  var row: FromTo
  
  /** Transforms outcoming undefined values */
  var undefined: Any
  
  var value: To
}
object Transform {
  
  inline def apply(column: From, row: FromTo, undefined: Any, value: To): Transform = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: From): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setRow(value: FromTo): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setUndefined(value: Any): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
    
    inline def setValue(value: To): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
