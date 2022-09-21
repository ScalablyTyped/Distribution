package typings.nodeDownloaderHelper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideOptions extends StObject {
  
  var skip: js.UndefOr[Boolean] = js.undefined
  
  var skipSmaller: js.UndefOr[Boolean] = js.undefined
}
object OverrideOptions {
  
  inline def apply(): OverrideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverrideOptions]
  }
  
  extension [Self <: OverrideOptions](x: Self) {
    
    inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipSmaller(value: Boolean): Self = StObject.set(x, "skipSmaller", value.asInstanceOf[js.Any])
    
    inline def setSkipSmallerUndefined: Self = StObject.set(x, "skipSmaller", js.undefined)
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
  }
}
