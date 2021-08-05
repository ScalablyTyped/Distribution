package typings.officeUiFabricReact.indexBundleMod

import typings.officeUiFabricReact.anon.CardDismissDelay
import typings.officeUiFabricReact.hoverCardTypesMod.IHoverCardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "HoverCardBase")
@js.native
class HoverCardBase protected ()
  extends typings.officeUiFabricReact.mod.HoverCardBase {
  def this(props: IHoverCardProps) = this()
}
/* static members */
object HoverCardBase {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "HoverCardBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "HoverCardBase.defaultProps")
  @js.native
  def defaultProps: CardDismissDelay = js.native
  inline def defaultProps_=(x: CardDismissDelay): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
