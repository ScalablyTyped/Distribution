package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnGap extends StObject {
  
  var columnGap: Unit
  
  var rowGap: Unit
}
object ColumnGap {
  
  inline def apply(columnGap: Unit, rowGap: Unit): ColumnGap = {
    val __obj = js.Dynamic.literal(columnGap = columnGap.asInstanceOf[js.Any], rowGap = rowGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGap]
  }
  
  extension [Self <: ColumnGap](x: Self) {
    
    inline def setColumnGap(value: Unit): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
    
    inline def setRowGap(value: Unit): Self = StObject.set(x, "rowGap", value.asInstanceOf[js.Any])
  }
}
