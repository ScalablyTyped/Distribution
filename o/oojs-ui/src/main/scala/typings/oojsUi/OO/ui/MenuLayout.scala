package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.MenuLayout.Props
import typings.oojsUi.OO.ui.MenuLayout.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MenuLayouts combine a menu and a content {@link OO.ui.PanelLayout panel}. The menu is
  * positioned relative to the content (after, before, top, or bottom) and its size is customized
  * with the menuSize config. The content area will fill all remaining space.
  *
  *     var menuLayout,
  *         menuPanel = new OO.ui.PanelLayout( {
  *             padded: true,
  *             expanded: true,
  *             scrollable: true
  *         } ),
  *         contentPanel = new OO.ui.PanelLayout( {
  *             padded: true,
  *             expanded: true,
  *             scrollable: true
  *         } ),
  *         select = new OO.ui.SelectWidget( {
  *             items: [
  *                 new OO.ui.OptionWidget( {
  *                     data: 'before',
  *                     label: 'Before'
  *                 } ),
  *                 new OO.ui.OptionWidget( {
  *                     data: 'after',
  *                     label: 'After'
  *                 } ),
  *                 new OO.ui.OptionWidget( {
  *                     data: 'top',
  *                     label: 'Top'
  *                 } ),
  *                 new OO.ui.OptionWidget( {
  *                     data: 'bottom',
  *                     label: 'Bottom'
  *                 } )
  *              ]
  *         } ).on( 'select', function ( item ) {
  *            menuLayout.setMenuPosition( item.getData() );
  *         } );
  *
  *     menuLayout = new OO.ui.MenuLayout( {
  *         position: 'top',
  *         menuPanel: menuPanel,
  *         contentPanel: contentPanel
  *     } );
  *     menuLayout.$menu.append(
  *         menuPanel.$element.append( '<b>Menu panel</b>', select.$element )
  *     );
  *     menuLayout.$content.append(
  *         contentPanel.$element.append(
  *             '<b>Content panel</b>',
  *             '<p>Note that the menu is positioned relative to the content panel: ' +
  *             'top, bottom, after, before.</p>'
  *          )
  *     );
  *     $( document.body ).append( menuLayout.$element );
  *
  * If menu size needs to be overridden, it can be accomplished using CSS similar to the snippet
  * below. MenuLayout's CSS will override the appropriate values with 'auto' or '0' to display
  * the menu correctly. If `menuPosition` is known beforehand, CSS rules corresponding to other
  * positions may be omitted.
  * ```css
  * .oo-ui-menuLayout-menu {
  *     width: 200px;
  *     height: 200px;
  * }
  *
  * .oo-ui-menuLayout-content {
  *     top: 200px;
  *     left: 200px;
  *     right: 200px;
  *     bottom: 200px;
  * }
  * ```
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.MenuLayout
  */
@js.native
trait MenuLayout
  extends StObject
     with Props
     with Prototype
object MenuLayout {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Element.ConfigOptions {
    
    /** Content panel */
    var contentPanel: js.UndefOr[PanelLayout] = js.undefined
    
    /** Expand the layout to fill the entire parent element. */
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    /** Menu panel */
    var menuPanel: js.UndefOr[PanelLayout] = js.undefined
    
    /** Position of menu: `top`, `after`, `bottom` or `before` */
    var menuPosition: js.UndefOr[Position] = js.undefined
    
    /** Show menu */
    var showMenu: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setContentPanel(value: PanelLayout): Self = StObject.set(x, "contentPanel", value.asInstanceOf[js.Any])
      
      inline def setContentPanelUndefined: Self = StObject.set(x, "contentPanel", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setMenuPanel(value: PanelLayout): Self = StObject.set(x, "menuPanel", value.asInstanceOf[js.Any])
      
      inline def setMenuPanelUndefined: Self = StObject.set(x, "menuPanel", js.undefined)
      
      inline def setMenuPosition(value: Position): Self = StObject.set(x, "menuPosition", value.asInstanceOf[js.Any])
      
      inline def setMenuPositionUndefined: Self = StObject.set(x, "menuPosition", js.undefined)
      
      inline def setShowMenu(value: Boolean): Self = StObject.set(x, "showMenu", value.asInstanceOf[js.Any])
      
      inline def setShowMenuUndefined: Self = StObject.set(x, "showMenu", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[MenuLayout]
       with Instantiable1[/* config */ ConfigOptions, MenuLayout] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Layout.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Layout.Constructor = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.oojsUi.oojsUiStrings.top
    - typings.oojsUi.oojsUiStrings.after
    - typings.oojsUi.oojsUiStrings.bottom
    - typings.oojsUi.oojsUiStrings.before
  */
  trait Position extends StObject
  object Position {
    
    inline def after: typings.oojsUi.oojsUiStrings.after = "after".asInstanceOf[typings.oojsUi.oojsUiStrings.after]
    
    inline def before: typings.oojsUi.oojsUiStrings.before = "before".asInstanceOf[typings.oojsUi.oojsUiStrings.before]
    
    inline def bottom: typings.oojsUi.oojsUiStrings.bottom = "bottom".asInstanceOf[typings.oojsUi.oojsUiStrings.bottom]
    
    inline def top: typings.oojsUi.oojsUiStrings.top = "top".asInstanceOf[typings.oojsUi.oojsUiStrings.top]
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props {
    
    /** Content DOM node */
    @JSName("$content")
    var $content: JQuery[HTMLElement]
    
    /** Menu DOM node */
    @JSName("$menu")
    var $menu: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply($content: JQuery[HTMLElement], $element: JQuery[HTMLElement], $menu: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($content = $content.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $menu = $menu.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$content(value: JQuery[HTMLElement]): Self = StObject.set(x, "$content", value.asInstanceOf[js.Any])
      
      inline def set$menu(value: JQuery[HTMLElement]): Self = StObject.set(x, "$menu", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Layout.Prototype {
    
    /**
      * Clear the content panel.
      */
    def clearContentPanel(): Unit = js.native
    
    /**
      * Clear the menu panel.
      */
    def clearMenuPanel(): Unit = js.native
    
    /**
      * Get menu position.
      *
      * @return Menu position
      */
    def getMenuPosition(): Position = js.native
    
    /**
      * Check if menu is visible
      *
      * @return Menu is visible
      */
    def isMenuVisible(): Boolean = js.native
    
    /**
      * Set the content panel.
      *
      * @param contentPanel Content panel
      */
    def setContentPanel(contentPanel: PanelLayout): Unit = js.native
    
    /**
      * Set the menu panel.
      *
      * @param menuPanel Menu panel
      */
    def setMenuPanel(menuPanel: PanelLayout): Unit = js.native
    
    /**
      * Set menu position.
      *
      * @param position Position of menu, either `top`, `after`, `bottom` or `before`
      * @return The layout, for chaining
      */
    def setMenuPosition(position: Position): this.type = js.native
    
    /**
      * Toggle menu.
      *
      * @param showMenu Show menu, omit to toggle
      * @return The layout, for chaining
      */
    def toggleMenu(): this.type = js.native
    def toggleMenu(showMenu: Boolean): this.type = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.Layout.Static
}
