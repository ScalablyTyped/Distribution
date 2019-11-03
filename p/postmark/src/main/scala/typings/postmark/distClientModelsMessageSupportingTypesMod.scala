package typings.postmark

import typings.postmark.distClientModelsMessageSupportingTypesMod.LinkClickLocation
import typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/message/SupportingTypes", JSImport.Namespace)
@js.native
object distClientModelsMessageSupportingTypesMod extends js.Object {
  @js.native
  class Attachment protected () extends js.Object {
    def this(Name: String, Content: String, ContentType: String) = this()
    def this(Name: String, Content: String, ContentType: String, ContentID: String) = this()
    var Content: String = js.native
    var ContentID: String | Null = js.native
    var ContentType: String = js.native
    var Name: String = js.native
  }
  
  @js.native
  class Header protected () extends js.Object {
    def this(Name: String, Value: String) = this()
    var Name: String = js.native
    var Value: String = js.native
  }
  
  @js.native
  sealed trait LinkClickLocation extends js.Object
  
  @js.native
  sealed trait LinkTrackingOptions extends js.Object
  
  @js.native
  object LinkClickLocation extends js.Object {
    @js.native
    sealed trait HTML extends LinkClickLocation
    
    @js.native
    sealed trait Text extends LinkClickLocation
    
    /* "HTML" */ val HTML: typings.postmark.distClientModelsMessageSupportingTypesMod.LinkClickLocation.HTML with String = js.native
    /* "Text" */ val Text: typings.postmark.distClientModelsMessageSupportingTypesMod.LinkClickLocation.Text with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LinkClickLocation with String] = js.native
  }
  
  @js.native
  object LinkTrackingOptions extends js.Object {
    @js.native
    sealed trait HtmlAndText extends LinkTrackingOptions
    
    @js.native
    sealed trait HtmlOnly extends LinkTrackingOptions
    
    @js.native
    sealed trait None extends LinkTrackingOptions
    
    @js.native
    sealed trait TextOnly extends LinkTrackingOptions
    
    /* "HtmlAndText" */ val HtmlAndText: typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions.HtmlAndText with String = js.native
    /* "HtmlOnly" */ val HtmlOnly: typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions.HtmlOnly with String = js.native
    /* "None" */ val None: typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions.None with String = js.native
    /* "TextOnly" */ val TextOnly: typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions.TextOnly with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LinkTrackingOptions with String] = js.native
  }
  
}

