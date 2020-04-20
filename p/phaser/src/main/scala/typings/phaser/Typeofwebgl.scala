package typings.phaser

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.phaser.phaserNumbers.`0`
import typings.phaser.phaserNumbers.`10`
import typings.phaser.phaserNumbers.`11`
import typings.phaser.phaserNumbers.`12`
import typings.phaser.phaserNumbers.`13`
import typings.phaser.phaserNumbers.`14`
import typings.phaser.phaserNumbers.`15`
import typings.phaser.phaserNumbers.`1`
import typings.phaser.phaserNumbers.`2`
import typings.phaser.phaserNumbers.`3`
import typings.phaser.phaserNumbers.`4`
import typings.phaser.phaserNumbers.`5`
import typings.phaser.phaserNumbers.`6`
import typings.phaser.phaserNumbers.`7`
import typings.phaser.phaserNumbers.`8`
import typings.phaser.phaserNumbers.`9`
import typings.phaser.spine.webgl.AssetManager
import typings.phaser.spine.webgl.Color2Attribute
import typings.phaser.spine.webgl.ColorAttribute
import typings.phaser.spine.webgl.GLTexture
import typings.phaser.spine.webgl.ManagedWebGLRenderingContext
import typings.phaser.spine.webgl.Mesh
import typings.phaser.spine.webgl.OrthoCamera
import typings.phaser.spine.webgl.PolygonBatcher
import typings.phaser.spine.webgl.Position2Attribute
import typings.phaser.spine.webgl.Position3Attribute
import typings.phaser.spine.webgl.SceneRenderer
import typings.phaser.spine.webgl.ShapeRenderer
import typings.phaser.spine.webgl.TexCoordAttribute
import typings.phaser.spine.webgl.Vector3
import typings.phaser.spine.webgl.VertexAttribute
import typings.phaser.spine.webgl.VertexAttributeType
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofwebgl extends js.Object {
  var AssetManager: Instantiable2[
    /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
    js.UndefOr[/* pathPrefix */ String], 
    typings.phaser.spine.webgl.AssetManager
  ]
  var Color2Attribute: Instantiable0[typings.phaser.spine.webgl.Color2Attribute]
  var ColorAttribute: Instantiable0[typings.phaser.spine.webgl.ColorAttribute]
  var GLTexture: Instantiable3[
    /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
    /* image */ HTMLImageElement, 
    js.UndefOr[/* useMipMaps */ Boolean], 
    typings.phaser.spine.webgl.GLTexture
  ]
  val M00: `0`
  val M01: `4`
  val M02: `8`
  val M03: `12`
  val M10: `1`
  val M11: `5`
  val M12: `9`
  val M13: `13`
  val M20: `2`
  val M21: `6`
  val M22: `10`
  val M23: `14`
  val M30: `3`
  val M31: `7`
  val M32: `11`
  val M33: `15`
  var ManagedWebGLRenderingContext: Instantiable2[
    /* canvasOrContext */ HTMLCanvasElement | WebGLRenderingContext, 
    js.UndefOr[/* contextConfig */ js.Any], 
    typings.phaser.spine.webgl.ManagedWebGLRenderingContext
  ]
  var Matrix4: TypeofMatrix4
  var Mesh: Instantiable4[
    /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
    /* attributes */ js.Array[VertexAttribute], 
    /* maxVertices */ Double, 
    /* maxIndices */ Double, 
    typings.phaser.spine.webgl.Mesh
  ]
  var OrthoCamera: Instantiable2[
    /* viewportWidth */ Double, 
    /* viewportHeight */ Double, 
    typings.phaser.spine.webgl.OrthoCamera
  ]
  var PolygonBatcher: Instantiable3[
    /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
    js.UndefOr[/* twoColorTint */ Boolean], 
    js.UndefOr[/* maxVertices */ Double], 
    typings.phaser.spine.webgl.PolygonBatcher
  ]
  var Position2Attribute: Instantiable0[typings.phaser.spine.webgl.Position2Attribute]
  var Position3Attribute: Instantiable0[typings.phaser.spine.webgl.Position3Attribute]
  var SceneRenderer: Instantiable3[
    /* canvas */ HTMLCanvasElement, 
    /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
    js.UndefOr[/* twoColorTint */ Boolean], 
    typings.phaser.spine.webgl.SceneRenderer
  ]
  var Shader: TypeofShader
  var ShapeRenderer: Instantiable2[
    /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
    js.UndefOr[/* maxVertices */ Double], 
    typings.phaser.spine.webgl.ShapeRenderer
  ]
  var SkeletonDebugRenderer: TypeofSkeletonDebugRender
  var SkeletonRenderer: TypeofSkeletonRendererInstantiable
  var TexCoordAttribute: Instantiable1[js.UndefOr[/* unit */ Double], typings.phaser.spine.webgl.TexCoordAttribute]
  var Vector3: Instantiable3[
    js.UndefOr[/* x */ Double], 
    js.UndefOr[/* y */ Double], 
    js.UndefOr[/* z */ Double], 
    typings.phaser.spine.webgl.Vector3
  ]
  var VertexAttribute: Instantiable3[
    /* name */ String, 
    /* type */ VertexAttributeType, 
    /* numElements */ Double, 
    typings.phaser.spine.webgl.VertexAttribute
  ]
  var WebGLBlendModeConverter: TypeofWebGLBlendModeConve
}

