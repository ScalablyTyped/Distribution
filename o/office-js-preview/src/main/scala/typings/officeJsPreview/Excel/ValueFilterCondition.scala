package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueFilterCondition extends StObject
/**
  *
  * Enum representing all accepted conditions by which a value filter can be applied.
  Used to configure the type of PivotFilter that is applied to the field.
  `PivotFilter.exclusive` can be set to true to invert many of these conditions.
  *
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.ValueFilterCondition")
@js.native
object ValueFilterCondition extends StObject {
  
  /**
    * Between `lowerBound` and `upperBound` criteria.
    
    Required Criteria: {`value`, `lowerBound`, `upperBound`}.
    Optional Criteria: {`exclusive`}.
    *
    */
  @js.native
  sealed trait between
    extends StObject
       with ValueFilterCondition
  
  /**
    * In bottom N (`threshold`) [items, percent, sum] of value category.
    
    Required Criteria: {`value`, `threshold`, `selectionType`}.
    *
    */
  @js.native
  sealed trait bottomN
    extends StObject
       with ValueFilterCondition
  
  /**
    * Equals comparator criterion.
    
    Required Criteria: {`value`, `comparator`}.
    Optional Criteria: {`exclusive`}.
    *
    */
  @js.native
  sealed trait equals
    extends StObject
       with ValueFilterCondition
  
  /**
    * Greater than comparator criterion.
    
    Required Criteria: {`value`, `comparator`}.
    *
    */
  @js.native
  sealed trait greaterThan
    extends StObject
       with ValueFilterCondition
  
  /**
    * Greater than or equal to comparator criterion.
    
    Required Criteria: {`value`, `comparator`}.
    *
    */
  @js.native
  sealed trait greaterThanOrEqualTo
    extends StObject
       with ValueFilterCondition
  
  /**
    * Less than comparator criterion.
    
    Required Criteria: {`value`, `comparator`}.
    *
    */
  @js.native
  sealed trait lessThan
    extends StObject
       with ValueFilterCondition
  
  /**
    * Less than or equal to comparator criterion.
    
    Required Criteria: {`value`, `comparator`}.
    *
    */
  @js.native
  sealed trait lessThanOrEqualTo
    extends StObject
       with ValueFilterCondition
  
  /**
    * In top N (`threshold`) [items, percent, sum] of value category.
    
    Required Criteria: {`value`, `threshold`, `selectionType`}.
    *
    */
  @js.native
  sealed trait topN
    extends StObject
       with ValueFilterCondition
  
  /**
    * ValueFilterCondition is unknown or unsupported.
    *
    */
  @js.native
  sealed trait unknown
    extends StObject
       with ValueFilterCondition
}
