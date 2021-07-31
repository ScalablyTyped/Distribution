package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageInfo extends StObject {
  
  /**
    * Optional; parameter used to indicate the server is able to render image dynamically in response to parameterization.
    * For example – a high contrast image
    */
  var addImageQuery: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Optional; alt-text accessible content for the image
  var alternateText: js.UndefOr[NullableOption[String]] = js.undefined
  
  var alternativeText: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Optional; URI that points to an icon which represents the application used to generate the activity
  var iconUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object ImageInfo {
  
  @scala.inline
  def apply(): ImageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageInfo]
  }
  
  @scala.inline
  implicit class ImageInfoMutableBuilder[Self <: ImageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddImageQuery(value: NullableOption[Boolean]): Self = StObject.set(x, "addImageQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddImageQueryNull: Self = StObject.set(x, "addImageQuery", null)
    
    @scala.inline
    def setAddImageQueryUndefined: Self = StObject.set(x, "addImageQuery", js.undefined)
    
    @scala.inline
    def setAlternateText(value: NullableOption[String]): Self = StObject.set(x, "alternateText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateTextNull: Self = StObject.set(x, "alternateText", null)
    
    @scala.inline
    def setAlternateTextUndefined: Self = StObject.set(x, "alternateText", js.undefined)
    
    @scala.inline
    def setAlternativeText(value: NullableOption[String]): Self = StObject.set(x, "alternativeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativeTextNull: Self = StObject.set(x, "alternativeText", null)
    
    @scala.inline
    def setAlternativeTextUndefined: Self = StObject.set(x, "alternativeText", js.undefined)
    
    @scala.inline
    def setIconUrl(value: NullableOption[String]): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrlNull: Self = StObject.set(x, "iconUrl", null)
    
    @scala.inline
    def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
  }
}
