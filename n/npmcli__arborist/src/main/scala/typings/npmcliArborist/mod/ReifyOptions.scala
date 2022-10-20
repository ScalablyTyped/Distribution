package typings.npmcliArborist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReifyOptions
  extends StObject
     with BuildIdealTreeOptions {
  
  var omit: js.UndefOr[js.Array[SaveType]] = js.undefined
  
  var save: js.UndefOr[Boolean] = js.undefined
}
object ReifyOptions {
  
  inline def apply(): ReifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReifyOptions]
  }
  
  extension [Self <: ReifyOptions](x: Self) {
    
    inline def setOmit(value: js.Array[SaveType]): Self = StObject.set(x, "omit", value.asInstanceOf[js.Any])
    
    inline def setOmitUndefined: Self = StObject.set(x, "omit", js.undefined)
    
    inline def setOmitVarargs(value: SaveType*): Self = StObject.set(x, "omit", js.Array(value*))
    
    inline def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
  }
}
