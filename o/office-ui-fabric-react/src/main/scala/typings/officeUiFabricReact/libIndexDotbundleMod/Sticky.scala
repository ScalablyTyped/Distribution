package typings.officeUiFabricReact.libIndexDotbundleMod

import typings.officeUiFabricReact.libComponentsScrollablePaneScrollablePaneDottypesMod.IScrollablePaneContext
import typings.officeUiFabricReact.libComponentsStickyStickyDottypesMod.IStickyProps
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "Sticky")
@js.native
open class Sticky protected ()
  extends typings.officeUiFabricReact.mod.Sticky {
  def this(props: IStickyProps) = this()
}
/* static members */
object Sticky {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Sticky")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Sticky.contextType")
  @js.native
  def contextType: Context[IScrollablePaneContext] = js.native
  inline def contextType_=(x: Context[IScrollablePaneContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Sticky.defaultProps")
  @js.native
  def defaultProps: IStickyProps = js.native
  inline def defaultProps_=(x: IStickyProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
