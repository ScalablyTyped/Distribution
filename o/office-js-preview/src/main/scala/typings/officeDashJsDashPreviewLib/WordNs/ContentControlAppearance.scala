package typings
package officeDashJsDashPreviewLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentControlAppearance extends js.Object

/**
  *
  * ContentControl appearance
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.ContentControlAppearance")
@js.native
object ContentControlAppearance extends js.Object {
  /**
    *
    * Represents a content control shown as a shaded rectangle or bounding box (with optional title).
    *
    */
  @js.native
  sealed trait boundingBox
    extends officeDashJsDashPreviewLib.WordNs.ContentControlAppearance
  
  /**
    *
    * Represents a content control that is not shown.
    *
    */
  @js.native
  sealed trait hidden
    extends officeDashJsDashPreviewLib.WordNs.ContentControlAppearance
  
  /**
    *
    * Represents a content control shown as start and end markers.
    *
    */
  @js.native
  sealed trait tags
    extends officeDashJsDashPreviewLib.WordNs.ContentControlAppearance
  
  /* "BoundingBox" */ val boundingBox: boundingBox with java.lang.String = js.native
  /* "Hidden" */ val hidden: hidden with java.lang.String = js.native
  /* "Tags" */ val tags: tags with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.WordNs.ContentControlAppearance with java.lang.String] = js.native
}

