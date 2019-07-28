package typings.paper.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * controls what value newly created items have their item.applyMatrix property set to (Note that not all items can set this to false) — default: true
    */
  var applyMatrix: Boolean
  /**
    * the size of the curve handles when drawing selections — default: 4
    */
  var handleSize: Double
  /*
    * the default tolerance for hit- tests, when no value is specified — default: 0
    */
  var hitTolerance: Double
  /**
    * controls whether newly created items are automatically inserted into the scene graph, by adding them to project.activeLayer — default: true
    */
  var insertItems: Boolean
}

object Settings {
  @scala.inline
  def apply(applyMatrix: Boolean, handleSize: Double, hitTolerance: Double, insertItems: Boolean): Settings = {
    val __obj = js.Dynamic.literal(applyMatrix = applyMatrix, handleSize = handleSize, hitTolerance = hitTolerance, insertItems = insertItems)
  
    __obj.asInstanceOf[Settings]
  }
}

