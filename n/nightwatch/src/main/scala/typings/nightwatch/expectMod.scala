package typings.nightwatch

import typings.nightwatch.mod.Awaitable
import typings.nightwatch.mod.Definition
import typings.nightwatch.mod.NightwatchAPI
import typings.nightwatch.nightwatchInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expectMod {
  
  @js.native
  trait Expect extends StObject {
    
    /**
      *  Expect assertions operating on a single cookie after
      *  retrieving the entire cookie string, using .getCookies().
      */
    def cookie(name: String): ExpectCookie = js.native
    def cookie(name: String, domain: String): ExpectCookie = js.native
    
    /**
      * Expect assertions operating on a single element, specified by its CSS/Xpath selector.
      */
    def element(property: Definition): ExpectElement = js.native
    
    /**
      * Expect assertions operating on a collection of elements, specified by a CSS/Xpath selector.
      * So far only .count is available.
      */
    def elements(property: Definition): ExpectElements = js.native
    
    /**
      * Expect assertions operating on a page-object section, specified by '`@section_name`'.
      */
    def section(property: Definition): ExpectSection = js.native
    
    /**
      * Retrieves the page title value in order to be used for performing equal, match or contains assertions on it.
      */
    def title(): ExpectTitle = js.native
    
    /**
      * Retrieves the page url value in order to be used for performing equal, match or contains assertions on it.
      */
    def url(): ExpectUrl = js.native
  }
  
  trait ExpectAssertions[T]
    extends StObject
       with ExpectLanguageChains[T] {
    
    def after(ms: Double): Awaitable[T, NightwatchExpectResult]
    
    def before(ms: Double): Awaitable[T, NightwatchExpectResult]
    
    def contain(value: String): Awaitable[T, NightwatchExpectResult]
    @JSName("contain")
    var contain_Original: ExpectInclude[T]
    
    def contains(value: String): Awaitable[T, NightwatchExpectResult]
    @JSName("contains")
    var contains_Original: ExpectInclude[T]
    
    def endWith(value: String): Awaitable[T, NightwatchExpectResult]
    @JSName("endWith")
    var endWith_Original: ExpectEndWith[T]
    
    def endsWith(value: String): Awaitable[T, NightwatchExpectResult]
    @JSName("endsWith")
    var endsWith_Original: ExpectEndWith[T]
    
    @JSName("eq")
    var eq_Original: ExpectEqual[T]
    
    def equal(value: Any): Awaitable[T, NightwatchExpectResult]
    @JSName("equal")
    var equal_Original: ExpectEqual[T]
    
    @JSName("equals")
    var equals_Original: ExpectEqual[T]
    
    def include(value: String): Awaitable[T, NightwatchExpectResult]
    @JSName("include")
    var include_Original: ExpectInclude[T]
    
    def includes(value: String): Awaitable[T, NightwatchExpectResult]
    @JSName("includes")
    var includes_Original: ExpectInclude[T]
    
    def `match`(regexp: js.RegExp): Awaitable[T, NightwatchExpectResult]
    @JSName("match")
    var match_Original: ExpectMatch[T]
    
    def matches(regexp: js.RegExp): Awaitable[T, NightwatchExpectResult]
    @JSName("matches")
    var matches_Original: ExpectMatch[T]
    
    def startWith(value: String): Awaitable[T, NightwatchExpectResult]
    @JSName("startWith")
    var startWith_Original: ExpectStartWith[T]
    
    def startsWith(value: String): Awaitable[T, NightwatchExpectResult]
    @JSName("startsWith")
    var startsWith_Original: ExpectStartWith[T]
    
    def toBe(value: Any): NightwatchAPI
    
    def toContain(value: String): NightwatchAPI
    
    def toEndWith(value: String): NightwatchAPI
    
    // Assertion methods returning NightwatchAPI
    def toEqual(value: Any): NightwatchAPI
    
    def toMatch(regexp: js.RegExp): NightwatchAPI
  }
  object ExpectAssertions {
    
    inline def apply[T](
      after: Double => Awaitable[T, NightwatchExpectResult],
      and: T,
      at: T,
      be: T,
      been: T,
      before: Double => Awaitable[T, NightwatchExpectResult],
      contain: /* value */ String => Awaitable[T, NightwatchExpectResult],
      contains: /* value */ String => Awaitable[T, NightwatchExpectResult],
      deep: T,
      does: T,
      endWith: /* value */ String => Awaitable[T, NightwatchExpectResult],
      endsWith: /* value */ String => Awaitable[T, NightwatchExpectResult],
      eq_ : /* value */ Any => Awaitable[T, NightwatchExpectResult],
      equal: /* value */ Any => Awaitable[T, NightwatchExpectResult],
      equals_ : /* value */ Any => Awaitable[T, NightwatchExpectResult],
      has: T,
      have: T,
      include: /* value */ String => Awaitable[T, NightwatchExpectResult],
      includes: /* value */ String => Awaitable[T, NightwatchExpectResult],
      is: T,
      `match`: /* regexp */ js.RegExp => Awaitable[T, NightwatchExpectResult],
      matches: /* regexp */ js.RegExp => Awaitable[T, NightwatchExpectResult],
      not: T,
      of: T,
      same: T,
      startWith: /* value */ String => Awaitable[T, NightwatchExpectResult],
      startsWith: /* value */ String => Awaitable[T, NightwatchExpectResult],
      that: T,
      to: T,
      toBe: Any => NightwatchAPI,
      toContain: String => NightwatchAPI,
      toEndWith: String => NightwatchAPI,
      toEqual: Any => NightwatchAPI,
      toMatch: js.RegExp => NightwatchAPI,
      which: T,
      `with`: T
    ): ExpectAssertions[T] = {
      val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], been = been.asInstanceOf[js.Any], before = js.Any.fromFunction1(before), contain = js.Any.fromFunction1(contain), contains = js.Any.fromFunction1(contains), deep = deep.asInstanceOf[js.Any], does = does.asInstanceOf[js.Any], endWith = js.Any.fromFunction1(endWith), endsWith = js.Any.fromFunction1(endsWith), equal = js.Any.fromFunction1(equal), has = has.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], include = js.Any.fromFunction1(include), includes = js.Any.fromFunction1(includes), is = is.asInstanceOf[js.Any], matches = js.Any.fromFunction1(matches), not = not.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], same = same.asInstanceOf[js.Any], startWith = js.Any.fromFunction1(startWith), startsWith = js.Any.fromFunction1(startsWith), that = that.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], toBe = js.Any.fromFunction1(toBe), toContain = js.Any.fromFunction1(toContain), toEndWith = js.Any.fromFunction1(toEndWith), toEqual = js.Any.fromFunction1(toEqual), toMatch = js.Any.fromFunction1(toMatch), which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("eq")(js.Any.fromFunction1(eq_))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectAssertions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpectAssertions[?], T] (val x: Self & ExpectAssertions[T]) extends AnyVal {
      
      inline def setAfter(value: Double => Awaitable[T, NightwatchExpectResult]): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
      
      inline def setBefore(value: Double => Awaitable[T, NightwatchExpectResult]): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
      
      inline def setContain(value: /* value */ String => Awaitable[T, NightwatchExpectResult]): Self = StObject.set(x, "contain", js.Any.fromFunction1(value))
      
      inline def setContains(value: /* value */ String => Awaitable[T, NightwatchExpectResult]): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setEndWith(value: /* value */ String => Awaitable[T, NightwatchExpectResult]): Self = StObject.set(x, "endWith", js.Any.fromFunction1(value))
      
      inline def setEndsWith(value: /* value */ String => Awaitable[T, NightwatchExpectResult]): Self = StObject.set(x, "endsWith", js.Any.fromFunction1(value))
      
      inline def setEq_(value: /* value */ Any => Awaitable[T, NightwatchExpectResult]): Self = StObject.set(x, "eq", js.Any.fromFunction1(value))
      
      inline def setEqual(value: /* value */ Any => Awaitable[T, NightwatchExpectResult]): Self = StObject.set(x, "equal", js.Any.fromFunction1(value))
      
      inline def setEquals_(value: /* value */ Any => Awaitable[T, NightwatchExpectResult]): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setInclude(value: /* value */ String => Awaitable[T, NightwatchExpectResult]): Self = StObject.set(x, "include", js.Any.fromFunction1(value))
      
      inline def setIncludes(value: /* value */ String => Awaitable[T, NightwatchExpectResult]): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      inline def setMatch(value: /* regexp */ js.RegExp => Awaitable[T, NightwatchExpectResult]): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setMatches(value: /* regexp */ js.RegExp => Awaitable[T, NightwatchExpectResult]): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
      
      inline def setStartWith(value: /* value */ String => Awaitable[T, NightwatchExpectResult]): Self = StObject.set(x, "startWith", js.Any.fromFunction1(value))
      
      inline def setStartsWith(value: /* value */ String => Awaitable[T, NightwatchExpectResult]): Self = StObject.set(x, "startsWith", js.Any.fromFunction1(value))
      
      inline def setToBe(value: Any => NightwatchAPI): Self = StObject.set(x, "toBe", js.Any.fromFunction1(value))
      
      inline def setToContain(value: String => NightwatchAPI): Self = StObject.set(x, "toContain", js.Any.fromFunction1(value))
      
      inline def setToEndWith(value: String => NightwatchAPI): Self = StObject.set(x, "toEndWith", js.Any.fromFunction1(value))
      
      inline def setToEqual(value: Any => NightwatchAPI): Self = StObject.set(x, "toEqual", js.Any.fromFunction1(value))
      
      inline def setToMatch(value: js.RegExp => NightwatchAPI): Self = StObject.set(x, "toMatch", js.Any.fromFunction1(value))
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ExpectCookie = nightwatch.nightwatch/expect.ExpectAssertions<nightwatch.nightwatch/expect.ExpectCookie>
  }}}
  to avoid circular code involving: 
  - nightwatch.nightwatch/expect.ExpectCookie
  */
  trait ExpectCookie
    extends StObject
       with ExpectAssertions[ExpectCookie]
  object ExpectCookie {
    
    inline def apply(
      after: Double => Awaitable[ExpectCookie, NightwatchExpectResult],
      and: ExpectCookie,
      at: ExpectCookie,
      be: ExpectCookie,
      been: ExpectCookie,
      before: Double => Awaitable[ExpectCookie, NightwatchExpectResult],
      contain: /* value */ String => Awaitable[ExpectCookie, NightwatchExpectResult],
      contains: /* value */ String => Awaitable[ExpectCookie, NightwatchExpectResult],
      deep: ExpectCookie,
      does: ExpectCookie,
      endWith: /* value */ String => Awaitable[ExpectCookie, NightwatchExpectResult],
      endsWith: /* value */ String => Awaitable[ExpectCookie, NightwatchExpectResult],
      eq_ : /* value */ Any => Awaitable[ExpectCookie, NightwatchExpectResult],
      equal: /* value */ Any => Awaitable[ExpectCookie, NightwatchExpectResult],
      equals_ : /* value */ Any => Awaitable[ExpectCookie, NightwatchExpectResult],
      has: ExpectCookie,
      have: ExpectCookie,
      include: /* value */ String => Awaitable[ExpectCookie, NightwatchExpectResult],
      includes: /* value */ String => Awaitable[ExpectCookie, NightwatchExpectResult],
      is: ExpectCookie,
      `match`: /* regexp */ js.RegExp => Awaitable[ExpectCookie, NightwatchExpectResult],
      matches: /* regexp */ js.RegExp => Awaitable[ExpectCookie, NightwatchExpectResult],
      not: ExpectCookie,
      of: ExpectCookie,
      same: ExpectCookie,
      startWith: /* value */ String => Awaitable[ExpectCookie, NightwatchExpectResult],
      startsWith: /* value */ String => Awaitable[ExpectCookie, NightwatchExpectResult],
      that: ExpectCookie,
      to: ExpectCookie,
      toBe: Any => NightwatchAPI,
      toContain: String => NightwatchAPI,
      toEndWith: String => NightwatchAPI,
      toEqual: Any => NightwatchAPI,
      toMatch: js.RegExp => NightwatchAPI,
      which: ExpectCookie,
      `with`: ExpectCookie
    ): ExpectCookie = {
      val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], been = been.asInstanceOf[js.Any], before = js.Any.fromFunction1(before), contain = js.Any.fromFunction1(contain), contains = js.Any.fromFunction1(contains), deep = deep.asInstanceOf[js.Any], does = does.asInstanceOf[js.Any], endWith = js.Any.fromFunction1(endWith), endsWith = js.Any.fromFunction1(endsWith), equal = js.Any.fromFunction1(equal), has = has.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], include = js.Any.fromFunction1(include), includes = js.Any.fromFunction1(includes), is = is.asInstanceOf[js.Any], matches = js.Any.fromFunction1(matches), not = not.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], same = same.asInstanceOf[js.Any], startWith = js.Any.fromFunction1(startWith), startsWith = js.Any.fromFunction1(startsWith), that = that.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], toBe = js.Any.fromFunction1(toBe), toContain = js.Any.fromFunction1(toContain), toEndWith = js.Any.fromFunction1(toEndWith), toEqual = js.Any.fromFunction1(toEqual), toMatch = js.Any.fromFunction1(toMatch), which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("eq")(js.Any.fromFunction1(eq_))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectCookie]
    }
  }
  
  @js.native
  trait ExpectElement
    extends StObject
       with ExpectAssertions[ExpectElement] {
    
    /**
      * Checks if the type (i.e. tag name) of a specified element is of an expected value.
      */
    def a(`type`: String): Awaitable[this.type, NightwatchExpectResult] = js.native
    def a(`type`: String, message: String): Awaitable[this.type, NightwatchExpectResult] = js.native
    
    /**
      * Property that checks if an element is active in the DOM.
      */
    var active: Awaitable[this.type, NightwatchExpectResult] = js.native
    
    /**
      * Checks if the type (i.e. tag name) of a specified element is of an expected value.
      */
    def an(`type`: String): Awaitable[this.type, NightwatchExpectResult] = js.native
    def an(`type`: String, message: String): Awaitable[this.type, NightwatchExpectResult] = js.native
    
    /**
      * Checks if a given attribute of an element exists and optionally if it has the expected value.
      */
    def attribute(attribute: String): Awaitable[this.type, NightwatchExpectResult] = js.native
    def attribute(attribute: String, message: String): Awaitable[this.type, NightwatchExpectResult] = js.native
    
    /**
      * Checks a given css property of an element exists and optionally if it has the expected value.
      */
    def css(property: String): Awaitable[this.type, NightwatchExpectResult] = js.native
    def css(property: String, message: String): Awaitable[this.type, NightwatchExpectResult] = js.native
    
    /**
      * Checks if the specified DOM property of a given element is present and has the expected value.
      * For all the available DOM element properties, consult the [Element doc at MDN](https://developer.mozilla.org/en-US/docs/Web/API/element).
      */
    def domProperty(propertyName: String): Awaitable[this.type, NightwatchExpectResult] = js.native
    def domProperty(propertyName: String, message: String): Awaitable[this.type, NightwatchExpectResult] = js.native
    
    /**
      * Property that checks if an element is currently enabled.
      */
    var enabled: Awaitable[this.type, NightwatchExpectResult] = js.native
    
    /**
      * Property that checks if an element is present in the DOM.
      */
    var present: Awaitable[this.type, NightwatchExpectResult] = js.native
    
    /**
      * Checks if a given DOM property of an element has the expected value.
      * For all the available DOM element properties, consult the [Element doc at MDN](https://developer.mozilla.org/en-US/docs/Web/API/element).
      */
    def property(name: String): Awaitable[this.type, NightwatchExpectResult] = js.native
    def property(name: String, message: String): Awaitable[this.type, NightwatchExpectResult] = js.native
    
    /**
      * Property that checks if an OPTION element, or an INPUT element of type checkbox or radio button is currently selected.
      */
    var selected: Awaitable[this.type, NightwatchExpectResult] = js.native
    
    /**
      * Property that retrieves the text contained by an element. Can be chained to check if contains/equals/matches the specified text or regex.
      */
    var text: Awaitable[this.type, NightwatchExpectResult] = js.native
    
    /**
      * Property that retrieves the value (i.e. the value attributed) of an element. Can be chained to check if contains/equals/matches the specified text or regex.
      */
    var value: Awaitable[this.type, NightwatchExpectResult] = js.native
    
    /**
      * Property that asserts the visibility of a specified element.
      */
    var visible: Awaitable[this.type, NightwatchExpectResult] = js.native
  }
  
  trait ExpectElements
    extends StObject
       with ExpectAssertions[ExpectElements] {
    
    /**
      * Checks if the number of elements specified by a selector is equal or not to a given value.
      */
    var count: this.type
  }
  object ExpectElements {
    
    inline def apply(
      after: Double => Awaitable[ExpectElements, NightwatchExpectResult],
      and: ExpectElements,
      at: ExpectElements,
      be: ExpectElements,
      been: ExpectElements,
      before: Double => Awaitable[ExpectElements, NightwatchExpectResult],
      contain: /* value */ String => Awaitable[ExpectElements, NightwatchExpectResult],
      contains: /* value */ String => Awaitable[ExpectElements, NightwatchExpectResult],
      count: ExpectElements,
      deep: ExpectElements,
      does: ExpectElements,
      endWith: /* value */ String => Awaitable[ExpectElements, NightwatchExpectResult],
      endsWith: /* value */ String => Awaitable[ExpectElements, NightwatchExpectResult],
      eq_ : /* value */ Any => Awaitable[ExpectElements, NightwatchExpectResult],
      equal: /* value */ Any => Awaitable[ExpectElements, NightwatchExpectResult],
      equals_ : /* value */ Any => Awaitable[ExpectElements, NightwatchExpectResult],
      has: ExpectElements,
      have: ExpectElements,
      include: /* value */ String => Awaitable[ExpectElements, NightwatchExpectResult],
      includes: /* value */ String => Awaitable[ExpectElements, NightwatchExpectResult],
      is: ExpectElements,
      `match`: /* regexp */ js.RegExp => Awaitable[ExpectElements, NightwatchExpectResult],
      matches: /* regexp */ js.RegExp => Awaitable[ExpectElements, NightwatchExpectResult],
      not: ExpectElements,
      of: ExpectElements,
      same: ExpectElements,
      startWith: /* value */ String => Awaitable[ExpectElements, NightwatchExpectResult],
      startsWith: /* value */ String => Awaitable[ExpectElements, NightwatchExpectResult],
      that: ExpectElements,
      to: ExpectElements,
      toBe: Any => NightwatchAPI,
      toContain: String => NightwatchAPI,
      toEndWith: String => NightwatchAPI,
      toEqual: Any => NightwatchAPI,
      toMatch: js.RegExp => NightwatchAPI,
      which: ExpectElements,
      `with`: ExpectElements
    ): ExpectElements = {
      val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], been = been.asInstanceOf[js.Any], before = js.Any.fromFunction1(before), contain = js.Any.fromFunction1(contain), contains = js.Any.fromFunction1(contains), count = count.asInstanceOf[js.Any], deep = deep.asInstanceOf[js.Any], does = does.asInstanceOf[js.Any], endWith = js.Any.fromFunction1(endWith), endsWith = js.Any.fromFunction1(endsWith), equal = js.Any.fromFunction1(equal), has = has.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], include = js.Any.fromFunction1(include), includes = js.Any.fromFunction1(includes), is = is.asInstanceOf[js.Any], matches = js.Any.fromFunction1(matches), not = not.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], same = same.asInstanceOf[js.Any], startWith = js.Any.fromFunction1(startWith), startsWith = js.Any.fromFunction1(startsWith), that = that.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], toBe = js.Any.fromFunction1(toBe), toContain = js.Any.fromFunction1(toContain), toEndWith = js.Any.fromFunction1(toEndWith), toEqual = js.Any.fromFunction1(toEqual), toMatch = js.Any.fromFunction1(toMatch), which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("eq")(js.Any.fromFunction1(eq_))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectElements]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpectElements] (val x: Self) extends AnyVal {
      
      inline def setCount(value: ExpectElements): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    }
  }
  
  type ExpectEndWith[T] = js.Function1[/* value */ String, Awaitable[T, NightwatchExpectResult]]
  
  type ExpectEqual[T] = js.Function1[/* value */ Any, Awaitable[T, NightwatchExpectResult]]
  
  type ExpectInclude[T] = js.Function1[/* value */ String, Awaitable[T, NightwatchExpectResult]]
  
  trait ExpectLanguageChains[T] extends StObject {
    
    var and: T
    
    var at: T
    
    var be: T
    
    var been: T
    
    /**
      * Sets the `deep` flag, later to be used by the `equal`.
      */
    var deep: T
    
    var does: T
    
    var has: T
    
    var have: T
    
    var is: T
    
    /**
      * Negates any of assertions following in the chain.
      */
    var not: T
    
    var of: T
    
    var same: T
    
    var that: T
    
    // The following are provided as chainable getters
    // to improve the readability of your assertions.
    // They do not provide testing capabilities and
    // the order is not important.
    var to: T
    
    var which: T
    
    var `with`: T
  }
  object ExpectLanguageChains {
    
    inline def apply[T](
      and: T,
      at: T,
      be: T,
      been: T,
      deep: T,
      does: T,
      has: T,
      have: T,
      is: T,
      not: T,
      of: T,
      same: T,
      that: T,
      to: T,
      which: T,
      `with`: T
    ): ExpectLanguageChains[T] = {
      val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], been = been.asInstanceOf[js.Any], deep = deep.asInstanceOf[js.Any], does = does.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], same = same.asInstanceOf[js.Any], that = that.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectLanguageChains[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpectLanguageChains[?], T] (val x: Self & ExpectLanguageChains[T]) extends AnyVal {
      
      inline def setAnd(value: T): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      inline def setAt(value: T): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setBe(value: T): Self = StObject.set(x, "be", value.asInstanceOf[js.Any])
      
      inline def setBeen(value: T): Self = StObject.set(x, "been", value.asInstanceOf[js.Any])
      
      inline def setDeep(value: T): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDoes(value: T): Self = StObject.set(x, "does", value.asInstanceOf[js.Any])
      
      inline def setHas(value: T): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setHave(value: T): Self = StObject.set(x, "have", value.asInstanceOf[js.Any])
      
      inline def setIs(value: T): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setNot(value: T): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      inline def setOf(value: T): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
      
      inline def setSame(value: T): Self = StObject.set(x, "same", value.asInstanceOf[js.Any])
      
      inline def setThat(value: T): Self = StObject.set(x, "that", value.asInstanceOf[js.Any])
      
      inline def setTo(value: T): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setWhich(value: T): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
      
      inline def setWith(value: T): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
    }
  }
  
  type ExpectMatch[T] = js.Function1[/* regexp */ js.RegExp, Awaitable[T, NightwatchExpectResult]]
  
  @js.native
  trait ExpectSection
    extends StObject
       with ExpectElement
  
  type ExpectStartWith[T] = js.Function1[/* value */ String, Awaitable[T, NightwatchExpectResult]]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ExpectTitle = nightwatch.nightwatch/expect.ExpectAssertions<nightwatch.nightwatch/expect.ExpectTitle>
  }}}
  to avoid circular code involving: 
  - nightwatch.nightwatch/expect.ExpectTitle
  */
  trait ExpectTitle
    extends StObject
       with ExpectAssertions[ExpectTitle]
  object ExpectTitle {
    
    inline def apply(
      after: Double => Awaitable[ExpectTitle, NightwatchExpectResult],
      and: ExpectTitle,
      at: ExpectTitle,
      be: ExpectTitle,
      been: ExpectTitle,
      before: Double => Awaitable[ExpectTitle, NightwatchExpectResult],
      contain: /* value */ String => Awaitable[ExpectTitle, NightwatchExpectResult],
      contains: /* value */ String => Awaitable[ExpectTitle, NightwatchExpectResult],
      deep: ExpectTitle,
      does: ExpectTitle,
      endWith: /* value */ String => Awaitable[ExpectTitle, NightwatchExpectResult],
      endsWith: /* value */ String => Awaitable[ExpectTitle, NightwatchExpectResult],
      eq_ : /* value */ Any => Awaitable[ExpectTitle, NightwatchExpectResult],
      equal: /* value */ Any => Awaitable[ExpectTitle, NightwatchExpectResult],
      equals_ : /* value */ Any => Awaitable[ExpectTitle, NightwatchExpectResult],
      has: ExpectTitle,
      have: ExpectTitle,
      include: /* value */ String => Awaitable[ExpectTitle, NightwatchExpectResult],
      includes: /* value */ String => Awaitable[ExpectTitle, NightwatchExpectResult],
      is: ExpectTitle,
      `match`: /* regexp */ js.RegExp => Awaitable[ExpectTitle, NightwatchExpectResult],
      matches: /* regexp */ js.RegExp => Awaitable[ExpectTitle, NightwatchExpectResult],
      not: ExpectTitle,
      of: ExpectTitle,
      same: ExpectTitle,
      startWith: /* value */ String => Awaitable[ExpectTitle, NightwatchExpectResult],
      startsWith: /* value */ String => Awaitable[ExpectTitle, NightwatchExpectResult],
      that: ExpectTitle,
      to: ExpectTitle,
      toBe: Any => NightwatchAPI,
      toContain: String => NightwatchAPI,
      toEndWith: String => NightwatchAPI,
      toEqual: Any => NightwatchAPI,
      toMatch: js.RegExp => NightwatchAPI,
      which: ExpectTitle,
      `with`: ExpectTitle
    ): ExpectTitle = {
      val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], been = been.asInstanceOf[js.Any], before = js.Any.fromFunction1(before), contain = js.Any.fromFunction1(contain), contains = js.Any.fromFunction1(contains), deep = deep.asInstanceOf[js.Any], does = does.asInstanceOf[js.Any], endWith = js.Any.fromFunction1(endWith), endsWith = js.Any.fromFunction1(endsWith), equal = js.Any.fromFunction1(equal), has = has.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], include = js.Any.fromFunction1(include), includes = js.Any.fromFunction1(includes), is = is.asInstanceOf[js.Any], matches = js.Any.fromFunction1(matches), not = not.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], same = same.asInstanceOf[js.Any], startWith = js.Any.fromFunction1(startWith), startsWith = js.Any.fromFunction1(startsWith), that = that.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], toBe = js.Any.fromFunction1(toBe), toContain = js.Any.fromFunction1(toContain), toEndWith = js.Any.fromFunction1(toEndWith), toEqual = js.Any.fromFunction1(toEqual), toMatch = js.Any.fromFunction1(toMatch), which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("eq")(js.Any.fromFunction1(eq_))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectTitle]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ExpectUrl = nightwatch.nightwatch/expect.ExpectAssertions<nightwatch.nightwatch/expect.ExpectUrl>
  }}}
  to avoid circular code involving: 
  - nightwatch.nightwatch/expect.ExpectUrl
  */
  trait ExpectUrl
    extends StObject
       with ExpectAssertions[ExpectUrl]
  object ExpectUrl {
    
    inline def apply(
      after: Double => Awaitable[ExpectUrl, NightwatchExpectResult],
      and: ExpectUrl,
      at: ExpectUrl,
      be: ExpectUrl,
      been: ExpectUrl,
      before: Double => Awaitable[ExpectUrl, NightwatchExpectResult],
      contain: /* value */ String => Awaitable[ExpectUrl, NightwatchExpectResult],
      contains: /* value */ String => Awaitable[ExpectUrl, NightwatchExpectResult],
      deep: ExpectUrl,
      does: ExpectUrl,
      endWith: /* value */ String => Awaitable[ExpectUrl, NightwatchExpectResult],
      endsWith: /* value */ String => Awaitable[ExpectUrl, NightwatchExpectResult],
      eq_ : /* value */ Any => Awaitable[ExpectUrl, NightwatchExpectResult],
      equal: /* value */ Any => Awaitable[ExpectUrl, NightwatchExpectResult],
      equals_ : /* value */ Any => Awaitable[ExpectUrl, NightwatchExpectResult],
      has: ExpectUrl,
      have: ExpectUrl,
      include: /* value */ String => Awaitable[ExpectUrl, NightwatchExpectResult],
      includes: /* value */ String => Awaitable[ExpectUrl, NightwatchExpectResult],
      is: ExpectUrl,
      `match`: /* regexp */ js.RegExp => Awaitable[ExpectUrl, NightwatchExpectResult],
      matches: /* regexp */ js.RegExp => Awaitable[ExpectUrl, NightwatchExpectResult],
      not: ExpectUrl,
      of: ExpectUrl,
      same: ExpectUrl,
      startWith: /* value */ String => Awaitable[ExpectUrl, NightwatchExpectResult],
      startsWith: /* value */ String => Awaitable[ExpectUrl, NightwatchExpectResult],
      that: ExpectUrl,
      to: ExpectUrl,
      toBe: Any => NightwatchAPI,
      toContain: String => NightwatchAPI,
      toEndWith: String => NightwatchAPI,
      toEqual: Any => NightwatchAPI,
      toMatch: js.RegExp => NightwatchAPI,
      which: ExpectUrl,
      `with`: ExpectUrl
    ): ExpectUrl = {
      val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], been = been.asInstanceOf[js.Any], before = js.Any.fromFunction1(before), contain = js.Any.fromFunction1(contain), contains = js.Any.fromFunction1(contains), deep = deep.asInstanceOf[js.Any], does = does.asInstanceOf[js.Any], endWith = js.Any.fromFunction1(endWith), endsWith = js.Any.fromFunction1(endsWith), equal = js.Any.fromFunction1(equal), has = has.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], include = js.Any.fromFunction1(include), includes = js.Any.fromFunction1(includes), is = is.asInstanceOf[js.Any], matches = js.Any.fromFunction1(matches), not = not.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], same = same.asInstanceOf[js.Any], startWith = js.Any.fromFunction1(startWith), startsWith = js.Any.fromFunction1(startsWith), that = that.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], toBe = js.Any.fromFunction1(toBe), toContain = js.Any.fromFunction1(toContain), toEndWith = js.Any.fromFunction1(toEndWith), toEqual = js.Any.fromFunction1(toEqual), toMatch = js.Any.fromFunction1(toMatch), which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("eq")(js.Any.fromFunction1(eq_))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectUrl]
    }
  }
  
  trait NightwatchExpectResult extends StObject {
    
    var returned: `1`
    
    var value: Null
  }
  object NightwatchExpectResult {
    
    inline def apply(value: Null): NightwatchExpectResult = {
      val __obj = js.Dynamic.literal(returned = 1, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NightwatchExpectResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NightwatchExpectResult] (val x: Self) extends AnyVal {
      
      inline def setReturned(value: `1`): Self = StObject.set(x, "returned", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Null): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
