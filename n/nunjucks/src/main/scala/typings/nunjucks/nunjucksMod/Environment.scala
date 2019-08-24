package typings.nunjucks.nunjucksMod

import typings.nunjucks.Anon_Autoescape
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nunjucks", "Environment")
@js.native
class Environment () extends js.Object {
  def this(loader: js.Array[ILoader]) = this()
  def this(loader: ILoader) = this()
  def this(loader: js.Array[ILoader], opts: ConfigureOptions) = this()
  def this(loader: Null, opts: ConfigureOptions) = this()
  def this(loader: ILoader, opts: ConfigureOptions) = this()
  var options: Anon_Autoescape = js.native
  def addExtension(name: String, ext: Extension): Unit = js.native
  def addFilter(name: String, func: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def addFilter(name: String, func: js.Function1[/* repeated */ js.Any, _], async: Boolean): Unit = js.native
  def addGlobal(name: String, value: js.Any): Unit = js.native
  def express(app: js.Object): Unit = js.native
  def getExtension(name: String): Extension = js.native
  def getFilter(name: String): Unit = js.native
  def getTemplate(name: String): Template = js.native
  def getTemplate(name: String, eagerCompile: Boolean): Template = js.native
  def getTemplate(name: String, eagerCompile: Boolean, callback: Callback[Error, Template]): Unit = js.native
  @JSName("getTemplate")
  def getTemplate_Unit(name: String): Unit = js.native
  @JSName("getTemplate")
  def getTemplate_Unit(name: String, eagerCompile: Boolean): Unit = js.native
  def hasExtension(name: String): Unit = js.native
  def removeExtension(name: String): Unit = js.native
  def render(name: String): String = js.native
  def render(name: String, context: js.Object): String = js.native
  def render(name: String, context: js.Object, callback: TemplateCallback[String]): Unit = js.native
  def renderString(name: String, context: js.Object): String = js.native
  def renderString(name: String, context: js.Object, callback: TemplateCallback[String]): Unit = js.native
  @JSName("renderString")
  def renderString_Unit(name: String, context: js.Object): Unit = js.native
  @JSName("render")
  def render_Unit(name: String): Unit = js.native
  @JSName("render")
  def render_Unit(name: String, context: js.Object): Unit = js.native
}

