package typings.octokitRest

import org.scalablytyped.runtime.Instantiable0
import typings.octokitCore.AnonInstantiablePlugins
import typings.octokitCore.AnonPlugins
import typings.octokitCore.mod.Octokit
import typings.octokitCore.typesMod.Constructor
import typings.octokitCore.typesMod.OctokitOptions
import typings.octokitCore.typesMod.OctokitPlugin
import typings.octokitCore.typesMod.ReturnTypeOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCore extends Instantiable0[Octokit] {
  var VERSION: String = js.native
  var plugins: js.Array[OctokitPlugin] = js.native
  def defaults[S /* <: Constructor[_] */](defaults: OctokitOptions): typings.octokitCore.AnonInstantiable with S = js.native
  def plugin[S /* <: Constructor[_] with AnonPlugins */, T /* <: OctokitPlugin | js.Array[OctokitPlugin] */](pluginOrPlugins: T): AnonInstantiablePlugins with S with Constructor[ReturnTypeOf[T]] = js.native
}

