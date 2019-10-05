package typings.officeDashJsDashPreview.Word

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
  
  /* "After" */ val after: typings.officeDashJsDashPreview.Word.RangeLocation.after with String = js.native
  /* "Before" */ val before: typings.officeDashJsDashPreview.Word.RangeLocation.before with String = js.native
  /* "Content" */ val content: typings.officeDashJsDashPreview.Word.RangeLocation.content with String = js.native
  /* "End" */ val end: typings.officeDashJsDashPreview.Word.RangeLocation.end with String = js.native
  /* "Start" */ val start: typings.officeDashJsDashPreview.Word.RangeLocation.start with String = js.native
  /* "Whole" */ val whole: typings.officeDashJsDashPreview.Word.RangeLocation.whole with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RangeLocation with String] = js.native
}

