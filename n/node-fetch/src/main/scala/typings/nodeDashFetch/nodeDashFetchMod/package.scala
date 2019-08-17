package typings.nodeDashFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashFetchMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.node.NodeJSNs.ReadableStream
  import typings.node.urlMod.URLSearchParams
  import typings.std.ArrayBuffer
  import typings.std.ArrayBufferView

  type BlobPart = ArrayBuffer | ArrayBufferView | Blob | String
  type BodyInit = ArrayBuffer | ArrayBufferView | ReadableStream | String | URLSearchParams
  type HeaderInit = HeadersInit
  type HeadersInit = Headers | js.Array[js.Array[String]] | StringDictionary[String]
  type RequestInfo = String | Request
}
