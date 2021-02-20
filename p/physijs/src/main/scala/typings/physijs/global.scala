package typings.physijs

import typings.physijs.Physijs.SceneParameters
import typings.three.mod.Geometry
import typings.three.mod.Material
import typings.three.mod.Object3D
import typings.three.mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Physijs {
    
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
      extends typings.physijs.Physijs.ConeTwistConstraint {
      def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
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
      extends typings.physijs.Physijs.DOFConstraint {
      def this(objecta: Object3D, objectb: Object3D) = this()
      def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
    }
    
    @JSGlobal("Physijs.HeightfieldMesh")
    @js.native
    class HeightfieldMesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
      def this(geometry: Geometry, material: Material, mass: js.UndefOr[scala.Nothing], xdiv: Double) = this()
      def this(geometry: Geometry, material: Material, mass: Double, xdiv: Double) = this()
      def this(
        geometry: Geometry,
        material: Material,
        mass: js.UndefOr[scala.Nothing],
        xdiv: js.UndefOr[scala.Nothing],
        ydiv: Double
      ) = this()
      def this(
        geometry: Geometry,
        material: Material,
        mass: js.UndefOr[scala.Nothing],
        xdiv: Double,
        ydiv: Double
      ) = this()
      def this(
        geometry: Geometry,
        material: Material,
        mass: Double,
        xdiv: js.UndefOr[scala.Nothing],
        ydiv: Double
      ) = this()
      def this(geometry: Geometry, material: Material, mass: Double, xdiv: Double, ydiv: Double) = this()
    }
    
    @JSGlobal("Physijs.HingeConstraint")
    @js.native
    class HingeConstraint protected ()
      extends typings.physijs.Physijs.HingeConstraint {
      def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
      def this(objecta: Object3D, objectb: Object3D, position: Vector3, axis: Vector3) = this()
    }
    
    @JSGlobal("Physijs.Mesh")
    @js.native
    class Mesh protected ()
      extends typings.physijs.Physijs.Mesh {
      def this(geometry: Geometry) = this()
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: js.UndefOr[scala.Nothing], mass: Double) = this()
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
      extends typings.physijs.Physijs.PointConstraint {
      def this(objecta: Object3D, objectb: Object3D) = this()
      def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
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
      extends typings.physijs.Physijs.SliderConstraint {
      def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
      def this(objecta: Object3D, objectb: Object3D, position: Vector3, axis: Vector3) = this()
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
      extends typings.physijs.Physijs.Vehicle {
      def this(mesh: typings.physijs.Physijs.Mesh) = this()
      def this(mesh: typings.physijs.Physijs.Mesh, tuning: typings.physijs.Physijs.VehicleTuning) = this()
    }
    
    @JSGlobal("Physijs.VehicleTuning")
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
    }
    
    @JSGlobal("Physijs.createMaterial")
    @js.native
    def createMaterial(material: Material): typings.physijs.Physijs.Material = js.native
    @JSGlobal("Physijs.createMaterial")
    @js.native
    def createMaterial(material: Material, friction: js.UndefOr[scala.Nothing], restitution: Double): typings.physijs.Physijs.Material = js.native
    @JSGlobal("Physijs.createMaterial")
    @js.native
    def createMaterial(material: Material, friction: Double): typings.physijs.Physijs.Material = js.native
    @JSGlobal("Physijs.createMaterial")
    @js.native
    def createMaterial(material: Material, friction: Double, restitution: Double): typings.physijs.Physijs.Material = js.native
    
    @JSGlobal("Physijs.noConflict")
    @js.native
    def noConflict(): js.Object = js.native
    
    object scripts {
      
      @JSGlobal("Physijs.scripts")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Physijs.scripts.ammo")
      @js.native
      def ammo: String = js.native
      @scala.inline
      def ammo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ammo")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Physijs.scripts.worker")
      @js.native
      def worker: String = js.native
      @scala.inline
      def worker_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("worker")(x.asInstanceOf[js.Any])
    }
  }
}
