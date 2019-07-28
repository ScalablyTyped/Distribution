package typings.paper.paperNs

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper")
@js.native
object ^ extends js.Object {
  var project: Project = js.native
  var projects: js.Array[Project] = js.native
  var settings: Settings = js.native
  var tool: Tool = js.native
  var tools: js.Array[Tool] = js.native
  var version: String = js.native
  var view: View = js.native
  def activate(): Unit = js.native
  def install(scope: js.Any): Unit = js.native
  def setup(canvas: String): Unit = js.native
  def setup(canvas: HTMLCanvasElement): Unit = js.native
}

