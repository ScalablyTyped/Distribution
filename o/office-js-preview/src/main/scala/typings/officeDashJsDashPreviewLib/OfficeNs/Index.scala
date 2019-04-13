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
  
  val First: First with java.lang.String = js.native
  val Last: Last with java.lang.String = js.native
  val Next: Next with java.lang.String = js.native
  val Previous: Previous with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.Index with java.lang.String] = js.native
}

