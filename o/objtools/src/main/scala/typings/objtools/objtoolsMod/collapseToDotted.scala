package typings.objtools.objtoolsMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objtools", "collapseToDotted")
@js.native
object collapseToDotted extends js.Object {
  def apply(obj: Record[String, _]): Record[String, _] = js.native
  def apply(obj: Record[String, _], includeRedundantLevels: Boolean): Record[String, _] = js.native
  def apply(obj: Record[String, _], includeRedundantLevels: Boolean, stopAtArrays: Boolean): Record[String, _] = js.native
}

