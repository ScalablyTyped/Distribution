package typings.nodeFetch

import typings.nodeFetch.mod.RequestCache
import typings.nodeFetch.mod.RequestContext
import typings.nodeFetch.mod.RequestCredentials
import typings.nodeFetch.mod.RequestMode
import typings.nodeFetch.mod.RequestRedirect
import typings.nodeFetch.mod.ResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeFetchStrings {
  
  @js.native
  sealed trait default
    extends RequestCache
       with ResponseType
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait FetchError extends StObject
  @scala.inline
  def FetchError: FetchError = "FetchError".asInstanceOf[FetchError]
  
  @js.native
  sealed trait abort extends StObject
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  
  @js.native
  sealed trait audio extends RequestContext
  @scala.inline
  def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait basic extends ResponseType
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait beacon extends RequestContext
  @scala.inline
  def beacon: beacon = "beacon".asInstanceOf[beacon]
  
  @js.native
  sealed trait cors
    extends RequestMode
       with ResponseType
  @scala.inline
  def cors: cors = "cors".asInstanceOf[cors]
  
  @js.native
  sealed trait cspreport extends RequestContext
  @scala.inline
  def cspreport: cspreport = "cspreport".asInstanceOf[cspreport]
  
  @js.native
  sealed trait download extends RequestContext
  @scala.inline
  def download: download = "download".asInstanceOf[download]
  
  @js.native
  sealed trait embed extends RequestContext
  @scala.inline
  def embed: embed = "embed".asInstanceOf[embed]
  
  @js.native
  sealed trait error
    extends RequestRedirect
       with ResponseType
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait eventsource extends RequestContext
  @scala.inline
  def eventsource: eventsource = "eventsource".asInstanceOf[eventsource]
  
  @js.native
  sealed trait favicon extends RequestContext
  @scala.inline
  def favicon: favicon = "favicon".asInstanceOf[favicon]
  
  @js.native
  sealed trait fetch extends RequestContext
  @scala.inline
  def fetch: fetch = "fetch".asInstanceOf[fetch]
  
  @js.native
  sealed trait follow extends RequestRedirect
  @scala.inline
  def follow: follow = "follow".asInstanceOf[follow]
  
  @js.native
  sealed trait font extends RequestContext
  @scala.inline
  def font: font = "font".asInstanceOf[font]
  
  @js.native
  sealed trait `force-cache` extends RequestCache
  @scala.inline
  def `force-cache`: `force-cache` = "force-cache".asInstanceOf[`force-cache`]
  
  @js.native
  sealed trait form extends RequestContext
  @scala.inline
  def form: form = "form".asInstanceOf[form]
  
  @js.native
  sealed trait frame extends RequestContext
  @scala.inline
  def frame: frame = "frame".asInstanceOf[frame]
  
  @js.native
  sealed trait hyperlink extends RequestContext
  @scala.inline
  def hyperlink: hyperlink = "hyperlink".asInstanceOf[hyperlink]
  
  @js.native
  sealed trait iframe extends RequestContext
  @scala.inline
  def iframe: iframe = "iframe".asInstanceOf[iframe]
  
  @js.native
  sealed trait image extends RequestContext
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait imageset extends RequestContext
  @scala.inline
  def imageset: imageset = "imageset".asInstanceOf[imageset]
  
  @js.native
  sealed trait `import` extends RequestContext
  @scala.inline
  def `import`: `import` = "import".asInstanceOf[`import`]
  
  @js.native
  sealed trait include extends RequestCredentials
  @scala.inline
  def include: include = "include".asInstanceOf[include]
  
  @js.native
  sealed trait internal extends RequestContext
  @scala.inline
  def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait location extends RequestContext
  @scala.inline
  def location: location = "location".asInstanceOf[location]
  
  @js.native
  sealed trait manifest extends RequestContext
  @scala.inline
  def manifest: manifest = "manifest".asInstanceOf[manifest]
  
  @js.native
  sealed trait manual extends RequestRedirect
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait native extends StObject
  @scala.inline
  def native: native = "native".asInstanceOf[native]
  
  @js.native
  sealed trait `no-cache` extends RequestCache
  @scala.inline
  def `no-cache`: `no-cache` = "no-cache".asInstanceOf[`no-cache`]
  
  @js.native
  sealed trait `no-cors` extends RequestMode
  @scala.inline
  def `no-cors`: `no-cors` = "no-cors".asInstanceOf[`no-cors`]
  
  @js.native
  sealed trait `no-store` extends RequestCache
  @scala.inline
  def `no-store`: `no-store` = "no-store".asInstanceOf[`no-store`]
  
  @js.native
  sealed trait `object` extends RequestContext
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait omit extends RequestCredentials
  @scala.inline
  def omit: omit = "omit".asInstanceOf[omit]
  
  @js.native
  sealed trait `only-if-cached` extends RequestCache
  @scala.inline
  def `only-if-cached`: `only-if-cached` = "only-if-cached".asInstanceOf[`only-if-cached`]
  
  @js.native
  sealed trait opaque extends ResponseType
  @scala.inline
  def opaque: opaque = "opaque".asInstanceOf[opaque]
  
  @js.native
  sealed trait opaqueredirect extends ResponseType
  @scala.inline
  def opaqueredirect: opaqueredirect = "opaqueredirect".asInstanceOf[opaqueredirect]
  
  @js.native
  sealed trait ping extends RequestContext
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  
  @js.native
  sealed trait plugin extends RequestContext
  @scala.inline
  def plugin: plugin = "plugin".asInstanceOf[plugin]
  
  @js.native
  sealed trait prefetch extends RequestContext
  @scala.inline
  def prefetch: prefetch = "prefetch".asInstanceOf[prefetch]
  
  @js.native
  sealed trait reload extends RequestCache
  @scala.inline
  def reload: reload = "reload".asInstanceOf[reload]
  
  @js.native
  sealed trait `same-origin`
    extends RequestCredentials
       with RequestMode
  @scala.inline
  def `same-origin`: `same-origin` = "same-origin".asInstanceOf[`same-origin`]
  
  @js.native
  sealed trait script extends RequestContext
  @scala.inline
  def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait serviceworker extends RequestContext
  @scala.inline
  def serviceworker: serviceworker = "serviceworker".asInstanceOf[serviceworker]
  
  @js.native
  sealed trait sharedworker extends RequestContext
  @scala.inline
  def sharedworker: sharedworker = "sharedworker".asInstanceOf[sharedworker]
  
  @js.native
  sealed trait style extends RequestContext
  @scala.inline
  def style: style = "style".asInstanceOf[style]
  
  @js.native
  sealed trait subresource extends RequestContext
  @scala.inline
  def subresource: subresource = "subresource".asInstanceOf[subresource]
  
  @js.native
  sealed trait track extends RequestContext
  @scala.inline
  def track: track = "track".asInstanceOf[track]
  
  @js.native
  sealed trait transparent extends StObject
  @scala.inline
  def transparent: transparent = "transparent".asInstanceOf[transparent]
  
  @js.native
  sealed trait video extends RequestContext
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait worker extends RequestContext
  @scala.inline
  def worker: worker = "worker".asInstanceOf[worker]
  
  @js.native
  sealed trait xmlhttprequest extends RequestContext
  @scala.inline
  def xmlhttprequest: xmlhttprequest = "xmlhttprequest".asInstanceOf[xmlhttprequest]
  
  @js.native
  sealed trait xslt extends RequestContext
  @scala.inline
  def xslt: xslt = "xslt".asInstanceOf[xslt]
}
