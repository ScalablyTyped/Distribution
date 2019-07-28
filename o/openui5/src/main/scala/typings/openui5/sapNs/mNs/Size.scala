package typings.openui5.sapNs.mNs

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
  sealed trait Auto extends Size
  
  @js.native
  sealed trait L extends Size
  
  @js.native
  sealed trait M extends Size
  
  @js.native
  sealed trait S extends Size
  
  @js.native
  sealed trait XS extends Size
  
  /* 0 */ val Auto: typings.openui5.sapNs.mNs.Size.Auto with Double = js.native
  /* 1 */ val L: typings.openui5.sapNs.mNs.Size.L with Double = js.native
  /* 2 */ val M: typings.openui5.sapNs.mNs.Size.M with Double = js.native
  /* 3 */ val S: typings.openui5.sapNs.mNs.Size.S with Double = js.native
  /* 4 */ val XS: typings.openui5.sapNs.mNs.Size.XS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Size with Double] = js.native
}

