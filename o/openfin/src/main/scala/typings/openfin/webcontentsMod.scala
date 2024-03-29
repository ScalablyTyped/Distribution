package typings.openfin

import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.`object`
import typings.openfin.openfinStrings.image
import typings.openfin.openfinStrings.mainFrame
import typings.openfin.openfinStrings.other
import typings.openfin.openfinStrings.script
import typings.openfin.openfinStrings.styleSheet
import typings.openfin.openfinStrings.subFrame
import typings.openfin.openfinStrings.xhr
import typings.openfin.windowMod.WindowNavigationRejectedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webcontentsMod {
  
  trait CertificateErrorEvent[Topic, Type]
    extends StObject
       with WindowEvent[Topic, Type] {
    
    var certificate: Any
    
    var error: String
    
    var url: String
  }
  object CertificateErrorEvent {
    
    inline def apply[Topic, Type](
      certificate: Any,
      error: String,
      name: String,
      topic: Topic,
      `type`: Type,
      url: String,
      uuid: String
    ): CertificateErrorEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateErrorEvent[Topic, Type]]
    }
    
    extension [Self <: CertificateErrorEvent[?, ?], Topic, Type](x: Self & (CertificateErrorEvent[Topic, Type])) {
      
      inline def setCertificate(value: Any): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PageTitleUpdatedEvent[Topic, Type]
    extends StObject
       with WindowEvent[Topic, Type] {
    
    var title: String
  }
  object PageTitleUpdatedEvent {
    
    inline def apply[Topic, Type](name: String, title: String, topic: Topic, `type`: Type, uuid: String): PageTitleUpdatedEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageTitleUpdatedEvent[Topic, Type]]
    }
    
    extension [Self <: PageTitleUpdatedEvent[?, ?], Topic, Type](x: Self & (PageTitleUpdatedEvent[Topic, Type])) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebContentsEventMapping[Topic, Type]
    extends StObject
       with BaseEventMap {
    
    var blurred: WindowEvent[Topic, Type]
    
    var `certificate-error`: CertificateErrorEvent[Topic, Type]
    
    var crashed: CrashedEvent & (WindowEvent[Topic, Type])
    
    var `did-change-theme-color`: WindowEvent[Topic, Type]
    
    var focused: WindowEvent[Topic, Type]
    
    var `found-in-page`: WindowEvent[Topic, Type]
    
    var `navigation-rejected`: WindowNavigationRejectedEvent[Topic, Type]
    
    var `page-favicon-updated`: WindowEvent[Topic, Type]
    
    var `page-title-updated`: PageTitleUpdatedEvent[Topic, Type]
    
    var `resource-load-failed`: WindowResourceLoadFailedEvent[Topic, Type]
    
    var `resource-response-received`: WindowResourceResponseReceivedEvent[Topic, Type]
  }
  object WebContentsEventMapping {
    
    inline def apply[Topic, Type](
      blurred: WindowEvent[Topic, Type],
      `certificate-error`: CertificateErrorEvent[Topic, Type],
      crashed: CrashedEvent & (WindowEvent[Topic, Type]),
      `did-change-theme-color`: WindowEvent[Topic, Type],
      focused: WindowEvent[Topic, Type],
      `found-in-page`: WindowEvent[Topic, Type],
      listenerRemoved: String,
      `navigation-rejected`: WindowNavigationRejectedEvent[Topic, Type],
      newListener: String,
      `page-favicon-updated`: WindowEvent[Topic, Type],
      `page-title-updated`: PageTitleUpdatedEvent[Topic, Type],
      `resource-load-failed`: WindowResourceLoadFailedEvent[Topic, Type],
      `resource-response-received`: WindowResourceResponseReceivedEvent[Topic, Type]
    ): WebContentsEventMapping[Topic, Type] = {
      val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
      __obj.updateDynamic("certificate-error")(`certificate-error`.asInstanceOf[js.Any])
      __obj.updateDynamic("did-change-theme-color")(`did-change-theme-color`.asInstanceOf[js.Any])
      __obj.updateDynamic("found-in-page")(`found-in-page`.asInstanceOf[js.Any])
      __obj.updateDynamic("navigation-rejected")(`navigation-rejected`.asInstanceOf[js.Any])
      __obj.updateDynamic("page-favicon-updated")(`page-favicon-updated`.asInstanceOf[js.Any])
      __obj.updateDynamic("page-title-updated")(`page-title-updated`.asInstanceOf[js.Any])
      __obj.updateDynamic("resource-load-failed")(`resource-load-failed`.asInstanceOf[js.Any])
      __obj.updateDynamic("resource-response-received")(`resource-response-received`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebContentsEventMapping[Topic, Type]]
    }
    
    extension [Self <: WebContentsEventMapping[?, ?], Topic, Type](x: Self & (WebContentsEventMapping[Topic, Type])) {
      
      inline def setBlurred(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "blurred", value.asInstanceOf[js.Any])
      
      inline def `setCertificate-error`(value: CertificateErrorEvent[Topic, Type]): Self = StObject.set(x, "certificate-error", value.asInstanceOf[js.Any])
      
      inline def setCrashed(value: CrashedEvent & (WindowEvent[Topic, Type])): Self = StObject.set(x, "crashed", value.asInstanceOf[js.Any])
      
      inline def `setDid-change-theme-color`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "did-change-theme-color", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def `setFound-in-page`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "found-in-page", value.asInstanceOf[js.Any])
      
      inline def `setNavigation-rejected`(value: WindowNavigationRejectedEvent[Topic, Type]): Self = StObject.set(x, "navigation-rejected", value.asInstanceOf[js.Any])
      
      inline def `setPage-favicon-updated`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "page-favicon-updated", value.asInstanceOf[js.Any])
      
      inline def `setPage-title-updated`(value: PageTitleUpdatedEvent[Topic, Type]): Self = StObject.set(x, "page-title-updated", value.asInstanceOf[js.Any])
      
      inline def `setResource-load-failed`(value: WindowResourceLoadFailedEvent[Topic, Type]): Self = StObject.set(x, "resource-load-failed", value.asInstanceOf[js.Any])
      
      inline def `setResource-response-received`(value: WindowResourceResponseReceivedEvent[Topic, Type]): Self = StObject.set(x, "resource-response-received", value.asInstanceOf[js.Any])
    }
  }
  
  trait WindowResourceLoadFailedEvent[Topic, Type]
    extends StObject
       with WindowEvent[Topic, Type] {
    
    var errorCode: Double
    
    var errorDescription: String
    
    var isMainFrame: Boolean
    
    var validatedURL: String
  }
  object WindowResourceLoadFailedEvent {
    
    inline def apply[Topic, Type](
      errorCode: Double,
      errorDescription: String,
      isMainFrame: Boolean,
      name: String,
      topic: Topic,
      `type`: Type,
      uuid: String,
      validatedURL: String
    ): WindowResourceLoadFailedEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorDescription = errorDescription.asInstanceOf[js.Any], isMainFrame = isMainFrame.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], validatedURL = validatedURL.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowResourceLoadFailedEvent[Topic, Type]]
    }
    
    extension [Self <: WindowResourceLoadFailedEvent[?, ?], Topic, Type](x: Self & (WindowResourceLoadFailedEvent[Topic, Type])) {
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorDescription(value: String): Self = StObject.set(x, "errorDescription", value.asInstanceOf[js.Any])
      
      inline def setIsMainFrame(value: Boolean): Self = StObject.set(x, "isMainFrame", value.asInstanceOf[js.Any])
      
      inline def setValidatedURL(value: String): Self = StObject.set(x, "validatedURL", value.asInstanceOf[js.Any])
    }
  }
  
  trait WindowResourceResponseReceivedEvent[Topic, Type]
    extends StObject
       with WindowEvent[Topic, Type] {
    
    var headers: Any
    
    var httpResponseCode: Double
    
    var newUrl: String
    
    var originalUrl: String
    
    var referrer: String
    
    var requestMethod: String
    
    var resourceType: mainFrame | subFrame | styleSheet | script | image | `object` | xhr | other
    
    var status: Boolean
  }
  object WindowResourceResponseReceivedEvent {
    
    inline def apply[Topic, Type](
      headers: Any,
      httpResponseCode: Double,
      name: String,
      newUrl: String,
      originalUrl: String,
      referrer: String,
      requestMethod: String,
      resourceType: mainFrame | subFrame | styleSheet | script | image | `object` | xhr | other,
      status: Boolean,
      topic: Topic,
      `type`: Type,
      uuid: String
    ): WindowResourceResponseReceivedEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpResponseCode = httpResponseCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newUrl = newUrl.asInstanceOf[js.Any], originalUrl = originalUrl.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], requestMethod = requestMethod.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowResourceResponseReceivedEvent[Topic, Type]]
    }
    
    extension [Self <: WindowResourceResponseReceivedEvent[?, ?], Topic, Type](x: Self & (WindowResourceResponseReceivedEvent[Topic, Type])) {
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHttpResponseCode(value: Double): Self = StObject.set(x, "httpResponseCode", value.asInstanceOf[js.Any])
      
      inline def setNewUrl(value: String): Self = StObject.set(x, "newUrl", value.asInstanceOf[js.Any])
      
      inline def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setRequestMethod(value: String): Self = StObject.set(x, "requestMethod", value.asInstanceOf[js.Any])
      
      inline def setResourceType(value: mainFrame | subFrame | styleSheet | script | image | `object` | xhr | other): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
