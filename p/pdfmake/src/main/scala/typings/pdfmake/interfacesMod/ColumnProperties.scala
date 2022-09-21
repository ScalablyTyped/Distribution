package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnProperties extends StObject {
  
  /**
    * Column width.
    *
    * Defaults to `*`.
    */
  var width: js.UndefOr[Size] = js.undefined
}
object ColumnProperties {
  
  inline def apply(): ColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnProperties]
  }
  
  extension [Self <: ColumnProperties](x: Self) {
    
    inline def setWidth(value: Size): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
