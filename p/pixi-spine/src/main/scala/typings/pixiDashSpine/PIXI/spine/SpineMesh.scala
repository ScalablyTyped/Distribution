package typings.pixiDashSpine.PIXI.spine

import typings.pixiDashSpine.PIXI.spine.core.TextureRegion
import typings.std.Float32Array
import typings.std.Uint16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.SimpleMesh * / any */ @JSGlobal("PIXI.spine.SpineMesh")
@js.native
class SpineMesh protected () extends js.Object {
  def this(texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any) = this()
  def this(
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: Float32Array
  ) = this()
  def this(
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: Float32Array,
    uvs: Float32Array
  ) = this()
  def this(
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: Float32Array,
    uvs: Float32Array,
    indices: Uint16Array
  ) = this()
  def this(
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: Float32Array,
    uvs: Float32Array,
    indices: Uint16Array,
    drawMode: Double
  ) = this()
  var region: TextureRegion = js.native
}

