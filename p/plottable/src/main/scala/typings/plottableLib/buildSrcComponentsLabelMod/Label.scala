package typings
package plottableLib.buildSrcComponentsLabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components/label", "Label")
@js.native
class Label ()
  extends plottableLib.buildSrcComponentsComponentMod.Component {
  /**
       * A Label is a Component that displays a single line of text.
       *
       * @constructor
       * @param {string} [displayText=""] The text of the Label.
       * @param {number} [angle=0] The angle of the Label in degrees (-90/0/90). 0 is horizontal.
       */
  def this(displayText: java.lang.String) = this()
  /**
       * A Label is a Component that displays a single line of text.
       *
       * @constructor
       * @param {string} [displayText=""] The text of the Label.
       * @param {number} [angle=0] The angle of the Label in degrees (-90/0/90). 0 is horizontal.
       */
  def this(displayText: java.lang.String, angle: scala.Double) = this()
  var _angle: scala.Double = js.native
  var _measurer: typesettableLib.typesettableMod.CacheMeasurer = js.native
  var _padding: scala.Double = js.native
  var _text: java.lang.String = js.native
  var _textContainer: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[scala.Unit] = js.native
  var _wrapper: typesettableLib.typesettableMod.Wrapper = js.native
  var _writer: typesettableLib.typesettableMod.Writer = js.native
  /**
       * Gets the angle of the Label in degrees.
       */
  def angle(): scala.Double = js.native
  /**
       * Sets the angle of the Label in degrees.
       *
       * @param {number} angle One of -90/0/90. 0 is horizontal.
       * @returns {Label} The calling Label.
       */
  def angle(angle: scala.Double): this.type = js.native
  /**
       * Gets the amount of padding around the Label in pixels.
       */
  def padding(): scala.Double = js.native
  /**
       * Sets the amount of padding around the Label in pixels.
       *
       * @param {number} padAmount
       * @returns {Label} The calling Label.
       */
  def padding(padAmount: scala.Double): this.type = js.native
  /**
       * Gets the Label's text.
       */
  def text(): java.lang.String = js.native
  /**
       * Sets the Label's text.
       *
       * @param {string} displayText
       * @returns {Label} The calling Label.
       */
  def text(displayText: java.lang.String): this.type = js.native
}

