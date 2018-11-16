package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OpenPGPWorker extends js.Object {
  def configure(config: js.Any): scala.Unit
  def delegate(id: scala.Double, method: java.lang.String, options: js.Any): scala.Unit
  def randomCallback(): scala.Unit
  def response(event: js.Any): scala.Unit
  def seedRandom(buffer: stdLib.ArrayBuffer): scala.Unit
}

