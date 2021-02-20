package typings.memfs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("memfs/lib/internal/errors", "AssertionError")
  @js.native
  class AssertionError protected () extends StObject {
    def this(options: js.Any) = this()
    
    var actual: js.Any = js.native
    
    var code: js.Any = js.native
    
    var expected: js.Any = js.native
    
    var generatedMessage: js.Any = js.native
    
    var name: js.Any = js.native
    
    var operator: js.Any = js.native
  }
  
  @JSImport("memfs/lib/internal/errors", "E")
  @js.native
  def E(sym: js.Any, `val`: js.Any): Unit = js.native
  
  @JSImport("memfs/lib/internal/errors", "message")
  @js.native
  def message(key: js.Any, args: js.Any): js.Any = js.native
}
