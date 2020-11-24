package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NestingLevelSuggestionState extends js.Object {
  
  /** Indicates if there was a suggested change to bullet_alignment. */
  var bulletAlignmentSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to glyph_format. */
  var glyphFormatSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to glyph_symbol. */
  var glyphSymbolSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to glyph_type. */
  var glyphTypeSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to indent_first_line. */
  var indentFirstLineSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to indent_start. */
  var indentStartSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to start_number. */
  var startNumberSuggested: js.UndefOr[Boolean] = js.native
  
  /** A mask that indicates which of the fields in text style have been changed in this suggestion. */
  var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.native
}
object NestingLevelSuggestionState {
  
  @scala.inline
  def apply(): NestingLevelSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestingLevelSuggestionState]
  }
  
  @scala.inline
  implicit class NestingLevelSuggestionStateOps[Self <: NestingLevelSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBulletAlignmentSuggested(value: Boolean): Self = this.set("bulletAlignmentSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulletAlignmentSuggested: Self = this.set("bulletAlignmentSuggested", js.undefined)
    
    @scala.inline
    def setGlyphFormatSuggested(value: Boolean): Self = this.set("glyphFormatSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphFormatSuggested: Self = this.set("glyphFormatSuggested", js.undefined)
    
    @scala.inline
    def setGlyphSymbolSuggested(value: Boolean): Self = this.set("glyphSymbolSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphSymbolSuggested: Self = this.set("glyphSymbolSuggested", js.undefined)
    
    @scala.inline
    def setGlyphTypeSuggested(value: Boolean): Self = this.set("glyphTypeSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphTypeSuggested: Self = this.set("glyphTypeSuggested", js.undefined)
    
    @scala.inline
    def setIndentFirstLineSuggested(value: Boolean): Self = this.set("indentFirstLineSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentFirstLineSuggested: Self = this.set("indentFirstLineSuggested", js.undefined)
    
    @scala.inline
    def setIndentStartSuggested(value: Boolean): Self = this.set("indentStartSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentStartSuggested: Self = this.set("indentStartSuggested", js.undefined)
    
    @scala.inline
    def setStartNumberSuggested(value: Boolean): Self = this.set("startNumberSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartNumberSuggested: Self = this.set("startNumberSuggested", js.undefined)
    
    @scala.inline
    def setTextStyleSuggestionState(value: TextStyleSuggestionState): Self = this.set("textStyleSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyleSuggestionState: Self = this.set("textStyleSuggestionState", js.undefined)
  }
}
