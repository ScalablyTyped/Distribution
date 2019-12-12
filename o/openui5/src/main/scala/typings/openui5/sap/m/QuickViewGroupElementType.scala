package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.QuickViewGroupElementType.email
import typings.openui5.sap.m.QuickViewGroupElementType.link
import typings.openui5.sap.m.QuickViewGroupElementType.mobile
import typings.openui5.sap.m.QuickViewGroupElementType.pageLink
import typings.openui5.sap.m.QuickViewGroupElementType.phone
import typings.openui5.sap.m.QuickViewGroupElementType.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QuickViewGroupElementType extends js.Object

/**
  * QuickViewGroupElement is a combination of one label and another control (Link or Text) associated to
  * this label
  */
@JSGlobal("sap.m.QuickViewGroupElementType")
@js.native
object QuickViewGroupElementType extends js.Object {
  @js.native
  sealed trait email extends QuickViewGroupElementType
  
  @js.native
  sealed trait link extends QuickViewGroupElementType
  
  @js.native
  sealed trait mobile extends QuickViewGroupElementType
  
  @js.native
  sealed trait pageLink extends QuickViewGroupElementType
  
  @js.native
  sealed trait phone extends QuickViewGroupElementType
  
  @js.native
  sealed trait text extends QuickViewGroupElementType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QuickViewGroupElementType with Double] = js.native
  /* 0 */ @js.native
  object email extends TopLevel[email with Double]
  
  /* 1 */ @js.native
  object link extends TopLevel[link with Double]
  
  /* 2 */ @js.native
  object mobile extends TopLevel[mobile with Double]
  
  /* 3 */ @js.native
  object pageLink extends TopLevel[pageLink with Double]
  
  /* 4 */ @js.native
  object phone extends TopLevel[phone with Double]
  
  /* 5 */ @js.native
  object text extends TopLevel[text with Double]
  
}

