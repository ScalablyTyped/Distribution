package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlign extends js.Object

/**
  * Configuration options for horizontal alignments of controls
  */
@JSGlobal("sap.ui.core.HorizontalAlign")
@js.native
object HorizontalAlign extends js.Object {
  @js.native
  sealed trait Begin extends HorizontalAlign
  
  @js.native
  sealed trait Center extends HorizontalAlign
  
  @js.native
  sealed trait End extends HorizontalAlign
  
  @js.native
  sealed trait Left extends HorizontalAlign
  
  @js.native
  sealed trait Right extends HorizontalAlign
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalAlign with Double] = js.native
  /* 0 */ @js.native
  object Begin extends TopLevel[Begin with Double]
  
  /* 1 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 2 */ @js.native
  object End extends TopLevel[End with Double]
  
  /* 3 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 4 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

