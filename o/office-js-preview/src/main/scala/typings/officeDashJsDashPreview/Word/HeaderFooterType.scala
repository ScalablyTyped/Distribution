package typings.officeDashJsDashPreview.Word

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Word.HeaderFooterType.evenPages
import typings.officeDashJsDashPreview.Word.HeaderFooterType.firstPage
import typings.officeDashJsDashPreview.Word.HeaderFooterType.primary
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
  sealed trait evenPages extends HeaderFooterType
  
  /**
    *
    * Returns the header or footer on the first page of a section.
    *
    */
  @js.native
  sealed trait firstPage extends HeaderFooterType
  
  /**
    *
    * Returns the header or footer on all pages of a section, but excludes the first page or odd pages if they are different.
    *
    */
  @js.native
  sealed trait primary extends HeaderFooterType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HeaderFooterType with String] = js.native
  /* "EvenPages" */ @js.native
  object evenPages extends TopLevel[evenPages with String]
  
  /* "FirstPage" */ @js.native
  object firstPage extends TopLevel[firstPage with String]
  
  /* "Primary" */ @js.native
  object primary extends TopLevel[primary with String]
  
}

