package typings.packageJson.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Integrity extends js.Object {
  val integrity: js.UndefOr[String] = js.native
  val shasum: String = js.native
  val tarball: String = js.native
}

object Integrity {
  @scala.inline
  def apply(shasum: String, tarball: String): Integrity = {
    val __obj = js.Dynamic.literal(shasum = shasum.asInstanceOf[js.Any], tarball = tarball.asInstanceOf[js.Any])
    __obj.asInstanceOf[Integrity]
  }
  @scala.inline
  implicit class IntegrityOps[Self <: Integrity] (val x: Self) extends AnyVal {
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
    def setShasum(value: String): Self = this.set("shasum", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarball(value: String): Self = this.set("tarball", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntegrity(value: String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", js.undefined)
  }
  
}

