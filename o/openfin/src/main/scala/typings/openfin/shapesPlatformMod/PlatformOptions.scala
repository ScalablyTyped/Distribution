package typings.openfin.shapesPlatformMod

import typings.openfin.applicationOptionMod.ApplicationOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformOptions extends ApplicationOption {
  
  @JSName("defaultWindowOptions")
  var defaultWindowOptions_PlatformOptions: js.UndefOr[DefaultWindowOptions] = js.native
  
  var disableDefaultCommands: js.UndefOr[Boolean] = js.native
}
object PlatformOptions {
  
  @scala.inline
  def apply(uuid: String): PlatformOptions = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformOptions]
  }
  
  @scala.inline
  implicit class PlatformOptionsMutableBuilder[Self <: PlatformOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultWindowOptions(value: DefaultWindowOptions): Self = StObject.set(x, "defaultWindowOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultWindowOptionsUndefined: Self = StObject.set(x, "defaultWindowOptions", js.undefined)
    
    @scala.inline
    def setDisableDefaultCommands(value: Boolean): Self = StObject.set(x, "disableDefaultCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDefaultCommandsUndefined: Self = StObject.set(x, "disableDefaultCommands", js.undefined)
  }
}
