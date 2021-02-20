package typings.openui5.global.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enumeration of possible load statuses.
  */
@JSGlobal("sap.m.LoadState")
@js.native
object LoadState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.openui5.sap.m.LoadState with Double] = js.native
  
  /* 0 */ val Disabled: typings.openui5.sap.m.LoadState.Disabled with Double = js.native
  
  /* 1 */ val Failed: typings.openui5.sap.m.LoadState.Failed with Double = js.native
  
  /* 2 */ val Loaded: typings.openui5.sap.m.LoadState.Loaded with Double = js.native
  
  /* 3 */ val Loading: typings.openui5.sap.m.LoadState.Loading with Double = js.native
}
