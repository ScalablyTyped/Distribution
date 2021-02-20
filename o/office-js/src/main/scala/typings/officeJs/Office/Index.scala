package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Index extends StObject
/**
  * Specifies the relative PowerPoint slide.
  */
@JSGlobal("Office.Index")
@js.native
object Index extends StObject {
  
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
