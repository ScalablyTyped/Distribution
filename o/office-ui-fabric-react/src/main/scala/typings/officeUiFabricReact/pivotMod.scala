package typings.officeUiFabricReact

import typings.officeUiFabricReact.pivotItemTypesMod.IPivotItemProps
import typings.officeUiFabricReact.pivotTypesMod.IPivotProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pivotMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot", "Pivot")
  @js.native
  val Pivot: FunctionComponent[IPivotProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot", "PivotBase")
  @js.native
  class PivotBase protected ()
    extends typings.officeUiFabricReact.pivotBaseMod.PivotBase {
    def this(props: IPivotProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot", "PivotItem")
  @js.native
  class PivotItem protected ()
    extends typings.officeUiFabricReact.pivotItemMod.PivotItem {
    def this(props: IPivotItemProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot", "PivotLinkFormat")
  @js.native
  object PivotLinkFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.pivotTypesMod.PivotLinkFormat & Double] = js.native
    
    /* 0 */ val links: typings.officeUiFabricReact.pivotTypesMod.PivotLinkFormat.links & Double = js.native
    
    /* 1 */ val tabs: typings.officeUiFabricReact.pivotTypesMod.PivotLinkFormat.tabs & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot", "PivotLinkSize")
  @js.native
  object PivotLinkSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.pivotTypesMod.PivotLinkSize & Double] = js.native
    
    /* 1 */ val large: typings.officeUiFabricReact.pivotTypesMod.PivotLinkSize.large & Double = js.native
    
    /* 0 */ val normal: typings.officeUiFabricReact.pivotTypesMod.PivotLinkSize.normal & Double = js.native
  }
}
