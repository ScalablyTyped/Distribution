package typings.novaEditorNode.anon

import typings.novaEditorNode.FileLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column
  extends StObject
     with FileLocation {
  
  var column: js.UndefOr[scala.Nothing] = js.undefined
  
  var line: js.UndefOr[Double] = js.undefined
}
object Column {
  
  inline def apply(): Column = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
