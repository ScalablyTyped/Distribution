package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsFabricFabricDottypesMod.IFabricStyleProps
import typings.officeUiFabricReact.libComponentsFabricFabricDottypesMod.IFabricStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFabricFabricDotstylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Fabric/Fabric.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IFabricStyleProps): IFabricStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IFabricStyles]
  
  trait IFabricClassNames extends StObject {
    
    var bodyThemed: String
    
    var root: String
  }
  object IFabricClassNames {
    
    inline def apply(bodyThemed: String, root: String): IFabricClassNames = {
      val __obj = js.Dynamic.literal(bodyThemed = bodyThemed.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFabricClassNames]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFabricClassNames] (val x: Self) extends AnyVal {
      
      inline def setBodyThemed(value: String): Self = StObject.set(x, "bodyThemed", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
