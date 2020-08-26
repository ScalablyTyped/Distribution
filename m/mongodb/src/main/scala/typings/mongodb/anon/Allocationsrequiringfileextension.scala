package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allocationsrequiringfileextension extends js.Object {
  var `allocations requiring file extension`: Double = js.native
  var `blocks allocated`: Double = js.native
  var `blocks freed`: Double = js.native
  var `checkpoint size`: Double = js.native
  var `file allocation unit size`: Double = js.native
  var `file bytes available for reuse`: Double = js.native
  var `file magic number`: Double = js.native
  var `file major version number`: Double = js.native
  var `file size in bytes`: Double = js.native
  var `minor version number`: Double = js.native
}

object Allocationsrequiringfileextension {
  @scala.inline
  def apply(
    `allocations requiring file extension`: Double,
    `blocks allocated`: Double,
    `blocks freed`: Double,
    `checkpoint size`: Double,
    `file allocation unit size`: Double,
    `file bytes available for reuse`: Double,
    `file magic number`: Double,
    `file major version number`: Double,
    `file size in bytes`: Double,
    `minor version number`: Double
  ): Allocationsrequiringfileextension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allocations requiring file extension")((`allocations requiring file extension`).asInstanceOf[js.Any])
    __obj.updateDynamic("blocks allocated")((`blocks allocated`).asInstanceOf[js.Any])
    __obj.updateDynamic("blocks freed")((`blocks freed`).asInstanceOf[js.Any])
    __obj.updateDynamic("checkpoint size")((`checkpoint size`).asInstanceOf[js.Any])
    __obj.updateDynamic("file allocation unit size")((`file allocation unit size`).asInstanceOf[js.Any])
    __obj.updateDynamic("file bytes available for reuse")((`file bytes available for reuse`).asInstanceOf[js.Any])
    __obj.updateDynamic("file magic number")((`file magic number`).asInstanceOf[js.Any])
    __obj.updateDynamic("file major version number")((`file major version number`).asInstanceOf[js.Any])
    __obj.updateDynamic("file size in bytes")((`file size in bytes`).asInstanceOf[js.Any])
    __obj.updateDynamic("minor version number")((`minor version number`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Allocationsrequiringfileextension]
  }
  @scala.inline
  implicit class AllocationsrequiringfileextensionOps[Self <: Allocationsrequiringfileextension] (val x: Self) extends AnyVal {
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
    def `setAllocations requiring file extension`(value: Double): Self = this.set("allocations requiring file extension", value.asInstanceOf[js.Any])
    @scala.inline
    def `setBlocks allocated`(value: Double): Self = this.set("blocks allocated", value.asInstanceOf[js.Any])
    @scala.inline
    def `setBlocks freed`(value: Double): Self = this.set("blocks freed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setCheckpoint size`(value: Double): Self = this.set("checkpoint size", value.asInstanceOf[js.Any])
    @scala.inline
    def `setFile allocation unit size`(value: Double): Self = this.set("file allocation unit size", value.asInstanceOf[js.Any])
    @scala.inline
    def `setFile bytes available for reuse`(value: Double): Self = this.set("file bytes available for reuse", value.asInstanceOf[js.Any])
    @scala.inline
    def `setFile magic number`(value: Double): Self = this.set("file magic number", value.asInstanceOf[js.Any])
    @scala.inline
    def `setFile major version number`(value: Double): Self = this.set("file major version number", value.asInstanceOf[js.Any])
    @scala.inline
    def `setFile size in bytes`(value: Double): Self = this.set("file size in bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def `setMinor version number`(value: Double): Self = this.set("minor version number", value.asInstanceOf[js.Any])
  }
  
}

