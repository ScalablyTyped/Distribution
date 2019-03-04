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
    configure: js.Function1[js.Any, scala.Unit],
    delegate: js.Function3[scala.Double, java.lang.String, js.Any, scala.Unit],
    randomCallback: js.Function0[scala.Unit],
    response: js.Function1[js.Any, scala.Unit],
    seedRandom: js.Function1[stdLib.ArrayBuffer, scala.Unit]
  ): OpenPGPWorker = {
    val __obj = js.Dynamic.literal(configure = configure, delegate = delegate, randomCallback = randomCallback, response = response, seedRandom = seedRandom)
  
    __obj.asInstanceOf[OpenPGPWorker]
  }
}

