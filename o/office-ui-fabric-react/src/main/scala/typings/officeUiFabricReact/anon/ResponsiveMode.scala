package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsiveMode extends StObject {
  
  var responsiveMode: js.UndefOr[
    typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
  ] = js.undefined
}
object ResponsiveMode {
  
  inline def apply(): ResponsiveMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsiveMode] (val x: Self) extends AnyVal {
    
    inline def setResponsiveMode(value: typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode): Self = StObject.set(x, "responsiveMode", value.asInstanceOf[js.Any])
    
    inline def setResponsiveModeUndefined: Self = StObject.set(x, "responsiveMode", js.undefined)
  }
}
