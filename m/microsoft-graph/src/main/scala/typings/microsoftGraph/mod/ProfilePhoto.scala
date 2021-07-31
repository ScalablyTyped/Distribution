package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilePhoto
  extends StObject
     with Entity {
  
  // The height of the photo. Read-only.
  var height: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The width of the photo. Read-only.
  var width: js.UndefOr[NullableOption[Double]] = js.undefined
}
object ProfilePhoto {
  
  @scala.inline
  def apply(): ProfilePhoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfilePhoto]
  }
  
  @scala.inline
  implicit class ProfilePhotoMutableBuilder[Self <: ProfilePhoto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: NullableOption[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightNull: Self = StObject.set(x, "height", null)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: NullableOption[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthNull: Self = StObject.set(x, "width", null)
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
