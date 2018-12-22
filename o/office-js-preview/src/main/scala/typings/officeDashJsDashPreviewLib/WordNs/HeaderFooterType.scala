package typings
package officeDashJsDashPreviewLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeaderFooterType extends js.Object

/**
     * [Api set: WordApi]
     */
@JSGlobal("Word.HeaderFooterType")
@js.native
object HeaderFooterType extends js.Object {
  /**
           *
           * Returns all headers or footers on even-numbered pages of a section.
           *
           */
  @js.native
  sealed trait evenPages
    extends officeDashJsDashPreviewLib.WordNs.HeaderFooterType
  
  /**
           *
           * Returns the header or footer on the first page of a section.
           *
           */
  @js.native
  sealed trait firstPage
    extends officeDashJsDashPreviewLib.WordNs.HeaderFooterType
  
  /**
           *
           * Returns the header or footer on all pages of a section, with the first page or odd pages excluded if they are different.
           *
           */
  @js.native
  sealed trait primary
    extends officeDashJsDashPreviewLib.WordNs.HeaderFooterType
  
  /* "EvenPages" */ val evenPages: evenPages with java.lang.String = js.native
  /* "FirstPage" */ val firstPage: firstPage with java.lang.String = js.native
  /* "Primary" */ val primary: primary with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.WordNs.HeaderFooterType with java.lang.String] = js.native
}

