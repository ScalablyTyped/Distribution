package typings.multer

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<multer.multer._Global_.Express.Multer.File> */
trait PartialFile extends js.Object {
  var buffer: js.UndefOr[Buffer] = js.undefined
  var destination: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var fieldname: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var mimetype: js.UndefOr[String] = js.undefined
  var originalname: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var stream: js.UndefOr[Readable] = js.undefined
}

object PartialFile {
  @scala.inline
  def apply(
    buffer: Buffer = null,
    destination: String = null,
    encoding: String = null,
    fieldname: String = null,
    filename: String = null,
    mimetype: String = null,
    originalname: String = null,
    path: String = null,
    size: Int | Double = null,
    stream: Readable = null
  ): PartialFile = {
    val __obj = js.Dynamic.literal()
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fieldname != null) __obj.updateDynamic("fieldname")(fieldname.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (mimetype != null) __obj.updateDynamic("mimetype")(mimetype.asInstanceOf[js.Any])
    if (originalname != null) __obj.updateDynamic("originalname")(originalname.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFile]
  }
}

