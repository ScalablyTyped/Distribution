package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.ui.core.TextAlign.Begin
import typings.openui5.sap.ui.core.TextAlign.Center
import typings.openui5.sap.ui.core.TextAlign.End
import typings.openui5.sap.ui.core.TextAlign.Initial
import typings.openui5.sap.ui.core.TextAlign.Left
import typings.openui5.sap.ui.core.TextAlign.Right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlign extends js.Object

/**
  * Configuration options for text alignments.
  */
@JSGlobal("sap.ui.core.TextAlign")
@js.native
object TextAlign extends js.Object {
  @js.native
  sealed trait Begin extends TextAlign
  
  @js.native
  sealed trait Center extends TextAlign
  
  @js.native
  sealed trait End extends TextAlign
  
  @js.native
  sealed trait Initial extends TextAlign
  
  @js.native
  sealed trait Left extends TextAlign
  
  @js.native
  sealed trait Right extends TextAlign
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextAlign with Double] = js.native
  /* 0 */ @js.native
  object Begin extends TopLevel[Begin with Double]
  
  /* 1 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 2 */ @js.native
  object End extends TopLevel[End with Double]
  
  /* 3 */ @js.native
  object Initial extends TopLevel[Initial with Double]
  
  /* 4 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 5 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

