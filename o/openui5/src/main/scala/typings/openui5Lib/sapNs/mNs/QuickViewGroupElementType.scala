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
  
  val email: email with java.lang.String = js.native
  val link: link with java.lang.String = js.native
  val mobile: mobile with java.lang.String = js.native
  val pageLink: pageLink with java.lang.String = js.native
  val phone: phone with java.lang.String = js.native
  val text: text with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.QuickViewGroupElementType with java.lang.String] = js.native
}

