package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrinterDefaults extends StObject {
  
  // The default color mode to use when printing the document. Valid values are described in the following table.
  var colorMode: js.UndefOr[NullableOption[PrintColorMode]] = js.undefined
  
  // The default content (MIME) type to use when processing documents.
  var contentType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The default number of copies printed per job.
  var copiesPerJob: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The default resolution in DPI to use when printing the job.
  var dpi: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * The default duplex (double-sided) configuration to use when printing a document. Valid values are described in the
    * following table.
    */
  var duplexMode: js.UndefOr[NullableOption[PrintDuplexMode]] = js.undefined
  
  // The default set of finishings to apply to print jobs. Valid values are described in the following table.
  var finishings: js.UndefOr[NullableOption[js.Array[PrintFinishing]]] = js.undefined
  
  /**
    * The default fitPdfToPage setting. True to fit each page of a PDF document to a physical sheet of media; false to let
    * the printer decide how to lay out impressions.
    */
  var fitPdfToPage: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var inputBin: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The default media (such as paper) color to print the document on.
  var mediaColor: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The default media size to use. Supports standard size names for ISO and ANSI media sizes. Valid values are listed in
    * the printerCapabilities topic.
    */
  var mediaSize: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The default media (such as paper) type to print the document on.
  var mediaType: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The default direction to lay out pages when multiple pages are being printed per sheet. Valid values are described in
    * the following table.
    */
  var multipageLayout: js.UndefOr[NullableOption[PrintMultipageLayout]] = js.undefined
  
  // The default orientation to use when printing the document. Valid values are described in the following table.
  var orientation: js.UndefOr[NullableOption[PrintOrientation]] = js.undefined
  
  /**
    * The default output bin to place completed prints into. See the printer's capabilities for a list of supported output
    * bins.
    */
  var outputBin: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The default number of document pages to print on each sheet.
  var pagesPerSheet: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The default quality to use when printing the document. Valid values are described in the following table.
  var quality: js.UndefOr[NullableOption[PrintQuality]] = js.undefined
  
  /**
    * Specifies how the printer scales the document data to fit the requested media. Valid values are described in the
    * following table.
    */
  var scaling: js.UndefOr[NullableOption[PrintScaling]] = js.undefined
}
object PrinterDefaults {
  
  inline def apply(): PrinterDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterDefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrinterDefaults] (val x: Self) extends AnyVal {
    
    inline def setColorMode(value: NullableOption[PrintColorMode]): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
    
    inline def setColorModeNull: Self = StObject.set(x, "colorMode", null)
    
    inline def setColorModeUndefined: Self = StObject.set(x, "colorMode", js.undefined)
    
    inline def setContentType(value: NullableOption[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCopiesPerJob(value: NullableOption[Double]): Self = StObject.set(x, "copiesPerJob", value.asInstanceOf[js.Any])
    
    inline def setCopiesPerJobNull: Self = StObject.set(x, "copiesPerJob", null)
    
    inline def setCopiesPerJobUndefined: Self = StObject.set(x, "copiesPerJob", js.undefined)
    
    inline def setDpi(value: NullableOption[Double]): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
    
    inline def setDpiNull: Self = StObject.set(x, "dpi", null)
    
    inline def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
    
    inline def setDuplexMode(value: NullableOption[PrintDuplexMode]): Self = StObject.set(x, "duplexMode", value.asInstanceOf[js.Any])
    
    inline def setDuplexModeNull: Self = StObject.set(x, "duplexMode", null)
    
    inline def setDuplexModeUndefined: Self = StObject.set(x, "duplexMode", js.undefined)
    
    inline def setFinishings(value: NullableOption[js.Array[PrintFinishing]]): Self = StObject.set(x, "finishings", value.asInstanceOf[js.Any])
    
    inline def setFinishingsNull: Self = StObject.set(x, "finishings", null)
    
    inline def setFinishingsUndefined: Self = StObject.set(x, "finishings", js.undefined)
    
    inline def setFinishingsVarargs(value: PrintFinishing*): Self = StObject.set(x, "finishings", js.Array(value*))
    
    inline def setFitPdfToPage(value: NullableOption[Boolean]): Self = StObject.set(x, "fitPdfToPage", value.asInstanceOf[js.Any])
    
    inline def setFitPdfToPageNull: Self = StObject.set(x, "fitPdfToPage", null)
    
    inline def setFitPdfToPageUndefined: Self = StObject.set(x, "fitPdfToPage", js.undefined)
    
    inline def setInputBin(value: NullableOption[String]): Self = StObject.set(x, "inputBin", value.asInstanceOf[js.Any])
    
    inline def setInputBinNull: Self = StObject.set(x, "inputBin", null)
    
    inline def setInputBinUndefined: Self = StObject.set(x, "inputBin", js.undefined)
    
    inline def setMediaColor(value: NullableOption[String]): Self = StObject.set(x, "mediaColor", value.asInstanceOf[js.Any])
    
    inline def setMediaColorNull: Self = StObject.set(x, "mediaColor", null)
    
    inline def setMediaColorUndefined: Self = StObject.set(x, "mediaColor", js.undefined)
    
    inline def setMediaSize(value: NullableOption[String]): Self = StObject.set(x, "mediaSize", value.asInstanceOf[js.Any])
    
    inline def setMediaSizeNull: Self = StObject.set(x, "mediaSize", null)
    
    inline def setMediaSizeUndefined: Self = StObject.set(x, "mediaSize", js.undefined)
    
    inline def setMediaType(value: NullableOption[String]): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeNull: Self = StObject.set(x, "mediaType", null)
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
    
    inline def setMultipageLayout(value: NullableOption[PrintMultipageLayout]): Self = StObject.set(x, "multipageLayout", value.asInstanceOf[js.Any])
    
    inline def setMultipageLayoutNull: Self = StObject.set(x, "multipageLayout", null)
    
    inline def setMultipageLayoutUndefined: Self = StObject.set(x, "multipageLayout", js.undefined)
    
    inline def setOrientation(value: NullableOption[PrintOrientation]): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationNull: Self = StObject.set(x, "orientation", null)
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setOutputBin(value: NullableOption[String]): Self = StObject.set(x, "outputBin", value.asInstanceOf[js.Any])
    
    inline def setOutputBinNull: Self = StObject.set(x, "outputBin", null)
    
    inline def setOutputBinUndefined: Self = StObject.set(x, "outputBin", js.undefined)
    
    inline def setPagesPerSheet(value: NullableOption[Double]): Self = StObject.set(x, "pagesPerSheet", value.asInstanceOf[js.Any])
    
    inline def setPagesPerSheetNull: Self = StObject.set(x, "pagesPerSheet", null)
    
    inline def setPagesPerSheetUndefined: Self = StObject.set(x, "pagesPerSheet", js.undefined)
    
    inline def setQuality(value: NullableOption[PrintQuality]): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityNull: Self = StObject.set(x, "quality", null)
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setScaling(value: NullableOption[PrintScaling]): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
    
    inline def setScalingNull: Self = StObject.set(x, "scaling", null)
    
    inline def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
  }
}
