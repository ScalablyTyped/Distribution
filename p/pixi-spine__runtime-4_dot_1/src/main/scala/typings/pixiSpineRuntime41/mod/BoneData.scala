package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.Color
import typings.pixiSpineBase.mod.TransformMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "BoneData")
@js.native
open class BoneData protected () extends StObject {
  def this(index: Double, name: String) = this()
  def this(index: Double, name: String, parent: BoneData) = this()
  
  /** The color of the bone as it was in Spine. Available only when nonessential data was exported. Bones are not usually
    * rendered at runtime. */
  var color: Color = js.native
  
  /** The index of the bone in {@link Skeleton#getBones()}. */
  var index: Double = js.native
  
  /** The bone's length. */
  var length: Double = js.native
  
  /** The name of the bone, which is unique across all bones in the skeleton. */
  var name: String = js.native
  
  /** @returns May be null. */
  var parent: BoneData | Null = js.native
  
  /** The local rotation. */
  var rotation: Double = js.native
  
  /** The local scaleX. */
  var scaleX: Double = js.native
  
  /** The local scaleY. */
  var scaleY: Double = js.native
  
  /** The local shearX. */
  var shearX: Double = js.native
  
  /** The local shearX. */
  var shearY: Double = js.native
  
  /** When true, {@link Skeleton#updateWorldTransform()} only updates this bone if the {@link Skeleton#skin} contains this
    * bone.
    * @see Skin#bones */
  var skinRequired: Boolean = js.native
  
  /** The transform mode for how parent world transforms affect this bone. */
  var transformMode: TransformMode = js.native
  
  /** The local x translation. */
  var x: Double = js.native
  
  /** The local y translation. */
  var y: Double = js.native
}
