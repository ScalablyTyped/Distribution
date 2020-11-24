package typings.ow

import typings.ow.predicateMod.Predicate
import typings.ow.predicateMod.PredicateOptions
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ow/dist/source/predicates/weak-map", JSImport.Namespace)
@js.native
object weakMapMod extends js.Object {
  
  @js.native
  /**
    @hidden
    */
  class WeakMapPredicate[KeyType /* <: js.Object */] ()
    extends Predicate[WeakMap[KeyType, js.Any]] {
    def this(options: PredicateOptions) = this()
    
    /**
      Test a WeakMap to include any of the provided keys. The keys are tested by identity, not structure.
      @param keys - The keys that could be a key in the WeakMap.
      */
    def hasAnyKeys(keys: KeyType*): this.type = js.native
    
    /**
      Test a WeakMap to include all the provided keys. The keys are tested by identity, not structure.
      @param keys - The keys that should be a key in the WeakMap.
      */
    def hasKeys(keys: KeyType*): this.type = js.native
  }
}
