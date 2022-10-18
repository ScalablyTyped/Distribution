package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageStripDesign extends StObject
@JSImport("sap/ui/webc/main/library", "MessageStripDesign")
@js.native
object MessageStripDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MessageStripDesign & String] = js.native
  
  /**
    * Message should be just an information
    */
  @js.native
  sealed trait Information
    extends StObject
       with MessageStripDesign
  /* "Information" */ val Information: typings.openui5.sapUiWebcMainLibraryMod.MessageStripDesign.Information & String = js.native
  
  /**
    * Message is an error
    */
  @js.native
  sealed trait Negative
    extends StObject
       with MessageStripDesign
  /* "Negative" */ val Negative: typings.openui5.sapUiWebcMainLibraryMod.MessageStripDesign.Negative & String = js.native
  
  /**
    * Message is a success message
    */
  @js.native
  sealed trait Positive
    extends StObject
       with MessageStripDesign
  /* "Positive" */ val Positive: typings.openui5.sapUiWebcMainLibraryMod.MessageStripDesign.Positive & String = js.native
  
  /**
    * Message is a warning
    */
  @js.native
  sealed trait Warning
    extends StObject
       with MessageStripDesign
  /* "Warning" */ val Warning: typings.openui5.sapUiWebcMainLibraryMod.MessageStripDesign.Warning & String = js.native
}
