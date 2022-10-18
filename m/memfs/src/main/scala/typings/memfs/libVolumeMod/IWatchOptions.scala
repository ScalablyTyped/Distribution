package typings.memfs.libVolumeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWatchOptions
  extends StObject
     with IOptions {
  
  var persistent: js.UndefOr[Boolean] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object IWatchOptions {
  
  inline def apply(): IWatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWatchOptions]
  }
  
  extension [Self <: IWatchOptions](x: Self) {
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
