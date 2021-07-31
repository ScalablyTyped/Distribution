package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 'Properties' object passed into the WL.fileDialog method.
  */
trait IFileDialogProperties extends StObject {
  
  /**
    * The color pallette to use for the file picker. Specify "white",
    * "grey", or "transparent".
    * @default "white"
    */
  var lightbox: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the type of SkyDrive file picker to display. Specify "open"
    * to display the download version of the file picker. Specify "save"
    * to display the upload version of the file picker.
    */
  var mode: String
  
  /**
    * Specify only if the mode property is set to "open". Specifies how
    * many files the user can select to download. Specify "single" for a
    * single file. Specify "multi" for multiple files.
    * @default "single"
    */
  var select: js.UndefOr[String] = js.undefined
}
object IFileDialogProperties {
  
  @scala.inline
  def apply(mode: String): IFileDialogProperties = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDialogProperties]
  }
  
  @scala.inline
  implicit class IFileDialogPropertiesMutableBuilder[Self <: IFileDialogProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLightbox(value: String): Self = StObject.set(x, "lightbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightboxUndefined: Self = StObject.set(x, "lightbox", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
