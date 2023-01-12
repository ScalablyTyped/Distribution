package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMInputRendererMod extends Shortcut {
  
  @JSImport("sap/m/InputRenderer", JSImport.Default)
  @js.native
  val default: InputRenderer = js.native
  
  /**
    * Input renderer.
    *
    * InputRenderer extends the InputBaseRenderer
    */
  trait InputRenderer extends StObject {
    
    /**
      * Adds inner css classes to the input field
      */
    def addInnerClasses(
      /**
      * the RenderManager that can be used for writing to the render output buffer
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * an object representation of the control that should be rendered
      */
    oControl: typings.openui5.sapMInputMod.default
    ): Unit
    
    /**
      * Adds control specific class
      */
    def addOuterClasses(
      /**
      * the RenderManager that can be used for writing to the render output buffer
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * an object representation of the control that should be rendered
      */
    oControl: typings.openui5.sapMInputMod.default
    ): Unit
    
    /**
      * Adds extra styles to the wrapper of the input field.
      */
    def addWrapperStyles(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputMod.default
    ): Unit
    
    /**
      * Returns the inner aria describedby ids for the accessibility.
      */
    def getAriaDescribedBy(
      /**
      * an object representation of the control.
      */
    oControl: typings.openui5.sapMInputMod.default
    ): js.UndefOr[String]
    
    /**
      * Returns aria accessibility role for the control. Hook for the subclasses.
      */
    def getAriaRole(
      /**
      * an object representation of the control
      */
    oControl: typings.openui5.sapMInputMod.default
    ): String
    
    /**
      * Write the decorations of the input - description and value-help icon.
      */
    def writeDecorations(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputMod.default
    ): Unit
    
    /**
      * add extra attributes to Input
      */
    def writeInnerAttributes(
      /**
      * the RenderManager that can be used for writing to the render output buffer
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * an object representation of the control that should be rendered
      */
    oControl: typings.openui5.sapMInputMod.default
    ): Unit
  }
  object InputRenderer {
    
    inline def apply(
      addInnerClasses: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputMod.default) => Unit,
      addOuterClasses: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputMod.default) => Unit,
      addWrapperStyles: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputMod.default) => Unit,
      getAriaDescribedBy: typings.openui5.sapMInputMod.default => js.UndefOr[String],
      getAriaRole: typings.openui5.sapMInputMod.default => String,
      writeDecorations: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputMod.default) => Unit,
      writeInnerAttributes: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputMod.default) => Unit
    ): InputRenderer = {
      val __obj = js.Dynamic.literal(addInnerClasses = js.Any.fromFunction2(addInnerClasses), addOuterClasses = js.Any.fromFunction2(addOuterClasses), addWrapperStyles = js.Any.fromFunction2(addWrapperStyles), getAriaDescribedBy = js.Any.fromFunction1(getAriaDescribedBy), getAriaRole = js.Any.fromFunction1(getAriaRole), writeDecorations = js.Any.fromFunction2(writeDecorations), writeInnerAttributes = js.Any.fromFunction2(writeInnerAttributes))
      __obj.asInstanceOf[InputRenderer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputRenderer] (val x: Self) extends AnyVal {
      
      inline def setAddInnerClasses(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputMod.default) => Unit
      ): Self = StObject.set(x, "addInnerClasses", js.Any.fromFunction2(value))
      
      inline def setAddOuterClasses(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputMod.default) => Unit
      ): Self = StObject.set(x, "addOuterClasses", js.Any.fromFunction2(value))
      
      inline def setAddWrapperStyles(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputMod.default) => Unit
      ): Self = StObject.set(x, "addWrapperStyles", js.Any.fromFunction2(value))
      
      inline def setGetAriaDescribedBy(value: typings.openui5.sapMInputMod.default => js.UndefOr[String]): Self = StObject.set(x, "getAriaDescribedBy", js.Any.fromFunction1(value))
      
      inline def setGetAriaRole(value: typings.openui5.sapMInputMod.default => String): Self = StObject.set(x, "getAriaRole", js.Any.fromFunction1(value))
      
      inline def setWriteDecorations(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputMod.default) => Unit
      ): Self = StObject.set(x, "writeDecorations", js.Any.fromFunction2(value))
      
      inline def setWriteInnerAttributes(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputMod.default) => Unit
      ): Self = StObject.set(x, "writeInnerAttributes", js.Any.fromFunction2(value))
    }
  }
  
  type _To = InputRenderer
  
  /* This means you don't have to write `default`, but can instead just say `sapMInputRendererMod.foo` */
  override def _to: InputRenderer = default
}
