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
  type NeedleHttpVerbs = NeedleReadonlyHttpVerbs | NeedleReadWriteHttpVerbs
  type NeedleOptions = RequestOptions with ResponseOptions with RedirectOptions with nodeLib.httpsMod.RequestOptions
  type NeedleReadWriteHttpVerbs = needleLib.needleLibStrings.delete | needleLib.needleLibStrings.patch | needleLib.needleLibStrings.post | needleLib.needleLibStrings.put
  type NeedleReadonlyHttpVerbs = needleLib.needleLibStrings.get | needleLib.needleLibStrings.head
  type ReadableStream = nodeLib.NodeJSNs.ReadableStream
}
