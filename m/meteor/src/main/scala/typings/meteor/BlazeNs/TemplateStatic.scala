package typings.meteor.BlazeNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateStatic
  extends Instantiable0[typings.meteor.BlazeNs.Template]
     with Instantiable1[/* viewName */ String, typings.meteor.BlazeNs.Template]
     with Instantiable2[
      /* viewName */ String, 
      /* renderFunction */ js.Function, 
      typings.meteor.BlazeNs.Template
    ] {
  def currentData(): js.Any = js.native
  def instance(): TemplateInstance = js.native
  def parentData(numLevels: Double): js.Any = js.native
  def registerHelper(name: String, func: js.Function): Unit = js.native
}

