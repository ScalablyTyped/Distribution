package typings
package nunjucksLib.nunjucksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nunjucks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compile(src: java.lang.String): nunjucksLib.nunjucksMod.Template = js.native
  def compile(src: java.lang.String, env: nunjucksLib.nunjucksMod.Environment): nunjucksLib.nunjucksMod.Template = js.native
  def compile(
    src: java.lang.String,
    env: nunjucksLib.nunjucksMod.Environment,
    callback: js.Function2[/* err */ js.Any, /* res */ nunjucksLib.nunjucksMod.Template, _]
  ): nunjucksLib.nunjucksMod.Template = js.native
  def configure(options: nunjucksLib.nunjucksMod.ConfigureOptions): nunjucksLib.nunjucksMod.Environment = js.native
  def configure(path: java.lang.String): nunjucksLib.nunjucksMod.Environment = js.native
  def configure(path: java.lang.String, options: nunjucksLib.nunjucksMod.ConfigureOptions): nunjucksLib.nunjucksMod.Environment = js.native
  def configure(path: js.Array[java.lang.String]): nunjucksLib.nunjucksMod.Environment = js.native
  def configure(path: js.Array[java.lang.String], options: nunjucksLib.nunjucksMod.ConfigureOptions): nunjucksLib.nunjucksMod.Environment = js.native
  def installJinjaCompat(): scala.Unit = js.native
  def precompile(path: java.lang.String): java.lang.String = js.native
  def precompile(path: java.lang.String, opts: nunjucksLib.nunjucksMod.PrecompileOptions): java.lang.String = js.native
  def precompileString(src: java.lang.String): java.lang.String = js.native
  def precompileString(src: java.lang.String, opts: nunjucksLib.nunjucksMod.PrecompileOptions): java.lang.String = js.native
  def render(name: java.lang.String): java.lang.String = js.native
  def render(name: java.lang.String, context: js.Object): java.lang.String = js.native
  def render(
    name: java.lang.String,
    context: js.Object,
    callback: js.Function2[/* err */ js.Any, /* res */ java.lang.String, _]
  ): scala.Unit = js.native
  def renderString(src: java.lang.String, context: js.Object): java.lang.String = js.native
  def renderString(
    src: java.lang.String,
    context: js.Object,
    callback: js.Function2[/* err */ js.Any, /* res */ java.lang.String, _]
  ): scala.Unit = js.native
  @JSName("renderString")
  def renderString_Unit(src: java.lang.String, context: js.Object): scala.Unit = js.native
  @JSName("render")
  def render_Unit(name: java.lang.String): scala.Unit = js.native
  @JSName("render")
  def render_Unit(name: java.lang.String, context: js.Object): scala.Unit = js.native
}

