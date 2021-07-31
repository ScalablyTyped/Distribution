package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.CompactCardHeight
import typings.officeUiFabricReact.expandingCardTypesMod.IExpandingCardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "ExpandingCardBase")
@js.native
class ExpandingCardBase protected ()
  extends typings.officeUiFabricReact.libHoverCardMod.ExpandingCardBase {
  def this(props: IExpandingCardProps) = this()
}
/* static members */
object ExpandingCardBase {
  
  @JSImport("office-ui-fabric-react", "ExpandingCardBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "ExpandingCardBase.defaultProps")
  @js.native
  def defaultProps: CompactCardHeight = js.native
  @scala.inline
  def defaultProps_=(x: CompactCardHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
