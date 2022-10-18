package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterType extends StObject
/**
  * Specifies whether filtering from the Office application is applied when the data is retrieved.
  */
@JSGlobal("Office.FilterType")
@js.native
object FilterType extends StObject {
  
  /**
    * Return all data (not filtered by the Office application).
    */
  @js.native
  sealed trait All
    extends StObject
       with FilterType
  
  /**
    * Return only the visible data (as filtered by the Office application).
    */
  @js.native
  sealed trait OnlyVisible
    extends StObject
       with FilterType
}
