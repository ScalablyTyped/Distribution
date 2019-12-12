package typings.officeDashJsDashPreview.Word

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Word.RangeLocation.after
import typings.officeDashJsDashPreview.Word.RangeLocation.before
import typings.officeDashJsDashPreview.Word.RangeLocation.content
import typings.officeDashJsDashPreview.Word.RangeLocation.end
import typings.officeDashJsDashPreview.Word.RangeLocation.start
import typings.officeDashJsDashPreview.Word.RangeLocation.whole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeLocation extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.RangeLocation")
@js.native
object RangeLocation extends js.Object {
  /**
    *
    * The point after the object. If the object is a paragraph content control or table content control, it is the point after the EOP or Table characters.
    *
    */
  @js.native
  sealed trait after extends RangeLocation
  
  /**
    *
    * For content control only. It is the point before the opening tag.
    *
    */
  @js.native
  sealed trait before extends RangeLocation
  
  /**
    *
    * The range between 'Start' and 'End'.
    *
    */
  @js.native
  sealed trait content extends RangeLocation
  
  /**
    *
    * The ending point of the object. For paragraph, it is the point before the EOP. For content control, it is the point before the closing tag.
    *
    */
  @js.native
  sealed trait end extends RangeLocation
  
  /**
    *
    * The starting point of the object. For content control, it is the point after the opening tag.
    *
    */
  @js.native
  sealed trait start extends RangeLocation
  
  /**
    *
    * The object's whole range. If the object is a paragraph content control or table content control, the EOP or Table characters after the content control are also included.
    *
    */
  @js.native
  sealed trait whole extends RangeLocation
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RangeLocation with String] = js.native
  /* "After" */ @js.native
  object after extends TopLevel[after with String]
  
  /* "Before" */ @js.native
  object before extends TopLevel[before with String]
  
  /* "Content" */ @js.native
  object content extends TopLevel[content with String]
  
  /* "End" */ @js.native
  object end extends TopLevel[end with String]
  
  /* "Start" */ @js.native
  object start extends TopLevel[start with String]
  
  /* "Whole" */ @js.native
  object whole extends TopLevel[whole with String]
  
}

