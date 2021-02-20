package typings.postmark

import typings.postmark.filteringParametersMod.FilteringParameters
import typings.postmark.messageSupportingTypesMod.Attachment
import typings.postmark.messageSupportingTypesMod.Header
import typings.postmark.messageSupportingTypesMod.LinkTrackingOptions
import typings.postmark.supportingTypesMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateMod {
  
  @JSImport("postmark/dist/client/models/templates/Template", "CreateTemplateRequest")
  @js.native
  class CreateTemplateRequest protected () extends UpdateTemplateRequest {
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
  class TemplateFilteringParameters () extends FilteringParameters {
    def this(count: Double) = this()
    def this(count: js.UndefOr[scala.Nothing], offset: Double) = this()
    def this(count: Double, offset: Double) = this()
    def this(count: js.UndefOr[scala.Nothing], offset: js.UndefOr[scala.Nothing], templateType: TemplateTypes) = this()
    def this(count: js.UndefOr[scala.Nothing], offset: Double, templateType: TemplateTypes) = this()
    def this(count: Double, offset: js.UndefOr[scala.Nothing], templateType: TemplateTypes) = this()
    def this(count: Double, offset: Double, templateType: TemplateTypes) = this()
    def this(
      count: js.UndefOr[scala.Nothing],
      offset: js.UndefOr[scala.Nothing],
      templateType: js.UndefOr[scala.Nothing],
      layoutTemplate: String
    ) = this()
    def this(
      count: js.UndefOr[scala.Nothing],
      offset: js.UndefOr[scala.Nothing],
      templateType: TemplateTypes,
      layoutTemplate: String
    ) = this()
    def this(
      count: js.UndefOr[scala.Nothing],
      offset: Double,
      templateType: js.UndefOr[scala.Nothing],
      layoutTemplate: String
    ) = this()
    def this(
      count: js.UndefOr[scala.Nothing],
      offset: Double,
      templateType: TemplateTypes,
      layoutTemplate: String
    ) = this()
    def this(
      count: Double,
      offset: js.UndefOr[scala.Nothing],
      templateType: js.UndefOr[scala.Nothing],
      layoutTemplate: String
    ) = this()
    def this(
      count: Double,
      offset: js.UndefOr[scala.Nothing],
      templateType: TemplateTypes,
      layoutTemplate: String
    ) = this()
    def this(count: Double, offset: Double, templateType: js.UndefOr[scala.Nothing], layoutTemplate: String) = this()
    def this(count: Double, offset: Double, templateType: TemplateTypes, layoutTemplate: String) = this()
    
    var layoutTemplate: js.UndefOr[String] = js.native
    
    var templateType: js.UndefOr[TemplateTypes] = js.native
  }
  
  @js.native
  sealed trait TemplateTypes extends StObject
  @JSImport("postmark/dist/client/models/templates/Template", "TemplateTypes")
  @js.native
  object TemplateTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TemplateTypes with String] = js.native
    
    @js.native
    sealed trait Layout extends TemplateTypes
    /* "Layout" */ val Layout: typings.postmark.templateMod.TemplateTypes.Layout with String = js.native
    
    @js.native
    sealed trait Standard extends TemplateTypes
    /* "Standard" */ val Standard: typings.postmark.templateMod.TemplateTypes.Standard with String = js.native
  }
  
  @JSImport("postmark/dist/client/models/templates/Template", "TemplateValidationOptions")
  @js.native
  class TemplateValidationOptions protected () extends StObject {
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
  class TemplatedMessage protected () extends StObject {
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
    
    var TemplateModel: js.UndefOr[js.Object] = js.native
    
    var To: js.UndefOr[String] = js.native
    
    var TrackLinks: js.UndefOr[LinkTrackingOptions] = js.native
    
    var TrackOpens: js.UndefOr[Boolean] = js.native
  }
  
  @JSImport("postmark/dist/client/models/templates/Template", "TemplatesPushRequest")
  @js.native
  class TemplatesPushRequest protected () extends StObject {
    def this(SourceServerID: Double, DestinationServerID: Double, PerformChanges: Boolean) = this()
    
    var DestinationServerID: Double = js.native
    
    var PerformChanges: Boolean = js.native
    
    var SourceServerID: Double = js.native
  }
  
  @JSImport("postmark/dist/client/models/templates/Template", "UpdateTemplateRequest")
  @js.native
  class UpdateTemplateRequest protected () extends StObject {
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
  
  @js.native
  trait Template extends StObject {
    
    var Active: Boolean = js.native
    
    var Alias: String | Null = js.native
    
    var AssociatedServerId: Double = js.native
    
    var HtmlBody: String | Null = js.native
    
    var LayoutTemplate: String | Null = js.native
    
    var Name: String = js.native
    
    var Subject: String = js.native
    
    var TemplateId: Double = js.native
    
    var TemplateType: TemplateTypes = js.native
    
    var TextBody: String | Null = js.native
  }
  object Template {
    
    @scala.inline
    def apply(
      Active: Boolean,
      AssociatedServerId: Double,
      Name: String,
      Subject: String,
      TemplateId: Double,
      TemplateType: TemplateTypes
    ): Template = {
      val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], AssociatedServerId = AssociatedServerId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Template]
    }
    
    @scala.inline
    implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasNull: Self = StObject.set(x, "Alias", null)
      
      @scala.inline
      def setAssociatedServerId(value: Double): Self = StObject.set(x, "AssociatedServerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlBody(value: String): Self = StObject.set(x, "HtmlBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlBodyNull: Self = StObject.set(x, "HtmlBody", null)
      
      @scala.inline
      def setLayoutTemplate(value: String): Self = StObject.set(x, "LayoutTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutTemplateNull: Self = StObject.set(x, "LayoutTemplate", null)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateId(value: Double): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateType(value: TemplateTypes): Self = StObject.set(x, "TemplateType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextBody(value: String): Self = StObject.set(x, "TextBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextBodyNull: Self = StObject.set(x, "TextBody", null)
    }
  }
  
  @js.native
  trait TemplateInList extends StObject {
    
    var Active: Boolean = js.native
    
    var Alias: String | Null = js.native
    
    var LayoutTemplate: String | Null = js.native
    
    var Name: String = js.native
    
    var TemplateId: Double = js.native
    
    var TemplateType: TemplateTypes = js.native
  }
  object TemplateInList {
    
    @scala.inline
    def apply(Active: Boolean, Name: String, TemplateId: Double, TemplateType: TemplateTypes): TemplateInList = {
      val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateInList]
    }
    
    @scala.inline
    implicit class TemplateInListMutableBuilder[Self <: TemplateInList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasNull: Self = StObject.set(x, "Alias", null)
      
      @scala.inline
      def setLayoutTemplate(value: String): Self = StObject.set(x, "LayoutTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutTemplateNull: Self = StObject.set(x, "LayoutTemplate", null)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateId(value: Double): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateType(value: TemplateTypes): Self = StObject.set(x, "TemplateType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TemplatePushAction extends StObject {
    
    var Action: String = js.native
    
    var Alias: String = js.native
    
    var Name: String = js.native
    
    var TemplateId: js.UndefOr[Double] = js.native
  }
  object TemplatePushAction {
    
    @scala.inline
    def apply(Action: String, Alias: String, Name: String): TemplatePushAction = {
      val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Alias = Alias.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplatePushAction]
    }
    
    @scala.inline
    implicit class TemplatePushActionMutableBuilder[Self <: TemplatePushAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateId(value: Double): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateIdUndefined: Self = StObject.set(x, "TemplateId", js.undefined)
    }
  }
  
  @js.native
  trait TemplateValidation extends StObject {
    
    var AllContentIsValid: Boolean = js.native
    
    var HtmlBody: ValidationSection = js.native
    
    var Subject: ValidationSection = js.native
    
    var SuggestedTemplateModel: js.Object = js.native
    
    var TextBody: ValidationSection = js.native
  }
  object TemplateValidation {
    
    @scala.inline
    def apply(
      AllContentIsValid: Boolean,
      HtmlBody: ValidationSection,
      Subject: ValidationSection,
      SuggestedTemplateModel: js.Object,
      TextBody: ValidationSection
    ): TemplateValidation = {
      val __obj = js.Dynamic.literal(AllContentIsValid = AllContentIsValid.asInstanceOf[js.Any], HtmlBody = HtmlBody.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], SuggestedTemplateModel = SuggestedTemplateModel.asInstanceOf[js.Any], TextBody = TextBody.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateValidation]
    }
    
    @scala.inline
    implicit class TemplateValidationMutableBuilder[Self <: TemplateValidation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllContentIsValid(value: Boolean): Self = StObject.set(x, "AllContentIsValid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlBody(value: ValidationSection): Self = StObject.set(x, "HtmlBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: ValidationSection): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestedTemplateModel(value: js.Object): Self = StObject.set(x, "SuggestedTemplateModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextBody(value: ValidationSection): Self = StObject.set(x, "TextBody", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Templates extends StObject {
    
    var Templates: js.Array[TemplateInList] = js.native
    
    var TotalCount: Double = js.native
  }
  object Templates {
    
    @scala.inline
    def apply(Templates: js.Array[TemplateInList], TotalCount: Double): Templates = {
      val __obj = js.Dynamic.literal(Templates = Templates.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Templates]
    }
    
    @scala.inline
    implicit class TemplatesMutableBuilder[Self <: Templates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTemplates(value: js.Array[TemplateInList]): Self = StObject.set(x, "Templates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplatesVarargs(value: TemplateInList*): Self = StObject.set(x, "Templates", js.Array(value :_*))
      
      @scala.inline
      def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TemplatesPush extends StObject {
    
    var Templates: js.Array[TemplatePushAction] = js.native
    
    var TotalCount: Double = js.native
  }
  object TemplatesPush {
    
    @scala.inline
    def apply(Templates: js.Array[TemplatePushAction], TotalCount: Double): TemplatesPush = {
      val __obj = js.Dynamic.literal(Templates = Templates.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplatesPush]
    }
    
    @scala.inline
    implicit class TemplatesPushMutableBuilder[Self <: TemplatesPush] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTemplates(value: js.Array[TemplatePushAction]): Self = StObject.set(x, "Templates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplatesVarargs(value: TemplatePushAction*): Self = StObject.set(x, "Templates", js.Array(value :_*))
      
      @scala.inline
      def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValidationSection extends StObject {
    
    var ContentIsValid: Boolean = js.native
    
    var RenderedContent: String = js.native
    
    var ValidationErrors: js.Object = js.native
  }
  object ValidationSection {
    
    @scala.inline
    def apply(ContentIsValid: Boolean, RenderedContent: String, ValidationErrors: js.Object): ValidationSection = {
      val __obj = js.Dynamic.literal(ContentIsValid = ContentIsValid.asInstanceOf[js.Any], RenderedContent = RenderedContent.asInstanceOf[js.Any], ValidationErrors = ValidationErrors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationSection]
    }
    
    @scala.inline
    implicit class ValidationSectionMutableBuilder[Self <: ValidationSection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentIsValid(value: Boolean): Self = StObject.set(x, "ContentIsValid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedContent(value: String): Self = StObject.set(x, "RenderedContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationErrors(value: js.Object): Self = StObject.set(x, "ValidationErrors", value.asInstanceOf[js.Any])
    }
  }
}
