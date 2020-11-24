package typings.officeUiFabricReact.detailsListMod

import typings.uifabricUtilities.selectionSelectionMod.ISelectionOptions
import typings.uifabricUtilities.selectionSelectionMod.ISelectionOptionsWithRequiredGetKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/DetailsList", "Selection")
@js.native
class Selection[TItem] protected ()
  extends typings.officeUiFabricReact.selectionMod.Selection[TItem] {
  /**
    * Create a new Selection. If `TItem` does not have a `key` property, you must provide an options
    * object with a `getKey` implementation. Providing options is optional otherwise.
    * (At most one `options` object is accepted.)
    */
  def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type TItem extends IObjectWithKey ? [] | [ISelectionOptions<TItem>] : [ISelectionOptionsWithRequiredGetKey<TItem>] is not an array type */ options: js.Array[js.Any | ISelectionOptions[TItem] | ISelectionOptionsWithRequiredGetKey[TItem]]) = this()
}
