package typings.mmdbLib.mod

import typings.mmdbLib.metadataMod.Metadata
import typings.mmdbLib.responseMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reader[T /* <: Response */] extends js.Object {
  
  var db: js.Any = js.native
  
  var decoder: js.Any = js.native
  
  var findAddressInTree: js.Any = js.native
  
  def get(ipAddress: String): T | Null = js.native
  
  def getWithPrefixLength(ipAddress: String): js.Tuple2[T | Null, Double] = js.native
  
  var ipv4Start: js.Any = js.native
  
  var ipv4StartNodeNumber: js.Any = js.native
  
  var metadata: Metadata = js.native
  
  var resolveDataPointer: js.Any = js.native
  
  var walker: js.Any = js.native
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
    metadata: Metadata,
    resolveDataPointer: js.Any,
    walker: js.Any
  ): Reader[T] = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], decoder = decoder.asInstanceOf[js.Any], findAddressInTree = findAddressInTree.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getWithPrefixLength = js.Any.fromFunction1(getWithPrefixLength), ipv4Start = ipv4Start.asInstanceOf[js.Any], ipv4StartNodeNumber = ipv4StartNodeNumber.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], resolveDataPointer = resolveDataPointer.asInstanceOf[js.Any], walker = walker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reader[T]]
  }
  
  @scala.inline
  implicit class ReaderOps[Self <: Reader[_], T /* <: Response */] (val x: Self with Reader[T]) extends AnyVal {
    
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
    def setDb(value: js.Any): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoder(value: js.Any): Self = this.set("decoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindAddressInTree(value: js.Any): Self = this.set("findAddressInTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: String => T | Null): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWithPrefixLength(value: String => js.Tuple2[T | Null, Double]): Self = this.set("getWithPrefixLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIpv4Start(value: js.Any): Self = this.set("ipv4Start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4StartNodeNumber(value: js.Any): Self = this.set("ipv4StartNodeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveDataPointer(value: js.Any): Self = this.set("resolveDataPointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWalker(value: js.Any): Self = this.set("walker", value.asInstanceOf[js.Any])
  }
}
