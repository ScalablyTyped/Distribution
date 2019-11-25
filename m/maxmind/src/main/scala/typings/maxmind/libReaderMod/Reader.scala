package typings.maxmind.libReaderMod

import typings.maxmind.libMetadataMod.Metadata
import typings.maxmind.libReaderResponseMod.Response
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reader[T /* <: Response */] extends js.Object {
  var db: js.Any
  var decoder: js.Any
  var metadata: Metadata
  var walker: js.Any
  def findAddressInTree(ipAddress: String): Double | Null
  def get(ipAddress: String): T | Null
  def load(db: Buffer, opts: js.Object): Unit
  def resolveDataPointer(pointer: Double): js.Any
}

object Reader {
  @scala.inline
  def apply[T /* <: Response */](
    db: js.Any,
    decoder: js.Any,
    findAddressInTree: String => Double | Null,
    get: String => T | Null,
    load: (Buffer, js.Object) => Unit,
    metadata: Metadata,
    resolveDataPointer: Double => js.Any,
    walker: js.Any
  ): Reader[T] = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], decoder = decoder.asInstanceOf[js.Any], findAddressInTree = js.Any.fromFunction1(findAddressInTree), get = js.Any.fromFunction1(get), load = js.Any.fromFunction2(load), metadata = metadata.asInstanceOf[js.Any], resolveDataPointer = js.Any.fromFunction1(resolveDataPointer), walker = walker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Reader[T]]
  }
}

