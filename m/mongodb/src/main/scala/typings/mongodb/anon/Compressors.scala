package typings.mongodb.anon

import typings.mongodb.mongodbStrings.snappy
import typings.mongodb.mongodbStrings.zlib
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compressors extends js.Object {
  /** The selected compressors in preference order */
  var compressors: js.UndefOr[js.Array[snappy | zlib]] = js.native
}

object Compressors {
  @scala.inline
  def apply(): Compressors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compressors]
  }
  @scala.inline
  implicit class CompressorsOps[Self <: Compressors] (val x: Self) extends AnyVal {
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
    def setCompressorsVarargs(value: (snappy | zlib)*): Self = this.set("compressors", js.Array(value :_*))
    @scala.inline
    def setCompressors(value: js.Array[snappy | zlib]): Self = this.set("compressors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressors: Self = this.set("compressors", js.undefined)
  }
  
}

