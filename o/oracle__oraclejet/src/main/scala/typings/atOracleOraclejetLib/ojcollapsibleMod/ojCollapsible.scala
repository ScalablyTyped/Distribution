package typings
package atOracleOraclejetLib.ojcollapsibleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojCollapsible
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponent[ojCollapsibleSettableProperties] {
  var disabled: scala.Boolean = js.native
  var expandArea: atOracleOraclejetLib.atOracleOraclejetLibStrings.header | atOracleOraclejetLib.atOracleOraclejetLibStrings.disclosureIcon = js.native
  var expanded: scala.Boolean = js.native
  var onDisabledChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['disabled'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onExpandAreaChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['expandArea'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onExpandedChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['expanded'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onOjBeforeCollapse: (js.Function1[
    /* event */ atOracleOraclejetLib.ojcollapsibleMod.ojCollapsibleNs.ojBeforeCollapse, 
    _
  ]) | scala.Null = js.native
  var onOjBeforeExpand: (js.Function1[
    /* event */ atOracleOraclejetLib.ojcollapsibleMod.ojCollapsibleNs.ojBeforeExpand, 
    _
  ]) | scala.Null = js.native
  var onOjCollapse: (js.Function1[/* event */ atOracleOraclejetLib.ojcollapsibleMod.ojCollapsibleNs.ojCollapse, _]) | scala.Null = js.native
  var onOjExpand: (js.Function1[/* event */ atOracleOraclejetLib.ojcollapsibleMod.ojCollapsibleNs.ojExpand, _]) | scala.Null = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabledChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['disabled'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabledChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['disabled'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.expandAreaChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['expandArea'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.expandAreaChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['expandArea'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.expandedChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['expanded'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.expandedChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['expanded'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojcollapsibleMod.ojCollapsibleNs.ojBeforeCollapse, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojcollapsibleMod.ojCollapsibleNs.ojBeforeCollapse, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojcollapsibleMod.ojCollapsibleNs.ojBeforeExpand, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojcollapsibleMod.ojCollapsibleNs.ojBeforeExpand, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojcollapsibleMod.ojCollapsibleNs.ojCollapse, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojcollapsibleMod.ojCollapsibleNs.ojCollapse, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojcollapsibleMod.ojCollapsibleNs.ojExpand, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojcollapsibleMod.ojCollapsibleNs.ojExpand, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_disabled(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled): scala.Boolean = js.native
  @JSName("getProperty")
  def getProperty_expandArea(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.expandArea): atOracleOraclejetLib.atOracleOraclejetLibStrings.header | atOracleOraclejetLib.atOracleOraclejetLibStrings.disclosureIcon = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.expanded): scala.Boolean = js.native
  def setProperties(properties: ojCollapsibleSettablePropertiesLenient): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.expandArea,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.disclosureIcon
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.expandArea,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.header
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_disabled(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.expanded, value: scala.Boolean): scala.Unit = js.native
}

