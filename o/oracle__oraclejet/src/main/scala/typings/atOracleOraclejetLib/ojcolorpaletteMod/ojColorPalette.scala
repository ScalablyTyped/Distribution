package typings
package atOracleOraclejetLib.ojcolorpaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojColorPalette
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValue[
      atOracleOraclejetLib.ojcolorMod.^, 
      ojColorPaletteSettableProperties, 
      atOracleOraclejetLib.ojcolorMod.^, 
      atOracleOraclejetLib.ojcolorMod.^
    ] {
  var labelDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = js.native
  var labelledBy: java.lang.String | scala.Null = js.native
  var layout: atOracleOraclejetLib.atOracleOraclejetLibStrings.grid | atOracleOraclejetLib.atOracleOraclejetLibStrings.list = js.native
  var onLabelDisplayChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
    ], 
    _
  ]) | scala.Null = js.native
  var onLabelledByChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onLayoutChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.grid | atOracleOraclejetLib.atOracleOraclejetLibStrings.list
    ], 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojColorPalette: (js.Function1[
    /* event */ atOracleOraclejetLib.ojcolorpaletteMod.ojColorPaletteNs.ojAnimateEnd, 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojColorPalette: (js.Function1[
    /* event */ atOracleOraclejetLib.ojcolorpaletteMod.ojColorPaletteNs.ojAnimateStart, 
    _
  ]) | scala.Null = js.native
  var onPaletteChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.Anon_ColorLabel]], 
    _
  ]) | scala.Null = js.native
  var onSwatchSizeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.xs | atOracleOraclejetLib.atOracleOraclejetLibStrings.sm | atOracleOraclejetLib.atOracleOraclejetLibStrings.lg
    ], 
    _
  ]) | scala.Null = js.native
  var palette: js.Array[atOracleOraclejetLib.Anon_ColorLabel] = js.native
  var swatchSize: atOracleOraclejetLib.atOracleOraclejetLibStrings.xs | atOracleOraclejetLib.atOracleOraclejetLibStrings.sm | atOracleOraclejetLib.atOracleOraclejetLibStrings.lg = js.native
  @JSName("translations")
  var translations_ojColorPalette: atOracleOraclejetLib.Anon_LabelNone = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.layoutChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.grid | atOracleOraclejetLib.atOracleOraclejetLibStrings.list
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.layoutChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.grid | atOracleOraclejetLib.atOracleOraclejetLibStrings.list
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.swatchSizeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.xs | atOracleOraclejetLib.atOracleOraclejetLibStrings.sm | atOracleOraclejetLib.atOracleOraclejetLibStrings.lg
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.swatchSizeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.xs | atOracleOraclejetLib.atOracleOraclejetLibStrings.sm | atOracleOraclejetLib.atOracleOraclejetLibStrings.lg
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelledByChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelledByChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelledByChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelledByChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paletteChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.paletteChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.Anon_ColorLabel]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paletteChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.paletteChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.Anon_ColorLabel]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_labelDisplay(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelDisplay): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = js.native
  @JSName("getProperty")
  def getProperty_labelledBy(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelledBy): java.lang.String | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_layout(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.layout): atOracleOraclejetLib.atOracleOraclejetLibStrings.grid | atOracleOraclejetLib.atOracleOraclejetLibStrings.list = js.native
  @JSName("getProperty")
  def getProperty_palette(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.palette): js.Array[atOracleOraclejetLib.Anon_ColorLabel] = js.native
  @JSName("getProperty")
  def getProperty_swatchSize(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.swatchSize): atOracleOraclejetLib.atOracleOraclejetLibStrings.xs | atOracleOraclejetLib.atOracleOraclejetLibStrings.sm | atOracleOraclejetLib.atOracleOraclejetLibStrings.lg = js.native
  def setProperties(properties: ojColorPaletteSettablePropertiesLenient): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelDisplay,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelDisplay,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.layout,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.grid
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.layout,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.list
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.swatchSize,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.lg
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.swatchSize,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.sm
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.swatchSize,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.xs
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelledBy): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelledBy, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_palette(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.palette,
    value: js.Array[atOracleOraclejetLib.Anon_ColorLabel]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_LabelNone
  ): scala.Unit = js.native
}

