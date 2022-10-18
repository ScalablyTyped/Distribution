package typings.ow

import typings.ow.distPredicatesPredicateMod.Predicate
import typings.ow.distPredicatesPredicateMod.PredicateOptions
import typings.std.WeakSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPredicatesWeakSetMod {
  
  @JSImport("ow/dist/predicates/weak-set", "WeakSetPredicate")
  @js.native
  /**
    @hidden
    */
  open class WeakSetPredicate[T /* <: js.Object */] () extends Predicate[WeakSet[T]] {
    def this(options: PredicateOptions) = this()
    
    /**
      Test a WeakSet to include all the provided items. The items are tested by identity, not structure.
      @param items - The items that should be a item in the WeakSet.
      */
    def has(items: T*): this.type = js.native
    
    /**
      Test a WeakSet to include any of the provided items. The items are tested by identity, not structure.
      @param items - The items that could be a item in the WeakSet.
      */
    def hasAny(items: T*): this.type = js.native
  }
}
