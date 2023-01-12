package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrinterCapabilities extends StObject {
  
  // A list of supported bottom margins(in microns) for the printer.
  var bottomMargins: js.UndefOr[NullableOption[js.Array[Double]]] = js.undefined
  
  // True if the printer supports collating when printing muliple copies of a multi-page document; false otherwise.
  var collation: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The color modes supported by the printer. Valid values are described in the following table.
  var colorModes: js.UndefOr[NullableOption[js.Array[PrintColorMode]]] = js.undefined
  
  /**
    * A list of supported content (MIME) types that the printer supports. It is not guaranteed that the Universal Print
    * service supports printing all of these MIME types.
    */
  var contentTypes: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The range of copies per job supported by the printer.
  var copiesPerJob: js.UndefOr[NullableOption[IntegerRange]] = js.undefined
  
  // The list of print resolutions in DPI that are supported by the printer.
  var dpis: js.UndefOr[NullableOption[js.Array[Double]]] = js.undefined
  
  // The list of duplex modes that are supported by the printer. Valid values are described in the following table.
  var duplexModes: js.UndefOr[NullableOption[js.Array[PrintDuplexMode]]] = js.undefined
  
  // The list of feed orientations that are supported by the printer.
  var feedOrientations: js.UndefOr[NullableOption[js.Array[PrinterFeedOrientation]]] = js.undefined
  
  // Finishing processes the printer supports for a printed document.
  var finishings: js.UndefOr[NullableOption[js.Array[PrintFinishing]]] = js.undefined
  
  // Supported input bins for the printer.
  var inputBins: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // True if color printing is supported by the printer; false otherwise. Read-only.
  var isColorPrintingSupported: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // True if the printer supports printing by page ranges; false otherwise.
  var isPageRangeSupported: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // A list of supported left margins(in microns) for the printer.
  var leftMargins: js.UndefOr[NullableOption[js.Array[Double]]] = js.undefined
  
  // The media (i.e., paper) colors supported by the printer.
  var mediaColors: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * The media sizes supported by the printer. Supports standard size names for ISO and ANSI media sizes. Valid values are
    * in the following table.
    */
  var mediaSizes: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The media types supported by the printer.
  var mediaTypes: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The presentation directions supported by the printer. Supported values are described in the following table.
  var multipageLayouts: js.UndefOr[NullableOption[js.Array[PrintMultipageLayout]]] = js.undefined
  
  // The print orientations supported by the printer. Valid values are described in the following table.
  var orientations: js.UndefOr[NullableOption[js.Array[PrintOrientation]]] = js.undefined
  
  // The printer's supported output bins (trays).
  var outputBins: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // Supported number of Input Pages to impose upon a single Impression.
  var pagesPerSheet: js.UndefOr[NullableOption[js.Array[Double]]] = js.undefined
  
  // The print qualities supported by the printer.
  var qualities: js.UndefOr[NullableOption[js.Array[PrintQuality]]] = js.undefined
  
  // A list of supported right margins(in microns) for the printer.
  var rightMargins: js.UndefOr[NullableOption[js.Array[Double]]] = js.undefined
  
  // Supported print scalings.
  var scalings: js.UndefOr[NullableOption[js.Array[PrintScaling]]] = js.undefined
  
  // True if the printer supports scaling PDF pages to match the print media size; false otherwise.
  var supportsFitPdfToPage: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // A list of supported top margins(in microns) for the printer.
  var topMargins: js.UndefOr[NullableOption[js.Array[Double]]] = js.undefined
}
object PrinterCapabilities {
  
