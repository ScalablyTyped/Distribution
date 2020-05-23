package typings.nodeForge.mod.pki.rsa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateKeyPairOptions extends js.Object {
  var algorithm: js.UndefOr[String] = js.undefined
  var bits: js.UndefOr[Double] = js.undefined
  var e: js.UndefOr[Double] = js.undefined
  var prng: js.UndefOr[js.Any] = js.undefined
  var workLoad: js.UndefOr[Double] = js.undefined
  var workerScript: js.UndefOr[String] = js.undefined
  var workers: js.UndefOr[Double] = js.undefined
}

object GenerateKeyPairOptions {
  @scala.inline
  def apply(
    algorithm: String = null,
    bits: js.UndefOr[Double] = js.undefined,
    e: js.UndefOr[Double] = js.undefined,
    prng: js.Any = null,
    workLoad: js.UndefOr[Double] = js.undefined,
    workerScript: String = null,
    workers: js.UndefOr[Double] = js.undefined
  ): GenerateKeyPairOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(bits)) __obj.updateDynamic("bits")(bits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(e)) __obj.updateDynamic("e")(e.get.asInstanceOf[js.Any])
    if (prng != null) __obj.updateDynamic("prng")(prng.asInstanceOf[js.Any])
    if (!js.isUndefined(workLoad)) __obj.updateDynamic("workLoad")(workLoad.get.asInstanceOf[js.Any])
    if (workerScript != null) __obj.updateDynamic("workerScript")(workerScript.asInstanceOf[js.Any])
    if (!js.isUndefined(workers)) __obj.updateDynamic("workers")(workers.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateKeyPairOptions]
  }
}

