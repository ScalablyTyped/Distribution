package typings.postmark.mod.Models

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark", "Models.CreateTemplateRequest")
@js.native
class CreateTemplateRequest protected ()
  extends typings.postmark.modelsMod.CreateTemplateRequest {
  def this(
    Name: String,
    Subject: js.UndefOr[String],
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    Alias: js.UndefOr[String | Null],
    TemplateType: js.UndefOr[typings.postmark.templateMod.TemplateTypes],
    LayoutTemplate: js.UndefOr[String]
  ) = this()
}
