package typings.openui5.anon

import typings.openui5.sapUiCoreControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerData extends StObject {
  
  /**
    * the container where the view will be added
    */
  var container: default
  
  /**
    * the data passed from {@link sap.ui.core.routing.Target#display} method
    */
  var data: js.UndefOr[js.Object] = js.undefined
  
  /**
    * the view which will be added to the container
    */
  var view: default
}
object ContainerData {
  
  inline def apply(container: default, view: default): ContainerData = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerData] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: default): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setView(value: default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
