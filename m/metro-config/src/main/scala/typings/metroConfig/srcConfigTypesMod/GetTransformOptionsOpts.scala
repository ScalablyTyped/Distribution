package typings.metroConfig.srcConfigTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransformOptionsOpts extends StObject {
  
  var dev: Boolean
  
  var hot: Boolean
  
  var platform: js.UndefOr[String] = js.undefined
}
object GetTransformOptionsOpts {
  
  inline def apply(dev: Boolean, hot: Boolean): GetTransformOptionsOpts = {
    val __obj = js.Dynamic.literal(dev = dev.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransformOptionsOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTransformOptionsOpts] (val x: Self) extends AnyVal {
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
  }
}
