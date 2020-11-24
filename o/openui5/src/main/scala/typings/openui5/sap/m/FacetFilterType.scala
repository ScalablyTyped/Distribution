package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FacetFilterType extends js.Object
/**
  * Used by the FacetFilter control to adapt its design according to type.
  */
@JSGlobal("sap.m.FacetFilterType")
@js.native
object FacetFilterType extends js.Object {
  
  @js.native
  sealed trait Light extends FacetFilterType
  
  @js.native
  sealed trait Simple extends FacetFilterType
}
