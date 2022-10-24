package typings.playable

import typings.playable.anon.EventEmitterIEventEmitter
import typings.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipReference
import typings.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipReferenceOptions
import typings.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipService
import typings.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipShowOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiCoreTooltipTooltipServiceMod {
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip-service", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TooltipService {
    def this(param0: EventEmitterIEventEmitter) = this()
    
    /* CompleteClass */
    override def createReference(reference: HTMLElement, options: ITooltipReferenceOptions): ITooltipReference = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isHidden: Boolean = js.native
    
    /* CompleteClass */
    override def setText(text: String): Unit = js.native
    
    /* CompleteClass */
    override def show(options: ITooltipShowOptions): Unit = js.native
    
    /* CompleteClass */
    var tooltipContainerElement: HTMLElement = js.native
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip-service", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip-service", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip-service", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TooltipService
    extends StObject
       with ITooltipService {
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _eventEmitter: Any = js.native
    
    /* private */ var _tooltip: Any = js.native
    
    /* private */ var _tooltipContainer: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    def clearElement(): Unit = js.native
    
    @JSName("isHidden")
    def isHidden_MTooltipService: Boolean = js.native
    
    @JSName("tooltipContainerElement")
    def tooltipContainerElement_MTooltipService: HTMLElement = js.native
  }
}
