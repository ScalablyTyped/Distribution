package typings
package atOracleOraclejetLib.ojcompositeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewModel extends js.Object {
  def activated(param0: ViewModelContext): js.Promise[_] | scala.Unit
  def bindingsApplied(param0: ViewModelContext): scala.Unit
  def connected(param0: ViewModelContext): scala.Unit
  def disconnected(param0: stdLib.Element): scala.Unit
  def propertyChanged(param0: PropertyChangedContext): scala.Unit
}

