package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentTypeOrder extends StObject {
  
  // Whether this is the default Content Type
  var default: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Specifies the position in which the Content Type appears in the selection UI.
  var position: js.UndefOr[NullableOption[Double]] = js.undefined
}
object ContentTypeOrder {
  
  @scala.inline
  def apply(): ContentTypeOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentTypeOrder]
  }
  
  @scala.inline
  implicit class ContentTypeOrderMutableBuilder[Self <: ContentTypeOrder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: NullableOption[Boolean]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNull: Self = StObject.set(x, "default", null)
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setPosition(value: NullableOption[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionNull: Self = StObject.set(x, "position", null)
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
