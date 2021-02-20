package typings.nwJs.mod.global.NWJSHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for nw.Window.get().print().
  */
@js.native
trait PrintOption extends StObject {
  
  /**
    * Whether to enable header and footer
    */
  var headerFooterEnabled: Boolean = js.native
  
  /**
    * Whether to use landscape or portrait
    */
  var landscape: Boolean = js.native
  
  /**
    * The paper size spec
    * example: 'mediaSize':{'name': 'CUSTOM', 'width_microns': 279400, 'height_microns': 215900, 'custom_display_name':'Letter', 'is_default': true}
    */
  var mediaSize: js.Any = js.native
  
  /**
    * The path of the output PDF when printing to PDF
    */
  var pdf_path: String = js.native
  
  /**
    * The device name of the printer
    */
  var printer: String = js.native
  
  /**
    * Whether to print CSS backgrounds
    */
  var shouldPrintBackgrounds: Boolean = js.native
}
object PrintOption {
  
  @scala.inline
  def apply(
    headerFooterEnabled: Boolean,
    landscape: Boolean,
    mediaSize: js.Any,
    pdf_path: String,
    printer: String,
    shouldPrintBackgrounds: Boolean
  ): PrintOption = {
    val __obj = js.Dynamic.literal(headerFooterEnabled = headerFooterEnabled.asInstanceOf[js.Any], landscape = landscape.asInstanceOf[js.Any], mediaSize = mediaSize.asInstanceOf[js.Any], pdf_path = pdf_path.asInstanceOf[js.Any], printer = printer.asInstanceOf[js.Any], shouldPrintBackgrounds = shouldPrintBackgrounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintOption]
  }
  
  @scala.inline
  implicit class PrintOptionMutableBuilder[Self <: PrintOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaderFooterEnabled(value: Boolean): Self = StObject.set(x, "headerFooterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaSize(value: js.Any): Self = StObject.set(x, "mediaSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdf_path(value: String): Self = StObject.set(x, "pdf_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrinter(value: String): Self = StObject.set(x, "printer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldPrintBackgrounds(value: Boolean): Self = StObject.set(x, "shouldPrintBackgrounds", value.asInstanceOf[js.Any])
  }
}
