package typings
package atOracleOraclejetLib.ojmasonrylayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojMasonryLayout
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponent[ojMasonryLayoutSettableProperties] {
  var onOjAnimateEnd: (js.Function1[
    /* event */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojAnimateEnd, 
    _
  ]) | scala.Null = js.native
  var onOjAnimateStart: (js.Function1[
    /* event */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojAnimateStart, 
    _
  ]) | scala.Null = js.native
  var onOjBeforeInsert: (js.Function1[
    /* event */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeInsert, 
    _
  ]) | scala.Null = js.native
  var onOjBeforeRemove: (js.Function1[
    /* event */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeRemove, 
    _
  ]) | scala.Null = js.native
  var onOjBeforeReorder: (js.Function1[
    /* event */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeReorder, 
    _
  ]) | scala.Null = js.native
  var onOjBeforeResize: (js.Function1[
    /* event */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeResize, 
    _
  ]) | scala.Null = js.native
  var onOjInsert: (js.Function1[/* event */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojInsert, _]) | scala.Null = js.native
  var onOjRemove: (js.Function1[/* event */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojRemove, _]) | scala.Null = js.native
  var onOjReorder: (js.Function1[/* event */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojReorder, _]) | scala.Null = js.native
  var onOjResize: (js.Function1[/* event */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojResize, _]) | scala.Null = js.native
  var onReorderHandleChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['reorderHandle'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var reorderHandle: java.lang.String | scala.Null = js.native
  @JSName("translations")
  var translations_ojMasonryLayout: atOracleOraclejetLib.Anon_LabelCut = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.reorderHandleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['reorderHandle'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.reorderHandleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['reorderHandle'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojAnimateEnd, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojAnimateEnd, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojAnimateStart, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojAnimateStart, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeInsert(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeInsert,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeInsert, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeInsert(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeInsert,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeInsert, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRemove(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeRemove,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeRemove, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRemove(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeRemove,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeRemove, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeReorder(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeReorder,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeReorder, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeReorder(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeReorder,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeReorder, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeResize(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeResize,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeResize, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeResize(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeResize,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojBeforeResize, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojInsert(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojInsert,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojInsert, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojInsert(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojInsert,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojInsert, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojRemove(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojRemove,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojRemove, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojRemove(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojRemove,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojRemove, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojReorder,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojReorder, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojReorder,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojReorder, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojResize,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojResize, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojResize,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmasonrylayoutMod.ojMasonryLayoutNs.ojResize, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_reorderHandle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.reorderHandle): java.lang.String | scala.Null = js.native
  def insertTile(selector: java.lang.String, index: scala.Double): scala.Unit = js.native
  def removeTile(selector: java.lang.String): scala.Unit = js.native
  def resizeTile(selector: java.lang.String, sizeStyleClass: java.lang.String): scala.Unit = js.native
  def setProperties(properties: ojMasonryLayoutSettablePropertiesLenient): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_reorderHandle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.reorderHandle): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_reorderHandle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.reorderHandle, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_LabelCut
  ): scala.Unit = js.native
}

