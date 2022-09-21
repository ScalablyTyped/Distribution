package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocationRelation extends StObject
/**
  * @remarks
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.LocationRelation")
@js.native
object LocationRelation extends StObject {
  
  /**
    * Indicates that this instance occurs after, and is adjacent to, the range.
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait adjacentAfter
    extends StObject
       with LocationRelation
  
  /**
    * Indicates that this instance occurs before, and is adjacent to, the range.
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait adjacentBefore
    extends StObject
       with LocationRelation
  
  /**
    * Indicates that this instance occurs after the range.
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait after
    extends StObject
       with LocationRelation
  
  /**
    * Indicates that this instance occurs before the range.
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait before
    extends StObject
       with LocationRelation
  
  /**
    * Indicates that this instance contains the range, with the exception of the start and end character of this instance.
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait contains
    extends StObject
       with LocationRelation
  
  /**
    * Indicates that this instance contains the range and that it shares the same end character. The range does not share the same start character as this instance.
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait containsEnd
    extends StObject
       with LocationRelation
  
  /**
    * Indicates that this instance contains the range and that it shares the same start character. The range does not share the same end character as this instance.
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait containsStart
    extends StObject
       with LocationRelation
  
  /**
    * Indicates that this instance and the range represent the same range.
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait equal
    extends StObject
       with LocationRelation
  
  /**
    * Indicates that this instance is inside the range. The range does not share the same start and end characters as this instance.
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait inside
    extends StObject
       with LocationRelation
  
  /**
    * Indicates that this instance is inside the range and that it shares the same end character. The range does not share the same start character as this instance.
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait insideEnd
    extends StObject
       with LocationRelation
  
  /**
    * Indicates that this instance is inside the range and that it shares the same start character. The range does not share the same end character as this instance.
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait insideStart
    extends StObject
       with LocationRelation
  
  /**
    * Indicates that this instance starts inside the range and overlaps the range’s last character.
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait overlapsAfter
    extends StObject
       with LocationRelation
  
  /**
    * Indicates that this instance starts before the range and overlaps the range’s first character.
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait overlapsBefore
    extends StObject
       with LocationRelation
  
  /**
    * Indicates that this instance and the range are in different sub-documents.
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait unrelated
    extends StObject
       with LocationRelation
}
