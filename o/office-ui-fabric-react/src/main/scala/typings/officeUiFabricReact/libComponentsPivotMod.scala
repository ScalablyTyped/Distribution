package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsPivotPivotDottypesMod.IPivotProps
import typings.officeUiFabricReact.libComponentsPivotPivotItemDottypesMod.IPivotItemProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPivotMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot", "Pivot")
  @js.native
  val Pivot: FunctionComponent[IPivotProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot", "PivotBase")
  @js.native
  open class PivotBase protected ()
    extends typings.officeUiFabricReact.libComponentsPivotPivotDotbaseMod.PivotBase {
    def this(props: IPivotProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot", "PivotItem")
  @js.native
  open class PivotItem protected ()
    extends typings.officeUiFabricReact.libComponentsPivotPivotItemMod.PivotItem {
    def this(props: IPivotItemProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot", "PivotLinkFormat")
  @js.native
  object PivotLinkFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsPivotPivotDottypesMod.PivotLinkFormat & Double
      ] = js.native
    
    /* 0 */ val links: typings.officeUiFabricReact.libComponentsPivotPivotDottypesMod.PivotLinkFormat.links & Double = js.native
    
    /* 1 */ val tabs: typings.officeUiFabricReact.libComponentsPivotPivotDottypesMod.PivotLinkFormat.tabs & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot", "PivotLinkSize")
  @js.native
  object PivotLinkSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsPivotPivotDottypesMod.PivotLinkSize & Double
      ] = js.native
    
    /* 1 */ val large: typings.officeUiFabricReact.libComponentsPivotPivotDottypesMod.PivotLinkSize.large & Double = js.native
    
    /* 0 */ val normal: typings.officeUiFabricReact.libComponentsPivotPivotDottypesMod.PivotLinkSize.normal & Double = js.native
  }
}
