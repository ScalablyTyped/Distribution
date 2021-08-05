package typings.officeJs.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "application.toJSON()". */
trait ApplicationData extends StObject {
  
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
object ApplicationData {
  
  inline def apply(): ApplicationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationData]
  }
  
  extension [Self <: ApplicationData](x: Self) {
    
    inline def setShowBorders(value: Boolean): Self = StObject.set(x, "showBorders", value.asInstanceOf[js.Any])
    
    inline def setShowBordersUndefined: Self = StObject.set(x, "showBorders", js.undefined)
    
    inline def setShowToolbars(value: Boolean): Self = StObject.set(x, "showToolbars", value.asInstanceOf[js.Any])
    
    inline def setShowToolbarsUndefined: Self = StObject.set(x, "showToolbars", js.undefined)
  }
}
