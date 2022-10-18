package typings.postmark.mod.Models

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark", "Models.TemplateValidationOptions")
@js.native
open class TemplateValidationOptions protected ()
  extends typings.postmark.distClientModelsMod.TemplateValidationOptions {
  def this(
    Subject: js.UndefOr[String],
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    TestRenderModel: js.UndefOr[js.Object],
    TemplateType: js.UndefOr[typings.postmark.distClientModelsTemplatesTemplateMod.TemplateTypes],
    LayoutTemplate: js.UndefOr[String],
    InlineCssForHtmlTestRender: js.UndefOr[Boolean]
  ) = this()
}
