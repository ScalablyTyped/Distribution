package typings.physijs

import typings.physijs.Physijs.SceneParameters
import typings.three.mod.Geometry
import typings.three.mod.Material
import typings.three.mod.Object3D
import typings.three.mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Physijs {
    
    @JSGlobal("Physijs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Physijs.BoxMesh")
    @js.native
    class BoxMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @JSGlobal("Physijs.CapsuleMesh")
    @js.native
    class CapsuleMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @JSGlobal("Physijs.ConcaveMesh")
    @js.native
    class ConcaveMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @JSGlobal("Physijs.ConeMesh")
    @js.native
    class ConeMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @JSGlobal("Physijs.ConeTwistConstraint")
    @js.native
    class ConeTwistConstraint protected ()
      extends StObject
         with typings.physijs.Physijs.ConeTwistConstraint {
      def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
      
      /* CompleteClass */
      override def getDefinition(): js.Any = js.native
    }
    
    @JSGlobal("Physijs.ConvexMesh")
    @js.native
    class ConvexMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @JSGlobal("Physijs.CylinderMesh")
    @js.native
    class CylinderMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @JSGlobal("Physijs.DOFConstraint")
    @js.native
    class DOFConstraint protected ()
      extends StObject
         with typings.physijs.Physijs.DOFConstraint {
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
    
    @JSGlobal("Physijs.HeightfieldMesh")
    @js.native
    class HeightfieldMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
      def this(geometry: Geometry, material: Material, mass: Double, xdiv: Double) = this()
      def this(geometry: Geometry, material: Material, mass: Unit, xdiv: Double) = this()
      def this(geometry: Geometry, material: Material, mass: Double, xdiv: Double, ydiv: Double) = this()
      def this(geometry: Geometry, material: Material, mass: Double, xdiv: Unit, ydiv: Double) = this()
      def this(geometry: Geometry, material: Material, mass: Unit, xdiv: Double, ydiv: Double) = this()
      def this(geometry: Geometry, material: Material, mass: Unit, xdiv: Unit, ydiv: Double) = this()
    }
    
    @JSGlobal("Physijs.HingeConstraint")
    @js.native
    class HingeConstraint protected ()
      extends StObject
         with typings.physijs.Physijs.HingeConstraint {
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
    
    @JSGlobal("Physijs.Mesh")
    @js.native
    class Mesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry) = this()
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Unit, mass: Double) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @JSGlobal("Physijs.PlaneMesh")
    @js.native
    class PlaneMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @JSGlobal("Physijs.PointConstraint")
    @js.native
    class PointConstraint protected ()
      extends StObject
         with typings.physijs.Physijs.PointConstraint {
      def this(objecta: Object3D, objectb: Object3D) = this()
      def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
      
      /* CompleteClass */
      override def getDefinition(): js.Any = js.native
    }
    
    @JSGlobal("Physijs.Scene")
    @js.native
    class Scene ()
      extends typings.physijs.Physijs.Scene {
      def this(param: SceneParameters) = this()
    }
    
    @JSGlobal("Physijs.SliderConstraint")
    @js.native
    class SliderConstraint protected ()
      extends StObject
         with typings.physijs.Physijs.SliderConstraint {
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
    
    @JSGlobal("Physijs.SphereMesh")
    @js.native
    class SphereMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @JSGlobal("Physijs.Vehicle")
    @js.native
    class Vehicle protected ()
      extends StObject
         with typings.physijs.Physijs.Vehicle {
      def this(mesh: typings.physijs.Physijs.Mesh) = this()
      def this(mesh: typings.physijs.Physijs.Mesh, tuning: typings.physijs.Physijs.VehicleTuning) = this()
    }
    
    @JSGlobal("Physijs.VehicleTuning")
    @js.native
    class VehicleTuning protected ()
      extends StObject
         with typings.physijs.Physijs.VehicleTuning {
      def this(
        suspension_stiffness: js.UndefOr[Double],
        suspension_compression: js.UndefOr[Double],
        suspension_damping: js.UndefOr[Double],
        max_suspension_travel: js.UndefOr[Double],
        friction_slip: js.UndefOr[Double],
        max_suspension_force: js.UndefOr[Double]
      ) = this()
      
      /* CompleteClass */
      var friction_slip: Double = js.native
      
      /* CompleteClass */
      var max_suspension_force: Double = js.native
      
      /* CompleteClass */
      var max_suspension_travel: Double = js.native
      
      /* CompleteClass */
      var suspension_compression: Double = js.native
      
      /* CompleteClass */
      var suspension_damping: Double = js.native
      
      /* CompleteClass */
      var suspension_stiffness: Double = js.native
    }
    
    inline def createMaterial(material: Material): typings.physijs.Physijs.Material = ^.asInstanceOf[js.Dynamic].applyDynamic("createMaterial")(material.asInstanceOf[js.Any]).asInstanceOf[typings.physijs.Physijs.Material]
    inline def createMaterial(material: Material, friction: Double): typings.physijs.Physijs.Material = (^.asInstanceOf[js.Dynamic].applyDynamic("createMaterial")(material.asInstanceOf[js.Any], friction.asInstanceOf[js.Any])).asInstanceOf[typings.physijs.Physijs.Material]
    inline def createMaterial(material: Material, friction: Double, restitution: Double): typings.physijs.Physijs.Material = (^.asInstanceOf[js.Dynamic].applyDynamic("createMaterial")(material.asInstanceOf[js.Any], friction.asInstanceOf[js.Any], restitution.asInstanceOf[js.Any])).asInstanceOf[typings.physijs.Physijs.Material]
    inline def createMaterial(material: Material, friction: Unit, restitution: Double): typings.physijs.Physijs.Material = (^.asInstanceOf[js.Dynamic].applyDynamic("createMaterial")(material.asInstanceOf[js.Any], friction.asInstanceOf[js.Any], restitution.asInstanceOf[js.Any])).asInstanceOf[typings.physijs.Physijs.Material]
    
    inline def noConflict(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[js.Object]
    
    object scripts {
      
      @JSGlobal("Physijs.scripts")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Physijs.scripts.ammo")
      @js.native
      def ammo: String = js.native
      inline def ammo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ammo")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Physijs.scripts.worker")
      @js.native
      def worker: String = js.native
      inline def worker_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("worker")(x.asInstanceOf[js.Any])
    }
  }
}
