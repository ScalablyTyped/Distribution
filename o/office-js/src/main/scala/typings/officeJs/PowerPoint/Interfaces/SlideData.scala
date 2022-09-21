package typings.officeJs.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `slide.toJSON()`. */
trait SlideData extends StObject {
  
  /**
    * Gets the unique ID of the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.2]
    */
  var id: js.UndefOr[String] = js.undefined
}
object SlideData {
  
  inline def apply(): SlideData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideData]
  }
  
  extension [Self <: SlideData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
