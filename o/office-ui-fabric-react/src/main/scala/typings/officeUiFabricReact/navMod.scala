package typings.officeUiFabricReact

import typings.officeUiFabricReact.navTypesMod.INavProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Nav", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Nav", "Nav")
  @js.native
  val Nav: FunctionComponent[INavProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Nav", "NavBase")
  @js.native
  class NavBase protected ()
    extends typings.officeUiFabricReact.navBaseMod.NavBase {
    def this(props: INavProps) = this()
  }
  /* static members */
  object NavBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Nav", "NavBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Nav", "NavBase.defaultProps")
    @js.native
    def defaultProps: INavProps = js.native
    inline def defaultProps_=(x: INavProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def isRelativeUrl(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelativeUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
