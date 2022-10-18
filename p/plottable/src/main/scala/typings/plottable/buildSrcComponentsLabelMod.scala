package typings.plottable

import typings.plottable.buildSrcComponentsComponentMod.Component
import typings.plottable.buildSrcCoreInterfacesMod.SimpleSelection
import typings.typesettable.mod.CacheMeasurer
import typings.typesettable.mod.Wrapper
import typings.typesettable.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcComponentsLabelMod {
  
  @JSImport("plottable/build/src/components/label", "AxisLabel")
  @js.native
  /**
    * @constructor
    * @param {string} [text]
    * @param {number} [angle] One of -90/0/90. 0 is horizontal.
    */
  open class AxisLabel () extends Label {
    def this(text: String) = this()
    def this(text: String, angle: Double) = this()
    def this(text: Unit, angle: Double) = this()
  }
  /* static members */
  object AxisLabel {
    
    @JSImport("plottable/build/src/components/label", "AxisLabel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/components/label", "AxisLabel.AXIS_LABEL_CLASS")
    @js.native
    def AXIS_LABEL_CLASS: String = js.native
    inline def AXIS_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AXIS_LABEL_CLASS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/components/label", "Label")
  @js.native
  /**
    * A Label is a Component that displays a single line of text.
    *
    * @constructor
    * @param {string} [displayText=""] The text of the Label.
    * @param {number} [angle=0] The angle of the Label in degrees (-90/0/90). 0 is horizontal.
    */
  open class Label () extends Component {
    def this(displayText: String) = this()
    def this(displayText: String, angle: Double) = this()
    def this(displayText: Unit, angle: Double) = this()
    
    /* protected */ var _angle: Double = js.native
    
    /* protected */ var _measurer: CacheMeasurer = js.native
    
    /* protected */ var _padding: Double = js.native
    
    /* protected */ var _text: String = js.native
    
    /* protected */ var _textContainer: SimpleSelection[Unit] = js.native
    
    /* protected */ var _wrapper: Wrapper = js.native
    
    /* protected */ var _writer: Writer = js.native
    
    /**
      * Gets the angle of the Label in degrees.
      */
    def angle(): Double = js.native
    /**
      * Sets the angle of the Label in degrees.
      *
      * @param {number} angle One of -90/0/90. 0 is horizontal.
      * @returns {Label} The calling Label.
      */
    def angle(angle: Double): this.type = js.native
    
    /**
      * Gets the amount of padding around the Label in pixels.
      */
    def padding(): Double = js.native
    /**
      * Sets the amount of padding around the Label in pixels.
      *
      * @param {number} padAmount
      * @returns {Label} The calling Label.
      */
    def padding(padAmount: Double): this.type = js.native
    
    /**
      * Gets the Label's text.
      */
    def text(): String = js.native
    /**
      * Sets the Label's text.
      *
      * @param {string} displayText
      * @returns {Label} The calling Label.
      */
    def text(displayText: String): this.type = js.native
  }
  /* static members */
  object Label {
    
    @JSImport("plottable/build/src/components/label", "Label")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/components/label", "Label._DEFAULT_FONT_SIZE_PX")
    @js.native
    def _DEFAULT_FONT_SIZE_PX: LabelFontSizePx = js.native
    inline def _DEFAULT_FONT_SIZE_PX_=(x: LabelFontSizePx): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_FONT_SIZE_PX")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/components/label", "Label._MAX_FONT_SIZE_PX")
    @js.native
    def _MAX_FONT_SIZE_PX: LabelFontSizePx = js.native
    inline def _MAX_FONT_SIZE_PX_=(x: LabelFontSizePx): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAX_FONT_SIZE_PX")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/components/label", "Label._MIN_FONT_SIZE_PX")
    @js.native
    def _MIN_FONT_SIZE_PX: LabelFontSizePx = js.native
    inline def _MIN_FONT_SIZE_PX_=(x: LabelFontSizePx): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MIN_FONT_SIZE_PX")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/components/label", "TitleLabel")
  @js.native
  /**
    * @constructor
    * @param {string} [text]
    * @param {number} [angle] One of -90/0/90. 0 is horizontal.
    */
  open class TitleLabel () extends Label {
    def this(text: String) = this()
    def this(text: String, angle: Double) = this()
    def this(text: Unit, angle: Double) = this()
  }
  /* static members */
  object TitleLabel {
    
    @JSImport("plottable/build/src/components/label", "TitleLabel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/components/label", "TitleLabel.TITLE_LABEL_CLASS")
    @js.native
    def TITLE_LABEL_CLASS: String = js.native
    inline def TITLE_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TITLE_LABEL_CLASS")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.plottable.plottableInts.`12`
    - typings.plottable.plottableInts.`13`
    - typings.plottable.plottableInts.`14`
    - typings.plottable.plottableInts.`15`
    - typings.plottable.plottableInts.`16`
    - typings.plottable.plottableInts.`17`
    - typings.plottable.plottableInts.`18`
    - typings.plottable.plottableInts.`19`
    - typings.plottable.plottableInts.`20`
    - typings.plottable.plottableInts.`21`
    - typings.plottable.plottableInts.`22`
    - typings.plottable.plottableInts.`23`
    - typings.plottable.plottableInts.`24`
  */
  trait LabelFontSizePx extends StObject
  object LabelFontSizePx {
    
    inline def `12`: typings.plottable.plottableInts.`12` = 12.asInstanceOf[typings.plottable.plottableInts.`12`]
    
    inline def `13`: typings.plottable.plottableInts.`13` = 13.asInstanceOf[typings.plottable.plottableInts.`13`]
    
    inline def `14`: typings.plottable.plottableInts.`14` = 14.asInstanceOf[typings.plottable.plottableInts.`14`]
    
    inline def `15`: typings.plottable.plottableInts.`15` = 15.asInstanceOf[typings.plottable.plottableInts.`15`]
    
    inline def `16`: typings.plottable.plottableInts.`16` = 16.asInstanceOf[typings.plottable.plottableInts.`16`]
    
    inline def `17`: typings.plottable.plottableInts.`17` = 17.asInstanceOf[typings.plottable.plottableInts.`17`]
    
    inline def `18`: typings.plottable.plottableInts.`18` = 18.asInstanceOf[typings.plottable.plottableInts.`18`]
    
    inline def `19`: typings.plottable.plottableInts.`19` = 19.asInstanceOf[typings.plottable.plottableInts.`19`]
    
    inline def `20`: typings.plottable.plottableInts.`20` = 20.asInstanceOf[typings.plottable.plottableInts.`20`]
    
    inline def `21`: typings.plottable.plottableInts.`21` = 21.asInstanceOf[typings.plottable.plottableInts.`21`]
    
    inline def `22`: typings.plottable.plottableInts.`22` = 22.asInstanceOf[typings.plottable.plottableInts.`22`]
    
    inline def `23`: typings.plottable.plottableInts.`23` = 23.asInstanceOf[typings.plottable.plottableInts.`23`]
    
    inline def `24`: typings.plottable.plottableInts.`24` = 24.asInstanceOf[typings.plottable.plottableInts.`24`]
  }
}
