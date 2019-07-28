package typings.needle.needleMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreNs {
  type BodyData = Buffer | KeyValue | typings.node.NodeJSNs.ReadableStream | String | Null
  type Cookies = StringDictionary[js.Any]
  type KeyValue = StringDictionary[js.Any]
  type NeedleCallback = js.Function3[
    /* error */ Error | Null, 
    /* response */ typings.needle.needleMod.coreNs.NeedleResponse, 
    /* body */ js.Any, 
    Unit
  ]
  type NeedleOptions = RequestOptions with ResponseOptions with RedirectOptions with typings.node.httpsMod.RequestOptions
  type ReadableStream = typings.node.NodeJSNs.ReadableStream
}
