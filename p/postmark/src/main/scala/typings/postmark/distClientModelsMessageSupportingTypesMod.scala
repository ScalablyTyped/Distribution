package typings.postmark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientModelsMessageSupportingTypesMod {
  
  @JSImport("postmark/dist/client/models/message/SupportingTypes", "Attachment")
  @js.native
  open class Attachment protected () extends StObject {
    def this(Name: String, Content: String, ContentType: String) = this()
    def this(Name: String, Content: String, ContentType: String, ContentID: String) = this()
    def this(Name: String, Content: String, ContentType: String, ContentID: String, ContentLength: Double) = this()
    def this(Name: String, Content: String, ContentType: String, ContentID: Null, ContentLength: Double) = this()
    def this(Name: String, Content: String, ContentType: String, ContentID: Unit, ContentLength: Double) = this()
    
    var Content: String = js.native
    
    var ContentID: String | Null = js.native
    
    var ContentLength: js.UndefOr[Double] = js.native
    
    var ContentType: String = js.native
    
    var Name: String = js.native
  }
  
  @JSImport("postmark/dist/client/models/message/SupportingTypes", "Header")
  @js.native
  open class Header protected () extends StObject {
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
    def apply(value: String): js.UndefOr[LinkClickLocation & String] = js.native
    
    @js.native
    sealed trait HTML
      extends StObject
         with LinkClickLocation
    /* "HTML" */ val HTML: typings.postmark.distClientModelsMessageSupportingTypesMod.LinkClickLocation.HTML & String = js.native
    
    @js.native
    sealed trait Text
      extends StObject
         with LinkClickLocation
    /* "Text" */ val Text: typings.postmark.distClientModelsMessageSupportingTypesMod.LinkClickLocation.Text & String = js.native
  }
  
  @js.native
  sealed trait LinkTrackingOptions extends StObject
  @JSImport("postmark/dist/client/models/message/SupportingTypes", "LinkTrackingOptions")
  @js.native
  object LinkTrackingOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LinkTrackingOptions & String] = js.native
    
    @js.native
    sealed trait HtmlAndText
      extends StObject
         with LinkTrackingOptions
    /* "HtmlAndText" */ val HtmlAndText: typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions.HtmlAndText & String = js.native
    
    @js.native
    sealed trait HtmlOnly
      extends StObject
         with LinkTrackingOptions
    /* "HtmlOnly" */ val HtmlOnly: typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions.HtmlOnly & String = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with LinkTrackingOptions
    /* "None" */ val None: typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions.None & String = js.native
    
    @js.native
    sealed trait TextOnly
      extends StObject
         with LinkTrackingOptions
    /* "TextOnly" */ val TextOnly: typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions.TextOnly & String = js.native
  }
  
  @js.native
  sealed trait ServerDeliveryTypes extends StObject
  @JSImport("postmark/dist/client/models/message/SupportingTypes", "ServerDeliveryTypes")
  @js.native
  object ServerDeliveryTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ServerDeliveryTypes & String] = js.native
    
    @js.native
    sealed trait Live
      extends StObject
         with ServerDeliveryTypes
    /* "Live" */ val Live: typings.postmark.distClientModelsMessageSupportingTypesMod.ServerDeliveryTypes.Live & String = js.native
    
    @js.native
    sealed trait Sandbox
      extends StObject
         with ServerDeliveryTypes
    /* "Sandbox" */ val Sandbox: typings.postmark.distClientModelsMessageSupportingTypesMod.ServerDeliveryTypes.Sandbox & String = js.native
  }
}
