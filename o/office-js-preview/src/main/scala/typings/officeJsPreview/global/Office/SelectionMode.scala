package typings.officeJsPreview.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies whether to select (highlight) the location to navigate to (when using the {@link Office.Document | Document}.goToByIdAsync method).
  */
@JSGlobal("Office.SelectionMode")
@js.native
object SelectionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJsPreview.Office.SelectionMode with Double] = js.native
  
  /* 0 */ val Default: typings.officeJsPreview.Office.SelectionMode.Default with Double = js.native
  
  /* 2 */ val None: typings.officeJsPreview.Office.SelectionMode.None with Double = js.native
  
  /* 1 */ val Selected: typings.officeJsPreview.Office.SelectionMode.Selected with Double = js.native
}
