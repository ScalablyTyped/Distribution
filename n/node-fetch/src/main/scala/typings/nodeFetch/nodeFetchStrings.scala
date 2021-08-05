package typings.nodeFetch

import typings.nodeFetch.mod.RequestCache
import typings.nodeFetch.mod.RequestContext
import typings.nodeFetch.mod.RequestCredentials
import typings.nodeFetch.mod.RequestMode
import typings.nodeFetch.mod.RequestRedirect
import typings.nodeFetch.mod.ResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeFetchStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with RequestCache
       with ResponseType
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait FetchError extends StObject
  inline def FetchError: FetchError = "FetchError".asInstanceOf[FetchError]
  
  @js.native
  sealed trait abort extends StObject
  inline def abort: abort = "abort".asInstanceOf[abort]
  
  @js.native
  sealed trait audio
    extends StObject
       with RequestContext
  inline def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait basic
    extends StObject
       with ResponseType
  inline def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait beacon
    extends StObject
       with RequestContext
  inline def beacon: beacon = "beacon".asInstanceOf[beacon]
  
  @js.native
  sealed trait cors
    extends StObject
       with RequestMode
       with ResponseType
  inline def cors: cors = "cors".asInstanceOf[cors]
  
  @js.native
  sealed trait cspreport
    extends StObject
       with RequestContext
  inline def cspreport: cspreport = "cspreport".asInstanceOf[cspreport]
  
  @js.native
  sealed trait download
    extends StObject
       with RequestContext
  inline def download: download = "download".asInstanceOf[download]
  
  @js.native
  sealed trait embed
    extends StObject
       with RequestContext
  inline def embed: embed = "embed".asInstanceOf[embed]
  
  @js.native
  sealed trait error
    extends StObject
       with RequestRedirect
       with ResponseType
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait eventsource
    extends StObject
       with RequestContext
  inline def eventsource: eventsource = "eventsource".asInstanceOf[eventsource]
  
  @js.native
  sealed trait favicon
    extends StObject
       with RequestContext
  inline def favicon: favicon = "favicon".asInstanceOf[favicon]
  
  @js.native
  sealed trait fetch
    extends StObject
       with RequestContext
  inline def fetch: fetch = "fetch".asInstanceOf[fetch]
  
  @js.native
  sealed trait follow
    extends StObject
       with RequestRedirect
  inline def follow: follow = "follow".asInstanceOf[follow]
  
  @js.native
  sealed trait font
    extends StObject
       with RequestContext
  inline def font: font = "font".asInstanceOf[font]
  
  @js.native
  sealed trait `force-cache`
    extends StObject
       with RequestCache
  inline def `force-cache`: `force-cache` = "force-cache".asInstanceOf[`force-cache`]
  
  @js.native
  sealed trait form
    extends StObject
       with RequestContext
  inline def form: form = "form".asInstanceOf[form]
  
  @js.native
  sealed trait frame
    extends StObject
       with RequestContext
  inline def frame: frame = "frame".asInstanceOf[frame]
  
  @js.native
  sealed trait hyperlink
    extends StObject
       with RequestContext
  inline def hyperlink: hyperlink = "hyperlink".asInstanceOf[hyperlink]
  
  @js.native
  sealed trait iframe
    extends StObject
       with RequestContext
  inline def iframe: iframe = "iframe".asInstanceOf[iframe]
  
  @js.native
  sealed trait image
    extends StObject
       with RequestContext
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait imageset
    extends StObject
       with RequestContext
  inline def imageset: imageset = "imageset".asInstanceOf[imageset]
  
  @js.native
  sealed trait `import`
    extends StObject
       with RequestContext
  inline def `import`: `import` = "import".asInstanceOf[`import`]
  
  @js.native
  sealed trait include
    extends StObject
       with RequestCredentials
  inline def include: include = "include".asInstanceOf[include]
  
  @js.native
  sealed trait internal
    extends StObject
       with RequestContext
  inline def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait location
    extends StObject
       with RequestContext
  inline def location: location = "location".asInstanceOf[location]
  
  @js.native
  sealed trait manifest
    extends StObject
       with RequestContext
  inline def manifest: manifest = "manifest".asInstanceOf[manifest]
  
  @js.native
  sealed trait manual
    extends StObject
       with RequestRedirect
  inline def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait native extends StObject
  inline def native: native = "native".asInstanceOf[native]
  
  @js.native
  sealed trait `no-cache`
    extends StObject
       with RequestCache
  inline def `no-cache`: `no-cache` = "no-cache".asInstanceOf[`no-cache`]
  
  @js.native
  sealed trait `no-cors`
    extends StObject
       with RequestMode
  inline def `no-cors`: `no-cors` = "no-cors".asInstanceOf[`no-cors`]
  
  @js.native
  sealed trait `no-store`
    extends StObject
       with RequestCache
  inline def `no-store`: `no-store` = "no-store".asInstanceOf[`no-store`]
  
  @js.native
  sealed trait `object`
    extends StObject
       with RequestContext
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait omit
    extends StObject
       with RequestCredentials
  inline def omit: omit = "omit".asInstanceOf[omit]
  
  @js.native
  sealed trait `only-if-cached`
    extends StObject
       with RequestCache
  inline def `only-if-cached`: `only-if-cached` = "only-if-cached".asInstanceOf[`only-if-cached`]
  
  @js.native
  sealed trait opaque
    extends StObject
       with ResponseType
  inline def opaque: opaque = "opaque".asInstanceOf[opaque]
  
  @js.native
  sealed trait opaqueredirect
    extends StObject
       with ResponseType
  inline def opaqueredirect: opaqueredirect = "opaqueredirect".asInstanceOf[opaqueredirect]
  
  @js.native
  sealed trait ping
    extends StObject
       with RequestContext
  inline def ping: ping = "ping".asInstanceOf[ping]
  
  @js.native
  sealed trait plugin
    extends StObject
       with RequestContext
  inline def plugin: plugin = "plugin".asInstanceOf[plugin]
  
  @js.native
  sealed trait prefetch
    extends StObject
       with RequestContext
  inline def prefetch: prefetch = "prefetch".asInstanceOf[prefetch]
  
  @js.native
  sealed trait reload
    extends StObject
       with RequestCache
  inline def reload: reload = "reload".asInstanceOf[reload]
  
  @js.native
  sealed trait `same-origin`
    extends StObject
       with RequestCredentials
       with RequestMode
  inline def `same-origin`: `same-origin` = "same-origin".asInstanceOf[`same-origin`]
  
  @js.native
  sealed trait script
    extends StObject
       with RequestContext
  inline def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait serviceworker
    extends StObject
       with RequestContext
  inline def serviceworker: serviceworker = "serviceworker".asInstanceOf[serviceworker]
  
  @js.native
  sealed trait sharedworker
    extends StObject
       with RequestContext
  inline def sharedworker: sharedworker = "sharedworker".asInstanceOf[sharedworker]
  
  @js.native
  sealed trait style
    extends StObject
       with RequestContext
  inline def style: style = "style".asInstanceOf[style]
  
  @js.native
  sealed trait subresource
    extends StObject
       with RequestContext
  inline def subresource: subresource = "subresource".asInstanceOf[subresource]
  
  @js.native
  sealed trait track
    extends StObject
       with RequestContext
  inline def track: track = "track".asInstanceOf[track]
  
  @js.native
  sealed trait transparent extends StObject
  inline def transparent: transparent = "transparent".asInstanceOf[transparent]
  
  @js.native
  sealed trait video
    extends StObject
       with RequestContext
  inline def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait worker
    extends StObject
       with RequestContext
  inline def worker: worker = "worker".asInstanceOf[worker]
  
  @js.native
  sealed trait xmlhttprequest
    extends StObject
       with RequestContext
  inline def xmlhttprequest: xmlhttprequest = "xmlhttprequest".asInstanceOf[xmlhttprequest]
  
  @js.native
  sealed trait xslt
    extends StObject
       with RequestContext
  inline def xslt: xslt = "xslt".asInstanceOf[xslt]
}
