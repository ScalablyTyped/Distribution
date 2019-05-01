package typings
package nodeDashFetchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashFetchMod {
  type BlobPart = stdLib.ArrayBuffer | stdLib.ArrayBufferView | Blob | java.lang.String
  type BodyInit = stdLib.ArrayBuffer | stdLib.ArrayBufferView | nodeLib.NodeJSNs.ReadableStream | java.lang.String | nodeLib.urlMod.URLSearchParams
  type HeaderInit = HeadersInit
  type HeadersInit = Headers | js.Array[js.Array[java.lang.String]] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type RequestInfo = java.lang.String | Request
}
