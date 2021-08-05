package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait OfficeTheme extends StObject {
  
  /**
    * Gets the Office theme body background color as a hexadecimal color triplet (e.g., "FFA500").
    */
  var bodyBackgroundColor: String
  
  /**
    * Gets the Office theme body foreground color as a hexadecimal color triplet (e.g., "FFA500").
    */
  var bodyForegroundColor: String
  
  /**
    * Gets the Office theme control background color as a hexadecimal color triplet (e.g., "FFA500").
    */
  var controlBackgroundColor: String
  
  /**
    * Gets the Office theme control foreground color as a hexadecimal color triplet (e.g., "FFA500").
    */
  var controlForegroundColor: String
}
object OfficeTheme {
  
  inline def apply(
    bodyBackgroundColor: String,
    bodyForegroundColor: String,
    controlBackgroundColor: String,
    controlForegroundColor: String
  ): OfficeTheme = {
    val __obj = js.Dynamic.literal(bodyBackgroundColor = bodyBackgroundColor.asInstanceOf[js.Any], bodyForegroundColor = bodyForegroundColor.asInstanceOf[js.Any], controlBackgroundColor = controlBackgroundColor.asInstanceOf[js.Any], controlForegroundColor = controlForegroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfficeTheme]
  }
  
  extension [Self <: OfficeTheme](x: Self) {
    
    inline def setBodyBackgroundColor(value: String): Self = StObject.set(x, "bodyBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBodyForegroundColor(value: String): Self = StObject.set(x, "bodyForegroundColor", value.asInstanceOf[js.Any])
    
    inline def setControlBackgroundColor(value: String): Self = StObject.set(x, "controlBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setControlForegroundColor(value: String): Self = StObject.set(x, "controlForegroundColor", value.asInstanceOf[js.Any])
  }
}