object Typeofwebgl {
  @scala.inline
  def apply(
    AssetManager: Instantiable2[
      /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
      js.UndefOr[/* pathPrefix */ String], 
      AssetManager
    ],
    Color2Attribute: Instantiable0[Color2Attribute],
    ColorAttribute: Instantiable0[ColorAttribute],
    GLTexture: Instantiable3[
      /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
      /* image */ HTMLImageElement, 
      js.UndefOr[/* useMipMaps */ Boolean], 
      GLTexture
    ],
    M00: `0`,
    M01: `4`,
    M02: `8`,
    M03: `12`,
    M10: `1`,
    M11: `5`,
    M12: `9`,
    M13: `13`,
    M20: `2`,
    M21: `6`,
    M22: `10`,
    M23: `14`,
    M30: `3`,
    M31: `7`,
    M32: `11`,
    M33: `15`,
    ManagedWebGLRenderingContext: Instantiable2[
      /* canvasOrContext */ HTMLCanvasElement | WebGLRenderingContext, 
      js.UndefOr[/* contextConfig */ js.Any], 
      ManagedWebGLRenderingContext
    ],
    Matrix4: TypeofMatrix4,
    Mesh: Instantiable4[
      /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
      /* attributes */ js.Array[VertexAttribute], 
      /* maxVertices */ Double, 
      /* maxIndices */ Double, 
      Mesh
    ],
    OrthoCamera: Instantiable2[/* viewportWidth */ Double, /* viewportHeight */ Double, OrthoCamera],
    PolygonBatcher: Instantiable3[
      /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
      js.UndefOr[/* twoColorTint */ Boolean], 
      js.UndefOr[/* maxVertices */ Double], 
      PolygonBatcher
    ],
    Position2Attribute: Instantiable0[Position2Attribute],
    Position3Attribute: Instantiable0[Position3Attribute],
    SceneRenderer: Instantiable3[
      /* canvas */ HTMLCanvasElement, 
      /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
      js.UndefOr[/* twoColorTint */ Boolean], 
      SceneRenderer
    ],
    Shader: TypeofShader,
    ShapeRenderer: Instantiable2[
      /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
      js.UndefOr[/* maxVertices */ Double], 
      ShapeRenderer
    ],
    SkeletonDebugRenderer: TypeofSkeletonDebugRender,
    SkeletonRenderer: TypeofSkeletonRendererInstantiable,
    TexCoordAttribute: Instantiable1[js.UndefOr[/* unit */ Double], TexCoordAttribute],
    Vector3: Instantiable3[
      js.UndefOr[/* x */ Double], 
      js.UndefOr[/* y */ Double], 
      js.UndefOr[/* z */ Double], 
      Vector3
    ],
    VertexAttribute: Instantiable3[
      /* name */ String, 
      /* type */ VertexAttributeType, 
      /* numElements */ Double, 
      VertexAttribute
    ],
    WebGLBlendModeConverter: TypeofWebGLBlendModeConve
  ): Typeofwebgl = {
    val __obj = js.Dynamic.literal(AssetManager = AssetManager.asInstanceOf[js.Any], Color2Attribute = Color2Attribute.asInstanceOf[js.Any], ColorAttribute = ColorAttribute.asInstanceOf[js.Any], GLTexture = GLTexture.asInstanceOf[js.Any], M00 = M00.asInstanceOf[js.Any], M01 = M01.asInstanceOf[js.Any], M02 = M02.asInstanceOf[js.Any], M03 = M03.asInstanceOf[js.Any], M10 = M10.asInstanceOf[js.Any], M11 = M11.asInstanceOf[js.Any], M12 = M12.asInstanceOf[js.Any], M13 = M13.asInstanceOf[js.Any], M20 = M20.asInstanceOf[js.Any], M21 = M21.asInstanceOf[js.Any], M22 = M22.asInstanceOf[js.Any], M23 = M23.asInstanceOf[js.Any], M30 = M30.asInstanceOf[js.Any], M31 = M31.asInstanceOf[js.Any], M32 = M32.asInstanceOf[js.Any], M33 = M33.asInstanceOf[js.Any], ManagedWebGLRenderingContext = ManagedWebGLRenderingContext.asInstanceOf[js.Any], Matrix4 = Matrix4.asInstanceOf[js.Any], Mesh = Mesh.asInstanceOf[js.Any], OrthoCamera = OrthoCamera.asInstanceOf[js.Any], PolygonBatcher = PolygonBatcher.asInstanceOf[js.Any], Position2Attribute = Position2Attribute.asInstanceOf[js.Any], Position3Attribute = Position3Attribute.asInstanceOf[js.Any], SceneRenderer = SceneRenderer.asInstanceOf[js.Any], Shader = Shader.asInstanceOf[js.Any], ShapeRenderer = ShapeRenderer.asInstanceOf[js.Any], SkeletonDebugRenderer = SkeletonDebugRenderer.asInstanceOf[js.Any], SkeletonRenderer = SkeletonRenderer.asInstanceOf[js.Any], TexCoordAttribute = TexCoordAttribute.asInstanceOf[js.Any], Vector3 = Vector3.asInstanceOf[js.Any], VertexAttribute = VertexAttribute.asInstanceOf[js.Any], WebGLBlendModeConverter = WebGLBlendModeConverter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofwebgl]
  }
}

