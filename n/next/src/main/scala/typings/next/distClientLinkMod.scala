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
  
  /**
    * React Component that enables client-side transitions between routes.
    */
  @JSImport("next/dist/client/link", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[OmitAnchorHTMLAttributesH] = js.native
  
  trait InternalLinkProps extends StObject {
    
    /**
      * Optional decorator for the path that will be shown in the browser URL bar. Before Next.js 9.5.3 this was used for dynamic routes, check our [previous docs](https://nextjs.org/docs/tag/v9.5.2/api-reference/next/link#dynamic-routes) to see how it worked. Note: when this path differs from the one provided in `href` the previous `href`/`as` behavior is used as shown in the [previous docs](https://nextjs.org/docs/tag/v9.5.2/api-reference/next/link#dynamic-routes).
      */
    var as: js.UndefOr[Url] = js.undefined
    
    /**
      * The path or URL to navigate to. It can also be an object.
      *
      * @example https://nextjs.org/docs/api-reference/next/link#with-url-object
      */
    var href: Url
    
    /**
      * Enable legacy link behaviour.
      * @defaultValue `false`
      * @see https://github.com/vercel/next.js/commit/489e65ed98544e69b0afd7e0cfc3f9f6c2b803b7
      */
    var legacyBehavior: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The active locale is automatically prepended. `locale` allows for providing a different locale.
      * When `false` `href` has to include the locale as the default behavior is disabled.
      */
    var locale: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * Optional event handler for when Link is clicked.
      */
    var onClick: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
    
    /**
      * Optional event handler for when the mouse pointer is moved onto Link
      */
    var onMouseEnter: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
    
    /**
      * Optional event handler for when Link is touched.
      */
    var onTouchStart: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
    
    /**
      * Forces `Link` to send the `href` property to its child.
      *
      * @defaultValue `false`
      */
    var passHref: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prefetch the page in the background.
      * Any `<Link />` that is in the viewport (initially or through scroll) will be preloaded.
      * Prefetch can be disabled by passing `prefetch={false}`. When `prefetch` is set to `false`, prefetching will still occur on hover. Pages using [Static Generation](/docs/basic-features/data-fetching/get-static-props.md) will preload `JSON` files with the data for faster page transitions. Prefetching is only enabled in production.
      *
      * @defaultValue `true`
      */
    var prefetch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Replace the current `history` state instead of adding a new url into the stack.
      *
      * @defaultValue `false`
      */
    var replace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to override the default scroll behavior
      *
      * @example https://nextjs.org/docs/api-reference/next/link#disable-scrolling-to-the-top-of-the-page
      *
      * @defaultValue `true`
      */
    var scroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Update the path of the current page without rerunning [`getStaticProps`](/docs/basic-features/data-fetching/get-static-props.md), [`getServerSideProps`](/docs/basic-features/data-fetching/get-server-side-props.md) or [`getInitialProps`](/docs/api-reference/data-fetching/get-initial-props.md).
      *
      * @defaultValue `false`
      */
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
