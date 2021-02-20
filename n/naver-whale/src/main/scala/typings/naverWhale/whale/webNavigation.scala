package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import typings.chrome.chrome.events.UrlFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Web Navigation
////////////////////
/**
  * Use the chrome.webNavigation API to receive notifications about the status of navigation requests in-flight.
  * Permissions:  "webNavigation"
  * @since Chrome 16.
  */
object webNavigation {
  
  @js.native
  trait GetAllFrameDetails extends StObject {
    
    /** The ID of the tab. */
    var tabId: Double = js.native
  }
  object GetAllFrameDetails {
    
    @scala.inline
    def apply(tabId: Double): GetAllFrameDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAllFrameDetails]
    }
    
    @scala.inline
    implicit class GetAllFrameDetailsMutableBuilder[Self <: GetAllFrameDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetAllFrameResultDetails
    extends typings.chrome.chrome.webNavigation.GetFrameResultDetails {
    
    /** The ID of the frame. 0 indicates that this is the main frame; a positive value indicates the ID of a subframe. */
    var frameId: Double = js.native
    
    /** The ID of the process runs the renderer for this tab. */
    var processId: Double = js.native
  }
  object GetAllFrameResultDetails {
    
    @scala.inline
    def apply(errorOccurred: Boolean, frameId: Double, parentFrameId: Double, processId: Double, url: String): GetAllFrameResultDetails = {
      val __obj = js.Dynamic.literal(errorOccurred = errorOccurred.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAllFrameResultDetails]
    }
    
    @scala.inline
    implicit class GetAllFrameResultDetailsMutableBuilder[Self <: GetAllFrameResultDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetFrameDetails extends StObject {
    
    /** The ID of the frame in the given tab. */
    var frameId: Double = js.native
    
    /**
      * The ID of the process runs the renderer for this tab.
      * @since Chrome 22.
      * @deprecated since Chrome 49. Frames are now uniquely identified by their tab ID and frame ID; the process ID is no longer needed and therefore ignored.
      */
    var processId: js.UndefOr[Double] = js.native
    
    /** The ID of the tab in which the frame is. */
    var tabId: Double = js.native
  }
  object GetFrameDetails {
    
    @scala.inline
    def apply(frameId: Double, tabId: Double): GetFrameDetails = {
      val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFrameDetails]
    }
    
    @scala.inline
    implicit class GetFrameDetailsMutableBuilder[Self <: GetFrameDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetFrameResultDetails extends StObject {
    
    /** True if the last navigation in this frame was interrupted by an error, i.e. the onErrorOccurred event fired. */
    var errorOccurred: Boolean = js.native
    
    /** ID of frame that wraps the frame. Set to -1 of no parent frame exists. */
    var parentFrameId: Double = js.native
    
    /** The URL currently associated with this frame, if the frame identified by the frameId existed at one point in the given tab. The fact that an URL is associated with a given frameId does not imply that the corresponding frame still exists. */
    var url: String = js.native
  }
  object GetFrameResultDetails {
    
    @scala.inline
    def apply(errorOccurred: Boolean, parentFrameId: Double, url: String): GetFrameResultDetails = {
      val __obj = js.Dynamic.literal(errorOccurred = errorOccurred.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFrameResultDetails]
    }
    
    @scala.inline
    implicit class GetFrameResultDetailsMutableBuilder[Self <: GetFrameResultDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorOccurred(value: Boolean): Self = StObject.set(x, "errorOccurred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentFrameId(value: Double): Self = StObject.set(x, "parentFrameId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebNavigationCallbackDetails extends StObject {
    
    /** The ID of the tab in which the navigation is about to occur. */
    var tabId: Double = js.native
    
    /** The time when the browser was about to start the navigation, in milliseconds since the epoch. */
    var timeStamp: Double = js.native
  }
  object WebNavigationCallbackDetails {
    
    @scala.inline
    def apply(tabId: Double, timeStamp: Double): WebNavigationCallbackDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebNavigationCallbackDetails]
    }
    
    @scala.inline
    implicit class WebNavigationCallbackDetailsMutableBuilder[Self <: WebNavigationCallbackDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebNavigationEvent[T /* <: typings.chrome.chrome.webNavigation.WebNavigationCallbackDetails */]
    extends Event[js.Function1[/* details */ T, Unit]] {
    
    def addListener(
      callback: js.Function1[/* details */ T, Unit],
      filters: typings.chrome.chrome.webNavigation.WebNavigationEventFilter
    ): Unit = js.native
  }
  
  @js.native
  trait WebNavigationEventFilter extends StObject {
    
    /** Conditions that the URL being navigated to must satisfy. The 'schemes' and 'ports' fields of UrlFilter are ignored for this event. */
    var url: js.Array[UrlFilter] = js.native
  }
  object WebNavigationEventFilter {
    
    @scala.inline
    def apply(url: js.Array[UrlFilter]): WebNavigationEventFilter = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebNavigationEventFilter]
    }
    
    @scala.inline
    implicit class WebNavigationEventFilterMutableBuilder[Self <: WebNavigationEventFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: js.Array[UrlFilter]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlVarargs(value: UrlFilter*): Self = StObject.set(x, "url", js.Array(value :_*))
    }
  }
  
  @js.native
  trait WebNavigationFramedCallbackDetails
    extends typings.chrome.chrome.webNavigation.WebNavigationUrlCallbackDetails {
    
    /** 0 indicates the navigation happens in the tab content window; a positive value indicates navigation in a subframe. Frame IDs are unique for a given tab and process. */
    var frameId: Double = js.native
    
    /**
      * The ID of the process runs the renderer for this tab.
      * @since Chrome 22.
      */
    var processId: Double = js.native
  }
  object WebNavigationFramedCallbackDetails {
    
    @scala.inline
    def apply(frameId: Double, processId: Double, tabId: Double, timeStamp: Double, url: String): WebNavigationFramedCallbackDetails = {
      val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebNavigationFramedCallbackDetails]
    }
    
    @scala.inline
    implicit class WebNavigationFramedCallbackDetailsMutableBuilder[Self <: WebNavigationFramedCallbackDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebNavigationFramedErrorCallbackDetails
    extends typings.chrome.chrome.webNavigation.WebNavigationFramedCallbackDetails {
    
    /** The error description. */
    var error: String = js.native
  }
  object WebNavigationFramedErrorCallbackDetails {
    
    @scala.inline
    def apply(error: String, frameId: Double, processId: Double, tabId: Double, timeStamp: Double, url: String): WebNavigationFramedErrorCallbackDetails = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebNavigationFramedErrorCallbackDetails]
    }
    
    @scala.inline
    implicit class WebNavigationFramedErrorCallbackDetailsMutableBuilder[Self <: WebNavigationFramedErrorCallbackDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  type WebNavigationFramedErrorEvent = typings.chrome.chrome.webNavigation.WebNavigationEvent[typings.chrome.chrome.webNavigation.WebNavigationFramedErrorCallbackDetails]
  
  type WebNavigationFramedEvent = typings.chrome.chrome.webNavigation.WebNavigationEvent[typings.chrome.chrome.webNavigation.WebNavigationFramedCallbackDetails]
  
  @js.native
  trait WebNavigationParentedCallbackDetails
    extends typings.chrome.chrome.webNavigation.WebNavigationFramedCallbackDetails {
    
    /**
      * ID of frame that wraps the frame. Set to -1 of no parent frame exists.
      * @since Chrome 24.
      */
    var parentFrameId: Double = js.native
  }
  object WebNavigationParentedCallbackDetails {
    
    @scala.inline
    def apply(
      frameId: Double,
      parentFrameId: Double,
      processId: Double,
      tabId: Double,
      timeStamp: Double,
      url: String
    ): WebNavigationParentedCallbackDetails = {
      val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebNavigationParentedCallbackDetails]
    }
    
    @scala.inline
    implicit class WebNavigationParentedCallbackDetailsMutableBuilder[Self <: WebNavigationParentedCallbackDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParentFrameId(value: Double): Self = StObject.set(x, "parentFrameId", value.asInstanceOf[js.Any])
    }
  }
  
  type WebNavigationParentedEvent = typings.chrome.chrome.webNavigation.WebNavigationEvent[typings.chrome.chrome.webNavigation.WebNavigationParentedCallbackDetails]
  
  @js.native
  trait WebNavigationReplacementCallbackDetails
    extends typings.chrome.chrome.webNavigation.WebNavigationCallbackDetails {
    
    /** The ID of the tab that was replaced. */
    var replacedTabId: Double = js.native
  }
  object WebNavigationReplacementCallbackDetails {
    
    @scala.inline
    def apply(replacedTabId: Double, tabId: Double, timeStamp: Double): WebNavigationReplacementCallbackDetails = {
      val __obj = js.Dynamic.literal(replacedTabId = replacedTabId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebNavigationReplacementCallbackDetails]
    }
    
    @scala.inline
    implicit class WebNavigationReplacementCallbackDetailsMutableBuilder[Self <: WebNavigationReplacementCallbackDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplacedTabId(value: Double): Self = StObject.set(x, "replacedTabId", value.asInstanceOf[js.Any])
    }
  }
  
  type WebNavigationReplacementEvent = typings.chrome.chrome.webNavigation.WebNavigationEvent[typings.chrome.chrome.webNavigation.WebNavigationReplacementCallbackDetails]
  
  @js.native
  trait WebNavigationSourceCallbackDetails
    extends typings.chrome.chrome.webNavigation.WebNavigationUrlCallbackDetails {
    
    /** The ID of the frame with sourceTabId in which the navigation is triggered. 0 indicates the main frame. */
    var sourceFrameId: Double = js.native
    
    /**
      * The ID of the process runs the renderer for the source tab.
      * @since Chrome 22.
      */
    var sourceProcessId: Double = js.native
    
    /** The ID of the tab in which the navigation is triggered. */
    var sourceTabId: Double = js.native
  }
  object WebNavigationSourceCallbackDetails {
    
    @scala.inline
    def apply(
      sourceFrameId: Double,
      sourceProcessId: Double,
      sourceTabId: Double,
      tabId: Double,
      timeStamp: Double,
      url: String
    ): WebNavigationSourceCallbackDetails = {
      val __obj = js.Dynamic.literal(sourceFrameId = sourceFrameId.asInstanceOf[js.Any], sourceProcessId = sourceProcessId.asInstanceOf[js.Any], sourceTabId = sourceTabId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebNavigationSourceCallbackDetails]
    }
    
    @scala.inline
    implicit class WebNavigationSourceCallbackDetailsMutableBuilder[Self <: WebNavigationSourceCallbackDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceFrameId(value: Double): Self = StObject.set(x, "sourceFrameId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceProcessId(value: Double): Self = StObject.set(x, "sourceProcessId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTabId(value: Double): Self = StObject.set(x, "sourceTabId", value.asInstanceOf[js.Any])
    }
  }
  
  type WebNavigationSourceEvent = typings.chrome.chrome.webNavigation.WebNavigationEvent[typings.chrome.chrome.webNavigation.WebNavigationSourceCallbackDetails]
  
  @js.native
  trait WebNavigationTransitionCallbackDetails
    extends typings.chrome.chrome.webNavigation.WebNavigationFramedCallbackDetails {
    
    /**
      * A list of transition qualifiers.
      * Each element one of: "client_redirect", "server_redirect", "forward_back", or "from_address_bar"
      */
    var transitionQualifiers: js.Array[String] = js.native
    
    /**
      * Cause of the navigation.
      * One of: "link", "typed", "auto_bookmark", "auto_subframe", "manual_subframe", "generated", "start_page", "form_submit", "reload", "keyword", or "keyword_generated"
      */
    var transitionType: String = js.native
  }
  object WebNavigationTransitionCallbackDetails {
    
    @scala.inline
    def apply(
      frameId: Double,
      processId: Double,
      tabId: Double,
      timeStamp: Double,
      transitionQualifiers: js.Array[String],
      transitionType: String,
      url: String
    ): WebNavigationTransitionCallbackDetails = {
      val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], transitionQualifiers = transitionQualifiers.asInstanceOf[js.Any], transitionType = transitionType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebNavigationTransitionCallbackDetails]
    }
    
    @scala.inline
    implicit class WebNavigationTransitionCallbackDetailsMutableBuilder[Self <: WebNavigationTransitionCallbackDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransitionQualifiers(value: js.Array[String]): Self = StObject.set(x, "transitionQualifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionQualifiersVarargs(value: String*): Self = StObject.set(x, "transitionQualifiers", js.Array(value :_*))
      
      @scala.inline
      def setTransitionType(value: String): Self = StObject.set(x, "transitionType", value.asInstanceOf[js.Any])
    }
  }
  
  type WebNavigationTransitionalEvent = typings.chrome.chrome.webNavigation.WebNavigationEvent[typings.chrome.chrome.webNavigation.WebNavigationTransitionCallbackDetails]
  
  @js.native
  trait WebNavigationUrlCallbackDetails
    extends typings.chrome.chrome.webNavigation.WebNavigationCallbackDetails {
    
    var url: String = js.native
  }
  object WebNavigationUrlCallbackDetails {
    
    @scala.inline
    def apply(tabId: Double, timeStamp: Double, url: String): WebNavigationUrlCallbackDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebNavigationUrlCallbackDetails]
    }
    
    @scala.inline
    implicit class WebNavigationUrlCallbackDetailsMutableBuilder[Self <: WebNavigationUrlCallbackDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
