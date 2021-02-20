package typings.pgPromise.mod

import typings.pgPromise.pgPromiseStrings.after
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQueryFileOptions extends StObject {
  
  var compress: js.UndefOr[Boolean] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var minify: js.UndefOr[Boolean | after] = js.native
  
  var noWarnings: js.UndefOr[Boolean] = js.native
  
  var params: js.UndefOr[js.Any] = js.native
}
object IQueryFileOptions {
  
  @scala.inline
  def apply(): IQueryFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryFileOptions]
  }
  
  @scala.inline
  implicit class IQueryFileOptionsMutableBuilder[Self <: IQueryFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setMinify(value: Boolean | after): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
    
    @scala.inline
    def setNoWarnings(value: Boolean): Self = StObject.set(x, "noWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoWarningsUndefined: Self = StObject.set(x, "noWarnings", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
