package typings.officeUiFabricReact

import typings.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalDividerBaseMod {
  
  object VerticalDividerBase {
    
    @scala.inline
    def apply(props: IVerticalDividerProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("office-ui-fabric-react/lib/components/Divider/VerticalDivider.base", "VerticalDividerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Divider/VerticalDivider.base", "VerticalDividerBase.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
