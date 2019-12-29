package typings.officeDashJs.Office

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterType extends js.Object

/**
  * Specifies whether filtering from the host application is applied when the data is retrieved.
  */
@JSGlobal("Office.FilterType")
@js.native
object FilterType extends js.Object {
  /**
    * Return all data (not filtered by the host application).
    */
  @js.native
  sealed trait All extends FilterType
  
  /**
    * Return only the visible data (as filtered by the host application).
    */
  @js.native
  sealed trait OnlyVisible extends FilterType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterType with Double] = js.native
  /* 0 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 1 */ @js.native
  object OnlyVisible extends TopLevel[OnlyVisible with Double]
  
}

