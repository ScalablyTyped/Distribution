package typings.modernizr

import typings.std.EventTarget
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModernizrAPI extends StObject {
  
  var _domPrefixes: js.Array[String] = js.native
  
  var _prefixes: js.Array[String] = js.native
  
  def addTest(feature: String, test: js.Function0[Boolean]): ModernizrStatic = js.native
  def addTest(feature: String, test: Boolean): ModernizrStatic = js.native
  def addTest(feature: Dictionary[js.Any]): ModernizrStatic = js.native
  
  def atRule(prop: String): Boolean = js.native
  
  def hasEvent(eventName: String): Boolean = js.native
  def hasEvent(eventName: String, element: EventTarget): Boolean = js.native
  
  def mq(mq: String): Boolean = js.native
  
  def on(feature: String, cb: js.Function1[/* result */ Boolean, js.Any]): Unit = js.native
  
  def prefixed(prop: String): String = js.native
  def prefixed(prop: String, obj: EventTarget): js.Any = js.native
  def prefixed(prop: String, obj: EventTarget, element: Boolean): js.Any = js.native
  
  def prefixedCSS(prop: String): String = js.native
  
  def prefixedCSSValue(prop: String, value: String): Boolean = js.native
  
  def testAllProps(prop: String): Boolean = js.native
  def testAllProps(prop: String, value: String): Boolean = js.native
  def testAllProps(prop: String, value: String, skipValueTest: Boolean): Boolean = js.native
  def testAllProps(prop: String, value: Unit, skipValueTest: Boolean): Boolean = js.native
  
  def testProp(prop: String): Boolean = js.native
  def testProp(prop: String, value: String): Boolean = js.native
  def testProp(prop: String, value: String, useValue: Boolean): Boolean = js.native
  def testProp(prop: String, value: Unit, useValue: Boolean): Boolean = js.native
  
  def testStyles(rule: String, callback: js.Function2[/* elem */ HTMLDivElement, /* rule */ String, Unit]): Boolean = js.native
  def testStyles(
    rule: String,
    callback: js.Function2[/* elem */ HTMLDivElement, /* rule */ String, Unit],
    nodes: Double
  ): Boolean = js.native
  def testStyles(
    rule: String,
    callback: js.Function2[/* elem */ HTMLDivElement, /* rule */ String, Unit],
    nodes: Double,
    testnames: js.Array[String]
  ): Boolean = js.native
  def testStyles(
    rule: String,
    callback: js.Function2[/* elem */ HTMLDivElement, /* rule */ String, Unit],
    nodes: Unit,
    testnames: js.Array[String]
  ): Boolean = js.native
}
