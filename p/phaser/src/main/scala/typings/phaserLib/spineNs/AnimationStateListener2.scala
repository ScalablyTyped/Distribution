package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AnimationStateListener2 extends js.Object {
  def complete(entry: TrackEntry): scala.Unit
  def dispose(entry: TrackEntry): scala.Unit
  def end(entry: TrackEntry): scala.Unit
  def event(entry: TrackEntry, event: Event): scala.Unit
  def interrupt(entry: TrackEntry): scala.Unit
  def start(entry: TrackEntry): scala.Unit
}

