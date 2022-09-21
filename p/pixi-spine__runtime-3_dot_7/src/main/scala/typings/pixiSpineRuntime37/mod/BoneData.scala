package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.TransformMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "BoneData")
@js.native
open class BoneData protected () extends StObject {
  def this(index: Double, name: String, parent: BoneData) = this()
  
  var index: Double = js.native
  
  var length: Double = js.native
  
  var name: String = js.native
  
  var parent: BoneData = js.native
  
  var rotation: Double = js.native
  
  var scaleX: Double = js.native
  
  var scaleY: Double = js.native
  
  var shearX: Double = js.native
  
  var shearY: Double = js.native
  
  var transformMode: TransformMode = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
