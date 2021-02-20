package typings.postmark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageSupportingTypesMod {
  
  @JSImport("postmark/dist/client/models/message/SupportingTypes", "Attachment")
  @js.native
  class Attachment protected () extends StObject {
    def this(Name: String, Content: String, ContentType: String) = this()
    def this(Name: String, Content: String, ContentType: String, ContentID: String) = this()
    
    var Content: String = js.native
    
    var ContentID: String | Null = js.native
    
    var ContentType: String = js.native
    
    var Name: String = js.native
  }
  
  @JSImport("postmark/dist/client/models/message/SupportingTypes", "Header")
  @js.native
  class Header protected () extends StObject {
    def this(Name: String, Value: String) = this()
    
    var Name: String = js.native
    
    var Value: String = js.native
  }
  
  @js.native
  sealed trait LinkClickLocation extends StObject
  @JSImport("postmark/dist/client/models/message/SupportingTypes", "LinkClickLocation")
  @js.native
  object LinkClickLocation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LinkClickLocation with String] = js.native
    
    @js.native
    sealed trait HTML extends LinkClickLocation
    /* "HTML" */ val HTML: typings.postmark.messageSupportingTypesMod.LinkClickLocation.HTML with String = js.native
    
    @js.native
    sealed trait Text extends LinkClickLocation
    /* "Text" */ val Text: typings.postmark.messageSupportingTypesMod.LinkClickLocation.Text with String = js.native
  }
  
  @js.native
  sealed trait LinkTrackingOptions extends StObject
  @JSImport("postmark/dist/client/models/message/SupportingTypes", "LinkTrackingOptions")
  @js.native
  object LinkTrackingOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LinkTrackingOptions with String] = js.native
    
    @js.native
    sealed trait HtmlAndText extends LinkTrackingOptions
    /* "HtmlAndText" */ val HtmlAndText: typings.postmark.messageSupportingTypesMod.LinkTrackingOptions.HtmlAndText with String = js.native
    
    @js.native
    sealed trait HtmlOnly extends LinkTrackingOptions
    /* "HtmlOnly" */ val HtmlOnly: typings.postmark.messageSupportingTypesMod.LinkTrackingOptions.HtmlOnly with String = js.native
    
    @js.native
    sealed trait None extends LinkTrackingOptions
    /* "None" */ val None: typings.postmark.messageSupportingTypesMod.LinkTrackingOptions.None with String = js.native
    
    @js.native
    sealed trait TextOnly extends LinkTrackingOptions
    /* "TextOnly" */ val TextOnly: typings.postmark.messageSupportingTypesMod.LinkTrackingOptions.TextOnly with String = js.native
  }
}
