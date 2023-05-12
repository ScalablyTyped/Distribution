package typings.oojsUi.OO.ui.mixin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.Deferrable
import typings.oojsUi.OO.ui.Indicator
import typings.oojsUi.OO.ui.mixin.IndicatorElement.Props
import typings.oojsUi.OO.ui.mixin.IndicatorElement.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IndicatorElement is often mixed into other classes to generate an indicator.
  * Indicators are small graphics that are generally used in two ways:
  *
  * - To draw attention to the status of an item. For example, an indicator might be
  *   used to show that an item in a list has errors that need to be resolved.
  * - To clarify the function of a control that acts in an exceptional way (a button
  *   that opens a menu instead of performing an action directly, for example).
  *
  * For a list of indicators included in the library, please see the
  * [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Icons,_Indicators,_and_Labels#Indicators).
  *
  * Note that indicators don't come with any functionality by default. See e.g.
  * {@link OO.ui.SearchInputWidget SearchInputWidget} for a working 'clear' or
  * {@link OO.ui.ComboBoxInputWidget ComboBoxInputWidget} for a working 'down' indicator.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.mixin.IndicatorElement
  */
@js.native
trait IndicatorElement
  extends StObject
     with Props
     with Prototype
object IndicatorElement {
  
  trait ConfigOptions extends StObject {
    
    /**
      * The indicator element created by the class. If this configuration is omitted,
      * the indicator element will use a generated `<span>`.
      */
    @JSName("$indicator")
    var $indicator: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /**
      * Symbolic name of the indicator (e.g. ‘required’ or ‘down’).
      * See the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Icons,_Indicators,_and_Labels#Indicators)
      * for a list of indicators included in the library.
      */
    var indicator: js.UndefOr[Indicator] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$indicator(value: JQuery[HTMLElement]): Self = StObject.set(x, "$indicator", value.asInstanceOf[js.Any])
      
      inline def set$indicatorUndefined: Self = StObject.set(x, "$indicator", js.undefined)
      
      inline def setIndicator(value: Indicator): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[IndicatorElement]
       with Instantiable1[/* config */ ConfigOptions, IndicatorElement] {
    
    var static: Static = js.native
  }
  
  trait Props extends StObject {
    
    @JSName("$indicator")
    var $indicator: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply($indicator: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($indicator = $indicator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$indicator(value: JQuery[HTMLElement]): Self = StObject.set(x, "$indicator", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype extends StObject {
    
    /**
      * Get the symbolic name of the indicator (e.g., ‘required’ or ‘down’).
      *
      * @return Symbolic name of indicator, null if not set
      */
    def getIndicator(): String | Null = js.native
    
    /**
      * Set the indicator by its symbolic name. Built-in names currently include ‘clear’, ‘up’,
      * ‘down’ and ‘required’ (declared via indicators.json). Use `null` to remove the indicator.
      *
      * @param indicator Symbolic name of indicator, or `null` for no indicator
      * @return The element, for chaining
      */
    def setIndicator(): this.type = js.native
    def setIndicator(indicator: Indicator): this.type = js.native
    
    /**
      * Set the indicator element.
      *
      * If an element is already set, it will be cleaned up before setting up the new element.
      *
      * @param $indicator Element to use as indicator
      */
    def setIndicatorElement($indicator: JQuery[HTMLElement]): Unit = js.native
  }
  
  trait Static extends StObject {
    
    /**
      * Symbolic name of the indicator (e.g. ‘required’ or ‘down’).
      * The static property will be overridden if the {@link ConfigOptions.indicator indicator}
      * configuration is used.
      */
    var indicator: String | Null
    
    /**
      * A text string used as the indicator title, a function that returns title text, or `null`
      * for no title. The static property will be overridden if the indicatorTitle configuration
      * is used.
      */
    var indicatorTitle: Deferrable[String] | Null
  }
  object Static {
    
    inline def apply(): Static = {
      val __obj = js.Dynamic.literal(indicator = null, indicatorTitle = null)
      __obj.asInstanceOf[Static]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
      
      inline def setIndicator(value: String): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      inline def setIndicatorNull: Self = StObject.set(x, "indicator", null)
      
      inline def setIndicatorTitle(value: Deferrable[String]): Self = StObject.set(x, "indicatorTitle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorTitleFunction0(value: () => String): Self = StObject.set(x, "indicatorTitle", js.Any.fromFunction0(value))
      
      inline def setIndicatorTitleNull: Self = StObject.set(x, "indicatorTitle", null)
    }
  }
}
