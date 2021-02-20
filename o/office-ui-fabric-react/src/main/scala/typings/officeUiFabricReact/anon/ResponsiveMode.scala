package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsiveMode extends StObject {
  
  var responsiveMode: js.UndefOr[typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode] = js.native
}
object ResponsiveMode {
  
  @scala.inline
  def apply(): ResponsiveMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveMode]
  }
  
  @scala.inline
  implicit class ResponsiveModeMutableBuilder[Self <: ResponsiveMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponsiveMode(value: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode): Self = StObject.set(x, "responsiveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveModeUndefined: Self = StObject.set(x, "responsiveMode", js.undefined)
  }
}
