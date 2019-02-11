package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IslandPool extends Pool {
  def create(): Island
  def destroy(island: Island): IslandPool
}

