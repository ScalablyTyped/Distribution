package typings.officeUiFabricReact

import typings.enzyme.mod.ShallowWrapper
import typings.react.mod.Component
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shallowUntilTargetMod {
  
  @JSImport("office-ui-fabric-react/lib/common/shallowUntilTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shallowUntilTarget[P, S](componentInstance: ReactElement, TargetComponent: String): ShallowWrapper[js.Object, js.Object, Component[js.Object, js.Object, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowUntilTarget")(componentInstance.asInstanceOf[js.Any], TargetComponent.asInstanceOf[js.Any])).asInstanceOf[ShallowWrapper[js.Object, js.Object, Component[js.Object, js.Object, js.Any]]]
  inline def shallowUntilTarget[P, S](componentInstance: ReactElement, TargetComponent: String, options: IShallowUntilTarget): ShallowWrapper[js.Object, js.Object, Component[js.Object, js.Object, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowUntilTarget")(componentInstance.asInstanceOf[js.Any], TargetComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ShallowWrapper[js.Object, js.Object, Component[js.Object, js.Object, js.Any]]]
  
  trait IShallowRendererProps extends StObject {
    
    var disableLifecycleMethods: js.UndefOr[Boolean] = js.undefined
    
    var lifecycleExperimental: js.UndefOr[Boolean] = js.undefined
  }
  object IShallowRendererProps {
    
    inline def apply(): IShallowRendererProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShallowRendererProps]
    }
    
    extension [Self <: IShallowRendererProps](x: Self) {
      
      inline def setDisableLifecycleMethods(value: Boolean): Self = StObject.set(x, "disableLifecycleMethods", value.asInstanceOf[js.Any])
      
      inline def setDisableLifecycleMethodsUndefined: Self = StObject.set(x, "disableLifecycleMethods", js.undefined)
      
      inline def setLifecycleExperimental(value: Boolean): Self = StObject.set(x, "lifecycleExperimental", value.asInstanceOf[js.Any])
      
      inline def setLifecycleExperimentalUndefined: Self = StObject.set(x, "lifecycleExperimental", js.undefined)
    }
  }
  
  trait IShallowUntilTarget extends StObject {
    
    var maxTries: Double
    
    var shallowOptions: IShallowRendererProps
  }
  object IShallowUntilTarget {
    
    inline def apply(maxTries: Double, shallowOptions: IShallowRendererProps): IShallowUntilTarget = {
      val __obj = js.Dynamic.literal(maxTries = maxTries.asInstanceOf[js.Any], shallowOptions = shallowOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShallowUntilTarget]
    }
    
    extension [Self <: IShallowUntilTarget](x: Self) {
      
      inline def setMaxTries(value: Double): Self = StObject.set(x, "maxTries", value.asInstanceOf[js.Any])
      
      inline def setShallowOptions(value: IShallowRendererProps): Self = StObject.set(x, "shallowOptions", value.asInstanceOf[js.Any])
    }
  }
}
