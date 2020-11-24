package typings.microsoftAjax.global.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes how the collection was changed.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393665(v=vs.100).aspx}
  */
@JSGlobal("Sys.NotifyCollectionChangedEventArgs")
@js.native
class NotifyCollectionChangedEventArgs protected ()
  extends typings.microsoftAjax.Sys.NotifyCollectionChangedEventArgs {
  //#region Constructors
  /**
    * Initializes a new instance of the CancelEventArgs class.
    * @param changes
    *           A CollectionChange object that contains an array of changes that were performed on the collection since the last event.
    */
  def this(changes: typings.microsoftAjax.Sys.CollectionChange) = this()
}
