package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AccessibleLandmarkRole extends js.Object

/**
  * Defines the accessible landmark roles for ARIA support. This enumeration is used with the
  * AccessibleRole control property.For more information, goto "Roles for Accessible Rich Internet
  * Applications (WAI-ARIA Roles)" at the www.w3.org homepage.
  */
@JSGlobal("sap.ui.core.AccessibleLandmarkRole")
@js.native
object AccessibleLandmarkRole extends js.Object {
  @js.native
  sealed trait Banner extends AccessibleLandmarkRole
  
  @js.native
  sealed trait Complementary extends AccessibleLandmarkRole
  
  @js.native
  sealed trait Main extends AccessibleLandmarkRole
  
  @js.native
  sealed trait Navigation extends AccessibleLandmarkRole
  
  @js.native
  sealed trait None extends AccessibleLandmarkRole
  
  @js.native
  sealed trait Region extends AccessibleLandmarkRole
  
  @js.native
  sealed trait Search extends AccessibleLandmarkRole
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AccessibleLandmarkRole with Double] = js.native
  /* 0 */ @js.native
  object Banner extends TopLevel[Banner with Double]
  
  /* 1 */ @js.native
  object Complementary extends TopLevel[Complementary with Double]
  
  /* 2 */ @js.native
  object Main extends TopLevel[Main with Double]
  
  /* 3 */ @js.native
  object Navigation extends TopLevel[Navigation with Double]
  
  /* 4 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 5 */ @js.native
  object Region extends TopLevel[Region with Double]
  
  /* 6 */ @js.native
  object Search extends TopLevel[Search with Double]
  
}

