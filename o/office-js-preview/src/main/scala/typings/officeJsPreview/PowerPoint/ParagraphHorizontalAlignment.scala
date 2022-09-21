package typings.officeJsPreview.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParagraphHorizontalAlignment extends StObject
/**
  * Represents the horizontal alignment of the {@link PowerPoint.TextFrame} in a {@link PowerPoint.Shape}.
  *
  * @remarks
  * [Api set: PowerPointApi 1.4]
  */
@JSGlobal("PowerPoint.ParagraphHorizontalAlignment")
@js.native
object ParagraphHorizontalAlignment extends StObject {
  
  /**
    * Align text in the center.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait center
    extends StObject
       with ParagraphHorizontalAlignment
  
  /**
    * Distributes the text words across an entire text line.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait distributed
    extends StObject
       with ParagraphHorizontalAlignment
  
  /**
    * Align text so that it is justified across the whole line.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait justify
    extends StObject
       with ParagraphHorizontalAlignment
  
  /**
    * Specifies the alignment or adjustment of kashida length in Arabic text.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait justifyLow
    extends StObject
       with ParagraphHorizontalAlignment
  
  /**
    * Align text to the left margin.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait left
    extends StObject
       with ParagraphHorizontalAlignment
  
  /**
    * Align text to the right margin.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait right
    extends StObject
       with ParagraphHorizontalAlignment
  
  /**
    * Distributes Thai text specially, because each character is treated as a word.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait thaiDistributed
    extends StObject
       with ParagraphHorizontalAlignment
}
