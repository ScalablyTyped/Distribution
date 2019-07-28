package typings.nunjucks.nunjucksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nunjucks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compile(src: String): Template = js.native
  def compile(src: String, env: Environment): Template = js.native
  def compile(src: String, env: Environment, callback: js.Function2[/* err */ js.Any, /* res */ Template, _]): Template = js.native
  def configure(options: ConfigureOptions): Environment = js.native
  def configure(path: String): Environment = js.native
  def configure(path: String, options: ConfigureOptions): Environment = js.native
  def configure(path: js.Array[String]): Environment = js.native
  def configure(path: js.Array[String], options: ConfigureOptions): Environment = js.native
  def installJinjaCompat(): Unit = js.native
  def precompile(path: String): String = js.native
  def precompile(path: String, opts: PrecompileOptions): String = js.native
  def precompileString(src: String): String = js.native
  def precompileString(src: String, opts: PrecompileOptions): String = js.native
  def render(name: String): String = js.native
  def render(name: String, context: js.Object): String = js.native
  def render(name: String, context: js.Object, callback: js.Function2[/* err */ js.Any, /* res */ String, _]): Unit = js.native
  def renderString(src: String, context: js.Object): String = js.native
  def renderString(src: String, context: js.Object, callback: js.Function2[/* err */ js.Any, /* res */ String, _]): Unit = js.native
  @JSName("renderString")
  def renderString_Unit(src: String, context: js.Object): Unit = js.native
  @JSName("render")
  def render_Unit(name: String): Unit = js.native
  @JSName("render")
  def render_Unit(name: String, context: js.Object): Unit = js.native
}

