package typings.mmdbLib

import typings.mmdbLib.metadataMod.Metadata
import typings.mmdbLib.responseMod.Response
import typings.mmdbLib.typesMod.ReaderOptions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mmdb-lib", JSImport.Default)
  @js.native
  class default[T /* <: Response */] protected ()
    extends StObject
       with Reader[T] {
    def this(db: Buffer) = this()
    def this(db: Buffer, opts: ReaderOptions) = this()
    
    /* private */ /* CompleteClass */
    var db: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var decoder: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var findAddressInTree: js.Any = js.native
    
    /* CompleteClass */
    override def get(ipAddress: String): T | Null = js.native
    
    /* CompleteClass */
    override def getWithPrefixLength(ipAddress: String): js.Tuple2[T | Null, Double] = js.native
    
    /* private */ /* CompleteClass */
    var ipv4Start: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var ipv4StartNodeNumber: js.Any = js.native
    
    /* CompleteClass */
    var metadata: Metadata = js.native
    
    /* private */ /* CompleteClass */
    var resolveDataPointer: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var walker: js.Any = js.native
  }
  
  trait Reader[T /* <: Response */] extends StObject {
    
    /* private */ var db: js.Any
    
    /* private */ var decoder: js.Any
    
    /* private */ var findAddressInTree: js.Any
    
    def get(ipAddress: String): T | Null
    
    def getWithPrefixLength(ipAddress: String): js.Tuple2[T | Null, Double]
    
    /* private */ var ipv4Start: js.Any
    
    /* private */ var ipv4StartNodeNumber: js.Any
    
    var metadata: Metadata
    
    /* private */ var resolveDataPointer: js.Any
    
    /* private */ var walker: js.Any
  }
  object Reader {
    
    inline def apply[T /* <: Response */](
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
    
    extension [Self <: Reader[?], T /* <: Response */](x: Self & Reader[T]) {
      
      inline def setDb(value: js.Any): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setDecoder(value: js.Any): Self = StObject.set(x, "decoder", value.asInstanceOf[js.Any])
      
      inline def setFindAddressInTree(value: js.Any): Self = StObject.set(x, "findAddressInTree", value.asInstanceOf[js.Any])
      
      inline def setGet(value: String => T | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetWithPrefixLength(value: String => js.Tuple2[T | Null, Double]): Self = StObject.set(x, "getWithPrefixLength", js.Any.fromFunction1(value))
      
      inline def setIpv4Start(value: js.Any): Self = StObject.set(x, "ipv4Start", value.asInstanceOf[js.Any])
      
      inline def setIpv4StartNodeNumber(value: js.Any): Self = StObject.set(x, "ipv4StartNodeNumber", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setResolveDataPointer(value: js.Any): Self = StObject.set(x, "resolveDataPointer", value.asInstanceOf[js.Any])
      
      inline def setWalker(value: js.Any): Self = StObject.set(x, "walker", value.asInstanceOf[js.Any])
    }
  }
}
