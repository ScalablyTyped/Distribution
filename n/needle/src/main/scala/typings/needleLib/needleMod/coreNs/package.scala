package typings
package needleLib.needleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreNs {
  type BodyData = nodeLib.Buffer | KeyValue | nodeLib.NodeJSNs.ReadableStream | java.lang.String | scala.Null
  type NeedleCallback = js.Function3[
    /* error */ nodeLib.Error | scala.Null, 
    /* response */ NeedleResponse, 
    /* body */ js.Any, 
    scala.Unit
  ]
  type NeedleOptions = RequestOptions with ResponseOptions with RedirectOptions with nodeLib.httpsMod.RequestOptions
  type ReadableStream = nodeLib.NodeJSNs.ReadableStream
}
