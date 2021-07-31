package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BreakType extends StObject
/**
  *
  * Specifies the form of a break.
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.BreakType")
@js.native
object BreakType extends StObject {
  
  /**
    * Line break.
    *
    */
  @js.native
  sealed trait line
    extends StObject
       with BreakType
  
  /**
    * @deprecated Use sectionNext instead.
    */
  @js.native
  sealed trait next
    extends StObject
       with BreakType
  
  /**
    * Page break at the insertion point.
    *
    */
  @js.native
  sealed trait page
    extends StObject
       with BreakType
  
  /**
    * New section without a corresponding page break.
    *
    */
  @js.native
  sealed trait sectionContinuous
    extends StObject
       with BreakType
  
  /**
    * Section break with the next section beginning on the next even-numbered page. If the section break falls on an even-numbered page, Word leaves the next odd-numbered page blank.
    *
    */
  @js.native
  sealed trait sectionEven
    extends StObject
       with BreakType
  
  /**
    * Section break on next page.
    *
    */
  @js.native
  sealed trait sectionNext
    extends StObject
       with BreakType
  
  /**
    * Section break with the next section beginning on the next odd-numbered page. If the section break falls on an odd-numbered page, Word leaves the next even-numbered page blank.
    *
    */
  @js.native
  sealed trait sectionOdd
    extends StObject
       with BreakType
}
