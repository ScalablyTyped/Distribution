package typings
package nodeDashFetchLib.nodeDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fetchNs {
  type BodyInit = stdLib.ArrayBuffer | stdLib.ArrayBufferView | nodeLib.NodeJSNs.ReadableStream | java.lang.String | nodeLib.urlMod.URLSearchParams
  type HeaderInit = Headers | js.Array[java.lang.String]
  type RequestCache = nodeDashFetchLib.nodeDashFetchLibStrings.default | nodeDashFetchLib.nodeDashFetchLibStrings.`force-cache` | nodeDashFetchLib.nodeDashFetchLibStrings.`no-cache` | nodeDashFetchLib.nodeDashFetchLibStrings.`no-store` | nodeDashFetchLib.nodeDashFetchLibStrings.`only-if-cached` | nodeDashFetchLib.nodeDashFetchLibStrings.reload
  type RequestContext = nodeDashFetchLib.nodeDashFetchLibStrings.audio | nodeDashFetchLib.nodeDashFetchLibStrings.beacon | nodeDashFetchLib.nodeDashFetchLibStrings.cspreport | nodeDashFetchLib.nodeDashFetchLibStrings.download | nodeDashFetchLib.nodeDashFetchLibStrings.embed | nodeDashFetchLib.nodeDashFetchLibStrings.eventsource | nodeDashFetchLib.nodeDashFetchLibStrings.favicon | nodeDashFetchLib.nodeDashFetchLibStrings.fetch | nodeDashFetchLib.nodeDashFetchLibStrings.font | nodeDashFetchLib.nodeDashFetchLibStrings.form | nodeDashFetchLib.nodeDashFetchLibStrings.frame | nodeDashFetchLib.nodeDashFetchLibStrings.hyperlink | nodeDashFetchLib.nodeDashFetchLibStrings.iframe | nodeDashFetchLib.nodeDashFetchLibStrings.image | nodeDashFetchLib.nodeDashFetchLibStrings.imageset | nodeDashFetchLib.nodeDashFetchLibStrings.`import` | nodeDashFetchLib.nodeDashFetchLibStrings.internal | nodeDashFetchLib.nodeDashFetchLibStrings.location | nodeDashFetchLib.nodeDashFetchLibStrings.manifest | nodeDashFetchLib.nodeDashFetchLibStrings.`object` | nodeDashFetchLib.nodeDashFetchLibStrings.ping | nodeDashFetchLib.nodeDashFetchLibStrings.plugin | nodeDashFetchLib.nodeDashFetchLibStrings.prefetch | nodeDashFetchLib.nodeDashFetchLibStrings.script | nodeDashFetchLib.nodeDashFetchLibStrings.serviceworker | nodeDashFetchLib.nodeDashFetchLibStrings.sharedworker | nodeDashFetchLib.nodeDashFetchLibStrings.style | nodeDashFetchLib.nodeDashFetchLibStrings.subresource | nodeDashFetchLib.nodeDashFetchLibStrings.track | nodeDashFetchLib.nodeDashFetchLibStrings.video | nodeDashFetchLib.nodeDashFetchLibStrings.worker | nodeDashFetchLib.nodeDashFetchLibStrings.xmlhttprequest | nodeDashFetchLib.nodeDashFetchLibStrings.xslt
  type RequestCredentials = nodeDashFetchLib.nodeDashFetchLibStrings.omit | nodeDashFetchLib.nodeDashFetchLibStrings.include | nodeDashFetchLib.nodeDashFetchLibStrings.`same-origin`
  type RequestInfo = java.lang.String | Request
  type RequestMode = nodeDashFetchLib.nodeDashFetchLibStrings.cors | nodeDashFetchLib.nodeDashFetchLibStrings.`no-cors` | nodeDashFetchLib.nodeDashFetchLibStrings.`same-origin`
  type RequestRedirect = nodeDashFetchLib.nodeDashFetchLibStrings.error | nodeDashFetchLib.nodeDashFetchLibStrings.follow | nodeDashFetchLib.nodeDashFetchLibStrings.manual
  type ResponseType = nodeDashFetchLib.nodeDashFetchLibStrings.basic | nodeDashFetchLib.nodeDashFetchLibStrings.cors | nodeDashFetchLib.nodeDashFetchLibStrings.default | nodeDashFetchLib.nodeDashFetchLibStrings.error | nodeDashFetchLib.nodeDashFetchLibStrings.opaque | nodeDashFetchLib.nodeDashFetchLibStrings.opaqueredirect
}
