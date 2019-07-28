package typings.paper.paperMod

import typings.paper.paperNs.Settings
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var project: typings.paper.paperNs.Project = js.native
  var projects: js.Array[typings.paper.paperNs.Project] = js.native
  var settings: Settings = js.native
  var tool: typings.paper.paperNs.Tool = js.native
  var tools: js.Array[typings.paper.paperNs.Tool] = js.native
  var version: String = js.native
  var view: typings.paper.paperNs.View = js.native
  def activate(): Unit = js.native
  def install(scope: js.Any): Unit = js.native
  def setup(canvas: String): Unit = js.native
  def setup(canvas: HTMLCanvasElement): Unit = js.native
}

