package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object objectDotOmitLib {
  type Omit[GType, GKeys /* <: java.lang.String */] = stdLib.Pick[GType, stdLib.Exclude[java.lang.String, GKeys]]
}
