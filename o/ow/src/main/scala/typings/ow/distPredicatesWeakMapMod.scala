package typings.ow

import typings.ow.distPredicatesPredicateMod.Predicate
import typings.ow.distPredicatesPredicateMod.PredicateOptions
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPredicatesWeakMapMod {
  
  @JSImport("ow/dist/predicates/weak-map", "WeakMapPredicate")
  @js.native
  /**
    @hidden
    */
  open class WeakMapPredicate[KeyType /* <: js.Object */] () extends Predicate[WeakMap[KeyType, Any]] {
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
