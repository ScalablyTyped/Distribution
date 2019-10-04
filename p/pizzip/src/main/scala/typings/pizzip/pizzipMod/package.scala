package typings.pizzip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pizzipMod {
  import typings.node.Buffer
  import typings.std.ArrayBuffer
  import typings.std.Uint8Array

  type Data = String | ArrayBuffer | Uint8Array | Buffer
  type LoadData = Data | js.Array[Double]
}
