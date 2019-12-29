package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectType extends js.Object

/**
  * Enumeration for different Select types.
  */
@JSGlobal("sap.m.SelectType")
@js.native
object SelectType extends js.Object {
  @js.native
  sealed trait Default extends SelectType
  
  @js.native
  sealed trait IconOnly extends SelectType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectType with Double] = js.native
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 1 */ @js.native
  object IconOnly extends TopLevel[IconOnly with Double]
  
}

