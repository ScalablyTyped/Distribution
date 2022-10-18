package typings.next

import org.scalablytyped.runtime.Shortcut
import typings.next.anon.OmitAnchorHTMLAttributesH
import typings.next.nextBooleans.`false`
import typings.node.urlMod.UrlObject
import typings.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientLinkMod extends Shortcut {
  
  @JSImport("next/dist/client/link", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[OmitAnchorHTMLAttributesH] = js.native
  
  trait InternalLinkProps extends StObject {
    
    var as: js.UndefOr[Url] = js.undefined
    
    var href: Url
    
    var legacyBehavior: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * requires experimental.newNextLinkBehavior
      */
    var onClick: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
    
    /**
      * requires experimental.newNextLinkBehavior
      */
    var onMouseEnter: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
    
    /**
      * requires experimental.newNextLinkBehavior
      */
    var onTouchStart: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
    
    var passHref: js.UndefOr[Boolean] = js.undefined
    
    var prefetch: js.UndefOr[Boolean] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var scroll: js.UndefOr[Boolean] = js.undefined
    
    var shallow: js.UndefOr[Boolean] = js.undefined
  }
  object InternalLinkProps {
    
    inline def apply(href: Url): InternalLinkProps = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalLinkProps]
    }
    
    extension [Self <: InternalLinkProps](x: Self) {
      
      inline def setAs(value: Url): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setHref(value: Url): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setLegacyBehavior(value: Boolean): Self = StObject.set(x, "legacyBehavior", value.asInstanceOf[js.Any])
      
      inline def setLegacyBehaviorUndefined: Self = StObject.set(x, "legacyBehavior", js.undefined)
      
      inline def setLocale(value: String | `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOnClick(value: /* e */ Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: /* e */ Any => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnTouchStart(value: /* e */ Any => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setPassHref(value: Boolean): Self = StObject.set(x, "passHref", value.asInstanceOf[js.Any])
      
      inline def setPassHrefUndefined: Self = StObject.set(x, "passHref", js.undefined)
      
      inline def setPrefetch(value: Boolean): Self = StObject.set(x, "prefetch", value.asInstanceOf[js.Any])
      
      inline def setPrefetchUndefined: Self = StObject.set(x, "prefetch", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
    }
  }
  
  type LinkProps = InternalLinkProps
  
  type Url = String | UrlObject
  
  type _To = ForwardRefExoticComponent[OmitAnchorHTMLAttributesH]
  
  /* This means you don't have to write `default`, but can instead just say `distClientLinkMod.foo` */
  override def _to: ForwardRefExoticComponent[OmitAnchorHTMLAttributesH] = default
}
