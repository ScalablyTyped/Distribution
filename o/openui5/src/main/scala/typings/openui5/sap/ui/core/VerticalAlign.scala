package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlign extends js.Object

/**
  * Configuration options for vertical alignments, for example of a layout cell content within the
  * borders.
  */
@JSGlobal("sap.ui.core.VerticalAlign")
@js.native
object VerticalAlign extends js.Object {
  @js.native
  sealed trait Bottom extends VerticalAlign
  
  @js.native
  sealed trait Inherit extends VerticalAlign
  
  @js.native
  sealed trait Middle extends VerticalAlign
  
  @js.native
  sealed trait Top extends VerticalAlign
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalAlign with Double] = js.native
  /* 0 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 1 */ @js.native
  object Inherit extends TopLevel[Inherit with Double]
  
  /* 2 */ @js.native
  object Middle extends TopLevel[Middle with Double]
  
  /* 3 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

