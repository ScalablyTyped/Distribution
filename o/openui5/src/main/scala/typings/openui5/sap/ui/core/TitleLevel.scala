package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.ui.core.TitleLevel.Auto
import typings.openui5.sap.ui.core.TitleLevel.H1
import typings.openui5.sap.ui.core.TitleLevel.H2
import typings.openui5.sap.ui.core.TitleLevel.H3
import typings.openui5.sap.ui.core.TitleLevel.H4
import typings.openui5.sap.ui.core.TitleLevel.H5
import typings.openui5.sap.ui.core.TitleLevel.H6
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TitleLevel with Double] = js.native
  /* 0 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 1 */ @js.native
  object H1 extends TopLevel[H1 with Double]
  
  /* 2 */ @js.native
  object H2 extends TopLevel[H2 with Double]
  
  /* 3 */ @js.native
  object H3 extends TopLevel[H3 with Double]
  
  /* 4 */ @js.native
  object H4 extends TopLevel[H4 with Double]
  
  /* 5 */ @js.native
  object H5 extends TopLevel[H5 with Double]
  
  /* 6 */ @js.native
  object H6 extends TopLevel[H6 with Double]
  
}

