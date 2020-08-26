package typings.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatterDebugConfig extends js.Object {
  /**
    * The color value of constraint anchors.
    */
  var anchorColor: js.UndefOr[Double] = js.native
  /**
    * The size of the circles drawn as the constraint anchors.
    */
  var anchorSize: js.UndefOr[Double] = js.native
  /**
    * The color of the body angle / axes lines.
    */
  var angleColor: js.UndefOr[Double] = js.native
  /**
    * The color of the body bounds.
    */
  var boundsColor: js.UndefOr[Double] = js.native
  /**
    * The color of the broadphase grid.
    */
  var broadphaseColor: js.UndefOr[Double] = js.native
  /**
    * The color of the collision points.
    */
  var collisionColor: js.UndefOr[Double] = js.native
  /**
    * The color value of the fill when rendering dynamic bodies.
    */
  var fillColor: js.UndefOr[Double] = js.native
  /**
    * The opacity of the fill when rendering dynamic bodies, a value between 0 and 1.
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  /**
    * The color value of hulls when `showConvexHulls` is set.
    */
  var hullColor: js.UndefOr[Double] = js.native
  /**
    * The color value of joints when `showJoint` is set.
    */
  var jointColor: js.UndefOr[Double] = js.native
  /**
    * The line opacity when rendering joints, a value between 0 and 1.
    */
  var jointLineOpacity: js.UndefOr[Double] = js.native
  /**
    * The line thickness when rendering joints.
    */
  var jointLineThickness: js.UndefOr[Double] = js.native
  /**
    * The color value of the line stroke when rendering dynamic bodies.
    */
  var lineColor: js.UndefOr[Double] = js.native
  /**
    * The opacity of the line when rendering dynamic bodies, a value between 0 and 1.
    */
  var lineOpacity: js.UndefOr[Double] = js.native
  /**
    * If rendering lines, the thickness of the line.
    */
  var lineThickness: js.UndefOr[Double] = js.native
  /**
    * The color value of the circles drawn when rendering pin constraints.
    */
  var pinColor: js.UndefOr[Double] = js.native
  /**
    * The size of the circles drawn when rendering pin constraints.
    */
  var pinSize: js.UndefOr[Double] = js.native
  /**
    * The color value of the rectangle drawn when rendering the body position.
    */
  var positionColor: js.UndefOr[Double] = js.native
  /**
    * The size of the rectangle drawn when rendering the body position.
    */
  var positionSize: js.UndefOr[Double] = js.native
  /**
    * Render the bodies using a fill color.
    */
  var renderFill: js.UndefOr[Boolean] = js.native
  /**
    * Render the bodies using a line stroke.
    */
  var renderLine: js.UndefOr[Boolean] = js.native
  /**
    * The fill color when rendering body sensors.
    */
  var sensorFillColor: js.UndefOr[Double] = js.native
  /**
    * The line color when rendering body sensors.
    */
  var sensorLineColor: js.UndefOr[Double] = js.native
  /**
    * The color of the body separation line.
    */
  var separationColor: js.UndefOr[Double] = js.native
  /**
    * Render just a single body axis?
    */
  var showAngleIndicator: js.UndefOr[Boolean] = js.native
  /**
    * Render all of the body axes?
    */
  var showAxes: js.UndefOr[Boolean] = js.native
  /**
    * Render the dynamic bodies in the world to the Graphics object?
    */
  var showBody: js.UndefOr[Boolean] = js.native
  /**
    * Render the bounds of the bodies in the world?
    */
  var showBounds: js.UndefOr[Boolean] = js.native
  /**
    * Render the broadphase grid?
    */
  var showBroadphase: js.UndefOr[Boolean] = js.native
  /**
    * Render the collision points and normals for colliding pairs.
    */
  var showCollisions: js.UndefOr[Boolean] = js.native
  /**
    * When rendering polygon bodies, render the convex hull as well?
    */
  var showConvexHulls: js.UndefOr[Boolean] = js.native
  /**
    * When rendering bodies, render the internal edges as well?
    */
  var showInternalEdges: js.UndefOr[Boolean] = js.native
  /**
    * Render all world constraints to the Graphics object?
    */
  var showJoint: js.UndefOr[Boolean] = js.native
  /**
    * Render the position of non-static bodies?
    */
  var showPositions: js.UndefOr[Boolean] = js.native
  /**
    * Render bodies or body parts that are flagged as being a sensor?
    */
  var showSensors: js.UndefOr[Boolean] = js.native
  /**
    * Render lines showing the separation between bodies.
    */
  var showSeparation: js.UndefOr[Boolean] = js.native
  /**
    * Render any sleeping bodies (dynamic or static) in the world to the Graphics object?
    */
  var showSleeping: js.UndefOr[Boolean] = js.native
  /**
    * Render the static bodies in the world to the Graphics object?
    */
  var showStaticBody: js.UndefOr[Boolean] = js.native
  /**
    * Render the velocity of the bodies in the world?
    */
  var showVelocity: js.UndefOr[Boolean] = js.native
  /**
    * The color value of the fill when rendering sleeping dynamic bodies.
    */
  var sleepFillColor: js.UndefOr[Double] = js.native
  /**
    * The color value of the line stroke when rendering sleeping dynamic bodies.
    */
  var sleepLineColor: js.UndefOr[Double] = js.native
  /**
    * The color value of spring constraints.
    */
  var springColor: js.UndefOr[Double] = js.native
  /**
    * The amount to multiply the opacity of sleeping static bodies by.
    */
  var staticBodySleepOpacity: js.UndefOr[Double] = js.native
  /**
    * The color value of the fill when rendering static bodies.
    */
  var staticFillColor: js.UndefOr[Double] = js.native
  /**
    * The color value of the line stroke when rendering static bodies.
    */
  var staticLineColor: js.UndefOr[Double] = js.native
  /**
    * The color of the body velocity line.
    */
  var velocityColor: js.UndefOr[Double] = js.native
}

