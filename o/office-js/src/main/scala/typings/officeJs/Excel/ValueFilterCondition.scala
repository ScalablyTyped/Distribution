package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueFilterCondition extends js.Object
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
object ValueFilterCondition extends js.Object {
  
  /**
    * Between `lowerBound` and `upperBound` criteria.
    
    Required Criteria: {`value`, `lowerBound`, `upperBound`}.
    Optional Criteria: {`exclusive`}.
    *
    */
  @js.native
  sealed trait between extends ValueFilterCondition
  
  /**
    * In bottom N (`threshold`) [items, percent, sum] of value category.
    
    Required Criteria: {`value`, `threshold`, `selectionType`}.
    *
    */
  @js.native
  sealed trait bottomN extends ValueFilterCondition
  
  /**
    * Equals comparator criterion.
    
    Required Criteria: {`value`, `comparator`}.
    Optional Criteria: {`exclusive`}.
    *
    */
  @js.native
  sealed trait equals extends ValueFilterCondition
  
  /**
    * Greater than comparator criterion.
    
    Required Criteria: {`value`, `comparator`}.
    *
    */
  @js.native
  sealed trait greaterThan extends ValueFilterCondition
  
  /**
    * Greater than or equal to comparator criterion.
    
    Required Criteria: {`value`, `comparator`}.
    *
    */
  @js.native
  sealed trait greaterThanOrEqualTo extends ValueFilterCondition
  
  /**
    * Less than comparator criterion.
    
    Required Criteria: {`value`, `comparator`}.
    *
    */
  @js.native
  sealed trait lessThan extends ValueFilterCondition
  
  /**
    * Less than or equal to comparator criterion.
    
    Required Criteria: {`value`, `comparator`}.
    *
    */
  @js.native
  sealed trait lessThanOrEqualTo extends ValueFilterCondition
  
  /**
    * In top N (`threshold`) [items, percent, sum] of value category.
    
    Required Criteria: {`value`, `threshold`, `selectionType`}.
    *
    */
  @js.native
  sealed trait topN extends ValueFilterCondition
  
  /**
    * ValueFilterCondition is unknown or unsupported.
    *
    */
  @js.native
  sealed trait unknown extends ValueFilterCondition
}
