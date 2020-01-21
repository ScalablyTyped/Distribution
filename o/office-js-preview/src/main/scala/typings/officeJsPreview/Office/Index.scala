package typings.officeJsPreview.Office

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Index with Double] = js.native
  /* 0 */ @js.native
  object First extends TopLevel[First with Double]
  
  /* 1 */ @js.native
  object Last extends TopLevel[Last with Double]
  
  /* 2 */ @js.native
  object Next extends TopLevel[Next with Double]
  
  /* 3 */ @js.native
  object Previous extends TopLevel[Previous with Double]
  
}

