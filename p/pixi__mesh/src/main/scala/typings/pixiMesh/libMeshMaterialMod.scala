package typings.pixiMesh

import typings.pixiColor.libColorMod.ColorSource
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.Program
import typings.pixiCore.mod.Shader
import typings.pixiCore.mod.Texture
import typings.pixiCore.mod.TextureMatrix
import typings.pixiUtils.libTypesMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMeshMaterialMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.MeshMaterial * / any */ @JSImport("@pixi/mesh/lib/MeshMaterial", "MeshMaterial")
  @js.native
  open class MeshMaterial protected () extends Shader {
    /**
      * @param uSampler - Texture that material uses to render.
      * @param options - Additional options
      * @param {number} [options.alpha=1] - Default alpha.
      * @param {PIXI.ColorSource} [options.tint=0xFFFFFF] - Default tint.
      * @param {string} [options.pluginName='batch'] - Renderer plugin for batching.
      * @param {PIXI.Program} [options.program=0xFFFFFF] - Custom program.
      * @param {object} [options.uniforms] - Custom uniforms.
      */
    def this(uSampler: Texture[Resource]) = this()
    def this(uSampler: Texture[Resource], options: IMeshMaterialOptions) = this()
    
    /* private */ var _alpha: Any = js.native
    
    /**
      * Only do update if tint or alpha changes.
      * @private
      * @default false
      */
    /* private */ var _colorDirty: Any = js.native
    
    /* private */ var _tintColor: Any = js.native
    
    var _tintRGB: Double = js.native
    
    def alpha: Double = js.native
    /**
      * This gets automatically set by the object using this.
      * @default 1
      */
    def alpha_=(value: Double): Unit = js.native
    
    /**
      * `true` if shader can be batch with the renderer's batch system.
      * @default true
      */
    var batchable: Boolean = js.native
    
    /**
      * Renderer plugin for batching.
      * @default 'batch'
      */
    var pluginName: String = js.native
    
    /** Reference to the texture being rendered. */
    def texture: Texture[Resource] = js.native
    def texture_=(value: Texture[Resource]): Unit = js.native
    
    def tint: ColorSource = js.native
    
    /**
      * Get the internal number from tint color
      * @ignore
      */
    def tintValue: Double = js.native
    
    /**
      * Multiply tint for the material.
      * @default 0xFFFFFF
      */
    def tint_=(value: ColorSource): Unit = js.native
    
    /** Gets called automatically by the Mesh. Intended to be overridden for custom {@link PIXI.MeshMaterial} objects. */
    def update(): Unit = js.native
    
    /**
      * TextureMatrix instance for this Mesh, used to track Texture changes.
      * @readonly
      */
    val uvMatrix: TextureMatrix = js.native
  }
  
  trait IMeshMaterialOptions extends StObject {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var pluginName: js.UndefOr[String] = js.undefined
    
    var program: js.UndefOr[Program] = js.undefined
    
    var tint: js.UndefOr[ColorSource] = js.undefined
    
    var uniforms: js.UndefOr[Dict[Any]] = js.undefined
  }
  object IMeshMaterialOptions {
    
    inline def apply(): IMeshMaterialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMeshMaterialOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMeshMaterialOptions] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setPluginName(value: String): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
      
      inline def setPluginNameUndefined: Self = StObject.set(x, "pluginName", js.undefined)
      
      inline def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
      
      inline def setTint(value: ColorSource): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
      
      inline def setTintUndefined: Self = StObject.set(x, "tint", js.undefined)
      
      inline def setTintVarargs(value: Double*): Self = StObject.set(x, "tint", js.Array(value*))
      
      inline def setUniforms(value: Dict[Any]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
    }
  }
}
