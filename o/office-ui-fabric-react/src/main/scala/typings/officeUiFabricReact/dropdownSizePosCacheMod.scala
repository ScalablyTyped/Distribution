package typings.officeUiFabricReact

import typings.officeUiFabricReact.dropdownTypesMod.IDropdownOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Dropdown/utilities/DropdownSizePosCache", JSImport.Namespace)
@js.native
object dropdownSizePosCacheMod extends js.Object {
  @js.native
  class DropdownSizePosCache () extends js.Object {
    var _displayOnlyOptionsCache: js.Any = js.native
    var _size: js.Any = js.native
    /**
      * The size of all the selectable options.
      */
    val optionSetSize: Double = js.native
    /**
      * Returns the position of this option element relative to the full set of selectable option elements.
      * Note: the first selectable element is position 1 in the set.
      * @param index The raw index of the option element.
      */
    def positionInSet(): js.UndefOr[Double] = js.native
    def positionInSet(index: Double): js.UndefOr[Double] = js.native
    /**
      * Invalidates the cache and recalculate the size of selectable options.
      */
    def updateOptions(options: js.Array[IDropdownOption]): Unit = js.native
  }
  
}

