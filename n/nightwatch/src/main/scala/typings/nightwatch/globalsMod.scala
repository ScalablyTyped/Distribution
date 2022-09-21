package typings.nightwatch

import typings.nightwatch.mod.Definition
import typings.nightwatch.mod.Element
import typings.nightwatch.mod.Ensure
import typings.nightwatch.mod.NightwatchBrowser
import typings.seleniumWebdriver.byMod.RelativeBy
import typings.seleniumWebdriver.mod.By
import typings.seleniumWebdriver.mod.Locator
import typings.seleniumWebdriver.mod.WebDriver
import typings.seleniumWebdriver.mod.WebElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalsMod {
  
  object global {
    
    /* was `typeof seleniumBy` */
    @JSGlobal("By")
    @js.native
    open class By_ protected () extends By {
      /**
        * @param {string} using the name of the location strategy to use.
        * @param {string} value the value to search for.
        */
      def this(`using`: String, value: String) = this()
    }
    /* static members */
    object By_ {
      
      @JSGlobal("By")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Locates elements that have a specific class name.
        *
        * @param {string} name The class name to search for.
        * @return {!By} The new locator.
        * @see http://www.w3.org/TR/2011/WD-html5-20110525/elements.html#classes
        * @see http://www.w3.org/TR/CSS2/selector.html#class-html
        */
      inline def className(name: String): typings.seleniumWebdriver.byMod.By = ^.asInstanceOf[js.Dynamic].applyDynamic("className")(name.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.byMod.By]
      
      /**
        * Locates elements using a CSS selector.
        *
        * @param {string} selector The CSS selector to use.
        * @return {!By} The new locator.
        * @see http://www.w3.org/TR/CSS2/selector.html
        */
      inline def css(selector: String): typings.seleniumWebdriver.byMod.By = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.byMod.By]
      
      /**
        * Locates eleemnts by the ID attribute. This locator uses the CSS selector
        * `*[id='$ID']`, _not_ `document.getElementById`.
        *
        * @param {string} id The ID to search for.
        * @return {!By} The new locator.
        */
      inline def id(id: String): typings.seleniumWebdriver.byMod.By = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(id.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.byMod.By]
      
      /**
        * Locates an elements by evaluating a
        * {@linkplain WebDriver#executeScript JavaScript expression}.
        * The result of this expression must be an element or list of elements.
        *
        * @param {!(string|Function)} script The script to execute.
        * @param {...*} var_args The arguments to pass to the script.
        * @return {function(!./WebDriver): !./Promise}
        *     A new JavaScript-based locator function.
        */
      inline def js_(script: String, var_args: Any*): js.Function1[/* webdriver */ WebDriver, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("js")(List(script.asInstanceOf[js.Any]).`++`(var_args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function1[/* webdriver */ WebDriver, js.Promise[Any]]]
      inline def js_(script: js.Function, var_args: Any*): js.Function1[/* webdriver */ WebDriver, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("js")(List(script.asInstanceOf[js.Any]).`++`(var_args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function1[/* webdriver */ WebDriver, js.Promise[Any]]]
      
      /**
        * Locates link elements whose
        * {@linkplain WebElement#getText visible text} matches the given
        * string.
        *
        * @param {string} text The link text to search for.
        * @return {!By} The new locator.
        */
      inline def linkText(text: String): typings.seleniumWebdriver.byMod.By = ^.asInstanceOf[js.Dynamic].applyDynamic("linkText")(text.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.byMod.By]
      
      /**
        * Locates elements whose `name` attribute has the given value.
        *
        * @param {string} name The name attribute to search for.
        * @return {!By} The new locator.
        */
      inline def name(name: String): typings.seleniumWebdriver.byMod.By = ^.asInstanceOf[js.Dynamic].applyDynamic("name")(name.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.byMod.By]
      
      /**
        * Locates link elements whose
        * {@linkplain WebElement#getText visible text} contains the given
        * substring.
        *
        * @param {string} text The substring to check for in a link's visible text.
        * @return {!By} The new locator.
        */
      inline def partialLinkText(text: String): typings.seleniumWebdriver.byMod.By = ^.asInstanceOf[js.Dynamic].applyDynamic("partialLinkText")(text.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.byMod.By]
      
      /**
        * Locates elements with a given tag name.
        *
        * @param {string} name The tag name to search for.
        * @return {!By} The new locator.
        * @deprecated Use {@link By.css() By.css(tagName)} instead.
        */
      inline def tagName(name: String): typings.seleniumWebdriver.byMod.By = ^.asInstanceOf[js.Dynamic].applyDynamic("tagName")(name.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.byMod.By]
      
      /**
        * Locates elements matching a XPath selector. Care should be taken when
        * using an XPath selector with a {@link WebElement} as WebDriver
        * will respect the context in the specified in the selector. For example,
        * given the selector `//div`, WebDriver will search from the document root
        * regardless of whether the locator was used with a WebElement.
        *
        * @param {string} xpath The XPath selector to use.
        * @return {!By} The new locator.
        * @see http://www.w3.org/TR/xpath/
        */
      inline def xpath(xpath: String): typings.seleniumWebdriver.byMod.By = ^.asInstanceOf[js.Dynamic].applyDynamic("xpath")(xpath.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.byMod.By]
    }
    
    @JSGlobal("browser")
    @js.native
    val browser: NightwatchBrowser = js.native
    
    /* was `typeof seleniumBy` */
    @JSGlobal("by")
    @js.native
    open class by protected () extends By {
      /**
        * @param {string} using the name of the location strategy to use.
        * @param {string} value the value to search for.
        */
      def this(`using`: String, value: String) = this()
    }
    /* static members */
    object by {
      
      @JSGlobal("by")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Locates elements that have a specific class name.
        *
        * @param {string} name The class name to search for.
        * @return {!By} The new locator.
        * @see http://www.w3.org/TR/2011/WD-html5-20110525/elements.html#classes
        * @see http://www.w3.org/TR/CSS2/selector.html#class-html
        */
      inline def className(name: String): typings.seleniumWebdriver.byMod.By = ^.asInstanceOf[js.Dynamic].applyDynamic("className")(name.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.byMod.By]
      
      /**
        * Locates elements using a CSS selector.
        *
        * @param {string} selector The CSS selector to use.
        * @return {!By} The new locator.
        * @see http://www.w3.org/TR/CSS2/selector.html
        */
      inline def css(selector: String): typings.seleniumWebdriver.byMod.By = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.byMod.By]
      
      /**
        * Locates eleemnts by the ID attribute. This locator uses the CSS selector
        * `*[id='$ID']`, _not_ `document.getElementById`.
        *
        * @param {string} id The ID to search for.
        * @return {!By} The new locator.
        */
      inline def id(id: String): typings.seleniumWebdriver.byMod.By = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(id.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.byMod.By]
      
      /**
        * Locates an elements by evaluating a
        * {@linkplain WebDriver#executeScript JavaScript expression}.
        * The result of this expression must be an element or list of elements.
        *
        * @param {!(string|Function)} script The script to execute.
        * @param {...*} var_args The arguments to pass to the script.
        * @return {function(!./WebDriver): !./Promise}
        *     A new JavaScript-based locator function.
        */
      inline def js_(script: String, var_args: Any*): js.Function1[/* webdriver */ WebDriver, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("js")(List(script.asInstanceOf[js.Any]).`++`(var_args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function1[/* webdriver */ WebDriver, js.Promise[Any]]]
      inline def js_(script: js.Function, var_args: Any*): js.Function1[/* webdriver */ WebDriver, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("js")(List(script.asInstanceOf[js.Any]).`++`(var_args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function1[/* webdriver */ WebDriver, js.Promise[Any]]]
      
      /**
        * Locates link elements whose
        * {@linkplain WebElement#getText visible text} matches the given
        * string.
        *
        * @param {string} text The link text to search for.
        * @return {!By} The new locator.
        */
      inline def linkText(text: String): typings.seleniumWebdriver.byMod.By = ^.asInstanceOf[js.Dynamic].applyDynamic("linkText")(text.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.byMod.By]
      
      /**
        * Locates elements whose `name` attribute has the given value.
        *
        * @param {string} name The name attribute to search for.
        * @return {!By} The new locator.
        */
      inline def name(name: String): typings.seleniumWebdriver.byMod.By = ^.asInstanceOf[js.Dynamic].applyDynamic("name")(name.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.byMod.By]
      
      /**
        * Locates link elements whose
        * {@linkplain WebElement#getText visible text} contains the given
        * substring.
        *
        * @param {string} text The substring to check for in a link's visible text.
        * @return {!By} The new locator.
        */
      inline def partialLinkText(text: String): typings.seleniumWebdriver.byMod.By = ^.asInstanceOf[js.Dynamic].applyDynamic("partialLinkText")(text.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.byMod.By]
      
      /**
        * Locates elements with a given tag name.
        *
        * @param {string} name The tag name to search for.
        * @return {!By} The new locator.
        * @deprecated Use {@link By.css() By.css(tagName)} instead.
        */
      inline def tagName(name: String): typings.seleniumWebdriver.byMod.By = ^.asInstanceOf[js.Dynamic].applyDynamic("tagName")(name.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.byMod.By]
      
      /**
        * Locates elements matching a XPath selector. Care should be taken when
        * using an XPath selector with a {@link WebElement} as WebDriver
        * will respect the context in the specified in the selector. For example,
        * given the selector `//div`, WebDriver will search from the document root
        * regardless of whether the locator was used with a WebElement.
        *
        * @param {string} xpath The XPath selector to use.
        * @return {!By} The new locator.
        * @see http://www.w3.org/TR/xpath/
        */
      inline def xpath(xpath: String): typings.seleniumWebdriver.byMod.By = ^.asInstanceOf[js.Dynamic].applyDynamic("xpath")(xpath.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.byMod.By]
    }
    
    /* was `typeof globalElement` */
    inline def element(locator: Definition): Element = js.Dynamic.global.applyDynamic("element")(locator.asInstanceOf[js.Any]).asInstanceOf[Element]
    inline def element(locator: Definition, options: Any): Element = (js.Dynamic.global.applyDynamic("element")(locator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Element]
    inline def element(locator: By): Element = js.Dynamic.global.applyDynamic("element")(locator.asInstanceOf[js.Any]).asInstanceOf[Element]
    inline def element(locator: By, options: Any): Element = (js.Dynamic.global.applyDynamic("element")(locator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Element]
    inline def element(locator: WebElement): Element = js.Dynamic.global.applyDynamic("element")(locator.asInstanceOf[js.Any]).asInstanceOf[Element]
    inline def element(locator: WebElement, options: Any): Element = (js.Dynamic.global.applyDynamic("element")(locator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Element]
    
    @JSGlobal("ensure")
    @js.native
    val ensure: Ensure = js.native
    
    /* was `typeof chaiExpect` */
    @JSGlobal("expect")
    @js.native
    val expect: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof chaiExpect */ Any = js.native
    
    /* was `typeof seleniumLocateWith` */
    inline def locateWith(by: Locator): RelativeBy = js.Dynamic.global.applyDynamic("locateWith")(by.asInstanceOf[js.Any]).asInstanceOf[RelativeBy]
  }
}
