package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "IslandPool")
@js.native
class IslandPool () extends Pool {
  def create(): Island = js.native
  def destroy(island: Island): IslandPool = js.native
}

