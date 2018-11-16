package typings
package polymerDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object polymerDashTsLibMembers extends js.Object {
  def behavior(behaviorObject: js.Any): js.Any = js.native
  def component(tagname: java.lang.String): js.Function1[/* target */ js.Function, scala.Unit] = js.native
  def component(tagname: java.lang.String, extendsTag: java.lang.String): js.Function1[/* target */ js.Function, scala.Unit] = js.native
  def computed(): js.Function2[
    /* target */ polymerDashTsLib.polymerNs.Element, 
    /* computedFuncName */ java.lang.String, 
    scala.Unit
  ] = js.native
  def computed(ob: polymerDashTsLib.polymerNs.Property): js.Function2[
    /* target */ polymerDashTsLib.polymerNs.Element, 
    /* computedFuncName */ java.lang.String, 
    scala.Unit
  ] = js.native
  def extend(tagname: java.lang.String): js.Function1[/* target */ js.Function, scala.Unit] = js.native
  def hostAttributes(attributes: js.Object): js.Function1[/* target */ js.Function, scala.Unit] = js.native
  def listen(eventName: java.lang.String): js.Function2[
    /* target */ polymerDashTsLib.polymerNs.Element, 
    /* propertyKey */ java.lang.String, 
    scala.Unit
  ] = js.native
  def observe(observedProps: java.lang.String): js.Function2[
    /* target */ polymerDashTsLib.polymerNs.Element, 
    /* observerFuncName */ java.lang.String, 
    scala.Unit
  ] = js.native
  def property(): js.Function2[
    /* target */ polymerDashTsLib.polymerNs.Element, 
    /* propertyKey */ java.lang.String, 
    scala.Unit
  ] = js.native
  def property(ob: polymerDashTsLib.polymerNs.Property): js.Function2[
    /* target */ polymerDashTsLib.polymerNs.Element, 
    /* propertyKey */ java.lang.String, 
    scala.Unit
  ] = js.native
  def style(styleString: java.lang.String): js.Function1[/* target */ js.Function, scala.Unit] = js.native
  def template(templateString: java.lang.String): js.Function1[/* target */ js.Function, scala.Unit] = js.native
}