object MatterDebugConfig {
  @scala.inline
  def apply(): MatterDebugConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterDebugConfig]
  }
  @scala.inline
  implicit class MatterDebugConfigOps[Self <: MatterDebugConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnchorColor(value: Double): Self = this.set("anchorColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorColor: Self = this.set("anchorColor", js.undefined)
    @scala.inline
    def setAnchorSize(value: Double): Self = this.set("anchorSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorSize: Self = this.set("anchorSize", js.undefined)
    @scala.inline
    def setAngleColor(value: Double): Self = this.set("angleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngleColor: Self = this.set("angleColor", js.undefined)
    @scala.inline
    def setBoundsColor(value: Double): Self = this.set("boundsColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundsColor: Self = this.set("boundsColor", js.undefined)
    @scala.inline
    def setBroadphaseColor(value: Double): Self = this.set("broadphaseColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBroadphaseColor: Self = this.set("broadphaseColor", js.undefined)
    @scala.inline
    def setCollisionColor(value: Double): Self = this.set("collisionColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollisionColor: Self = this.set("collisionColor", js.undefined)
    @scala.inline
    def setFillColor(value: Double): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setHullColor(value: Double): Self = this.set("hullColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHullColor: Self = this.set("hullColor", js.undefined)
    @scala.inline
    def setJointColor(value: Double): Self = this.set("jointColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJointColor: Self = this.set("jointColor", js.undefined)
    @scala.inline
    def setJointLineOpacity(value: Double): Self = this.set("jointLineOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJointLineOpacity: Self = this.set("jointLineOpacity", js.undefined)
    @scala.inline
    def setJointLineThickness(value: Double): Self = this.set("jointLineThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJointLineThickness: Self = this.set("jointLineThickness", js.undefined)
    @scala.inline
    def setLineColor(value: Double): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    @scala.inline
    def setLineOpacity(value: Double): Self = this.set("lineOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineOpacity: Self = this.set("lineOpacity", js.undefined)
    @scala.inline
    def setLineThickness(value: Double): Self = this.set("lineThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineThickness: Self = this.set("lineThickness", js.undefined)
    @scala.inline
    def setPinColor(value: Double): Self = this.set("pinColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinColor: Self = this.set("pinColor", js.undefined)
    @scala.inline
    def setPinSize(value: Double): Self = this.set("pinSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinSize: Self = this.set("pinSize", js.undefined)
    @scala.inline
    def setPositionColor(value: Double): Self = this.set("positionColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionColor: Self = this.set("positionColor", js.undefined)
    @scala.inline
    def setPositionSize(value: Double): Self = this.set("positionSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionSize: Self = this.set("positionSize", js.undefined)
    @scala.inline
    def setRenderFill(value: Boolean): Self = this.set("renderFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderFill: Self = this.set("renderFill", js.undefined)
    @scala.inline
    def setRenderLine(value: Boolean): Self = this.set("renderLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderLine: Self = this.set("renderLine", js.undefined)
    @scala.inline
    def setSensorFillColor(value: Double): Self = this.set("sensorFillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensorFillColor: Self = this.set("sensorFillColor", js.undefined)
    @scala.inline
    def setSensorLineColor(value: Double): Self = this.set("sensorLineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensorLineColor: Self = this.set("sensorLineColor", js.undefined)
    @scala.inline
    def setSeparationColor(value: Double): Self = this.set("separationColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparationColor: Self = this.set("separationColor", js.undefined)
    @scala.inline
    def setShowAngleIndicator(value: Boolean): Self = this.set("showAngleIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAngleIndicator: Self = this.set("showAngleIndicator", js.undefined)
    @scala.inline
    def setShowAxes(value: Boolean): Self = this.set("showAxes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAxes: Self = this.set("showAxes", js.undefined)
    @scala.inline
    def setShowBody(value: Boolean): Self = this.set("showBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBody: Self = this.set("showBody", js.undefined)
    @scala.inline
    def setShowBounds(value: Boolean): Self = this.set("showBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBounds: Self = this.set("showBounds", js.undefined)
    @scala.inline
    def setShowBroadphase(value: Boolean): Self = this.set("showBroadphase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBroadphase: Self = this.set("showBroadphase", js.undefined)
    @scala.inline
    def setShowCollisions(value: Boolean): Self = this.set("showCollisions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCollisions: Self = this.set("showCollisions", js.undefined)
    @scala.inline
    def setShowConvexHulls(value: Boolean): Self = this.set("showConvexHulls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowConvexHulls: Self = this.set("showConvexHulls", js.undefined)
    @scala.inline
    def setShowInternalEdges(value: Boolean): Self = this.set("showInternalEdges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInternalEdges: Self = this.set("showInternalEdges", js.undefined)
    @scala.inline
    def setShowJoint(value: Boolean): Self = this.set("showJoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowJoint: Self = this.set("showJoint", js.undefined)
    @scala.inline
    def setShowPositions(value: Boolean): Self = this.set("showPositions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPositions: Self = this.set("showPositions", js.undefined)
    @scala.inline
    def setShowSensors(value: Boolean): Self = this.set("showSensors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSensors: Self = this.set("showSensors", js.undefined)
    @scala.inline
    def setShowSeparation(value: Boolean): Self = this.set("showSeparation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSeparation: Self = this.set("showSeparation", js.undefined)
    @scala.inline
    def setShowSleeping(value: Boolean): Self = this.set("showSleeping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSleeping: Self = this.set("showSleeping", js.undefined)
    @scala.inline
    def setShowStaticBody(value: Boolean): Self = this.set("showStaticBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowStaticBody: Self = this.set("showStaticBody", js.undefined)
    @scala.inline
    def setShowVelocity(value: Boolean): Self = this.set("showVelocity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowVelocity: Self = this.set("showVelocity", js.undefined)
    @scala.inline
    def setSleepFillColor(value: Double): Self = this.set("sleepFillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSleepFillColor: Self = this.set("sleepFillColor", js.undefined)
    @scala.inline
    def setSleepLineColor(value: Double): Self = this.set("sleepLineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSleepLineColor: Self = this.set("sleepLineColor", js.undefined)
    @scala.inline
    def setSpringColor(value: Double): Self = this.set("springColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpringColor: Self = this.set("springColor", js.undefined)
    @scala.inline
    def setStaticBodySleepOpacity(value: Double): Self = this.set("staticBodySleepOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticBodySleepOpacity: Self = this.set("staticBodySleepOpacity", js.undefined)
    @scala.inline
    def setStaticFillColor(value: Double): Self = this.set("staticFillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticFillColor: Self = this.set("staticFillColor", js.undefined)
    @scala.inline
    def setStaticLineColor(value: Double): Self = this.set("staticLineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticLineColor: Self = this.set("staticLineColor", js.undefined)
    @scala.inline
    def setVelocityColor(value: Double): Self = this.set("velocityColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVelocityColor: Self = this.set("velocityColor", js.undefined)
  }
  
}

