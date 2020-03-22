package typings.oracleOraclejet.ojmasonrylayoutMod

import typings.oracleOraclejet.AnonAction
import typings.oracleOraclejet.AnonDictpropNameTile
import typings.oracleOraclejet.AnonElement
import typings.oracleOraclejet.AnonFromIndex
import typings.oracleOraclejet.AnonLabelCut
import typings.oracleOraclejet.AnonPreviousSizeStyleClass
import typings.oracleOraclejet.AnonTile
import typings.oracleOraclejet.AnonToIndex
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.ojmasonrylayoutMod.ojMasonryLayout.ojAnimateEnd
import typings.oracleOraclejet.ojmasonrylayoutMod.ojMasonryLayout.ojAnimateStart
import typings.oracleOraclejet.ojmasonrylayoutMod.ojMasonryLayout.ojBeforeInsert
import typings.oracleOraclejet.ojmasonrylayoutMod.ojMasonryLayout.ojBeforeRemove
import typings.oracleOraclejet.ojmasonrylayoutMod.ojMasonryLayout.ojBeforeReorder
import typings.oracleOraclejet.ojmasonrylayoutMod.ojMasonryLayout.ojBeforeResize
import typings.oracleOraclejet.ojmasonrylayoutMod.ojMasonryLayout.ojInsert
import typings.oracleOraclejet.ojmasonrylayoutMod.ojMasonryLayout.ojRemove
import typings.oracleOraclejet.ojmasonrylayoutMod.ojMasonryLayout.ojReorder
import typings.oracleOraclejet.ojmasonrylayoutMod.ojMasonryLayout.ojResize
import typings.oracleOraclejet.oracleOraclejetStrings.reorderHandle
import typings.oracleOraclejet.oracleOraclejetStrings.reorderHandleChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.CustomEvent
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
  var translations_ojMasonryLayout: AnonLabelCut = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAnimateEnd, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAnimateEnd, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAnimateStart, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAnimateStart, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeInsert(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeInsert,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeInsert, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeInsert(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeInsert,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeInsert, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRemove(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeRemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeRemove, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRemove(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeRemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeRemove, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeReorder(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeReorder,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeReorder, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeReorder(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeReorder,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeReorder, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeResize(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeResize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeResize, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeResize(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeResize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeResize, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojInsert(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojInsert,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojInsert, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojInsert(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojInsert,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojInsert, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojRemove(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojRemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojRemove, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojRemove(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojRemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojRemove, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojReorder,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojReorder, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojReorder,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojReorder, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojResize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojResize, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojResize,
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
  def setProperty_translations(property: translations, value: AnonLabelCut): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojmasonrylayout", "ojMasonryLayout")
@js.native
object ojMasonryLayout extends js.Object {
  type ojAnimateEnd = CustomEvent[AnonAction]
  type ojAnimateStart = CustomEvent[AnonElement]
  type ojBeforeInsert = CustomEvent[AnonTile]
  type ojBeforeRemove = CustomEvent[AnonDictpropNameTile]
  type ojBeforeReorder = CustomEvent[AnonFromIndex]
  type ojBeforeResize = CustomEvent[AnonPreviousSizeStyleClass]
  type ojInsert = CustomEvent[AnonTile]
  type ojRemove = CustomEvent[AnonDictpropNameTile]
  type ojReorder = CustomEvent[AnonToIndex]
  type ojResize = CustomEvent[AnonPreviousSizeStyleClass]
}

