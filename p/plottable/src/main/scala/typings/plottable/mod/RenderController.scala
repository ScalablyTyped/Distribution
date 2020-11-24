package typings.plottable.mod

import typings.plottable.renderControllerMod.Policy
import typings.plottable.renderPolicyMod.IRenderPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable", "RenderController")
@js.native
object RenderController extends js.Object {
  
  def flush(): Unit = js.native
  
  def registerToComputeLayout(component: typings.plottable.componentMod.Component): Unit = js.native
  
  def registerToComputeLayoutAndRender(component: typings.plottable.componentMod.Component): Unit = js.native
  
  def registerToRender(component: typings.plottable.componentMod.Component): Unit = js.native
  
  def renderPolicy(): IRenderPolicy = js.native
  def renderPolicy(renderPolicy: Policy): Unit = js.native
  
  @js.native
  object Policy extends js.Object {
    
    var animationFrame: typings.plottable.plottableStrings.animationFrame = js.native
    
    var immediate: typings.plottable.plottableStrings.immediate = js.native
    
    var timeout: typings.plottable.plottableStrings.timeout = js.native
  }
}
