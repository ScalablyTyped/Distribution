package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeDimensions extends StObject {
  
  /** The height of the creative in pixels. */
  var height: js.UndefOr[String] = js.undefined
  
  /** The width of the creative in pixels. */
  var width: js.UndefOr[String] = js.undefined
}
object CreativeDimensions {
  
  inline def apply(): CreativeDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeDimensions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreativeDimensions] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
