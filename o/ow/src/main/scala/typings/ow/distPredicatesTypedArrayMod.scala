package typings.ow

import typings.ow.distPredicatesPredicateMod.Predicate
import typings.ow.distPredicatesPredicateMod.PredicateOptions
import typings.typeFest.sourceTypedArrayMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPredicatesTypedArrayMod {
  
  @JSImport("ow/dist/predicates/typed-array", "TypedArrayPredicate")
  @js.native
  open class TypedArrayPredicate[T /* <: TypedArray */] protected () extends Predicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
    
    /**
      Test a typed array to have a specific byte length.
      @param byteLength - The byte length of the typed array.
      */
    def byteLength(byteLength: Double): this.type = js.native
    
    /**
      Test a typed array to have a specific length.
      @param length - The length of the typed array.
      */
    def length(length: Double): this.type = js.native
    
    /**
      Test a typed array to have a minimum byte length.
      @param length - The minimum byte length of the typed array.
      */
    def maxByteLength(byteLength: Double): this.type = js.native
    
    /**
      Test a typed array to have a maximum length.
      @param length - The maximum length of the typed array.
      */
    def maxLength(length: Double): this.type = js.native
    
    /**
      Test a typed array to have a minimum byte length.
      @param byteLength - The minimum byte length of the typed array.
      */
    def minByteLength(byteLength: Double): this.type = js.native
    
    /**
      Test a typed array to have a minimum length.
      @param length - The minimum length of the typed array.
      */
    def minLength(length: Double): this.type = js.native
  }
}
