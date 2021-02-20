package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedObjectBorder extends StObject {
  
  /** The color of the border. */
  var color: js.UndefOr[OptionalColor] = js.native
  
  /** The dash style of the border. */
  var dashStyle: js.UndefOr[String] = js.native
  
  /** The property state of the border property. */
  var propertyState: js.UndefOr[String] = js.native
  
  /** The width of the border. */
  var width: js.UndefOr[Dimension] = js.native
}
object EmbeddedObjectBorder {
  
  @scala.inline
  def apply(): EmbeddedObjectBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedObjectBorder]
  }
  
  @scala.inline
  implicit class EmbeddedObjectBorderMutableBuilder[Self <: EmbeddedObjectBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: OptionalColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
    
    @scala.inline
    def setWidth(value: Dimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
