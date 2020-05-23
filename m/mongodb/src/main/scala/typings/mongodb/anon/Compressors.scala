package typings.mongodb.anon

import typings.mongodb.mongodbStrings.snappy
import typings.mongodb.mongodbStrings.zlib
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compressors extends js.Object {
  /** The selected compressors in preference order */
  var compressors: js.UndefOr[js.Array[snappy | zlib]] = js.undefined
}

object Compressors {
  @scala.inline
  def apply(compressors: js.Array[snappy | zlib] = null): Compressors = {
    val __obj = js.Dynamic.literal()
    if (compressors != null) __obj.updateDynamic("compressors")(compressors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compressors]
  }
}

