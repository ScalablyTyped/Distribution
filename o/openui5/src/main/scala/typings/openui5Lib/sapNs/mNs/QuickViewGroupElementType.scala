package typings
package openui5Lib.sapNs.mNs

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
  sealed trait email
    extends openui5Lib.sapNs.mNs.QuickViewGroupElementType
  
  @js.native
  sealed trait link
    extends openui5Lib.sapNs.mNs.QuickViewGroupElementType
  
  @js.native
  sealed trait mobile
    extends openui5Lib.sapNs.mNs.QuickViewGroupElementType
  
  @js.native
  sealed trait pageLink
    extends openui5Lib.sapNs.mNs.QuickViewGroupElementType
  
  @js.native
  sealed trait phone
    extends openui5Lib.sapNs.mNs.QuickViewGroupElementType
  
  @js.native
  sealed trait text
    extends openui5Lib.sapNs.mNs.QuickViewGroupElementType
  
  /* 0 */ val email: email with scala.Double = js.native
  /* 1 */ val link: link with scala.Double = js.native
  /* 2 */ val mobile: mobile with scala.Double = js.native
  /* 3 */ val pageLink: pageLink with scala.Double = js.native
  /* 4 */ val phone: phone with scala.Double = js.native
  /* 5 */ val text: text with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.QuickViewGroupElementType with scala.Double] = js.native
}

