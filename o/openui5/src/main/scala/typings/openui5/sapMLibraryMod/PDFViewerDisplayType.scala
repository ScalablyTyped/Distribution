package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PDFViewerDisplayType extends StObject
@JSImport("sap/m/library", "PDFViewerDisplayType")
@js.native
object PDFViewerDisplayType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PDFViewerDisplayType & String] = js.native
  
  /**
    * The PDF viewer switches between the `Link` display type and the `Embedded` display type, depending on
    * the device being used.
    */
  @js.native
  sealed trait Auto
    extends StObject
       with PDFViewerDisplayType
  /* "Auto" */ val Auto: typings.openui5.sapMLibraryMod.PDFViewerDisplayType.Auto & String = js.native
  
  /**
    * The PDF viewer appears embedded in the parent container and displays the PDF file.
    */
  @js.native
  sealed trait Embedded
    extends StObject
       with PDFViewerDisplayType
  /* "Embedded" */ val Embedded: typings.openui5.sapMLibraryMod.PDFViewerDisplayType.Embedded & String = js.native
  
  /**
    * The PDF viewer appears as a toolbar with a download button that can be used to download the PDF file
    * or open it in a new tab.
    */
  @js.native
  sealed trait Link
    extends StObject
       with PDFViewerDisplayType
  /* "Link" */ val Link: typings.openui5.sapMLibraryMod.PDFViewerDisplayType.Link & String = js.native
}
