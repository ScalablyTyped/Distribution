package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distLayoutSrcAdaptersMod.Orientation
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToolbarSrcToolbarContextMod {
  
  @JSImport("@orbit-ui/react-components/dist/toolbar/src/ToolbarContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ClearToolbar(hasChildren: ClearToolbarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearToolbar")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/toolbar/src/ToolbarContext", "ToolbarContext")
  @js.native
  val ToolbarContext: Context[ToolbarContextType] = js.native
  
  inline def useToolbarContext(): js.Tuple2[ToolbarContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useToolbarContext")().asInstanceOf[js.Tuple2[ToolbarContextType, Boolean]]
  
  inline def useToolbarProps(): js.Tuple2[UseToolbarPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useToolbarProps")().asInstanceOf[js.Tuple2[UseToolbarPropsReturn, Boolean]]
  
  trait ClearToolbarProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object ClearToolbarProps {
    
    inline def apply(): ClearToolbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearToolbarProps]
    }
    
    extension [Self <: ClearToolbarProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait ToolbarContextType extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var orientation: js.UndefOr[Orientation] = js.undefined
  }
  object ToolbarContextType {
    
    inline def apply(): ToolbarContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarContextType]
    }
    
    extension [Self <: ToolbarContextType](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    }
  }
  
  type UseToolbarPropsReturn = ToolbarContextType
}
