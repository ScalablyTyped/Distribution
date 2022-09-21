package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParagraphStyle extends StObject {
  
  /** The text alignment for this paragraph. */
  var alignment: js.UndefOr[String] = js.undefined
  
  /** Whether to avoid widows and orphans for the paragraph. If unset, the value is inherited from the parent. */
  var avoidWidowAndOrphan: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The border between this paragraph and the next and previous paragraphs. If unset, the value is inherited from the parent. The between border is rendered when the adjacent paragraph
    * has the same border and indent properties. Paragraph borders cannot be partially updated. When making changes to a paragraph border the new border must be specified in its entirety.
    */
  var borderBetween: js.UndefOr[ParagraphBorder] = js.undefined
  
  /**
    * The border at the bottom of this paragraph. If unset, the value is inherited from the parent. The bottom border is rendered when the paragraph below has different border and indent
    * properties. Paragraph borders cannot be partially updated. When making changes to a paragraph border the new border must be specified in its entirety.
    */
  var borderBottom: js.UndefOr[ParagraphBorder] = js.undefined
  
  /**
    * The border to the left of this paragraph. If unset, the value is inherited from the parent. Paragraph borders cannot be partially updated. When making changes to a paragraph border
    * the new border must be specified in its entirety.
    */
  var borderLeft: js.UndefOr[ParagraphBorder] = js.undefined
  
  /**
    * The border to the right of this paragraph. If unset, the value is inherited from the parent. Paragraph borders cannot be partially updated. When making changes to a paragraph border
    * the new border must be specified in its entirety.
    */
  var borderRight: js.UndefOr[ParagraphBorder] = js.undefined
  
  /**
    * The border at the top of this paragraph. If unset, the value is inherited from the parent. The top border is rendered when the paragraph above has different border and indent
    * properties. Paragraph borders cannot be partially updated. When making changes to a paragraph border the new border must be specified in its entirety.
    */
  var borderTop: js.UndefOr[ParagraphBorder] = js.undefined
  
  /** The text direction of this paragraph. If unset, the value defaults to LEFT_TO_RIGHT since paragraph direction is not inherited. */
  var direction: js.UndefOr[String] = js.undefined
  
  /** The heading ID of the paragraph. If empty, then this paragraph is not a heading. This property is read-only. */
  var headingId: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of indentation for the paragraph on the side that corresponds to the end of the text, based on the current paragraph direction. If unset, the value is inherited from the
    * parent.
    */
  var indentEnd: js.UndefOr[Dimension] = js.undefined
  
  /** The amount of indentation for the first line of the paragraph. If unset, the value is inherited from the parent. */
  var indentFirstLine: js.UndefOr[Dimension] = js.undefined
  
  /**
    * The amount of indentation for the paragraph on the side that corresponds to the start of the text, based on the current paragraph direction. If unset, the value is inherited from
    * the parent.
    */
  var indentStart: js.UndefOr[Dimension] = js.undefined
  
  /** Whether all lines of the paragraph should be laid out on the same page or column if possible. If unset, the value is inherited from the parent. */
  var keepLinesTogether: js.UndefOr[Boolean] = js.undefined
  
  /** Whether at least a part of this paragraph should be laid out on the same page or column as the next paragraph if possible. If unset, the value is inherited from the parent. */
  var keepWithNext: js.UndefOr[Boolean] = js.undefined
  
  /** The amount of space between lines, as a percentage of normal, where normal is represented as 100.0. If unset, the value is inherited from the parent. */
  var lineSpacing: js.UndefOr[Double] = js.undefined
  
  /**
    * The named style type of the paragraph. Since updating the named style type affects other properties within ParagraphStyle, the named style type is applied before the other
    * properties are updated.
    */
  var namedStyleType: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the current paragraph should always start at the beginning of a page. If unset, the value is inherited from the parent. Attempting to update page_break_before for paragraphs
    * in unsupported regions, including Table, Header, Footer and Footnote, can result in an invalid document state which returns a 400 bad request error.
    */
  var pageBreakBefore: js.UndefOr[Boolean] = js.undefined
  
  /** The shading of the paragraph. If unset, the value is inherited from the parent. */
  var shading: js.UndefOr[Shading] = js.undefined
  
  /** The amount of extra space above the paragraph. If unset, the value is inherited from the parent. */
  var spaceAbove: js.UndefOr[Dimension] = js.undefined
  
  /** The amount of extra space below the paragraph. If unset, the value is inherited from the parent. */
  var spaceBelow: js.UndefOr[Dimension] = js.undefined
  
  /** The spacing mode for the paragraph. */
  var spacingMode: js.UndefOr[String] = js.undefined
  
  /** A list of the tab stops for this paragraph. The list of tab stops is not inherited. This property is read-only. */
  var tabStops: js.UndefOr[js.Array[TabStop]] = js.undefined
}
object ParagraphStyle {
  
