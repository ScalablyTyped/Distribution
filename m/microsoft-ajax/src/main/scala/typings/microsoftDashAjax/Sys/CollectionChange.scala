package typings.microsoftDashAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a change in a collection.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393798(v=vs.100).aspx}
  */
@JSGlobal("Sys.CollectionChange")
@js.native
class CollectionChange protected () extends js.Object {
  //#region Constructors
  /**
    * Creates a CollectionChange object based on the supplied parameters.
    * @param action
    *           A NotifyCollectionChangedAction enumeration value.
    * @param newItems
    *           (Optional) The items that were added when the action is add or replace.
    * @param newStartingIndex
    *           (Optional) An integer that represents the index where new items have been inserted.
    * @param oldItems
    *           (Optional) The items that were removed when the action is remove or replace.
    *  @param oldStartingIndex
    *           (Optional) An integer that represents the index where old items have been removed.
    */
  def this(
    action: NotifyCollectionChangedAction,
    newItems: js.Array[_],
    newStartingIndex: Double,
    oldItems: js.Array[_],
    oldStartingIndex: Double
  ) = this()
  //#endregion
  //#region Fields
  /**
    * Gets a NotifyCollectionChangedAction object that contains the change action enumeration value.
    * @return A NotifyCollectionChangedAction object.
    */
  var action: NotifyCollectionChangedAction = js.native
  /**
    * @return An array of items that were added.
    */
  var newItems: js.Array[_] = js.native
  /**
    * The index where new items have been inserted.
    * @return An integer that represents the index where new items have been inserted.
    */
  var newStartingIndex: Double = js.native
  /**
    * The items that were removed when the NotifyCollectionChangedAction object is set to remove.
    * @return An array containing the items that were removed.
    */
  var oldItems: js.Array[_] = js.native
  /**
    * Gets the index where old items have been removed.
    * @return An integer that represents the index where old items have been removed.
    */
  var oldStartingIndex: Double = js.native
}

