package typings.microsoftAjax.global.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Enumerations
/**
  * Describes how a collection has changed.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393774(v=vs.100).aspx}
  */
@JSGlobal("Sys.NotifyCollectionChangedAction")
@js.native
object NotifyCollectionChangedAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.microsoftAjax.Sys.NotifyCollectionChangedAction & Double] = js.native
  
  /* 0 */ val add: typings.microsoftAjax.Sys.NotifyCollectionChangedAction.add & Double = js.native
  
  /* 1 */ val remove: typings.microsoftAjax.Sys.NotifyCollectionChangedAction.remove & Double = js.native
  
  /* 2 */ val reset: typings.microsoftAjax.Sys.NotifyCollectionChangedAction.reset & Double = js.native
}
