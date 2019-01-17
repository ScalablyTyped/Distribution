package typings
package atOracleOraclejetLib.ojtagcloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTagCloud[K, D]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponent[ojTagCloudSettableProperties[K, D]] {
  var animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var as: java.lang.String = js.native
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null = js.native
  var hiddenCategories: js.Array[java.lang.String] = js.native
  var highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all = js.native
  var highlightedCategories: js.Array[java.lang.String] = js.native
  var hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var layout: atOracleOraclejetLib.atOracleOraclejetLibStrings.cloud | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangular = js.native
  var onAnimationOnDataChangeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onAsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var onDataChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onHiddenCategoriesChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onHighlightMatchChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
    ], 
    _
  ]) | scala.Null = js.native
  var onHighlightedCategoriesChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onHoverBehaviorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onLayoutChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.cloud | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangular
    ], 
    _
  ]) | scala.Null = js.native
  var onSelectionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K]], 
    _
  ]) | scala.Null = js.native
  var onSelectionModeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onStyleDefaultsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AnimationDurationHoverBehaviorDelay], 
    _
  ]) | scala.Null = js.native
  var onTooltipChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultKTooltipContext[K]
    ], 
    _
  ]) | scala.Null = js.native
  var onTouchResponseChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ], 
    _
  ]) | scala.Null = js.native
  var selection: js.Array[K] = js.native
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var styleDefaults: atOracleOraclejetLib.Anon_AnimationDurationHoverBehaviorDelay = js.native
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultKTooltipContext[K] = js.native
  var touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  @JSName("translations")
  var translations_ojTagCloud: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDataChangeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDataChangeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightMatchChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightMatchChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
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
        atOracleOraclejetLib.atOracleOraclejetLibStrings.cloud | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangular
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.layoutChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.cloud | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangular
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchResponseChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchResponseChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.asChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.asChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hiddenCategoriesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hiddenCategoriesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightedCategoriesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightedCategoriesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.styleDefaultsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AnimationDurationHoverBehaviorDelay], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.styleDefaultsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AnimationDurationHoverBehaviorDelay], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultKTooltipContext[K]
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultKTooltipContext[K]
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def getContextByNode(node: stdLib.Element): atOracleOraclejetLib.ojtagcloudMod.ojTagCloudNs.NodeContext | scala.Null = js.native
  def getItem(index: scala.Double): atOracleOraclejetLib.ojtagcloudMod.ojTagCloudNs.ItemContext | scala.Null = js.native
  def getItemCount(): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDataChange): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplay): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_as(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.as): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_data(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.data): (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hiddenCategories): js.Array[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightMatch): atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightedCategories): js.Array[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverBehavior): atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_layout(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.layout): atOracleOraclejetLib.atOracleOraclejetLibStrings.cloud | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangular = js.native
  @JSName("getProperty")
  def getProperty_selection(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selection): js.Array[K] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode): atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_styleDefaults(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.styleDefaults): atOracleOraclejetLib.Anon_AnimationDurationHoverBehaviorDelay = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltip): atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultKTooltipContext[K] = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchResponse): atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  def setProperties(properties: ojTagCloudSettablePropertiesLenient[K, D]): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDataChange,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDataChange,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplay,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplay,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightMatch,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.all
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightMatch,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.any
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.layout,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.cloud
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.layout,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangular
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.single
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchResponse,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchResponse,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.as, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.data): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_data(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.data,
    value: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_hiddenCategories(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hiddenCategories,
    value: js.Array[java.lang.String]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_highlightedCategories(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightedCategories,
    value: js.Array[java.lang.String]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selection, value: js.Array[K]): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_styleDefaults(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.styleDefaults,
    value: atOracleOraclejetLib.Anon_AnimationDurationHoverBehaviorDelay
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltip,
    value: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultKTooltipContext[K]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue
  ): scala.Unit = js.native
}

