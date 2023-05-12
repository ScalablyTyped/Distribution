package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.OnRenderCell
import typings.officeUiFabricReact.libComponentsListListDottypesMod.IListProps
import typings.officeUiFabricReact.libComponentsListListMod.IListState
import typings.officeUiFabricReact.officeUiFabricReactInts.`0`
import typings.officeUiFabricReact.officeUiFabricReactInts.`1`
import typings.officeUiFabricReact.officeUiFabricReactInts.`2`
import typings.officeUiFabricReact.officeUiFabricReactInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsListMod {
  
  @JSImport("office-ui-fabric-react/lib/components/List", "List")
  @js.native
  open class List[T] protected ()
    extends typings.officeUiFabricReact.libComponentsListListMod.List[T] {
    def this(props: IListProps[T]) = this()
  }
  /* static members */
  object List {
    
    @JSImport("office-ui-fabric-react/lib/components/List", "List")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/List", "List.defaultProps")
    @js.native
    def defaultProps: OnRenderCell = js.native
    inline def defaultProps_=(x: OnRenderCell): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps[U](nextProps: IListProps[U], previousState: IListState[U]): IListState[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IListState[U]]
  }
  
  object ScrollToMode {
    
    @JSImport("office-ui-fabric-react/lib/components/List", "ScrollToMode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Does not make any consideration to where in the viewport the item should align to.
      */
    @JSImport("office-ui-fabric-react/lib/components/List", "ScrollToMode.auto")
    @js.native
    def auto: `0` = js.native
    inline def auto_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("auto")(x.asInstanceOf[js.Any])
    
    /**
      * Attempts to scroll the list so the bottom of the desired item is aligned with the bottom of the viewport.
      */
    @JSImport("office-ui-fabric-react/lib/components/List", "ScrollToMode.bottom")
    @js.native
    def bottom: `2` = js.native
    inline def bottom_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottom")(x.asInstanceOf[js.Any])
    
    /**
      * Attempts to scroll the list so the desired item is in the exact center of the viewport.
      */
    @JSImport("office-ui-fabric-react/lib/components/List", "ScrollToMode.center")
    @js.native
    def center: `3` = js.native
    inline def center_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("center")(x.asInstanceOf[js.Any])
    
    /**
      * Attempts to scroll the list so the top of the desired item is aligned with the top of the viewport.
      */
    @JSImport("office-ui-fabric-react/lib/components/List", "ScrollToMode.top")
    @js.native
    def top: `1` = js.native
    inline def top_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
  }
}
