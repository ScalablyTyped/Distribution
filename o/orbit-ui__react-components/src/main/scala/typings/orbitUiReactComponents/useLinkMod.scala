package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.LinkProps
import typings.orbitUiReactComponents.typesMod.InteractionStatesProps
import typings.react.mod.ForwardedRef
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLinkMod {
  
  @JSImport("@orbit-ui/react-components/dist/link/src/useLink", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useLink(
    hasModuleColorUnderlineShapeExternalAutoFocusActiveFocusHoverDisabledVisitedTargetRelForwardedRef: UseLinkProps
  ): LinkProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useLink")(hasModuleColorUnderlineShapeExternalAutoFocusActiveFocusHoverDisabledVisitedTargetRelForwardedRef.asInstanceOf[js.Any]).asInstanceOf[LinkProps]
  
  trait UseLinkProps
    extends StObject
       with InteractionStatesProps {
    
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var cssModule: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var external: js.UndefOr[Boolean] = js.undefined
    
    var forwardedRef: js.UndefOr[ForwardedRef[HTMLElement]] = js.undefined
    
    var rel: js.UndefOr[String] = js.undefined
    
    var shape: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var underline: js.UndefOr[String] = js.undefined
    
    var visited: js.UndefOr[Boolean] = js.undefined
  }
  object UseLinkProps {
    
    inline def apply(): UseLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseLinkProps]
    }
    
    extension [Self <: UseLinkProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCssModule(value: String): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[HTMLElement]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setUnderline(value: String): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
      
      inline def setVisited(value: Boolean): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
      
      inline def setVisitedUndefined: Self = StObject.set(x, "visited", js.undefined)
    }
  }
}
