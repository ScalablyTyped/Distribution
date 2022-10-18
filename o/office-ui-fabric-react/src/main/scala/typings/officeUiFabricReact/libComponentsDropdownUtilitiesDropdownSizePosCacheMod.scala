package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsDropdownDropdownDottypesMod.IDropdownOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDropdownUtilitiesDropdownSizePosCacheMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Dropdown/utilities/DropdownSizePosCache", "DropdownSizePosCache")
  @js.native
  open class DropdownSizePosCache () extends StObject {
    
    /* private */ var _cachedOptions: Any = js.native
    
    /* private */ var _displayOnlyOptionsCache: Any = js.native
    
    /* private */ var _size: Any = js.native
    
    /**
      * The chached options array.
      */
    val cachedOptions: js.Array[IDropdownOption] = js.native
    
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
