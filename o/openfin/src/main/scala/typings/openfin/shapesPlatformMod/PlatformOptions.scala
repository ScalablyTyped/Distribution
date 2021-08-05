package typings.openfin.shapesPlatformMod

import typings.openfin.applicationOptionMod.ApplicationOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformOptions
  extends StObject
     with ApplicationOption {
  
  @JSName("defaultWindowOptions")
  var defaultWindowOptions_PlatformOptions: js.UndefOr[DefaultWindowOptions] = js.undefined
  
  var disableDefaultCommands: js.UndefOr[Boolean] = js.undefined
}
object PlatformOptions {
  
  inline def apply(uuid: String): PlatformOptions = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformOptions]
  }
  
  extension [Self <: PlatformOptions](x: Self) {
    
    inline def setDefaultWindowOptions(value: DefaultWindowOptions): Self = StObject.set(x, "defaultWindowOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultWindowOptionsUndefined: Self = StObject.set(x, "defaultWindowOptions", js.undefined)
    
    inline def setDisableDefaultCommands(value: Boolean): Self = StObject.set(x, "disableDefaultCommands", value.asInstanceOf[js.Any])
    
    inline def setDisableDefaultCommandsUndefined: Self = StObject.set(x, "disableDefaultCommands", js.undefined)
  }
}
