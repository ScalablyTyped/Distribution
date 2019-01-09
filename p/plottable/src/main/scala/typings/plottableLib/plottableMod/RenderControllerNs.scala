package typings
package plottableLib.plottableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "RenderController")
@js.native
object RenderControllerNs extends js.Object {
  val Policy: plottableLib.Anon_AnimationFrame = js.native
  def flush(): scala.Unit = js.native
  def registerToComputeLayout(component: plottableLib.buildSrcComponentsComponentMod.Component): scala.Unit = js.native
  def registerToComputeLayoutAndRender(component: plottableLib.buildSrcComponentsComponentMod.Component): scala.Unit = js.native
  def registerToRender(component: plottableLib.buildSrcComponentsComponentMod.Component): scala.Unit = js.native
  def renderPolicy(): plottableLib.buildSrcCoreRenderPolicyMod.IRenderPolicy = js.native
  def renderPolicy(renderPolicy: plottableLib.buildSrcCoreRenderControllerMod.Policy): scala.Unit = js.native
}

