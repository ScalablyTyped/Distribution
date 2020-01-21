package typings.officeUiFabricReact.listTypesMod

import typings.officeUiFabricReact.officeUiFabricReactNumbers.`0`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`1`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`2`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.officeUiFabricReact.officeUiFabricReactNumbers.`0`
  - typings.officeUiFabricReact.officeUiFabricReactNumbers.`1`
  - typings.officeUiFabricReact.officeUiFabricReactNumbers.`2`
  - typings.officeUiFabricReact.officeUiFabricReactNumbers.`3`
*/
trait ScrollToMode extends js.Object

@JSImport("office-ui-fabric-react/lib/components/List/List.types", "ScrollToMode")
@js.native
object ScrollToMode extends js.Object {
  /**
    * Does not make any consideration to where in the viewport the item should align to.
    */
  var auto: `0` = js.native
  /**
    * Attempts to scroll the list so the bottom of the desired item is aligned with the bottom of the viewport.
    */
  var bottom: `2` = js.native
  /**
    * Attempts to scroll the list so the desired item is in the exact center of the viewport.
    */
  var center: `3` = js.native
  /**
    * Attempts to scroll the list so the top of the desired item is aligned with the top of the viewport.
    */
  var top: `1` = js.native
}

