package typings
package nunjucksLib.nunjucksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nunjucks", "Template")
@js.native
class Template protected () extends js.Object {
  def this(src: java.lang.String) = this()
  def this(src: java.lang.String, env: Environment) = this()
  def this(src: java.lang.String, env: Environment, eagerCompile: scala.Boolean) = this()
  def render(): java.lang.String = js.native
  def render(context: js.Object): java.lang.String = js.native
  def render(context: js.Object, callback: js.Function2[/* err */ js.Any, /* res */ java.lang.String, _]): scala.Unit = js.native
  @JSName("render")
  def render_Unit(): scala.Unit = js.native
  @JSName("render")
  def render_Unit(context: js.Object): scala.Unit = js.native
}

