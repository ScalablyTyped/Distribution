package typings
package pathjsLib.pathjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPath extends js.Object {
  var core: IPathCore
  var history: IPathHistory
  var routes: IPathRoutes
  def dispatch(passed_route: java.lang.String): scala.Unit
  def listen(): scala.Unit
  def map(path: java.lang.String): IPathRoute
  def `match`(path: java.lang.String, parameterize: scala.Boolean): IPathRoute | scala.Null
  def rescue(fn: js.Function): scala.Unit
  def root(path: java.lang.String): scala.Unit
}

