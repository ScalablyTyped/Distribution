package typings.officeDashJs.Word

import org.scalablytyped.runtime.TopLevel
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
  sealed trait boundingBox extends ContentControlAppearance
  
  /**
    *
    * Represents a content control that is not shown.
    *
    */
  @js.native
  sealed trait hidden extends ContentControlAppearance
  
  /**
    *
    * Represents a content control shown as start and end markers.
    *
    */
  @js.native
  sealed trait tags extends ContentControlAppearance
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentControlAppearance with String] = js.native
  /* "BoundingBox" */ @js.native
  object boundingBox extends TopLevel[boundingBox with String]
  
  /* "Hidden" */ @js.native
  object hidden extends TopLevel[hidden with String]
  
  /* "Tags" */ @js.native
  object tags extends TopLevel[tags with String]
  
}

