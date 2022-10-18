package typings.plottable

import typings.plottable.buildSrcComponentsLabelMod.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcComponentsWrappedLabelMod {
  
  @JSImport("plottable/build/src/components/wrappedLabel", "WrappedLabel")
  @js.native
  /**
    * A Label is a Component that displays a single line of text.
    *
    * @constructor
    * @param {string} [displayText=""] The text of the Label.
    * @param {number} [angle=0] The angle of the Label in degrees (-90/0/90). 0 is horizontal.
    */
  open class WrappedLabel () extends Label {
    def this(displayText: String) = this()
    def this(displayText: String, angle: Double) = this()
    def this(displayText: Unit, angle: Double) = this()
    
    /* protected */ var _maxLines: Double = js.native
    
    /**
      * Get the label max number of wrapped lines.
      */
    def maxLines(): Double = js.native
    /**
      * Set the label's max number of wrapped lines.
      * @param maxLines
      */
    def maxLines(maxLines: Double): this.type = js.native
  }
}
