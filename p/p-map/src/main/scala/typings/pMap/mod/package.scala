package typings.pMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
  	Function which is called for every item in `input`. Expected to return a `Promise` or value.
  	@param element - Iterated element.
  	@param index - Index of the element in the source array.
  	*/
  type Mapper[Element, NewElement] = js.Function2[/* element */ Element, /* index */ scala.Double, NewElement | js.Promise[NewElement]]
}
