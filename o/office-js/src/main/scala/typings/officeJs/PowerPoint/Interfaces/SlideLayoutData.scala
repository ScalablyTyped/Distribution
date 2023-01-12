package typings.officeJs.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `slideLayout.toJSON()`. */
trait SlideLayoutData extends StObject {
  
  /**
    * Gets the unique ID of the slide layout.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the name of the slide layout.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  var name: js.UndefOr[String] = js.undefined
}
object SlideLayoutData {
  
  inline def apply(): SlideLayoutData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideLayoutData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlideLayoutData] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
