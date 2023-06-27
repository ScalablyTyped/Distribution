package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFCardsLoadingPlaceholderBaseRendererMod extends Shortcut {
  
  @JSImport("sap/f/cards/loading/PlaceholderBaseRenderer", JSImport.Default)
  @js.native
  val default: PlaceholderBaseRenderer = js.native
  
  /**
    * Protected:  DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * PlaceholderBase renderer.
    */
  trait PlaceholderBaseRenderer extends StObject {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * This method is reserved for derived classes to add their respective attributes.
      */
    def addOuterAttributes(
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: /* was: sap.f.cards.loading.PlaceholderBase */ Any,
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default
    ): Unit
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * This method is reserved for derived classes to render their respective content.
      */
    def renderContent(
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: /* was: sap.f.cards.loading.PlaceholderBase */ Any,
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default
    ): Unit
  }
  object PlaceholderBaseRenderer {
    
    inline def apply(
      addOuterAttributes: (/* was: sap.f.cards.loading.PlaceholderBase */ Any, typings.openui5.sapUiCoreRenderManagerMod.default) => Unit,
      renderContent: (/* was: sap.f.cards.loading.PlaceholderBase */ Any, typings.openui5.sapUiCoreRenderManagerMod.default) => Unit
    ): PlaceholderBaseRenderer = {
      val __obj = js.Dynamic.literal(addOuterAttributes = js.Any.fromFunction2(addOuterAttributes), renderContent = js.Any.fromFunction2(renderContent))
      __obj.asInstanceOf[PlaceholderBaseRenderer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlaceholderBaseRenderer] (val x: Self) extends AnyVal {
      
      inline def setAddOuterAttributes(
        value: (/* was: sap.f.cards.loading.PlaceholderBase */ Any, typings.openui5.sapUiCoreRenderManagerMod.default) => Unit
      ): Self = StObject.set(x, "addOuterAttributes", js.Any.fromFunction2(value))
      
      inline def setRenderContent(
        value: (/* was: sap.f.cards.loading.PlaceholderBase */ Any, typings.openui5.sapUiCoreRenderManagerMod.default) => Unit
      ): Self = StObject.set(x, "renderContent", js.Any.fromFunction2(value))
    }
  }
  
  type _To = PlaceholderBaseRenderer
  
  /* This means you don't have to write `default`, but can instead just say `sapFCardsLoadingPlaceholderBaseRendererMod.foo` */
  override def _to: PlaceholderBaseRenderer = default
}
