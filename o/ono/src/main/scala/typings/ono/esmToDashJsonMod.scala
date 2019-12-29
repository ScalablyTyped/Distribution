package typings.ono

import typings.ono.esmTypesMod.ErrorPOJO
import typings.std.Error
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ono/esm/to-json", JSImport.Namespace)
@js.native
object esmToDashJsonMod extends js.Object {
  def getDeepKeys(obj: js.Object): Set[String | js.Symbol] = js.native
  def getDeepKeys(obj: js.Object, omit: js.Array[String | js.Symbol]): Set[String | js.Symbol] = js.native
  def toJSON(): ErrorPOJO = js.native
  @JSName("toJSON")
  def toJSON_Intersection(): ErrorPOJO with Error = js.native
}

