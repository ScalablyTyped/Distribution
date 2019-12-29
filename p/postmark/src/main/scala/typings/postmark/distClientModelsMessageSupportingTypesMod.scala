package typings.postmark

import org.scalablytyped.runtime.TopLevel
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LinkClickLocation with String] = js.native
    /* "HTML" */ @js.native
    object HTML extends TopLevel[HTML with String]
    
    /* "Text" */ @js.native
    object Text extends TopLevel[Text with String]
    
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LinkTrackingOptions with String] = js.native
    /* "HtmlAndText" */ @js.native
    object HtmlAndText extends TopLevel[HtmlAndText with String]
    
    /* "HtmlOnly" */ @js.native
    object HtmlOnly extends TopLevel[HtmlOnly with String]
    
    /* "None" */ @js.native
    object None extends TopLevel[None with String]
    
    /* "TextOnly" */ @js.native
    object TextOnly extends TopLevel[TextOnly with String]
    
  }
  
}

