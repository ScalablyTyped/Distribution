package typings.navermaps.naver.maps.drawing

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DrawingMode with Double] = js.native
  /* 3 */ @js.native
  object ARROWLINE extends TopLevel[ARROWLINE with Double]
  
  /* 1 */ @js.native
  object ELLIPSE extends TopLevel[ELLIPSE with Double]
  
  /* 0 */ @js.native
  object HAND extends TopLevel[HAND with Double]
  
  /* 5 */ @js.native
  object MARKER extends TopLevel[MARKER with Double]
  
  /* 4 */ @js.native
  object POLYGON extends TopLevel[POLYGON with Double]
  
  /* 2 */ @js.native
  object POLYLINE extends TopLevel[POLYLINE with Double]
  
  /* 0 */ @js.native
  object RECTANGLE extends TopLevel[RECTANGLE with Double]
  
}

