package typings.parchment.distSrcBlotScrollMod

import typings.std.MutationObserver
import typings.std.MutationRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollBlot
  extends typings.parchment.distSrcBlotAbstractContainerMod.default {
  var observer: MutationObserver = js.native
  def update(): Unit = js.native
  def update(mutations: js.Array[MutationRecord]): Unit = js.native
}

