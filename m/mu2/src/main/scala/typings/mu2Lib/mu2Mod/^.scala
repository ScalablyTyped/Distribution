package typings
package mu2Lib.mu2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mu2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var root: java.lang.String = js.native
  def clearCache(): scala.Unit = js.native
  def clearCache(templateName: java.lang.String): scala.Unit = js.native
  def compile(
    filename: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* parsed */ IParsed, scala.Unit]
  ): scala.Unit = js.native
  def compileAndRender(templateName: java.lang.String, view: js.Any): nodeLib.NodeJSNs.ReadableStream = js.native
  def compileText(name: java.lang.String, template: java.lang.String): IParsed = js.native
  def compileText(
    name: java.lang.String,
    template: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* parsed */ IParsed, scala.Unit]
  ): scala.Unit = js.native
  def compileText(template: java.lang.String): IParsed = js.native
  def render(filenameOrParsed: java.lang.String, view: js.Any): nodeLib.NodeJSNs.ReadableStream = js.native
  def render(filenameOrParsed: IParsed, view: js.Any): nodeLib.NodeJSNs.ReadableStream = js.native
  def renderText(template: java.lang.String, view: js.Any): nodeLib.NodeJSNs.ReadableStream = js.native
  def renderText(template: java.lang.String, view: js.Any, partials: js.Any): nodeLib.NodeJSNs.ReadableStream = js.native
}

