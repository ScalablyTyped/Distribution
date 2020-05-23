package typings.officeJsPreview.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LocationRelation extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.LocationRelation")
@js.native
object LocationRelation extends js.Object {
  /**
    *
    * Indicates that this instance occurs after, and is adjacent to, the range.
    *
    */
  @js.native
  sealed trait adjacentAfter extends LocationRelation
  
  /**
    *
    * Indicates that this instance occurs before, and is adjacent to, the range.
    *
    */
  @js.native
  sealed trait adjacentBefore extends LocationRelation
  
  /**
    *
    * Indicates that this instance occurs after the range.
    *
    */
  @js.native
  sealed trait after extends LocationRelation
  
  /**
    *
    * Indicates that this instance occurs before the range.
    *
    */
  @js.native
  sealed trait before extends LocationRelation
  
  /**
    *
    * Indicates that this instance contains the range, with the exception of the start and end character of this instance.
    *
    */
  @js.native
  sealed trait contains extends LocationRelation
  
  /**
    *
    * Indicates that this instance contains the range and that it shares the same end character. The range does not share the same start character as this instance.
    *
    */
  @js.native
  sealed trait containsEnd extends LocationRelation
  
  /**
    *
    * Indicates that this instance contains the range and that it shares the same start character. The range does not share the same end character as this instance.
    *
    */
  @js.native
  sealed trait containsStart extends LocationRelation
  
  /**
    *
    * Indicates that this instance and the range represent the same range.
    *
    */
  @js.native
  sealed trait equal extends LocationRelation
  
  /**
    *
    * Indicates that this instance is inside the range. The range does not share the same start and end characters as this instance.
    *
    */
  @js.native
  sealed trait inside extends LocationRelation
  
  /**
    *
    * Indicates that this instance is inside the range and that it shares the same end character. The range does not share the same start character as this instance.
    *
    */
  @js.native
  sealed trait insideEnd extends LocationRelation
  
  /**
    *
    * Indicates that this instance is inside the range and that it shares the same start character. The range does not share the same end character as this instance.
    *
    */
  @js.native
  sealed trait insideStart extends LocationRelation
  
  /**
    *
    * Indicates that this instance starts inside the range and overlaps the range’s last character.
    *
    */
  @js.native
  sealed trait overlapsAfter extends LocationRelation
  
  /**
    *
    * Indicates that this instance starts before the range and overlaps the range’s first character.
    *
    */
  @js.native
  sealed trait overlapsBefore extends LocationRelation
  
  /**
    *
    * Indicates that this instance and the range are in different sub-documents.
    *
    */
  @js.native
  sealed trait unrelated extends LocationRelation
  
}

