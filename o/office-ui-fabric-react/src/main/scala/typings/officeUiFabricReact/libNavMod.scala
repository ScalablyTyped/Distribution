package typings.officeUiFabricReact

import typings.officeUiFabricReact.navTypesMod.INavProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNavMod {
  
  @JSImport("office-ui-fabric-react/lib/Nav", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/Nav", "Nav")
  @js.native
  val Nav: FunctionComponent[INavProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Nav", "NavBase")
  @js.native
  class NavBase protected ()
    extends typings.officeUiFabricReact.navMod.NavBase {
    def this(props: INavProps) = this()
  }
  /* static members */
  object NavBase {
    
    @JSImport("office-ui-fabric-react/lib/Nav", "NavBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Nav", "NavBase.defaultProps")
    @js.native
    def defaultProps: INavProps = js.native
    inline def defaultProps_=(x: INavProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def isRelativeUrl(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelativeUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
