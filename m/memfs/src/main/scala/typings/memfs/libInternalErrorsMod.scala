package typings.memfs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInternalErrorsMod {
  
  @JSImport("memfs/lib/internal/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify g.Error * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify g.Error * / any */ @JSImport("memfs/lib/internal/errors", "AssertionError")
  @js.native
  open class AssertionError protected () extends StObject {
    def this(options: Any) = this()
    
    var actual: Any = js.native
    
    var code: Any = js.native
    
    var expected: Any = js.native
    
    var generatedMessage: Any = js.native
    
    var name: Any = js.native
    
    var operator: Any = js.native
  }
  
  inline def E(sym: Any, `val`: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("E")(sym.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def message(key: Any, args: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(key.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
}
