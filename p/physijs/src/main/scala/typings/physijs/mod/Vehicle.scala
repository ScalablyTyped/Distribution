package typings.physijs.mod

import typings.three.mod.Vector3
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("physijs", "Vehicle")
@js.native
open class Vehicle protected () extends StObject {
  def this(mesh: Mesh) = this()
  def this(mesh: Mesh, tuning: VehicleTuning) = this()
  
  def addWheel(
    wheel_geometry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.Geometry */ Any,
    wheel_material: typings.three.mod.Material,
    connection_point: Vector3,
    wheel_direction: Vector3,
    wheel_axle: Vector3,
    suspension_rest_length: Double,
    wheel_radius: Double,
    is_front_wheel: Boolean
  ): Unit = js.native
  def addWheel(
    wheel_geometry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.Geometry */ Any,
    wheel_material: typings.three.mod.Material,
    connection_point: Vector3,
    wheel_direction: Vector3,
    wheel_axle: Vector3,
    suspension_rest_length: Double,
    wheel_radius: Double,
    is_front_wheel: Boolean,
    tuning: VehicleTuning
  ): Unit = js.native
  
  def applyEngineForce(amount: Double): Unit = js.native
  def applyEngineForce(
    amount: Double,
    wheel: typings.three.mod.Mesh[
      BufferGeometry[NormalBufferAttributes], 
      typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material]
    ]
  ): Unit = js.native
  
  var mesh: typings.three.mod.Mesh[
    BufferGeometry[NormalBufferAttributes], 
    typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material]
  ] = js.native
  
  def setBrake(amount: Double): Unit = js.native
  def setBrake(
    amount: Double,
    wheel: typings.three.mod.Mesh[
      BufferGeometry[NormalBufferAttributes], 
      typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material]
    ]
  ): Unit = js.native
  
  def setSteering(amount: Double): Unit = js.native
  def setSteering(
    amount: Double,
    wheel: typings.three.mod.Mesh[
      BufferGeometry[NormalBufferAttributes], 
      typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material]
    ]
  ): Unit = js.native
  
  var wheels: js.Array[
    typings.three.mod.Mesh[
      BufferGeometry[NormalBufferAttributes], 
      typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material]
    ]
  ] = js.native
}
