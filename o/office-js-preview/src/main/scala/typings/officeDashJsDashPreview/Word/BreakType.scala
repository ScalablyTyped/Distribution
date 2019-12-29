package typings.officeDashJsDashPreview.Word

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BreakType extends js.Object

/**
  *
  * Specifies the form of a break.
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.BreakType")
@js.native
object BreakType extends js.Object {
  /**
    *
    * Line break.
    *
    */
  @js.native
  sealed trait line extends BreakType
  
  /**
    *
    * @deprecated Use sectionNext instead.
    */
  @js.native
  sealed trait next extends BreakType
  
  /**
    *
    * Page break at the insertion point.
    *
    */
  @js.native
  sealed trait page extends BreakType
  
  /**
    *
    * New section without a corresponding page break.
    *
    */
  @js.native
  sealed trait sectionContinuous extends BreakType
  
  /**
    *
    * Section break with the next section beginning on the next even-numbered page. If the section break falls on an even-numbered page, Word leaves the next odd-numbered page blank.
    *
    */
  @js.native
  sealed trait sectionEven extends BreakType
  
  /**
    *
    * Section break on next page.
    *
    */
  @js.native
  sealed trait sectionNext extends BreakType
  
  /**
    *
    * Section break with the next section beginning on the next odd-numbered page. If the section break falls on an odd-numbered page, Word leaves the next even-numbered page blank.
    *
    */
  @js.native
  sealed trait sectionOdd extends BreakType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BreakType with String] = js.native
  /* "Line" */ @js.native
  object line extends TopLevel[line with String]
  
  /* "Next" */ @js.native
  object next extends TopLevel[next with String]
  
  /* "Page" */ @js.native
  object page extends TopLevel[page with String]
  
  /* "SectionContinuous" */ @js.native
  object sectionContinuous extends TopLevel[sectionContinuous with String]
  
  /* "SectionEven" */ @js.native
  object sectionEven extends TopLevel[sectionEven with String]
  
  /* "SectionNext" */ @js.native
  object sectionNext extends TopLevel[sectionNext with String]
  
  /* "SectionOdd" */ @js.native
  object sectionOdd extends TopLevel[sectionOdd with String]
  
}

