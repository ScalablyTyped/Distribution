package typings
package nunjucksLib.nunjucksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nunjucks", "Environment")
@js.native
class Environment () extends js.Object {
  def this(loader: js.Array[ILoader]) = this()
  def this(loader: ILoader) = this()
  def this(loader: js.Array[ILoader], opts: ConfigureOptions) = this()
  def this(loader: ILoader, opts: ConfigureOptions) = this()
  def this(loader: scala.Null, opts: ConfigureOptions) = this()
  var options: nunjucksLib.Anon_Autoescape = js.native
  def addExtension(name: java.lang.String, ext: Extension): scala.Unit = js.native
  def addFilter(name: java.lang.String, func: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  def addFilter(name: java.lang.String, func: js.Function1[/* repeated */ js.Any, _], async: scala.Boolean): scala.Unit = js.native
  def addGlobal(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def express(app: js.Object): scala.Unit = js.native
  def getExtension(name: java.lang.String): Extension = js.native
  def getFilter(name: java.lang.String): scala.Unit = js.native
  def getTemplate(name: java.lang.String): Template = js.native
  def getTemplate(name: java.lang.String, eagerCompile: scala.Boolean): Template = js.native
  def getTemplate(
    name: java.lang.String,
    eagerCompile: scala.Boolean,
    callback: js.Function2[/* err */ js.Any, /* templ */ Template, Template]
  ): scala.Unit = js.native
  @JSName("getTemplate")
  def getTemplate_Unit(name: java.lang.String): scala.Unit = js.native
  @JSName("getTemplate")
  def getTemplate_Unit(name: java.lang.String, eagerCompile: scala.Boolean): scala.Unit = js.native
  def hasExtension(name: java.lang.String): scala.Unit = js.native
  def removeExtension(name: java.lang.String): scala.Unit = js.native
  def render(name: java.lang.String): java.lang.String = js.native
  def render(name: java.lang.String, context: js.Object): java.lang.String = js.native
  def render(
    name: java.lang.String,
    context: js.Object,
    callback: js.Function2[/* err */ js.Any, /* res */ java.lang.String, _]
  ): scala.Unit = js.native
  def renderString(name: java.lang.String, context: js.Object): java.lang.String = js.native
  def renderString(
    name: java.lang.String,
    context: js.Object,
    callback: js.Function2[/* err */ js.Any, /* res */ java.lang.String, _]
  ): scala.Unit = js.native
  @JSName("renderString")
  def renderString_Unit(name: java.lang.String, context: js.Object): scala.Unit = js.native
  @JSName("render")
  def render_Unit(name: java.lang.String): scala.Unit = js.native
  @JSName("render")
  def render_Unit(name: java.lang.String, context: js.Object): scala.Unit = js.native
}

