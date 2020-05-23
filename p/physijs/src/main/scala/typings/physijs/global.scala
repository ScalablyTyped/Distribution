package typings.physijs

import typings.physijs.Physijs.SceneParameters
import typings.three.mod.Geometry
import typings.three.mod.Material
import typings.three.mod.Object3D
import typings.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object Physijs extends js.Object {
    @js.native
    class BoxMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @js.native
    class CapsuleMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @js.native
    class ConcaveMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @js.native
    class ConeMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @js.native
    class ConeTwistConstraint protected ()
      extends typings.physijs.Physijs.ConeTwistConstraint {
      def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
      /* CompleteClass */
      override def getDefinition(): js.Any = js.native
    }
    
    @js.native
    class ConvexMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @js.native
    class CylinderMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @js.native
    class DOFConstraint protected ()
      extends typings.physijs.Physijs.DOFConstraint {
      def this(objecta: Object3D, objectb: Object3D) = this()
      def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
      /* CompleteClass */
      override def configureAngularMotor(which: Double, low_angle: Double, high_angle: Double, velocity: Double, max_force: Double): Unit = js.native
      /* CompleteClass */
      override def disableAngularMotor(which: Double): Unit = js.native
      /* CompleteClass */
      override def enableAngularMotor(which: Double): Unit = js.native
      /* CompleteClass */
      override def getDefinition(): js.Any = js.native
      /* CompleteClass */
      override def setAngularLowerLimit(limit: Vector3): Unit = js.native
      /* CompleteClass */
      override def setAngularUpperLimit(limit: Vector3): Unit = js.native
      /* CompleteClass */
      override def setLinearLowerLimit(limit: Vector3): Unit = js.native
      /* CompleteClass */
      override def setLinearUpperLimit(limit: Vector3): Unit = js.native
    }
    
    @js.native
    class HeightfieldMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
      def this(geometry: Geometry, material: Material, mass: Double, xdiv: Double) = this()
      def this(geometry: Geometry, material: Material, mass: Double, xdiv: Double, ydiv: Double) = this()
    }
    
    @js.native
    class HingeConstraint protected ()
      extends typings.physijs.Physijs.HingeConstraint {
      def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
      def this(objecta: Object3D, objectb: Object3D, position: Vector3, axis: Vector3) = this()
      /* CompleteClass */
      override def disableMotor(): Unit = js.native
      /* CompleteClass */
      override def enableAngularMotor(velocity: Double, acceleration: Double): Unit = js.native
      /* CompleteClass */
      override def getDefinition(): js.Any = js.native
      /* CompleteClass */
      override def setLimits(low: Double, high: Double, bias_factor: Double, relaxation_factor: Double): Unit = js.native
    }
    
    @js.native
    class Mesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry) = this()
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @js.native
    class PlaneMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @js.native
    class PointConstraint protected ()
      extends typings.physijs.Physijs.PointConstraint {
      def this(objecta: Object3D, objectb: Object3D) = this()
      def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
      /* CompleteClass */
      override def getDefinition(): js.Any = js.native
    }
    
    @js.native
    class Scene ()
      extends typings.physijs.Physijs.Scene {
      def this(param: SceneParameters) = this()
    }
    
    @js.native
    class SliderConstraint protected ()
      extends typings.physijs.Physijs.SliderConstraint {
      def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
      def this(objecta: Object3D, objectb: Object3D, position: Vector3, axis: Vector3) = this()
      /* CompleteClass */
      override def disableAngularMotor(): Unit = js.native
      /* CompleteClass */
      override def disableLinearMotor(): Unit = js.native
      /* CompleteClass */
      override def enableAngularMotor(velocity: Double, acceleration: Double): Unit = js.native
      /* CompleteClass */
      override def enableLinearMotor(velocity: Double, acceleration: Double): Unit = js.native
      /* CompleteClass */
      override def getDefinition(): js.Any = js.native
      /* CompleteClass */
      override def setLimits(lin_lower: Double, lin_upper: Double, ang_lower: Double, ang_upper: Double): Unit = js.native
      /* CompleteClass */
      override def setRestitution(linear: Double, angular: Double): Unit = js.native
    }
    
    @js.native
    class SphereMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @js.native
    class Vehicle protected ()
      extends typings.physijs.Physijs.Vehicle {
      def this(mesh: typings.physijs.Physijs.Mesh) = this()
      def this(mesh: typings.physijs.Physijs.Mesh, tuning: typings.physijs.Physijs.VehicleTuning) = this()
    }
    
    @js.native
    class VehicleTuning protected ()
      extends typings.physijs.Physijs.VehicleTuning {
      def this(
        suspension_stiffness: js.UndefOr[Double],
        suspension_compression: js.UndefOr[Double],
        suspension_damping: js.UndefOr[Double],
        max_suspension_travel: js.UndefOr[Double],
        friction_slip: js.UndefOr[Double],
        max_suspension_force: js.UndefOr[Double]
      ) = this()
      /* CompleteClass */
      override var friction_slip: Double = js.native
      /* CompleteClass */
      override var max_suspension_force: Double = js.native
      /* CompleteClass */
      override var max_suspension_travel: Double = js.native
      /* CompleteClass */
      override var suspension_compression: Double = js.native
      /* CompleteClass */
      override var suspension_damping: Double = js.native
      /* CompleteClass */
      override var suspension_stiffness: Double = js.native
    }
    
    def createMaterial(material: Material): typings.physijs.Physijs.Material = js.native
    def createMaterial(material: Material, friction: Double): typings.physijs.Physijs.Material = js.native
    def createMaterial(material: Material, friction: Double, restitution: Double): typings.physijs.Physijs.Material = js.native
    def noConflict(): js.Object = js.native
    @js.native
    object scripts extends js.Object {
      var ammo: String = js.native
      var worker: String = js.native
    }
    
  }
  
}

