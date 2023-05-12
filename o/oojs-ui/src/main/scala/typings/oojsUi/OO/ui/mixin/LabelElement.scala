package typings.oojsUi.OO.ui.mixin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.Deferrable
import typings.oojsUi.OO.ui.HtmlSnippet
import typings.oojsUi.OO.ui.mixin.LabelElement.Props
import typings.oojsUi.OO.ui.mixin.LabelElement.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LabelElement is often mixed into other classes to generate a label, which helps identify the
  * function of an interface element.
  * See the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Icons,_Indicators,_and_Labels#Labels)
  * for more information.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.mixin.LabelElement
  */
@js.native
trait LabelElement
  extends StObject
     with Props
     with Prototype
object LabelElement {
  
  trait ConfigOptions extends StObject {
    
    /**
      * The label element created by the class. If this configuration is omitted, the label
      * element will use a generated `<span>`.
      */
    @JSName("$label")
    var $label: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /**
      * Whether the label should be visually hidden (but still accessible to screen-readers).
      */
    var invisibleLabel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The label text. The label can be specified as a plaintext string, a jQuery selection
      * of elements, or a function that will produce a string in the future.
      * See the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Icons,_Indicators,_and_Labels#Labels)
      * for examples.
      */
    var label: js.UndefOr[Deferrable[String] | JQuery[HTMLElement] | HtmlSnippet] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$label(value: JQuery[HTMLElement]): Self = StObject.set(x, "$label", value.asInstanceOf[js.Any])
      
      inline def set$labelUndefined: Self = StObject.set(x, "$label", js.undefined)
      
      inline def setInvisibleLabel(value: Boolean): Self = StObject.set(x, "invisibleLabel", value.asInstanceOf[js.Any])
      
      inline def setInvisibleLabelUndefined: Self = StObject.set(x, "invisibleLabel", js.undefined)
      
      inline def setLabel(value: Deferrable[String] | JQuery[HTMLElement] | HtmlSnippet): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction0(value: () => String): Self = StObject.set(x, "label", js.Any.fromFunction0(value))
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[LabelElement]
       with Instantiable1[/* config */ ConfigOptions, LabelElement] {
    
    var static: Static = js.native
  }
  
  trait EventMap extends StObject {
    
    var labelChange: js.Array[Any]
  }
  object EventMap {
    
    inline def apply(labelChange: js.Array[Any]): EventMap = {
      val __obj = js.Dynamic.literal(labelChange = labelChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setLabelChange(value: js.Array[Any]): Self = StObject.set(x, "labelChange", value.asInstanceOf[js.Any])
      
      inline def setLabelChangeVarargs(value: Any*): Self = StObject.set(x, "labelChange", js.Array(value*))
    }
  }
  
  trait Props extends StObject {
    
    @JSName("$label")
    var $label: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply($label: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($label = $label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$label(value: JQuery[HTMLElement]): Self = StObject.set(x, "$label", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype extends StObject {
    
    /**
      * Get the label's value as provided via {@link setLabel} or the "{@link ConfigOptions.label label}"
      * config.
      * Note this is not necessarily the same as the label's visible content when {@link setLabelContent}
      * was used.
      *
      * @return Label nodes; text; or null for no label
      */
    def getLabel(): JQuery[HTMLElement] | String | Null = js.native
    
    /**
      * Set the label as plain text with a highlighted query
      *
      * @param text Text label to set
      * @param query Substring of text to highlight
      * @param compare Optional string comparator, e.g. Intl.Collator().compare
      * @param combineMarks Pull combining marks into highlighted text
      * @return The element, for chaining
      */
    def setHighlightedQuery(text: String, query: String): this.type = js.native
    def setHighlightedQuery(text: String, query: String, compare: js.Function2[/* x */ String, /* y */ String, Double]): this.type = js.native
    def setHighlightedQuery(
      text: String,
      query: String,
      compare: js.Function2[/* x */ String, /* y */ String, Double],
      combineMarks: Boolean
    ): this.type = js.native
    def setHighlightedQuery(text: String, query: String, compare: Unit, combineMarks: Boolean): this.type = js.native
    
    /**
      * Set whether the label should be visually hidden (but still accessible to screen-readers).
      *
      * @param invisibleLabel
      * @return The element, for chaining
      */
    def setInvisibleLabel(invisibleLabel: Boolean): this.type = js.native
    
    /**
      * Replace both the visible content of the label (same as {@link setLabelContent}) as
      * well as the value returned by {@link getLabel}, without touching the label's wrapper
      * element. This is the same as using the "{@link ConfigOptions.label label}" config on
      * construction time.
      *
      * An empty string will result in the label being hidden. A string containing only
      * whitespace will be converted to a single `&nbsp;`.
      *
      * To change the wrapper element, use {@link setLabelElement} or the "{@link ConfigOptions.$label $label}"
      * config.
      *
      * @param label Label nodes; text; a function that
      *  returns nodes or text; or null for no label
      * @return The element, for chaining
      */
    def setLabel(): this.type = js.native
    def setLabel(label: JQuery[HTMLElement]): this.type = js.native
    def setLabel(label: Deferrable[String]): this.type = js.native
    def setLabel(label: HtmlSnippet): this.type = js.native
    
    /**
      * Replace the wrapper element (an empty `<span>` by default) with another one (e.g. an
      * `<a href="…">`), without touching the label's content. This is the same as using the
      * "{@link ConfigOptions.$label $label}" config on construction time.
      *
      * If an element is already set, it will be cleaned up before setting up the new element.
      *
      * @param $label Element to use as label
      */
    def setLabelElement($label: JQuery[HTMLElement]): Unit = js.native
    
    /**
      * Set the 'id' attribute of the label element.
      *
      * @param id
      * @return The element, for chaining
      */
    def setLabelId(id: String): this.type = js.native
  }
  
  @js.native
  trait Static extends StObject {
    
    /**
      * Highlight the first occurrence of the query in the given text
      *
      * @param text Text
      * @param query Query to find
      * @param compare Optional string comparator, e.g. Intl.Collator().compare
      * @param combineMarks Pull combining marks into highlighted text
      * @return Text with the first match of the query sub-string wrapped in highlighted span
      */
    def highlightQuery(text: String, query: String): JQuery[HTMLElement] = js.native
    def highlightQuery(text: String, query: String, compare: js.Function2[/* x */ String, /* y */ String, Double]): JQuery[HTMLElement] = js.native
    def highlightQuery(
      text: String,
      query: String,
      compare: js.Function2[/* x */ String, /* y */ String, Double],
      combineMarks: Boolean
    ): JQuery[HTMLElement] = js.native
    def highlightQuery(text: String, query: String, compare: Unit, combineMarks: Boolean): JQuery[HTMLElement] = js.native
    
    /**
      * The label text. The label can be specified as a plaintext string, a function that will
      * produce a string (will be resolved on construction time), or `null` for no label.
      * The static value will be overridden if a label is specified with the {@link ConfigOptions.label label}
      * config option.
      */
    var label: Deferrable[String] | Null = js.native
  }
}
