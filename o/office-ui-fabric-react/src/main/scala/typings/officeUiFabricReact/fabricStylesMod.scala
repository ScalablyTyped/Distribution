package typings.officeUiFabricReact

import typings.officeUiFabricReact.fabricTypesMod.IFabricStyleProps
import typings.officeUiFabricReact.fabricTypesMod.IFabricStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabricStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Fabric/Fabric.styles", "getStyles")
  @js.native
  def getStyles(props: IFabricStyleProps): IFabricStyles = js.native
  
  @js.native
  trait IFabricClassNames extends StObject {
    
    var bodyThemed: String = js.native
    
    var root: String = js.native
  }
  object IFabricClassNames {
    
    @scala.inline
    def apply(bodyThemed: String, root: String): IFabricClassNames = {
      val __obj = js.Dynamic.literal(bodyThemed = bodyThemed.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFabricClassNames]
    }
    
    @scala.inline
    implicit class IFabricClassNamesMutableBuilder[Self <: IFabricClassNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyThemed(value: String): Self = StObject.set(x, "bodyThemed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
