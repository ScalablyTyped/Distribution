package typings
package pDashMapLib.pDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pMapNs {
  /**
  	Function which is called for every item in `input`. Expected to return a `Promise` or value.
  	@param input - Iterated element.
  	@param index - Index of the element in the source array.
  	*/
  type Mapper[Element, NewElement] = js.Function2[/* input */ Element, /* index */ scala.Double, NewElement | js.Promise[NewElement]]
}
