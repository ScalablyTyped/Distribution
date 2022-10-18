package typings.officeJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cells extends StObject {
  
  var cells: Any
  
  var format: Any
}
object Cells {
  
  inline def apply(cells: Any, format: Any): Cells = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cells]
  }
  
  extension [Self <: Cells](x: Self) {
    
    inline def setCells(value: Any): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
