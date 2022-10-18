package typings.ow

import typings.ow.distPredicatesPredicateMod.Predicate
import typings.ow.distPredicatesPredicateMod.PredicateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPredicatesDataViewMod {
  
  @JSImport("ow/dist/predicates/data-view", "DataViewPredicate")
  @js.native
  /**
    @hidden
    */
  open class DataViewPredicate ()
    extends Predicate[js.typedarray.DataView] {
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
