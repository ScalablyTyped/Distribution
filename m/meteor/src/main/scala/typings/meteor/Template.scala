package typings.meteor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Template")
@js.native
class Template ()
  extends typings.meteor.Blaze.Template {
  def this(viewName: String) = this()
  def this(viewName: String, renderFunction: js.Function) = this()
}

@JSGlobal("Template")
@js.native
object Template extends TopLevel[TemplateStatic]

