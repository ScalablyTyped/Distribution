package typings.microsoftAjax.global.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a change in a collection.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393798(v=vs.100).aspx}
  */
@JSGlobal("Sys.CollectionChange")
@js.native
open class CollectionChange protected ()
  extends StObject
     with typings.microsoftAjax.Sys.CollectionChange {
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
    action: typings.microsoftAjax.Sys.NotifyCollectionChangedAction,
    newItems: js.Array[Any],
    newStartingIndex: Double,
    oldItems: js.Array[Any],
    oldStartingIndex: Double
  ) = this()
  
  //#endregion
  //#region Fields
  /**
    * Gets a NotifyCollectionChangedAction object that contains the change action enumeration value.
    * @return A NotifyCollectionChangedAction object.
    */
  /* CompleteClass */
  var action: typings.microsoftAjax.Sys.NotifyCollectionChangedAction = js.native
  
  /**
    * @return An array of items that were added.
    */
  /* CompleteClass */
  var newItems: js.Array[Any] = js.native
  
  /**
    * The index where new items have been inserted.
    * @return An integer that represents the index where new items have been inserted.
    */
  /* CompleteClass */
  var newStartingIndex: Double = js.native
  
  /**
    * The items that were removed when the NotifyCollectionChangedAction object is set to remove.
    * @return An array containing the items that were removed.
    */
  /* CompleteClass */
  var oldItems: js.Array[Any] = js.native
  
  /**
    * Gets the index where old items have been removed.
    * @return An integer that represents the index where old items have been removed.
    */
  /* CompleteClass */
  var oldStartingIndex: Double = js.native
}
