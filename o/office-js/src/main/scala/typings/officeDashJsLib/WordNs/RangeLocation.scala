package typings
package officeDashJsLib.WordNs

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
  sealed trait after
    extends officeDashJsLib.WordNs.RangeLocation
  
  /**
           *
           * For content control only. It is the point before the opening tag.
           *
           */
  @js.native
  sealed trait before
    extends officeDashJsLib.WordNs.RangeLocation
  
  /**
           *
           * The range between 'Start' and 'End'.
           *
           */
  @js.native
  sealed trait content
    extends officeDashJsLib.WordNs.RangeLocation
  
  /**
           *
           * The ending point of the object. For paragraph, it is the point before the EOP. For content control, it is the point before the closing tag.
           *
           */
  @js.native
  sealed trait end
    extends officeDashJsLib.WordNs.RangeLocation
  
  /**
           *
           * The starting point of the object. For content control, it is the point after the opening tag.
           *
           */
  @js.native
  sealed trait start
    extends officeDashJsLib.WordNs.RangeLocation
  
  /**
           *
           * The object's whole range. If the object is a paragraph content control or table content control, the EOP or Table characters after the content control are also included.
           *
           */
  @js.native
  sealed trait whole
    extends officeDashJsLib.WordNs.RangeLocation
  
  /* "After" */ val after: after with java.lang.String = js.native
  /* "Before" */ val before: before with java.lang.String = js.native
  /* "Content" */ val content: content with java.lang.String = js.native
  /* "End" */ val end: end with java.lang.String = js.native
  /* "Start" */ val start: start with java.lang.String = js.native
  /* "Whole" */ val whole: whole with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.WordNs.RangeLocation with java.lang.String] = js.native
}

