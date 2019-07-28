package typings.meteorDashTypings.BlazeNs

import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Blaze")
@js.native
object ^ extends js.Object {
  var Template: typings.meteorDashTypings.BlazeNs.TemplateStatic = js.native
  var TemplateInstance: TemplateInstanceStatic = js.native
  var View: ViewStatic = js.native
  var currentView: View = js.native
  def Each(argFunc: js.Function, contentFunc: js.Function): View = js.native
  def Each(argFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = js.native
  def If(conditionFunc: js.Function, contentFunc: js.Function): View = js.native
  def If(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = js.native
  def Let(bindings: js.Function, contentFunc: js.Function): View = js.native
  def Unless(conditionFunc: js.Function, contentFunc: js.Function): View = js.native
  def Unless(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = js.native
  def With(data: js.Function, contentFunc: js.Function): View = js.native
  def With(data: js.Object, contentFunc: js.Function): View = js.native
  def getData(): js.Object = js.native
  def getData(elementOrView: View): js.Object = js.native
  def getData(elementOrView: HTMLElement): js.Object = js.native
  def getView(): View = js.native
  def getView(element: HTMLElement): View = js.native
  def isTemplate(value: js.Any): Boolean = js.native
  def remove(renderedView: View): Unit = js.native
  def render(templateOrView: typings.meteorDashTypings.BlazeNs.Template, parentNode: Node): View = js.native
  def render(templateOrView: typings.meteorDashTypings.BlazeNs.Template, parentNode: Node, nextNode: Node): View = js.native
  def render(
    templateOrView: typings.meteorDashTypings.BlazeNs.Template,
    parentNode: Node,
    nextNode: Node,
    parentView: View
  ): View = js.native
  def render(templateOrView: View, parentNode: Node): View = js.native
  def render(templateOrView: View, parentNode: Node, nextNode: Node): View = js.native
  def render(templateOrView: View, parentNode: Node, nextNode: Node, parentView: View): View = js.native
  def renderWithData(templateOrView: typings.meteorDashTypings.BlazeNs.Template, data: js.Function, parentNode: Node): View = js.native
  def renderWithData(
    templateOrView: typings.meteorDashTypings.BlazeNs.Template,
    data: js.Function,
    parentNode: Node,
    nextNode: Node
  ): View = js.native
  def renderWithData(
    templateOrView: typings.meteorDashTypings.BlazeNs.Template,
    data: js.Function,
    parentNode: Node,
    nextNode: Node,
    parentView: View
  ): View = js.native
  def renderWithData(templateOrView: typings.meteorDashTypings.BlazeNs.Template, data: js.Object, parentNode: Node): View = js.native
  def renderWithData(
    templateOrView: typings.meteorDashTypings.BlazeNs.Template,
    data: js.Object,
    parentNode: Node,
    nextNode: Node
  ): View = js.native
  def renderWithData(
    templateOrView: typings.meteorDashTypings.BlazeNs.Template,
    data: js.Object,
    parentNode: Node,
    nextNode: Node,
    parentView: View
  ): View = js.native
  def renderWithData(templateOrView: View, data: js.Function, parentNode: Node): View = js.native
  def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Node): View = js.native
  def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Node, parentView: View): View = js.native
  def renderWithData(templateOrView: View, data: js.Object, parentNode: Node): View = js.native
  def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Node): View = js.native
  def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Node, parentView: View): View = js.native
  def toHTML(templateOrView: typings.meteorDashTypings.BlazeNs.Template): String = js.native
  def toHTML(templateOrView: View): String = js.native
  def toHTMLWithData(templateOrView: typings.meteorDashTypings.BlazeNs.Template, data: js.Function): String = js.native
  def toHTMLWithData(templateOrView: typings.meteorDashTypings.BlazeNs.Template, data: js.Object): String = js.native
  def toHTMLWithData(templateOrView: View, data: js.Function): String = js.native
  def toHTMLWithData(templateOrView: View, data: js.Object): String = js.native
}

