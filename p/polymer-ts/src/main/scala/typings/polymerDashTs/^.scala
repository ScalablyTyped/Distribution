package typings.polymerDashTs

import typings.polymerDashTs.polymerNs.Element
import typings.polymerDashTs.polymerNs.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  def behavior(behaviorObject: js.Any): js.Any = js.native
  def component(tagname: String): js.Function1[/* target */ js.Function, Unit] = js.native
  def component(tagname: String, extendsTag: String): js.Function1[/* target */ js.Function, Unit] = js.native
  def computed(): js.Function2[/* target */ Element, /* computedFuncName */ String, Unit] = js.native
  def computed(ob: Property): js.Function2[/* target */ Element, /* computedFuncName */ String, Unit] = js.native
  def extend(tagname: String): js.Function1[/* target */ js.Function, Unit] = js.native
  def hostAttributes(attributes: js.Object): js.Function1[/* target */ js.Function, Unit] = js.native
  def listen(eventName: String): js.Function2[/* target */ Element, /* propertyKey */ String, Unit] = js.native
  def observe(observedProps: String): js.Function2[/* target */ Element, /* observerFuncName */ String, Unit] = js.native
  def property(): js.Function2[/* target */ Element, /* propertyKey */ String, Unit] = js.native
  def property(ob: Property): js.Function2[/* target */ Element, /* propertyKey */ String, Unit] = js.native
  def style(styleString: String): js.Function1[/* target */ js.Function, Unit] = js.native
  def template(templateString: String): js.Function1[/* target */ js.Function, Unit] = js.native
}

