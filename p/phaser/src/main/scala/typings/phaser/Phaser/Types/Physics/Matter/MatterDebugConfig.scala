package typings.phaser.Phaser.Types.Physics.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatterDebugConfig extends StObject {
  
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
  implicit class MatterDebugConfigMutableBuilder[Self <: MatterDebugConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorColor(value: Double): Self = StObject.set(x, "anchorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorColorUndefined: Self = StObject.set(x, "anchorColor", js.undefined)
    
    @scala.inline
    def setAnchorSize(value: Double): Self = StObject.set(x, "anchorSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorSizeUndefined: Self = StObject.set(x, "anchorSize", js.undefined)
    
    @scala.inline
    def setAngleColor(value: Double): Self = StObject.set(x, "angleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleColorUndefined: Self = StObject.set(x, "angleColor", js.undefined)
    
    @scala.inline
    def setBoundsColor(value: Double): Self = StObject.set(x, "boundsColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsColorUndefined: Self = StObject.set(x, "boundsColor", js.undefined)
    
    @scala.inline
    def setBroadphaseColor(value: Double): Self = StObject.set(x, "broadphaseColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadphaseColorUndefined: Self = StObject.set(x, "broadphaseColor", js.undefined)
    
    @scala.inline
    def setCollisionColor(value: Double): Self = StObject.set(x, "collisionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollisionColorUndefined: Self = StObject.set(x, "collisionColor", js.undefined)
    
    @scala.inline
    def setFillColor(value: Double): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setHullColor(value: Double): Self = StObject.set(x, "hullColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHullColorUndefined: Self = StObject.set(x, "hullColor", js.undefined)
    
    @scala.inline
    def setJointColor(value: Double): Self = StObject.set(x, "jointColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJointColorUndefined: Self = StObject.set(x, "jointColor", js.undefined)
    
    @scala.inline
    def setJointLineOpacity(value: Double): Self = StObject.set(x, "jointLineOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJointLineOpacityUndefined: Self = StObject.set(x, "jointLineOpacity", js.undefined)
    
    @scala.inline
    def setJointLineThickness(value: Double): Self = StObject.set(x, "jointLineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJointLineThicknessUndefined: Self = StObject.set(x, "jointLineThickness", js.undefined)
    
    @scala.inline
    def setLineColor(value: Double): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineOpacity(value: Double): Self = StObject.set(x, "lineOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineOpacityUndefined: Self = StObject.set(x, "lineOpacity", js.undefined)
    
    @scala.inline
    def setLineThickness(value: Double): Self = StObject.set(x, "lineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineThicknessUndefined: Self = StObject.set(x, "lineThickness", js.undefined)
    
    @scala.inline
    def setPinColor(value: Double): Self = StObject.set(x, "pinColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinColorUndefined: Self = StObject.set(x, "pinColor", js.undefined)
    
    @scala.inline
    def setPinSize(value: Double): Self = StObject.set(x, "pinSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinSizeUndefined: Self = StObject.set(x, "pinSize", js.undefined)
    
    @scala.inline
    def setPositionColor(value: Double): Self = StObject.set(x, "positionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionColorUndefined: Self = StObject.set(x, "positionColor", js.undefined)
    
    @scala.inline
    def setPositionSize(value: Double): Self = StObject.set(x, "positionSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionSizeUndefined: Self = StObject.set(x, "positionSize", js.undefined)
    
    @scala.inline
    def setRenderFill(value: Boolean): Self = StObject.set(x, "renderFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderFillUndefined: Self = StObject.set(x, "renderFill", js.undefined)
    
    @scala.inline
    def setRenderLine(value: Boolean): Self = StObject.set(x, "renderLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderLineUndefined: Self = StObject.set(x, "renderLine", js.undefined)
    
    @scala.inline
    def setSensorFillColor(value: Double): Self = StObject.set(x, "sensorFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensorFillColorUndefined: Self = StObject.set(x, "sensorFillColor", js.undefined)
    
    @scala.inline
    def setSensorLineColor(value: Double): Self = StObject.set(x, "sensorLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensorLineColorUndefined: Self = StObject.set(x, "sensorLineColor", js.undefined)
    
    @scala.inline
    def setSeparationColor(value: Double): Self = StObject.set(x, "separationColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparationColorUndefined: Self = StObject.set(x, "separationColor", js.undefined)
    
    @scala.inline
    def setShowAngleIndicator(value: Boolean): Self = StObject.set(x, "showAngleIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAngleIndicatorUndefined: Self = StObject.set(x, "showAngleIndicator", js.undefined)
    
    @scala.inline
    def setShowAxes(value: Boolean): Self = StObject.set(x, "showAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAxesUndefined: Self = StObject.set(x, "showAxes", js.undefined)
    
    @scala.inline
    def setShowBody(value: Boolean): Self = StObject.set(x, "showBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBodyUndefined: Self = StObject.set(x, "showBody", js.undefined)
    
    @scala.inline
    def setShowBounds(value: Boolean): Self = StObject.set(x, "showBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBoundsUndefined: Self = StObject.set(x, "showBounds", js.undefined)
    
    @scala.inline
    def setShowBroadphase(value: Boolean): Self = StObject.set(x, "showBroadphase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBroadphaseUndefined: Self = StObject.set(x, "showBroadphase", js.undefined)
    
    @scala.inline
    def setShowCollisions(value: Boolean): Self = StObject.set(x, "showCollisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCollisionsUndefined: Self = StObject.set(x, "showCollisions", js.undefined)
    
    @scala.inline
    def setShowConvexHulls(value: Boolean): Self = StObject.set(x, "showConvexHulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowConvexHullsUndefined: Self = StObject.set(x, "showConvexHulls", js.undefined)
    
    @scala.inline
    def setShowInternalEdges(value: Boolean): Self = StObject.set(x, "showInternalEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInternalEdgesUndefined: Self = StObject.set(x, "showInternalEdges", js.undefined)
    
    @scala.inline
    def setShowJoint(value: Boolean): Self = StObject.set(x, "showJoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowJointUndefined: Self = StObject.set(x, "showJoint", js.undefined)
    
    @scala.inline
    def setShowPositions(value: Boolean): Self = StObject.set(x, "showPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPositionsUndefined: Self = StObject.set(x, "showPositions", js.undefined)
    
    @scala.inline
    def setShowSensors(value: Boolean): Self = StObject.set(x, "showSensors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSensorsUndefined: Self = StObject.set(x, "showSensors", js.undefined)
    
    @scala.inline
    def setShowSeparation(value: Boolean): Self = StObject.set(x, "showSeparation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSeparationUndefined: Self = StObject.set(x, "showSeparation", js.undefined)
    
    @scala.inline
    def setShowSleeping(value: Boolean): Self = StObject.set(x, "showSleeping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSleepingUndefined: Self = StObject.set(x, "showSleeping", js.undefined)
    
    @scala.inline
    def setShowStaticBody(value: Boolean): Self = StObject.set(x, "showStaticBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowStaticBodyUndefined: Self = StObject.set(x, "showStaticBody", js.undefined)
    
    @scala.inline
    def setShowVelocity(value: Boolean): Self = StObject.set(x, "showVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowVelocityUndefined: Self = StObject.set(x, "showVelocity", js.undefined)
    
    @scala.inline
    def setSleepFillColor(value: Double): Self = StObject.set(x, "sleepFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSleepFillColorUndefined: Self = StObject.set(x, "sleepFillColor", js.undefined)
    
    @scala.inline
    def setSleepLineColor(value: Double): Self = StObject.set(x, "sleepLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSleepLineColorUndefined: Self = StObject.set(x, "sleepLineColor", js.undefined)
    
    @scala.inline
    def setSpringColor(value: Double): Self = StObject.set(x, "springColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpringColorUndefined: Self = StObject.set(x, "springColor", js.undefined)
    
    @scala.inline
    def setStaticBodySleepOpacity(value: Double): Self = StObject.set(x, "staticBodySleepOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticBodySleepOpacityUndefined: Self = StObject.set(x, "staticBodySleepOpacity", js.undefined)
    
    @scala.inline
    def setStaticFillColor(value: Double): Self = StObject.set(x, "staticFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticFillColorUndefined: Self = StObject.set(x, "staticFillColor", js.undefined)
    
    @scala.inline
    def setStaticLineColor(value: Double): Self = StObject.set(x, "staticLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticLineColorUndefined: Self = StObject.set(x, "staticLineColor", js.undefined)
    
    @scala.inline
    def setVelocityColor(value: Double): Self = StObject.set(x, "velocityColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityColorUndefined: Self = StObject.set(x, "velocityColor", js.undefined)
  }
}
