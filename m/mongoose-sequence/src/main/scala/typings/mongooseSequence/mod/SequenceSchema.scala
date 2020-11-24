package typings.mongooseSequence.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema * / any */ @js.native
trait SequenceSchema extends js.Object {
  
  // overload for the default mongoose plugin function
  def plugin(
    plugin: js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ /* schema */ js.Any, 
      /* options */ js.UndefOr[js.Object], 
      Unit
    ]
  ): this.type = js.native
  def plugin(
    plugin: js.Function2[/* schema */ this.type, /* options */ SequenceOptions, Unit],
    options: SequenceOptions
  ): this.type = js.native
  def plugin(
    plugin: js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ /* schema */ js.Any, 
      /* options */ js.UndefOr[js.Object], 
      Unit
    ],
    opts: js.Object
  ): this.type = js.native
}
