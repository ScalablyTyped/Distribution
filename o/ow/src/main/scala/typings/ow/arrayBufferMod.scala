package typings.ow

import typings.ow.predicateMod.Predicate
import typings.std.ArrayBufferLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ow/dist/source/predicates/array-buffer", JSImport.Namespace)
@js.native
object arrayBufferMod extends js.Object {
  
  @js.native
  class ArrayBufferPredicate[T /* <: ArrayBufferLike */] () extends Predicate[T] {
    
    /**
      Test an array buffer to have a specific byte length.
      @param byteLength - The byte length of the array buffer.
      */
    def byteLength(byteLength: Double): this.type = js.native
    
    /**
      Test an array buffer to have a minimum byte length.
      @param length - The minimum byte length of the array buffer.
      */
    def maxByteLength(byteLength: Double): this.type = js.native
    
    /**
      Test an array buffer to have a minimum byte length.
      @param byteLength - The minimum byte length of the array buffer.
      */
    def minByteLength(byteLength: Double): this.type = js.native
  }
}
