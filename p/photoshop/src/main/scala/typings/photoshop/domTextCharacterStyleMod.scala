package typings.photoshop

import typings.photoshop.domConstantsMod.AntiAlias
import typings.photoshop.domConstantsMod.AutoKernType
import typings.photoshop.domConstantsMod.Baseline
import typings.photoshop.domConstantsMod.CharacterAlignment
import typings.photoshop.domConstantsMod.Language
import typings.photoshop.domConstantsMod.MiddleEasternDigitsType
import typings.photoshop.domConstantsMod.MiddleEasternTextDirection
import typings.photoshop.domConstantsMod.StrikeThrough
import typings.photoshop.domConstantsMod.TextCase
import typings.photoshop.domConstantsMod.Underline
import typings.photoshop.domObjectsSolidColorMod.SolidColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domTextCharacterStyleMod {
  
  @JSImport("photoshop/dom/text/CharacterStyle", "CharacterStyle")
  @js.native
  open class CharacterStyle () extends StObject {
    
    /**
      * Discretionary ligatures.
      * @default false
      * @minVersion 24.1
      */
    def alternateLigatures: Boolean = js.native
    def alternateLigatures_=(alternateLigatures: Boolean): Unit = js.native
    
    /**
      * The text anti-aliasing
      * @default SHARP
      * @minVersion 24.1
      */
    def antiAliasMethod: AntiAlias = js.native
    def antiAliasMethod_=(antiAliasMethod: AntiAlias): Unit = js.native
    
    /**
      * The auto kerning option to use.
      * @default METRICS
      * @minVersion 24.1
      */
    def autoKerning: AutoKernType = js.native
    def autoKerning_=(autoKerning: AutoKernType): Unit = js.native
    
    /**
      * The text baseline.
      * @default NORMAL
      * @minVersion 24.1
      */
    def baseline: Baseline = js.native
    
    /**
      * The value in pixels to use in the baseline offset of text for a 72ppi document.
      * @range -1296..1296
      * @minVersion 24.1
      */
    def baselineShift: Double = js.native
    def baselineShift_=(baselineShift: Double): Unit = js.native
    
    def baseline_=(baseline: Baseline): Unit = js.native
    
    /**
      * The text case.
      * @default NORMAL
      * @minVersion 24.1
      */
    def capitalization: TextCase = js.native
    def capitalization_=(capitalization: TextCase): Unit = js.native
    
    /**
      * Character alignment.
      * When a line of text contains different sizes of characters,
      * you can specify how to align text to the largest characters in the line.
      * @default ROMAN
      * @minVersion 24.1
      */
    def characterAlignment: CharacterAlignment = js.native
    def characterAlignment_=(characterAlignment: CharacterAlignment): Unit = js.native
    
    /**
      * The text color as a [[SolidColor]] instance.
      * @minVersion 24.1
      */
    def color: SolidColor = js.native
    def color_=(color: SolidColor): Unit = js.native
    
    /**
      * True to use Faux Bold.
      * Setting this to true is equivalent to selecting text and
      * clicking Faux Bold in the Character panel.
      * @default false
      * @minVersion 24.1
      */
    def fauxBold: Boolean = js.native
    def fauxBold_=(fauxBold: Boolean): Unit = js.native
    
    /**
      * True to use Faux Italic.
      * Setting this to true is equivalent to selecting text and
      * clicking Faux Italic in the Character panel.
      * @default false
      * @minVersion 24.1
      */
    def fauxItalic: Boolean = js.native
    def fauxItalic_=(fauxItalic: Boolean): Unit = js.native
    
    /**
      * The text face of the character, using the PostScript name of the font.
      * See [[TextFont]] and use the `postScriptName` property.
      * @minVersion 24.1
      */
    def font: String = js.native
    def font_=(font: String): Unit = js.native
    
    /**
      * Use fractional widths for the text.
      * @default false
      * @minVersion 24.1
      */
    def fractionalWidths: Boolean = js.native
    def fractionalWidths_=(value: Boolean): Unit = js.native
    
    /**
      * Fractions.
      * @default false
      * @minVersion 24.1
      */
    def fractions: Boolean = js.native
    def fractions_=(fractions: Boolean): Unit = js.native
    
    /**
      * Adjust the horizontal diacritic position for Middle Eastern languages.
      * @range -1000..1000
      * @minVersion 24.1
      */
    def horizontalDiacriticPosition: Double = js.native
    def horizontalDiacriticPosition_=(horizontalDiacriticPosition: Double): Unit = js.native
    
    /**
      * Character scaling (horizontal) in proportion to verticalScale,
      * as a percentage value.
      * @range 0..1000
      * @minVersion 24.1
      */
    def horizontalScale: Double = js.native
    def horizontalScale_=(horizontalScale: Double): Unit = js.native
    
    /**
      * Toggles kashidas in Middle Eastern languages.
      * @default true
      * @minVersion 24.1
      */
    def kashidas: Boolean = js.native
    def kashidas_=(kashidas: Boolean): Unit = js.native
    
    /**
      * Language used as a basis for hyphenation rules and spelling.
      * @minVersion 24.1
      */
    def language: Language = js.native
    def language_=(language: Language): Unit = js.native
    
    /**
      * The leading amount in pixels for a 72ppi document.
      * @default null
      * @range 0..4999.99
      * @minVersion 24.1
      */
    def leading: Double = js.native
    def leading_=(leading: Double): Unit = js.native
    
    /**
      * Standard ligatures (default: true).
      * @default true
      * @minVersion 24.1
      */
    def ligatures: Boolean = js.native
    def ligatures_=(ligatures: Boolean): Unit = js.native
    
    /**
      * The text digits type to use (Middle Eastern features)
      * @default LTRARABIC
      * @minVersion 24.1
      */
    def middleEasternDigitsType: MiddleEasternDigitsType = js.native
    def middleEasternDigitsType_=(middleEasternDigitsType: MiddleEasternDigitsType): Unit = js.native
    
    /**
      * The text direction (Middle Eastern features)
      * @default DEFAULT
      * @minVersion 24.1
      */
    def middleEasternTextDirection: MiddleEasternTextDirection = js.native
    def middleEasternTextDirection_=(middleEasternTextDirection: MiddleEasternTextDirection): Unit = js.native
    
    /**
      * True to disallow line breaks in this text.
      * @default false
      * @minVersion 24.1
      */
    def noBreak: Boolean = js.native
    def noBreak_=(noBreak: Boolean): Unit = js.native
    
    /**
      * Ordinals.
      * @default false
      * @minVersion 24.1
      */
    def ordinals: Boolean = js.native
    def ordinals_=(ordinals: Boolean): Unit = js.native
    
    /**
      * Resets the text styles of the Character panel to their default values.
      * @async
      * @minVersion 24.1
      */
    def reset(): js.Promise[Unit] = js.native
    
    /**
      * The font size in pixels for a 72ppi document.
      * @range 0.01..1296
      * @minVersion 24.1
      */
    def size: Double = js.native
    def size_=(size: Double): Unit = js.native
    
    /**
      * Whether the text is strikethrough or not.
      * @default STRIKEOFF
      * @minVersion 24.1
      */
    def strikeThrough: StrikeThrough = js.native
    def strikeThrough_=(strikeThrough: StrikeThrough): Unit = js.native
    
    /**
      * Stylistic Alternates
      * @default false
      * @minVersion 24.1
      */
    def stylisticAlternates: Boolean = js.native
    def stylisticAlternates_=(stylisticAlternates: Boolean): Unit = js.native
    
    /**
      * Swash.
      * @default false
      * @minVersion 24.1
      */
    def swash: Boolean = js.native
    def swash_=(swash: Boolean): Unit = js.native
    
    /**
      * Titling alternates.
      * @default false
      * @minVersion 24.1
      */
    def titlingAlternates: Boolean = js.native
    def titlingAlternates_=(titlingAlternates: Boolean): Unit = js.native
    
    /**
      * The amount of uniform spacing between multiple characters.
      * Tracking units are 1/1000 of an em space. The width of an em space is relative
      * to the current type size. In a 1-point font, 1 em equals 1 point; in a 10-point font,
      * 1 em equals 10 points. So for example, 100 tracking units in a 10-point font are equivalent to 1 point
      * @range -1000..1000
      * @minVersion 24.1
      */
    def tracking: Double = js.native
    def tracking_=(tracking: Double): Unit = js.native
    
    /**
      * The underline style to use.
      * @default NONE
      * @minVersion 24.1
      */
    def underline: Underline = js.native
    def underline_=(underline: Underline): Unit = js.native
    
    /**
      * True to use a font's built-in leading information.
      * @minVersion 24.1
      */
    def useAutoLeading: Boolean = js.native
    def useAutoLeading_=(useAutoLeading: Boolean): Unit = js.native
    
    /**
      * Adjust the vertical diacritic position for Middle Eastern languages.
      * @range -1000..1000
      * @minVersion 24.1
      */
    def verticalDiacriticPosition: Double = js.native
    def verticalDiacriticPosition_=(verticalDiacriticPosition: Double): Unit = js.native
    
    /**
      * Character scaling (vertical) in proportion to horizontalScale,
      * as a percentage value.
      * @range 0..1000
      * @minVersion 24.1
      */
    def verticalScale: Double = js.native
    def verticalScale_=(verticalScale: Double): Unit = js.native
  }
}
