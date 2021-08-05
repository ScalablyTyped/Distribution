package typings.pgPromise.mod

import typings.pgPromise.pgPromiseStrings.after
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQueryFileOptions extends StObject {
  
  var compress: js.UndefOr[Boolean] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var minify: js.UndefOr[Boolean | after] = js.undefined
  
  var noWarnings: js.UndefOr[Boolean] = js.undefined
  
  var params: js.UndefOr[js.Any] = js.undefined
}
object IQueryFileOptions {
  
  inline def apply(): IQueryFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryFileOptions]
  }
  
  extension [Self <: IQueryFileOptions](x: Self) {
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setMinify(value: Boolean | after): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
    
    inline def setNoWarnings(value: Boolean): Self = StObject.set(x, "noWarnings", value.asInstanceOf[js.Any])
    
    inline def setNoWarningsUndefined: Self = StObject.set(x, "noWarnings", js.undefined)
    
    inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
