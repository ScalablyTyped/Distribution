package typings.mockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Mockjs.Random - Address
// see https://github.com/nuysoft/Mock/wiki/Address
@js.native
trait MockjsRandomAddress extends js.Object {
  // Random.city
  def city(): S = js.native
  def city(prefix: B): S = js.native
  // Random.county
  def county(): S = js.native
  def county(prefix: B): S = js.native
  // Random.province
  def province(): S = js.native
  // Random.region
  def region(): S = js.native
  // Random.zip
  def zip(): S = js.native
  def zip(prefix: B): S = js.native
}

