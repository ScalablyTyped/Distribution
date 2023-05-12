package typings.photoshop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domTypesTextTypesMod {
  
  trait HyphenationProperties extends StObject {
    
    /**
      * The minimum number of letters after which hyphenation
      * in word wrap is allowed.
      * @range 1..15
      * @default 2
      * @minVersion 24.1
      */
    var afterFirst: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum number of letters before which hyphenation
      * in word wrap is allowed.
      * @range 1..15
      * @default 2
      * @minVersion 24.1
      */
    var beforeLast: js.UndefOr[Double] = js.undefined
    
    /**
      * True to allow hyphenation in word wrap of capitalized words.
      * @default true
      * @minVersion 24.1
      */
    var capitalWords: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum number of consecutive lines that can end with a hyphenated word.
      * @range 2..25
      * @default 2
      * @minVersion 24.1
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum number of letters a word must have in order for hyphenation
      * in word wrap to be allowed.
      * @range 2..25
      * @default 5
      * @minVersion 24.1
      */
    var wordsLongerThan: js.UndefOr[Double] = js.undefined
    
    /**
      * The distance in pixels at the end of a line that will cause a word
      * to break in unjustified type.
      * @range 0..8640 for a 72PPI document
      * @default 36
      * @minVersion 24.1
      */
    var zone: js.UndefOr[Double] = js.undefined
  }
  object HyphenationProperties {
    
    inline def apply(): HyphenationProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HyphenationProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HyphenationProperties] (val x: Self) extends AnyVal {
      
      inline def setAfterFirst(value: Double): Self = StObject.set(x, "afterFirst", value.asInstanceOf[js.Any])
      
      inline def setAfterFirstUndefined: Self = StObject.set(x, "afterFirst", js.undefined)
      
      inline def setBeforeLast(value: Double): Self = StObject.set(x, "beforeLast", value.asInstanceOf[js.Any])
      
      inline def setBeforeLastUndefined: Self = StObject.set(x, "beforeLast", js.undefined)
      
      inline def setCapitalWords(value: Boolean): Self = StObject.set(x, "capitalWords", value.asInstanceOf[js.Any])
      
      inline def setCapitalWordsUndefined: Self = StObject.set(x, "capitalWords", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setWordsLongerThan(value: Double): Self = StObject.set(x, "wordsLongerThan", value.asInstanceOf[js.Any])
      
      inline def setWordsLongerThanUndefined: Self = StObject.set(x, "wordsLongerThan", js.undefined)
      
      inline def setZone(value: Double): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
      
      inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    }
  }
  
  trait JustificationProperties extends StObject {
    
    /**
      * Auto leading amount
      * @default 120
      * @range 0..500
      * @minVersion 24.1
      */
    var autoLeadingAmount: js.UndefOr[Double] = js.undefined
    
    /**
      * Desired glyph scaling - Must be between Minimum and Maximum or equal
      * @default 100
      * @range 50..200
      * @minVersion 24.1
      */
    var glyphScalingDesired: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum glyph scaling - Must be greater than or equal to Minimum.
      * @default 100
      * @range 50..200
      * @minVersion 24.1
      */
    var glyphScalingMaximum: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum glyph scaling - Must be less than or equal to Maximum.
      * @default 100
      * @range 50..200
      * @minVersion 24.1
      */
    var glyphScalingMinimum: js.UndefOr[Double] = js.undefined
    
    /**
      * Desired letter spacing - Must be between Minimum and Maximum or equal.
      * @default 0
      * @range 0..500
      * @minVersion 24.1
      */
    var letterSpacingDesired: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum letter spacing - Must be greater than or equal to Minimum.
      * @default 0
      * @range 0..500
      * @minVersion 24.1
      */
    var letterSpacingMaximum: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum letter spacing - Must be less than or equal to Maximum.
      * @default 0
      * @range 0..500
      * @minVersion 24.1
      */
    var letterSpacingMinimum: js.UndefOr[Double] = js.undefined
    
    /**
      * Desired word spacing - Must be between Minimum and Maximum or equal.
      * @default 100
      * @range 0..1000
      * @minVersion 24.1
      */
    var wordSpacingDesired: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum word spacing - Must be greater than or equal to Minimum.
      * @default 133
      * @range 0..1000
      * @minVersion 24.1
      */
    var wordSpacingMaximum: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum word spacing - Must be less than or equal to Maximum.
      * @default 80
      * @range 0..1000
      * @minVersion 24.1
      */
    var wordSpacingMinimum: js.UndefOr[Double] = js.undefined
  }
  object JustificationProperties {
    
    inline def apply(): JustificationProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JustificationProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JustificationProperties] (val x: Self) extends AnyVal {
      
      inline def setAutoLeadingAmount(value: Double): Self = StObject.set(x, "autoLeadingAmount", value.asInstanceOf[js.Any])
      
      inline def setAutoLeadingAmountUndefined: Self = StObject.set(x, "autoLeadingAmount", js.undefined)
      
      inline def setGlyphScalingDesired(value: Double): Self = StObject.set(x, "glyphScalingDesired", value.asInstanceOf[js.Any])
      
      inline def setGlyphScalingDesiredUndefined: Self = StObject.set(x, "glyphScalingDesired", js.undefined)
      
      inline def setGlyphScalingMaximum(value: Double): Self = StObject.set(x, "glyphScalingMaximum", value.asInstanceOf[js.Any])
      
      inline def setGlyphScalingMaximumUndefined: Self = StObject.set(x, "glyphScalingMaximum", js.undefined)
      
      inline def setGlyphScalingMinimum(value: Double): Self = StObject.set(x, "glyphScalingMinimum", value.asInstanceOf[js.Any])
      
      inline def setGlyphScalingMinimumUndefined: Self = StObject.set(x, "glyphScalingMinimum", js.undefined)
      
      inline def setLetterSpacingDesired(value: Double): Self = StObject.set(x, "letterSpacingDesired", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingDesiredUndefined: Self = StObject.set(x, "letterSpacingDesired", js.undefined)
      
      inline def setLetterSpacingMaximum(value: Double): Self = StObject.set(x, "letterSpacingMaximum", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingMaximumUndefined: Self = StObject.set(x, "letterSpacingMaximum", js.undefined)
      
      inline def setLetterSpacingMinimum(value: Double): Self = StObject.set(x, "letterSpacingMinimum", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingMinimumUndefined: Self = StObject.set(x, "letterSpacingMinimum", js.undefined)
      
      inline def setWordSpacingDesired(value: Double): Self = StObject.set(x, "wordSpacingDesired", value.asInstanceOf[js.Any])
      
      inline def setWordSpacingDesiredUndefined: Self = StObject.set(x, "wordSpacingDesired", js.undefined)
      
      inline def setWordSpacingMaximum(value: Double): Self = StObject.set(x, "wordSpacingMaximum", value.asInstanceOf[js.Any])
      
      inline def setWordSpacingMaximumUndefined: Self = StObject.set(x, "wordSpacingMaximum", js.undefined)
      
      inline def setWordSpacingMinimum(value: Double): Self = StObject.set(x, "wordSpacingMinimum", value.asInstanceOf[js.Any])
      
      inline def setWordSpacingMinimumUndefined: Self = StObject.set(x, "wordSpacingMinimum", js.undefined)
    }
  }
}
