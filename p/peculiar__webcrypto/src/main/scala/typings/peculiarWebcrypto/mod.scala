package typings.peculiarWebcrypto

import typings.std.KeyAlgorithm
import typings.std.KeyType
import typings.std.KeyUsage
import typings.std.SubtleCrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Crypto * / any */ @JSImport("@peculiar/webcrypto", "Crypto")
  @js.native
  open class Crypto () extends StObject {
    
    def getRandomValues[T /* <: js.typedarray.ArrayBufferView | Null */](array: T): T = js.native
    
    def randomUUID(): String = js.native
    
    var subtle: SubtleCrypto = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey * / any */ @JSImport("@peculiar/webcrypto", "CryptoKey")
  @js.native
  open class CryptoKey () extends StObject {
    
    var algorithm: KeyAlgorithm = js.native
    
    var extractable: Boolean = js.native
    
    var `type`: KeyType = js.native
    
    var usages: js.Array[KeyUsage] = js.native
  }
}
