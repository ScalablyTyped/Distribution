package typings
package meteorDashTypingsLib.BlazeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Blaze")
@js.native
object BlazeNsMembers extends js.Object {
  var Template: TemplateStatic = js.native
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
  def getData(elementOrView: stdLib.HTMLElement): js.Object = js.native
  def getView(): View = js.native
  def getView(element: stdLib.HTMLElement): View = js.native
  def isTemplate(value: js.Any): scala.Boolean = js.native
  def remove(renderedView: View): scala.Unit = js.native
  def render(templateOrView: Template, parentNode: stdLib.Node): View = js.native
  def render(templateOrView: Template, parentNode: stdLib.Node, nextNode: stdLib.Node): View = js.native
  def render(templateOrView: Template, parentNode: stdLib.Node, nextNode: stdLib.Node, parentView: View): View = js.native
  def render(templateOrView: View, parentNode: stdLib.Node): View = js.native
  def render(templateOrView: View, parentNode: stdLib.Node, nextNode: stdLib.Node): View = js.native
  def render(templateOrView: View, parentNode: stdLib.Node, nextNode: stdLib.Node, parentView: View): View = js.native
  def renderWithData(templateOrView: Template, data: js.Function, parentNode: stdLib.Node): View = js.native
  def renderWithData(templateOrView: Template, data: js.Function, parentNode: stdLib.Node, nextNode: stdLib.Node): View = js.native
  def renderWithData(
    templateOrView: Template,
    data: js.Function,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: View
  ): View = js.native
  def renderWithData(templateOrView: Template, data: js.Object, parentNode: stdLib.Node): View = js.native
  def renderWithData(templateOrView: Template, data: js.Object, parentNode: stdLib.Node, nextNode: stdLib.Node): View = js.native
  def renderWithData(
    templateOrView: Template,
    data: js.Object,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: View
  ): View = js.native
  def renderWithData(templateOrView: View, data: js.Function, parentNode: stdLib.Node): View = js.native
  def renderWithData(templateOrView: View, data: js.Function, parentNode: stdLib.Node, nextNode: stdLib.Node): View = js.native
  def renderWithData(
    templateOrView: View,
    data: js.Function,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: View
  ): View = js.native
  def renderWithData(templateOrView: View, data: js.Object, parentNode: stdLib.Node): View = js.native
  def renderWithData(templateOrView: View, data: js.Object, parentNode: stdLib.Node, nextNode: stdLib.Node): View = js.native
  def renderWithData(
    templateOrView: View,
    data: js.Object,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: View
  ): View = js.native
  def toHTML(templateOrView: Template): java.lang.String = js.native
  def toHTML(templateOrView: View): java.lang.String = js.native
  def toHTMLWithData(templateOrView: Template, data: js.Function): java.lang.String = js.native
  def toHTMLWithData(templateOrView: Template, data: js.Object): java.lang.String = js.native
  def toHTMLWithData(templateOrView: View, data: js.Function): java.lang.String = js.native
  def toHTMLWithData(templateOrView: View, data: js.Object): java.lang.String = js.native
}

