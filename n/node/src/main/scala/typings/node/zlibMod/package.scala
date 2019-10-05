package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zlibMod {
  import typings.node.Buffer
  import typings.node.Error
  import typings.node.NodeJS.TypedArray
  import typings.std.ArrayBuffer
  import typings.std.DataView

  type CompressCallback = js.Function2[/* error */ Error | Null, /* result */ Buffer, Unit]
  type InputType = java.lang.String | DataView | ArrayBuffer | TypedArray
}
