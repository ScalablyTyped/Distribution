package typings.memfs.libVolumeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRmOptions extends StObject {
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  var retryDelay: js.UndefOr[Double] = js.undefined
}
object IRmOptions {
  
  inline def apply(): IRmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRmOptions]
  }
  
  extension [Self <: IRmOptions](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
    
    inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
  }
}
