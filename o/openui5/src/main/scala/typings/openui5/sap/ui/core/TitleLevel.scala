package typings.openui5.sap.ui.core

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
  sealed trait Auto extends TitleLevel
  
  @js.native
  sealed trait H1 extends TitleLevel
  
  @js.native
  sealed trait H2 extends TitleLevel
  
  @js.native
  sealed trait H3 extends TitleLevel
  
  @js.native
  sealed trait H4 extends TitleLevel
  
  @js.native
  sealed trait H5 extends TitleLevel
  
  @js.native
  sealed trait H6 extends TitleLevel
  
  /* 0 */ val Auto: typings.openui5.sap.ui.core.TitleLevel.Auto with Double = js.native
  /* 1 */ val H1: typings.openui5.sap.ui.core.TitleLevel.H1 with Double = js.native
  /* 2 */ val H2: typings.openui5.sap.ui.core.TitleLevel.H2 with Double = js.native
  /* 3 */ val H3: typings.openui5.sap.ui.core.TitleLevel.H3 with Double = js.native
  /* 4 */ val H4: typings.openui5.sap.ui.core.TitleLevel.H4 with Double = js.native
  /* 5 */ val H5: typings.openui5.sap.ui.core.TitleLevel.H5 with Double = js.native
  /* 6 */ val H6: typings.openui5.sap.ui.core.TitleLevel.H6 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TitleLevel with Double] = js.native
}

