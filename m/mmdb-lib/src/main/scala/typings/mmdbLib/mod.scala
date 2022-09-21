package typings.mmdbLib

import typings.mmdbLib.metadataMod.Metadata
import typings.mmdbLib.responseMod.Response
import typings.mmdbLib.typesMod.ReaderOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mmdb-lib", "Reader")
  @js.native
  open class Reader[T /* <: Response */] protected () extends StObject {
    def this(db: Buffer) = this()
    def this(db: Buffer, opts: ReaderOptions) = this()
    
    /* private */ var db: Any = js.native
    
    /* private */ var decoder: Any = js.native
    
    /* private */ var findAddressInTree: Any = js.native
    
    def get(ipAddress: String): T | Null = js.native
    
    def getWithPrefixLength(ipAddress: String): js.Tuple2[T | Null, Double] = js.native
    
    /* private */ var ipv4Start: Any = js.native
    
    /* private */ var ipv4StartNodeNumber: Any = js.native
    
    def load(db: Buffer): Unit = js.native
    
    var metadata: Metadata = js.native
    
    /* private */ var opts: Any = js.native
    
    /* private */ var resolveDataPointer: Any = js.native
    
    /* private */ var walker: Any = js.native
  }
}
