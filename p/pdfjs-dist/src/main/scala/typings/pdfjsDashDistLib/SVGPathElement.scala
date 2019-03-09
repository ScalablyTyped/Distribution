package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathElement extends SVGGraphicsElement {
  /** @deprecated */
  val pathSegList: SVGPathSegList = js.native
  /** @deprecated */
  def createSVGPathSegArcAbs(
    x: scala.Double,
    y: scala.Double,
    r1: scala.Double,
    r2: scala.Double,
    angle: scala.Double,
    largeArcFlag: scala.Boolean,
    sweepFlag: scala.Boolean
  ): SVGPathSegArcAbs = js.native
  /** @deprecated */
  def createSVGPathSegArcRel(
    x: scala.Double,
    y: scala.Double,
    r1: scala.Double,
    r2: scala.Double,
    angle: scala.Double,
    largeArcFlag: scala.Boolean,
    sweepFlag: scala.Boolean
  ): SVGPathSegArcRel = js.native
  /** @deprecated */
  def createSVGPathSegClosePath(): SVGPathSegClosePath = js.native
  /** @deprecated */
  def createSVGPathSegCurvetoCubicAbs(
    x: scala.Double,
    y: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double
  ): SVGPathSegCurvetoCubicAbs = js.native
  /** @deprecated */
  def createSVGPathSegCurvetoCubicRel(
    x: scala.Double,
    y: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double
  ): SVGPathSegCurvetoCubicRel = js.native
  /** @deprecated */
  def createSVGPathSegCurvetoCubicSmoothAbs(x: scala.Double, y: scala.Double, x2: scala.Double, y2: scala.Double): SVGPathSegCurvetoCubicSmoothAbs = js.native
  /** @deprecated */
  def createSVGPathSegCurvetoCubicSmoothRel(x: scala.Double, y: scala.Double, x2: scala.Double, y2: scala.Double): SVGPathSegCurvetoCubicSmoothRel = js.native
  /** @deprecated */
  def createSVGPathSegCurvetoQuadraticAbs(x: scala.Double, y: scala.Double, x1: scala.Double, y1: scala.Double): SVGPathSegCurvetoQuadraticAbs = js.native
  /** @deprecated */
  def createSVGPathSegCurvetoQuadraticRel(x: scala.Double, y: scala.Double, x1: scala.Double, y1: scala.Double): SVGPathSegCurvetoQuadraticRel = js.native
  /** @deprecated */
  def createSVGPathSegCurvetoQuadraticSmoothAbs(x: scala.Double, y: scala.Double): SVGPathSegCurvetoQuadraticSmoothAbs = js.native
  /** @deprecated */
  def createSVGPathSegCurvetoQuadraticSmoothRel(x: scala.Double, y: scala.Double): SVGPathSegCurvetoQuadraticSmoothRel = js.native
  /** @deprecated */
  def createSVGPathSegLinetoAbs(x: scala.Double, y: scala.Double): SVGPathSegLinetoAbs = js.native
  /** @deprecated */
  def createSVGPathSegLinetoHorizontalAbs(x: scala.Double): SVGPathSegLinetoHorizontalAbs = js.native
  /** @deprecated */
  def createSVGPathSegLinetoHorizontalRel(x: scala.Double): SVGPathSegLinetoHorizontalRel = js.native
  /** @deprecated */
  def createSVGPathSegLinetoRel(x: scala.Double, y: scala.Double): SVGPathSegLinetoRel = js.native
  /** @deprecated */
  def createSVGPathSegLinetoVerticalAbs(y: scala.Double): SVGPathSegLinetoVerticalAbs = js.native
  /** @deprecated */
  def createSVGPathSegLinetoVerticalRel(y: scala.Double): SVGPathSegLinetoVerticalRel = js.native
  /** @deprecated */
  def createSVGPathSegMovetoAbs(x: scala.Double, y: scala.Double): SVGPathSegMovetoAbs = js.native
  /** @deprecated */
  def createSVGPathSegMovetoRel(x: scala.Double, y: scala.Double): SVGPathSegMovetoRel = js.native
  /** @deprecated */
  def getPathSegAtLength(distance: scala.Double): scala.Double = js.native
  def getPointAtLength(distance: scala.Double): SVGPoint = js.native
  def getTotalLength(): scala.Double = js.native
}

@JSGlobal("SVGPathElement")
@js.native
object SVGPathElement
  extends org.scalablytyped.runtime.Instantiable0[SVGPathElement]

