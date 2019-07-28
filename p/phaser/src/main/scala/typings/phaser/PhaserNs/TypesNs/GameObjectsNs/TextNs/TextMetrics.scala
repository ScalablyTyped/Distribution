package typings.phaser.PhaserNs.TypesNs.GameObjectsNs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Font metrics for a Text Style object.
  */
trait TextMetrics extends js.Object {
  /**
    * The ascent of the font.
    */
  var ascent: Double
  /**
    * The descent of the font.
    */
  var descent: Double
  /**
    * The size of the font.
    */
  var fontSize: Double
}

object TextMetrics {
  @scala.inline
  def apply(ascent: Double, descent: Double, fontSize: Double): TextMetrics = {
    val __obj = js.Dynamic.literal(ascent = ascent, descent = descent, fontSize = fontSize)
  
    __obj.asInstanceOf[TextMetrics]
  }
}

