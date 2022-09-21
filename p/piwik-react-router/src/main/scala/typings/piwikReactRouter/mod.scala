package typings.piwikReactRouter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(option: PiwikReactRouterOptions): PiwikReactRouter = ^.asInstanceOf[js.Dynamic].apply(option.asInstanceOf[js.Any]).asInstanceOf[PiwikReactRouter]
  
  @JSImport("piwik-react-router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PiwikReactRouter extends StObject {
    
    var _isShim: Boolean
    
    def connectToHistory(
      history: PiwikReactRouterHistory,
      modifier: js.Function1[/* history */ PiwikReactRouterHistory, Unit]
    ): PiwikReactRouterHistory
    
    def disconnectFromHistory(): Boolean
    
    def push(args: Any): Unit
    
    def setUserId(userId: String): Unit
    
    def track(opts: PiwikReactRouterTrack): Unit
    
    def trackError(e: PiwikReactRouterTrackErrorEvent, eventName: String): Unit
  }
  object PiwikReactRouter {
    
    inline def apply(
      _isShim: Boolean,
      connectToHistory: (PiwikReactRouterHistory, js.Function1[/* history */ PiwikReactRouterHistory, Unit]) => PiwikReactRouterHistory,
      disconnectFromHistory: () => Boolean,
      push: Any => Unit,
      setUserId: String => Unit,
      track: PiwikReactRouterTrack => Unit,
      trackError: (PiwikReactRouterTrackErrorEvent, String) => Unit
    ): PiwikReactRouter = {
      val __obj = js.Dynamic.literal(_isShim = _isShim.asInstanceOf[js.Any], connectToHistory = js.Any.fromFunction2(connectToHistory), disconnectFromHistory = js.Any.fromFunction0(disconnectFromHistory), push = js.Any.fromFunction1(push), setUserId = js.Any.fromFunction1(setUserId), track = js.Any.fromFunction1(track), trackError = js.Any.fromFunction2(trackError))
      __obj.asInstanceOf[PiwikReactRouter]
    }
    
    extension [Self <: PiwikReactRouter](x: Self) {
      
      inline def setConnectToHistory(
        value: (PiwikReactRouterHistory, js.Function1[/* history */ PiwikReactRouterHistory, Unit]) => PiwikReactRouterHistory
      ): Self = StObject.set(x, "connectToHistory", js.Any.fromFunction2(value))
      
      inline def setDisconnectFromHistory(value: () => Boolean): Self = StObject.set(x, "disconnectFromHistory", js.Any.fromFunction0(value))
      
      inline def setPush(value: Any => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setSetUserId(value: String => Unit): Self = StObject.set(x, "setUserId", js.Any.fromFunction1(value))
      
      inline def setTrack(value: PiwikReactRouterTrack => Unit): Self = StObject.set(x, "track", js.Any.fromFunction1(value))
      
      inline def setTrackError(value: (PiwikReactRouterTrackErrorEvent, String) => Unit): Self = StObject.set(x, "trackError", js.Any.fromFunction2(value))
      
      inline def set_isShim(value: Boolean): Self = StObject.set(x, "_isShim", value.asInstanceOf[js.Any])
    }
  }
  
  trait PiwikReactRouterHistory extends StObject {
    
    var listen: js.UndefOr[js.Function1[/* location */ String, Unit]] = js.undefined
    
    var location: String
  }
  object PiwikReactRouterHistory {
    
    inline def apply(location: String): PiwikReactRouterHistory = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[PiwikReactRouterHistory]
    }
    
    extension [Self <: PiwikReactRouterHistory](x: Self) {
      
      inline def setListen(value: /* location */ String => Unit): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      
      inline def setListenUndefined: Self = StObject.set(x, "listen", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait PiwikReactRouterOptions extends StObject {
    
    var clientTrackerName: js.UndefOr[String] = js.undefined
    
    var enableLinkTracking: js.UndefOr[Boolean] = js.undefined
    
    var ignoreInitialVisit: js.UndefOr[Boolean] = js.undefined
    
    var injectScript: js.UndefOr[Boolean] = js.undefined
    
    var serverTrackerName: js.UndefOr[String] = js.undefined
    
    var siteId: String
    
    var trackErrorHandler: js.UndefOr[Boolean] = js.undefined
    
    var trackErrors: js.UndefOr[Boolean] = js.undefined
    
    var updateDocumentTitle: js.UndefOr[Boolean] = js.undefined
    
    var url: String
  }
  object PiwikReactRouterOptions {
    
    inline def apply(siteId: String, url: String): PiwikReactRouterOptions = {
      val __obj = js.Dynamic.literal(siteId = siteId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PiwikReactRouterOptions]
    }
    
    extension [Self <: PiwikReactRouterOptions](x: Self) {
      
      inline def setClientTrackerName(value: String): Self = StObject.set(x, "clientTrackerName", value.asInstanceOf[js.Any])
      
      inline def setClientTrackerNameUndefined: Self = StObject.set(x, "clientTrackerName", js.undefined)
      
      inline def setEnableLinkTracking(value: Boolean): Self = StObject.set(x, "enableLinkTracking", value.asInstanceOf[js.Any])
      
      inline def setEnableLinkTrackingUndefined: Self = StObject.set(x, "enableLinkTracking", js.undefined)
      
      inline def setIgnoreInitialVisit(value: Boolean): Self = StObject.set(x, "ignoreInitialVisit", value.asInstanceOf[js.Any])
      
      inline def setIgnoreInitialVisitUndefined: Self = StObject.set(x, "ignoreInitialVisit", js.undefined)
      
      inline def setInjectScript(value: Boolean): Self = StObject.set(x, "injectScript", value.asInstanceOf[js.Any])
      
      inline def setInjectScriptUndefined: Self = StObject.set(x, "injectScript", js.undefined)
      
      inline def setServerTrackerName(value: String): Self = StObject.set(x, "serverTrackerName", value.asInstanceOf[js.Any])
      
      inline def setServerTrackerNameUndefined: Self = StObject.set(x, "serverTrackerName", js.undefined)
      
      inline def setSiteId(value: String): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
      
      inline def setTrackErrorHandler(value: Boolean): Self = StObject.set(x, "trackErrorHandler", value.asInstanceOf[js.Any])
      
      inline def setTrackErrorHandlerUndefined: Self = StObject.set(x, "trackErrorHandler", js.undefined)
      
      inline def setTrackErrors(value: Boolean): Self = StObject.set(x, "trackErrors", value.asInstanceOf[js.Any])
      
      inline def setTrackErrorsUndefined: Self = StObject.set(x, "trackErrors", js.undefined)
      
      inline def setUpdateDocumentTitle(value: Boolean): Self = StObject.set(x, "updateDocumentTitle", value.asInstanceOf[js.Any])
      
      inline def setUpdateDocumentTitleUndefined: Self = StObject.set(x, "updateDocumentTitle", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PiwikReactRouterTrack extends StObject {
    
    var basename: String
    
    var path: String
    
    var pathname: String
    
    var search: String
  }
  object PiwikReactRouterTrack {
    
    inline def apply(basename: String, path: String, pathname: String, search: String): PiwikReactRouterTrack = {
      val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[PiwikReactRouterTrack]
    }
    
    extension [Self <: PiwikReactRouterTrack](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  trait PiwikReactRouterTrackErrorEvent extends StObject {
    
    var filename: String
    
    var lineno: String
    
    var message: String
  }
  object PiwikReactRouterTrackErrorEvent {
    
    inline def apply(filename: String, lineno: String, message: String): PiwikReactRouterTrackErrorEvent = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[PiwikReactRouterTrackErrorEvent]
    }
    
    extension [Self <: PiwikReactRouterTrackErrorEvent](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setLineno(value: String): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
