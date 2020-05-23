package typings.officeJsPreview.Office

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
  
}

