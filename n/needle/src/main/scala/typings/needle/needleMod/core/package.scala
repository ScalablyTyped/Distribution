package typings.needle.needleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object core {
  import org.scalablytyped.runtime.StringDictionary
  import typings.node.Buffer
  import typings.std.Error

  type BodyData = Buffer | KeyValue | typings.node.NodeJS.ReadableStream | String | Null
  type Cookies = StringDictionary[js.Any]
  type KeyValue = StringDictionary[js.Any]
  type NeedleCallback = js.Function3[
    /* error */ Error | Null, 
    /* response */ typings.needle.needleMod.core.NeedleResponse, 
    /* body */ js.Any, 
    Unit
  ]
  type NeedleOptions = RequestOptions with ResponseOptions with RedirectOptions with typings.node.httpsMod.RequestOptions
  type ReadableStream = typings.node.NodeJS.ReadableStream
}
