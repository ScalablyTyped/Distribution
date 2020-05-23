package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/selection/interfaces", JSImport.Namespace)
@js.native
object selectionInterfacesMod extends js.Object {
  val SELECTION_CHANGE: /* "change" */ String = js.native
  @js.native
  object SelectionDirection extends js.Object {
    /* 0 */ val horizontal: typings.uifabricUtilities.selectionTypesMod.SelectionDirection.horizontal with Double = js.native
    /* 1 */ val vertical: typings.uifabricUtilities.selectionTypesMod.SelectionDirection.vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uifabricUtilities.selectionTypesMod.SelectionDirection with Double] = js.native
  }
  
  @js.native
  object SelectionMode extends js.Object {
    /* 2 */ val multiple: typings.uifabricUtilities.selectionTypesMod.SelectionMode.multiple with Double = js.native
    /* 0 */ val none: typings.uifabricUtilities.selectionTypesMod.SelectionMode.none with Double = js.native
    /* 1 */ val single: typings.uifabricUtilities.selectionTypesMod.SelectionMode.single with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uifabricUtilities.selectionTypesMod.SelectionMode with Double] = js.native
  }
  
}

