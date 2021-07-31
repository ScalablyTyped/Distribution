package typings.officeJsPreview.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Application object, for use in "application.set({ ... })". */
trait ApplicationUpdateData extends StObject {
  
  /**
    *
    * Show or hide the iFrame application borders.
    *
    * [Api set:  1.1]
    */
  var showBorders: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Show or hide the standard toolbars.
    *
    * [Api set:  1.1]
    */
  var showToolbars: js.UndefOr[Boolean] = js.undefined
}
object ApplicationUpdateData {
  
  @scala.inline
  def apply(): ApplicationUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationUpdateData]
  }
  
  @scala.inline
  implicit class ApplicationUpdateDataMutableBuilder[Self <: ApplicationUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShowBorders(value: Boolean): Self = StObject.set(x, "showBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBordersUndefined: Self = StObject.set(x, "showBorders", js.undefined)
    
    @scala.inline
    def setShowToolbars(value: Boolean): Self = StObject.set(x, "showToolbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowToolbarsUndefined: Self = StObject.set(x, "showToolbars", js.undefined)
  }
}
