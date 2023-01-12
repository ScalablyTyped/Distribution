package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintJobConfiguration extends StObject {
  
  // Whether the printer should collate pages wehen printing multiple copies of a multi-page document.
  var collate: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The color mode the printer should use to print the job. Valid values are described in the table below. Read-only.
  var colorMode: js.UndefOr[NullableOption[PrintColorMode]] = js.undefined
  
  // The number of copies that should be printed. Read-only.
  var copies: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The resolution to use when printing the job, expressed in dots per inch (DPI). Read-only.
  var dpi: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The duplex mode the printer should use when printing the job. Valid values are described in the table below. Read-only.
  var duplexMode: js.UndefOr[NullableOption[PrintDuplexMode]] = js.undefined
  
  /**
    * The orientation to use when feeding media into the printer. Valid values are described in the following table.
    * Read-only.
    */
  var feedOrientation: js.UndefOr[NullableOption[PrinterFeedOrientation]] = js.undefined
  
  // Finishing processes to use when printing.
  var finishings: js.UndefOr[NullableOption[js.Array[PrintFinishing]]] = js.undefined
  
  var fitPdfToPage: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The input bin (tray) to use when printing. See the printer's capabilities for a list of supported input bins.
  var inputBin: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The margin settings to use when printing.
  var margin: js.UndefOr[NullableOption[PrintMargin]] = js.undefined
  
  /**
    * The media size to use when printing. Supports standard size names for ISO and ANSI media sizes. Valid values listed in
    * the printerCapabilities topic.
    */
  var mediaSize: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The default media (such as paper) type to print the document on.
  var mediaType: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The direction to lay out pages when multiple pages are being printed per sheet. Valid values are described in the
    * following table.
    */
  var multipageLayout: js.UndefOr[NullableOption[PrintMultipageLayout]] = js.undefined
  
  /**
    * The orientation setting the printer should use when printing the job. Valid values are described in the following
    * table.
    */
  var orientation: js.UndefOr[NullableOption[PrintOrientation]] = js.undefined
  
  // The output bin to place completed prints into. See the printer's capabilities for a list of supported output bins.
  var outputBin: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The page ranges to print. Read-only.
  var pageRanges: js.UndefOr[NullableOption[js.Array[IntegerRange]]] = js.undefined
  
  // The number of document pages to print on each sheet.
  var pagesPerSheet: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The print quality to use when printing the job. Valid values are described in the table below. Read-only.
  var quality: js.UndefOr[NullableOption[PrintQuality]] = js.undefined
  
  /**
    * Specifies how the printer should scale the document data to fit the requested media. Valid values are described in the
    * following table.
    */
  var scaling: js.UndefOr[NullableOption[PrintScaling]] = js.undefined
}
object PrintJobConfiguration {
  
  inline def apply(): PrintJobConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintJobConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintJobConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCollate(value: NullableOption[Boolean]): Self = StObject.set(x, "collate", value.asInstanceOf[js.Any])
    
    inline def setCollateNull: Self = StObject.set(x, "collate", null)
    
    inline def setCollateUndefined: Self = StObject.set(x, "collate", js.undefined)
    
    inline def setColorMode(value: NullableOption[PrintColorMode]): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
    
    inline def setColorModeNull: Self = StObject.set(x, "colorMode", null)
    
    inline def setColorModeUndefined: Self = StObject.set(x, "colorMode", js.undefined)
    
    inline def setCopies(value: NullableOption[Double]): Self = StObject.set(x, "copies", value.asInstanceOf[js.Any])
    
    inline def setCopiesNull: Self = StObject.set(x, "copies", null)
    
    inline def setCopiesUndefined: Self = StObject.set(x, "copies", js.undefined)
    
    inline def setDpi(value: NullableOption[Double]): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
    
    inline def setDpiNull: Self = StObject.set(x, "dpi", null)
    
    inline def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
    
    inline def setDuplexMode(value: NullableOption[PrintDuplexMode]): Self = StObject.set(x, "duplexMode", value.asInstanceOf[js.Any])
    
    inline def setDuplexModeNull: Self = StObject.set(x, "duplexMode", null)
    
    inline def setDuplexModeUndefined: Self = StObject.set(x, "duplexMode", js.undefined)
    
    inline def setFeedOrientation(value: NullableOption[PrinterFeedOrientation]): Self = StObject.set(x, "feedOrientation", value.asInstanceOf[js.Any])
    
    inline def setFeedOrientationNull: Self = StObject.set(x, "feedOrientation", null)
    
    inline def setFeedOrientationUndefined: Self = StObject.set(x, "feedOrientation", js.undefined)
    
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
    
    inline def setMargin(value: NullableOption[PrintMargin]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginNull: Self = StObject.set(x, "margin", null)
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
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
    
    inline def setPageRanges(value: NullableOption[js.Array[IntegerRange]]): Self = StObject.set(x, "pageRanges", value.asInstanceOf[js.Any])
    
    inline def setPageRangesNull: Self = StObject.set(x, "pageRanges", null)
    
    inline def setPageRangesUndefined: Self = StObject.set(x, "pageRanges", js.undefined)
    
    inline def setPageRangesVarargs(value: IntegerRange*): Self = StObject.set(x, "pageRanges", js.Array(value*))
    
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
