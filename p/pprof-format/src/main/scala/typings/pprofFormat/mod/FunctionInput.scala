package typings.pprofFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionInput extends StObject {
  
  var filename: js.UndefOr[Numeric] = js.undefined
  
  var id: js.UndefOr[Numeric] = js.undefined
  
  var name: js.UndefOr[Numeric] = js.undefined
  
  var startLine: js.UndefOr[Numeric] = js.undefined
  
  var systemName: js.UndefOr[Numeric] = js.undefined
}
object FunctionInput {
  
  inline def apply(): FunctionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionInput]
  }
  
  extension [Self <: FunctionInput](x: Self) {
    
    inline def setFilename(value: Numeric): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setId(value: Numeric): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: Numeric): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStartLine(value: Numeric): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    
    inline def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
    
    inline def setSystemName(value: Numeric): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    inline def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
  }
}
