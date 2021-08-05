package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.withViewportMod.IViewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewport extends StObject {
  
  var viewport: js.UndefOr[IViewport] = js.undefined
}
object Viewport {
  
  inline def apply(): Viewport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Viewport]
  }
  
  extension [Self <: Viewport](x: Self) {
    
    inline def setViewport(value: IViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
