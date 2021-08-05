package typings.plottable.mod

import typings.plottable.plottableStrings.animationFrame
import typings.plottable.plottableStrings.immediate
import typings.plottable.plottableStrings.timeout
import typings.plottable.renderControllerMod.Policy
import typings.plottable.renderPolicyMod.IRenderPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RenderController {
  
  @JSImport("plottable", "RenderController")
  @js.native
  val ^ : js.Any = js.native
  
  object Policy {
    
    @JSImport("plottable", "RenderController.Policy")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "RenderController.Policy.animationFrame")
    @js.native
    def animationFrame: typings.plottable.plottableStrings.animationFrame = js.native
    inline def animationFrame_=(x: animationFrame): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animationFrame")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "RenderController.Policy.immediate")
    @js.native
    def immediate: typings.plottable.plottableStrings.immediate = js.native
    inline def immediate_=(x: immediate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("immediate")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "RenderController.Policy.timeout")
    @js.native
    def timeout: typings.plottable.plottableStrings.timeout = js.native
    inline def timeout_=(x: timeout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
  
  inline def registerToComputeLayout(component: typings.plottable.componentMod.Component): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerToComputeLayout")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerToComputeLayoutAndRender(component: typings.plottable.componentMod.Component): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerToComputeLayoutAndRender")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerToRender(component: typings.plottable.componentMod.Component): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerToRender")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def renderPolicy(): IRenderPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("renderPolicy")().asInstanceOf[IRenderPolicy]
  inline def renderPolicy(renderPolicy: Policy): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("renderPolicy")(renderPolicy.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
