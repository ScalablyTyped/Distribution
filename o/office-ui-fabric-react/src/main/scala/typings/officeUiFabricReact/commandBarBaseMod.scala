package typings.officeUiFabricReact

import typings.officeUiFabricReact.commandBarTypesMod.ICommandBar
import typings.officeUiFabricReact.commandBarTypesMod.ICommandBarItemProps
import typings.officeUiFabricReact.commandBarTypesMod.ICommandBarProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandBarBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/CommandBar/CommandBar.base", "CommandBarBase")
  @js.native
  class CommandBarBase protected ()
    extends Component[ICommandBarProps, js.Object, js.Any]
       with ICommandBar {
    def this(props: ICommandBarProps) = this()
    
    /* private */ var _classNames: js.Any = js.native
    
    /* private */ var _commandButton: js.Any = js.native
    
    /* private */ var _computeCacheKey: js.Any = js.native
    
    /* private */ var _onButtonClick: js.Any = js.native
    
    /* private */ var _onGrowData: js.Any = js.native
    
    /* private */ var _onReduceData: js.Any = js.native
    
    /* private */ var _onRenderData: js.Any = js.native
    
    /* private */ var _onRenderItem: js.Any = js.native
    
    /* private */ var _onRenderOverflowButton: js.Any = js.native
    
    /* private */ var _overflowSet: js.Any = js.native
    
    /* private */ var _resizeGroup: js.Any = js.native
    
    /**
      * Sets focus to the active command in the list.
      */
    /* CompleteClass */
    override def focus(): Unit = js.native
    
    /**
      * Remeasures the available space.
      */
    /* CompleteClass */
    override def remeasure(): Unit = js.native
  }
  /* static members */
  object CommandBarBase {
    
    @JSImport("office-ui-fabric-react/lib/components/CommandBar/CommandBar.base", "CommandBarBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/CommandBar/CommandBar.base", "CommandBarBase.defaultProps")
    @js.native
    def defaultProps: ICommandBarProps = js.native
    inline def defaultProps_=(x: ICommandBarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ICommandBarData extends StObject {
    
    /**
      * Unique string used to cache the width of the command bar
      */
    var cacheKey: String
    
    /**
      * Items being rendered on the far side
      */
    var farItems: js.UndefOr[js.Array[ICommandBarItemProps]] = js.undefined
    
    /**
      * Length of original overflowItems to ensure that they are not moved into primary region on resize
      */
    var minimumOverflowItems: Double
    
    /**
      * Items being rendered in the overflow
      */
    var overflowItems: js.Array[ICommandBarItemProps]
    
    /**
      * Items being rendered in the primary region
      */
    var primaryItems: js.Array[ICommandBarItemProps]
  }
  object ICommandBarData {
    
    inline def apply(
      cacheKey: String,
      minimumOverflowItems: Double,
      overflowItems: js.Array[ICommandBarItemProps],
      primaryItems: js.Array[ICommandBarItemProps]
    ): ICommandBarData = {
      val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], minimumOverflowItems = minimumOverflowItems.asInstanceOf[js.Any], overflowItems = overflowItems.asInstanceOf[js.Any], primaryItems = primaryItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommandBarData]
    }
    
    extension [Self <: ICommandBarData](x: Self) {
      
      inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      inline def setFarItems(value: js.Array[ICommandBarItemProps]): Self = StObject.set(x, "farItems", value.asInstanceOf[js.Any])
      
      inline def setFarItemsUndefined: Self = StObject.set(x, "farItems", js.undefined)
      
      inline def setFarItemsVarargs(value: ICommandBarItemProps*): Self = StObject.set(x, "farItems", js.Array(value :_*))
      
      inline def setMinimumOverflowItems(value: Double): Self = StObject.set(x, "minimumOverflowItems", value.asInstanceOf[js.Any])
      
      inline def setOverflowItems(value: js.Array[ICommandBarItemProps]): Self = StObject.set(x, "overflowItems", value.asInstanceOf[js.Any])
      
      inline def setOverflowItemsVarargs(value: ICommandBarItemProps*): Self = StObject.set(x, "overflowItems", js.Array(value :_*))
      
      inline def setPrimaryItems(value: js.Array[ICommandBarItemProps]): Self = StObject.set(x, "primaryItems", value.asInstanceOf[js.Any])
      
      inline def setPrimaryItemsVarargs(value: ICommandBarItemProps*): Self = StObject.set(x, "primaryItems", js.Array(value :_*))
    }
  }
}
