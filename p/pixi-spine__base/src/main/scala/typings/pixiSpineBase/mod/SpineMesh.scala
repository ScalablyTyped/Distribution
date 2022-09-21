package typings.pixiSpineBase.mod

import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiMeshExtras.mod.SimpleMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.eventemitter3.mod.EventEmitter because Already inherited
- typings.eventemitter3.mod.^ because Already inherited
- typings.pixiUtils.mod.EventEmitter because Already inherited
- typings.pixiDisplay.mod.DisplayObject because Already inherited
- typings.pixiSpineBase.mod.ISpineDisplayObject because var conflicts: _bounds, _boundsID, _boundsRect, _destroyed, _enabledFilters, _lastSortedIndex, _localBounds, _localBoundsRect, _mask, _maskRefCount, _zIndex, alpha, cullArea, cullable, filterArea, filters, isMask, isSprite, parent, renderable, sortDirty, tempDisplayObjectParent, transform, visible, worldAlpha. Inlined region, attachment */ @JSImport("@pixi-spine/base", "SpineMesh")
@js.native
open class SpineMesh protected () extends SimpleMesh {
  def this(texture: Texture[Resource]) = this()
  def this(texture: Texture[Resource], vertices: js.typedarray.Float32Array) = this()
  def this(texture: Texture[Resource], vertices: js.typedarray.Float32Array, uvs: js.typedarray.Float32Array) = this()
  def this(texture: Texture[Resource], vertices: Unit, uvs: js.typedarray.Float32Array) = this()
  def this(
    texture: Texture[Resource],
    vertices: js.typedarray.Float32Array,
    uvs: js.typedarray.Float32Array,
    indices: js.typedarray.Uint16Array
  ) = this()
  def this(
    texture: Texture[Resource],
    vertices: js.typedarray.Float32Array,
    uvs: Unit,
    indices: js.typedarray.Uint16Array
  ) = this()
  def this(
    texture: Texture[Resource],
    vertices: Unit,
    uvs: js.typedarray.Float32Array,
    indices: js.typedarray.Uint16Array
  ) = this()
  def this(texture: Texture[Resource], vertices: Unit, uvs: Unit, indices: js.typedarray.Uint16Array) = this()
  def this(
    texture: Texture[Resource],
    vertices: js.typedarray.Float32Array,
    uvs: js.typedarray.Float32Array,
    indices: js.typedarray.Uint16Array,
    drawMode: Double
  ) = this()
  def this(
    texture: Texture[Resource],
    vertices: js.typedarray.Float32Array,
    uvs: js.typedarray.Float32Array,
    indices: Unit,
    drawMode: Double
  ) = this()
  def this(
    texture: Texture[Resource],
    vertices: js.typedarray.Float32Array,
    uvs: Unit,
    indices: js.typedarray.Uint16Array,
    drawMode: Double
  ) = this()
  def this(
    texture: Texture[Resource],
    vertices: js.typedarray.Float32Array,
    uvs: Unit,
    indices: Unit,
    drawMode: Double
  ) = this()
  def this(
    texture: Texture[Resource],
    vertices: Unit,
    uvs: js.typedarray.Float32Array,
    indices: js.typedarray.Uint16Array,
    drawMode: Double
  ) = this()
  def this(
    texture: Texture[Resource],
    vertices: Unit,
    uvs: js.typedarray.Float32Array,
    indices: Unit,
    drawMode: Double
  ) = this()
  def this(
    texture: Texture[Resource],
    vertices: Unit,
    uvs: Unit,
    indices: js.typedarray.Uint16Array,
    drawMode: Double
  ) = this()
  def this(texture: Texture[Resource], vertices: Unit, uvs: Unit, indices: Unit, drawMode: Double) = this()
  
  var attachment: js.UndefOr[IAttachment] = js.native
  
  var region: js.UndefOr[TextureRegion] = js.native
}
