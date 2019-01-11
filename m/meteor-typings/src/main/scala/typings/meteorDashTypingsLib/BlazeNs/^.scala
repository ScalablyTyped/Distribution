package typings
package meteorDashTypingsLib.BlazeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Blaze")
@js.native
object ^ extends js.Object {
  var Template: meteorDashTypingsLib.BlazeNs.TemplateStatic = js.native
  var TemplateInstance: meteorDashTypingsLib.BlazeNs.TemplateInstanceStatic = js.native
  var View: meteorDashTypingsLib.BlazeNs.ViewStatic = js.native
  var currentView: meteorDashTypingsLib.BlazeNs.View = js.native
  def Each(argFunc: js.Function, contentFunc: js.Function): meteorDashTypingsLib.BlazeNs.View = js.native
  def Each(argFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): meteorDashTypingsLib.BlazeNs.View = js.native
  def If(conditionFunc: js.Function, contentFunc: js.Function): meteorDashTypingsLib.BlazeNs.View = js.native
  def If(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): meteorDashTypingsLib.BlazeNs.View = js.native
  def Let(bindings: js.Function, contentFunc: js.Function): meteorDashTypingsLib.BlazeNs.View = js.native
  def Unless(conditionFunc: js.Function, contentFunc: js.Function): meteorDashTypingsLib.BlazeNs.View = js.native
  def Unless(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): meteorDashTypingsLib.BlazeNs.View = js.native
  def With(data: js.Function, contentFunc: js.Function): meteorDashTypingsLib.BlazeNs.View = js.native
  def With(data: js.Object, contentFunc: js.Function): meteorDashTypingsLib.BlazeNs.View = js.native
  def getData(): js.Object = js.native
  def getData(elementOrView: meteorDashTypingsLib.BlazeNs.View): js.Object = js.native
  def getData(elementOrView: stdLib.HTMLElement): js.Object = js.native
  def getView(): meteorDashTypingsLib.BlazeNs.View = js.native
  def getView(element: stdLib.HTMLElement): meteorDashTypingsLib.BlazeNs.View = js.native
  def isTemplate(value: js.Any): scala.Boolean = js.native
  def remove(renderedView: meteorDashTypingsLib.BlazeNs.View): scala.Unit = js.native
  def render(templateOrView: meteorDashTypingsLib.BlazeNs.Template, parentNode: stdLib.Node): meteorDashTypingsLib.BlazeNs.View = js.native
  def render(
    templateOrView: meteorDashTypingsLib.BlazeNs.Template,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node
  ): meteorDashTypingsLib.BlazeNs.View = js.native
  def render(
    templateOrView: meteorDashTypingsLib.BlazeNs.Template,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: meteorDashTypingsLib.BlazeNs.View
  ): meteorDashTypingsLib.BlazeNs.View = js.native
  def render(templateOrView: meteorDashTypingsLib.BlazeNs.View, parentNode: stdLib.Node): meteorDashTypingsLib.BlazeNs.View = js.native
  def render(templateOrView: meteorDashTypingsLib.BlazeNs.View, parentNode: stdLib.Node, nextNode: stdLib.Node): meteorDashTypingsLib.BlazeNs.View = js.native
  def render(
    templateOrView: meteorDashTypingsLib.BlazeNs.View,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: meteorDashTypingsLib.BlazeNs.View
  ): meteorDashTypingsLib.BlazeNs.View = js.native
  def renderWithData(templateOrView: meteorDashTypingsLib.BlazeNs.Template, data: js.Function, parentNode: stdLib.Node): meteorDashTypingsLib.BlazeNs.View = js.native
  def renderWithData(
    templateOrView: meteorDashTypingsLib.BlazeNs.Template,
    data: js.Function,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node
  ): meteorDashTypingsLib.BlazeNs.View = js.native
  def renderWithData(
    templateOrView: meteorDashTypingsLib.BlazeNs.Template,
    data: js.Function,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: meteorDashTypingsLib.BlazeNs.View
  ): meteorDashTypingsLib.BlazeNs.View = js.native
  def renderWithData(templateOrView: meteorDashTypingsLib.BlazeNs.Template, data: js.Object, parentNode: stdLib.Node): meteorDashTypingsLib.BlazeNs.View = js.native
  def renderWithData(
    templateOrView: meteorDashTypingsLib.BlazeNs.Template,
    data: js.Object,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node
  ): meteorDashTypingsLib.BlazeNs.View = js.native
  def renderWithData(
    templateOrView: meteorDashTypingsLib.BlazeNs.Template,
    data: js.Object,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: meteorDashTypingsLib.BlazeNs.View
  ): meteorDashTypingsLib.BlazeNs.View = js.native
  def renderWithData(templateOrView: meteorDashTypingsLib.BlazeNs.View, data: js.Function, parentNode: stdLib.Node): meteorDashTypingsLib.BlazeNs.View = js.native
  def renderWithData(
    templateOrView: meteorDashTypingsLib.BlazeNs.View,
    data: js.Function,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node
  ): meteorDashTypingsLib.BlazeNs.View = js.native
  def renderWithData(
    templateOrView: meteorDashTypingsLib.BlazeNs.View,
    data: js.Function,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: meteorDashTypingsLib.BlazeNs.View
  ): meteorDashTypingsLib.BlazeNs.View = js.native
  def renderWithData(templateOrView: meteorDashTypingsLib.BlazeNs.View, data: js.Object, parentNode: stdLib.Node): meteorDashTypingsLib.BlazeNs.View = js.native
  def renderWithData(
    templateOrView: meteorDashTypingsLib.BlazeNs.View,
    data: js.Object,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node
  ): meteorDashTypingsLib.BlazeNs.View = js.native
  def renderWithData(
    templateOrView: meteorDashTypingsLib.BlazeNs.View,
    data: js.Object,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: meteorDashTypingsLib.BlazeNs.View
  ): meteorDashTypingsLib.BlazeNs.View = js.native
  def toHTML(templateOrView: meteorDashTypingsLib.BlazeNs.Template): java.lang.String = js.native
  def toHTML(templateOrView: meteorDashTypingsLib.BlazeNs.View): java.lang.String = js.native
  def toHTMLWithData(templateOrView: meteorDashTypingsLib.BlazeNs.Template, data: js.Function): java.lang.String = js.native
  def toHTMLWithData(templateOrView: meteorDashTypingsLib.BlazeNs.Template, data: js.Object): java.lang.String = js.native
  def toHTMLWithData(templateOrView: meteorDashTypingsLib.BlazeNs.View, data: js.Function): java.lang.String = js.native
  def toHTMLWithData(templateOrView: meteorDashTypingsLib.BlazeNs.View, data: js.Object): java.lang.String = js.native
}

