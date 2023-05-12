package typings.oojsUi.OO.ui.mixin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.jquery.JQuery.Promise
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LookupElement is a mixin that creates a {@link OO.ui.MenuSelectWidget menu} of suggested
  * values for a {@link OO.ui.TextInputWidget text input widget}. Suggested values are based on
  * the characters the user types into the text input field and, in general, the menu is only
  * displayed when the user types. If a suggested value is chosen from the lookup menu, that value
  * becomes the value of the input field.
  *
  * Note that a new menu of suggested items is displayed when a value is chosen from the
  * lookup menu. If this is not the desired behavior, disable lookup menus with the
  * {@link setLookupsDisabled} method, then set the value, then re-enable lookups.
  *
  * See the [OOUI demos](https://doc.wikimedia.org/oojs-ui/master/demos/#LookupElement-try-inputting-an-integer)
  * for an example.
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.mixin.LookupElement
  */
trait LookupElement
  extends StObject
     with RequestManager {
  
  /**
    * Disable or re-enable lookups.
    *
    * When lookups are disabled, calls to populateLookupMenu will be ignored.
    *
    * @param disabled Disable lookups
    */
  def setLookupsDisabled(disabled: Boolean): Unit
  
  /**
    * Set the read-only state of the widget.
    *
    * This will also disable/enable the lookups functionality.
    *
    * @param readOnly Make input read-only
    * @return The element, for chaining
    */
  def setReadOnly(readOnly: Boolean): this.type
}
object LookupElement {
  
  inline def apply(
    getRequestData: () => Promise[Any, Any, Any],
    setLookupsDisabled: Boolean => Unit,
    setReadOnly: Boolean => LookupElement
  ): LookupElement = {
    val __obj = js.Dynamic.literal(getRequestData = js.Any.fromFunction0(getRequestData), setLookupsDisabled = js.Any.fromFunction1(setLookupsDisabled), setReadOnly = js.Any.fromFunction1(setReadOnly))
    __obj.asInstanceOf[LookupElement]
  }
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.mixin.RequestManager.ConfigOptions {
    
    /**
      * The container element. The lookup menu is rendered beneath the
      * specified element.
      */
    @JSName("$container")
    var $container: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /**
      * Overlay for the lookup menu; defaults to relative positioning.
      * See <https://www.mediawiki.org/wiki/OOUI/Concepts#Overlays>.
      */
    @JSName("$overlay")
    var $overlay: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /**
      * Request and display a lookup menu when the text input is empty.
      * By default, the lookup menu is not generated and displayed until the user begins to
      * type.
      */
    var allowSuggestionsWhenEmpty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the first lookup result should be highlighted
      * (so, that the user can take it over into the input with simply pressing return)
      * automatically or not.
      */
    var highlightFirst: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configuration options to pass to {@link OO.ui.MenuSelectWidget menu select widget}
      */
    var menu: js.UndefOr[typings.oojsUi.OO.ui.MenuSelectWidget.ConfigOptions] = js.undefined
    
    /**
      * Show suggestions when focusing the input. If this
      * is set to false, suggestions will still be shown on a mousedown triggered focus.
      * This matches browser autocomplete behavior.
      */
    var showSuggestionsOnFocus: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$container(value: JQuery[HTMLElement]): Self = StObject.set(x, "$container", value.asInstanceOf[js.Any])
      
      inline def set$containerUndefined: Self = StObject.set(x, "$container", js.undefined)
      
      inline def set$overlay(value: JQuery[HTMLElement]): Self = StObject.set(x, "$overlay", value.asInstanceOf[js.Any])
      
      inline def set$overlayUndefined: Self = StObject.set(x, "$overlay", js.undefined)
      
      inline def setAllowSuggestionsWhenEmpty(value: Boolean): Self = StObject.set(x, "allowSuggestionsWhenEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowSuggestionsWhenEmptyUndefined: Self = StObject.set(x, "allowSuggestionsWhenEmpty", js.undefined)
      
      inline def setHighlightFirst(value: Boolean): Self = StObject.set(x, "highlightFirst", value.asInstanceOf[js.Any])
      
      inline def setHighlightFirstUndefined: Self = StObject.set(x, "highlightFirst", js.undefined)
      
      inline def setMenu(value: typings.oojsUi.OO.ui.MenuSelectWidget.ConfigOptions): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setShowSuggestionsOnFocus(value: Boolean): Self = StObject.set(x, "showSuggestionsOnFocus", value.asInstanceOf[js.Any])
      
      inline def setShowSuggestionsOnFocusUndefined: Self = StObject.set(x, "showSuggestionsOnFocus", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[LookupElement]
       with Instantiable1[/* config */ ConfigOptions, LookupElement]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LookupElement] (val x: Self) extends AnyVal {
    
    inline def setSetLookupsDisabled(value: Boolean => Unit): Self = StObject.set(x, "setLookupsDisabled", js.Any.fromFunction1(value))
    
    inline def setSetReadOnly(value: Boolean => LookupElement): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1(value))
  }
}
