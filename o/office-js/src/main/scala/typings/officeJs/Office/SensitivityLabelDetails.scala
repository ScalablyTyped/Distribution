package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the properties of available sensitivity labels in Outlook.
  * 
  * @remarks
  * [Api set: Mailbox 1.13]
  * 
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
  *
  * **Important**: To use the sensitivity label feature in your add-in, you must have a Microsoft 365 E5 subscription.
  *
  * To learn more about how to manage sensitivity labels in your add-in, see
  * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/sensitivity-label | Manage the sensitivity label of your message or appointment in compose mode}.
  */
trait SensitivityLabelDetails extends StObject {
  
  /**
    * The {@link https://learn.microsoft.com/microsoft-365/compliance/sensitivity-labels#sublabels-grouping-labels | sublabels} of the sensitivity label.
    * Returns `null` if a label doesn't have any sublabels.
    */
  var children: js.Array[SensitivityLabelDetails]
  
  /**
    * The color of the sensitivity label.
    */
  var color: String
  
  /**
    * The unique identifier (GUID) of the sensitivity label.
    */
  var id: String
  
  /**
    * The name of the sensitivity label.
    */
  var name: String
  
  /**
    * The description of the sensitivity label.
    */
  var tooltip: String
}
object SensitivityLabelDetails {
  
  inline def apply(
    children: js.Array[SensitivityLabelDetails],
    color: String,
    id: String,
    name: String,
    tooltip: String
  ): SensitivityLabelDetails = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensitivityLabelDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SensitivityLabelDetails] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[SensitivityLabelDetails]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: SensitivityLabelDetails*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
