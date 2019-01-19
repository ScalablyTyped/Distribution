package typings
package paperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplyMatrix extends js.Object {
  /**
    * controls what value newly created items have their item.applyMatrix property set to (Note that not all items can set this to false) — default: true
    */
  var applyMatrix: scala.Boolean
  /**
    * the size of the curve handles when drawing selections — default: 4
    */
  var handleSize: scala.Double
  /*
    * the default tolerance for hit- tests, when no value is specified — default: 0
    */
  var hitTolerance: scala.Double
  /**
    * controls whether newly created items are automatically inserted into the scene graph, by adding them to project.activeLayer — default: true
    */
  var insertItems: scala.Boolean
}

