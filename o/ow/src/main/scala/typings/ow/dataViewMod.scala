package typings.ow

import typings.ow.predicateMod.Predicate
import typings.ow.predicateMod.PredicateOptions
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ow/dist/source/predicates/data-view", JSImport.Namespace)
@js.native
object dataViewMod extends js.Object {
  
  @js.native
  /**
    @hidden
    */
  class DataViewPredicate () extends Predicate[DataView] {
    def this(options: PredicateOptions) = this()
    
    /**
      Test a DataView to have a specific byte length.
      @param byteLength - The byte length of the DataView.
      */
    def byteLength(byteLength: Double): this.type = js.native
    
    /**
      Test a DataView to have a minimum byte length.
      @param length - The minimum byte length of the DataView.
      */
    def maxByteLength(byteLength: Double): this.type = js.native
    
    /**
      Test a DataView to have a minimum byte length.
      @param byteLength - The minimum byte length of the DataView.
      */
    def minByteLength(byteLength: Double): this.type = js.native
  }
}
