package typings.atOracleOraclejet.ojmasonrylayoutMod

import typings.atOracleOraclejet.Anon_LabelCut
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typings.atOracleOraclejet.atOracleOraclejetStrings.reorderHandle
import typings.atOracleOraclejet.atOracleOraclejetStrings.reorderHandleChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojAnimateEnd
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojAnimateStart
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeInsert
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeRemove
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeReorder
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeResize
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojInsert
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojRemove
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojReorder
import typings.atOracleOraclejet.ojmasonrylayoutMod.ojMasonryLayoutNs.ojResize
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojMasonryLayout extends baseComponent[ojMasonryLayoutSettableProperties] {
  var onOjAnimateEnd: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onOjBeforeInsert: (js.Function1[/* event */ ojBeforeInsert, _]) | Null = js.native
  var onOjBeforeRemove: (js.Function1[/* event */ ojBeforeRemove, _]) | Null = js.native
  var onOjBeforeReorder: (js.Function1[/* event */ ojBeforeReorder, _]) | Null = js.native
  var onOjBeforeResize: (js.Function1[/* event */ ojBeforeResize, _]) | Null = js.native
  var onOjInsert: (js.Function1[/* event */ ojInsert, _]) | Null = js.native
  var onOjRemove: (js.Function1[/* event */ ojRemove, _]) | Null = js.native
  var onOjReorder: (js.Function1[/* event */ ojReorder, _]) | Null = js.native
  var onOjResize: (js.Function1[/* event */ ojResize, _]) | Null = js.native
  var onReorderHandleChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  var reorderHandle: String | Null = js.native
  @JSName("translations")
  var translations_ojMasonryLayout: Anon_LabelCut = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAnimateEnd, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAnimateEnd, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojAnimateStart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAnimateStart, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojAnimateStart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAnimateStart, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeInsert(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeInsert,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeInsert, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeInsert(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeInsert,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeInsert, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRemove(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeRemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeRemove, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRemove(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeRemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeRemove, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeReorder(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeReorder,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeReorder, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeReorder(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeReorder,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeReorder, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeResize(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeResize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeResize, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeResize(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeResize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeResize, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojInsert(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojInsert,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojInsert, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojInsert(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojInsert,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojInsert, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojRemove(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojRemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojRemove, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojRemove(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojRemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojRemove, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojReorder,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojReorder, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojReorder,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojReorder, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojResize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojResize, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojResize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojResize, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reorderHandleChanged(
    `type`: reorderHandleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reorderHandleChanged(
    `type`: reorderHandleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_reorderHandle(property: reorderHandle): String | Null = js.native
  def insertTile(selector: String, index: Double): Unit = js.native
  def removeTile(selector: String): Unit = js.native
  def resizeTile(selector: String, sizeStyleClass: String): Unit = js.native
  def setProperties(properties: ojMasonryLayoutSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_reorderHandle(property: reorderHandle): Unit = js.native
  @JSName("setProperty")
  def setProperty_reorderHandle(property: reorderHandle, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_LabelCut): Unit = js.native
}

