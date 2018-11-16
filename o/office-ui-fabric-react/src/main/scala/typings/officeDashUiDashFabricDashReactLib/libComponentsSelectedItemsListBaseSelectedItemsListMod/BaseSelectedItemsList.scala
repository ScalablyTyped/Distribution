package typings
package officeDashUiDashFabricDashReactLib.libComponentsSelectedItemsListBaseSelectedItemsListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/BaseSelectedItemsList", "BaseSelectedItemsList")
@js.native
class BaseSelectedItemsList[T, P /* <: officeDashUiDashFabricDashReactLib.libComponentsSelectedItemsListBaseSelectedItemsListDotTypesMod.IBaseSelectedItemsListProps[T] */] protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[P, IBaseSelectedItemsListState]
     with officeDashUiDashFabricDashReactLib.libComponentsSelectedItemsListBaseSelectedItemsListDotTypesMod.IBaseSelectedItemsList[T] {
  def this(basePickerProps: P) = this()
  /** Gets the current value of the input. */
  /* CompleteClass */
  override var items: js.UndefOr[js.Array[T]] = js.native
  @JSName("items")
  val items_BaseSelectedItemsList: js.Array[T] = js.native
  var root: reactLib.HTMLElement = js.native
  var selection: officeDashUiDashFabricDashReactLib.libSelectionMod.Selection = js.native
  /* private */ def _canRemoveItem(item: js.Any): js.Any = js.native
  /* private */ def _onSelectedItemsUpdated(): js.Any = js.native
  /* private */ def _onSelectedItemsUpdated(items: js.Any): js.Any = js.native
  /* private */ def _onSelectedItemsUpdated(items: js.Any, focusIndex: js.Any): js.Any = js.native
  /* CompleteClass */
  override def addItems(items: js.Array[T]): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBaseSelectedItemsList(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MBaseSelectedItemsList(newProps: P): scala.Unit = js.native
  @JSName("componentWillUpdate")
  def componentWillUpdate_MBaseSelectedItemsList(newProps: P, newState: IBaseSelectedItemsListState): scala.Unit = js.native
  /* protected */ def copyItems(items: js.Array[T]): scala.Unit = js.native
  def hasSelectedItems(): scala.Boolean = js.native
  def highlightedItems(): js.Array[T] = js.native
  /* protected */ def onChange(): scala.Unit = js.native
  /* protected */ def onChange(items: js.Array[T]): scala.Unit = js.native
  def onCopy(ev: reactLib.reactMod.ReactNs.ClipboardEvent[reactLib.HTMLElement]): scala.Unit = js.native
  /* protected */ def onItemChange(changedItem: T, index: scala.Double): scala.Unit = js.native
  /* protected */ def onSelectionChanged(): scala.Unit = js.native
  def removeItem(
    item: officeDashUiDashFabricDashReactLib.libComponentsSelectedItemsListBaseSelectedItemsListDotTypesMod.ISelectedItemProps[T]
  ): scala.Unit = js.native
  def removeItemAt(index: scala.Double): scala.Unit = js.native
  def removeItems(itemsToRemove: js.Array[_]): scala.Unit = js.native
  def removeSelectedItems(): scala.Unit = js.native
  /* protected */ def renderItems(): js.Array[reactLib.reactMod.Global.JSXNs.Element] = js.native
  def unselectAll(): scala.Unit = js.native
  /**
       * Controls what happens whenever there is an action that impacts the selected items.
       * If selectedItems is provided as a property then this will act as a controlled component and it will not update it's own state.
       */
  def updateItems(items: js.Array[T]): scala.Unit = js.native
  /**
       * Controls what happens whenever there is an action that impacts the selected items.
       * If selectedItems is provided as a property then this will act as a controlled component and it will not update it's own state.
       */
  def updateItems(items: js.Array[T], focusIndex: scala.Double): scala.Unit = js.native
}

