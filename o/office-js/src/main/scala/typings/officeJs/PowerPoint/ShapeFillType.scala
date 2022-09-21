package typings.officeJs.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeFillType extends StObject
/**
  * Specifies a shape's fill type.
  *
  * @remarks
  * [Api set: PowerPointApi 1.4]
  */
@JSGlobal("PowerPoint.ShapeFillType")
@js.native
object ShapeFillType extends StObject {
  
  /**
    * Specifies that the shape should have gradient fill.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait gradient
    extends StObject
       with ShapeFillType
  
  /**
    * Specifies that the shape should have no fill.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait noFill
    extends StObject
       with ShapeFillType
  
  /**
    * Specifies that the shape should have pattern fill.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait pattern
    extends StObject
       with ShapeFillType
  
  /**
    * Specifies that the shape should have picture or texture fill.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait pictureAndTexture
    extends StObject
       with ShapeFillType
  
  /**
    * Specifies that the shape should have slide background fill.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait slideBackground
    extends StObject
       with ShapeFillType
  
  /**
    * Specifies that the shape should have regular solid fill.
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @js.native
  sealed trait solid
    extends StObject
       with ShapeFillType
}
