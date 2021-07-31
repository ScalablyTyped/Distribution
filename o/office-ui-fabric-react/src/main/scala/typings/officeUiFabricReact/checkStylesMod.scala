package typings.officeUiFabricReact

import typings.officeUiFabricReact.checkTypesMod.ICheckStyleProps
import typings.officeUiFabricReact.checkTypesMod.ICheckStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Check/Check.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object CheckGlobalClassNames {
    
    @JSImport("office-ui-fabric-react/lib/components/Check/Check.styles", "CheckGlobalClassNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Check/Check.styles", "CheckGlobalClassNames.check")
    @js.native
    def check: String = js.native
    
    /** Must be manually applied to the parent element of the check. */
    @JSImport("office-ui-fabric-react/lib/components/Check/Check.styles", "CheckGlobalClassNames.checkHost")
    @js.native
    def checkHost: String = js.native
    @scala.inline
    def checkHost_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkHost")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def check_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("check")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/Check/Check.styles", "CheckGlobalClassNames.circle")
    @js.native
    def circle: String = js.native
    @scala.inline
    def circle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("circle")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/Check/Check.styles", "CheckGlobalClassNames.root")
    @js.native
    def root: String = js.native
    @scala.inline
    def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def getStyles(props: ICheckStyleProps): ICheckStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ICheckStyles]
}
