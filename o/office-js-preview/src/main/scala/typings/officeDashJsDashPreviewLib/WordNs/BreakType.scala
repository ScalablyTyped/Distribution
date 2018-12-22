package typings
package officeDashJsDashPreviewLib.WordNs

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
  sealed trait line
    extends officeDashJsDashPreviewLib.WordNs.BreakType
  
  /**
           *
           * @deprecated Use sectionNext instead.
           */
  @js.native
  sealed trait next
    extends officeDashJsDashPreviewLib.WordNs.BreakType
  
  /**
           *
           * Page break at the insertion point.
           *
           */
  @js.native
  sealed trait page
    extends officeDashJsDashPreviewLib.WordNs.BreakType
  
  /**
           *
           * New section without a corresponding page break.
           *
           */
  @js.native
  sealed trait sectionContinuous
    extends officeDashJsDashPreviewLib.WordNs.BreakType
  
  /**
           *
           * Section break with the next section beginning on the next even-numbered page. If the section break falls on an even-numbered page, Word leaves the next odd-numbered page blank.
           *
           */
  @js.native
  sealed trait sectionEven
    extends officeDashJsDashPreviewLib.WordNs.BreakType
  
  /**
           *
           * Section break on next page.
           *
           */
  @js.native
  sealed trait sectionNext
    extends officeDashJsDashPreviewLib.WordNs.BreakType
  
  /**
           *
           * Section break with the next section beginning on the next odd-numbered page. If the section break falls on an odd-numbered page, Word leaves the next even-numbered page blank.
           *
           */
  @js.native
  sealed trait sectionOdd
    extends officeDashJsDashPreviewLib.WordNs.BreakType
  
  /* "Line" */ val line: line with java.lang.String = js.native
  /* "Next" */ val next: next with java.lang.String = js.native
  /* "Page" */ val page: page with java.lang.String = js.native
  /* "SectionContinuous" */ val sectionContinuous: sectionContinuous with java.lang.String = js.native
  /* "SectionEven" */ val sectionEven: sectionEven with java.lang.String = js.native
  /* "SectionNext" */ val sectionNext: sectionNext with java.lang.String = js.native
  /* "SectionOdd" */ val sectionOdd: sectionOdd with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.WordNs.BreakType with java.lang.String] = js.native
}

