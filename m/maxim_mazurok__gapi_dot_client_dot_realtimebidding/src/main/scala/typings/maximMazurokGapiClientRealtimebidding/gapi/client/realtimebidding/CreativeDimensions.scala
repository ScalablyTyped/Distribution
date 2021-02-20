package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeDimensions extends StObject {
  
  /** The height of the creative in pixels. */
  var height: js.UndefOr[String] = js.native
  
  /** The width of the creative in pixels. */
  var width: js.UndefOr[String] = js.native
}
object CreativeDimensions {
  
  @scala.inline
  def apply(): CreativeDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeDimensions]
  }
  
  @scala.inline
  implicit class CreativeDimensionsMutableBuilder[Self <: CreativeDimensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
