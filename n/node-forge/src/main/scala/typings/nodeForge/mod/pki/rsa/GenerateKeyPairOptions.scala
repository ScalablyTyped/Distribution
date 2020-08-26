package typings.nodeForge.mod.pki.rsa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateKeyPairOptions extends js.Object {
  var algorithm: js.UndefOr[String] = js.native
  var bits: js.UndefOr[Double] = js.native
  var e: js.UndefOr[Double] = js.native
  var prng: js.UndefOr[js.Any] = js.native
  var workLoad: js.UndefOr[Double] = js.native
  var workerScript: js.UndefOr[String] = js.native
  var workers: js.UndefOr[Double] = js.native
}

object GenerateKeyPairOptions {
  @scala.inline
  def apply(): GenerateKeyPairOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateKeyPairOptions]
  }
  @scala.inline
  implicit class GenerateKeyPairOptionsOps[Self <: GenerateKeyPairOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    @scala.inline
    def setBits(value: Double): Self = this.set("bits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBits: Self = this.set("bits", js.undefined)
    @scala.inline
    def setE(value: Double): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE: Self = this.set("e", js.undefined)
    @scala.inline
    def setPrng(value: js.Any): Self = this.set("prng", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrng: Self = this.set("prng", js.undefined)
    @scala.inline
    def setWorkLoad(value: Double): Self = this.set("workLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkLoad: Self = this.set("workLoad", js.undefined)
    @scala.inline
    def setWorkerScript(value: String): Self = this.set("workerScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerScript: Self = this.set("workerScript", js.undefined)
    @scala.inline
    def setWorkers(value: Double): Self = this.set("workers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkers: Self = this.set("workers", js.undefined)
  }
  
}

