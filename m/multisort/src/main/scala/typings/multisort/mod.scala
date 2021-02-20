package typings.multisort

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multisort", JSImport.Namespace)
  @js.native
  def apply[T](criterions: js.Array[Criterion[T]]): SortFunction[T] = js.native
  @JSImport("multisort", JSImport.Namespace)
  @js.native
  def apply[T](criterions: Criterion[T]): SortFunction[T] = js.native
  @JSImport("multisort", JSImport.Namespace)
  @js.native
  def apply[T](toSort: js.Array[T], criterions: js.Array[Criterion[T]]): js.Array[T] = js.native
  /**
    * Sorts given array by given criterions.
    * @param toSort Array to sort.
    * @param sortings Sort criterions.
    */
  @JSImport("multisort", JSImport.Namespace)
  @js.native
  def apply[T](toSort: js.Array[T], criterions: Criterion[T]): js.Array[T] = js.native
  
  /**
    * Functional evaluators don't need any transformation, and can't
    *   have inverted order.
    *
    * Numerical evaluators sort the input directly if the criterion is
    *   non-negative, and in inverted order if the criterion is negative.
    *
    * String evaluators sort the input based on objects properties.
    * - Invert the sort if initial character is ! or ~.
    * - Allow an initial dot: ".prop.subprop" as well as "prop.subprop".
    * - Allow existential criterion by tailing question mark: "prop.subprop?".
    */
  type Criterion[T] = (js.Function1[/* item */ T, js.Any]) | Double | String
  
  /**
    * Sorting function.
    */
  @js.native
  trait SortFunction[T] extends StObject {
    
    def apply(toSort: js.Array[T]): Unit = js.native
    
    /**
      * To allow this to plug in to other sorting mechanisms.
      */
    def comparator(a: T, b: T): Double = js.native
  }
}
