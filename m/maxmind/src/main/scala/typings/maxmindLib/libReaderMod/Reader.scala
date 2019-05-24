package typings
package maxmindLib.libReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reader[T /* <: maxmindLib.libReaderResponseMod.Response */] extends js.Object {
  var db: js.Any
  var decoder: js.Any
  var metadata: maxmindLib.libMetadataMod.Metadata
  var walker: js.Any
  def findAddressInTree(ipAddress: java.lang.String): scala.Double | scala.Null
  def get(ipAddress: java.lang.String): T | scala.Null
  def load(db: nodeLib.Buffer, opts: js.Object): scala.Unit
  def resolveDataPointer(pointer: scala.Double): js.Any
}

object Reader {
  @scala.inline
  def apply[T /* <: maxmindLib.libReaderResponseMod.Response */](
    db: js.Any,
    decoder: js.Any,
    findAddressInTree: java.lang.String => scala.Double | scala.Null,
    get: java.lang.String => T | scala.Null,
    load: (nodeLib.Buffer, js.Object) => scala.Unit,
    metadata: maxmindLib.libMetadataMod.Metadata,
    resolveDataPointer: scala.Double => js.Any,
    walker: js.Any
  ): Reader[T] = {
    val __obj = js.Dynamic.literal(db = db, decoder = decoder, findAddressInTree = js.Any.fromFunction1(findAddressInTree), get = js.Any.fromFunction1(get), load = js.Any.fromFunction2(load), metadata = metadata, resolveDataPointer = js.Any.fromFunction1(resolveDataPointer), walker = walker)
  
    __obj.asInstanceOf[Reader[T]]
  }
}

