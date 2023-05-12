package typings.photoshop

import typings.photoshop.domConstantsMod.Justification
import typings.photoshop.domConstantsMod.KashidaWidthType
import typings.photoshop.domConstantsMod.Kinsoku
import typings.photoshop.domConstantsMod.Mojikumi
import typings.photoshop.domConstantsMod.ParagraphLayout
import typings.photoshop.domConstantsMod.TypeInterfaceFeatures
import typings.photoshop.domTypesTextTypesMod.HyphenationProperties
import typings.photoshop.domTypesTextTypesMod.JustificationProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domTextParagraphStyleMod {
  
  @JSImport("photoshop/dom/text/ParagraphStyle", "ParagraphStyle")
  @js.native
  open class ParagraphStyle () extends StObject {
    
    /**
      * The paragraph UI features to display.
      * @default [DEFAULT](Constants.TypeInterfaceFeatures)
      * @minVersion 24.1
      */
    def features: TypeInterfaceFeatures = js.native
    def features_=(features: TypeInterfaceFeatures): Unit = js.native
    
    /**
      * The amount of space in pixels to indent the first line of paragraphs for a 72ppi document.
      * @range -1296..1296
      * @minVersion 24.1
      */
    def firstLineIndent: Double = js.native
    def firstLineIndent_=(firstLineIndent: Double): Unit = js.native
    
    /**
      * True to use hyphenation in word wrap.
      * Use hyphenationFeatures for maximum control.
      * @default false
      * @minVersion 24.1
      */
    def hyphenation: Boolean = js.native
    
    /**
      * The property values used to calculate hyphenation.
      *
      * @minVersion 24.1
      */
    def hyphenationFeatures: HyphenationProperties = js.native
    def hyphenationFeatures_=(features: HyphenationProperties): Unit = js.native
    
    def hyphenation_=(hyphenation: Boolean): Unit = js.native
    
    /**
      * The paragraph justification.
      * @default [LEFT](Constants.Justification)
      * @minVersion 24.1
      */
    def justification: Justification = js.native
    
    /**
      * The property values used to calculate justification.
      *
      * @minVersion 24.1
      */
    def justificationFeatures: JustificationProperties = js.native
    def justificationFeatures_=(features: JustificationProperties): Unit = js.native
    
    def justification_=(justification: Justification): Unit = js.native
    
    /**
      * The width of kashida (tatweel) character
      * @default [MEDIUM](Constants.KashidaWidthType)
      * @minVersion 24.1
      */
    def kashidaWidth: KashidaWidthType = js.native
    def kashidaWidth_=(kashidaWidth: KashidaWidthType): Unit = js.native
    
    /**
      * Line breaking rules in Japanese text (Kinsoku Shori)
      * @default [NONE](Constants.Kinsoku)
      * @minVersion 24.1
      */
    def kinsoku: Kinsoku = js.native
    def kinsoku_=(kinsoku: Kinsoku): Unit = js.native
    
    /**
      * The paragraph layout mode.
      * @default [WORLD](Constants.ParagraphLayout)
      * @minVersion 24.1
      */
    def layoutMode: ParagraphLayout = js.native
    def layoutMode_=(paragraphLayout: ParagraphLayout): Unit = js.native
    
    /**
      * The amount of space in pixels to indent text from the left for a 72ppi document.
      * @range -1296..1296
      * @minVersion 24.1
      */
    def leftIndent: Double = js.native
    def leftIndent_=(leftIndent: Double): Unit = js.native
    
    /**
      * Spacing between punctuation, symbols, numbers, and other character classes
      * in Japanese text.
      * @default [NONE](Constants.Mojikumi)
      * @minVersion 24.1
      */
    def mojikumi: Mojikumi = js.native
    def mojikumi_=(mojikumi: Mojikumi): Unit = js.native
    
    /**
      * Resets the paragraph style to its default values.
      * @async
      * @minVersion 24.1
      */
    def reset(): js.Promise[Unit] = js.native
    
    /**
      * The amount of space in pixels to indent text from the right for a 72ppi document.
      * @range -1296..1296
      * @minVersion 24.1
      */
    def rightIndent: Double = js.native
    def rightIndent_=(rightIndent: Double): Unit = js.native
    
    /**
      * The amount of space in pixels to use after each paragraph for a 72ppi document.
      * @range -1296..1296
      * @minVersion 24.1
      */
    def spaceAfter: Double = js.native
    def spaceAfter_=(spaceAfter: Double): Unit = js.native
    
    /**
      * The amount of space in pixels to use before each paragraph for a 72ppi document.
      * @range -1296..1296
      * @minVersion 24.1
      */
    def spaceBefore: Double = js.native
    def spaceBefore_=(spaceBefore: Double): Unit = js.native
  }
}
