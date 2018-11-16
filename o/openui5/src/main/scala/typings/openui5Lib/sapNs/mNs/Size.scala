package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Size extends js.Object

/**
     * Enumeration of possible size settings.
    */
@JSGlobal("sap.m.Size")
@js.native
object Size extends js.Object {
  @js.native
  sealed trait Auto
    extends openui5Lib.sapNs.mNs.Size
  
  @js.native
  sealed trait L
    extends openui5Lib.sapNs.mNs.Size
  
  @js.native
  sealed trait M
    extends openui5Lib.sapNs.mNs.Size
  
  @js.native
  sealed trait S
    extends openui5Lib.sapNs.mNs.Size
  
  @js.native
  sealed trait XS
    extends openui5Lib.sapNs.mNs.Size
  
  val Auto: Auto with java.lang.String = js.native
  val L: L with java.lang.String = js.native
  val M: M with java.lang.String = js.native
  val S: S with java.lang.String = js.native
  val XS: XS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.Size with java.lang.String] = js.native
}

