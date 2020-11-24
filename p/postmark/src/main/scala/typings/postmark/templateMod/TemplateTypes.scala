package typings.postmark.templateMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TemplateTypes extends js.Object
@JSImport("postmark/dist/client/models/templates/Template", "TemplateTypes")
@js.native
object TemplateTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TemplateTypes with String] = js.native
  
  @js.native
  sealed trait Layout extends TemplateTypes
  /* "Layout" */ @js.native
  object Layout extends TopLevel[Layout with String]
  
  @js.native
  sealed trait Standard extends TemplateTypes
  /* "Standard" */ @js.native
  object Standard extends TopLevel[Standard with String]
}
