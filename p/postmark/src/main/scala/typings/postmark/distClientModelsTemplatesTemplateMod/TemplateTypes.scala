package typings.postmark.distClientModelsTemplatesTemplateMod

import org.scalablytyped.runtime.TopLevel
import typings.postmark.distClientModelsTemplatesTemplateMod.TemplateTypes.Layout
import typings.postmark.distClientModelsTemplatesTemplateMod.TemplateTypes.Standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TemplateTypes extends js.Object

@JSImport("postmark/dist/client/models/templates/Template", "TemplateTypes")
@js.native
object TemplateTypes extends js.Object {
  @js.native
  sealed trait Layout extends TemplateTypes
  
  @js.native
  sealed trait Standard extends TemplateTypes
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TemplateTypes with String] = js.native
  /* "Layout" */ @js.native
  object Layout extends TopLevel[Layout with String]
  
  /* "Standard" */ @js.native
  object Standard extends TopLevel[Standard with String]
  
}

