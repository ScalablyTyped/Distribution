package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zlibMod {
  import typings.node.Buffer
  import typings.node.NodeJS.ArrayBufferView
  import typings.std.ArrayBuffer
  import typings.std.Error

  type CompressCallback = js.Function2[/* error */ Error | Null, /* result */ Buffer, Unit]
  type InputType = String | ArrayBuffer | ArrayBufferView
}
