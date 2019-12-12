package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.ScreenSize.Desktop
import typings.openui5.sap.m.ScreenSize.Large
import typings.openui5.sap.m.ScreenSize.Medium
import typings.openui5.sap.m.ScreenSize.Phone
import typings.openui5.sap.m.ScreenSize.Small
import typings.openui5.sap.m.ScreenSize.Tablet
import typings.openui5.sap.m.ScreenSize.XLarge
import typings.openui5.sap.m.ScreenSize.XSmall
import typings.openui5.sap.m.ScreenSize.XXLarge
import typings.openui5.sap.m.ScreenSize.XXSmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScreenSize extends js.Object

/**
  * Breakpoint names for different screen sizes.
  */
@JSGlobal("sap.m.ScreenSize")
@js.native
object ScreenSize extends js.Object {
  @js.native
  sealed trait Desktop extends ScreenSize
  
  @js.native
  sealed trait Large extends ScreenSize
  
  @js.native
  sealed trait Medium extends ScreenSize
  
  @js.native
  sealed trait Phone extends ScreenSize
  
  @js.native
  sealed trait Small extends ScreenSize
  
  @js.native
  sealed trait Tablet extends ScreenSize
  
  @js.native
  sealed trait XLarge extends ScreenSize
  
  @js.native
  sealed trait XSmall extends ScreenSize
  
  @js.native
  sealed trait XXLarge extends ScreenSize
  
  @js.native
  sealed trait XXSmall extends ScreenSize
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScreenSize with Double] = js.native
  /* 0 */ @js.native
  object Desktop extends TopLevel[Desktop with Double]
  
  /* 1 */ @js.native
  object Large extends TopLevel[Large with Double]
  
  /* 2 */ @js.native
  object Medium extends TopLevel[Medium with Double]
  
  /* 3 */ @js.native
  object Phone extends TopLevel[Phone with Double]
  
  /* 4 */ @js.native
  object Small extends TopLevel[Small with Double]
  
  /* 5 */ @js.native
  object Tablet extends TopLevel[Tablet with Double]
  
  /* 6 */ @js.native
  object XLarge extends TopLevel[XLarge with Double]
  
  /* 7 */ @js.native
  object XSmall extends TopLevel[XSmall with Double]
  
  /* 8 */ @js.native
  object XXLarge extends TopLevel[XXLarge with Double]
  
  /* 9 */ @js.native
  object XXSmall extends TopLevel[XXSmall with Double]
  
}

