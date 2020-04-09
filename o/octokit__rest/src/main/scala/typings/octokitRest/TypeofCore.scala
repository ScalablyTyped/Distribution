package typings.octokitRest

import org.scalablytyped.runtime.Instantiable0
import typings.octokitCore.AnonInstantiablePlugins
import typings.octokitCore.AnonPlugins
import typings.octokitCore.mod.Octokit
import typings.octokitCore.typesMod.Constructor
import typings.octokitCore.typesMod.OctokitOptions
import typings.octokitCore.typesMod.OctokitPlugin
import typings.octokitCore.typesMod.ReturnTypeOf
import typings.octokitCore.typesMod.UnionToIntersection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCore extends Instantiable0[Octokit] {
  var VERSION: String = js.native
  var plugins: js.Array[OctokitPlugin] = js.native
  def defaults[S /* <: Constructor[_] */](defaults: OctokitOptions): typings.octokitCore.AnonInstantiable with S = js.native
  /**
    * Attach a plugin (or many) to your Octokit instance.
    *
    * @example
    * const API = Octokit.plugin(plugin1, plugin2, plugin3, ...)
    */
  def plugin[S /* <: Constructor[_] with AnonPlugins */, T1 /* <: OctokitPlugin | js.Array[OctokitPlugin] */, T2 /* <: js.Array[OctokitPlugin] */](
    p1: T1,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param p2 because its type T2 is not an array type */ p2: T2
  ): AnonInstantiablePlugins with S with (Constructor[UnionToIntersection[ReturnTypeOf[T1] with ReturnTypeOf[T2]]]) = js.native
}

