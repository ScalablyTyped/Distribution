package typings.powerbiVisualsTools.mod

import typings.powerbiVisualsTools.mod.data.DisplayNameGetter
import typings.powerbiVisualsTools.mod.jsCommon.IStringResourceProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualObjectInstanceContainer extends StObject {
  
  var displayName: DisplayNameGetter
}
object VisualObjectInstanceContainer {
  
  inline def apply(displayName: DisplayNameGetter): VisualObjectInstanceContainer = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualObjectInstanceContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualObjectInstanceContainer] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: DisplayNameGetter): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameFunction1(value: /* resourceProvider */ IStringResourceProvider => String): Self = StObject.set(x, "displayName", js.Any.fromFunction1(value))
  }
}
