package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListSeparators extends js.Object

/**
  * Defines which separator style will be applied for the items.
  */
@JSGlobal("sap.m.ListSeparators")
@js.native
object ListSeparators extends js.Object {
  @js.native
  sealed trait All extends ListSeparators
  
  @js.native
  sealed trait Inner extends ListSeparators
  
  @js.native
  sealed trait None extends ListSeparators
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListSeparators with Double] = js.native
  /* 0 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 1 */ @js.native
  object Inner extends TopLevel[Inner with Double]
  
  /* 2 */ @js.native
  object None extends TopLevel[None with Double]
  
}

