package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValueFilterCondition extends js.Object

/**
  *
  * Enum representing all accepted conditions by which a value filter can be applied.
  Used to configure the type of PivotFilter that is applied to the field.
  `PivotFilter.exclusive` can be set to true to invert many of these conditions.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
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
  
  /* "Equals" */ @JSName("equals")
  val equals_ : equals with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValueFilterCondition with String] = js.native
  /* "Between" */ @js.native
  object between extends TopLevel[between with String]
  
  /* "BottomN" */ @js.native
  object bottomN extends TopLevel[bottomN with String]
  
  /* "GreaterThan" */ @js.native
  object greaterThan extends TopLevel[greaterThan with String]
  
  /* "GreaterThanOrEqualTo" */ @js.native
  object greaterThanOrEqualTo extends TopLevel[greaterThanOrEqualTo with String]
  
  /* "LessThan" */ @js.native
  object lessThan extends TopLevel[lessThan with String]
  
  /* "LessThanOrEqualTo" */ @js.native
  object lessThanOrEqualTo extends TopLevel[lessThanOrEqualTo with String]
  
  /* "TopN" */ @js.native
  object topN extends TopLevel[topN with String]
  
  /* "Unknown" */ @js.native
  object unknown extends TopLevel[unknown with String]
  
}

