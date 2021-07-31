package typings.plottable

import typings.plottable.componentMod.Component
import typings.plottable.plottableStrings.animationFrame
import typings.plottable.plottableStrings.immediate
import typings.plottable.plottableStrings.timeout
import typings.plottable.renderPolicyMod.IRenderPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderControllerMod {
  
  @JSImport("plottable/build/src/core/renderController", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* keyof plottable.anon.AnimationFrame */ /* Rewritten from type alias, can be one of: 
    - typings.plottable.plottableStrings.immediate
    - typings.plottable.plottableStrings.animationFrame
    - typings.plottable.plottableStrings.timeout
  */
  trait Policy extends StObject
  object Policy {
    
    @JSImport("plottable/build/src/core/renderController", "Policy")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/core/renderController", "Policy.animationFrame")
    @js.native
    def animationFrame: typings.plottable.plottableStrings.animationFrame = js.native
    @scala.inline
    def animationFrame_=(x: animationFrame): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animationFrame")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/core/renderController", "Policy.immediate")
    @js.native
    def immediate: typings.plottable.plottableStrings.immediate = js.native
    @scala.inline
    def immediate_=(x: immediate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("immediate")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/core/renderController", "Policy.timeout")
    @js.native
    def timeout: typings.plottable.plottableStrings.timeout = js.native
    @scala.inline
    def timeout_=(x: timeout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
  
  @scala.inline
  def registerToComputeLayout(component: Component): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerToComputeLayout")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def registerToComputeLayoutAndRender(component: Component): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerToComputeLayoutAndRender")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def registerToRender(component: Component): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerToRender")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def renderPolicy(): IRenderPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("renderPolicy")().asInstanceOf[IRenderPolicy]
  @scala.inline
  def renderPolicy(renderPolicy: Policy): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("renderPolicy")(renderPolicy.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
