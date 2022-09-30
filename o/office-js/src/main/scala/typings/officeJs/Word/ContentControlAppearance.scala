package typings.officeJs.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContentControlAppearance extends StObject
/**
  * ContentControl appearance.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  *
  * Content control appearance options are BoundingBox, Tags, or Hidden.
  */
@JSGlobal("Word.ContentControlAppearance")
@js.native
object ContentControlAppearance extends StObject {
  
  /**
    * Represents a content control shown as a shaded rectangle or bounding box (with optional title).
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait boundingBox
    extends StObject
       with ContentControlAppearance
  
  /**
    * Represents a content control that is not shown.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait hidden
    extends StObject
       with ContentControlAppearance
  
  /**
    * Represents a content control shown as start and end markers.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait tags
    extends StObject
       with ContentControlAppearance
}
