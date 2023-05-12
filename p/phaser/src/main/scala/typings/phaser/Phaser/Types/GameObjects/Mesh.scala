package typings.phaser.Phaser.Types.GameObjects

import typings.phaser.Phaser.Textures.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mesh {
  
  trait MeshConfig
    extends StObject
       with GameObjectConfig {
    
    /**
      * An array of alpha values, one per vertex, or a single alpha value applied to all vertices.
      */
    var alphas: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * An array of colors, one per vertex, or a single color value applied to all vertices.
      */
    var colors: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * Does the vertices data include a `z` component?
      */
    var containsZ: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional frame from the Texture this Game Object is rendering with.
      */
    var frame: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Optional vertex indicies array. If you don't have one, pass `null` or an empty array.
      */
    var indicies: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      */
    var key: js.UndefOr[String | Texture] = js.undefined
    
    /**
      * Optional vertex normals array. If you don't have one, pass `null` or an empty array.
      */
    var normals: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The UVs pairs array.
      */
    var uvs: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The vertices array. Either `xy` pairs, or `xyz` if the `containsZ` parameter is `true`.
      */
    var vertices: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object MeshConfig {
    
    inline def apply(): MeshConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MeshConfig] (val x: Self) extends AnyVal {
      
      inline def setAlphas(value: Double | js.Array[Double]): Self = StObject.set(x, "alphas", value.asInstanceOf[js.Any])
      
      inline def setAlphasUndefined: Self = StObject.set(x, "alphas", js.undefined)
      
      inline def setAlphasVarargs(value: Double*): Self = StObject.set(x, "alphas", js.Array(value*))
      
      inline def setColors(value: Double | js.Array[Double]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: Double*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setContainsZ(value: Boolean): Self = StObject.set(x, "containsZ", value.asInstanceOf[js.Any])
      
      inline def setContainsZUndefined: Self = StObject.set(x, "containsZ", js.undefined)
      
      inline def setFrame(value: String | Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setIndicies(value: js.Array[Double]): Self = StObject.set(x, "indicies", value.asInstanceOf[js.Any])
      
      inline def setIndiciesUndefined: Self = StObject.set(x, "indicies", js.undefined)
      
      inline def setIndiciesVarargs(value: Double*): Self = StObject.set(x, "indicies", js.Array(value*))
      
      inline def setKey(value: String | Texture): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setNormals(value: js.Array[Double]): Self = StObject.set(x, "normals", value.asInstanceOf[js.Any])
      
      inline def setNormalsUndefined: Self = StObject.set(x, "normals", js.undefined)
      
      inline def setNormalsVarargs(value: Double*): Self = StObject.set(x, "normals", js.Array(value*))
      
      inline def setUvs(value: js.Array[Double]): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
      
      inline def setUvsUndefined: Self = StObject.set(x, "uvs", js.undefined)
      
      inline def setUvsVarargs(value: Double*): Self = StObject.set(x, "uvs", js.Array(value*))
      
      inline def setVertices(value: js.Array[Double]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
      
      inline def setVerticesVarargs(value: Double*): Self = StObject.set(x, "vertices", js.Array(value*))
    }
  }
}
