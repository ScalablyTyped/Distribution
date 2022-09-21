package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.react.mod.HTMLAttributes
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardTypesMod {
  
  @js.native
  sealed trait DocumentCardType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCard.types", "DocumentCardType")
  @js.native
  object DocumentCardType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DocumentCardType & Double] = js.native
    
    /**
      * Compact layout. Displays the preview beside the details, rather than above.
      */
    @js.native
    sealed trait compact
      extends StObject
         with DocumentCardType
    /* 1 */ val compact: typings.officeUiFabricReact.documentCardTypesMod.DocumentCardType.compact & Double = js.native
    
    /**
      * Standard DocumentCard.
      */
    @js.native
    sealed trait normal
      extends StObject
         with DocumentCardType
    /* 0 */ val normal: typings.officeUiFabricReact.documentCardTypesMod.DocumentCardType.normal & Double = js.native
  }
  
  trait IDocumentCard extends StObject {
    
    /**
      * Sets focus to the DocumentCard.
      */
    def focus(): Unit
  }
  object IDocumentCard {
    
    inline def apply(focus: () => Unit): IDocumentCard = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[IDocumentCard]
    }
    
    extension [Self <: IDocumentCard](x: Self) {
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  trait IDocumentCardProps
    extends StObject
       with IBaseProps[IDocumentCard]
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Hex color value of the line below the card, which should correspond to the document type.
      * This should only be supplied when using the 'compact' card layout.
      *
      * Deprecated at v4.17.1, to be removed at \>= v5.0.0.
      * @deprecated To be removed at v5.0.0.
      */
    var accentColor: js.UndefOr[String] = js.undefined
    
    /**
      * A URL to navigate to when the card is clicked. If a function has also been provided,
      * it will be used instead of the URL.
      */
    var onClickHref: js.UndefOr[String] = js.undefined
    
    /**
      * A target browser context for opening the link. If not specified, will open in the same tab/window.
      */
    var onClickTarget: js.UndefOr[String] = js.undefined
    
    /**
      * Function to call when the card is clicked or keyboard Enter/Space is pushed.
      */
    @JSName("onClick")
    var onClick_IDocumentCardProps: js.UndefOr[js.Function1[/* ev */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], Unit]] = js.undefined
    
    /**
      * Aria role assigned to the documentCard (Eg. button, link).
      * Use this to override the default assignment.
      * @defaultvalue When `onClick` is provided, default role will be 'button'.
      * When `onClickHref` is provided, default role will be 'link'.
      */
    @JSName("role")
    var role_IDocumentCardProps: js.UndefOr[String] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDocumentCardStyleProps, IDocumentCardStyles]] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * The type of DocumentCard to display.
      * @defaultvalue DocumentCardType.normal
      */
    var `type`: js.UndefOr[DocumentCardType] = js.undefined
  }
  object IDocumentCardProps {
    
    inline def apply(): IDocumentCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardProps]
    }
    
    extension [Self <: IDocumentCardProps](x: Self) {
      
      inline def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      inline def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
      
      inline def setOnClick(value: /* ev */ js.UndefOr[SyntheticEvent[HTMLElement, Event]] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickHref(value: String): Self = StObject.set(x, "onClickHref", value.asInstanceOf[js.Any])
      
      inline def setOnClickHrefUndefined: Self = StObject.set(x, "onClickHref", js.undefined)
      
      inline def setOnClickTarget(value: String): Self = StObject.set(x, "onClickTarget", value.asInstanceOf[js.Any])
      
      inline def setOnClickTargetUndefined: Self = StObject.set(x, "onClickTarget", js.undefined)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IDocumentCardStyleProps, IDocumentCardStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IDocumentCardStyleProps => DeepPartial[IDocumentCardStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: DocumentCardType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IDocumentCardStyleProps extends StObject {
    
    /**
      * True when the card has a click action.
      */
    var actionable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Compact variant of the card.
      */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme
  }
  object IDocumentCardStyleProps {
    
    inline def apply(theme: ITheme): IDocumentCardStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardStyleProps]
    }
    
    extension [Self <: IDocumentCardStyleProps](x: Self) {
      
      inline def setActionable(value: Boolean): Self = StObject.set(x, "actionable", value.asInstanceOf[js.Any])
      
      inline def setActionableUndefined: Self = StObject.set(x, "actionable", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDocumentCardStyles extends StObject {
    
    var root: IStyle
  }
  object IDocumentCardStyles {
    
    inline def apply(): IDocumentCardStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardStyles]
    }
    
    extension [Self <: IDocumentCardStyles](x: Self) {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
