package typings.playable

import typings.playable.anon.EventEmitterIEventEmitter
import typings.playable.getTooltipPositionByReferenceElementMod.ITooltipCenterXfn
import typings.playable.tooltipTooltipMod.default
import typings.playable.tooltipTypesMod.ITooltipPosition
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip", "Tooltip")
  @js.native
  open class Tooltip () extends default
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip", "TooltipService")
  @js.native
  open class TooltipService protected ()
    extends typings.playable.tooltipServiceMod.default {
    def this(hasEventEmitter: EventEmitterIEventEmitter) = this()
  }
  object TooltipService {
    
    @JSImport("playable/dist/src/modules/ui/core/tooltip", "TooltipService")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/tooltip", "TooltipService.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/tooltip", "TooltipService.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  inline def getTooltipPositionByReferenceElement(tooltipReferenceElement: HTMLElement, tooltipContainerElement: HTMLElement): ITooltipPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipPositionByReferenceElement")(tooltipReferenceElement.asInstanceOf[js.Any], tooltipContainerElement.asInstanceOf[js.Any])).asInstanceOf[ITooltipPosition]
  inline def getTooltipPositionByReferenceElement(
    tooltipReferenceElement: HTMLElement,
    tooltipContainerElement: HTMLElement,
    tooltipCenterXfn: ITooltipCenterXfn
  ): ITooltipPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipPositionByReferenceElement")(tooltipReferenceElement.asInstanceOf[js.Any], tooltipContainerElement.asInstanceOf[js.Any], tooltipCenterXfn.asInstanceOf[js.Any])).asInstanceOf[ITooltipPosition]
}
