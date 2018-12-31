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
  
  val Auto: Auto with java.lang.String = js.native
  val H1: H1 with java.lang.String = js.native
  val H2: H2 with java.lang.String = js.native
  val H3: H3 with java.lang.String = js.native
  val H4: H4 with java.lang.String = js.native
  val H5: H5 with java.lang.String = js.native
  val H6: H6 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.TitleLevel with java.lang.String] = js.native
}

