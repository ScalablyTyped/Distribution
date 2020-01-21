package typings.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatterDebugConfig extends js.Object {
  /**
    * The color value of constraint anchors.
    */
  var anchorColor: js.UndefOr[Double] = js.undefined
  /**
    * The size of the circles drawn as the constraint anchors.
    */
  var anchorSize: js.UndefOr[Double] = js.undefined
  /**
    * The color of the body angle / axes lines.
    */
  var angleColor: js.UndefOr[Boolean] = js.undefined
  /**
    * The color of the body bounds.
    */
  var boundsColor: js.UndefOr[Boolean] = js.undefined
  /**
    * The color of the broadphase grid.
    */
  var broadphaseColor: js.UndefOr[Boolean] = js.undefined
  /**
    * The color of the collision points.
    */
  var collisionColor: js.UndefOr[Boolean] = js.undefined
  /**
    * The color value of the fill when rendering dynamic bodies.
    */
  var fillColor: js.UndefOr[Double] = js.undefined
  /**
    * The opacity of the fill when rendering dynamic bodies, a value between 0 and 1.
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * The color value of hulls when `showConvexHulls` is set.
    */
  var hullColor: js.UndefOr[Double] = js.undefined
  /**
    * The color value of joints when `showJoint` is set.
    */
  var jointColor: js.UndefOr[Double] = js.undefined
  /**
    * The line opacity when rendering joints, a value between 0 and 1.
    */
  var jointLineOpacity: js.UndefOr[Double] = js.undefined
  /**
    * The line thickness when rendering joints.
    */
  var jointLineThickness: js.UndefOr[Double] = js.undefined
  /**
    * The color value of the line stroke when rendering dynamic bodies.
    */
  var lineColor: js.UndefOr[Double] = js.undefined
  /**
    * The opacity of the line when rendering dynamic bodies, a value between 0 and 1.
    */
  var lineOpacity: js.UndefOr[Double] = js.undefined
  /**
    * If rendering lines, the thickness of the line.
    */
  var lineThickness: js.UndefOr[Double] = js.undefined
  /**
    * The color value of the circles drawn when rendering pin constraints.
    */
  var pinColor: js.UndefOr[Double] = js.undefined
  /**
    * The size of the circles drawn when rendering pin constraints.
    */
  var pinSize: js.UndefOr[Double] = js.undefined
  /**
    * The color value of the rectangle drawn when rendering the body position.
    */
  var positionColor: js.UndefOr[Double] = js.undefined
  /**
    * The size of the rectangle drawn when rendering the body position.
    */
  var positionSize: js.UndefOr[Double] = js.undefined
  /**
    * Render the bodies using a fill color.
    */
  var renderFill: js.UndefOr[Boolean] = js.undefined
  /**
    * Render the bodies using a line stroke.
    */
  var renderLine: js.UndefOr[Boolean] = js.undefined
  /**
    * The fill color when rendering body sensors.
    */
  var sensorFillColor: js.UndefOr[Double] = js.undefined
  /**
    * The line color when rendering body sensors.
    */
  var sensorLineColor: js.UndefOr[Double] = js.undefined
  /**
    * The color of the body separation line.
    */
  var separationColor: js.UndefOr[Boolean] = js.undefined
  /**
    * Render just a single body axis?
    */
  var showAngleIndicator: js.UndefOr[Boolean] = js.undefined
  /**
    * Render all of the body axes?
    */
  var showAxes: js.UndefOr[Boolean] = js.undefined
  /**
    * Render the dynamic bodies in the world to the Graphics object?
    */
  var showBody: js.UndefOr[Boolean] = js.undefined
  /**
    * Render the bounds of the bodies in the world?
    */
  var showBounds: js.UndefOr[Boolean] = js.undefined
  /**
    * Render the broadphase grid?
    */
  var showBroadphase: js.UndefOr[Boolean] = js.undefined
  /**
    * Render the collision points and normals for colliding pairs.
    */
  var showCollisions: js.UndefOr[Boolean] = js.undefined
  /**
    * When rendering polygon bodies, render the convex hull as well?
    */
  var showConvexHulls: js.UndefOr[Boolean] = js.undefined
  /**
    * When rendering bodies, render the internal edges as well?
    */
  var showInternalEdges: js.UndefOr[Boolean] = js.undefined
  /**
    * Render all world constraints to the Graphics object?
    */
  var showJoint: js.UndefOr[Boolean] = js.undefined
  /**
    * Render the position of non-static bodies?
    */
  var showPositions: js.UndefOr[Boolean] = js.undefined
  /**
    * Render bodies or body parts that are flagged as being a sensor?
    */
  var showSensors: js.UndefOr[Boolean] = js.undefined
  /**
    * Render lines showing the separation between bodies.
    */
  var showSeparation: js.UndefOr[Boolean] = js.undefined
  /**
    * Render any sleeping bodies (dynamic or static) in the world to the Graphics object?
    */
  var showSleeping: js.UndefOr[Boolean] = js.undefined
  /**
    * Render the static bodies in the world to the Graphics object?
    */
  var showStaticBody: js.UndefOr[Boolean] = js.undefined
  /**
    * Render the velocity of the bodies in the world?
    */
  var showVelocity: js.UndefOr[Boolean] = js.undefined
  /**
    * The color value of the fill when rendering sleeping dynamic bodies.
    */
  var sleepFillColor: js.UndefOr[Double] = js.undefined
  /**
    * The color value of the line stroke when rendering sleeping dynamic bodies.
    */
  var sleepLineColor: js.UndefOr[Double] = js.undefined
  /**
    * The color value of spring constraints.
    */
  var springColor: js.UndefOr[Double] = js.undefined
  /**
    * The amount to multiply the opacity of sleeping static bodies by.
    */
  var staticBodySleepOpacity: js.UndefOr[Double] = js.undefined
  /**
    * The color value of the fill when rendering static bodies.
    */
  var staticFillColor: js.UndefOr[Double] = js.undefined
  /**
    * The color value of the line stroke when rendering static bodies.
    */
  var staticLineColor: js.UndefOr[Double] = js.undefined
  /**
    * The color of the body velocity line.
    */
  var velocityColor: js.UndefOr[Boolean] = js.undefined
}

