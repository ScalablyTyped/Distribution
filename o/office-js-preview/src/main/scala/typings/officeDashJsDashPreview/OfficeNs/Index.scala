package typings.officeDashJsDashPreview.OfficeNs

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
  sealed trait First extends Index
  
  /**
    * Represents the last PowerPoint slide
    */
  @js.native
  sealed trait Last extends Index
  
  /**
    * Represents the next PowerPoint slide
    */
  @js.native
  sealed trait Next extends Index
  
  /**
    * Represents the previous PowerPoint slide
    */
  @js.native
  sealed trait Previous extends Index
  
  /* 0 */ val First: typings.officeDashJsDashPreview.OfficeNs.Index.First with Double = js.native
  /* 1 */ val Last: typings.officeDashJsDashPreview.OfficeNs.Index.Last with Double = js.native
  /* 2 */ val Next: typings.officeDashJsDashPreview.OfficeNs.Index.Next with Double = js.native
  /* 3 */ val Previous: typings.officeDashJsDashPreview.OfficeNs.Index.Previous with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Index with Double] = js.native
}

