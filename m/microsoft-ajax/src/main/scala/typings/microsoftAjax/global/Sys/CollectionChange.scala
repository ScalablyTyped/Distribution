package typings.microsoftAjax.global.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a change in a collection.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393798(v=vs.100).aspx}
  */
@JSGlobal("Sys.CollectionChange")
@js.native
class CollectionChange protected ()
  extends typings.microsoftAjax.Sys.CollectionChange {
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
    newItems: js.Array[_],
    newStartingIndex: Double,
    oldItems: js.Array[_],
    oldStartingIndex: Double
  ) = this()
}
