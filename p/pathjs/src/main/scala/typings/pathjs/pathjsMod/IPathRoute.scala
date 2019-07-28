package typings.pathjs.pathjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPathRoute extends js.Object {
  def enter(fns: js.Array[js.Function]): IPathRoute = js.native
  def enter(fns: js.Function): IPathRoute = js.native
  def exit(fn: js.Function0[Unit]): IPathRoute = js.native
  def partition(): js.Array[String] = js.native
  def run(): Unit = js.native
  def to(fn: js.Function0[Unit]): IPathRoute = js.native
}

