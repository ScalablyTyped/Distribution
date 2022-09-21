package typings.pixiSpine

import typings.pixiCore.mod.BaseTexture
import typings.pixiCore.mod.IAutoDetectOptions
import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiLoaders.mod.LoaderResource
import typings.pixiSpineBase.mod.ArrayLike2
import typings.pixiSpineBase.mod.IAnimation
import typings.pixiSpineBase.mod.IAnimationState
import typings.pixiSpineBase.mod.IAnimationStateData
import typings.pixiSpineBase.mod.IBone
import typings.pixiSpineBase.mod.IBoneData
import typings.pixiSpineBase.mod.IEventData
import typings.pixiSpineBase.mod.IIkConstraintData
import typings.pixiSpineBase.mod.IPathConstraintData
import typings.pixiSpineBase.mod.ISkeleton
import typings.pixiSpineBase.mod.ISkeletonData
import typings.pixiSpineBase.mod.ISkin
import typings.pixiSpineBase.mod.ISlot
import typings.pixiSpineBase.mod.ISlotData
import typings.pixiSpineBase.mod.ITimeline
import typings.pixiSpineBase.mod.ITransformConstraintData
import typings.pixiSpineBase.mod.NumberArrayLike
import typings.pixiSpineBase.mod.TextureFilter
import typings.pixiSpineBase.mod.TextureWrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pixi-spine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pixi-spine", "AttachmentType")
  @js.native
  object AttachmentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiSpineBase.mod.AttachmentType & Double] = js.native
    
    /* 1 */ val BoundingBox: typings.pixiSpineBase.mod.AttachmentType.BoundingBox & Double = js.native
    
    /* 6 */ val Clipping: typings.pixiSpineBase.mod.AttachmentType.Clipping & Double = js.native
    
    /* 3 */ val LinkedMesh: typings.pixiSpineBase.mod.AttachmentType.LinkedMesh & Double = js.native
    
    /* 2 */ val Mesh: typings.pixiSpineBase.mod.AttachmentType.Mesh & Double = js.native
    
    /* 4 */ val Path: typings.pixiSpineBase.mod.AttachmentType.Path & Double = js.native
    
    /* 5 */ val Point: typings.pixiSpineBase.mod.AttachmentType.Point & Double = js.native
    
    /* 0 */ val Region: typings.pixiSpineBase.mod.AttachmentType.Region & Double = js.native
  }
  
  @JSImport("pixi-spine", "BinaryInput")
  @js.native
  open class BinaryInput protected ()
    extends typings.pixiSpineBase.mod.BinaryInput {
    def this(data: js.typedarray.Uint8Array) = this()
    def this(data: js.typedarray.Uint8Array, strings: js.Array[String]) = this()
    def this(data: js.typedarray.Uint8Array, strings: js.Array[String], index: Double) = this()
    def this(data: js.typedarray.Uint8Array, strings: Unit, index: Double) = this()
    def this(
      data: js.typedarray.Uint8Array,
      strings: js.Array[String],
      index: Double,
      buffer: js.typedarray.DataView
    ) = this()
    def this(
      data: js.typedarray.Uint8Array,
      strings: js.Array[String],
      index: Unit,
      buffer: js.typedarray.DataView
    ) = this()
    def this(data: js.typedarray.Uint8Array, strings: Unit, index: Double, buffer: js.typedarray.DataView) = this()
    def this(data: js.typedarray.Uint8Array, strings: Unit, index: Unit, buffer: js.typedarray.DataView) = this()
  }
  
  @JSImport("pixi-spine", "Color")
  @js.native
  open class Color ()
    extends typings.pixiSpineBase.mod.Color {
    def this(r: Double) = this()
    def this(r: Double, g: Double) = this()
    def this(r: Unit, g: Double) = this()
    def this(r: Double, g: Double, b: Double) = this()
    def this(r: Double, g: Unit, b: Double) = this()
    def this(r: Unit, g: Double, b: Double) = this()
    def this(r: Unit, g: Unit, b: Double) = this()
    def this(r: Double, g: Double, b: Double, a: Double) = this()
    def this(r: Double, g: Double, b: Unit, a: Double) = this()
    def this(r: Double, g: Unit, b: Double, a: Double) = this()
    def this(r: Double, g: Unit, b: Unit, a: Double) = this()
    def this(r: Unit, g: Double, b: Double, a: Double) = this()
    def this(r: Unit, g: Double, b: Unit, a: Double) = this()
    def this(r: Unit, g: Unit, b: Double, a: Double) = this()
    def this(r: Unit, g: Unit, b: Unit, a: Double) = this()
  }
  /* static members */
  object Color {
    
    @JSImport("pixi-spine", "Color")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pixi-spine", "Color.BLUE")
    @js.native
    def BLUE: typings.pixiSpineBase.mod.Color = js.native
    inline def BLUE_=(x: typings.pixiSpineBase.mod.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLUE")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi-spine", "Color.GREEN")
    @js.native
    def GREEN: typings.pixiSpineBase.mod.Color = js.native
    inline def GREEN_=(x: typings.pixiSpineBase.mod.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREEN")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi-spine", "Color.MAGENTA")
    @js.native
    def MAGENTA: typings.pixiSpineBase.mod.Color = js.native
    inline def MAGENTA_=(x: typings.pixiSpineBase.mod.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGENTA")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi-spine", "Color.RED")
    @js.native
    def RED: typings.pixiSpineBase.mod.Color = js.native
    inline def RED_=(x: typings.pixiSpineBase.mod.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RED")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi-spine", "Color.WHITE")
    @js.native
    def WHITE: typings.pixiSpineBase.mod.Color = js.native
    inline def WHITE_=(x: typings.pixiSpineBase.mod.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WHITE")(x.asInstanceOf[js.Any])
    
    inline def fromString(hex: String): typings.pixiSpineBase.mod.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(hex.asInstanceOf[js.Any]).asInstanceOf[typings.pixiSpineBase.mod.Color]
    
    inline def rgb888ToColor(color: typings.pixiSpineBase.mod.Color, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb888ToColor")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def rgba8888ToColor(color: typings.pixiSpineBase.mod.Color, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba8888ToColor")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("pixi-spine", "DebugUtils")
  @js.native
  open class DebugUtils ()
    extends typings.pixiSpineBase.mod.DebugUtils
  /* static members */
  object DebugUtils {
    
    @JSImport("pixi-spine", "DebugUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def logBones(
      skeleton: ISkeleton[
          ISkeletonData[
            IBoneData, 
            ISlotData, 
            ISkin, 
            IAnimation[ITimeline], 
            IEventData, 
            IIkConstraintData, 
            ITransformConstraintData, 
            IPathConstraintData
          ], 
          IBone, 
          ISlot, 
          ISkin
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logBones")(skeleton.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("pixi-spine", "IntSet")
  @js.native
  open class IntSet ()
    extends typings.pixiSpineBase.mod.IntSet
  
  @JSImport("pixi-spine", "Interpolation")
  @js.native
  abstract class Interpolation ()
    extends typings.pixiSpineBase.mod.Interpolation
  
  @JSImport("pixi-spine", "MathUtils")
  @js.native
  open class MathUtils ()
    extends typings.pixiSpineBase.mod.MathUtils
  /* static members */
  object MathUtils {
    
    @JSImport("pixi-spine", "MathUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pixi-spine", "MathUtils.PI")
    @js.native
    def PI: Double = js.native
    
    @JSImport("pixi-spine", "MathUtils.PI2")
    @js.native
    def PI2: Double = js.native
    inline def PI2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PI2")(x.asInstanceOf[js.Any])
    
    inline def PI_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PI")(x.asInstanceOf[js.Any])
    
    inline def cbrt(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cbrt")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def clamp(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def cosDeg(degrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cosDeg")(degrees.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("pixi-spine", "MathUtils.degRad")
    @js.native
    def degRad: Double = js.native
    inline def degRad_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("degRad")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi-spine", "MathUtils.degreesToRadians")
    @js.native
    def degreesToRadians: Double = js.native
    inline def degreesToRadians_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("degreesToRadians")(x.asInstanceOf[js.Any])
    
    inline def isPowerOfTwo(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPowerOfTwo")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("pixi-spine", "MathUtils.radDeg")
    @js.native
    def radDeg: Double = js.native
    inline def radDeg_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radDeg")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi-spine", "MathUtils.radiansToDegrees")
    @js.native
    def radiansToDegrees: Double = js.native
    inline def radiansToDegrees_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radiansToDegrees")(x.asInstanceOf[js.Any])
    
    inline def randomTriangular(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randomTriangular")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def randomTriangularWith(min: Double, max: Double, mode: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randomTriangularWith")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def signum(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("signum")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def sinDeg(degrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sinDeg")(degrees.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def toInt(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toInt")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  @JSImport("pixi-spine", "MixBlend")
  @js.native
  object MixBlend extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiSpineBase.mod.MixBlend & Double] = js.native
    
    /* 3 */ val add: typings.pixiSpineBase.mod.MixBlend.add & Double = js.native
    
    /* 1 */ val first: typings.pixiSpineBase.mod.MixBlend.first & Double = js.native
    
    /* 2 */ val replace: typings.pixiSpineBase.mod.MixBlend.replace & Double = js.native
    
    /* 0 */ val setup: typings.pixiSpineBase.mod.MixBlend.setup & Double = js.native
  }
  
  @JSImport("pixi-spine", "MixDirection")
  @js.native
  object MixDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiSpineBase.mod.MixDirection & Double] = js.native
    
    /* 0 */ val mixIn: typings.pixiSpineBase.mod.MixDirection.mixIn & Double = js.native
    
    /* 1 */ val mixOut: typings.pixiSpineBase.mod.MixDirection.mixOut & Double = js.native
  }
  
  @JSImport("pixi-spine", "Pool")
  @js.native
  open class Pool[T] protected ()
    extends typings.pixiSpineBase.mod.Pool[T] {
    def this(instantiator: js.Function0[T]) = this()
  }
  
  @JSImport("pixi-spine", "PositionMode")
  @js.native
  object PositionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiSpineBase.mod.PositionMode & Double] = js.native
    
    /* 0 */ val Fixed: typings.pixiSpineBase.mod.PositionMode.Fixed & Double = js.native
    
    /* 1 */ val Percent: typings.pixiSpineBase.mod.PositionMode.Percent & Double = js.native
  }
  
  @JSImport("pixi-spine", "Pow")
  @js.native
  open class Pow protected ()
    extends typings.pixiSpineBase.mod.Pow {
    def this(power: Double) = this()
  }
  
  @JSImport("pixi-spine", "PowOut")
  @js.native
  open class PowOut protected ()
    extends typings.pixiSpineBase.mod.PowOut {
    def this(power: Double) = this()
  }
  
  @JSImport("pixi-spine", "RotateMode")
  @js.native
  object RotateMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiSpineBase.mod.RotateMode & Double] = js.native
    
    /* 1 */ val Chain: typings.pixiSpineBase.mod.RotateMode.Chain & Double = js.native
    
    /* 2 */ val ChainScale: typings.pixiSpineBase.mod.RotateMode.ChainScale & Double = js.native
    
    /* 0 */ val Tangent: typings.pixiSpineBase.mod.RotateMode.Tangent & Double = js.native
  }
  
  @JSImport("pixi-spine", "SkeletonBounds")
  @js.native
  open class SkeletonBounds ()
    extends typings.pixiSpineRuntime41.mod.SkeletonBounds
  
  @JSImport("pixi-spine", "Spine")
  @js.native
  open class Spine protected ()
    extends typings.pixiSpineLoaderUni.mod.Spine {
    def this(spineData: ISkeletonData[
            IBoneData, 
            ISlotData, 
            ISkin, 
            IAnimation[ITimeline], 
            IEventData, 
            IIkConstraintData, 
            ITransformConstraintData, 
            IPathConstraintData
          ]) = this()
  }
  
  @JSImport("pixi-spine", "SpineBase")
  @js.native
  abstract class SpineBase[Skeleton /* <: ISkeleton[
    ISkeletonData[
      IBoneData, 
      ISlotData, 
      ISkin, 
      IAnimation[ITimeline], 
      IEventData, 
      IIkConstraintData, 
      ITransformConstraintData, 
      IPathConstraintData
    ], 
    IBone, 
    ISlot, 
    ISkin
  ] */, SkeletonData /* <: ISkeletonData[
    IBoneData, 
    ISlotData, 
    ISkin, 
    IAnimation[ITimeline], 
    IEventData, 
    IIkConstraintData, 
    ITransformConstraintData, 
    IPathConstraintData
  ] */, AnimationState /* <: IAnimationState[
    IAnimationStateData[
      ISkeletonData[
        IBoneData, 
        ISlotData, 
        ISkin, 
        IAnimation[ITimeline], 
        IEventData, 
        IIkConstraintData, 
        ITransformConstraintData, 
        IPathConstraintData
      ], 
      IAnimation[ITimeline]
    ]
  ] */, AnimationStateData /* <: IAnimationStateData[
    ISkeletonData[
      IBoneData, 
      ISlotData, 
      ISkin, 
      IAnimation[ITimeline], 
      IEventData, 
      IIkConstraintData, 
      ITransformConstraintData, 
      IPathConstraintData
    ], 
    IAnimation[ITimeline]
  ] */] protected ()
    extends typings.pixiSpineBase.mod.SpineBase[Skeleton, SkeletonData, AnimationState, AnimationStateData] {
    def this(spineData: SkeletonData) = this()
  }
  /* static members */
  object SpineBase {
    
    @JSImport("pixi-spine", "SpineBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pixi-spine", "SpineBase.clippingPolygon")
    @js.native
    def clippingPolygon: js.Array[Double] = js.native
    inline def clippingPolygon_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clippingPolygon")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("pixi-spine", "SpineMesh")
  @js.native
  open class SpineMesh protected ()
    extends typings.pixiSpineBase.mod.SpineMesh {
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
  }
  
  @JSImport("pixi-spine", "SpineParser")
  @js.native
  open class SpineParser ()
    extends typings.pixiSpineLoaderUni.mod.SpineParser
  /* static members */
  object SpineParser {
    
    @JSImport("pixi-spine", "SpineParser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def registerLoaderPlugin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLoaderPlugin")().asInstanceOf[Unit]
    
    inline def use(resource: LoaderResource, next: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("pixi-spine", "SpineSprite")
  @js.native
  /** @param texture - The texture for this sprite. */
  open class SpineSprite ()
    extends typings.pixiSpineBase.mod.SpineSprite {
    def this(texture: Texture[Resource]) = this()
  }
  
  @JSImport("pixi-spine", "StringSet")
  @js.native
  open class StringSet ()
    extends typings.pixiSpineBase.mod.StringSet
  
  @JSImport("pixi-spine", "TextureAtlas")
  @js.native
  open class TextureAtlas ()
    extends typings.pixiSpineBase.mod.TextureAtlas {
    def this(atlasText: String) = this()
    def this(
      atlasText: String,
      textureLoader: js.Function2[
            /* path */ String, 
            /* loaderFunction */ js.Function1[/* tex */ BaseTexture[Resource, IAutoDetectOptions], Any], 
            Any
          ]
    ) = this()
    def this(
      atlasText: Unit,
      textureLoader: js.Function2[
            /* path */ String, 
            /* loaderFunction */ js.Function1[/* tex */ BaseTexture[Resource, IAutoDetectOptions], Any], 
            Any
          ]
    ) = this()
    def this(
      atlasText: String,
      textureLoader: js.Function2[
            /* path */ String, 
            /* loaderFunction */ js.Function1[/* tex */ BaseTexture[Resource, IAutoDetectOptions], Any], 
            Any
          ],
      callback: js.Function1[/* obj */ typings.pixiSpineBase.mod.TextureAtlas, Any]
    ) = this()
    def this(
      atlasText: String,
      textureLoader: Unit,
      callback: js.Function1[/* obj */ typings.pixiSpineBase.mod.TextureAtlas, Any]
    ) = this()
    def this(
      atlasText: Unit,
      textureLoader: js.Function2[
            /* path */ String, 
            /* loaderFunction */ js.Function1[/* tex */ BaseTexture[Resource, IAutoDetectOptions], Any], 
            Any
          ],
      callback: js.Function1[/* obj */ typings.pixiSpineBase.mod.TextureAtlas, Any]
    ) = this()
    def this(
      atlasText: Unit,
      textureLoader: Unit,
      callback: js.Function1[/* obj */ typings.pixiSpineBase.mod.TextureAtlas, Any]
    ) = this()
  }
  
  @JSImport("pixi-spine", "TextureAtlasPage")
  @js.native
  open class TextureAtlasPage ()
    extends typings.pixiSpineBase.mod.TextureAtlasPage
  
  @JSImport("pixi-spine", "TextureAtlasRegion")
  @js.native
  open class TextureAtlasRegion ()
    extends typings.pixiSpineBase.mod.TextureAtlasRegion
  
  @JSImport("pixi-spine", "TextureFilter")
  @js.native
  object TextureFilter extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiSpineBase.mod.TextureFilter & Double] = js.native
    
    /* 9729 */ val Linear: typings.pixiSpineBase.mod.TextureFilter.Linear & Double = js.native
    
    /* 9987 */ val MipMap: typings.pixiSpineBase.mod.TextureFilter.MipMap & Double = js.native
    
    /* 9987 */ val MipMapLinearLinear: typings.pixiSpineBase.mod.TextureFilter.MipMapLinearLinear & Double = js.native
    
    /* 9985 */ val MipMapLinearNearest: typings.pixiSpineBase.mod.TextureFilter.MipMapLinearNearest & Double = js.native
    
    /* 9986 */ val MipMapNearestLinear: typings.pixiSpineBase.mod.TextureFilter.MipMapNearestLinear & Double = js.native
    
    /* 9984 */ val MipMapNearestNearest: typings.pixiSpineBase.mod.TextureFilter.MipMapNearestNearest & Double = js.native
    
    /* 9728 */ val Nearest: typings.pixiSpineBase.mod.TextureFilter.Nearest & Double = js.native
  }
  
  @JSImport("pixi-spine", "TextureRegion")
  @js.native
  open class TextureRegion ()
    extends typings.pixiSpineBase.mod.TextureRegion
  
  @JSImport("pixi-spine", "TextureWrap")
  @js.native
  object TextureWrap extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiSpineBase.mod.TextureWrap & Double] = js.native
    
    /* 33071 */ val ClampToEdge: typings.pixiSpineBase.mod.TextureWrap.ClampToEdge & Double = js.native
    
    /* 33648 */ val MirroredRepeat: typings.pixiSpineBase.mod.TextureWrap.MirroredRepeat & Double = js.native
    
    /* 10497 */ val Repeat: typings.pixiSpineBase.mod.TextureWrap.Repeat & Double = js.native
  }
  
  @JSImport("pixi-spine", "TimeKeeper")
  @js.native
  open class TimeKeeper ()
    extends typings.pixiSpineBase.mod.TimeKeeper
  
  @JSImport("pixi-spine", "TransformMode")
  @js.native
  object TransformMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiSpineBase.mod.TransformMode & Double] = js.native
    
    /* 2 */ val NoRotationOrReflection: typings.pixiSpineBase.mod.TransformMode.NoRotationOrReflection & Double = js.native
    
    /* 3 */ val NoScale: typings.pixiSpineBase.mod.TransformMode.NoScale & Double = js.native
    
    /* 4 */ val NoScaleOrReflection: typings.pixiSpineBase.mod.TransformMode.NoScaleOrReflection & Double = js.native
    
    /* 0 */ val Normal: typings.pixiSpineBase.mod.TransformMode.Normal & Double = js.native
    
    /* 1 */ val OnlyTranslation: typings.pixiSpineBase.mod.TransformMode.OnlyTranslation & Double = js.native
  }
  
  @JSImport("pixi-spine", "Utils")
  @js.native
  open class Utils ()
    extends typings.pixiSpineBase.mod.Utils
  /* static members */
  object Utils {
    
    @JSImport("pixi-spine", "Utils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pixi-spine", "Utils.SUPPORTS_TYPED_ARRAYS")
    @js.native
    def SUPPORTS_TYPED_ARRAYS: Boolean = js.native
    inline def SUPPORTS_TYPED_ARRAYS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUPPORTS_TYPED_ARRAYS")(x.asInstanceOf[js.Any])
    
    inline def arrayCopy[T](
      source: ArrayLike2[T],
      sourceStart: Double,
      dest: ArrayLike2[T],
      destStart: Double,
      numElements: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayCopy")(source.asInstanceOf[js.Any], sourceStart.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], destStart.asInstanceOf[js.Any], numElements.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def arrayFill[T](array: ArrayLike2[T], fromIndex: Double, toIndex: Double, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayFill")(array.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any], toIndex.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def contains[T](array: js.Array[T], element: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def contains[T](array: js.Array[T], element: T, identity: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any], element.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def ensureArrayCapacity[T](array: js.Array[T], size: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureArrayCapacity")(array.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def ensureArrayCapacity[T](array: js.Array[T], size: Double, value: Any): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureArrayCapacity")(array.asInstanceOf[js.Any], size.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def enumValue(`type`: Any, name: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enumValue")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def newArray[T](size: Double, defaultValue: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("newArray")(size.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def newFloatArray(size: Double): NumberArrayLike = ^.asInstanceOf[js.Dynamic].applyDynamic("newFloatArray")(size.asInstanceOf[js.Any]).asInstanceOf[NumberArrayLike]
    
    inline def newShortArray(size: Double): NumberArrayLike = ^.asInstanceOf[js.Dynamic].applyDynamic("newShortArray")(size.asInstanceOf[js.Any]).asInstanceOf[NumberArrayLike]
    
    inline def setArraySize[T](array: js.Array[T], size: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setArraySize")(array.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def setArraySize[T](array: js.Array[T], size: Double, value: Any): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setArraySize")(array.asInstanceOf[js.Any], size.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def toFloatArray(array: js.Array[Double]): js.Array[Double] | js.typedarray.Float32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toFloatArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double] | js.typedarray.Float32Array]
    
    inline def toSinglePrecision(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toSinglePrecision")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def webkit602BugfixHelper(alpha: Double, blend: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("webkit602BugfixHelper")(alpha.asInstanceOf[js.Any], blend.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("pixi-spine", "Vector2")
  @js.native
  open class Vector2 ()
    extends typings.pixiSpineBase.mod.Vector2 {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
  }
  
  @JSImport("pixi-spine", "WindowedMean")
  @js.native
  open class WindowedMean ()
    extends typings.pixiSpineBase.mod.WindowedMean {
    def this(windowSize: Double) = this()
  }
  
  inline def filterFromString(text: String): TextureFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("filterFromString")(text.asInstanceOf[js.Any]).asInstanceOf[TextureFilter]
  
  object settings {
    
    @JSImport("pixi-spine", "settings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * pixi-spine gives option to not fail at certain parsing errors
      * spine-ts fails here
      */
    @JSImport("pixi-spine", "settings.FAIL_ON_NON_EXISTING_SKIN")
    @js.native
    def FAIL_ON_NON_EXISTING_SKIN: Boolean = js.native
    inline def FAIL_ON_NON_EXISTING_SKIN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAIL_ON_NON_EXISTING_SKIN")(x.asInstanceOf[js.Any])
    
    /**
      * past Spine.globalAutoUpdate
      */
    @JSImport("pixi-spine", "settings.GLOBAL_AUTO_UPDATE")
    @js.native
    def GLOBAL_AUTO_UPDATE: Boolean = js.native
    inline def GLOBAL_AUTO_UPDATE_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GLOBAL_AUTO_UPDATE")(x.asInstanceOf[js.Any])
    
    /**
      * past Spine.globalDelayLimit
      */
    @JSImport("pixi-spine", "settings.GLOBAL_DELAY_LIMIT")
    @js.native
    def GLOBAL_DELAY_LIMIT: Double = js.native
    inline def GLOBAL_DELAY_LIMIT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GLOBAL_DELAY_LIMIT")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi-spine", "settings.yDown")
    @js.native
    def yDown: Boolean = js.native
    inline def yDown_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yDown")(x.asInstanceOf[js.Any])
  }
  
  inline def wrapFromString(text: String): TextureWrap = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapFromString")(text.asInstanceOf[js.Any]).asInstanceOf[TextureWrap]
}
