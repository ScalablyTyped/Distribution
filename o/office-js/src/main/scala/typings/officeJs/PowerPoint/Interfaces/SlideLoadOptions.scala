package typings.officeJs.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single slide of a presentation.
  *
  * @remarks
  * [Api set: PowerPointApi 1.2]
  */
trait SlideLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the unique ID of the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.2]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the layout of the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  var layout: js.UndefOr[SlideLayoutLoadOptions] = js.undefined
  
  /**
    * Gets the `SlideMaster` object that represents the slide's default content.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  var slideMaster: js.UndefOr[SlideMasterLoadOptions] = js.undefined
}
object SlideLoadOptions {
  
  inline def apply(): SlideLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideLoadOptions]
  }
  
  extension [Self <: SlideLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLayout(value: SlideLayoutLoadOptions): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setSlideMaster(value: SlideMasterLoadOptions): Self = StObject.set(x, "slideMaster", value.asInstanceOf[js.Any])
    
    inline def setSlideMasterUndefined: Self = StObject.set(x, "slideMaster", js.undefined)
  }
}
