package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.oojsUi.OO.ui.BookletLayout.Prototype
import typings.oojsUi.OO.ui.MenuLayout.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BookletLayouts contain {@link OO.ui.PageLayout page layouts} as well as
  * an {@link OO.ui.OutlineSelectWidget outline} that allows users to easily navigate
  * through the pages and select which one to display. By default, only one page is
  * displayed at a time and the outline is hidden. When a user navigates to a new page,
  * the booklet layout automatically focuses on the first focusable element, unless the
  * default setting is changed. Optionally, booklets can be configured to show
  * {@link OO.ui.OutlineControlsWidget controls} for adding, moving, and removing items.
  *
  *     // Example of a BookletLayout that contains two PageLayouts.
  *
  *     function PageOneLayout( name, config ) {
  *         PageOneLayout.super.call( this, name, config );
  *         this.$element.append( '<p>First page</p><p>(This booklet has an outline, displayed on ' +
  *         'the left)</p>' );
  *     }
  *     OO.inheritClass( PageOneLayout, OO.ui.PageLayout );
  *     PageOneLayout.prototype.setupOutlineItem = function () {
  *         this.outlineItem.setLabel( 'Page One' );
  *     };
  *
  *     function PageTwoLayout( name, config ) {
  *         PageTwoLayout.super.call( this, name, config );
  *         this.$element.append( '<p>Second page</p>' );
  *     }
  *     OO.inheritClass( PageTwoLayout, OO.ui.PageLayout );
  *     PageTwoLayout.prototype.setupOutlineItem = function () {
  *         this.outlineItem.setLabel( 'Page Two' );
  *     };
  *
  *     var page1 = new PageOneLayout( 'one' ),
  *         page2 = new PageTwoLayout( 'two' );
  *
  *     var booklet = new OO.ui.BookletLayout( {
  *         outlined: true
  *     } );
  *
  *     booklet.addPages( [ page1, page2 ] );
  *     $( document.body ).append( booklet.$element );
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.BookletLayout
  */
@js.native
trait BookletLayout
  extends StObject
     with Props
     with Prototype
object BookletLayout {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.MenuLayout.ConfigOptions {
    
    /** Focus on the first focusable element when a new page is displayed. Disabled on mobile. */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Show all pages, one after another */
    var continuous: js.UndefOr[Boolean] = js.undefined
    
    /** Show controls for adding, removing and reordering pages. */
    var editable: js.UndefOr[Boolean] = js.undefined
    
    /** Show the outline. The outline is used to navigate through the pages of the booklet. */
    var outlined: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
      
      inline def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setOutlined(value: Boolean): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      inline def setOutlinedUndefined: Self = StObject.set(x, "outlined", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[BookletLayout]
       with Instantiable1[/* config */ ConfigOptions, BookletLayout] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.MenuLayout.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.MenuLayout.Constructor = js.native
  }
  
  trait EventMap extends StObject {
    
    var add: js.Tuple2[/* pages */ js.Array[PageLayout], /* index */ Double]
    
    var remove: js.Array[/* pages */ js.Array[PageLayout]]
    
    var set: js.Array[/* page */ PageLayout]
  }
  object EventMap {
    
    inline def apply(
      add: js.Tuple2[/* pages */ js.Array[PageLayout], /* index */ Double],
      remove: js.Array[/* pages */ js.Array[PageLayout]],
      set: js.Array[/* page */ PageLayout]
    ): EventMap = {
      val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: js.Tuple2[/* pages */ js.Array[PageLayout], /* index */ Double]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: js.Array[/* pages */ js.Array[PageLayout]]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveVarargs(value: (/* pages */ js.Array[PageLayout])*): Self = StObject.set(x, "remove", js.Array(value*))
      
      inline def setSet(value: js.Array[/* page */ PageLayout]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetVarargs(value: (/* page */ PageLayout)*): Self = StObject.set(x, "set", js.Array(value*))
    }
  }
  
  type Props = typings.oojsUi.OO.ui.MenuLayout.Props
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.MenuLayout.Prototype {
    
    /**
      * Add pages to the booklet layout
      *
      * When pages are added with the same names as existing pages, the existing pages will be
      * automatically removed before the new pages are added.
      *
      * @param pages Pages to add
      * @param index Index of the insertion point
      * @return The layout, for chaining
      */
    def addPages(pages: js.Array[PageLayout], index: Double): this.type = js.native
    
    /**
      * Clear all pages from the booklet layout.
      *
      * To remove only a subset of pages from the booklet, use the #removePages method.
      *
      * @return The layout, for chaining
      */
    def clearPages(): this.type = js.native
    
    /**
      * Find the page closest to the specified page.
      *
      * @param page Page to use as a reference point
      * @return Page closest to the specified page
      */
    def findClosestPage(page: PageLayout): PageLayout | Null = js.native
    
    /**
      * Focus the first input in the current page.
      *
      * If no page is selected, the first selectable page will be selected.
      * If the focus is already in an element on the current page, nothing will happen.
      *
      * @param itemIndex A specific item to focus on
      */
    def focus(): Unit = js.native
    def focus(itemIndex: Double): Unit = js.native
    
    /**
      * Find the first focusable input in the booklet layout and focus
      * on it.
      */
    def focusFirstFocusable(): Unit = js.native
    
    /**
      * Get the current page.
      *
      * @return Current page, if found
      */
    def getCurrentPage(): js.UndefOr[PageLayout] = js.native
    
    /**
      * Get the symbolic name of the current page.
      *
      * @return Symbolic name of the current page
      */
    def getCurrentPageName(): String | Null = js.native
    
    /**
      * Get the outline widget.
      *
      * If the booklet is not outlined, the method will return `null`.
      *
      * @return Outline widget, or null if the booklet is not outlined
      */
    def getOutline(): OutlineSelectWidget | Null = js.native
    
    /**
      * Get the outline controls widget.
      *
      * If the outline is not editable, the method will return `null`.
      *
      * @return The outline controls widget.
      */
    def getOutlineControls(): OutlineControlsWidget | Null = js.native
    
    /**
      * Get a page by its symbolic name.
      *
      * @param name Symbolic name of page
      * @return Page, if found
      */
    def getPage(name: String): js.UndefOr[PageLayout] = js.native
    
    /**
      * Check if booklet has editing controls.
      *
      * @return Booklet is editable
      */
    def isEditable(): Boolean = js.native
    
    /**
      * Check if booklet has a visible outline.
      *
      * @return Outline is visible
      */
    def isOutlineVisible(): Boolean = js.native
    
    /**
      * Check if booklet has an outline.
      *
      * @return Booklet has an outline
      */
    def isOutlined(): Boolean = js.native
    
    /**
      * Remove the specified pages from the booklet layout.
      *
      * To remove all pages from the booklet, you may wish to use the #clearPages method instead.
      *
      * @param pages An array of pages to remove
      * @return The layout, for chaining
      */
    def removePages(pages: js.Array[PageLayout]): this.type = js.native
    
    /**
      * Select the first selectable page.
      *
      * @return The layout, for chaining
      */
    def selectFirstSelectablePage(): this.type = js.native
    
    /**
      * Set the current page by symbolic name.
      *
      * @param name Symbolic name of page
      */
    def setPage(name: String): Unit = js.native
    
    /**
      * Hide or show the outline.
      *
      * @param show Show outline, omit to invert current state
      * @return The layout, for chaining
      */
    def toggleOutline(): this.type = js.native
    def toggleOutline(show: Boolean): this.type = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.MenuLayout.Static
}
