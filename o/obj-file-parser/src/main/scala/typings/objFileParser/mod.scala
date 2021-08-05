package typings.objFileParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Class module */
  @JSImport("obj-file-parser", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with ObjFileParser {
    def this(fileContents: js.Any) = this()
    def this(fileContents: js.Any, defaultModelName: js.Any) = this()
    
    /* CompleteClass */
    override def parse(): ObjFile = js.native
  }
  
  trait Face extends StObject {
    
    var group: String
    
    var material: js.Any
    
    var smoothingGroup: Double
    
    var vertices: js.Array[FaceVertex]
  }
  object Face {
    
    inline def apply(group: String, material: js.Any, smoothingGroup: Double, vertices: js.Array[FaceVertex]): Face = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any], smoothingGroup = smoothingGroup.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Face]
    }
    
    extension [Self <: Face](x: Self) {
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setMaterial(value: js.Any): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      inline def setSmoothingGroup(value: Double): Self = StObject.set(x, "smoothingGroup", value.asInstanceOf[js.Any])
      
      inline def setVertices(value: js.Array[FaceVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      inline def setVerticesVarargs(value: FaceVertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
    }
  }
  
  trait FaceVertex extends StObject {
    
    var textureCoordsIndex: Double
    
    var vertexIndex: Double
    
    var vertexNormalIndex: Double
  }
  object FaceVertex {
    
    inline def apply(textureCoordsIndex: Double, vertexIndex: Double, vertexNormalIndex: Double): FaceVertex = {
      val __obj = js.Dynamic.literal(textureCoordsIndex = textureCoordsIndex.asInstanceOf[js.Any], vertexIndex = vertexIndex.asInstanceOf[js.Any], vertexNormalIndex = vertexNormalIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaceVertex]
    }
    
    extension [Self <: FaceVertex](x: Self) {
      
      inline def setTextureCoordsIndex(value: Double): Self = StObject.set(x, "textureCoordsIndex", value.asInstanceOf[js.Any])
      
      inline def setVertexIndex(value: Double): Self = StObject.set(x, "vertexIndex", value.asInstanceOf[js.Any])
      
      inline def setVertexNormalIndex(value: Double): Self = StObject.set(x, "vertexNormalIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait ObjFile extends StObject {
    
    var materialLibraries: js.Array[js.Any]
    
    var models: js.Array[ObjModel]
  }
  object ObjFile {
    
    inline def apply(materialLibraries: js.Array[js.Any], models: js.Array[ObjModel]): ObjFile = {
      val __obj = js.Dynamic.literal(materialLibraries = materialLibraries.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjFile]
    }
    
    extension [Self <: ObjFile](x: Self) {
      
      inline def setMaterialLibraries(value: js.Array[js.Any]): Self = StObject.set(x, "materialLibraries", value.asInstanceOf[js.Any])
      
      inline def setMaterialLibrariesVarargs(value: js.Any*): Self = StObject.set(x, "materialLibraries", js.Array(value :_*))
      
      inline def setModels(value: js.Array[ObjModel]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
      
      inline def setModelsVarargs(value: ObjModel*): Self = StObject.set(x, "models", js.Array(value :_*))
    }
  }
  
  /* Class module */
  trait ObjFileParser extends StObject {
    
    def parse(): ObjFile
  }
  object ObjFileParser {
    
    inline def apply(parse: () => ObjFile): ObjFileParser = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction0(parse))
      __obj.asInstanceOf[ObjFileParser]
    }
    
    extension [Self <: ObjFileParser](x: Self) {
      
      inline def setParse(value: () => ObjFile): Self = StObject.set(x, "parse", js.Any.fromFunction0(value))
    }
  }
  
  trait ObjModel extends StObject {
    
    var faces: js.Array[Face]
    
    var name: String
    
    var textureCoords: js.Array[VertexTexture]
    
    var vertexNormals: js.Array[Vertex]
    
    var vertices: js.Array[Vertex]
  }
  object ObjModel {
    
    inline def apply(
      faces: js.Array[Face],
      name: String,
      textureCoords: js.Array[VertexTexture],
      vertexNormals: js.Array[Vertex],
      vertices: js.Array[Vertex]
    ): ObjModel = {
      val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], textureCoords = textureCoords.asInstanceOf[js.Any], vertexNormals = vertexNormals.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjModel]
    }
    
    extension [Self <: ObjModel](x: Self) {
      
      inline def setFaces(value: js.Array[Face]): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
      
      inline def setFacesVarargs(value: Face*): Self = StObject.set(x, "faces", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTextureCoords(value: js.Array[VertexTexture]): Self = StObject.set(x, "textureCoords", value.asInstanceOf[js.Any])
      
      inline def setTextureCoordsVarargs(value: VertexTexture*): Self = StObject.set(x, "textureCoords", js.Array(value :_*))
      
      inline def setVertexNormals(value: js.Array[Vertex]): Self = StObject.set(x, "vertexNormals", value.asInstanceOf[js.Any])
      
      inline def setVertexNormalsVarargs(value: Vertex*): Self = StObject.set(x, "vertexNormals", js.Array(value :_*))
      
      inline def setVertices(value: js.Array[Vertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      inline def setVerticesVarargs(value: Vertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
    }
  }
  
  trait Vertex extends StObject {
    
    var x: Double
    
    var y: Double
    
    var z: Double
  }
  object Vertex {
    
    inline def apply(x: Double, y: Double, z: Double): Vertex = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vertex]
    }
    
    extension [Self <: Vertex](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  trait VertexTexture extends StObject {
    
    var u: Double
    
    var v: Double
    
    var w: Double
  }
  object VertexTexture {
    
    inline def apply(u: Double, v: Double, w: Double): VertexTexture = {
      val __obj = js.Dynamic.literal(u = u.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[VertexTexture]
    }
    
    extension [Self <: VertexTexture](x: Self) {
      
      inline def setU(value: Double): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
}
