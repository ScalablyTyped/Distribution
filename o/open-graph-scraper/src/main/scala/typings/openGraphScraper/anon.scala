package typings.openGraphScraper

import typings.openGraphScraper.openGraphScraperBooleans.`false`
import typings.openGraphScraper.openGraphScraperBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: String
    
    var errorDetails: typings.std.Error
    
    var success: `false`
  }
  object Error {
    
    @scala.inline
    def apply(error: String, errorDetails: typings.std.Error): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorDetails = errorDetails.asInstanceOf[js.Any], success = false)
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorDetails(value: typings.std.Error): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: `false`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: String
    
    var `type`: String
    
    var url: String
    
    var width: String
  }
  object Height {
    
    @scala.inline
    def apply(height: String, `type`: String, url: String, width: String): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait OgDescription extends StObject {
    
    var ogDescription: js.UndefOr[String] = js.undefined
    
    var ogImage: js.UndefOr[Height] = js.undefined
    
    var ogTitle: js.UndefOr[String] = js.undefined
    
    var ogType: js.UndefOr[String] = js.undefined
    
    var ogUrl: js.UndefOr[String] = js.undefined
    
    var requestUrl: String
    
    var success: `true`
  }
  object OgDescription {
    
    @scala.inline
    def apply(requestUrl: String): OgDescription = {
      val __obj = js.Dynamic.literal(requestUrl = requestUrl.asInstanceOf[js.Any], success = true)
      __obj.asInstanceOf[OgDescription]
    }
    
    @scala.inline
    implicit class OgDescriptionMutableBuilder[Self <: OgDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOgDescription(value: String): Self = StObject.set(x, "ogDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgDescriptionUndefined: Self = StObject.set(x, "ogDescription", js.undefined)
      
      @scala.inline
      def setOgImage(value: Height): Self = StObject.set(x, "ogImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgImageUndefined: Self = StObject.set(x, "ogImage", js.undefined)
      
      @scala.inline
      def setOgTitle(value: String): Self = StObject.set(x, "ogTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgTitleUndefined: Self = StObject.set(x, "ogTitle", js.undefined)
      
      @scala.inline
      def setOgType(value: String): Self = StObject.set(x, "ogType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgTypeUndefined: Self = StObject.set(x, "ogType", js.undefined)
      
      @scala.inline
      def setOgUrl(value: String): Self = StObject.set(x, "ogUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgUrlUndefined: Self = StObject.set(x, "ogUrl", js.undefined)
      
      @scala.inline
      def setRequestUrl(value: String): Self = StObject.set(x, "requestUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: `true`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
