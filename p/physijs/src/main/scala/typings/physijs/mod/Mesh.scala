package typings.physijs.mod

import typings.physijs.anon.Target
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("physijs", "Mesh")
@js.native
open class Mesh protected ()
  extends typings.three.mod.Mesh[
      BufferGeometry, 
      typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
    ] {
  def this(geometry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.Geometry */ Any) = this()
  def this(
    geometry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.Geometry */ Any,
    material: typings.three.mod.Material
  ) = this()
  def this(
    geometry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.Geometry */ Any,
    material: Unit,
    mass: Double
  ) = this()
  def this(
    geometry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.Geometry */ Any,
    material: typings.three.mod.Material,
    mass: Double
  ) = this()
  
  // Eventable mixins
  def addEventListener(event_name: String, callback: js.Function1[/* event */ Any, Unit]): Unit = js.native
  
  def applyCentralForce(force: Vector3): Unit = js.native
  
  def applyCentralImpulse(force: Vector3): Unit = js.native
  
  def applyForce(force: Vector3, offset: Vector3): Unit = js.native
  
  def applyImpulse(force: Vector3, offset: Vector3): Unit = js.native
  
  def dispatchEvent(event_name: String): Unit = js.native
  // (extends from Object3D)
  def dispatchEvent(event: Target): Unit = js.native
  
  def getAngularVelocity(): Vector3 = js.native
  
  def getLinearVelocity(): Vector3 = js.native
  
  def removeEventListener(event_name: String, callback: js.Function1[/* event */ Any, Unit]): Unit = js.native
  
  def setAngularFactor(factor: Vector3): Unit = js.native
  
  def setAngularVelocity(velocity: Vector3): Unit = js.native
  
  def setCcdMotionThreshold(threshold: Double): Unit = js.native
  
  def setCcdSweptSphereRadius(radius: Double): Unit = js.native
  
  def setDamping(linear: Double, angular: Double): Unit = js.native
  
  def setLinearFactor(factor: Vector3): Unit = js.native
  
  def setLinearVelocity(velocity: Vector3): Unit = js.native
}
