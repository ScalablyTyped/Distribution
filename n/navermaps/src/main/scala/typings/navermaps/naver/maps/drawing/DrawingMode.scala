package typings.navermaps.naver.maps.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DrawingMode extends js.Object
@JSGlobal("naver.maps.drawing.DrawingMode")
@js.native
object DrawingMode extends js.Object {
  
  @js.native
  sealed trait ARROWLINE extends DrawingMode
  
  @js.native
  sealed trait ELLIPSE extends DrawingMode
  
  @js.native
  sealed trait HAND extends DrawingMode
  
  @js.native
  sealed trait MARKER extends DrawingMode
  
  @js.native
  sealed trait POLYGON extends DrawingMode
  
  @js.native
  sealed trait POLYLINE extends DrawingMode
  
  @js.native
  sealed trait RECTANGLE extends DrawingMode
}
