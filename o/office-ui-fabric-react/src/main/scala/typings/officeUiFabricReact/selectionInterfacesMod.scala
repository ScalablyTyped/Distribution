package typings.officeUiFabricReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionInterfacesMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/selection/interfaces", "SELECTION_CHANGE")
  @js.native
  val SELECTION_CHANGE: /* "change" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/selection/interfaces", "SelectionDirection")
  @js.native
  object SelectionDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uifabricUtilities.selectionTypesMod.SelectionDirection & Double] = js.native
    
    /* 0 */ val horizontal: typings.uifabricUtilities.selectionTypesMod.SelectionDirection.horizontal & Double = js.native
    
    /* 1 */ val vertical: typings.uifabricUtilities.selectionTypesMod.SelectionDirection.vertical & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/utilities/selection/interfaces", "SelectionMode")
  @js.native
  object SelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uifabricUtilities.selectionTypesMod.SelectionMode & Double] = js.native
    
    /* 2 */ val multiple: typings.uifabricUtilities.selectionTypesMod.SelectionMode.multiple & Double = js.native
    
    /* 0 */ val none: typings.uifabricUtilities.selectionTypesMod.SelectionMode.none & Double = js.native
    
    /* 1 */ val single: typings.uifabricUtilities.selectionTypesMod.SelectionMode.single & Double = js.native
  }
}
