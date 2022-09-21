package typings.officeJsPreview.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CrossFunctionalFlowchartOrientation extends StObject
/**
  *
  * Represents the orientation of the Cross Functional Flowchart diagram.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.CrossFunctionalFlowchartOrientation")
@js.native
object CrossFunctionalFlowchartOrientation extends StObject {
  
  /**
    *
    * Horizontal Cross Functional Flowchart.
    *
    */
  @js.native
  sealed trait horizontal
    extends StObject
       with CrossFunctionalFlowchartOrientation
  
  /**
    *
    * Vertical Cross Functional Flowchart.
    *
    */
  @js.native
  sealed trait vertical
    extends StObject
       with CrossFunctionalFlowchartOrientation
}
