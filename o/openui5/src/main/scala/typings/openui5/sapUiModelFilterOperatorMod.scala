package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelFilterOperatorMod {
  
  /**
    * Operators for the Filter.
    */
  @JSImport("sap/ui/model/FilterOperator", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FilterOperator & String] = js.native
    
    /* "All" */ val All: typings.openui5.sapUiModelFilterOperatorMod.FilterOperator.All & String = js.native
    
    /* "Any" */ val Any: typings.openui5.sapUiModelFilterOperatorMod.FilterOperator.Any & String = js.native
    
    /* "BT" */ val BT: typings.openui5.sapUiModelFilterOperatorMod.FilterOperator.BT & String = js.native
    
    /* "Contains" */ val Contains: typings.openui5.sapUiModelFilterOperatorMod.FilterOperator.Contains & String = js.native
    
    /* "EQ" */ val EQ: typings.openui5.sapUiModelFilterOperatorMod.FilterOperator.EQ & String = js.native
    
    /* "EndsWith" */ val EndsWith: typings.openui5.sapUiModelFilterOperatorMod.FilterOperator.EndsWith & String = js.native
    
    /* "GE" */ val GE: typings.openui5.sapUiModelFilterOperatorMod.FilterOperator.GE & String = js.native
    
    /* "GT" */ val GT: typings.openui5.sapUiModelFilterOperatorMod.FilterOperator.GT & String = js.native
    
    /* "LE" */ val LE: typings.openui5.sapUiModelFilterOperatorMod.FilterOperator.LE & String = js.native
    
    /* "LT" */ val LT: typings.openui5.sapUiModelFilterOperatorMod.FilterOperator.LT & String = js.native
    
    /* "NB" */ val NB: typings.openui5.sapUiModelFilterOperatorMod.FilterOperator.NB & String = js.native
    
    /* "NE" */ val NE: typings.openui5.sapUiModelFilterOperatorMod.FilterOperator.NE & String = js.native
    
    /* "NotContains" */ val NotContains: typings.openui5.sapUiModelFilterOperatorMod.FilterOperator.NotContains & String = js.native
    
    /* "NotEndsWith" */ val NotEndsWith: typings.openui5.sapUiModelFilterOperatorMod.FilterOperator.NotEndsWith & String = js.native
    
    /* "NotStartsWith" */ val NotStartsWith: typings.openui5.sapUiModelFilterOperatorMod.FilterOperator.NotStartsWith & String = js.native
    
    /* "StartsWith" */ val StartsWith: typings.openui5.sapUiModelFilterOperatorMod.FilterOperator.StartsWith & String = js.native
  }
  
  @js.native
  sealed trait FilterOperator extends StObject
  /**
    * Operators for the Filter.
    */
  @JSImport("sap/ui/model/FilterOperator", "FilterOperator")
  @js.native
  object FilterOperator extends StObject {
    
    /**
      * @SINCE 1.48.0
      *
      * Used to filter a list based on filter criteria that are defined in a nested filter for dependent subitems.
      * `All` returns a list of those items for which **all** dependent subitems match the filter criteria of
      * the nested filter. For example, a list of customers can be filtered by filter criteria that are applied
      * to the list of orders the customer placed in the past. The filter returns a list of those customers that
      * **always** ordered a specific product.
      *
      * This filter operator is only supported in OData V4 models.
      */
    @js.native
    sealed trait All
      extends StObject
         with FilterOperator
    
    /**
      * @SINCE 1.48.0
      *
      * Used to filter a list based on filter criteria that are defined in a nested filter for dependent subitems.
      * `Any` returns a list of those items for which **at least one** dependent subitem matches the filter criteria
      * of the nested filter. For example, a list of customers can be filtered by filter criteria that are applied
      * to the list of orders the customer placed in the past. The filter returns a list of those customers that
      * **at least once** ordered a specific product.
      *
      * This filter operator is only supported in OData V4 models.
      */
    @js.native
    sealed trait Any
      extends StObject
         with FilterOperator
    
    /**
      * FilterOperator between
      *
      * Used to filter all entries between the given boundaries. The filter result contains the boundaries, but
      * no entries before or further. The order of the entries in the filter results is based on their occurrence
      * in the input list.
      *
      * **Note, when used on strings:** The String comparison is based on lexicographical ordering. Characters
      * are ranked in their alphabetical order. Words with the same preceding substring are ordered based on
      * their length e.g. "Chris" comes before "Christian".
      *
      * The filtering includes the right boundary, but no strings further in the lexicographical ordering. e.g.
      * between "A" and "C" includes the string "C", but not "Chris".
      */
    @js.native
    sealed trait BT
      extends StObject
         with FilterOperator
    
    /**
      * FilterOperator contains
      */
    @js.native
    sealed trait Contains
      extends StObject
         with FilterOperator
    
    /**
      * FilterOperator equals
      */
    @js.native
    sealed trait EQ
      extends StObject
         with FilterOperator
    
    /**
      * FilterOperator ends with
      */
    @js.native
    sealed trait EndsWith
      extends StObject
         with FilterOperator
    
    /**
      * FilterOperator greater or equals
      */
    @js.native
    sealed trait GE
      extends StObject
         with FilterOperator
    
    /**
      * FilterOperator greater than
      */
    @js.native
    sealed trait GT
      extends StObject
         with FilterOperator
    
    /**
      * FilterOperator less or equals
      */
    @js.native
    sealed trait LE
      extends StObject
         with FilterOperator
    
    /**
      * FilterOperator less than
      */
    @js.native
    sealed trait LT
      extends StObject
         with FilterOperator
    
    /**
      * @SINCE 1.58.0
      *
      * FilterOperator "Not Between"
      *
      * Used to filter all entries, which are not between the given boundaries. The filter result does not contains
      * the boundaries, but only entries outside of the boundaries. The order of the entries in the filter results
      * is based on their occurrence in the input list.
      *
      * **Note, when used on strings:** The String comparison is based on lexicographical ordering. Characters
      * are ranked in their alphabetical order. Words with the same preceding substring are ordered based on
      * their length e.g. "Chris" comes before "Christian".
      */
    @js.native
    sealed trait NB
      extends StObject
         with FilterOperator
    
    /**
      * FilterOperator not equals
      */
    @js.native
    sealed trait NE
      extends StObject
         with FilterOperator
    
    /**
      * @SINCE 1.58.0
      *
      * FilterOperator not contains
      */
    @js.native
    sealed trait NotContains
      extends StObject
         with FilterOperator
    
    /**
      * @SINCE 1.58.0
      *
      * FilterOperator not ends with
      */
    @js.native
    sealed trait NotEndsWith
      extends StObject
         with FilterOperator
    
    /**
      * @SINCE 1.58.0
      *
      * FilterOperator not starts with
      */
    @js.native
    sealed trait NotStartsWith
      extends StObject
         with FilterOperator
    
    /**
      * FilterOperator starts with
      */
    @js.native
    sealed trait StartsWith
      extends StObject
         with FilterOperator
  }
}
