package typings.postmark

import typings.postmark.distClientModelsClientFilteringParametersMod.FilteringParameters
import typings.postmark.distClientModelsClientSupportingTypesMod.Hash
import typings.postmark.distClientModelsMessageSupportingTypesMod.Attachment
import typings.postmark.distClientModelsMessageSupportingTypesMod.Header
import typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientModelsTemplatesTemplateMod {
  
  @JSImport("postmark/dist/client/models/templates/Template", "CreateTemplateRequest")
  @js.native
  open class CreateTemplateRequest protected () extends UpdateTemplateRequest {
    def this(
      Name: String,
      Subject: js.UndefOr[String],
      HtmlBody: js.UndefOr[String],
      TextBody: js.UndefOr[String],
      Alias: js.UndefOr[String | Null],
      TemplateType: js.UndefOr[TemplateTypes],
      LayoutTemplate: js.UndefOr[String]
    ) = this()
  }
  
  @JSImport("postmark/dist/client/models/templates/Template", "TemplateFilteringParameters")
  @js.native
  open class TemplateFilteringParameters () extends FilteringParameters {
    def this(count: Double) = this()
    def this(count: Double, offset: Double) = this()
    def this(count: Unit, offset: Double) = this()
    def this(count: Double, offset: Double, templateType: TemplateTypes) = this()
    def this(count: Double, offset: Unit, templateType: TemplateTypes) = this()
    def this(count: Unit, offset: Double, templateType: TemplateTypes) = this()
    def this(count: Unit, offset: Unit, templateType: TemplateTypes) = this()
    def this(count: Double, offset: Double, templateType: Unit, layoutTemplate: String) = this()
    def this(count: Double, offset: Double, templateType: TemplateTypes, layoutTemplate: String) = this()
    def this(count: Double, offset: Unit, templateType: Unit, layoutTemplate: String) = this()
    def this(count: Double, offset: Unit, templateType: TemplateTypes, layoutTemplate: String) = this()
    def this(count: Unit, offset: Double, templateType: Unit, layoutTemplate: String) = this()
    def this(count: Unit, offset: Double, templateType: TemplateTypes, layoutTemplate: String) = this()
    def this(count: Unit, offset: Unit, templateType: Unit, layoutTemplate: String) = this()
    def this(count: Unit, offset: Unit, templateType: TemplateTypes, layoutTemplate: String) = this()
    
    var layoutTemplate: js.UndefOr[String] = js.native
    
    var templateType: js.UndefOr[TemplateTypes] = js.native
  }
  
  @js.native
  sealed trait TemplateTypes extends StObject
  @JSImport("postmark/dist/client/models/templates/Template", "TemplateTypes")
  @js.native
  object TemplateTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TemplateTypes & String] = js.native
    
    @js.native
    sealed trait Layout
      extends StObject
         with TemplateTypes
    /* "Layout" */ val Layout: typings.postmark.distClientModelsTemplatesTemplateMod.TemplateTypes.Layout & String = js.native
    
    @js.native
    sealed trait Standard
      extends StObject
         with TemplateTypes
    /* "Standard" */ val Standard: typings.postmark.distClientModelsTemplatesTemplateMod.TemplateTypes.Standard & String = js.native
  }
  
  @JSImport("postmark/dist/client/models/templates/Template", "TemplateValidationOptions")
  @js.native
  open class TemplateValidationOptions protected () extends StObject {
    def this(
      Subject: js.UndefOr[String],
      HtmlBody: js.UndefOr[String],
      TextBody: js.UndefOr[String],
      TestRenderModel: js.UndefOr[js.Object],
      TemplateType: js.UndefOr[TemplateTypes],
      LayoutTemplate: js.UndefOr[String],
      InlineCssForHtmlTestRender: js.UndefOr[Boolean]
    ) = this()
    
    var HtmlBody: js.UndefOr[String] = js.native
    
    var InlineCssForHtmlTestRender: js.UndefOr[Boolean] = js.native
    
    var LayoutTemplate: js.UndefOr[String] = js.native
    
    var Subject: js.UndefOr[String] = js.native
    
    var TemplateType: js.UndefOr[TemplateTypes] = js.native
    
    var TestRenderModel: js.UndefOr[js.Object] = js.native
    
    var TextBody: js.UndefOr[String] = js.native
  }
  
  @JSImport("postmark/dist/client/models/templates/Template", "TemplatedMessage")
  @js.native
  open class TemplatedMessage protected () extends StObject {
    def this(
      from: String,
      templateIdOrAlias: Double | String,
      templateModel: js.Object,
      to: js.UndefOr[String],
      cc: js.UndefOr[String],
      bcc: js.UndefOr[String],
      replyTo: js.UndefOr[String],
      tag: js.UndefOr[String],
      trackOpens: js.UndefOr[Boolean],
      trackLinks: js.UndefOr[LinkTrackingOptions],
      headers: js.UndefOr[js.Array[Header]],
      attachments: js.UndefOr[js.Array[Attachment]]
    ) = this()
    
    var Attachments: js.UndefOr[js.Array[Attachment]] = js.native
    
    var Bcc: js.UndefOr[String] = js.native
    
    var Cc: js.UndefOr[String] = js.native
    
    var From: String = js.native
    
    var Headers: js.UndefOr[js.Array[Header]] = js.native
    
    var InlineCss: js.UndefOr[Boolean] = js.native
    
    var MessageStream: js.UndefOr[String] = js.native
    
    var Metadata: js.UndefOr[Hash[String]] = js.native
    
    var ReplyTo: js.UndefOr[String] = js.native
    
    var Tag: js.UndefOr[String] = js.native
    
    var TemplateAlias: js.UndefOr[String] = js.native
    
    var TemplateId: js.UndefOr[Double] = js.native
    
    var TemplateModel: js.Object = js.native
    
    var To: js.UndefOr[String] = js.native
    
    var TrackLinks: js.UndefOr[LinkTrackingOptions] = js.native
    
    var TrackOpens: js.UndefOr[Boolean] = js.native
  }
  
  @JSImport("postmark/dist/client/models/templates/Template", "TemplatesPushRequest")
  @js.native
  open class TemplatesPushRequest protected () extends StObject {
    def this(SourceServerID: Double, DestinationServerID: Double, PerformChanges: Boolean) = this()
    
    var DestinationServerID: Double = js.native
    
    var PerformChanges: Boolean = js.native
    
    var SourceServerID: Double = js.native
  }
  
  @JSImport("postmark/dist/client/models/templates/Template", "UpdateTemplateRequest")
  @js.native
  open class UpdateTemplateRequest protected () extends StObject {
    def this(
      Name: js.UndefOr[String],
      Subject: js.UndefOr[String],
      HtmlBody: js.UndefOr[String],
      TextBody: js.UndefOr[String],
      Alias: js.UndefOr[String | Null],
      TemplateType: js.UndefOr[TemplateTypes],
      LayoutTemplate: js.UndefOr[String]
    ) = this()
    
    var Alias: js.UndefOr[String | Null] = js.native
    
    var HtmlBody: js.UndefOr[String] = js.native
    
    var LayoutTemplate: js.UndefOr[String] = js.native
    
    var Name: js.UndefOr[String] = js.native
    
    var Subject: js.UndefOr[String] = js.native
    
    var TemplateType: js.UndefOr[TemplateTypes] = js.native
    
    var TextBody: js.UndefOr[String] = js.native
  }
  
  trait Template extends StObject {
    
    var Active: Boolean
    
    var Alias: String | Null
    
    var AssociatedServerId: Double
    
    var HtmlBody: String | Null
    
    var LayoutTemplate: String | Null
    
    var Name: String
    
    var Subject: String
    
    var TemplateId: Double
    
    var TemplateType: TemplateTypes
    
    var TextBody: String | Null
  }
  object Template {
    
    inline def apply(
      Active: Boolean,
      AssociatedServerId: Double,
      Name: String,
      Subject: String,
      TemplateId: Double,
      TemplateType: TemplateTypes
    ): Template = {
      val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], AssociatedServerId = AssociatedServerId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any], Alias = null, HtmlBody = null, LayoutTemplate = null, TextBody = null)
      __obj.asInstanceOf[Template]
    }
    
    extension [Self <: Template](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
      
      inline def setAlias(value: String): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
      
      inline def setAliasNull: Self = StObject.set(x, "Alias", null)
      
      inline def setAssociatedServerId(value: Double): Self = StObject.set(x, "AssociatedServerId", value.asInstanceOf[js.Any])
      
      inline def setHtmlBody(value: String): Self = StObject.set(x, "HtmlBody", value.asInstanceOf[js.Any])
      
      inline def setHtmlBodyNull: Self = StObject.set(x, "HtmlBody", null)
      
      inline def setLayoutTemplate(value: String): Self = StObject.set(x, "LayoutTemplate", value.asInstanceOf[js.Any])
      
      inline def setLayoutTemplateNull: Self = StObject.set(x, "LayoutTemplate", null)
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
      
      inline def setTemplateId(value: Double): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
      
      inline def setTemplateType(value: TemplateTypes): Self = StObject.set(x, "TemplateType", value.asInstanceOf[js.Any])
      
      inline def setTextBody(value: String): Self = StObject.set(x, "TextBody", value.asInstanceOf[js.Any])
      
      inline def setTextBodyNull: Self = StObject.set(x, "TextBody", null)
    }
  }
  
  trait TemplateInList extends StObject {
    
    var Active: Boolean
    
    var Alias: String | Null
    
    var LayoutTemplate: String | Null
    
    var Name: String
    
    var TemplateId: Double
    
    var TemplateType: TemplateTypes
  }
  object TemplateInList {
    
    inline def apply(Active: Boolean, Name: String, TemplateId: Double, TemplateType: TemplateTypes): TemplateInList = {
      val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any], Alias = null, LayoutTemplate = null)
      __obj.asInstanceOf[TemplateInList]
    }
    
    extension [Self <: TemplateInList](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
      
      inline def setAlias(value: String): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
      
      inline def setAliasNull: Self = StObject.set(x, "Alias", null)
      
      inline def setLayoutTemplate(value: String): Self = StObject.set(x, "LayoutTemplate", value.asInstanceOf[js.Any])
      
      inline def setLayoutTemplateNull: Self = StObject.set(x, "LayoutTemplate", null)
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setTemplateId(value: Double): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
      
      inline def setTemplateType(value: TemplateTypes): Self = StObject.set(x, "TemplateType", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplatePushAction extends StObject {
    
    var Action: String
    
    var Alias: String
    
    var Name: String
    
    var TemplateId: js.UndefOr[Double] = js.undefined
  }
  object TemplatePushAction {
    
    inline def apply(Action: String, Alias: String, Name: String): TemplatePushAction = {
      val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Alias = Alias.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplatePushAction]
    }
    
    extension [Self <: TemplatePushAction](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      inline def setAlias(value: String): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setTemplateId(value: Double): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
      
      inline def setTemplateIdUndefined: Self = StObject.set(x, "TemplateId", js.undefined)
    }
  }
  
  trait TemplateValidation extends StObject {
    
    var AllContentIsValid: Boolean
    
    var HtmlBody: ValidationSection
    
    var Subject: ValidationSection
    
    var SuggestedTemplateModel: js.Object
    
    var TextBody: ValidationSection
  }
  object TemplateValidation {
    
    inline def apply(
      AllContentIsValid: Boolean,
      HtmlBody: ValidationSection,
      Subject: ValidationSection,
      SuggestedTemplateModel: js.Object,
      TextBody: ValidationSection
    ): TemplateValidation = {
      val __obj = js.Dynamic.literal(AllContentIsValid = AllContentIsValid.asInstanceOf[js.Any], HtmlBody = HtmlBody.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], SuggestedTemplateModel = SuggestedTemplateModel.asInstanceOf[js.Any], TextBody = TextBody.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateValidation]
    }
    
    extension [Self <: TemplateValidation](x: Self) {
      
      inline def setAllContentIsValid(value: Boolean): Self = StObject.set(x, "AllContentIsValid", value.asInstanceOf[js.Any])
      
      inline def setHtmlBody(value: ValidationSection): Self = StObject.set(x, "HtmlBody", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: ValidationSection): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
      
      inline def setSuggestedTemplateModel(value: js.Object): Self = StObject.set(x, "SuggestedTemplateModel", value.asInstanceOf[js.Any])
      
      inline def setTextBody(value: ValidationSection): Self = StObject.set(x, "TextBody", value.asInstanceOf[js.Any])
    }
  }
  
  trait Templates extends StObject {
    
    var Templates: js.Array[TemplateInList]
    
    var TotalCount: Double
  }
  object Templates {
    
    inline def apply(Templates: js.Array[TemplateInList], TotalCount: Double): Templates = {
      val __obj = js.Dynamic.literal(Templates = Templates.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Templates]
    }
    
    extension [Self <: Templates](x: Self) {
      
      inline def setTemplates(value: js.Array[TemplateInList]): Self = StObject.set(x, "Templates", value.asInstanceOf[js.Any])
      
      inline def setTemplatesVarargs(value: TemplateInList*): Self = StObject.set(x, "Templates", js.Array(value*))
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplatesPush extends StObject {
    
    var Templates: js.Array[TemplatePushAction]
    
    var TotalCount: Double
  }
  object TemplatesPush {
    
    inline def apply(Templates: js.Array[TemplatePushAction], TotalCount: Double): TemplatesPush = {
      val __obj = js.Dynamic.literal(Templates = Templates.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplatesPush]
    }
    
    extension [Self <: TemplatesPush](x: Self) {
      
      inline def setTemplates(value: js.Array[TemplatePushAction]): Self = StObject.set(x, "Templates", value.asInstanceOf[js.Any])
      
      inline def setTemplatesVarargs(value: TemplatePushAction*): Self = StObject.set(x, "Templates", js.Array(value*))
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidationSection extends StObject {
    
    var ContentIsValid: Boolean
    
    var RenderedContent: String
    
    var ValidationErrors: js.Object
  }
  object ValidationSection {
    
    inline def apply(ContentIsValid: Boolean, RenderedContent: String, ValidationErrors: js.Object): ValidationSection = {
      val __obj = js.Dynamic.literal(ContentIsValid = ContentIsValid.asInstanceOf[js.Any], RenderedContent = RenderedContent.asInstanceOf[js.Any], ValidationErrors = ValidationErrors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationSection]
    }
    
    extension [Self <: ValidationSection](x: Self) {
      
      inline def setContentIsValid(value: Boolean): Self = StObject.set(x, "ContentIsValid", value.asInstanceOf[js.Any])
      
      inline def setRenderedContent(value: String): Self = StObject.set(x, "RenderedContent", value.asInstanceOf[js.Any])
      
      inline def setValidationErrors(value: js.Object): Self = StObject.set(x, "ValidationErrors", value.asInstanceOf[js.Any])
    }
  }
}
