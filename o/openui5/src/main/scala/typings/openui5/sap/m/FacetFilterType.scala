package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.FacetFilterType.Light
import typings.openui5.sap.m.FacetFilterType.Simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FacetFilterType with Double] = js.native
  /* 0 */ @js.native
  object Light extends TopLevel[Light with Double]
  
  /* 1 */ @js.native
  object Simple extends TopLevel[Simple with Double]
  
}

