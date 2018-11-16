package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Limit extends js.Object {
  /** return the raw object instead of the Mongoose Model */
  var lean: js.UndefOr[scala.Boolean] = js.undefined
  /** The maximum number of results to return */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /** the maximum distance from the point near that a result can be */
  var maxDistance: scala.Double
  /** x,y point to search for */
  var near: js.Array[scala.Double]
}

