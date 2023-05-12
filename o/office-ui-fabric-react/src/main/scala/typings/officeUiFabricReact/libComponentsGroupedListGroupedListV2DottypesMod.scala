package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroup
import typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroupedListProps
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsGroupedListGroupedListV2DottypesMod {
  
  @js.native
  trait IGroupedListV2Props
    extends StObject
       with IGroupedListProps {
    
    /**
      * For perf reasons, GroupedList avoids re-rendering unless certain props have changed.
      * Use this prop if you need to force it to re-render when a group has expanded or collapsed.
      * You can pass any type of value as long as it only changes (`===` comparison)
      * when a re-render should happen.
      */
    var groupExpandedVersion: js.UndefOr[js.Object] = js.native
    
    /** Ref to the underlying List control */
    var listRef: js.UndefOr[Ref[typings.officeUiFabricReact.libListMod.List[Any]]] = js.native
    
    def onRenderCell(nestingDepth: Double, item: Any, index: Double, group: IGroup): ReactNode = js.native
    def onRenderCell(nestingDepth: Double, item: Any, index: Unit, group: IGroup): ReactNode = js.native
    def onRenderCell(nestingDepth: Double, item: Unit, index: Double, group: IGroup): ReactNode = js.native
    def onRenderCell(nestingDepth: Double, item: Unit, index: Unit, group: IGroup): ReactNode = js.native
    def onRenderCell(nestingDepth: Unit, item: Any, index: Double, group: IGroup): ReactNode = js.native
    def onRenderCell(nestingDepth: Unit, item: Any, index: Unit, group: IGroup): ReactNode = js.native
    def onRenderCell(nestingDepth: Unit, item: Unit, index: Double, group: IGroup): ReactNode = js.native
    def onRenderCell(nestingDepth: Unit, item: Unit, index: Unit, group: IGroup): ReactNode = js.native
    
    /**
      * For perf reasons, GroupedList avoids re-rendering unless certain props have changed.
      * Use this prop if you need to force it to re-render in other cases. You can pass any type of
      * value as long as it only changes (`===` comparison) when a re-render should happen.
      */
    var version: js.UndefOr[js.Object] = js.native
  }
}
