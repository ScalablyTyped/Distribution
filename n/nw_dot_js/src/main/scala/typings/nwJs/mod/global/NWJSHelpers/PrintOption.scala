package typings.nwJs.mod.global.NWJSHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for nw.Window.get().print().
  */
trait PrintOption extends StObject {
  
  /**
    * Whether to enable header and footer
    */
  var headerFooterEnabled: Boolean
  
  /**
    * Whether to use landscape or portrait
    */
  var landscape: Boolean
  
  /**
    * The paper size spec
    * example: 'mediaSize':{'name': 'CUSTOM', 'width_microns': 279400, 'height_microns': 215900, 'custom_display_name':'Letter', 'is_default': true}
    */
  var mediaSize: Any
  
  /**
    * The path of the output PDF when printing to PDF
    */
  var pdf_path: String
  
  /**
    * The device name of the printer
    */
  var printer: String
  
  /**
    * Whether to print CSS backgrounds
    */
  var shouldPrintBackgrounds: Boolean
}
object PrintOption {
  
  inline def apply(
    headerFooterEnabled: Boolean,
    landscape: Boolean,
    mediaSize: Any,
    pdf_path: String,
    printer: String,
    shouldPrintBackgrounds: Boolean
  ): PrintOption = {
    val __obj = js.Dynamic.literal(headerFooterEnabled = headerFooterEnabled.asInstanceOf[js.Any], landscape = landscape.asInstanceOf[js.Any], mediaSize = mediaSize.asInstanceOf[js.Any], pdf_path = pdf_path.asInstanceOf[js.Any], printer = printer.asInstanceOf[js.Any], shouldPrintBackgrounds = shouldPrintBackgrounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintOption] (val x: Self) extends AnyVal {
    
    inline def setHeaderFooterEnabled(value: Boolean): Self = StObject.set(x, "headerFooterEnabled", value.asInstanceOf[js.Any])
    
    inline def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
    
    inline def setMediaSize(value: Any): Self = StObject.set(x, "mediaSize", value.asInstanceOf[js.Any])
    
    inline def setPdf_path(value: String): Self = StObject.set(x, "pdf_path", value.asInstanceOf[js.Any])
    
    inline def setPrinter(value: String): Self = StObject.set(x, "printer", value.asInstanceOf[js.Any])
    
    inline def setShouldPrintBackgrounds(value: Boolean): Self = StObject.set(x, "shouldPrintBackgrounds", value.asInstanceOf[js.Any])
  }
}
