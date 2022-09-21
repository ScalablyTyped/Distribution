package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an individual control or command and the state it should have.
  * 
  * For code samples showing how to use a `Control` object and its properties, see {@link https://learn.microsoft.com/office/dev/add-ins/design/disable-add-in-commands | Enable and Disable Add-in Commands} and {@link https://learn.microsoft.com/office/dev/add-ins/design/contextual-tabs | Create custom contextual tabs}.
  *
  * @remarks
  *
  * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/ribbon-api-requirement-sets | RibbonApi 1.1}
  */
trait Control extends StObject {
  
  /**
    * Indicates whether the control should be enabled or disabled. The default is true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifier of the control as specified in the manifest.
    */
  var id: String
}
object Control {
  
  inline def apply(id: String): Control = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Control]
  }
  
  extension [Self <: Control](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
