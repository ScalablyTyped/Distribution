package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 'Properties' object passed into the WL.ui method when 'name' is set to
  * 'skydrivepicker'.
  */
trait ISkyDrivePickerProperies
  extends StObject
     with IUIProperties {
  
  /**
    * Defines the color pallette used for the file picker dialog box. Valid
    * values are "white", "gray", and "transparent".
    * @default "white"
    */
  var lightbox: js.UndefOr[String] = js.undefined
  
  /**
    * The type of SkyDrive file picker button to display. Specify "save" to
    * display the upload button. Specify "open" to display the download
    * button.
    */
  var mode: String
  
  /**
    * Specifies the function to call if the selected files cannot be
    * successfully uploaded or downloaded.
    */
  var onerror: js.UndefOr[js.Function] = js.undefined
  
  /**
    * If the mode property is set to "save", specifies the function to call
    * after the user clicks either Save or Cancel in the file picker. If
    * the mode property is set to "open", specifies the function to call
    * after the user clicks either Open or Cancel in the file picker.
    */
  var onselected: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Required if the mode property is set to "open". Specifies how many
    * files the user can select to download. Specify "single" for a single
    * file. Specify "multi" for multiple files.
    * @default "single"
    */
  var select: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the color pallette used for the file picker button. Valid
    * values are "white" and "blue".
    * @default "white"
    */
  var theme: js.UndefOr[String] = js.undefined
}
object ISkyDrivePickerProperies {
  
  @scala.inline
  def apply(element: String, mode: String, name: String): ISkyDrivePickerProperies = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISkyDrivePickerProperies]
  }
  
  @scala.inline
  implicit class ISkyDrivePickerProperiesMutableBuilder[Self <: ISkyDrivePickerProperies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLightbox(value: String): Self = StObject.set(x, "lightbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightboxUndefined: Self = StObject.set(x, "lightbox", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnerror(value: js.Function): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    @scala.inline
    def setOnselected(value: js.Function): Self = StObject.set(x, "onselected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnselectedUndefined: Self = StObject.set(x, "onselected", js.undefined)
    
    @scala.inline
    def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
