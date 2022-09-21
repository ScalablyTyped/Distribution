package typings.officeJs.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextVerticalAlignment extends StObject
/**
  * Represents the vertical alignment of a {@link PowerPoint.TextFrame} in a {@link PowerPoint.Shape}.
  If one the centered options are selected, the contents of the `TextFrame` will be centered horizontally within the `Shape` as a group.
  To change the horizontal alignment of a text, see {@link PowerPoint.ParagraphFormat} and {@link PowerPoint.ParagraphHorizontalAlignment }.
  *
  * @remarks
  * [Api set: PowerPointApi 1.4]
  */
@JSGlobal("PowerPoint.TextVerticalAlignment")
@js.native
object TextVerticalAlignment extends StObject {
  
  /**
    * Specifies that the `TextFrame` should be bottom aligned to the `Shape`.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait bottom
    extends StObject
       with TextVerticalAlignment
  
  /**
    * Specifies that the `TextFrame` should be bottom aligned vertically to the `Shape`. Contents of the `TextFrame` will be centered horizontally within the `Shape`.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait bottomCentered
    extends StObject
       with TextVerticalAlignment
  
  /**
    * Specifies that the `TextFrame` should be center aligned to the `Shape`.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait middle
    extends StObject
       with TextVerticalAlignment
  
  /**
    * Specifies that the `TextFrame` should be center aligned vertically to the `Shape`. Contents of the `TextFrame` will be centered horizontally within the `Shape`.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait middleCentered
    extends StObject
       with TextVerticalAlignment
  
  /**
    * Specifies that the `TextFrame` should be top aligned to the `Shape`.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait top
    extends StObject
       with TextVerticalAlignment
  
  /**
    * Specifies that the `TextFrame` should be top aligned vertically to the `Shape`. Contents of the `TextFrame` will be centered horizontally within the `Shape`.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait topCentered
    extends StObject
       with TextVerticalAlignment
}
