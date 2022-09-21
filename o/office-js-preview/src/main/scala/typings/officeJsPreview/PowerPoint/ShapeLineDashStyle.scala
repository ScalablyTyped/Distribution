package typings.officeJsPreview.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeLineDashStyle extends StObject
/**
  * Specifies the dash style for a line.
  *
  * @remarks
  * [Api set: PowerPointApi 1.4]
  */
@JSGlobal("PowerPoint.ShapeLineDashStyle")
@js.native
object ShapeLineDashStyle extends StObject {
  
  /**
    * The dash line pattern
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait dash
    extends StObject
       with ShapeLineDashStyle
  
  /**
    * The dash-dot line pattern
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait dashDot
    extends StObject
       with ShapeLineDashStyle
  
  /**
    * The dash-dot-dot line pattern
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait dashDotDot
    extends StObject
       with ShapeLineDashStyle
  
  /**
    * The long dash line pattern
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait longDash
    extends StObject
       with ShapeLineDashStyle
  
  /**
    * The long dash-dot line pattern
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait longDashDot
    extends StObject
       with ShapeLineDashStyle
  
  /**
    * The long dash-dot-dot line pattern
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait longDashDotDot
    extends StObject
       with ShapeLineDashStyle
  
  /**
    * The round dot line pattern
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait roundDot
    extends StObject
       with ShapeLineDashStyle
  
  /**
    * The solid line pattern
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait solid
    extends StObject
       with ShapeLineDashStyle
  
  /**
    * The square dot line pattern
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait squareDot
    extends StObject
       with ShapeLineDashStyle
  
  /**
    * The system dash line pattern
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait systemDash
    extends StObject
       with ShapeLineDashStyle
  
  /**
    * The system dash-dot line pattern
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait systemDashDot
    extends StObject
       with ShapeLineDashStyle
  
  /**
    * The system dot line pattern
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait systemDot
    extends StObject
       with ShapeLineDashStyle
}
