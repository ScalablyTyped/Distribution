package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface that contains all the functionality provided to manage the state of the Office ribbon.
  *
  * @remarks
  *
  * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/ribbon-api-requirement-sets | RibbonApi 1.1}
  */
trait Ribbon extends StObject {
  
  /**
    * Registers a custom contextual tab with Office and defines the tab's controls.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/ribbon-api-requirement-sets | RibbonApi 1.2}
    * 
    * This method only requests that the tab be registered. The actual registration is controlled by the Office application and may not be complete when the returned `Promise` object is resolved.
    * For more information and code examples, see {@link https://learn.microsoft.com/office/dev/add-ins/design/contextual-tabs | Create custom contextual tabs}.
    * 
    * @param tabDefinition - Specifies the tab's properties and child controls and their properties. Pass a JSON string that conforms to the Office dynamic-ribbon JSON schema to `JSON.parse`, and then pass the returned object to this method.
    */
  def requestCreateControls(tabDefinition: js.Object): js.Promise[Unit]
  
  /**
    * Sends a request to Office to update the ribbon.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/ribbon-api-requirement-sets | RibbonApi 1.1}
    *
    * Note that this API is only to request an update. The actual UI update to the ribbon is controlled by the Office application and hence the exact timing of the ribbon update (or refresh) cannot be determined by the completion of this API.
    * 
    * For code examples, see  {@link https://learn.microsoft.com/office/dev/add-ins/design/disable-add-in-commands | Enable and Disable Add-in Commands} and {@link https://learn.microsoft.com/office/dev/add-ins/design/contextual-tabs | Create custom contextual tabs}.
    *
    * @param input - Represents the updates to be made to the ribbon. Note that only the changes specified in the input parameter are made.
    */
  def requestUpdate(input: RibbonUpdaterData): js.Promise[Unit]
}
object Ribbon {
  
  inline def apply(
    requestCreateControls: js.Object => js.Promise[Unit],
    requestUpdate: RibbonUpdaterData => js.Promise[Unit]
  ): Ribbon = {
    val __obj = js.Dynamic.literal(requestCreateControls = js.Any.fromFunction1(requestCreateControls), requestUpdate = js.Any.fromFunction1(requestUpdate))
    __obj.asInstanceOf[Ribbon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ribbon] (val x: Self) extends AnyVal {
    
    inline def setRequestCreateControls(value: js.Object => js.Promise[Unit]): Self = StObject.set(x, "requestCreateControls", js.Any.fromFunction1(value))
    
    inline def setRequestUpdate(value: RibbonUpdaterData => js.Promise[Unit]): Self = StObject.set(x, "requestUpdate", js.Any.fromFunction1(value))
  }
}
