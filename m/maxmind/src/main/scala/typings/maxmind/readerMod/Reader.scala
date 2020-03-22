package typings.maxmind.readerMod

import typings.maxmind.metadataMod.Metadata
import typings.maxmind.responseMod.Response
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reader[T /* <: Response */] extends js.Object {
  var db: js.Any
  var decoder: js.Any
  var findAddressInTree: js.Any
  var ipv4Start: js.Any
  var ipv4StartNodeNumber: js.Any
  var metadata: Metadata
  var resolveDataPointer: js.Any
  var walker: js.Any
  def get(ipAddress: String): T | Null
  def getWithPrefixLength(ipAddress: String): js.Tuple2[T | Null, Double]
  def load(db: Buffer, opts: js.Object): Unit
}

object Reader {
  @scala.inline
  def apply[T /* <: Response */](
    db: js.Any,
    decoder: js.Any,
    findAddressInTree: js.Any,
    get: String => T | Null,
    getWithPrefixLength: String => js.Tuple2[T | Null, Double],
    ipv4Start: js.Any,
    ipv4StartNodeNumber: js.Any,
    load: (Buffer, js.Object) => Unit,
    metadata: Metadata,
    resolveDataPointer: js.Any,
    walker: js.Any
  ): Reader[T] = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], decoder = decoder.asInstanceOf[js.Any], findAddressInTree = findAddressInTree.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getWithPrefixLength = js.Any.fromFunction1(getWithPrefixLength), ipv4Start = ipv4Start.asInstanceOf[js.Any], ipv4StartNodeNumber = ipv4StartNodeNumber.asInstanceOf[js.Any], load = js.Any.fromFunction2(load), metadata = metadata.asInstanceOf[js.Any], resolveDataPointer = resolveDataPointer.asInstanceOf[js.Any], walker = walker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Reader[T]]
  }
}

