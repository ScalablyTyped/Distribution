package typings.openfin.shapesPlatformMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitPlatformOptions extends StObject {
  
  def overrideCallback(arg: PlatformProvider): js.Any
  @JSName("overrideCallback")
  var overrideCallback_Original: OverrideCallback[js.Any]
}
object InitPlatformOptions {
  
  inline def apply(overrideCallback: /* arg */ PlatformProvider => js.Any): InitPlatformOptions = {
    val __obj = js.Dynamic.literal(overrideCallback = js.Any.fromFunction1(overrideCallback))
    __obj.asInstanceOf[InitPlatformOptions]
  }
  
  extension [Self <: InitPlatformOptions](x: Self) {
    
    inline def setOverrideCallback(value: /* arg */ PlatformProvider => js.Any): Self = StObject.set(x, "overrideCallback", js.Any.fromFunction1(value))
  }
}
