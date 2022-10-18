package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a group of controls on a ribbon tab.
  *
  * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/ribbon-api-requirement-sets | RibbonApi 1.1}
  */
trait Group extends StObject {
  
  /**
    * Specifies one or more of the controls in the group, such as menu items, buttons, etc.
    * 
    * @remarks
    * 
    * When the `Group` object is part of an {@link Office.RibbonUpdaterData} object passed to the `requestUpdate` method of {@link Office.Ribbon}, the `controls` properties of the various {@link Office.Group} objects specify which controls have their enabled status changed; the `controls` property of the `Group` object's parent `Tab` object is ignored. 
    */
  var controls: js.UndefOr[js.Array[Control]] = js.undefined
  
  /**
    * Identifier of the group as specified in the manifest.
    * 
    */
  var id: String
}
object Group {
  
  inline def apply(id: String): Group = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  extension [Self <: Group](x: Self) {
    
    inline def setControls(value: js.Array[Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setControlsVarargs(value: Control*): Self = StObject.set(x, "controls", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
