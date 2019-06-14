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
  
  /* 0 */ val Auto: Auto with scala.Double = js.native
  /* 1 */ val L: L with scala.Double = js.native
  /* 2 */ val M: M with scala.Double = js.native
  /* 3 */ val S: S with scala.Double = js.native
  /* 4 */ val XS: XS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.Size with scala.Double] = js.native
}

