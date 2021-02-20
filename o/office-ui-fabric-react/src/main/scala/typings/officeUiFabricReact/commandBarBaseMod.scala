package typings.officeUiFabricReact

import typings.officeUiFabricReact.commandBarTypesMod.ICommandBar
import typings.officeUiFabricReact.commandBarTypesMod.ICommandBarItemProps
import typings.officeUiFabricReact.commandBarTypesMod.ICommandBarProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandBarBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/CommandBar/CommandBar.base", "CommandBarBase")
  @js.native
  class CommandBarBase protected ()
    extends Component[ICommandBarProps, js.Object, js.Any]
       with ICommandBar {
    def this(props: ICommandBarProps) = this()
    
    var _classNames: js.Any = js.native
    
    var _commandButton: js.Any = js.native
    
    var _computeCacheKey: js.Any = js.native
    
    var _onButtonClick: js.Any = js.native
    
    var _onGrowData: js.Any = js.native
    
    var _onReduceData: js.Any = js.native
    
    var _onRenderData: js.Any = js.native
    
    var _onRenderItem: js.Any = js.native
    
    var _onRenderOverflowButton: js.Any = js.native
    
    var _overflowSet: js.Any = js.native
    
    var _resizeGroup: js.Any = js.native
  }
  /* static members */
  object CommandBarBase {
    
    @JSImport("office-ui-fabric-react/lib/components/CommandBar/CommandBar.base", "CommandBarBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/CommandBar/CommandBar.base", "CommandBarBase.defaultProps")
    @js.native
    def defaultProps: ICommandBarProps = js.native
    @scala.inline
    def defaultProps_=(x: ICommandBarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ICommandBarData extends StObject {
    
    /**
      * Unique string used to cache the width of the command bar
      */
    var cacheKey: String = js.native
    
    /**
      * Items being rendered on the far side
      */
    var farItems: js.UndefOr[js.Array[ICommandBarItemProps]] = js.native
    
    /**
      * Length of original overflowItems to ensure that they are not moved into primary region on resize
      */
    var minimumOverflowItems: Double = js.native
    
    /**
      * Items being rendered in the overflow
      */
    var overflowItems: js.Array[ICommandBarItemProps] = js.native
    
    /**
      * Items being rendered in the primary region
      */
    var primaryItems: js.Array[ICommandBarItemProps] = js.native
  }
  object ICommandBarData {
    
    @scala.inline
    def apply(
      cacheKey: String,
      minimumOverflowItems: Double,
      overflowItems: js.Array[ICommandBarItemProps],
      primaryItems: js.Array[ICommandBarItemProps]
    ): ICommandBarData = {
      val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], minimumOverflowItems = minimumOverflowItems.asInstanceOf[js.Any], overflowItems = overflowItems.asInstanceOf[js.Any], primaryItems = primaryItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommandBarData]
    }
    
    @scala.inline
    implicit class ICommandBarDataMutableBuilder[Self <: ICommandBarData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFarItems(value: js.Array[ICommandBarItemProps]): Self = StObject.set(x, "farItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFarItemsUndefined: Self = StObject.set(x, "farItems", js.undefined)
      
      @scala.inline
      def setFarItemsVarargs(value: ICommandBarItemProps*): Self = StObject.set(x, "farItems", js.Array(value :_*))
      
      @scala.inline
      def setMinimumOverflowItems(value: Double): Self = StObject.set(x, "minimumOverflowItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowItems(value: js.Array[ICommandBarItemProps]): Self = StObject.set(x, "overflowItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowItemsVarargs(value: ICommandBarItemProps*): Self = StObject.set(x, "overflowItems", js.Array(value :_*))
      
      @scala.inline
      def setPrimaryItems(value: js.Array[ICommandBarItemProps]): Self = StObject.set(x, "primaryItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryItemsVarargs(value: ICommandBarItemProps*): Self = StObject.set(x, "primaryItems", js.Array(value :_*))
    }
  }
}