object MatterDebugConfig {
  @scala.inline
  def apply(
    anchorColor: Int | Double = null,
    anchorSize: Int | Double = null,
    angleColor: js.UndefOr[Boolean] = js.undefined,
    boundsColor: js.UndefOr[Boolean] = js.undefined,
    broadphaseColor: js.UndefOr[Boolean] = js.undefined,
    collisionColor: js.UndefOr[Boolean] = js.undefined,
    fillColor: Int | Double = null,
    fillOpacity: Int | Double = null,
    hullColor: Int | Double = null,
    jointColor: Int | Double = null,
    jointLineOpacity: Int | Double = null,
    jointLineThickness: Int | Double = null,
    lineColor: Int | Double = null,
    lineOpacity: Int | Double = null,
    lineThickness: Int | Double = null,
    pinColor: Int | Double = null,
    pinSize: Int | Double = null,
    positionColor: Int | Double = null,
    positionSize: Int | Double = null,
    renderFill: js.UndefOr[Boolean] = js.undefined,
    renderLine: js.UndefOr[Boolean] = js.undefined,
    sensorFillColor: Int | Double = null,
    sensorLineColor: Int | Double = null,
    separationColor: js.UndefOr[Boolean] = js.undefined,
    showAngleIndicator: js.UndefOr[Boolean] = js.undefined,
    showAxes: js.UndefOr[Boolean] = js.undefined,
    showBody: js.UndefOr[Boolean] = js.undefined,
    showBounds: js.UndefOr[Boolean] = js.undefined,
    showBroadphase: js.UndefOr[Boolean] = js.undefined,
    showCollisions: js.UndefOr[Boolean] = js.undefined,
    showConvexHulls: js.UndefOr[Boolean] = js.undefined,
    showInternalEdges: js.UndefOr[Boolean] = js.undefined,
    showJoint: js.UndefOr[Boolean] = js.undefined,
    showPositions: js.UndefOr[Boolean] = js.undefined,
    showSensors: js.UndefOr[Boolean] = js.undefined,
    showSeparation: js.UndefOr[Boolean] = js.undefined,
    showSleeping: js.UndefOr[Boolean] = js.undefined,
    showStaticBody: js.UndefOr[Boolean] = js.undefined,
    showVelocity: js.UndefOr[Boolean] = js.undefined,
    sleepFillColor: Int | Double = null,
    sleepLineColor: Int | Double = null,
    springColor: Int | Double = null,
    staticBodySleepOpacity: Int | Double = null,
    staticFillColor: Int | Double = null,
    staticLineColor: Int | Double = null,
    velocityColor: js.UndefOr[Boolean] = js.undefined
  ): MatterDebugConfig = {
    val __obj = js.Dynamic.literal()
    if (anchorColor != null) __obj.updateDynamic("anchorColor")(anchorColor.asInstanceOf[js.Any])
    if (anchorSize != null) __obj.updateDynamic("anchorSize")(anchorSize.asInstanceOf[js.Any])
    if (!js.isUndefined(angleColor)) __obj.updateDynamic("angleColor")(angleColor.asInstanceOf[js.Any])
    if (!js.isUndefined(boundsColor)) __obj.updateDynamic("boundsColor")(boundsColor.asInstanceOf[js.Any])
    if (!js.isUndefined(broadphaseColor)) __obj.updateDynamic("broadphaseColor")(broadphaseColor.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionColor)) __obj.updateDynamic("collisionColor")(collisionColor.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (hullColor != null) __obj.updateDynamic("hullColor")(hullColor.asInstanceOf[js.Any])
    if (jointColor != null) __obj.updateDynamic("jointColor")(jointColor.asInstanceOf[js.Any])
    if (jointLineOpacity != null) __obj.updateDynamic("jointLineOpacity")(jointLineOpacity.asInstanceOf[js.Any])
    if (jointLineThickness != null) __obj.updateDynamic("jointLineThickness")(jointLineThickness.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineOpacity != null) __obj.updateDynamic("lineOpacity")(lineOpacity.asInstanceOf[js.Any])
    if (lineThickness != null) __obj.updateDynamic("lineThickness")(lineThickness.asInstanceOf[js.Any])
    if (pinColor != null) __obj.updateDynamic("pinColor")(pinColor.asInstanceOf[js.Any])
    if (pinSize != null) __obj.updateDynamic("pinSize")(pinSize.asInstanceOf[js.Any])
    if (positionColor != null) __obj.updateDynamic("positionColor")(positionColor.asInstanceOf[js.Any])
    if (positionSize != null) __obj.updateDynamic("positionSize")(positionSize.asInstanceOf[js.Any])
    if (!js.isUndefined(renderFill)) __obj.updateDynamic("renderFill")(renderFill.asInstanceOf[js.Any])
    if (!js.isUndefined(renderLine)) __obj.updateDynamic("renderLine")(renderLine.asInstanceOf[js.Any])
    if (sensorFillColor != null) __obj.updateDynamic("sensorFillColor")(sensorFillColor.asInstanceOf[js.Any])
    if (sensorLineColor != null) __obj.updateDynamic("sensorLineColor")(sensorLineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(separationColor)) __obj.updateDynamic("separationColor")(separationColor.asInstanceOf[js.Any])
    if (!js.isUndefined(showAngleIndicator)) __obj.updateDynamic("showAngleIndicator")(showAngleIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(showAxes)) __obj.updateDynamic("showAxes")(showAxes.asInstanceOf[js.Any])
    if (!js.isUndefined(showBody)) __obj.updateDynamic("showBody")(showBody.asInstanceOf[js.Any])
    if (!js.isUndefined(showBounds)) __obj.updateDynamic("showBounds")(showBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(showBroadphase)) __obj.updateDynamic("showBroadphase")(showBroadphase.asInstanceOf[js.Any])
    if (!js.isUndefined(showCollisions)) __obj.updateDynamic("showCollisions")(showCollisions.asInstanceOf[js.Any])
    if (!js.isUndefined(showConvexHulls)) __obj.updateDynamic("showConvexHulls")(showConvexHulls.asInstanceOf[js.Any])
    if (!js.isUndefined(showInternalEdges)) __obj.updateDynamic("showInternalEdges")(showInternalEdges.asInstanceOf[js.Any])
    if (!js.isUndefined(showJoint)) __obj.updateDynamic("showJoint")(showJoint.asInstanceOf[js.Any])
    if (!js.isUndefined(showPositions)) __obj.updateDynamic("showPositions")(showPositions.asInstanceOf[js.Any])
    if (!js.isUndefined(showSensors)) __obj.updateDynamic("showSensors")(showSensors.asInstanceOf[js.Any])
    if (!js.isUndefined(showSeparation)) __obj.updateDynamic("showSeparation")(showSeparation.asInstanceOf[js.Any])
    if (!js.isUndefined(showSleeping)) __obj.updateDynamic("showSleeping")(showSleeping.asInstanceOf[js.Any])
    if (!js.isUndefined(showStaticBody)) __obj.updateDynamic("showStaticBody")(showStaticBody.asInstanceOf[js.Any])
    if (!js.isUndefined(showVelocity)) __obj.updateDynamic("showVelocity")(showVelocity.asInstanceOf[js.Any])
    if (sleepFillColor != null) __obj.updateDynamic("sleepFillColor")(sleepFillColor.asInstanceOf[js.Any])
    if (sleepLineColor != null) __obj.updateDynamic("sleepLineColor")(sleepLineColor.asInstanceOf[js.Any])
    if (springColor != null) __obj.updateDynamic("springColor")(springColor.asInstanceOf[js.Any])
    if (staticBodySleepOpacity != null) __obj.updateDynamic("staticBodySleepOpacity")(staticBodySleepOpacity.asInstanceOf[js.Any])
    if (staticFillColor != null) __obj.updateDynamic("staticFillColor")(staticFillColor.asInstanceOf[js.Any])
    if (staticLineColor != null) __obj.updateDynamic("staticLineColor")(staticLineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(velocityColor)) __obj.updateDynamic("velocityColor")(velocityColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterDebugConfig]
  }
}

