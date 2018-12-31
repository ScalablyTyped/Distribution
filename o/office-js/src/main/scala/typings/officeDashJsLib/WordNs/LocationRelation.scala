package typings
package officeDashJsLib.WordNs

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
  sealed trait adjacentAfter
    extends officeDashJsLib.WordNs.LocationRelation
  
  /**
    *
    * Indicates that this instance occurs before, and is adjacent to, the range.
    *
    */
  @js.native
  sealed trait adjacentBefore
    extends officeDashJsLib.WordNs.LocationRelation
  
  /**
    *
    * Indicates that this instance occurs after the range.
    *
    */
  @js.native
  sealed trait after
    extends officeDashJsLib.WordNs.LocationRelation
  
  /**
    *
    * Indicates that this instance occurs before the range.
    *
    */
  @js.native
  sealed trait before
    extends officeDashJsLib.WordNs.LocationRelation
  
  /**
    *
    * Indicates that this instance contains the range, with the exception of the start and end character of this instance.
    *
    */
  @js.native
  sealed trait contains
    extends officeDashJsLib.WordNs.LocationRelation
  
  /**
    *
    * Indicates that this instance contains the range and that it shares the same end character. The range does not share the same start character as this instance.
    *
    */
  @js.native
  sealed trait containsEnd
    extends officeDashJsLib.WordNs.LocationRelation
  
  /**
    *
    * Indicates that this instance contains the range and that it shares the same start character. The range does not share the same end character as this instance.
    *
    */
  @js.native
  sealed trait containsStart
    extends officeDashJsLib.WordNs.LocationRelation
  
  /**
    *
    * Indicates that this instance and the range represent the same range.
    *
    */
  @js.native
  sealed trait equal
    extends officeDashJsLib.WordNs.LocationRelation
  
  /**
    *
    * Indicates that this instance is inside the range. The range does not share the same start and end characters as this instance.
    *
    */
  @js.native
  sealed trait inside
    extends officeDashJsLib.WordNs.LocationRelation
  
  /**
    *
    * Indicates that this instance is inside the range and that it shares the same end character. The range does not share the same start character as this instance.
    *
    */
  @js.native
  sealed trait insideEnd
    extends officeDashJsLib.WordNs.LocationRelation
  
  /**
    *
    * Indicates that this instance is inside the range and that it shares the same start character. The range does not share the same end character as this instance.
    *
    */
  @js.native
  sealed trait insideStart
    extends officeDashJsLib.WordNs.LocationRelation
  
  /**
    *
    * Indicates that this instance starts inside the range and overlaps the range’s last character.
    *
    */
  @js.native
  sealed trait overlapsAfter
    extends officeDashJsLib.WordNs.LocationRelation
  
  /**
    *
    * Indicates that this instance starts before the range and overlaps the range’s first character.
    *
    */
  @js.native
  sealed trait overlapsBefore
    extends officeDashJsLib.WordNs.LocationRelation
  
  /**
    *
    * Indicates that this instance and the range are in different sub-documents.
    *
    */
  @js.native
  sealed trait unrelated
    extends officeDashJsLib.WordNs.LocationRelation
  
  /* "AdjacentAfter" */ val adjacentAfter: adjacentAfter with java.lang.String = js.native
  /* "AdjacentBefore" */ val adjacentBefore: adjacentBefore with java.lang.String = js.native
  /* "After" */ val after: after with java.lang.String = js.native
  /* "Before" */ val before: before with java.lang.String = js.native
  /* "Contains" */ val contains: contains with java.lang.String = js.native
  /* "ContainsEnd" */ val containsEnd: containsEnd with java.lang.String = js.native
  /* "ContainsStart" */ val containsStart: containsStart with java.lang.String = js.native
  /* "Equal" */ val equal: equal with java.lang.String = js.native
  /* "Inside" */ val inside: inside with java.lang.String = js.native
  /* "InsideEnd" */ val insideEnd: insideEnd with java.lang.String = js.native
  /* "InsideStart" */ val insideStart: insideStart with java.lang.String = js.native
  /* "OverlapsAfter" */ val overlapsAfter: overlapsAfter with java.lang.String = js.native
  /* "OverlapsBefore" */ val overlapsBefore: overlapsBefore with java.lang.String = js.native
  /* "Unrelated" */ val unrelated: unrelated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.WordNs.LocationRelation with java.lang.String] = js.native
}

