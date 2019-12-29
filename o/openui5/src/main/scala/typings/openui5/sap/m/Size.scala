package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Size with Double] = js.native
  /* 0 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 1 */ @js.native
  object L extends TopLevel[L with Double]
  
  /* 2 */ @js.native
  object M extends TopLevel[M with Double]
  
  /* 3 */ @js.native
  object S extends TopLevel[S with Double]
  
  /* 4 */ @js.native
  object XS extends TopLevel[XS with Double]
  
}

