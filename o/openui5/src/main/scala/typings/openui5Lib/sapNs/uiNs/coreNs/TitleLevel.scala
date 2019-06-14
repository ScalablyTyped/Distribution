package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TitleLevel extends js.Object

/**
  * Level of a title.
  */
@JSGlobal("sap.ui.core.TitleLevel")
@js.native
object TitleLevel extends js.Object {
  @js.native
  sealed trait Auto
    extends openui5Lib.sapNs.uiNs.coreNs.TitleLevel
  
  @js.native
  sealed trait H1
    extends openui5Lib.sapNs.uiNs.coreNs.TitleLevel
  
  @js.native
  sealed trait H2
    extends openui5Lib.sapNs.uiNs.coreNs.TitleLevel
  
  @js.native
  sealed trait H3
    extends openui5Lib.sapNs.uiNs.coreNs.TitleLevel
  
  @js.native
  sealed trait H4
    extends openui5Lib.sapNs.uiNs.coreNs.TitleLevel
  
  @js.native
  sealed trait H5
    extends openui5Lib.sapNs.uiNs.coreNs.TitleLevel
  
  @js.native
  sealed trait H6
    extends openui5Lib.sapNs.uiNs.coreNs.TitleLevel
  
  /* 0 */ val Auto: Auto with scala.Double = js.native
  /* 1 */ val H1: H1 with scala.Double = js.native
  /* 2 */ val H2: H2 with scala.Double = js.native
  /* 3 */ val H3: H3 with scala.Double = js.native
  /* 4 */ val H4: H4 with scala.Double = js.native
  /* 5 */ val H5: H5 with scala.Double = js.native
  /* 6 */ val H6: H6 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.TitleLevel with scala.Double] = js.native
}

