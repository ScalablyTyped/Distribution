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

object OpenPGPWorker {
  @scala.inline
  def apply(
    configure: js.Any => scala.Unit,
    delegate: (scala.Double, java.lang.String, js.Any) => scala.Unit,
    randomCallback: () => scala.Unit,
    response: js.Any => scala.Unit,
    seedRandom: stdLib.ArrayBuffer => scala.Unit
  ): OpenPGPWorker = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure), delegate = js.Any.fromFunction3(delegate), randomCallback = js.Any.fromFunction0(randomCallback), response = js.Any.fromFunction1(response), seedRandom = js.Any.fromFunction1(seedRandom))
  
    __obj.asInstanceOf[OpenPGPWorker]
  }
}

