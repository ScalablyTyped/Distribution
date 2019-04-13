package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "IslandNodePool")
@js.native
class IslandNodePool () extends Pool {
  def create(): IslandNode = js.native
  def destroy(node: IslandNode): IslandNodePool = js.native
}

