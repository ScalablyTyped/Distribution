package typings.ow

import typings.ow.predicateMod.Predicate
import typings.ow.predicateMod.PredicateOptions
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("ow/dist/source/predicates/map", "MapPredicate")
  @js.native
  /**
    @hidden
    */
  class MapPredicate[T1, T2] () extends Predicate[Map[T1, T2]] {
    def this(options: PredicateOptions) = this()
    
    /**
      Test a Map to be deeply equal to the provided Map.
      @param expected - Expected Map to match.
      */
    def deepEqual(expected: Map[T1, T2]): this.type = js.native
    
    /**
      Test a Map to be empty.
      */
    def empty: this.type = js.native
    
    /**
      Test a Map to include any of the provided keys. The keys are tested by identity, not structure.
      @param keys - The keys that could be a key in the Map.
      */
    def hasAnyKeys(keys: T1*): this.type = js.native
    
    /**
      Test a Map to include any of the provided values. The values are tested by identity, not structure.
      @param values - The values that could be a value in the Map.
      */
    def hasAnyValues(values: T2*): this.type = js.native
    
    /**
      Test a Map to include all the provided keys. The keys are tested by identity, not structure.
      @param keys - The keys that should be a key in the Map.
      */
    def hasKeys(keys: T1*): this.type = js.native
    
    /**
      Test a Map to include all the provided values. The values are tested by identity, not structure.
      @param values - The values that should be a value in the Map.
      */
    def hasValues(values: T2*): this.type = js.native
    
    /**
      Test all the keys in the Map to match the provided predicate.
      @param predicate - The predicate that should be applied against every key in the Map.
      */
    def keysOfType(predicate: Predicate[T1]): this.type = js.native
    
    /**
      Test an Map to have a maximum size.
      @param size - The maximum size of the Map.
      */
    def maxSize(size: Double): this.type = js.native
    
    /**
      Test an Map to have a minimum size.
      @param size - The minimum size of the Map.
      */
    def minSize(size: Double): this.type = js.native
    
    /**
      Test a Map to be not empty.
      */
    def nonEmpty: this.type = js.native
    
    /**
      Test a Map to have a specific size.
      @param size - The size of the Map.
      */
    def size(size: Double): this.type = js.native
    
    /**
      Test all the values in the Map to match the provided predicate.
      @param predicate - The predicate that should be applied against every value in the Map.
      */
    def valuesOfType(predicate: Predicate[T2]): this.type = js.native
  }
}
