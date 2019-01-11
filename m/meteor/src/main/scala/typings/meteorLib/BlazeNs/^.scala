package typings
package meteorLib.BlazeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Blaze")
@js.native
object ^ extends js.Object {
  var Template: meteorLib.BlazeNs.TemplateStatic = js.native
  var TemplateInstance: meteorLib.BlazeNs.TemplateInstanceStatic = js.native
  var View: meteorLib.BlazeNs.ViewStatic = js.native
  var currentView: meteorLib.BlazeNs.View = js.native
  def Each(argFunc: js.Function, contentFunc: js.Function): meteorLib.BlazeNs.View = js.native
  def Each(argFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): meteorLib.BlazeNs.View = js.native
  def If(conditionFunc: js.Function, contentFunc: js.Function): meteorLib.BlazeNs.View = js.native
  def If(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): meteorLib.BlazeNs.View = js.native
  def Let(bindings: js.Function, contentFunc: js.Function): meteorLib.BlazeNs.View = js.native
  def Unless(conditionFunc: js.Function, contentFunc: js.Function): meteorLib.BlazeNs.View = js.native
  def Unless(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): meteorLib.BlazeNs.View = js.native
  def With(data: js.Function, contentFunc: js.Function): meteorLib.BlazeNs.View = js.native
  def With(data: js.Object, contentFunc: js.Function): meteorLib.BlazeNs.View = js.native
  def getData(): js.Object = js.native
  def getData(elementOrView: meteorLib.BlazeNs.View): js.Object = js.native
  def getData(elementOrView: reactLib.HTMLElement): js.Object = js.native
  def getView(): meteorLib.BlazeNs.View = js.native
  def getView(element: reactLib.HTMLElement): meteorLib.BlazeNs.View = js.native
  def isTemplate(value: js.Any): scala.Boolean = js.native
  def remove(renderedView: meteorLib.BlazeNs.View): scala.Unit = js.native
  def render(templateOrView: meteorLib.BlazeNs.Template, parentNode: stdLib.Node): meteorLib.BlazeNs.View = js.native
  def render(templateOrView: meteorLib.BlazeNs.Template, parentNode: stdLib.Node, nextNode: stdLib.Node): meteorLib.BlazeNs.View = js.native
  def render(
    templateOrView: meteorLib.BlazeNs.Template,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: meteorLib.BlazeNs.View
  ): meteorLib.BlazeNs.View = js.native
  def render(templateOrView: meteorLib.BlazeNs.View, parentNode: stdLib.Node): meteorLib.BlazeNs.View = js.native
  def render(templateOrView: meteorLib.BlazeNs.View, parentNode: stdLib.Node, nextNode: stdLib.Node): meteorLib.BlazeNs.View = js.native
  def render(
    templateOrView: meteorLib.BlazeNs.View,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: meteorLib.BlazeNs.View
  ): meteorLib.BlazeNs.View = js.native
  def renderWithData(templateOrView: meteorLib.BlazeNs.Template, data: js.Function, parentNode: stdLib.Node): meteorLib.BlazeNs.View = js.native
  def renderWithData(
    templateOrView: meteorLib.BlazeNs.Template,
    data: js.Function,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node
  ): meteorLib.BlazeNs.View = js.native
  def renderWithData(
    templateOrView: meteorLib.BlazeNs.Template,
    data: js.Function,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: meteorLib.BlazeNs.View
  ): meteorLib.BlazeNs.View = js.native
  def renderWithData(templateOrView: meteorLib.BlazeNs.Template, data: js.Object, parentNode: stdLib.Node): meteorLib.BlazeNs.View = js.native
  def renderWithData(
    templateOrView: meteorLib.BlazeNs.Template,
    data: js.Object,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node
  ): meteorLib.BlazeNs.View = js.native
  def renderWithData(
    templateOrView: meteorLib.BlazeNs.Template,
    data: js.Object,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: meteorLib.BlazeNs.View
  ): meteorLib.BlazeNs.View = js.native
  def renderWithData(templateOrView: meteorLib.BlazeNs.View, data: js.Function, parentNode: stdLib.Node): meteorLib.BlazeNs.View = js.native
  def renderWithData(
    templateOrView: meteorLib.BlazeNs.View,
    data: js.Function,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node
  ): meteorLib.BlazeNs.View = js.native
  def renderWithData(
    templateOrView: meteorLib.BlazeNs.View,
    data: js.Function,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: meteorLib.BlazeNs.View
  ): meteorLib.BlazeNs.View = js.native
  def renderWithData(templateOrView: meteorLib.BlazeNs.View, data: js.Object, parentNode: stdLib.Node): meteorLib.BlazeNs.View = js.native
  def renderWithData(
    templateOrView: meteorLib.BlazeNs.View,
    data: js.Object,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node
  ): meteorLib.BlazeNs.View = js.native
  def renderWithData(
    templateOrView: meteorLib.BlazeNs.View,
    data: js.Object,
    parentNode: stdLib.Node,
    nextNode: stdLib.Node,
    parentView: meteorLib.BlazeNs.View
  ): meteorLib.BlazeNs.View = js.native
  def toHTML(templateOrView: meteorLib.BlazeNs.Template): java.lang.String = js.native
  def toHTML(templateOrView: meteorLib.BlazeNs.View): java.lang.String = js.native
  def toHTMLWithData(templateOrView: meteorLib.BlazeNs.Template, data: js.Function): java.lang.String = js.native
  def toHTMLWithData(templateOrView: meteorLib.BlazeNs.Template, data: js.Object): java.lang.String = js.native
  def toHTMLWithData(templateOrView: meteorLib.BlazeNs.View, data: js.Function): java.lang.String = js.native
  def toHTMLWithData(templateOrView: meteorLib.BlazeNs.View, data: js.Object): java.lang.String = js.native
}

