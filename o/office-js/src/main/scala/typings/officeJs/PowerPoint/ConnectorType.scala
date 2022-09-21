package typings.officeJs.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectorType extends StObject
/**
  * Specifies the connector type for line shapes.
  *
  * @remarks
  * [Api set: PowerPointApi 1.4]
  */
@JSGlobal("PowerPoint.ConnectorType")
@js.native
object ConnectorType extends StObject {
  
  /**
    * Curve connector type
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait curve
    extends StObject
       with ConnectorType
  
  /**
    * Elbow connector type
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait elbow
    extends StObject
       with ConnectorType
  
  /**
    * Straight connector type
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait straight
    extends StObject
       with ConnectorType
}
