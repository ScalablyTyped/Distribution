package typings.plottable

import typings.plottable.buildSrcComponentsComponentMod.Component
import typings.plottable.buildSrcCoreInterfacesMod.SimpleSelection
import typings.typesettable.typesettableMod.CacheMeasurer
import typings.typesettable.typesettableMod.Wrapper
import typings.typesettable.typesettableMod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components/label", JSImport.Namespace)
@js.native
object buildSrcComponentsLabelMod extends js.Object {
  @js.native
  /**
    * @constructor
    * @param {string} [text]
    * @param {number} [angle] One of -90/0/90. 0 is horizontal.
    */
  class AxisLabel () extends Label {
    def this(text: String) = this()
    def this(text: String, angle: Double) = this()
  }
  
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
  
  @js.native
  /**
    * @constructor
    * @param {string} [text]
    * @param {number} [angle] One of -90/0/90. 0 is horizontal.
    */
  class TitleLabel () extends Label {
    def this(text: String) = this()
    def this(text: String, angle: Double) = this()
  }
  
  /* static members */
  @js.native
  object AxisLabel extends js.Object {
    var AXIS_LABEL_CLASS: String = js.native
  }
  
  /* static members */
  @js.native
  object TitleLabel extends js.Object {
    var TITLE_LABEL_CLASS: String = js.native
  }
  
}

