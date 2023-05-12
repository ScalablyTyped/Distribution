package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.SearchWidget.Props
import typings.oojsUi.OO.ui.SearchWidget.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchWidgets combine a {@link OO.ui.TextInputWidget text input field},
  * where users can type a search query, and a menu of search results,
  * which is displayed beneath the query field.
  * Unlike {@link OO.ui.mixin.LookupElement lookup menus}, search result menus are always visible
  * to the user. Users can choose an item from the menu or type a query into the text field to
  * search for a matching result item.
  * In general, search widgets are used inside a separate {@link OO.ui.Dialog dialog} window.
  *
  * Each time the query is changed, the search result menu is cleared and repopulated. Please see
  * the [OOUI demos](https://doc.wikimedia.org/oojs-ui/master/demos/#SearchInputWidget-type-search)
  * for an example.
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.SearchWidget
  */
@js.native
trait SearchWidget[T /* <: InputWidget */]
  extends StObject
     with Props
     with Prototype[T]
object SearchWidget {
  
  trait ConfigOptions[T /* <: InputWidget */]
    extends StObject
       with typings.oojsUi.OO.ui.Widget.ConfigOptions {
    
    /**
      * {@link OO.ui.InputWidget Input widget} for search. Defaults
      * to a {@link OO.ui.SearchInputWidget search input widget} if not provided.
      */
    var input: js.UndefOr[T] = js.undefined
    
    /** Placeholder text for query input */
    var placeholder: js.UndefOr[JQuery[HTMLElement] | String] = js.undefined
    
    /** Initial query value */
    var value: js.UndefOr[String] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply[T /* <: InputWidget */](): ConfigOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions[?], T /* <: InputWidget */] (val x: Self & ConfigOptions[T]) extends AnyVal {
      
      inline def setInput(value: T): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setPlaceholder(value: JQuery[HTMLElement] | String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[SearchWidget[InputWidget]]
       with Instantiable1[/* config */ ConfigOptions[InputWidget], SearchWidget[InputWidget]] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Widget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Widget.Constructor = js.native
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props {
    
    @JSName("$query")
    var $query: JQuery[HTMLElement]
    
    @JSName("$results")
    var $results: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply($element: JQuery[HTMLElement], $query: JQuery[HTMLElement], $results: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], $query = $query.asInstanceOf[js.Any], $results = $results.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$query(value: JQuery[HTMLElement]): Self = StObject.set(x, "$query", value.asInstanceOf[js.Any])
      
      inline def set$results(value: JQuery[HTMLElement]): Self = StObject.set(x, "$results", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype[T /* <: InputWidget */]
    extends StObject
       with typings.oojsUi.OO.ui.Widget.Prototype {
    
    /**
      * Get the query input.
      *
      * @return Query input
      */
    def getQuery(): T = js.native
    
    /**
      * Get the search results menu.
      *
      * @return Menu of search results
      */
    def getResults(): SelectWidget = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.Widget.Static
}
