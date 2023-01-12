package typings.phaser.Phaser.Types

import typings.phaser.Phaser.Geom.Mesh.Face
import typings.phaser.Phaser.Geom.Mesh.Vertex
import typings.phaser.Phaser.Textures.Texture
import typings.phaser.Phaser.Types.Math.Vector3Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Geom {
  
  object Mesh {
    
    trait GenerateGridConfig extends StObject {
      
      /**
        * An array of alpha values, one per vertex, or a single alpha value applied to all vertices.
        */
      var alphas: js.UndefOr[Double | js.Array[Double]] = js.undefined
      
      /**
        * An array of colors, one per vertex, or a single color value applied to all vertices.
        */
      var colors: js.UndefOr[Double | js.Array[Double]] = js.undefined
      
      /**
        * If set and using a texture, vertically flipping render result.
        */
      var flipY: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The name or index of the frame within the Texture.
        */
      var frame: js.UndefOr[String | Double] = js.undefined
      
      /**
        * The height of the grid in 3D units.
        */
      var height: js.UndefOr[Double] = js.undefined
      
      /**
        * The number of segments to split the grid vertically in to.
        */
      var heightSegments: js.UndefOr[Double] = js.undefined
      
      /**
        * If set and using a texture with an ortho Mesh, the `width` and `height` parameters will be calculated based on the frame size for you.
        */
      var isOrtho: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If specified, the vertices of the generated grid will be added to this Mesh Game Object.
        */
      var mesh: js.UndefOr[typings.phaser.Phaser.GameObjects.Mesh] = js.undefined
      
      /**
        * The texture to be used for this Grid. Must be a Texture instance. Can also be a string but only if the `mesh` property is set.
        */
      var texture: String | Texture
      
      /**
        * Should the texture tile (repeat) across the grid segments, or display as a single texture?
        */
      var tile: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The width of the grid in 3D units. If you wish to get a pixel accurate grid based on a texture, you can use an Ortho Mesh or the `isOrtho` parameter.
        */
      var width: js.UndefOr[Double] = js.undefined
      
      /**
        * The number of segments to split the grid horizontally in to.
        */
      var widthSegments: js.UndefOr[Double] = js.undefined
      
      /**
        * Offset the grid x position by this amount.
        */
      var x: js.UndefOr[Double] = js.undefined
      
      /**
        * Offset the grid y position by this amount.
        */
      var y: js.UndefOr[Double] = js.undefined
    }
    object GenerateGridConfig {
      
      inline def apply(texture: String | Texture): GenerateGridConfig = {
        val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any])
        __obj.asInstanceOf[GenerateGridConfig]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: GenerateGridConfig] (val x: Self) extends AnyVal {
        
        inline def setAlphas(value: Double | js.Array[Double]): Self = StObject.set(x, "alphas", value.asInstanceOf[js.Any])
        
        inline def setAlphasUndefined: Self = StObject.set(x, "alphas", js.undefined)
        
        inline def setAlphasVarargs(value: Double*): Self = StObject.set(x, "alphas", js.Array(value*))
        
        inline def setColors(value: Double | js.Array[Double]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
        
        inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
        
        inline def setColorsVarargs(value: Double*): Self = StObject.set(x, "colors", js.Array(value*))
        
        inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
        
        inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
        
        inline def setFrame(value: String | Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
        
        inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightSegments(value: Double): Self = StObject.set(x, "heightSegments", value.asInstanceOf[js.Any])
        
        inline def setHeightSegmentsUndefined: Self = StObject.set(x, "heightSegments", js.undefined)
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setIsOrtho(value: Boolean): Self = StObject.set(x, "isOrtho", value.asInstanceOf[js.Any])
        
        inline def setIsOrthoUndefined: Self = StObject.set(x, "isOrtho", js.undefined)
        
        inline def setMesh(value: typings.phaser.Phaser.GameObjects.Mesh): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
        
        inline def setMeshUndefined: Self = StObject.set(x, "mesh", js.undefined)
        
        inline def setTexture(value: String | Texture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
        
        inline def setTile(value: Boolean): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
        
        inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthSegments(value: Double): Self = StObject.set(x, "widthSegments", value.asInstanceOf[js.Any])
        
        inline def setWidthSegmentsUndefined: Self = StObject.set(x, "widthSegments", js.undefined)
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      }
    }
    
    trait GenerateGridVertsResult extends StObject {
      
      /**
        * An array of alpha values, one per vertex, or a single alpha value applied to all vertices.
        */
      var alphas: js.UndefOr[Double | js.Array[Double]] = js.undefined
      
      /**
        * An array of colors, one per vertex, or a single color value applied to all vertices.
        */
      var colors: js.UndefOr[Double | js.Array[Double]] = js.undefined
      
      /**
        * An array of vertex indexes. This array will be empty if the `tile` parameter was `true`.
        */
      var indices: js.Array[Double]
      
      /**
        * An array of UV values, two per vertex.
        */
      var uvs: js.Array[Double]
      
      /**
        * An array of vertex values in x, y pairs.
        */
      var verts: js.Array[Double]
    }
    object GenerateGridVertsResult {
      
      inline def apply(indices: js.Array[Double], uvs: js.Array[Double], verts: js.Array[Double]): GenerateGridVertsResult = {
        val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], uvs = uvs.asInstanceOf[js.Any], verts = verts.asInstanceOf[js.Any])
        __obj.asInstanceOf[GenerateGridVertsResult]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: GenerateGridVertsResult] (val x: Self) extends AnyVal {
        
        inline def setAlphas(value: Double | js.Array[Double]): Self = StObject.set(x, "alphas", value.asInstanceOf[js.Any])
        
        inline def setAlphasUndefined: Self = StObject.set(x, "alphas", js.undefined)
        
        inline def setAlphasVarargs(value: Double*): Self = StObject.set(x, "alphas", js.Array(value*))
        
        inline def setColors(value: Double | js.Array[Double]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
        
        inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
        
        inline def setColorsVarargs(value: Double*): Self = StObject.set(x, "colors", js.Array(value*))
        
        inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
        
        inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
        
        inline def setUvs(value: js.Array[Double]): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
        
        inline def setUvsVarargs(value: Double*): Self = StObject.set(x, "uvs", js.Array(value*))
        
        inline def setVerts(value: js.Array[Double]): Self = StObject.set(x, "verts", value.asInstanceOf[js.Any])
        
        inline def setVertsVarargs(value: Double*): Self = StObject.set(x, "verts", js.Array(value*))
      }
    }
    
    trait GenerateVertsResult extends StObject {
      
      /**
        * An array of Face objects generated from the OBJ Data.
        */
      var faces: js.Array[Face]
      
      /**
        * An array of Vertex objects generated from the OBJ Data.
        */
      var vertices: js.Array[Vertex]
    }
    object GenerateVertsResult {
      
      inline def apply(faces: js.Array[Face], vertices: js.Array[Vertex]): GenerateVertsResult = {
        val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
        __obj.asInstanceOf[GenerateVertsResult]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: GenerateVertsResult] (val x: Self) extends AnyVal {
        
        inline def setFaces(value: js.Array[Face]): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
        
        inline def setFacesVarargs(value: Face*): Self = StObject.set(x, "faces", js.Array(value*))
        
        inline def setVertices(value: js.Array[Vertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
        
        inline def setVerticesVarargs(value: Vertex*): Self = StObject.set(x, "vertices", js.Array(value*))
      }
    }
    
    trait OBJData extends StObject {
      
      /**
        * An array of material library filenames found in the OBJ file.
        */
      var materialLibraries: js.Array[String]
      
      /**
        * If the obj was loaded with an mtl file, the parsed material names are stored in this object.
        */
      var materials: js.Object
      
      /**
        * An array of parsed models extracted from the OBJ file.
        */
      var models: js.Array[OBJModel]
    }
    object OBJData {
      
      inline def apply(materialLibraries: js.Array[String], materials: js.Object, models: js.Array[OBJModel]): OBJData = {
        val __obj = js.Dynamic.literal(materialLibraries = materialLibraries.asInstanceOf[js.Any], materials = materials.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any])
        __obj.asInstanceOf[OBJData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OBJData] (val x: Self) extends AnyVal {
        
        inline def setMaterialLibraries(value: js.Array[String]): Self = StObject.set(x, "materialLibraries", value.asInstanceOf[js.Any])
        
        inline def setMaterialLibrariesVarargs(value: String*): Self = StObject.set(x, "materialLibraries", js.Array(value*))
        
        inline def setMaterials(value: js.Object): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
        
        inline def setModels(value: js.Array[OBJModel]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
        
        inline def setModelsVarargs(value: OBJModel*): Self = StObject.set(x, "models", js.Array(value*))
      }
    }
    
    trait OBJFace extends StObject {
      
      /**
        * The name of the Group this Face is in.
        */
      var group: String
      
      /**
        * The name of the material this Face uses.
        */
      var material: String
      
      /**
        * An array of vertices in this Face.
        */
      var vertices: js.Array[OBJFaceVertice]
    }
    object OBJFace {
      
      inline def apply(group: String, material: String, vertices: js.Array[OBJFaceVertice]): OBJFace = {
        val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
        __obj.asInstanceOf[OBJFace]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OBJFace] (val x: Self) extends AnyVal {
        
        inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        inline def setMaterial(value: String): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
        
        inline def setVertices(value: js.Array[OBJFaceVertice]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
        
        inline def setVerticesVarargs(value: OBJFaceVertice*): Self = StObject.set(x, "vertices", js.Array(value*))
      }
    }
    
    trait OBJFaceVertice extends StObject {
      
      /**
        * The index in the `textureCoords` array that this vertex uses.
        */
      var textureCoordsIndex: Double
      
      /**
        * The index in the `vertices` array that this vertex uses.
        */
      var vertexIndex: Double
      
      /**
        * The index in the `vertexNormals` array that this vertex uses.
        */
      var vertexNormalIndex: Double
    }
    object OBJFaceVertice {
      
      inline def apply(textureCoordsIndex: Double, vertexIndex: Double, vertexNormalIndex: Double): OBJFaceVertice = {
        val __obj = js.Dynamic.literal(textureCoordsIndex = textureCoordsIndex.asInstanceOf[js.Any], vertexIndex = vertexIndex.asInstanceOf[js.Any], vertexNormalIndex = vertexNormalIndex.asInstanceOf[js.Any])
        __obj.asInstanceOf[OBJFaceVertice]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OBJFaceVertice] (val x: Self) extends AnyVal {
        
        inline def setTextureCoordsIndex(value: Double): Self = StObject.set(x, "textureCoordsIndex", value.asInstanceOf[js.Any])
        
        inline def setVertexIndex(value: Double): Self = StObject.set(x, "vertexIndex", value.asInstanceOf[js.Any])
        
        inline def setVertexNormalIndex(value: Double): Self = StObject.set(x, "vertexNormalIndex", value.asInstanceOf[js.Any])
      }
    }
    
    trait OBJModel extends StObject {
      
      /**
        * An array of Faces.
        */
      var faces: js.Array[OBJFace]
      
      /**
        * The name of the model.
        */
      var name: String
      
      /**
        * An array of texture coordinates.
        */
      var textureCoords: js.Array[UV]
      
      /**
        * An array of vertex normals.
        */
      var vertexNormals: js.Array[Vector3Like]
      
      /**
        * An array of vertices in the model.
        */
      var vertices: js.Array[Vector3Like]
    }
    object OBJModel {
      
      inline def apply(
        faces: js.Array[OBJFace],
        name: String,
        textureCoords: js.Array[UV],
        vertexNormals: js.Array[Vector3Like],
        vertices: js.Array[Vector3Like]
      ): OBJModel = {
        val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], textureCoords = textureCoords.asInstanceOf[js.Any], vertexNormals = vertexNormals.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
        __obj.asInstanceOf[OBJModel]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OBJModel] (val x: Self) extends AnyVal {
        
        inline def setFaces(value: js.Array[OBJFace]): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
        
        inline def setFacesVarargs(value: OBJFace*): Self = StObject.set(x, "faces", js.Array(value*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setTextureCoords(value: js.Array[UV]): Self = StObject.set(x, "textureCoords", value.asInstanceOf[js.Any])
        
        inline def setTextureCoordsVarargs(value: UV*): Self = StObject.set(x, "textureCoords", js.Array(value*))
        
        inline def setVertexNormals(value: js.Array[Vector3Like]): Self = StObject.set(x, "vertexNormals", value.asInstanceOf[js.Any])
        
        inline def setVertexNormalsVarargs(value: Vector3Like*): Self = StObject.set(x, "vertexNormals", js.Array(value*))
        
        inline def setVertices(value: js.Array[Vector3Like]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
        
        inline def setVerticesVarargs(value: Vector3Like*): Self = StObject.set(x, "vertices", js.Array(value*))
      }
    }
    
    trait UV extends StObject {
      
      /**
        * The u component.
        */
      var u: Double
      
      /**
        * The v component.
        */
      var v: Double
      
      /**
        * The w component.
        */
      var w: Double
    }
    object UV {
      
      inline def apply(u: Double, v: Double, w: Double): UV = {
        val __obj = js.Dynamic.literal(u = u.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
        __obj.asInstanceOf[UV]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: UV] (val x: Self) extends AnyVal {
        
        inline def setU(value: Double): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
        
        inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
        
        inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      }
    }
  }
}
