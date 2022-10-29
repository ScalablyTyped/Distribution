package typings.pixiCore

import typings.pixiCore.libTexturesBaseTextureMod.BaseTexture
import typings.pixiCore.libTexturesResourcesAbstractMultiResourceMod.AbstractMultiResource
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod._IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.pixiCoreInts.`6`
import typings.pixiMath.mod.ISize
import typings.pixiUtils.libTypesMod.ArrayFixed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTexturesResourcesCubeResourceMod {
  
  @JSImport("@pixi/core/lib/textures/resources/CubeResource", "CubeResource")
  @js.native
  /**
    * @param {Array<string|PIXI.Resource>} [source] - Collection of URLs or resources
    *        to use as the sides of the cube.
    * @param options - ImageResource options
    * @param {number} [options.width] - Width of resource
    * @param {number} [options.height] - Height of resource
    * @param {number} [options.autoLoad=true] - Whether to auto-load resources
    * @param {number} [options.linkBaseTexture=true] - In case BaseTextures are supplied,
    *   whether to copy them or use
    */
  open class CubeResource () extends AbstractMultiResource {
    def this(source: ArrayFixed[String | Resource, `6`]) = this()
    def this(source: Unit, options: ICubeResourceOptions) = this()
    def this(source: ArrayFixed[String | Resource, `6`], options: ICubeResourceOptions) = this()
    
    def addBaseTextureAt(baseTexture: BaseTexture[Resource, IAutoDetectOptions], index: Double, linkBaseTexture: Boolean): this.type = js.native
    
    @JSName("items")
    var items_CubeResource: ArrayFixed[BaseTexture[Resource, IAutoDetectOptions], `6`] = js.native
    
    /**
      * In case BaseTextures are supplied, whether to use same resource or bind baseTexture itself.
      * @protected
      */
    var linkBaseTexture: Boolean = js.native
  }
  /* static members */
  object CubeResource {
    
    @JSImport("@pixi/core/lib/textures/resources/CubeResource", "CubeResource")
    @js.native
    val ^ : js.Any = js.native
    
    /** Number of texture sides to store for CubeResources. */
    @JSImport("@pixi/core/lib/textures/resources/CubeResource", "CubeResource.SIDES")
    @js.native
    def SIDES: Double = js.native
    inline def SIDES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIDES")(x.asInstanceOf[js.Any])
    
    /**
      * Used to auto-detect the type of resource.
      * @param {*} source - The source object
      * @returns {boolean} `true` if source is an array of 6 elements
      */
    inline def test(source: Any): /* is @pixi/utils.@pixi/utils/lib/types.ArrayFixed<string | @pixi/core.@pixi/core/lib/textures/resources/Resource.Resource, 6> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[/* is @pixi/utils.@pixi/utils/lib/types.ArrayFixed<string | @pixi/core.@pixi/core/lib/textures/resources/Resource.Resource, 6> */ Boolean]
  }
  
  trait ICubeResourceOptions
    extends StObject
       with ISize
       with _IAutoDetectOptions {
    
    /** Whether to auto-load resources */
    var autoLoad: js.UndefOr[Boolean] = js.undefined
    
    /** In case BaseTextures are supplied, whether to copy them or use. */
    var linkBaseTexture: js.UndefOr[Boolean] = js.undefined
  }
  object ICubeResourceOptions {
    
    inline def apply(height: Double, width: Double): ICubeResourceOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICubeResourceOptions]
    }
    
    extension [Self <: ICubeResourceOptions](x: Self) {
      
      inline def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
      
      inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
      
      inline def setLinkBaseTexture(value: Boolean): Self = StObject.set(x, "linkBaseTexture", value.asInstanceOf[js.Any])
      
      inline def setLinkBaseTextureUndefined: Self = StObject.set(x, "linkBaseTexture", js.undefined)
    }
  }
}
