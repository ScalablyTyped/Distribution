package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a change in a collection.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393798(v=vs.100).aspx}
  */
trait CollectionChange extends js.Object {
  //#endregion
  //#region Fields
  /**
    * Gets a NotifyCollectionChangedAction object that contains the change action enumeration value.
    * @return A NotifyCollectionChangedAction object.
    */
  var action: NotifyCollectionChangedAction
  /**
    * @return An array of items that were added.
    */
  var newItems: js.Array[_]
  /**
    * The index where new items have been inserted.
    * @return An integer that represents the index where new items have been inserted.
    */
  var newStartingIndex: Double
  /**
    * The items that were removed when the NotifyCollectionChangedAction object is set to remove.
    * @return An array containing the items that were removed.
    */
  var oldItems: js.Array[_]
  /**
    * Gets the index where old items have been removed.
    * @return An integer that represents the index where old items have been removed.
    */
  var oldStartingIndex: Double
}

object CollectionChange {
  @scala.inline
  def apply(
    action: NotifyCollectionChangedAction,
    newItems: js.Array[_],
    newStartingIndex: Double,
    oldItems: js.Array[_],
    oldStartingIndex: Double
  ): CollectionChange = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], newItems = newItems.asInstanceOf[js.Any], newStartingIndex = newStartingIndex.asInstanceOf[js.Any], oldItems = oldItems.asInstanceOf[js.Any], oldStartingIndex = oldStartingIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionChange]
  }
}

