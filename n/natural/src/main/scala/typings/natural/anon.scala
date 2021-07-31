package typings.natural

import typings.natural.naturalBooleans.`false`
import typings.natural.naturalBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined natural.natural.DamerauLevenshteinDistanceOptions & {  search :true} */
  trait DamerauLevenshteinDistanc extends StObject {
    
    /** @default 1 */
    var deletion_cost: js.UndefOr[Double] = js.undefined
    
    /** @default 1 */
    var insertion_cost: js.UndefOr[Double] = js.undefined
    
    /** @default false */
    var restricted: js.UndefOr[Boolean] = js.undefined
    
    /** @default false */
    var search: js.UndefOr[Boolean] & `true`
    
    /** @default 1 */
    var substitution_cost: js.UndefOr[Double] = js.undefined
    
    /** @default 1 */
    var transposition_cost: js.UndefOr[Double] = js.undefined
  }
  object DamerauLevenshteinDistanc {
    
    @scala.inline
    def apply(search: js.UndefOr[Boolean] & `true`): DamerauLevenshteinDistanc = {
      val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[DamerauLevenshteinDistanc]
    }
    
    @scala.inline
    implicit class DamerauLevenshteinDistancMutableBuilder[Self <: DamerauLevenshteinDistanc] (val x: Self) extends AnyVal {
      
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
      def setSearch(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined natural.natural.DamerauLevenshteinDistanceOptions & {  search :false | undefined} */
  trait DamerauLevenshteinDistancDeletioncost extends StObject {
    
    /** @default 1 */
    var deletion_cost: js.UndefOr[Double] = js.undefined
    
    /** @default 1 */
    var insertion_cost: js.UndefOr[Double] = js.undefined
    
    /** @default false */
    var restricted: js.UndefOr[Boolean] = js.undefined
    
    /** @default false */
    var search: js.UndefOr[Boolean] & js.UndefOr[`false`]
    
    /** @default 1 */
    var substitution_cost: js.UndefOr[Double] = js.undefined
    
    /** @default 1 */
    var transposition_cost: js.UndefOr[Double] = js.undefined
  }
  object DamerauLevenshteinDistancDeletioncost {
    
    @scala.inline
    def apply(search: js.UndefOr[Boolean] & js.UndefOr[`false`]): DamerauLevenshteinDistancDeletioncost = {
      val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[DamerauLevenshteinDistancDeletioncost]
    }
    
    @scala.inline
    implicit class DamerauLevenshteinDistancDeletioncostMutableBuilder[Self <: DamerauLevenshteinDistancDeletioncost] (val x: Self) extends AnyVal {
      
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
      def setSearch(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined natural.natural.DamerauLevenshteinDistanceOptions & {  search :boolean} */
  trait DamerauLevenshteinDistancInsertioncost extends StObject {
    
    /** @default 1 */
    var deletion_cost: js.UndefOr[Double] = js.undefined
    
    /** @default 1 */
    var insertion_cost: js.UndefOr[Double] = js.undefined
    
    /** @default false */
    var restricted: js.UndefOr[Boolean] = js.undefined
    
    /** @default false */
    var search: js.UndefOr[Boolean] & Boolean
    
    /** @default 1 */
    var substitution_cost: js.UndefOr[Double] = js.undefined
    
    /** @default 1 */
    var transposition_cost: js.UndefOr[Double] = js.undefined
  }
  object DamerauLevenshteinDistancInsertioncost {
    
    @scala.inline
    def apply(search: js.UndefOr[Boolean] & Boolean): DamerauLevenshteinDistancInsertioncost = {
      val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[DamerauLevenshteinDistancInsertioncost]
    }
    
    @scala.inline
    implicit class DamerauLevenshteinDistancInsertioncostMutableBuilder[Self <: DamerauLevenshteinDistancInsertioncost] (val x: Self) extends AnyVal {
      
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
      def setSearch(value: js.UndefOr[Boolean] & Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
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
}