  inline def apply(): ParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphStyle]
  }
  
  extension [Self <: ParagraphStyle](x: Self) {
    
    inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setAvoidWidowAndOrphan(value: Boolean): Self = StObject.set(x, "avoidWidowAndOrphan", value.asInstanceOf[js.Any])
    
    inline def setAvoidWidowAndOrphanUndefined: Self = StObject.set(x, "avoidWidowAndOrphan", js.undefined)
    
    inline def setBorderBetween(value: ParagraphBorder): Self = StObject.set(x, "borderBetween", value.asInstanceOf[js.Any])
    
    inline def setBorderBetweenUndefined: Self = StObject.set(x, "borderBetween", js.undefined)
    
    inline def setBorderBottom(value: ParagraphBorder): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
    
    inline def setBorderLeft(value: ParagraphBorder): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
    
    inline def setBorderRight(value: ParagraphBorder): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
    
    inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
    
    inline def setBorderTop(value: ParagraphBorder): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
    
    inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setHeadingId(value: String): Self = StObject.set(x, "headingId", value.asInstanceOf[js.Any])
    
    inline def setHeadingIdUndefined: Self = StObject.set(x, "headingId", js.undefined)
    
    inline def setIndentEnd(value: Dimension): Self = StObject.set(x, "indentEnd", value.asInstanceOf[js.Any])
    
    inline def setIndentEndUndefined: Self = StObject.set(x, "indentEnd", js.undefined)
    
    inline def setIndentFirstLine(value: Dimension): Self = StObject.set(x, "indentFirstLine", value.asInstanceOf[js.Any])
    
    inline def setIndentFirstLineUndefined: Self = StObject.set(x, "indentFirstLine", js.undefined)
    
    inline def setIndentStart(value: Dimension): Self = StObject.set(x, "indentStart", value.asInstanceOf[js.Any])
    
    inline def setIndentStartUndefined: Self = StObject.set(x, "indentStart", js.undefined)
    
    inline def setKeepLinesTogether(value: Boolean): Self = StObject.set(x, "keepLinesTogether", value.asInstanceOf[js.Any])
    
    inline def setKeepLinesTogetherUndefined: Self = StObject.set(x, "keepLinesTogether", js.undefined)
    
    inline def setKeepWithNext(value: Boolean): Self = StObject.set(x, "keepWithNext", value.asInstanceOf[js.Any])
    
    inline def setKeepWithNextUndefined: Self = StObject.set(x, "keepWithNext", js.undefined)
    
    inline def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineSpacingUndefined: Self = StObject.set(x, "lineSpacing", js.undefined)
    
    inline def setNamedStyleType(value: String): Self = StObject.set(x, "namedStyleType", value.asInstanceOf[js.Any])
    
    inline def setNamedStyleTypeUndefined: Self = StObject.set(x, "namedStyleType", js.undefined)
    
    inline def setPageBreakBefore(value: Boolean): Self = StObject.set(x, "pageBreakBefore", value.asInstanceOf[js.Any])
    
    inline def setPageBreakBeforeUndefined: Self = StObject.set(x, "pageBreakBefore", js.undefined)
    
    inline def setShading(value: Shading): Self = StObject.set(x, "shading", value.asInstanceOf[js.Any])
    
    inline def setShadingUndefined: Self = StObject.set(x, "shading", js.undefined)
    
    inline def setSpaceAbove(value: Dimension): Self = StObject.set(x, "spaceAbove", value.asInstanceOf[js.Any])
    
    inline def setSpaceAboveUndefined: Self = StObject.set(x, "spaceAbove", js.undefined)
    
    inline def setSpaceBelow(value: Dimension): Self = StObject.set(x, "spaceBelow", value.asInstanceOf[js.Any])
    
    inline def setSpaceBelowUndefined: Self = StObject.set(x, "spaceBelow", js.undefined)
    
    inline def setSpacingMode(value: String): Self = StObject.set(x, "spacingMode", value.asInstanceOf[js.Any])
    
    inline def setSpacingModeUndefined: Self = StObject.set(x, "spacingMode", js.undefined)
    
    inline def setTabStops(value: js.Array[TabStop]): Self = StObject.set(x, "tabStops", value.asInstanceOf[js.Any])
    
    inline def setTabStopsUndefined: Self = StObject.set(x, "tabStops", js.undefined)
    
    inline def setTabStopsVarargs(value: TabStop*): Self = StObject.set(x, "tabStops", js.Array(value*))
  }
}
