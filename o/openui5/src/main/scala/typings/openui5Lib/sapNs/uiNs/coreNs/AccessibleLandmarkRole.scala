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
  
  val Banner: Banner with java.lang.String = js.native
  val Complementary: Complementary with java.lang.String = js.native
  val Main: Main with java.lang.String = js.native
  val Navigation: Navigation with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Region: Region with java.lang.String = js.native
  val Search: Search with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole with java.lang.String] = js.native
}

