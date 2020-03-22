package typings.objectMapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("object-mapper", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def merge(srcObject: js.Object, mapObject: js.Object): js.Object = js.native
  def merge[T](srcObject: js.Object, destinationObject: T, mapObject: js.Object): T = js.native
}

