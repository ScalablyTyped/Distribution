package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.ArrayLike2
import typings.pixiSpineBase.mod.Color
import typings.pixiSpineBase.mod.NumberArrayLike
import typings.pixiSpineBase.mod.TextureRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.pixiSpineBase.mod.IAttachment because Already inherited
- typings.pixiSpineBase.mod.IRegionAttachment because var conflicts: name, `type`. Inlined x, rotation, height, y, region, color, scaleX, width, scaleY */ @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment")
@js.native
open class RegionAttachment protected () extends Attachment {
  def this(name: String) = this()
  
  var color: Color = js.native
  
  def computeWorldVertices(bone: Bone, worldVertices: ArrayLike2[Double], offset: Double, stride: Double): Unit = js.native
  
  var height: Double = js.native
  
  var offset: NumberArrayLike = js.native
  
  var path: String = js.native
  
  var region: TextureRegion = js.native
  
  var rendererObject: Any = js.native
  
  var rotation: Any | Double = js.native
  
  var scaleX: Any | Double = js.native
  
  var scaleY: Any | Double = js.native
  
  def setRegion(region: TextureRegion): Unit = js.native
  
  var tempColor: Color = js.native
  
  def updateOffset(): Unit = js.native
  
  var uvs: NumberArrayLike = js.native
  
  var width: Any | Double = js.native
  
  var x: Any | Double = js.native
  
  var y: Any | Double = js.native
}
/* static members */
object RegionAttachment {
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.C1A")
  @js.native
  def C1A: Double = js.native
  inline def C1A_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C1A")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.C1B")
  @js.native
  def C1B: Double = js.native
  inline def C1B_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C1B")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.C1G")
  @js.native
  def C1G: Double = js.native
  inline def C1G_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C1G")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.C1R")
  @js.native
  def C1R: Double = js.native
  inline def C1R_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C1R")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.C2A")
  @js.native
  def C2A: Double = js.native
  inline def C2A_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C2A")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.C2B")
  @js.native
  def C2B: Double = js.native
  inline def C2B_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C2B")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.C2G")
  @js.native
  def C2G: Double = js.native
  inline def C2G_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C2G")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.C2R")
  @js.native
  def C2R: Double = js.native
  inline def C2R_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C2R")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.C3A")
  @js.native
  def C3A: Double = js.native
  inline def C3A_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C3A")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.C3B")
  @js.native
  def C3B: Double = js.native
  inline def C3B_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C3B")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.C3G")
  @js.native
  def C3G: Double = js.native
  inline def C3G_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C3G")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.C3R")
  @js.native
  def C3R: Double = js.native
  inline def C3R_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C3R")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.C4A")
  @js.native
  def C4A: Double = js.native
  inline def C4A_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C4A")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.C4B")
  @js.native
  def C4B: Double = js.native
  inline def C4B_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C4B")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.C4G")
  @js.native
  def C4G: Double = js.native
  inline def C4G_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C4G")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.C4R")
  @js.native
  def C4R: Double = js.native
  inline def C4R_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C4R")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.OX1")
  @js.native
  def OX1: Double = js.native
  inline def OX1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OX1")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.OX2")
  @js.native
  def OX2: Double = js.native
  inline def OX2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OX2")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.OX3")
  @js.native
  def OX3: Double = js.native
  inline def OX3_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OX3")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.OX4")
  @js.native
  def OX4: Double = js.native
  inline def OX4_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OX4")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.OY1")
  @js.native
  def OY1: Double = js.native
  inline def OY1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OY1")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.OY2")
  @js.native
  def OY2: Double = js.native
  inline def OY2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OY2")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.OY3")
  @js.native
  def OY3: Double = js.native
  inline def OY3_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OY3")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.OY4")
  @js.native
  def OY4: Double = js.native
  inline def OY4_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OY4")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.U1")
  @js.native
  def U1: Double = js.native
  inline def U1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("U1")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.U2")
  @js.native
  def U2: Double = js.native
  inline def U2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("U2")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.U3")
  @js.native
  def U3: Double = js.native
  inline def U3_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("U3")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.U4")
  @js.native
  def U4: Double = js.native
  inline def U4_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("U4")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.V1")
  @js.native
  def V1: Double = js.native
  inline def V1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("V1")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.V2")
  @js.native
  def V2: Double = js.native
  inline def V2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("V2")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.V3")
  @js.native
  def V3: Double = js.native
  inline def V3_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("V3")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.V4")
  @js.native
  def V4: Double = js.native
  inline def V4_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("V4")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.X1")
  @js.native
  def X1: Double = js.native
  inline def X1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X1")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.X2")
  @js.native
  def X2: Double = js.native
  inline def X2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X2")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.X3")
  @js.native
  def X3: Double = js.native
  inline def X3_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X3")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.X4")
  @js.native
  def X4: Double = js.native
  inline def X4_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X4")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.Y1")
  @js.native
  def Y1: Double = js.native
  inline def Y1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Y1")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.Y2")
  @js.native
  def Y2: Double = js.native
  inline def Y2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Y2")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.Y3")
  @js.native
  def Y3: Double = js.native
  inline def Y3_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Y3")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "RegionAttachment.Y4")
  @js.native
  def Y4: Double = js.native
  inline def Y4_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Y4")(x.asInstanceOf[js.Any])
}
