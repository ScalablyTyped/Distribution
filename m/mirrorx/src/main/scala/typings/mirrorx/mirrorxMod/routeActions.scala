package typings.mirrorx.mirrorxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait routeActions extends js.Object {
  def go(n: Double): RouterAction = js.native
  def goBack(): RouterAction = js.native
  def goForward(): RouterAction = js.native
  def push(location: js.Any): RouterAction = js.native
  def push(location: js.Any, state: js.Any): RouterAction = js.native
  def replace(location: js.Any): RouterAction = js.native
  def replace(location: js.Any, state: js.Any): RouterAction = js.native
}

