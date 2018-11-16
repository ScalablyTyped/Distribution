package typings
package modernizrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModernizrAPI extends js.Object {
  var _domPrefixes: js.Array[java.lang.String] = js.native
  var _prefixes: js.Array[java.lang.String] = js.native
  def addTest(feature: java.lang.String, test: js.Function0[scala.Boolean]): ModernizrStatic = js.native
  def addTest(feature: java.lang.String, test: scala.Boolean): ModernizrStatic = js.native
  def addTest(feature: Dictionary[_]): ModernizrStatic = js.native
  def atRule(prop: java.lang.String): scala.Boolean = js.native
  def hasEvent(eventName: java.lang.String): scala.Boolean = js.native
  def hasEvent(eventName: java.lang.String, element: stdLib.EventTarget): scala.Boolean = js.native
  def mq(mq: java.lang.String): scala.Boolean = js.native
  def on(feature: java.lang.String, cb: js.Function1[/* result */ scala.Boolean, _]): scala.Unit = js.native
  def prefixed(prop: java.lang.String): java.lang.String = js.native
  def prefixed(prop: java.lang.String, obj: stdLib.EventTarget): js.Any = js.native
  def prefixed(prop: java.lang.String, obj: stdLib.EventTarget, element: scala.Boolean): js.Any = js.native
  def prefixedCSS(prop: java.lang.String): java.lang.String = js.native
  def prefixedCSSValue(prop: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def testAllProps(prop: java.lang.String): scala.Boolean = js.native
  def testAllProps(prop: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def testAllProps(prop: java.lang.String, value: java.lang.String, skipValueTest: scala.Boolean): scala.Boolean = js.native
  def testProp(prop: java.lang.String): scala.Boolean = js.native
  def testProp(prop: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def testProp(prop: java.lang.String, value: java.lang.String, useValue: scala.Boolean): scala.Boolean = js.native
  def testStyles(
    rule: java.lang.String,
    callback: js.Function2[/* elem */ stdLib.HTMLDivElement, /* rule */ java.lang.String, scala.Unit]
  ): scala.Boolean = js.native
  def testStyles(
    rule: java.lang.String,
    callback: js.Function2[/* elem */ stdLib.HTMLDivElement, /* rule */ java.lang.String, scala.Unit],
    nodes: scala.Double
  ): scala.Boolean = js.native
  def testStyles(
    rule: java.lang.String,
    callback: js.Function2[/* elem */ stdLib.HTMLDivElement, /* rule */ java.lang.String, scala.Unit],
    nodes: scala.Double,
    testnames: js.Array[java.lang.String]
  ): scala.Boolean = js.native
}

