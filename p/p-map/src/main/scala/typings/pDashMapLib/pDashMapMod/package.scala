package typings
package pDashMapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashMapMod {
  type Mapper[Element, NewElement] = js.Function2[/* input */ Element, /* index */ scala.Double, NewElement | js.Promise[NewElement]]
}
