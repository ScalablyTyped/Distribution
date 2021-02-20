package typings.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProblemLocation extends StObject {
  
  var document: js.UndefOr[String] = js.native
  
  var element: js.UndefOr[String] = js.native
  
  var elementId: js.UndefOr[String] = js.native
  
  var module: js.UndefOr[String] = js.native
  
  var unitId: js.UndefOr[String] = js.native
}
object IProblemLocation {
  
  @scala.inline
  def apply(): IProblemLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProblemLocation]
  }
  
  @scala.inline
  implicit class IProblemLocationMutableBuilder[Self <: IProblemLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementIdUndefined: Self = StObject.set(x, "elementId", js.undefined)
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    @scala.inline
    def setUnitId(value: String): Self = StObject.set(x, "unitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitIdUndefined: Self = StObject.set(x, "unitId", js.undefined)
  }
}
