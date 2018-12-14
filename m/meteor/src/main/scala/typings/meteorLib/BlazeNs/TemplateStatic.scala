package typings
package meteorLib.BlazeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateStatic
  extends org.scalablytyped.runtime.Instantiable0[Template]
     with org.scalablytyped.runtime.Instantiable1[/* viewName */ java.lang.String, Template]
     with org.scalablytyped.runtime.Instantiable2[/* viewName */ java.lang.String, /* renderFunction */ js.Function, Template] {
  def currentData(): js.Any = js.native
  def instance(): TemplateInstance = js.native
  def parentData(numLevels: scala.Double): js.Any = js.native
  def registerHelper(name: java.lang.String, func: js.Function): scala.Unit = js.native
}

