package typings.pixiCore

import typings.pixiColor.libColorMod.ColorSource
import typings.pixiConstants.mod.RENDERER_TYPE
import typings.pixiCore.libBackgroundBackgroundSystemMod.BackgroundSystemOptions
import typings.pixiCore.libContextContextSystemMod.ContextSystemOptions
import typings.pixiCore.libPluginPluginSystemMod.IRendererPlugins
import typings.pixiCore.libRenderTextureGenerateTextureSystemMod.IGenerateTextureOptions
import typings.pixiCore.libRenderTextureRenderTextureMod.RenderTexture
import typings.pixiCore.libStartupStartupSystemMod.StartupSystemOptions
import typings.pixiCore.libSystemSystemManagerMod.SystemManager
import typings.pixiCore.libSystemsMod.BackgroundSystem
import typings.pixiCore.libTexturesBaseTextureMod.ImageSource
import typings.pixiCore.libViewViewSystemMod.ViewSystemOptions
import typings.pixiMath.mod.Matrix
import typings.pixiMath.mod.Rectangle
import typings.pixiMath.mod.Transform
import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.std.GLenum
import typings.std.GLint
import typings.std.GLsizei
import typings.std.WebGL2RenderingContext
import typings.std.WebGLPowerPreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIrendererMod {
  
  type IRenderOptions = IRendererOptions
  
  @js.native
  trait IRenderableContainer
    extends StObject
       with IRenderableObject {
    
    /** Get Local bounds for container */
    def getLocalBounds(): Rectangle = js.native
    def getLocalBounds(rect: Unit, skipChildrenUpdate: Boolean): Rectangle = js.native
    def getLocalBounds(rect: Rectangle): Rectangle = js.native
    def getLocalBounds(rect: Rectangle, skipChildrenUpdate: Boolean): Rectangle = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.IRenderableObject * / any */ trait IRenderableObject extends StObject {
    
    /** After method for transform updates */
    def disableTempParent(parent: IRenderableContainer): Unit
    
    /** Before method for transform updates */
    def enableTempParent(): IRenderableContainer
    
    /** Object must have a parent container */
    var parent: IRenderableContainer
    
    /** Render object directly */
    def render(renderer: IRenderer[ICanvas]): Unit
    
    /** Object must have a transform */
    var transform: Transform
    
    /** Update the transforms */
    def updateTransform(): Unit
  }
  object IRenderableObject {
    
    inline def apply(
      disableTempParent: IRenderableContainer => Unit,
      enableTempParent: () => IRenderableContainer,
      parent: IRenderableContainer,
      render: IRenderer[ICanvas] => Unit,
      transform: Transform,
      updateTransform: () => Unit
    ): IRenderableObject = {
      val __obj = js.Dynamic.literal(disableTempParent = js.Any.fromFunction1(disableTempParent), enableTempParent = js.Any.fromFunction0(enableTempParent), parent = parent.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), transform = transform.asInstanceOf[js.Any], updateTransform = js.Any.fromFunction0(updateTransform))
      __obj.asInstanceOf[IRenderableObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRenderableObject] (val x: Self) extends AnyVal {
      
      inline def setDisableTempParent(value: IRenderableContainer => Unit): Self = StObject.set(x, "disableTempParent", js.Any.fromFunction1(value))
      
      inline def setEnableTempParent(value: () => IRenderableContainer): Self = StObject.set(x, "enableTempParent", js.Any.fromFunction0(value))
      
      inline def setParent(value: IRenderableContainer): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setRender(value: IRenderer[ICanvas] => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setUpdateTransform(value: () => Unit): Self = StObject.set(x, "updateTransform", js.Any.fromFunction0(value))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.IRenderer * / any */ @js.native
  trait IRenderer[VIEW /* <: ICanvas */] extends SystemManager[IRenderer[ICanvas]] {
    
    /** Whether CSS dimensions of canvas view should be resized to screen dimensions automatically. */
    val autoDensity: Boolean = js.native
    
    /** Background color, alpha and clear behavior */
    val background: BackgroundSystem = js.native
    
    def clear(): Unit = js.native
    
    def destroy(removeView: Boolean): Unit = js.native
    
    def generateTexture(displayObject: IRenderableObject): RenderTexture = js.native
    def generateTexture(displayObject: IRenderableObject, options: IGenerateTextureOptions): RenderTexture = js.native
    
    /** the height of the screen */
    val height: Double = js.native
    
    /** the last object rendered by the renderer. Useful for other plugins like interaction managers */
    val lastObjectRendered: IRenderableObject = js.native
    
    /**
      * The options passed in to create a new instance of the renderer.
      * @type {PIXI.IRendererOptions}
      */
    val options: IRendererOptions = js.native
    
    /** Collection of plugins */
    val plugins: IRendererPlugins = js.native
    
    def render(displayObject: IRenderableObject): Unit = js.native
    def render(displayObject: IRenderableObject, options: IRendererRenderOptions): Unit = js.native
    
    /** When logging Pixi to the console, this is the name we will show */
    val rendererLogId: String = js.native
    
    /** Flag if we are rendering to the screen vs renderTexture */
    val renderingToScreen: Boolean = js.native
    
    def reset(): Unit = js.native
    
    def resize(width: Double, height: Double): Unit = js.native
    
    /** The resolution / device pixel ratio of the renderer. */
    var resolution: Double = js.native
    
    /**
      * Measurements of the screen. (0, 0, screenWidth, screenHeight).
      * Its safe to use as filterArea or hitArea for the whole stage.
      */
    val screen: Rectangle = js.native
    
    /**
      * The type of the renderer.
      * @see PIXI.RENDERER_TYPE
      */
    val `type`: RENDERER_TYPE = js.native
    
    /** The canvas element that everything is drawn to.*/
    val view: VIEW = js.native
    
    /** the width of the screen */
    val width: Double = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.IRendererOptions * / any */ trait IRendererOptions
    extends StObject
       with BackgroundSystemOptions
       with ContextSystemOptions
       with ViewSystemOptions
       with StartupSystemOptions
  object IRendererOptions {
    
    inline def apply(
      antialias: Boolean,
      backgroundAlpha: Double,
      backgroundColor: ColorSource,
      clearBeforeRender: Boolean,
      hello: Boolean,
      powerPreference: WebGLPowerPreference,
      premultipliedAlpha: Boolean,
      preserveDrawingBuffer: Boolean
    ): IRendererOptions = {
      val __obj = js.Dynamic.literal(antialias = antialias.asInstanceOf[js.Any], backgroundAlpha = backgroundAlpha.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], clearBeforeRender = clearBeforeRender.asInstanceOf[js.Any], hello = hello.asInstanceOf[js.Any], powerPreference = powerPreference.asInstanceOf[js.Any], premultipliedAlpha = premultipliedAlpha.asInstanceOf[js.Any], preserveDrawingBuffer = preserveDrawingBuffer.asInstanceOf[js.Any], context = null)
      __obj.asInstanceOf[IRendererOptions]
    }
  }
  
  trait IRendererRenderOptions extends StObject {
    
    var blit: js.UndefOr[Boolean] = js.undefined
    
    var clear: js.UndefOr[Boolean] = js.undefined
    
    var renderTexture: js.UndefOr[RenderTexture] = js.undefined
    
    var skipUpdateTransform: js.UndefOr[Boolean] = js.undefined
    
    var transform: js.UndefOr[Matrix] = js.undefined
  }
  object IRendererRenderOptions {
    
    inline def apply(): IRendererRenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRendererRenderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRendererRenderOptions] (val x: Self) extends AnyVal {
      
      inline def setBlit(value: Boolean): Self = StObject.set(x, "blit", value.asInstanceOf[js.Any])
      
      inline def setBlitUndefined: Self = StObject.set(x, "blit", js.undefined)
      
      inline def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setRenderTexture(value: RenderTexture): Self = StObject.set(x, "renderTexture", value.asInstanceOf[js.Any])
      
      inline def setRenderTextureUndefined: Self = StObject.set(x, "renderTexture", js.undefined)
      
      inline def setSkipUpdateTransform(value: Boolean): Self = StObject.set(x, "skipUpdateTransform", value.asInstanceOf[js.Any])
      
      inline def setSkipUpdateTransformUndefined: Self = StObject.set(x, "skipUpdateTransform", js.undefined)
      
      inline def setTransform(value: Matrix): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  @js.native
  trait IRenderingContext
    extends StObject
       with WebGL2RenderingContext {
    
    def texImage2D(
      target: GLenum,
      level: GLint,
      internalformat: GLint,
      format: GLenum,
      `type`: GLenum,
      source: ImageSource
    ): Unit = js.native
    def texImage2D(
      target: GLenum,
      level: GLint,
      internalformat: GLint,
      width: GLsizei,
      height: GLsizei,
      border: GLint,
      format: GLenum,
      `type`: GLenum,
      source: ImageSource
    ): Unit = js.native
    
    def texSubImage2D(
      target: GLenum,
      level: GLint,
      xoffset: GLint,
      yoffset: GLint,
      format: GLenum,
      `type`: GLenum,
      source: ImageSource
    ): Unit = js.native
    def texSubImage2D(
      target: GLenum,
      level: GLint,
      xoffset: GLint,
      yoffset: GLint,
      width: GLsizei,
      height: GLsizei,
      format: GLenum,
      `type`: GLenum,
      source: ImageSource
    ): Unit = js.native
    
    def texSubImage3D(
      target: GLenum,
      level: GLint,
      xoffset: GLint,
      yoffset: GLint,
      zoffset: GLint,
      width: GLsizei,
      height: GLsizei,
      depth: GLsizei,
      format: GLenum,
      `type`: GLenum,
      source: ImageSource
    ): Unit = js.native
  }
}
