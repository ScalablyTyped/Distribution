package typings
package paperLib.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var project: paperLib.paperNs.Project = js.native
  var projects: js.Array[paperLib.paperNs.Project] = js.native
  var settings: paperLib.paperNs.Settings = js.native
  var tool: paperLib.paperNs.Tool = js.native
  var tools: js.Array[paperLib.paperNs.Tool] = js.native
  var version: java.lang.String = js.native
  var view: paperLib.paperNs.View = js.native
  def activate(): scala.Unit = js.native
  def install(scope: js.Any): scala.Unit = js.native
  def setup(canvas: java.lang.String): scala.Unit = js.native
  def setup(canvas: stdLib.HTMLCanvasElement): scala.Unit = js.native
}

