package typings.plottable

import typings.plottable.componentMod.Component
import typings.plottable.interfacesMod.SimpleSelection
import typings.typesettable.mod.CacheMeasurer
import typings.typesettable.mod.Wrapper
import typings.typesettable.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelMod {
  
  @JSImport("plottable/build/src/components/label", "AxisLabel")
  @js.native
  /**
    * @constructor
    * @param {string} [text]
    * @param {number} [angle] One of -90/0/90. 0 is horizontal.
    */
  class AxisLabel () extends Label {
    def this(text: String) = this()
    def this(text: js.UndefOr[scala.Nothing], angle: Double) = this()
    def this(text: String, angle: Double) = this()
  }
  /* static members */
  object AxisLabel {
    
    @JSImport("plottable/build/src/components/label", "AxisLabel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/components/label", "AxisLabel.AXIS_LABEL_CLASS")
    @js.native
    def AXIS_LABEL_CLASS: String = js.native
    @scala.inline
    def AXIS_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AXIS_LABEL_CLASS")(x.asInstanceOf[js.Any])
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
  class Label () extends Component {
    def this(displayText: String) = this()
    def this(displayText: js.UndefOr[scala.Nothing], angle: Double) = this()
    def this(displayText: String, angle: Double) = this()
    
    var _angle: Double = js.native
    
    var _measurer: CacheMeasurer = js.native
    
    var _padding: Double = js.native
    
    var _text: String = js.native
    
    var _textContainer: SimpleSelection[Unit] = js.native
    
    var _wrapper: Wrapper = js.native
    
    var _writer: Writer = js.native
    
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
  
  @JSImport("plottable/build/src/components/label", "TitleLabel")
  @js.native
  /**
    * @constructor
    * @param {string} [text]
    * @param {number} [angle] One of -90/0/90. 0 is horizontal.
    */
  class TitleLabel () extends Label {
    def this(text: String) = this()
    def this(text: js.UndefOr[scala.Nothing], angle: Double) = this()
    def this(text: String, angle: Double) = this()
  }
  /* static members */
  object TitleLabel {
    
    @JSImport("plottable/build/src/components/label", "TitleLabel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/components/label", "TitleLabel.TITLE_LABEL_CLASS")
    @js.native
    def TITLE_LABEL_CLASS: String = js.native
    @scala.inline
    def TITLE_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TITLE_LABEL_CLASS")(x.asInstanceOf[js.Any])
  }
}
