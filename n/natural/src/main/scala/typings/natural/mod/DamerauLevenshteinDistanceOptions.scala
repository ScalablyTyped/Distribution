package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DamerauLevenshteinDistanceOptions extends StObject {
  
  /** @default 1 */
  var deletion_cost: js.UndefOr[Double] = js.undefined
  
  /** @default 1 */
  var insertion_cost: js.UndefOr[Double] = js.undefined
  
  /** @default false */
  var restricted: js.UndefOr[Boolean] = js.undefined
  
  /** @default false */
  var search: js.UndefOr[Boolean] = js.undefined
  
  /** @default 1 */
  var substitution_cost: js.UndefOr[Double] = js.undefined
  
  /** @default 1 */
  var transposition_cost: js.UndefOr[Double] = js.undefined
}
object DamerauLevenshteinDistanceOptions {
  
  @scala.inline
  def apply(): DamerauLevenshteinDistanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DamerauLevenshteinDistanceOptions]
  }
  
  @scala.inline
  implicit class DamerauLevenshteinDistanceOptionsMutableBuilder[Self <: DamerauLevenshteinDistanceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletion_cost(value: Double): Self = StObject.set(x, "deletion_cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletion_costUndefined: Self = StObject.set(x, "deletion_cost", js.undefined)
    
    @scala.inline
    def setInsertion_cost(value: Double): Self = StObject.set(x, "insertion_cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertion_costUndefined: Self = StObject.set(x, "insertion_cost", js.undefined)
    
    @scala.inline
    def setRestricted(value: Boolean): Self = StObject.set(x, "restricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictedUndefined: Self = StObject.set(x, "restricted", js.undefined)
    
    @scala.inline
    def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setSubstitution_cost(value: Double): Self = StObject.set(x, "substitution_cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstitution_costUndefined: Self = StObject.set(x, "substitution_cost", js.undefined)
    
    @scala.inline
    def setTransposition_cost(value: Double): Self = StObject.set(x, "transposition_cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposition_costUndefined: Self = StObject.set(x, "transposition_cost", js.undefined)
  }
}
