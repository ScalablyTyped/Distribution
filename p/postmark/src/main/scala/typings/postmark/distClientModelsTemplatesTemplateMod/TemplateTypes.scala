package typings.postmark.distClientModelsTemplatesTemplateMod

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
  
  /* "Layout" */ val Layout: typings.postmark.distClientModelsTemplatesTemplateMod.TemplateTypes.Layout with String = js.native
  /* "Standard" */ val Standard: typings.postmark.distClientModelsTemplatesTemplateMod.TemplateTypes.Standard with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TemplateTypes with String] = js.native
}

