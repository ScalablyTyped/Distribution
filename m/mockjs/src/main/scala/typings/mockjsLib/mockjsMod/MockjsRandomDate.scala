package typings
package mockjsLib.mockjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockjsRandomDate extends js.Object {
  // Random.date
  def date(): S = js.native
  def date(format: S): S = js.native
  // Random.datetime
  def datetime(): S = js.native
  def datetime(format: S): S = js.native
  def mow(): S = js.native
  def mow(format: S): S = js.native
  // Random.now
  def now(util: RandomDateUtilString): S = js.native
  def now(util: RandomDateUtilString, format: S): S = js.native
  // Random.time
  def time(): S = js.native
  def time(format: S): S = js.native
}

