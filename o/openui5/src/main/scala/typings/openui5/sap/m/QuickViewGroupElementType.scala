package typings.openui5.sap.m

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
  
  /* 0 */ val email: typings.openui5.sap.m.QuickViewGroupElementType.email with Double = js.native
  /* 1 */ val link: typings.openui5.sap.m.QuickViewGroupElementType.link with Double = js.native
  /* 2 */ val mobile: typings.openui5.sap.m.QuickViewGroupElementType.mobile with Double = js.native
  /* 3 */ val pageLink: typings.openui5.sap.m.QuickViewGroupElementType.pageLink with Double = js.native
  /* 4 */ val phone: typings.openui5.sap.m.QuickViewGroupElementType.phone with Double = js.native
  /* 5 */ val text: typings.openui5.sap.m.QuickViewGroupElementType.text with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QuickViewGroupElementType with Double] = js.native
}

