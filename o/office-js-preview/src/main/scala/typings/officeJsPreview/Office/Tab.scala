package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an individual tab and the state it should have. For code examples, see  {@link https://learn.microsoft.com/office/dev/add-ins/design/disable-add-in-commands | Enable and Disable Add-in Commands} and {@link https://learn.microsoft.com/office/dev/add-ins/design/contextual-tabs | Create custom contextual tabs}.
  *
  * @remarks
  *
  * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/ribbon-api-requirement-sets | RibbonApi 1.1}
  */
trait Tab extends StObject {
  
  /**
    * Specifies one or more of the controls in the tab, such as menu items, buttons, etc.
    * 
    * @remarks
    * 
    * When the `Tab` object is part of a {@link Office.RibbonUpdaterData} object passed to the `requestUpdate` method of {@link Office.Ribbon}, this property specifies the IDs of the controls whose enabled status is to be changed. However, if there is a `groups` property on the tab, then this property is ignored and the `controls` properties of the specified groups must be used to change enabled status.
    */
  var controls: js.UndefOr[js.Array[Control]] = js.undefined
  
  /**
    * Specifies one or more of the control groups on the tab.
    * 
    * @remarks
    * 
    * When the `Tab` object is part of an {@link Office.RibbonUpdaterData} object passed to the `requestUpdate` method of {@link Office.Ribbon}, the `controls` properties of the various {@link Office.Group} objects specify which controls have their enabled status changed; the `controls` property of the `Tab` object is ignored. 
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/ribbon-api-requirement-sets | RibbonApi 1.1}
    */
  var groups: js.UndefOr[js.Array[Group]] = js.undefined
  
  /**
    * Identifier of the tab as specified in the manifest.
    */
  var id: String
  
  /**
    * Specifies whether the tab is visible on the ribbon. Used only with contextual tabs.
    * 
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/ribbon-api-requirement-sets | RibbonApi 1.2}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Tab {
  
  inline def apply(id: String): Tab = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
  
  extension [Self <: Tab](x: Self) {
    
    inline def setControls(value: js.Array[Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setControlsVarargs(value: Control*): Self = StObject.set(x, "controls", js.Array(value*))
    
    inline def setGroups(value: js.Array[Group]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: Group*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
