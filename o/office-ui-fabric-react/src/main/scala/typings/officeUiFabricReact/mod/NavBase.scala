package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.navTypesMod.INavProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "NavBase")
@js.native
class NavBase protected ()
  extends typings.officeUiFabricReact.libNavMod.NavBase {
  def this(props: INavProps) = this()
}
/* static members */
object NavBase {
  
  @JSImport("office-ui-fabric-react", "NavBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "NavBase.defaultProps")
  @js.native
  def defaultProps: INavProps = js.native
  inline def defaultProps_=(x: INavProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
