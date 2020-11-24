package typings.meteor.global

import org.scalablytyped.runtime.TopLevel
import typings.meteor.TemplateStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Template")
@js.native
class Template ()
  extends typings.meteor.Blaze.Template {
  def this(viewName: String) = this()
  def this(viewName: js.UndefOr[scala.Nothing], renderFunction: js.Function) = this()
  def this(viewName: String, renderFunction: js.Function) = this()
}
@JSGlobal("Template")
@js.native
object Template extends TopLevel[TemplateStatic]
