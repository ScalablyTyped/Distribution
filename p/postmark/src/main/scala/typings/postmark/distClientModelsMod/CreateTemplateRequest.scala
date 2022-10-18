package typings.postmark.distClientModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models", "CreateTemplateRequest")
@js.native
open class CreateTemplateRequest protected ()
  extends typings.postmark.distClientModelsTemplatesTemplateMod.CreateTemplateRequest {
  def this(
    Name: String,
    Subject: js.UndefOr[String],
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    Alias: js.UndefOr[String | Null],
    TemplateType: js.UndefOr[typings.postmark.distClientModelsTemplatesTemplateMod.TemplateTypes],
    LayoutTemplate: js.UndefOr[String]
  ) = this()
}