  inline def apply(): PrinterCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrinterCapabilities] (val x: Self) extends AnyVal {
    
    inline def setBottomMargins(value: NullableOption[js.Array[Double]]): Self = StObject.set(x, "bottomMargins", value.asInstanceOf[js.Any])
    
    inline def setBottomMarginsNull: Self = StObject.set(x, "bottomMargins", null)
    
    inline def setBottomMarginsUndefined: Self = StObject.set(x, "bottomMargins", js.undefined)
    
    inline def setBottomMarginsVarargs(value: Double*): Self = StObject.set(x, "bottomMargins", js.Array(value*))
    
    inline def setCollation(value: NullableOption[Boolean]): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationNull: Self = StObject.set(x, "collation", null)
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setColorModes(value: NullableOption[js.Array[PrintColorMode]]): Self = StObject.set(x, "colorModes", value.asInstanceOf[js.Any])
    
    inline def setColorModesNull: Self = StObject.set(x, "colorModes", null)
    
    inline def setColorModesUndefined: Self = StObject.set(x, "colorModes", js.undefined)
    
    inline def setColorModesVarargs(value: PrintColorMode*): Self = StObject.set(x, "colorModes", js.Array(value*))
    
    inline def setContentTypes(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "contentTypes", value.asInstanceOf[js.Any])
    
    inline def setContentTypesNull: Self = StObject.set(x, "contentTypes", null)
    
    inline def setContentTypesUndefined: Self = StObject.set(x, "contentTypes", js.undefined)
    
    inline def setContentTypesVarargs(value: String*): Self = StObject.set(x, "contentTypes", js.Array(value*))
    
    inline def setCopiesPerJob(value: NullableOption[IntegerRange]): Self = StObject.set(x, "copiesPerJob", value.asInstanceOf[js.Any])
    
    inline def setCopiesPerJobNull: Self = StObject.set(x, "copiesPerJob", null)
    
    inline def setCopiesPerJobUndefined: Self = StObject.set(x, "copiesPerJob", js.undefined)
    
    inline def setDpis(value: NullableOption[js.Array[Double]]): Self = StObject.set(x, "dpis", value.asInstanceOf[js.Any])
    
    inline def setDpisNull: Self = StObject.set(x, "dpis", null)
    
    inline def setDpisUndefined: Self = StObject.set(x, "dpis", js.undefined)
    
    inline def setDpisVarargs(value: Double*): Self = StObject.set(x, "dpis", js.Array(value*))
    
    inline def setDuplexModes(value: NullableOption[js.Array[PrintDuplexMode]]): Self = StObject.set(x, "duplexModes", value.asInstanceOf[js.Any])
    
    inline def setDuplexModesNull: Self = StObject.set(x, "duplexModes", null)
    
    inline def setDuplexModesUndefined: Self = StObject.set(x, "duplexModes", js.undefined)
    
    inline def setDuplexModesVarargs(value: PrintDuplexMode*): Self = StObject.set(x, "duplexModes", js.Array(value*))
    
    inline def setFeedOrientations(value: NullableOption[js.Array[PrinterFeedOrientation]]): Self = StObject.set(x, "feedOrientations", value.asInstanceOf[js.Any])
    
    inline def setFeedOrientationsNull: Self = StObject.set(x, "feedOrientations", null)
    
    inline def setFeedOrientationsUndefined: Self = StObject.set(x, "feedOrientations", js.undefined)
    
    inline def setFeedOrientationsVarargs(value: PrinterFeedOrientation*): Self = StObject.set(x, "feedOrientations", js.Array(value*))
    
    inline def setFinishings(value: NullableOption[js.Array[PrintFinishing]]): Self = StObject.set(x, "finishings", value.asInstanceOf[js.Any])
    
    inline def setFinishingsNull: Self = StObject.set(x, "finishings", null)
    
    inline def setFinishingsUndefined: Self = StObject.set(x, "finishings", js.undefined)
    
    inline def setFinishingsVarargs(value: PrintFinishing*): Self = StObject.set(x, "finishings", js.Array(value*))
    
    inline def setInputBins(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "inputBins", value.asInstanceOf[js.Any])
    
    inline def setInputBinsNull: Self = StObject.set(x, "inputBins", null)
    
    inline def setInputBinsUndefined: Self = StObject.set(x, "inputBins", js.undefined)
    
    inline def setInputBinsVarargs(value: String*): Self = StObject.set(x, "inputBins", js.Array(value*))
    
    inline def setIsColorPrintingSupported(value: NullableOption[Boolean]): Self = StObject.set(x, "isColorPrintingSupported", value.asInstanceOf[js.Any])
    
    inline def setIsColorPrintingSupportedNull: Self = StObject.set(x, "isColorPrintingSupported", null)
    
    inline def setIsColorPrintingSupportedUndefined: Self = StObject.set(x, "isColorPrintingSupported", js.undefined)
    
    inline def setIsPageRangeSupported(value: NullableOption[Boolean]): Self = StObject.set(x, "isPageRangeSupported", value.asInstanceOf[js.Any])
    
    inline def setIsPageRangeSupportedNull: Self = StObject.set(x, "isPageRangeSupported", null)
    
    inline def setIsPageRangeSupportedUndefined: Self = StObject.set(x, "isPageRangeSupported", js.undefined)
    
    inline def setLeftMargins(value: NullableOption[js.Array[Double]]): Self = StObject.set(x, "leftMargins", value.asInstanceOf[js.Any])
    
    inline def setLeftMarginsNull: Self = StObject.set(x, "leftMargins", null)
    
    inline def setLeftMarginsUndefined: Self = StObject.set(x, "leftMargins", js.undefined)
    
    inline def setLeftMarginsVarargs(value: Double*): Self = StObject.set(x, "leftMargins", js.Array(value*))
    
    inline def setMediaColors(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "mediaColors", value.asInstanceOf[js.Any])
    
    inline def setMediaColorsNull: Self = StObject.set(x, "mediaColors", null)
    
    inline def setMediaColorsUndefined: Self = StObject.set(x, "mediaColors", js.undefined)
    
    inline def setMediaColorsVarargs(value: String*): Self = StObject.set(x, "mediaColors", js.Array(value*))
    
    inline def setMediaSizes(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "mediaSizes", value.asInstanceOf[js.Any])
    
    inline def setMediaSizesNull: Self = StObject.set(x, "mediaSizes", null)
    
    inline def setMediaSizesUndefined: Self = StObject.set(x, "mediaSizes", js.undefined)
    
    inline def setMediaSizesVarargs(value: String*): Self = StObject.set(x, "mediaSizes", js.Array(value*))
    
    inline def setMediaTypes(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "mediaTypes", value.asInstanceOf[js.Any])
    
    inline def setMediaTypesNull: Self = StObject.set(x, "mediaTypes", null)
    
    inline def setMediaTypesUndefined: Self = StObject.set(x, "mediaTypes", js.undefined)
    
    inline def setMediaTypesVarargs(value: String*): Self = StObject.set(x, "mediaTypes", js.Array(value*))
    
    inline def setMultipageLayouts(value: NullableOption[js.Array[PrintMultipageLayout]]): Self = StObject.set(x, "multipageLayouts", value.asInstanceOf[js.Any])
    
    inline def setMultipageLayoutsNull: Self = StObject.set(x, "multipageLayouts", null)
    
    inline def setMultipageLayoutsUndefined: Self = StObject.set(x, "multipageLayouts", js.undefined)
    
    inline def setMultipageLayoutsVarargs(value: PrintMultipageLayout*): Self = StObject.set(x, "multipageLayouts", js.Array(value*))
    
    inline def setOrientations(value: NullableOption[js.Array[PrintOrientation]]): Self = StObject.set(x, "orientations", value.asInstanceOf[js.Any])
    
    inline def setOrientationsNull: Self = StObject.set(x, "orientations", null)
    
    inline def setOrientationsUndefined: Self = StObject.set(x, "orientations", js.undefined)
    
    inline def setOrientationsVarargs(value: PrintOrientation*): Self = StObject.set(x, "orientations", js.Array(value*))
    
    inline def setOutputBins(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "outputBins", value.asInstanceOf[js.Any])
    
    inline def setOutputBinsNull: Self = StObject.set(x, "outputBins", null)
    
    inline def setOutputBinsUndefined: Self = StObject.set(x, "outputBins", js.undefined)
    
    inline def setOutputBinsVarargs(value: String*): Self = StObject.set(x, "outputBins", js.Array(value*))
    
    inline def setPagesPerSheet(value: NullableOption[js.Array[Double]]): Self = StObject.set(x, "pagesPerSheet", value.asInstanceOf[js.Any])
    
    inline def setPagesPerSheetNull: Self = StObject.set(x, "pagesPerSheet", null)
    
    inline def setPagesPerSheetUndefined: Self = StObject.set(x, "pagesPerSheet", js.undefined)
    
    inline def setPagesPerSheetVarargs(value: Double*): Self = StObject.set(x, "pagesPerSheet", js.Array(value*))
    
    inline def setQualities(value: NullableOption[js.Array[PrintQuality]]): Self = StObject.set(x, "qualities", value.asInstanceOf[js.Any])
    
    inline def setQualitiesNull: Self = StObject.set(x, "qualities", null)
    
    inline def setQualitiesUndefined: Self = StObject.set(x, "qualities", js.undefined)
    
    inline def setQualitiesVarargs(value: PrintQuality*): Self = StObject.set(x, "qualities", js.Array(value*))
    
    inline def setRightMargins(value: NullableOption[js.Array[Double]]): Self = StObject.set(x, "rightMargins", value.asInstanceOf[js.Any])
    
    inline def setRightMarginsNull: Self = StObject.set(x, "rightMargins", null)
    
    inline def setRightMarginsUndefined: Self = StObject.set(x, "rightMargins", js.undefined)
    
    inline def setRightMarginsVarargs(value: Double*): Self = StObject.set(x, "rightMargins", js.Array(value*))
    
    inline def setScalings(value: NullableOption[js.Array[PrintScaling]]): Self = StObject.set(x, "scalings", value.asInstanceOf[js.Any])
    
    inline def setScalingsNull: Self = StObject.set(x, "scalings", null)
    
    inline def setScalingsUndefined: Self = StObject.set(x, "scalings", js.undefined)
    
    inline def setScalingsVarargs(value: PrintScaling*): Self = StObject.set(x, "scalings", js.Array(value*))
    
    inline def setSupportsFitPdfToPage(value: NullableOption[Boolean]): Self = StObject.set(x, "supportsFitPdfToPage", value.asInstanceOf[js.Any])
    
    inline def setSupportsFitPdfToPageNull: Self = StObject.set(x, "supportsFitPdfToPage", null)
    
    inline def setSupportsFitPdfToPageUndefined: Self = StObject.set(x, "supportsFitPdfToPage", js.undefined)
    
    inline def setTopMargins(value: NullableOption[js.Array[Double]]): Self = StObject.set(x, "topMargins", value.asInstanceOf[js.Any])
    
    inline def setTopMarginsNull: Self = StObject.set(x, "topMargins", null)
    
    inline def setTopMarginsUndefined: Self = StObject.set(x, "topMargins", js.undefined)
    
    inline def setTopMarginsVarargs(value: Double*): Self = StObject.set(x, "topMargins", js.Array(value*))
  }
}
