package typings.officeDashJs.WordNs

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
    * Returns the header or footer on all pages of a section, with the first page or odd pages excluded if they are different.
    *
    */
  @js.native
  sealed trait primary extends HeaderFooterType
  
  /* "EvenPages" */ val evenPages: typings.officeDashJs.WordNs.HeaderFooterType.evenPages with String = js.native
  /* "FirstPage" */ val firstPage: typings.officeDashJs.WordNs.HeaderFooterType.firstPage with String = js.native
  /* "Primary" */ val primary: typings.officeDashJs.WordNs.HeaderFooterType.primary with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HeaderFooterType with String] = js.native
}

