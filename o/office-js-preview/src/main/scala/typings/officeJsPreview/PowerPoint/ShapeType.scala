package typings.officeJsPreview.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeType extends StObject
/**
  * Specifies the type of a shape.
  *
  * @remarks
  * [Api set: PowerPointApi 1.4]
  */
@JSGlobal("PowerPoint.ShapeType")
@js.native
object ShapeType extends StObject {
  
  /**
    * The shape is a geometric shape such as rectangle
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait geometricShape
    extends StObject
       with ShapeType
  
  /**
    * The shape is a group shape which contains sub-shapes
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait group
    extends StObject
       with ShapeType
  
  /**
    * The shape is an image
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait image
    extends StObject
       with ShapeType
  
  /**
    * The shape is a line
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait line
    extends StObject
       with ShapeType
  
  /**
    * The given shape's type is unsupported.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait unsupported
    extends StObject
       with ShapeType
}
