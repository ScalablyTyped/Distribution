package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../math/mat4.js').Mat4} Mat4 */
/** @typedef {import('./bounding-sphere.js').BoundingSphere} BoundingSphere */
/**
  * A frustum is a shape that defines the viewing space of a camera. It can be used to determine
  * visibility of points and bounding spheres. Typically, you would not create a Frustum shape
  * directly, but instead query {@link CameraComponent#frustum}.
  */
@JSGlobal("pc.Frustum")
@js.native
open class Frustum ()
  extends typings.playcanvas.mod.Frustum
