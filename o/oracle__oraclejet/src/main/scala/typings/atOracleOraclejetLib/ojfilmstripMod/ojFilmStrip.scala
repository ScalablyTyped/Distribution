package typings
package atOracleOraclejetLib.ojfilmstripMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojFilmStrip
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponent[ojFilmStripSettableProperties] {
  var arrowPlacement: atOracleOraclejetLib.atOracleOraclejetLibStrings.adjacent | atOracleOraclejetLib.atOracleOraclejetLibStrings.overlay = js.native
  var arrowVisibility: atOracleOraclejetLib.atOracleOraclejetLibStrings.visible | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.hover | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  var currentItem: atOracleOraclejetLib.Anon_Id = js.native
  var looping: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.page = js.native
  var maxItemsPerPage: scala.Double = js.native
  var onArrowPlacementChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.adjacent | atOracleOraclejetLib.atOracleOraclejetLibStrings.overlay
    ], 
    _
  ]) | scala.Null = js.native
  var onArrowVisibilityChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.visible | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.hover | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ], 
    _
  ]) | scala.Null = js.native
  var onCurrentItemChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Id], 
    _
  ]) | scala.Null = js.native
  var onLoopingChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.page
    ], 
    _
  ]) | scala.Null = js.native
  var onMaxItemsPerPageChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
    _
  ]) | scala.Null = js.native
  var onOrientationChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
    ], 
    _
  ]) | scala.Null = js.native
  var orientation: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical = js.native
  @JSName("translations")
  var translations_ojFilmStrip: atOracleOraclejetLib.Anon_LabelAccArrowNextPage = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowPlacementChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.adjacent | atOracleOraclejetLib.atOracleOraclejetLibStrings.overlay
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowPlacementChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.adjacent | atOracleOraclejetLib.atOracleOraclejetLibStrings.overlay
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowVisibilityChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.visible | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.hover | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowVisibilityChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.visible | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.hover | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.loopingChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.page
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.loopingChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.page
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientationChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientationChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentItemChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentItemChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Id], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentItemChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentItemChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Id], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxItemsPerPageChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxItemsPerPageChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxItemsPerPageChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxItemsPerPageChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def getItemsPerPage(): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_arrowPlacement(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowPlacement): atOracleOraclejetLib.atOracleOraclejetLibStrings.adjacent | atOracleOraclejetLib.atOracleOraclejetLibStrings.overlay = js.native
  @JSName("getProperty")
  def getProperty_arrowVisibility(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowVisibility): atOracleOraclejetLib.atOracleOraclejetLibStrings.visible | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.hover | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  @JSName("getProperty")
  def getProperty_currentItem(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentItem): atOracleOraclejetLib.Anon_Id = js.native
  @JSName("getProperty")
  def getProperty_looping(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.looping): atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.page = js.native
  @JSName("getProperty")
  def getProperty_maxItemsPerPage(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxItemsPerPage): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientation): atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical = js.native
  def setProperties(properties: ojFilmStripSettablePropertiesLenient): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowPlacement,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.adjacent
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowPlacement,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.overlay
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowVisibility,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowVisibility,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowVisibility,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.hover
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowVisibility,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.visible
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.looping,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.looping,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.page
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientation,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientation,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_currentItem(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentItem,
    value: atOracleOraclejetLib.Anon_Id
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_maxItemsPerPage(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxItemsPerPage, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_LabelAccArrowNextPage
  ): scala.Unit = js.native
}

