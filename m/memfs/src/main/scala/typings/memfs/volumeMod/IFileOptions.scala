package typings.memfs.volumeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileOptions
  extends StObject
     with IOptions {
  
  var flag: js.UndefOr[TFlags] = js.undefined
  
  var mode: js.UndefOr[TMode] = js.undefined
}
object IFileOptions {
  
  inline def apply(): IFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileOptions]
  }
  
  extension [Self <: IFileOptions](x: Self) {
    
    inline def setFlag(value: TFlags): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    inline def setMode(value: TMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
