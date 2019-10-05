package typings.nodeDashForge.nodeDashForgeMod.pki.rsa

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
    bits: Int | Double = null,
    e: Int | Double = null,
    prng: js.Any = null,
    workLoad: Int | Double = null,
    workerScript: String = null,
    workers: Int | Double = null
  ): GenerateKeyPairOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (bits != null) __obj.updateDynamic("bits")(bits.asInstanceOf[js.Any])
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (prng != null) __obj.updateDynamic("prng")(prng)
    if (workLoad != null) __obj.updateDynamic("workLoad")(workLoad.asInstanceOf[js.Any])
    if (workerScript != null) __obj.updateDynamic("workerScript")(workerScript)
    if (workers != null) __obj.updateDynamic("workers")(workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateKeyPairOptions]
  }
}

