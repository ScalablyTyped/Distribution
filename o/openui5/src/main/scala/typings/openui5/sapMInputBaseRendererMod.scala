package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMInputBaseRendererMod extends Shortcut {
  
  @JSImport("sap/m/InputBaseRenderer", JSImport.Default)
  @js.native
  val default: InputBaseRenderer = js.native
  
  /**
    * InputBase renderer.
    */
  trait InputBaseRenderer extends StObject {
    
    /**
      * This method is reserved for derived class to set width inline style
      */
    def addControlWidth(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Add cursor class to input container.
      */
    def addCursorClass(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * This method is reserved for derived classes to add extra classes for input element.
      */
    def addInnerClasses(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * This method is reserved for derived classes to add extra styles for input element.
      */
    def addInnerStyles(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * This method is reserved for derived classes to add extra classes for input container.
      */
    def addOuterClasses(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * This method is reserved for derived class to add extra styles for input container.
      */
    def addOuterStyles(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Add a padding class to input container. May be overwritten by subclasses.
      */
    def addPaddingClass(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * @deprecated
      *
      * Adds custom placeholder classes, if native placeholder is not used. To be overwritten by subclasses.
      * Note that this method should not be used anymore as native placeholder is used on all browsers
      */
    def addPlaceholderClasses(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * @deprecated
      *
      * This method is reserved for derived classes to add extra styles for the placeholder, if rendered as label.
      */
    def addPlaceholderStyles(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Add the CSS value state classes to the control's root element using the provided {@link sap.ui.core.RenderManager}.
      * To be overwritten by subclasses.
      */
    def addValueStateClasses(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * This method is reserved for derived classes to add extra styles for input element.
      */
    def addWrapperStyles(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Write the closing tag name of the input.
      */
    def closeInputTag(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Ends opened input tag.
      */
    def endInputTag(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Returns the accessibility state of the control. Hook for the subclasses.
      */
    def getAccessibilityState(
      /**
      * an object representation of the control.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): js.Object
    
    /**
      * Returns the inner aria describedby ids for the accessibility. Hook for the subclasses.
      */
    def getAriaDescribedBy(
      /**
      * an object representation of the control.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): js.UndefOr[String]
    
    /**
      * Returns the inner aria labelledby ids for the accessibility. Hook for the subclasses.
      */
    def getAriaLabelledBy(
      /**
      * an object representation of the control.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): js.UndefOr[String]
    
    /**
      * Returns aria accessibility role for the control. Hook for the subclasses.
      */
    def getAriaRole(
      /**
      * an object representation of the control
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): String
    
    /**
      * Returns the inner aria describedby announcement texts for the accessibility. Hook for the subclasses.
      */
    def getDescribedByAnnouncement(
      /**
      * an object representation of the control.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): String
    
    /**
      * Defines the ID suffix of the inner element
      *
      * @returns The inner element ID suffix.
      */
    def getInnerSuffix(): String
    
    /**
      * Returns the inner aria labelledby announcement texts for the accessibility. Hook for the subclasses.
      */
    def getLabelledByAnnouncement(
      /**
      * an object representation of the control.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): String
    
    /**
      * Write the opening tag name of the input.
      */
    def openInputTag(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * This method is reserved for derived classes to prepend inner content.
      */
    def prependInnerContent(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Renders the hidden aria labelledby node for the accessibility. Hook for the subclasses.
      */
    def renderAriaDescribedBy(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Renders the hidden aria labelledby node for the accessibility. Hook for the subclasses.
      */
    def renderAriaLabelledBy(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Renders the hidden aria describedby and errormessage nodes for the accessibility.
      */
    def renderValueStateAccDom(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Writes the accessibility state of the control. Hook for the subclasses.
      */
    def writeAccessibilityState(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
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
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Renders icons from the icon aggregations.
      */
    def writeIcons(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * List of icons to render
      */
    aIcons: js.Array[typings.openui5.sapUiCoreIconMod.default]
    ): Unit
    
    /**
      * This method is reserved for derived classes to add extra attributes for the input element.
      */
    def writeInnerAttributes(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Write the value of the input.
      */
    def writeInnerContent(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Write the value of the input.
      */
    def writeInnerValue(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * This method is reserved for derived class to add extra attributes for input container.
      */
    def writeOuterAttributes(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typings.openui5.sapMInputBaseMod.default
    ): Unit
  }
  object InputBaseRenderer {
    
    inline def apply(
      addControlWidth: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      addCursorClass: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      addInnerClasses: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      addInnerStyles: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      addOuterClasses: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      addOuterStyles: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      addPaddingClass: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      addPlaceholderClasses: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      addPlaceholderStyles: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      addValueStateClasses: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      addWrapperStyles: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      closeInputTag: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      endInputTag: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      getAccessibilityState: typings.openui5.sapMInputBaseMod.default => js.Object,
      getAriaDescribedBy: typings.openui5.sapMInputBaseMod.default => js.UndefOr[String],
      getAriaLabelledBy: typings.openui5.sapMInputBaseMod.default => js.UndefOr[String],
      getAriaRole: typings.openui5.sapMInputBaseMod.default => String,
      getDescribedByAnnouncement: typings.openui5.sapMInputBaseMod.default => String,
      getInnerSuffix: () => String,
      getLabelledByAnnouncement: typings.openui5.sapMInputBaseMod.default => String,
      openInputTag: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      prependInnerContent: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      renderAriaDescribedBy: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      renderAriaLabelledBy: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      renderValueStateAccDom: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      writeAccessibilityState: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      writeDecorations: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      writeIcons: (typings.openui5.sapUiCoreRenderManagerMod.default, js.Array[typings.openui5.sapUiCoreIconMod.default]) => Unit,
      writeInnerAttributes: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      writeInnerContent: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      writeInnerValue: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit,
      writeOuterAttributes: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
    ): InputBaseRenderer = {
      val __obj = js.Dynamic.literal(addControlWidth = js.Any.fromFunction2(addControlWidth), addCursorClass = js.Any.fromFunction2(addCursorClass), addInnerClasses = js.Any.fromFunction2(addInnerClasses), addInnerStyles = js.Any.fromFunction2(addInnerStyles), addOuterClasses = js.Any.fromFunction2(addOuterClasses), addOuterStyles = js.Any.fromFunction2(addOuterStyles), addPaddingClass = js.Any.fromFunction2(addPaddingClass), addPlaceholderClasses = js.Any.fromFunction2(addPlaceholderClasses), addPlaceholderStyles = js.Any.fromFunction2(addPlaceholderStyles), addValueStateClasses = js.Any.fromFunction2(addValueStateClasses), addWrapperStyles = js.Any.fromFunction2(addWrapperStyles), closeInputTag = js.Any.fromFunction2(closeInputTag), endInputTag = js.Any.fromFunction2(endInputTag), getAccessibilityState = js.Any.fromFunction1(getAccessibilityState), getAriaDescribedBy = js.Any.fromFunction1(getAriaDescribedBy), getAriaLabelledBy = js.Any.fromFunction1(getAriaLabelledBy), getAriaRole = js.Any.fromFunction1(getAriaRole), getDescribedByAnnouncement = js.Any.fromFunction1(getDescribedByAnnouncement), getInnerSuffix = js.Any.fromFunction0(getInnerSuffix), getLabelledByAnnouncement = js.Any.fromFunction1(getLabelledByAnnouncement), openInputTag = js.Any.fromFunction2(openInputTag), prependInnerContent = js.Any.fromFunction2(prependInnerContent), renderAriaDescribedBy = js.Any.fromFunction2(renderAriaDescribedBy), renderAriaLabelledBy = js.Any.fromFunction2(renderAriaLabelledBy), renderValueStateAccDom = js.Any.fromFunction2(renderValueStateAccDom), writeAccessibilityState = js.Any.fromFunction2(writeAccessibilityState), writeDecorations = js.Any.fromFunction2(writeDecorations), writeIcons = js.Any.fromFunction2(writeIcons), writeInnerAttributes = js.Any.fromFunction2(writeInnerAttributes), writeInnerContent = js.Any.fromFunction2(writeInnerContent), writeInnerValue = js.Any.fromFunction2(writeInnerValue), writeOuterAttributes = js.Any.fromFunction2(writeOuterAttributes))
      __obj.asInstanceOf[InputBaseRenderer]
    }
    
    extension [Self <: InputBaseRenderer](x: Self) {
      
      inline def setAddControlWidth(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "addControlWidth", js.Any.fromFunction2(value))
      
      inline def setAddCursorClass(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "addCursorClass", js.Any.fromFunction2(value))
      
      inline def setAddInnerClasses(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "addInnerClasses", js.Any.fromFunction2(value))
      
      inline def setAddInnerStyles(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "addInnerStyles", js.Any.fromFunction2(value))
      
      inline def setAddOuterClasses(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "addOuterClasses", js.Any.fromFunction2(value))
      
      inline def setAddOuterStyles(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "addOuterStyles", js.Any.fromFunction2(value))
      
      inline def setAddPaddingClass(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "addPaddingClass", js.Any.fromFunction2(value))
      
      inline def setAddPlaceholderClasses(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "addPlaceholderClasses", js.Any.fromFunction2(value))
      
      inline def setAddPlaceholderStyles(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "addPlaceholderStyles", js.Any.fromFunction2(value))
      
      inline def setAddValueStateClasses(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "addValueStateClasses", js.Any.fromFunction2(value))
      
      inline def setAddWrapperStyles(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "addWrapperStyles", js.Any.fromFunction2(value))
      
      inline def setCloseInputTag(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "closeInputTag", js.Any.fromFunction2(value))
      
      inline def setEndInputTag(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "endInputTag", js.Any.fromFunction2(value))
      
      inline def setGetAccessibilityState(value: typings.openui5.sapMInputBaseMod.default => js.Object): Self = StObject.set(x, "getAccessibilityState", js.Any.fromFunction1(value))
      
      inline def setGetAriaDescribedBy(value: typings.openui5.sapMInputBaseMod.default => js.UndefOr[String]): Self = StObject.set(x, "getAriaDescribedBy", js.Any.fromFunction1(value))
      
      inline def setGetAriaLabelledBy(value: typings.openui5.sapMInputBaseMod.default => js.UndefOr[String]): Self = StObject.set(x, "getAriaLabelledBy", js.Any.fromFunction1(value))
      
      inline def setGetAriaRole(value: typings.openui5.sapMInputBaseMod.default => String): Self = StObject.set(x, "getAriaRole", js.Any.fromFunction1(value))
      
      inline def setGetDescribedByAnnouncement(value: typings.openui5.sapMInputBaseMod.default => String): Self = StObject.set(x, "getDescribedByAnnouncement", js.Any.fromFunction1(value))
      
      inline def setGetInnerSuffix(value: () => String): Self = StObject.set(x, "getInnerSuffix", js.Any.fromFunction0(value))
      
      inline def setGetLabelledByAnnouncement(value: typings.openui5.sapMInputBaseMod.default => String): Self = StObject.set(x, "getLabelledByAnnouncement", js.Any.fromFunction1(value))
      
      inline def setOpenInputTag(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "openInputTag", js.Any.fromFunction2(value))
      
      inline def setPrependInnerContent(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "prependInnerContent", js.Any.fromFunction2(value))
      
      inline def setRenderAriaDescribedBy(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "renderAriaDescribedBy", js.Any.fromFunction2(value))
      
      inline def setRenderAriaLabelledBy(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "renderAriaLabelledBy", js.Any.fromFunction2(value))
      
      inline def setRenderValueStateAccDom(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "renderValueStateAccDom", js.Any.fromFunction2(value))
      
      inline def setWriteAccessibilityState(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "writeAccessibilityState", js.Any.fromFunction2(value))
      
      inline def setWriteDecorations(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "writeDecorations", js.Any.fromFunction2(value))
      
      inline def setWriteIcons(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, js.Array[typings.openui5.sapUiCoreIconMod.default]) => Unit
      ): Self = StObject.set(x, "writeIcons", js.Any.fromFunction2(value))
      
      inline def setWriteInnerAttributes(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "writeInnerAttributes", js.Any.fromFunction2(value))
      
      inline def setWriteInnerContent(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "writeInnerContent", js.Any.fromFunction2(value))
      
      inline def setWriteInnerValue(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "writeInnerValue", js.Any.fromFunction2(value))
      
      inline def setWriteOuterAttributes(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapMInputBaseMod.default) => Unit
      ): Self = StObject.set(x, "writeOuterAttributes", js.Any.fromFunction2(value))
    }
  }
  
  type _To = InputBaseRenderer
  
  /* This means you don't have to write `default`, but can instead just say `sapMInputBaseRendererMod.foo` */
  override def _to: InputBaseRenderer = default
}
