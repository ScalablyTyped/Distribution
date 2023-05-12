package typings.nightwatch.anon

import typings.nightwatch.mod.Definition
import typings.nightwatch.mod.NightwatchAssertionsError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<nightwatch.nightwatch.NightwatchAssertions, 'not'> */
trait OmitNightwatchAssertionsn extends StObject {
  
  var NightwatchAssertionsError: typings.nightwatch.mod.NightwatchAssertionsError
  
  def attributeContains(selector: Definition, attribute: String, expected: String): AwaitableNightwatchAPINigAcceptAlert
  def attributeContains(selector: Definition, attribute: String, expected: String, message: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("attributeContains")
  var attributeContains_Original: js.Function4[
    /* selector */ Definition, 
    /* attribute */ String, 
    /* expected */ String, 
    /* message */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def attributeEquals(selector: Definition, attribute: String, expected: String): AwaitableNightwatchAPINigAcceptAlert
  def attributeEquals(selector: Definition, attribute: String, expected: String, message: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("attributeEquals")
  var attributeEquals_Original: js.Function4[
    /* selector */ Definition, 
    /* attribute */ String, 
    /* expected */ String, 
    /* message */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def attributeMatches(selector: Definition, attribute: String, regex: String): AwaitableNightwatchAPINigAcceptAlert
  def attributeMatches(selector: Definition, attribute: String, regex: String, msg: String): AwaitableNightwatchAPINigAcceptAlert
  def attributeMatches(selector: Definition, attribute: String, regex: js.RegExp): AwaitableNightwatchAPINigAcceptAlert
  def attributeMatches(selector: Definition, attribute: String, regex: js.RegExp, msg: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("attributeMatches")
  var attributeMatches_Original: js.Function4[
    /* selector */ Definition, 
    /* attribute */ String, 
    /* regex */ String | js.RegExp, 
    /* msg */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def containsText(selector: Definition, expectedText: String): AwaitableNightwatchAPINigAcceptAlert
  def containsText(selector: Definition, expectedText: String, message: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("containsText")
  var containsText_Original: js.Function3[
    /* selector */ Definition, 
    /* expectedText */ String, 
    /* message */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def cssClassNotPresent(selector: Definition, className: String): AwaitableNightwatchAPINigAcceptAlert
  def cssClassNotPresent(selector: Definition, className: String, msg: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("cssClassNotPresent")
  var cssClassNotPresent_Original: js.Function3[
    /* selector */ Definition, 
    /* className */ String, 
    /* msg */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def cssClassPresent(selector: Definition, className: String): AwaitableNightwatchAPINigAcceptAlert
  def cssClassPresent(selector: Definition, className: String, message: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("cssClassPresent")
  var cssClassPresent_Original: js.Function3[
    /* selector */ Definition, 
    /* className */ String, 
    /* message */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def cssProperty(selector: Definition, cssProperty: String, expected: String): AwaitableNightwatchAPINigAcceptAlert
  def cssProperty(selector: Definition, cssProperty: String, expected: String, msg: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("cssProperty")
  var cssProperty_Original: js.Function4[
    /* selector */ Definition, 
    /* cssProperty */ String, 
    /* expected */ String, 
    /* msg */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def domPropertyContains(selector: Definition, domProperty: String, expected: String): AwaitableNightwatchAPINigActions
  def domPropertyContains(selector: Definition, domProperty: String, expected: String, msg: String): AwaitableNightwatchAPINigActions
  def domPropertyContains(selector: Definition, domProperty: String, expected: Double): AwaitableNightwatchAPINigActions
  def domPropertyContains(selector: Definition, domProperty: String, expected: Double, msg: String): AwaitableNightwatchAPINigActions
  @JSName("domPropertyContains")
  var domPropertyContains_Original: js.Function4[
    /* selector */ Definition, 
    /* domProperty */ String, 
    /* expected */ String | Double, 
    /* msg */ js.UndefOr[String], 
    AwaitableNightwatchAPINigActions
  ]
  
  def domPropertyEquals(selector: Definition, domProperty: String, expected: String): AwaitableNightwatchAPINigActions
  def domPropertyEquals(selector: Definition, domProperty: String, expected: String, msg: String): AwaitableNightwatchAPINigActions
  def domPropertyEquals(selector: Definition, domProperty: String, expected: Double): AwaitableNightwatchAPINigActions
  def domPropertyEquals(selector: Definition, domProperty: String, expected: Double, msg: String): AwaitableNightwatchAPINigActions
  @JSName("domPropertyEquals")
  var domPropertyEquals_Original: js.Function4[
    /* selector */ Definition, 
    /* domProperty */ String, 
    /* expected */ String | Double, 
    /* msg */ js.UndefOr[String], 
    AwaitableNightwatchAPINigActions
  ]
  
  def domPropertyMatches(selector: Definition, domProperty: String, expected: String): AwaitableNightwatchAPINigActions
  def domPropertyMatches(selector: Definition, domProperty: String, expected: String, msg: String): AwaitableNightwatchAPINigActions
  def domPropertyMatches(selector: Definition, domProperty: String, expected: js.RegExp): AwaitableNightwatchAPINigActions
  def domPropertyMatches(selector: Definition, domProperty: String, expected: js.RegExp, msg: String): AwaitableNightwatchAPINigActions
  @JSName("domPropertyMatches")
  var domPropertyMatches_Original: js.Function4[
    /* selector */ Definition, 
    /* domProperty */ String, 
    /* expected */ String | js.RegExp, 
    /* msg */ js.UndefOr[String], 
    AwaitableNightwatchAPINigActions
  ]
  
  def elementNotPresent(selector: Definition): AwaitableNightwatchAPINigAxeRun
  def elementNotPresent(selector: Definition, msg: String): AwaitableNightwatchAPINigAxeRun
  @JSName("elementNotPresent")
  var elementNotPresent_Original: js.Function2[
    /* selector */ Definition, 
    /* msg */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAxeRun
  ]
  
  def elementPresent(selector: Definition): AwaitableNightwatchAPINigAxeRun
  def elementPresent(selector: Definition, msg: String): AwaitableNightwatchAPINigAxeRun
  @JSName("elementPresent")
  var elementPresent_Original: js.Function2[
    /* selector */ Definition, 
    /* msg */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAxeRun
  ]
  
  def elementsCount(selector: Definition, count: Double): AwaitableNightwatchAPINigAxeInject
  def elementsCount(selector: Definition, count: Double, msg: String): AwaitableNightwatchAPINigAxeInject
  @JSName("elementsCount")
  var elementsCount_Original: js.Function3[
    /* selector */ Definition, 
    /* count */ Double, 
    /* msg */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAxeInject
  ]
  
  def enabled(selector: Definition): AwaitableNightwatchAPINigAppium
  def enabled(selector: Definition, message: String): AwaitableNightwatchAPINigAppium
  @JSName("enabled")
  var enabled_Original: js.Function2[
    /* selector */ Definition, 
    /* message */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAppium
  ]
  
  def hasAttribute(selector: Definition, expectedAttribute: String): AwaitableNightwatchAPINigAssert
  def hasAttribute(selector: Definition, expectedAttribute: String, msg: String): AwaitableNightwatchAPINigAssert
  @JSName("hasAttribute")
  var hasAttribute_Original: js.Function3[
    /* selector */ Definition, 
    /* expectedAttribute */ String, 
    /* msg */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAssert
  ]
  
  def hasClass(selector: Definition, className: String): AwaitableNightwatchAPINigAcceptAlert
  def hasClass(selector: Definition, className: String, msg: String): AwaitableNightwatchAPINigAcceptAlert
  def hasClass(selector: Definition, className: js.Array[String]): AwaitableNightwatchAPINigAcceptAlert
  def hasClass(selector: Definition, className: js.Array[String], msg: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("hasClass")
  var hasClass_Original: js.Function3[
    /* selector */ Definition, 
    /* className */ String | js.Array[String], 
    /* msg */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def hidden(selector: Definition): AwaitableNightwatchAPINigAppium
  def hidden(selector: Definition, msg: String): AwaitableNightwatchAPINigAppium
  @JSName("hidden")
  var hidden_Original: js.Function2[
    /* selector */ Definition, 
    /* msg */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAppium
  ]
  
  def selected(selector: Definition): AwaitableNightwatchAPINigAppium
  def selected(selector: Definition, message: String): AwaitableNightwatchAPINigAppium
  @JSName("selected")
  var selected_Original: js.Function2[
    /* selector */ Definition, 
    /* message */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAppium
  ]
  
  def textContains(selector: Definition, expectedText: String): AwaitableNightwatchAPINigAcceptAlert
  def textContains(selector: Definition, expectedText: String, msg: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("textContains")
  var textContains_Original: js.Function3[
    /* selector */ Definition, 
    /* expectedText */ String, 
    /* msg */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def textEquals(selector: Definition, expectedText: String): AwaitableNightwatchAPINigAcceptAlert
  def textEquals(selector: Definition, expectedText: String, msg: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("textEquals")
  var textEquals_Original: js.Function3[
    /* selector */ Definition, 
    /* expectedText */ String, 
    /* msg */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def textMatches(selector: Definition, regex: String): AwaitableNightwatchAPINigAcceptAlert
  def textMatches(selector: Definition, regex: String, msg: String): AwaitableNightwatchAPINigAcceptAlert
  def textMatches(selector: Definition, regex: js.RegExp): AwaitableNightwatchAPINigAcceptAlert
  def textMatches(selector: Definition, regex: js.RegExp, msg: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("textMatches")
  var textMatches_Original: js.Function3[
    /* selector */ Definition, 
    /* regex */ String | js.RegExp, 
    /* msg */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def title(expected: String): AwaitableNightwatchAPINigAcceptAlert
  def title(expected: String, message: String): AwaitableNightwatchAPINigAcceptAlert
  
  def titleContains(expected: String): AwaitableNightwatchAPINigAcceptAlert
  def titleContains(expected: String, message: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("titleContains")
  var titleContains_Original: js.Function2[
    /* expected */ String, 
    /* message */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def titleEquals(expected: String): AwaitableNightwatchAPINigAcceptAlert
  def titleEquals(expected: String, message: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("titleEquals")
  var titleEquals_Original: js.Function2[
    /* expected */ String, 
    /* message */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def titleMatches(regex: String): AwaitableNightwatchAPINigAcceptAlert
  def titleMatches(regex: String, msg: String): AwaitableNightwatchAPINigAcceptAlert
  def titleMatches(regex: js.RegExp): AwaitableNightwatchAPINigAcceptAlert
  def titleMatches(regex: js.RegExp, msg: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("titleMatches")
  var titleMatches_Original: js.Function2[
    /* regex */ String | js.RegExp, 
    /* msg */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  @JSName("title")
  var title_Original: js.Function2[
    /* expected */ String, 
    /* message */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def urlContains(expectedText: String): AwaitableNightwatchAPINigAcceptAlert
  def urlContains(expectedText: String, message: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("urlContains")
  var urlContains_Original: js.Function2[
    /* expectedText */ String, 
    /* message */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def urlEquals(expected: String): AwaitableNightwatchAPINigAcceptAlert
  def urlEquals(expected: String, message: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("urlEquals")
  var urlEquals_Original: js.Function2[
    /* expected */ String, 
    /* message */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def urlMatches(regex: String): AwaitableNightwatchAPINigAcceptAlert
  def urlMatches(regex: String, msg: String): AwaitableNightwatchAPINigAcceptAlert
  def urlMatches(regex: js.RegExp): AwaitableNightwatchAPINigAcceptAlert
  def urlMatches(regex: js.RegExp, msg: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("urlMatches")
  var urlMatches_Original: js.Function2[
    /* regex */ String | js.RegExp, 
    /* msg */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def value(selector: Definition, expectedText: String): AwaitableNightwatchAPINigAcceptAlert
  def value(selector: Definition, expectedText: String, message: String): AwaitableNightwatchAPINigAcceptAlert
  
  def valueContains(selector: Definition, expectedText: String): AwaitableNightwatchAPINigAcceptAlert
  def valueContains(selector: Definition, expectedText: String, message: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("valueContains")
  var valueContains_Original: js.Function3[
    /* selector */ Definition, 
    /* expectedText */ String, 
    /* message */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def valueEquals(selector: Definition, expected: String): AwaitableNightwatchAPINigAcceptAlert
  def valueEquals(selector: Definition, expected: String, msg: String): AwaitableNightwatchAPINigAcceptAlert
  @JSName("valueEquals")
  var valueEquals_Original: js.Function3[
    /* selector */ Definition, 
    /* expected */ String, 
    /* msg */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  @JSName("value")
  var value_Original: js.Function3[
    /* selector */ Definition, 
    /* expectedText */ String, 
    /* message */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAcceptAlert
  ]
  
  def visible(selector: Definition): AwaitableNightwatchAPINigAppium
  def visible(selector: Definition, message: String): AwaitableNightwatchAPINigAppium
  @JSName("visible")
  var visible_Original: js.Function2[
    /* selector */ Definition, 
    /* message */ js.UndefOr[String], 
    AwaitableNightwatchAPINigAppium
  ]
}
object OmitNightwatchAssertionsn {
  
  inline def apply(
    NightwatchAssertionsError: NightwatchAssertionsError,
    attributeContains: (/* selector */ Definition, /* attribute */ String, /* expected */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    attributeEquals: (/* selector */ Definition, /* attribute */ String, /* expected */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    attributeMatches: (/* selector */ Definition, /* attribute */ String, /* regex */ String | js.RegExp, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    containsText: (/* selector */ Definition, /* expectedText */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    cssClassNotPresent: (/* selector */ Definition, /* className */ String, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    cssClassPresent: (/* selector */ Definition, /* className */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    cssProperty: (/* selector */ Definition, /* cssProperty */ String, /* expected */ String, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    domPropertyContains: (/* selector */ Definition, /* domProperty */ String, /* expected */ String | Double, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigActions,
    domPropertyEquals: (/* selector */ Definition, /* domProperty */ String, /* expected */ String | Double, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigActions,
    domPropertyMatches: (/* selector */ Definition, /* domProperty */ String, /* expected */ String | js.RegExp, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigActions,
    elementNotPresent: (/* selector */ Definition, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAxeRun,
    elementPresent: (/* selector */ Definition, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAxeRun,
    elementsCount: (/* selector */ Definition, /* count */ Double, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAxeInject,
    enabled: (/* selector */ Definition, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAppium,
    hasAttribute: (/* selector */ Definition, /* expectedAttribute */ String, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAssert,
    hasClass: (/* selector */ Definition, /* className */ String | js.Array[String], /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    hidden: (/* selector */ Definition, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAppium,
    selected: (/* selector */ Definition, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAppium,
    textContains: (/* selector */ Definition, /* expectedText */ String, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    textEquals: (/* selector */ Definition, /* expectedText */ String, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    textMatches: (/* selector */ Definition, /* regex */ String | js.RegExp, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    title: (/* expected */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    titleContains: (/* expected */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    titleEquals: (/* expected */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    titleMatches: (/* regex */ String | js.RegExp, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    urlContains: (/* expectedText */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    urlEquals: (/* expected */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    urlMatches: (/* regex */ String | js.RegExp, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    value: (/* selector */ Definition, /* expectedText */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    valueContains: (/* selector */ Definition, /* expectedText */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    valueEquals: (/* selector */ Definition, /* expected */ String, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert,
    visible: (/* selector */ Definition, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAppium
  ): OmitNightwatchAssertionsn = {
    val __obj = js.Dynamic.literal(NightwatchAssertionsError = NightwatchAssertionsError.asInstanceOf[js.Any], attributeContains = js.Any.fromFunction4(attributeContains), attributeEquals = js.Any.fromFunction4(attributeEquals), attributeMatches = js.Any.fromFunction4(attributeMatches), containsText = js.Any.fromFunction3(containsText), cssClassNotPresent = js.Any.fromFunction3(cssClassNotPresent), cssClassPresent = js.Any.fromFunction3(cssClassPresent), cssProperty = js.Any.fromFunction4(cssProperty), domPropertyContains = js.Any.fromFunction4(domPropertyContains), domPropertyEquals = js.Any.fromFunction4(domPropertyEquals), domPropertyMatches = js.Any.fromFunction4(domPropertyMatches), elementNotPresent = js.Any.fromFunction2(elementNotPresent), elementPresent = js.Any.fromFunction2(elementPresent), elementsCount = js.Any.fromFunction3(elementsCount), enabled = js.Any.fromFunction2(enabled), hasAttribute = js.Any.fromFunction3(hasAttribute), hasClass = js.Any.fromFunction3(hasClass), hidden = js.Any.fromFunction2(hidden), selected = js.Any.fromFunction2(selected), textContains = js.Any.fromFunction3(textContains), textEquals = js.Any.fromFunction3(textEquals), textMatches = js.Any.fromFunction3(textMatches), title = js.Any.fromFunction2(title), titleContains = js.Any.fromFunction2(titleContains), titleEquals = js.Any.fromFunction2(titleEquals), titleMatches = js.Any.fromFunction2(titleMatches), urlContains = js.Any.fromFunction2(urlContains), urlEquals = js.Any.fromFunction2(urlEquals), urlMatches = js.Any.fromFunction2(urlMatches), value = js.Any.fromFunction3(value), valueContains = js.Any.fromFunction3(valueContains), valueEquals = js.Any.fromFunction3(valueEquals), visible = js.Any.fromFunction2(visible))
    __obj.asInstanceOf[OmitNightwatchAssertionsn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitNightwatchAssertionsn] (val x: Self) extends AnyVal {
    
    inline def setAttributeContains(
      value: (/* selector */ Definition, /* attribute */ String, /* expected */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "attributeContains", js.Any.fromFunction4(value))
    
    inline def setAttributeEquals(
      value: (/* selector */ Definition, /* attribute */ String, /* expected */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "attributeEquals", js.Any.fromFunction4(value))
    
    inline def setAttributeMatches(
      value: (/* selector */ Definition, /* attribute */ String, /* regex */ String | js.RegExp, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "attributeMatches", js.Any.fromFunction4(value))
    
    inline def setContainsText(
      value: (/* selector */ Definition, /* expectedText */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "containsText", js.Any.fromFunction3(value))
    
    inline def setCssClassNotPresent(
      value: (/* selector */ Definition, /* className */ String, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "cssClassNotPresent", js.Any.fromFunction3(value))
    
    inline def setCssClassPresent(
      value: (/* selector */ Definition, /* className */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "cssClassPresent", js.Any.fromFunction3(value))
    
    inline def setCssProperty(
      value: (/* selector */ Definition, /* cssProperty */ String, /* expected */ String, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "cssProperty", js.Any.fromFunction4(value))
    
    inline def setDomPropertyContains(
      value: (/* selector */ Definition, /* domProperty */ String, /* expected */ String | Double, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigActions
    ): Self = StObject.set(x, "domPropertyContains", js.Any.fromFunction4(value))
    
    inline def setDomPropertyEquals(
      value: (/* selector */ Definition, /* domProperty */ String, /* expected */ String | Double, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigActions
    ): Self = StObject.set(x, "domPropertyEquals", js.Any.fromFunction4(value))
    
    inline def setDomPropertyMatches(
      value: (/* selector */ Definition, /* domProperty */ String, /* expected */ String | js.RegExp, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigActions
    ): Self = StObject.set(x, "domPropertyMatches", js.Any.fromFunction4(value))
    
    inline def setElementNotPresent(
      value: (/* selector */ Definition, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAxeRun
    ): Self = StObject.set(x, "elementNotPresent", js.Any.fromFunction2(value))
    
    inline def setElementPresent(
      value: (/* selector */ Definition, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAxeRun
    ): Self = StObject.set(x, "elementPresent", js.Any.fromFunction2(value))
    
    inline def setElementsCount(
      value: (/* selector */ Definition, /* count */ Double, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAxeInject
    ): Self = StObject.set(x, "elementsCount", js.Any.fromFunction3(value))
    
    inline def setEnabled(
      value: (/* selector */ Definition, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAppium
    ): Self = StObject.set(x, "enabled", js.Any.fromFunction2(value))
    
    inline def setHasAttribute(
      value: (/* selector */ Definition, /* expectedAttribute */ String, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAssert
    ): Self = StObject.set(x, "hasAttribute", js.Any.fromFunction3(value))
    
    inline def setHasClass(
      value: (/* selector */ Definition, /* className */ String | js.Array[String], /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "hasClass", js.Any.fromFunction3(value))
    
    inline def setHidden(
      value: (/* selector */ Definition, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAppium
    ): Self = StObject.set(x, "hidden", js.Any.fromFunction2(value))
    
    inline def setNightwatchAssertionsError(value: NightwatchAssertionsError): Self = StObject.set(x, "NightwatchAssertionsError", value.asInstanceOf[js.Any])
    
    inline def setSelected(
      value: (/* selector */ Definition, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAppium
    ): Self = StObject.set(x, "selected", js.Any.fromFunction2(value))
    
    inline def setTextContains(
      value: (/* selector */ Definition, /* expectedText */ String, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "textContains", js.Any.fromFunction3(value))
    
    inline def setTextEquals(
      value: (/* selector */ Definition, /* expectedText */ String, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "textEquals", js.Any.fromFunction3(value))
    
    inline def setTextMatches(
      value: (/* selector */ Definition, /* regex */ String | js.RegExp, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "textMatches", js.Any.fromFunction3(value))
    
    inline def setTitle(
      value: (/* expected */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "title", js.Any.fromFunction2(value))
    
    inline def setTitleContains(
      value: (/* expected */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "titleContains", js.Any.fromFunction2(value))
    
    inline def setTitleEquals(
      value: (/* expected */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "titleEquals", js.Any.fromFunction2(value))
    
    inline def setTitleMatches(
      value: (/* regex */ String | js.RegExp, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "titleMatches", js.Any.fromFunction2(value))
    
    inline def setUrlContains(
      value: (/* expectedText */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "urlContains", js.Any.fromFunction2(value))
    
    inline def setUrlEquals(
      value: (/* expected */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "urlEquals", js.Any.fromFunction2(value))
    
    inline def setUrlMatches(
      value: (/* regex */ String | js.RegExp, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "urlMatches", js.Any.fromFunction2(value))
    
    inline def setValue(
      value: (/* selector */ Definition, /* expectedText */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "value", js.Any.fromFunction3(value))
    
    inline def setValueContains(
      value: (/* selector */ Definition, /* expectedText */ String, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "valueContains", js.Any.fromFunction3(value))
    
    inline def setValueEquals(
      value: (/* selector */ Definition, /* expected */ String, /* msg */ js.UndefOr[String]) => AwaitableNightwatchAPINigAcceptAlert
    ): Self = StObject.set(x, "valueEquals", js.Any.fromFunction3(value))
    
    inline def setVisible(
      value: (/* selector */ Definition, /* message */ js.UndefOr[String]) => AwaitableNightwatchAPINigAppium
    ): Self = StObject.set(x, "visible", js.Any.fromFunction2(value))
  }
}
