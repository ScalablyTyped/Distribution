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
  var angleColor: js.UndefOr[Double] = js.undefined
  /**
    * The color of the body bounds.
    */
  var boundsColor: js.UndefOr[Double] = js.undefined
  /**
    * The color of the broadphase grid.
    */
  var broadphaseColor: js.UndefOr[Double] = js.undefined
  /**
    * The color of the collision points.
    */
  var collisionColor: js.UndefOr[Double] = js.undefined
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
  var separationColor: js.UndefOr[Double] = js.undefined
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
  var velocityColor: js.UndefOr[Double] = js.undefined
}

object MatterDebugConfig {
  @scala.inline
  def apply(
    anchorColor: js.UndefOr[Double] = js.undefined,
    anchorSize: js.UndefOr[Double] = js.undefined,
    angleColor: js.UndefOr[Double] = js.undefined,
    boundsColor: js.UndefOr[Double] = js.undefined,
    broadphaseColor: js.UndefOr[Double] = js.undefined,
    collisionColor: js.UndefOr[Double] = js.undefined,
    fillColor: js.UndefOr[Double] = js.undefined,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    hullColor: js.UndefOr[Double] = js.undefined,
    jointColor: js.UndefOr[Double] = js.undefined,
    jointLineOpacity: js.UndefOr[Double] = js.undefined,
    jointLineThickness: js.UndefOr[Double] = js.undefined,
    lineColor: js.UndefOr[Double] = js.undefined,
    lineOpacity: js.UndefOr[Double] = js.undefined,
    lineThickness: js.UndefOr[Double] = js.undefined,
    pinColor: js.UndefOr[Double] = js.undefined,
    pinSize: js.UndefOr[Double] = js.undefined,
    positionColor: js.UndefOr[Double] = js.undefined,
    positionSize: js.UndefOr[Double] = js.undefined,
    renderFill: js.UndefOr[Boolean] = js.undefined,
    renderLine: js.UndefOr[Boolean] = js.undefined,
    sensorFillColor: js.UndefOr[Double] = js.undefined,
    sensorLineColor: js.UndefOr[Double] = js.undefined,
    separationColor: js.UndefOr[Double] = js.undefined,
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
    sleepFillColor: js.UndefOr[Double] = js.undefined,
    sleepLineColor: js.UndefOr[Double] = js.undefined,
    springColor: js.UndefOr[Double] = js.undefined,
    staticBodySleepOpacity: js.UndefOr[Double] = js.undefined,
    staticFillColor: js.UndefOr[Double] = js.undefined,
    staticLineColor: js.UndefOr[Double] = js.undefined,
    velocityColor: js.UndefOr[Double] = js.undefined
  ): MatterDebugConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anchorColor)) __obj.updateDynamic("anchorColor")(anchorColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(anchorSize)) __obj.updateDynamic("anchorSize")(anchorSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(angleColor)) __obj.updateDynamic("angleColor")(angleColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(boundsColor)) __obj.updateDynamic("boundsColor")(boundsColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(broadphaseColor)) __obj.updateDynamic("broadphaseColor")(broadphaseColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionColor)) __obj.updateDynamic("collisionColor")(collisionColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillColor)) __obj.updateDynamic("fillColor")(fillColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hullColor)) __obj.updateDynamic("hullColor")(hullColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(jointColor)) __obj.updateDynamic("jointColor")(jointColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(jointLineOpacity)) __obj.updateDynamic("jointLineOpacity")(jointLineOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(jointLineThickness)) __obj.updateDynamic("jointLineThickness")(jointLineThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineColor)) __obj.updateDynamic("lineColor")(lineColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineOpacity)) __obj.updateDynamic("lineOpacity")(lineOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineThickness)) __obj.updateDynamic("lineThickness")(lineThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pinColor)) __obj.updateDynamic("pinColor")(pinColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pinSize)) __obj.updateDynamic("pinSize")(pinSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(positionColor)) __obj.updateDynamic("positionColor")(positionColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(positionSize)) __obj.updateDynamic("positionSize")(positionSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderFill)) __obj.updateDynamic("renderFill")(renderFill.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderLine)) __obj.updateDynamic("renderLine")(renderLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sensorFillColor)) __obj.updateDynamic("sensorFillColor")(sensorFillColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sensorLineColor)) __obj.updateDynamic("sensorLineColor")(sensorLineColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(separationColor)) __obj.updateDynamic("separationColor")(separationColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showAngleIndicator)) __obj.updateDynamic("showAngleIndicator")(showAngleIndicator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showAxes)) __obj.updateDynamic("showAxes")(showAxes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showBody)) __obj.updateDynamic("showBody")(showBody.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showBounds)) __obj.updateDynamic("showBounds")(showBounds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showBroadphase)) __obj.updateDynamic("showBroadphase")(showBroadphase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showCollisions)) __obj.updateDynamic("showCollisions")(showCollisions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showConvexHulls)) __obj.updateDynamic("showConvexHulls")(showConvexHulls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showInternalEdges)) __obj.updateDynamic("showInternalEdges")(showInternalEdges.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showJoint)) __obj.updateDynamic("showJoint")(showJoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPositions)) __obj.updateDynamic("showPositions")(showPositions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSensors)) __obj.updateDynamic("showSensors")(showSensors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSeparation)) __obj.updateDynamic("showSeparation")(showSeparation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSleeping)) __obj.updateDynamic("showSleeping")(showSleeping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showStaticBody)) __obj.updateDynamic("showStaticBody")(showStaticBody.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showVelocity)) __obj.updateDynamic("showVelocity")(showVelocity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sleepFillColor)) __obj.updateDynamic("sleepFillColor")(sleepFillColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sleepLineColor)) __obj.updateDynamic("sleepLineColor")(sleepLineColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(springColor)) __obj.updateDynamic("springColor")(springColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(staticBodySleepOpacity)) __obj.updateDynamic("staticBodySleepOpacity")(staticBodySleepOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(staticFillColor)) __obj.updateDynamic("staticFillColor")(staticFillColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(staticLineColor)) __obj.updateDynamic("staticLineColor")(staticLineColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(velocityColor)) __obj.updateDynamic("velocityColor")(velocityColor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterDebugConfig]
  }
}

