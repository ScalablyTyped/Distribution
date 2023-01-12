package typings.microsoftteams.microsoftTeams.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  All properties in ImageProps are optional and have default values in the platform
  */
// tslint:disable-next-line:interface-name
trait ImageProps extends StObject {
  
  /**
    * Optional; indicate if user is allowed to move between front and back camera
    * Default value is true
    */
  var cameraSwitcher: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional; indicate if image filtering mode is enabled on the selected image
    * Default value is false
    */
  var enableFilter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional; indicate if inking on the selected Image is allowed or not
    * Default value is true
    */
  var ink: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional; Lets the developer specify the image source, more than one can be specified.
    * Default value is both camera and gallery
    */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
  
  /**
    * Optional; Specify in which mode the camera will be opened.
    * Default value is Photo
    */
  var startMode: js.UndefOr[CameraStartMode] = js.undefined
  
  /**
    * Optional; indicate if putting text stickers on the selected Image is allowed or not
    * Default value is true
    */
  var textSticker: js.UndefOr[Boolean] = js.undefined
}
object ImageProps {
  
  inline def apply(): ImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageProps] (val x: Self) extends AnyVal {
    
    inline def setCameraSwitcher(value: Boolean): Self = StObject.set(x, "cameraSwitcher", value.asInstanceOf[js.Any])
    
    inline def setCameraSwitcherUndefined: Self = StObject.set(x, "cameraSwitcher", js.undefined)
    
    inline def setEnableFilter(value: Boolean): Self = StObject.set(x, "enableFilter", value.asInstanceOf[js.Any])
    
    inline def setEnableFilterUndefined: Self = StObject.set(x, "enableFilter", js.undefined)
    
    inline def setInk(value: Boolean): Self = StObject.set(x, "ink", value.asInstanceOf[js.Any])
    
    inline def setInkUndefined: Self = StObject.set(x, "ink", js.undefined)
    
    inline def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setStartMode(value: CameraStartMode): Self = StObject.set(x, "startMode", value.asInstanceOf[js.Any])
    
    inline def setStartModeUndefined: Self = StObject.set(x, "startMode", js.undefined)
    
    inline def setTextSticker(value: Boolean): Self = StObject.set(x, "textSticker", value.asInstanceOf[js.Any])
    
    inline def setTextStickerUndefined: Self = StObject.set(x, "textSticker", js.undefined)
  }
}
