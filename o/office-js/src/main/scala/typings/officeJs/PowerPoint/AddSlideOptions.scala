package typings.officeJs.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the available options when adding a new slide.
  *
  * @remarks
  * [Api set: PowerPointApi 1.3]
  */
trait AddSlideOptions extends StObject {
  
  /**
    * Specifies the ID of a Slide Layout to be used for the new slide.
    If no `layoutId` is provided, but a `slideMasterId` is provided, then the ID of the first layout from the specified Slide Master will be used.
    If no `slideMasterId` is provided, but a `layoutId` is provided, then the specified layout needs to be available for the default Slide Master (as specified
    in the `slideMasterId` description). Otherwise, an error will be thrown.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  var layoutId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the ID of a Slide Master to be used for the new slide.
    If no `slideMasterId` is provided, then the previous slide's Slide Master will be used.
    If there is no previous slide, then the presentation's first Slide Master will be used.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  var slideMasterId: js.UndefOr[String] = js.undefined
}
object AddSlideOptions {
  
  inline def apply(): AddSlideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSlideOptions]
  }
  
  extension [Self <: AddSlideOptions](x: Self) {
    
    inline def setLayoutId(value: String): Self = StObject.set(x, "layoutId", value.asInstanceOf[js.Any])
    
    inline def setLayoutIdUndefined: Self = StObject.set(x, "layoutId", js.undefined)
    
    inline def setSlideMasterId(value: String): Self = StObject.set(x, "slideMasterId", value.asInstanceOf[js.Any])
    
    inline def setSlideMasterIdUndefined: Self = StObject.set(x, "slideMasterId", js.undefined)
  }
}
