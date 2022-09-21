package typings.officeJsPreview.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeFontUnderlineStyle extends StObject
/**
  * The type of underline applied to a font.
  *
  * @remarks
  * [Api set: PowerPointApi 1.4]
  */
@JSGlobal("PowerPoint.ShapeFontUnderlineStyle")
@js.native
object ShapeFontUnderlineStyle extends StObject {
  
  /**
    * Underlining of text with a line containing dashes.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait dash
    extends StObject
       with ShapeFontUnderlineStyle
  
  /**
    * Underlining of text with a thick line containing dashes.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait dashHeavy
    extends StObject
       with ShapeFontUnderlineStyle
  
  /**
    * Underlining of text with a line containing long dashes.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait dashLong
    extends StObject
       with ShapeFontUnderlineStyle
  
  /**
    * Underlining of text with a thick line containing long dashes.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait dashLongHeavy
    extends StObject
       with ShapeFontUnderlineStyle
  
  /**
    * Underlining of text with a line containing dots and dashes.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait dotDash
    extends StObject
       with ShapeFontUnderlineStyle
  
  /**
    * Underlining of text with a thick line containing dots and dashes.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait dotDashHeavy
    extends StObject
       with ShapeFontUnderlineStyle
  
  /**
    * Underlining of text with a line containing double dots and dashes.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait dotDotDash
    extends StObject
       with ShapeFontUnderlineStyle
  
  /**
    * Underlining of text with a thick line containing double dots and dashes.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait dotDotDashHeavy
    extends StObject
       with ShapeFontUnderlineStyle
  
  /**
    * Underlining of text with a dotted line.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait dotted
    extends StObject
       with ShapeFontUnderlineStyle
  
  /**
    * Underlining of text with a thick, dotted line.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait dottedHeavy
    extends StObject
       with ShapeFontUnderlineStyle
  
  /**
    * Underlining of text with double lines.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait double
    extends StObject
       with ShapeFontUnderlineStyle
  
  /**
    * Underlining of text with a thick line.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait heavy
    extends StObject
       with ShapeFontUnderlineStyle
  
  /**
    * No underlining.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait none
    extends StObject
       with ShapeFontUnderlineStyle
  
  /**
    * Regular single line underlining.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait single
    extends StObject
       with ShapeFontUnderlineStyle
  
  /**
    * Underlining of text with a wavy line.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait wavy
    extends StObject
       with ShapeFontUnderlineStyle
  
  /**
    * Underlining of text with double wavy lines.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait wavyDouble
    extends StObject
       with ShapeFontUnderlineStyle
  
  /**
    * Underlining of text with a thick, wavy line.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait wavyHeavy
    extends StObject
       with ShapeFontUnderlineStyle
}
