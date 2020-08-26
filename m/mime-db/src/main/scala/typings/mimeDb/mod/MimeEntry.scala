package typings.mimeDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://github.com/jshttp/mime-db#data-structure}
  */
@js.native
trait MimeEntry extends js.Object {
  /** The default charset associated with this type, if any. */
  val charset: js.UndefOr[String] = js.native
  /** Whether a file of this type can be gzipped. */
  val compressible: js.UndefOr[Boolean] = js.native
  /** Known extensions associated with this mime type. */
  val extensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Where the mime type is defined.
    * If not set, it's probably a custom media type.
    */
  val source: js.UndefOr[MimeSource] = js.native
}

object MimeEntry {
  @scala.inline
  def apply(): MimeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MimeEntry]
  }
  @scala.inline
  implicit class MimeEntryOps[Self <: MimeEntry] (val x: Self) extends AnyVal {
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
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    @scala.inline
    def setCompressible(value: Boolean): Self = this.set("compressible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressible: Self = this.set("compressible", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setSource(value: MimeSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

