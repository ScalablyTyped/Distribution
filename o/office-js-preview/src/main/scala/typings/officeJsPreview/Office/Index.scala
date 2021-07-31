package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  sealed trait First
    extends StObject
       with Index
  
  /**
    * Represents the last PowerPoint slide
    */
  @js.native
  sealed trait Last
    extends StObject
       with Index
  
  /**
    * Represents the next PowerPoint slide
    */
  @js.native
  sealed trait Next
    extends StObject
       with Index
  
  /**
    * Represents the previous PowerPoint slide
    */
  @js.native
  sealed trait Previous
    extends StObject
       with Index
}
