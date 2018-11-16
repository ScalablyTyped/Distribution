package typings
package multipartyLib.multipartyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Part
  extends nodeLib.streamMod.Readable {
  /**
       * assuming that this is the last part in the request, this is the size of this part in bytes.
       * You could use this, for example, to set the Content-Length header if uploading to S3.
       * If the part had a Content-Length header then that value is used here instead.
       */
  var byteCount: scala.Double = js.native
  /**
       * the byte offset of this part in the request body
       */
  var byteOffset: scala.Double = js.native
  /**
       * only if the part is an incoming file
       */
  var filename: java.lang.String = js.native
  /**
       * the headers for this part. For example, you may be interested in content-type
       */
  var headers: js.Any = js.native
  /**
       * the field name for this part
       */
  var name: java.lang.String = js.native
}

