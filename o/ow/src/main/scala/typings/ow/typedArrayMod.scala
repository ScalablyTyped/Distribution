package typings.ow

import typings.ow.predicateMod.Predicate
import typings.typeFest.basicMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ow/dist/source/predicates/typed-array", JSImport.Namespace)
@js.native
object typedArrayMod extends js.Object {
  
  @js.native
  class TypedArrayPredicate[T /* <: TypedArray */] () extends Predicate[T] {
    
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
