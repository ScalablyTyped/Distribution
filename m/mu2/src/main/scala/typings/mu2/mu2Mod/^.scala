package typings.mu2.mu2Mod

import typings.node.NodeJSNs.ReadableStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mu2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var root: String = js.native
  def clearCache(): Unit = js.native
  def clearCache(templateName: String): Unit = js.native
  def compile(filename: String, callback: js.Function2[/* err */ Error, /* parsed */ IParsed, Unit]): Unit = js.native
  def compileAndRender(templateName: String, view: js.Any): ReadableStream = js.native
  def compileText(name: String, template: String): IParsed = js.native
  def compileText(
    name: String,
    template: String,
    callback: js.Function2[/* err */ Error, /* parsed */ IParsed, Unit]
  ): Unit = js.native
  def compileText(template: String): IParsed = js.native
  def render(filenameOrParsed: String, view: js.Any): ReadableStream = js.native
  def render(filenameOrParsed: IParsed, view: js.Any): ReadableStream = js.native
  def renderText(template: String, view: js.Any): ReadableStream = js.native
  def renderText(template: String, view: js.Any, partials: js.Any): ReadableStream = js.native
}

