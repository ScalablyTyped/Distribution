package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to the properties for Office theme colors.
  *
  * Using Office theme colors lets you coordinate the color scheme of your add-in with the current Office theme selected by the user with File \> 
  * Office Account \> Office Theme UI, which is applied across all Office host applications. Using Office theme colors is appropriate for mail and 
  * task pane add-ins.
  * 
  * @remarks
  * 
  * **Hosts**: Excel, Outlook (in preview), PowerPoint, Word
  * 
  * `OfficeTheme` is only supported in Office on Windows.
  */
@js.native
trait OfficeTheme extends js.Object {
  
  /**
    * Gets the Office theme body background color as a hexadecimal color triplet (e.g., "FFA500").
    */
  var bodyBackgroundColor: String = js.native
  
  /**
    * Gets the Office theme body foreground color as a hexadecimal color triplet (e.g., "FFA500").
    */
  var bodyForegroundColor: String = js.native
  
  /**
    * Gets the Office theme control background color as a hexadecimal color triplet (e.g., "FFA500").
    */
  var controlBackgroundColor: String = js.native
  
  /**
    * Gets the Office theme control foreground color as a hexadecimal color triplet (e.g., "FFA500").
    */
  var controlForegroundColor: String = js.native
}
object OfficeTheme {
  
  @scala.inline
  def apply(
    bodyBackgroundColor: String,
    bodyForegroundColor: String,
    controlBackgroundColor: String,
    controlForegroundColor: String
  ): OfficeTheme = {
    val __obj = js.Dynamic.literal(bodyBackgroundColor = bodyBackgroundColor.asInstanceOf[js.Any], bodyForegroundColor = bodyForegroundColor.asInstanceOf[js.Any], controlBackgroundColor = controlBackgroundColor.asInstanceOf[js.Any], controlForegroundColor = controlForegroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfficeTheme]
  }
  
  @scala.inline
  implicit class OfficeThemeOps[Self <: OfficeTheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBodyBackgroundColor(value: String): Self = this.set("bodyBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyForegroundColor(value: String): Self = this.set("bodyForegroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlBackgroundColor(value: String): Self = this.set("controlBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlForegroundColor(value: String): Self = this.set("controlForegroundColor", value.asInstanceOf[js.Any])
  }
}
