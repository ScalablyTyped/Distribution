package typings.orbitUiReactComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcTypesMod {
  
  trait AriaLabelingProps extends StObject {
    
    /**
      * Identifies the element (or elements) that describes the object.
      * @ignore
      */
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    /**
      * Identifies the element (or elements) that provide a detailed, extended description for the object.
      * @ignore
      */
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    /**
      * Defines a string value that labels the current element.
      * @ignore
      */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /**
      * Identifies the element (or elements) that labels the current element.
      * @ignore
      */
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
  }
  object AriaLabelingProps {
    
    inline def apply(): AriaLabelingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AriaLabelingProps]
    }
    
    extension [Self <: AriaLabelingProps](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    }
  }
  
  trait DomProps extends StObject {
    
    /**
      * The element's unique identifier.
      * @ignore
      */
    var id: js.UndefOr[String] = js.undefined
  }
  object DomProps {
    
    inline def apply(): DomProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomProps]
    }
    
    extension [Self <: DomProps](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait InteractionStatesProps extends StObject {
    
    /**
      * @ignore
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var focus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var hover: js.UndefOr[Boolean] = js.undefined
  }
  object InteractionStatesProps {
    
    inline def apply(): InteractionStatesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionStatesProps]
    }
    
    extension [Self <: InteractionStatesProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    }
  }
}
