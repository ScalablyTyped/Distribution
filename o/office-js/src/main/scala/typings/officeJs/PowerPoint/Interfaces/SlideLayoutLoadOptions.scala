package typings.officeJs.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the layout of a slide.
  *
  * @remarks
  * [Api set: PowerPointApi 1.3]
  */
trait SlideLayoutLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the unique ID of the slide layout.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the name of the slide layout.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  var name: js.UndefOr[Boolean] = js.undefined
}
object SlideLayoutLoadOptions {
  
  inline def apply(): SlideLayoutLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideLayoutLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlideLayoutLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
