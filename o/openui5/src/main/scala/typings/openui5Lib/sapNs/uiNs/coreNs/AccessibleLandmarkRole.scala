package typings
package openui5Lib.sapNs.uiNs.coreNs

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
  sealed trait Banner
    extends openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole
  
  @js.native
  sealed trait Complementary
    extends openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole
  
  @js.native
  sealed trait Main
    extends openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole
  
  @js.native
  sealed trait Navigation
    extends openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole
  
  @js.native
  sealed trait None
    extends openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole
  
  @js.native
  sealed trait Region
    extends openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole
  
  @js.native
  sealed trait Search
    extends openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole
  
  /* 0 */ val Banner: Banner with scala.Double = js.native
  /* 1 */ val Complementary: Complementary with scala.Double = js.native
  /* 2 */ val Main: Main with scala.Double = js.native
  /* 3 */ val Navigation: Navigation with scala.Double = js.native
  /* 4 */ val None: None with scala.Double = js.native
  /* 5 */ val Region: Region with scala.Double = js.native
  /* 6 */ val Search: Search with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole with scala.Double] = js.native
}

