package typings.nunjucks.mod

import typings.nunjucks.AnonAutoescape
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
  var options: AnonAutoescape = js.native
  def addExtension(name: String, ext: Extension): Environment = js.native
  def addFilter(name: String, func: js.Function1[/* repeated */ js.Any, _]): Environment = js.native
  def addFilter(name: String, func: js.Function1[/* repeated */ js.Any, _], async: Boolean): Environment = js.native
  def addGlobal(name: String, value: js.Any): Environment = js.native
  def express(app: js.Object): Unit = js.native
  def getExtension(name: String): Extension = js.native
  def getFilter(name: String): js.Function1[/* repeated */ js.Any, _] = js.native
  def getGlobal(name: String): js.Any = js.native
  def getTemplate(name: String): Unit = js.native
  def getTemplate(name: String, eagerCompile: Boolean): Unit = js.native
  def getTemplate(name: String, eagerCompile: Boolean, callback: Callback[Error, Template]): Unit = js.native
  @JSName("getTemplate")
  def getTemplate_Template(name: String): Template = js.native
  @JSName("getTemplate")
  def getTemplate_Template(name: String, eagerCompile: Boolean): Template = js.native
  def hasExtension(name: String): Boolean = js.native
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

