package typings.node.v8Mod

import typings.node.NodeJS.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("v8", "deserialize")
@js.native
object deserialize extends js.Object {
  /**
    * Uses a `DefaultDeserializer` with default options to read a JS value from a buffer.
    * @experimental
    */
  def apply(data: TypedArray): js.Any = js.native
}

