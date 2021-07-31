package typings.officeUiFabricReact

import typings.officeUiFabricReact.fabricTypesMod.IFabricStyleProps
import typings.officeUiFabricReact.fabricTypesMod.IFabricStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabricStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Fabric/Fabric.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IFabricStyleProps): IFabricStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IFabricStyles]
  
  trait IFabricClassNames extends StObject {
    
    var bodyThemed: String
    
    var root: String
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
