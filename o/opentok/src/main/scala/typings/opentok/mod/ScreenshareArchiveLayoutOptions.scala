package typings.opentok.mod

import typings.opentok.opentokStrings.bestFit
import typings.opentok.opentokStrings.horizontalPresentation
import typings.opentok.opentokStrings.pip
import typings.opentok.opentokStrings.verticalPresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshareArchiveLayoutOptions
  extends StObject
     with ArchiveLayoutOptions {
  
  var screenshareType: js.UndefOr[bestFit | horizontalPresentation | verticalPresentation | pip] = js.undefined
  
  var `type`: bestFit
}
object ScreenshareArchiveLayoutOptions {
  
  inline def apply(): ScreenshareArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("bestFit")
    __obj.asInstanceOf[ScreenshareArchiveLayoutOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScreenshareArchiveLayoutOptions] (val x: Self) extends AnyVal {
    
    inline def setScreenshareType(value: bestFit | horizontalPresentation | verticalPresentation | pip): Self = StObject.set(x, "screenshareType", value.asInstanceOf[js.Any])
    
    inline def setScreenshareTypeUndefined: Self = StObject.set(x, "screenshareType", js.undefined)
    
    inline def setType(value: bestFit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
