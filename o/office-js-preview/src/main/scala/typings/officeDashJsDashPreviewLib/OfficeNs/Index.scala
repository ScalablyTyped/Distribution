package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Index extends js.Object

/**
  * Specifies the relative PowerPoint slide.
  */
@JSGlobal("Office.Index")
@js.native
object Index extends js.Object {
  /**
    * Represents the first PowerPoint slide
    */
  @js.native
  sealed trait First
    extends officeDashJsDashPreviewLib.OfficeNs.Index
  
  /**
    * Represents the last PowerPoint slide
    */
  @js.native
  sealed trait Last
    extends officeDashJsDashPreviewLib.OfficeNs.Index
  
  /**
    * Represents the next PowerPoint slide
    */
  @js.native
  sealed trait Next
    extends officeDashJsDashPreviewLib.OfficeNs.Index
  
  /**
    * Represents the previous PowerPoint slide
    */
  @js.native
  sealed trait Previous
    extends officeDashJsDashPreviewLib.OfficeNs.Index
  
  /* 0 */ val First: First with scala.Double = js.native
  /* 1 */ val Last: Last with scala.Double = js.native
  /* 2 */ val Next: Next with scala.Double = js.native
  /* 3 */ val Previous: Previous with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.Index with scala.Double] = js.native
}

