package typings.memfs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memfs/lib/internal/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @js.native
  class AssertionError protected () extends js.Object {
    def this(options: js.Any) = this()
    var actual: js.Any = js.native
    var code: js.Any = js.native
    var expected: js.Any = js.native
    var generatedMessage: js.Any = js.native
    var name: js.Any = js.native
    var operator: js.Any = js.native
  }
  
  def E(sym: js.Any, `val`: js.Any): Unit = js.native
  def message(key: js.Any, args: js.Any): js.Any = js.native
  @js.native
  object Error
    extends /* x */ StringDictionary[js.Any]
       with Instantiable2[/* key */ js.Any, /* args (repeated) */ js.Any, StringDictionary[js.Any]]
  
  @js.native
  object RangeError
    extends /* x */ StringDictionary[js.Any]
       with Instantiable2[/* key */ js.Any, /* args (repeated) */ js.Any, StringDictionary[js.Any]]
  
  @js.native
  object TypeError
    extends /* x */ StringDictionary[js.Any]
       with Instantiable2[/* key */ js.Any, /* args (repeated) */ js.Any, StringDictionary[js.Any]]
  
}

