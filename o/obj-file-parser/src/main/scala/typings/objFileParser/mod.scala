package typings.objFileParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Class module */
  @JSImport("obj-file-parser", JSImport.Namespace)
  @js.native
  class ^ protected () extends ObjFileParser {
    def this(fileContents: js.Any) = this()
    def this(fileContents: js.Any, defaultModelName: js.Any) = this()
  }
  
  @js.native
  trait Face extends StObject {
    
    var group: String = js.native
    
    var material: js.Any = js.native
    
    var smoothingGroup: Double = js.native
    
    var vertices: js.Array[FaceVertex] = js.native
  }
  object Face {
    
    @scala.inline
    def apply(group: String, material: js.Any, smoothingGroup: Double, vertices: js.Array[FaceVertex]): Face = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any], smoothingGroup = smoothingGroup.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Face]
    }
    
    @scala.inline
    implicit class FaceMutableBuilder[Self <: Face] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaterial(value: js.Any): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothingGroup(value: Double): Self = StObject.set(x, "smoothingGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertices(value: js.Array[FaceVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticesVarargs(value: FaceVertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FaceVertex extends StObject {
    
    var textureCoordsIndex: Double = js.native
    
    var vertexIndex: Double = js.native
    
    var vertexNormalIndex: Double = js.native
  }
  object FaceVertex {
    
    @scala.inline
    def apply(textureCoordsIndex: Double, vertexIndex: Double, vertexNormalIndex: Double): FaceVertex = {
      val __obj = js.Dynamic.literal(textureCoordsIndex = textureCoordsIndex.asInstanceOf[js.Any], vertexIndex = vertexIndex.asInstanceOf[js.Any], vertexNormalIndex = vertexNormalIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaceVertex]
    }
    
    @scala.inline
    implicit class FaceVertexMutableBuilder[Self <: FaceVertex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTextureCoordsIndex(value: Double): Self = StObject.set(x, "textureCoordsIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexIndex(value: Double): Self = StObject.set(x, "vertexIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexNormalIndex(value: Double): Self = StObject.set(x, "vertexNormalIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ObjFile extends StObject {
    
    var materialLibraries: js.Array[_] = js.native
    
    var models: js.Array[ObjModel] = js.native
  }
  object ObjFile {
    
    @scala.inline
    def apply(materialLibraries: js.Array[_], models: js.Array[ObjModel]): ObjFile = {
      val __obj = js.Dynamic.literal(materialLibraries = materialLibraries.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjFile]
    }
    
    @scala.inline
    implicit class ObjFileMutableBuilder[Self <: ObjFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaterialLibraries(value: js.Array[_]): Self = StObject.set(x, "materialLibraries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaterialLibrariesVarargs(value: js.Any*): Self = StObject.set(x, "materialLibraries", js.Array(value :_*))
      
      @scala.inline
      def setModels(value: js.Array[ObjModel]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelsVarargs(value: ObjModel*): Self = StObject.set(x, "models", js.Array(value :_*))
    }
  }
  
  /* Class module */
  @js.native
  trait ObjFileParser extends StObject {
    
    def parse(): ObjFile = js.native
  }
  object ObjFileParser {
    
    @scala.inline
    def apply(parse: () => ObjFile): ObjFileParser = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction0(parse))
      __obj.asInstanceOf[ObjFileParser]
    }
    
    @scala.inline
    implicit class ObjFileParserMutableBuilder[Self <: ObjFileParser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParse(value: () => ObjFile): Self = StObject.set(x, "parse", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ObjModel extends StObject {
    
    var faces: js.Array[Face] = js.native
    
    var name: String = js.native
    
    var textureCoords: js.Array[VertexTexture] = js.native
    
    var vertexNormals: js.Array[Vertex] = js.native
    
    var vertices: js.Array[Vertex] = js.native
  }
  object ObjModel {
    
    @scala.inline
    def apply(
      faces: js.Array[Face],
      name: String,
      textureCoords: js.Array[VertexTexture],
      vertexNormals: js.Array[Vertex],
      vertices: js.Array[Vertex]
    ): ObjModel = {
      val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], textureCoords = textureCoords.asInstanceOf[js.Any], vertexNormals = vertexNormals.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjModel]
    }
    
    @scala.inline
    implicit class ObjModelMutableBuilder[Self <: ObjModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFaces(value: js.Array[Face]): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacesVarargs(value: Face*): Self = StObject.set(x, "faces", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextureCoords(value: js.Array[VertexTexture]): Self = StObject.set(x, "textureCoords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextureCoordsVarargs(value: VertexTexture*): Self = StObject.set(x, "textureCoords", js.Array(value :_*))
      
      @scala.inline
      def setVertexNormals(value: js.Array[Vertex]): Self = StObject.set(x, "vertexNormals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexNormalsVarargs(value: Vertex*): Self = StObject.set(x, "vertexNormals", js.Array(value :_*))
      
      @scala.inline
      def setVertices(value: js.Array[Vertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticesVarargs(value: Vertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Vertex extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  object Vertex {
    
    @scala.inline
    def apply(x: Double, y: Double, z: Double): Vertex = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vertex]
    }
    
    @scala.inline
    implicit class VertexMutableBuilder[Self <: Vertex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VertexTexture extends StObject {
    
    var u: Double = js.native
    
    var v: Double = js.native
    
    var w: Double = js.native
  }
  object VertexTexture {
    
    @scala.inline
    def apply(u: Double, v: Double, w: Double): VertexTexture = {
      val __obj = js.Dynamic.literal(u = u.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[VertexTexture]
    }
    
    @scala.inline
    implicit class VertexTextureMutableBuilder[Self <: VertexTexture] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setU(value: Double): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
}
