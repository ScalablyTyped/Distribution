package typings.pixiSettings

import typings.pixiConstants.mod.ENV
import typings.pixiConstants.mod.GC_MODES
import typings.pixiConstants.mod.MIPMAP_MODES
import typings.pixiConstants.mod.MSAA_QUALITY
import typings.pixiConstants.mod.PRECISION
import typings.pixiConstants.mod.SCALE_MODES
import typings.pixiConstants.mod.WRAP_MODES
import typings.pixiSettings.libAdapterMod.IAdapter
import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.pixiSettings.pixiSettingsStrings.notMultiplied
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSettingsMod {
  
  @JSImport("@pixi/settings/lib/settings", "settings")
  @js.native
  val settings: ISettings = js.native
  
  trait IRenderOptions extends StObject {
    
    var antialias: Boolean
    
    var autoDensity: Boolean
    
    var background: js.UndefOr[Double | String] = js.undefined
    
    var backgroundAlpha: Double
    
    var backgroundColor: Double | String
    
    var clearBeforeRender: Boolean
    
    var height: Double
    
    var hello: Boolean
    
    var legacy: Boolean
    
    var preserveDrawingBuffer: Boolean
    
    var useContextAlpha: Boolean | notMultiplied
    
    var view: ICanvas
    
    var width: Double
  }
  object IRenderOptions {
    
    inline def apply(
      antialias: Boolean,
      autoDensity: Boolean,
      backgroundAlpha: Double,
      backgroundColor: Double | String,
      clearBeforeRender: Boolean,
      height: Double,
      hello: Boolean,
      legacy: Boolean,
      preserveDrawingBuffer: Boolean,
      useContextAlpha: Boolean | notMultiplied,
      view: ICanvas,
      width: Double
    ): IRenderOptions = {
      val __obj = js.Dynamic.literal(antialias = antialias.asInstanceOf[js.Any], autoDensity = autoDensity.asInstanceOf[js.Any], backgroundAlpha = backgroundAlpha.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], clearBeforeRender = clearBeforeRender.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hello = hello.asInstanceOf[js.Any], legacy = legacy.asInstanceOf[js.Any], preserveDrawingBuffer = preserveDrawingBuffer.asInstanceOf[js.Any], useContextAlpha = useContextAlpha.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRenderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRenderOptions] (val x: Self) extends AnyVal {
      
      inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
      
      inline def setAutoDensity(value: Boolean): Self = StObject.set(x, "autoDensity", value.asInstanceOf[js.Any])
      
      inline def setBackground(value: Double | String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundAlpha(value: Double): Self = StObject.set(x, "backgroundAlpha", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColor(value: Double | String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setClearBeforeRender(value: Boolean): Self = StObject.set(x, "clearBeforeRender", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHello(value: Boolean): Self = StObject.set(x, "hello", value.asInstanceOf[js.Any])
      
      inline def setLegacy(value: Boolean): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
      
      inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
      
      inline def setUseContextAlpha(value: Boolean | notMultiplied): Self = StObject.set(x, "useContextAlpha", value.asInstanceOf[js.Any])
      
      inline def setView(value: ICanvas): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISettings extends StObject {
    
    var ADAPTER: IAdapter
    
    var ANISOTROPIC_LEVEL: Double
    
    var CAN_UPLOAD_SAME_BUFFER: Boolean
    
    var CREATE_IMAGE_BITMAP: Boolean
    
    var FAIL_IF_MAJOR_PERFORMANCE_CAVEAT: js.UndefOr[Boolean] = js.undefined
    
    var FILTER_MULTISAMPLE: MSAA_QUALITY
    
    var FILTER_RESOLUTION: Double
    
    var GC_MAX_CHECK_COUNT: Double
    
    var GC_MAX_IDLE: Double
    
    var GC_MODE: GC_MODES
    
    var MESH_CANVAS_PADDING: js.UndefOr[Double] = js.undefined
    
    var MIPMAP_TEXTURES: MIPMAP_MODES
    
    var PRECISION_FRAGMENT: PRECISION
    
    var PRECISION_VERTEX: PRECISION
    
    var PREFER_ENV: js.UndefOr[ENV] = js.undefined
    
    var RENDER_OPTIONS: IRenderOptions
    
    var RESOLUTION: Double
    
    var RETINA_PREFIX: js.UndefOr[js.RegExp] = js.undefined
    
    var ROUND_PIXELS: Boolean
    
    var SCALE_MODE: SCALE_MODES
    
    var SORTABLE_CHILDREN: js.UndefOr[Boolean] = js.undefined
    
    var SPRITE_BATCH_SIZE: Double
    
    var SPRITE_MAX_TEXTURES: Double
    
    var STRICT_TEXTURE_CACHE: js.UndefOr[Boolean] = js.undefined
    
    var TARGET_FPMS: js.UndefOr[Double] = js.undefined
    
    var UPLOADS_PER_FRAME: js.UndefOr[Double] = js.undefined
    
    var WRAP_MODE: WRAP_MODES
  }
  object ISettings {
    
    inline def apply(
      ADAPTER: IAdapter,
      ANISOTROPIC_LEVEL: Double,
      CAN_UPLOAD_SAME_BUFFER: Boolean,
      CREATE_IMAGE_BITMAP: Boolean,
      FILTER_MULTISAMPLE: MSAA_QUALITY,
      FILTER_RESOLUTION: Double,
      GC_MAX_CHECK_COUNT: Double,
      GC_MAX_IDLE: Double,
      GC_MODE: GC_MODES,
      MIPMAP_TEXTURES: MIPMAP_MODES,
      PRECISION_FRAGMENT: PRECISION,
      PRECISION_VERTEX: PRECISION,
      RENDER_OPTIONS: IRenderOptions,
      RESOLUTION: Double,
      ROUND_PIXELS: Boolean,
      SCALE_MODE: SCALE_MODES,
      SPRITE_BATCH_SIZE: Double,
      SPRITE_MAX_TEXTURES: Double,
      WRAP_MODE: WRAP_MODES
    ): ISettings = {
      val __obj = js.Dynamic.literal(ADAPTER = ADAPTER.asInstanceOf[js.Any], ANISOTROPIC_LEVEL = ANISOTROPIC_LEVEL.asInstanceOf[js.Any], CAN_UPLOAD_SAME_BUFFER = CAN_UPLOAD_SAME_BUFFER.asInstanceOf[js.Any], CREATE_IMAGE_BITMAP = CREATE_IMAGE_BITMAP.asInstanceOf[js.Any], FILTER_MULTISAMPLE = FILTER_MULTISAMPLE.asInstanceOf[js.Any], FILTER_RESOLUTION = FILTER_RESOLUTION.asInstanceOf[js.Any], GC_MAX_CHECK_COUNT = GC_MAX_CHECK_COUNT.asInstanceOf[js.Any], GC_MAX_IDLE = GC_MAX_IDLE.asInstanceOf[js.Any], GC_MODE = GC_MODE.asInstanceOf[js.Any], MIPMAP_TEXTURES = MIPMAP_TEXTURES.asInstanceOf[js.Any], PRECISION_FRAGMENT = PRECISION_FRAGMENT.asInstanceOf[js.Any], PRECISION_VERTEX = PRECISION_VERTEX.asInstanceOf[js.Any], RENDER_OPTIONS = RENDER_OPTIONS.asInstanceOf[js.Any], RESOLUTION = RESOLUTION.asInstanceOf[js.Any], ROUND_PIXELS = ROUND_PIXELS.asInstanceOf[js.Any], SCALE_MODE = SCALE_MODE.asInstanceOf[js.Any], SPRITE_BATCH_SIZE = SPRITE_BATCH_SIZE.asInstanceOf[js.Any], SPRITE_MAX_TEXTURES = SPRITE_MAX_TEXTURES.asInstanceOf[js.Any], WRAP_MODE = WRAP_MODE.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISettings] (val x: Self) extends AnyVal {
      
      inline def setADAPTER(value: IAdapter): Self = StObject.set(x, "ADAPTER", value.asInstanceOf[js.Any])
      
      inline def setANISOTROPIC_LEVEL(value: Double): Self = StObject.set(x, "ANISOTROPIC_LEVEL", value.asInstanceOf[js.Any])
      
      inline def setCAN_UPLOAD_SAME_BUFFER(value: Boolean): Self = StObject.set(x, "CAN_UPLOAD_SAME_BUFFER", value.asInstanceOf[js.Any])
      
      inline def setCREATE_IMAGE_BITMAP(value: Boolean): Self = StObject.set(x, "CREATE_IMAGE_BITMAP", value.asInstanceOf[js.Any])
      
      inline def setFAIL_IF_MAJOR_PERFORMANCE_CAVEAT(value: Boolean): Self = StObject.set(x, "FAIL_IF_MAJOR_PERFORMANCE_CAVEAT", value.asInstanceOf[js.Any])
      
      inline def setFAIL_IF_MAJOR_PERFORMANCE_CAVEATUndefined: Self = StObject.set(x, "FAIL_IF_MAJOR_PERFORMANCE_CAVEAT", js.undefined)
      
      inline def setFILTER_MULTISAMPLE(value: MSAA_QUALITY): Self = StObject.set(x, "FILTER_MULTISAMPLE", value.asInstanceOf[js.Any])
      
      inline def setFILTER_RESOLUTION(value: Double): Self = StObject.set(x, "FILTER_RESOLUTION", value.asInstanceOf[js.Any])
      
      inline def setGC_MAX_CHECK_COUNT(value: Double): Self = StObject.set(x, "GC_MAX_CHECK_COUNT", value.asInstanceOf[js.Any])
      
      inline def setGC_MAX_IDLE(value: Double): Self = StObject.set(x, "GC_MAX_IDLE", value.asInstanceOf[js.Any])
      
      inline def setGC_MODE(value: GC_MODES): Self = StObject.set(x, "GC_MODE", value.asInstanceOf[js.Any])
      
      inline def setMESH_CANVAS_PADDING(value: Double): Self = StObject.set(x, "MESH_CANVAS_PADDING", value.asInstanceOf[js.Any])
      
      inline def setMESH_CANVAS_PADDINGUndefined: Self = StObject.set(x, "MESH_CANVAS_PADDING", js.undefined)
      
      inline def setMIPMAP_TEXTURES(value: MIPMAP_MODES): Self = StObject.set(x, "MIPMAP_TEXTURES", value.asInstanceOf[js.Any])
      
      inline def setPRECISION_FRAGMENT(value: PRECISION): Self = StObject.set(x, "PRECISION_FRAGMENT", value.asInstanceOf[js.Any])
      
      inline def setPRECISION_VERTEX(value: PRECISION): Self = StObject.set(x, "PRECISION_VERTEX", value.asInstanceOf[js.Any])
      
      inline def setPREFER_ENV(value: ENV): Self = StObject.set(x, "PREFER_ENV", value.asInstanceOf[js.Any])
      
      inline def setPREFER_ENVUndefined: Self = StObject.set(x, "PREFER_ENV", js.undefined)
      
      inline def setRENDER_OPTIONS(value: IRenderOptions): Self = StObject.set(x, "RENDER_OPTIONS", value.asInstanceOf[js.Any])
      
      inline def setRESOLUTION(value: Double): Self = StObject.set(x, "RESOLUTION", value.asInstanceOf[js.Any])
      
      inline def setRETINA_PREFIX(value: js.RegExp): Self = StObject.set(x, "RETINA_PREFIX", value.asInstanceOf[js.Any])
      
      inline def setRETINA_PREFIXUndefined: Self = StObject.set(x, "RETINA_PREFIX", js.undefined)
      
      inline def setROUND_PIXELS(value: Boolean): Self = StObject.set(x, "ROUND_PIXELS", value.asInstanceOf[js.Any])
      
      inline def setSCALE_MODE(value: SCALE_MODES): Self = StObject.set(x, "SCALE_MODE", value.asInstanceOf[js.Any])
      
      inline def setSORTABLE_CHILDREN(value: Boolean): Self = StObject.set(x, "SORTABLE_CHILDREN", value.asInstanceOf[js.Any])
      
      inline def setSORTABLE_CHILDRENUndefined: Self = StObject.set(x, "SORTABLE_CHILDREN", js.undefined)
      
      inline def setSPRITE_BATCH_SIZE(value: Double): Self = StObject.set(x, "SPRITE_BATCH_SIZE", value.asInstanceOf[js.Any])
      
      inline def setSPRITE_MAX_TEXTURES(value: Double): Self = StObject.set(x, "SPRITE_MAX_TEXTURES", value.asInstanceOf[js.Any])
      
      inline def setSTRICT_TEXTURE_CACHE(value: Boolean): Self = StObject.set(x, "STRICT_TEXTURE_CACHE", value.asInstanceOf[js.Any])
      
      inline def setSTRICT_TEXTURE_CACHEUndefined: Self = StObject.set(x, "STRICT_TEXTURE_CACHE", js.undefined)
      
      inline def setTARGET_FPMS(value: Double): Self = StObject.set(x, "TARGET_FPMS", value.asInstanceOf[js.Any])
      
      inline def setTARGET_FPMSUndefined: Self = StObject.set(x, "TARGET_FPMS", js.undefined)
      
      inline def setUPLOADS_PER_FRAME(value: Double): Self = StObject.set(x, "UPLOADS_PER_FRAME", value.asInstanceOf[js.Any])
      
      inline def setUPLOADS_PER_FRAMEUndefined: Self = StObject.set(x, "UPLOADS_PER_FRAME", js.undefined)
      
      inline def setWRAP_MODE(value: WRAP_MODES): Self = StObject.set(x, "WRAP_MODE", value.asInstanceOf[js.Any])
    }
  }
}
