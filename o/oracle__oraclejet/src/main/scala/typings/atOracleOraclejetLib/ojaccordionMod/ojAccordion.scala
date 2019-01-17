package typings
package atOracleOraclejetLib.ojaccordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojAccordion
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponent[ojAccordionSettableProperties] {
  var expanded: js.Array[atOracleOraclejetLib.Anon_Id] | scala.Null = js.native
  var multiple: scala.Boolean = js.native
  var onExpandedChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['expanded'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onMultipleChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['multiple'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onOjBeforeCollapse: (js.Function1[/* event */ atOracleOraclejetLib.ojaccordionMod.ojAccordionNs.ojBeforeCollapse, _]) | scala.Null = js.native
  var onOjBeforeExpand: (js.Function1[/* event */ atOracleOraclejetLib.ojaccordionMod.ojAccordionNs.ojBeforeExpand, _]) | scala.Null = js.native
  var onOjCollapse: (js.Function1[/* event */ atOracleOraclejetLib.ojaccordionMod.ojAccordionNs.ojCollapse, _]) | scala.Null = js.native
  var onOjExpand: (js.Function1[/* event */ atOracleOraclejetLib.ojaccordionMod.ojAccordionNs.ojExpand, _]) | scala.Null = js.native
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
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.multipleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['multiple'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.multipleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['multiple'] */ js.Any
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
      /* ev */ atOracleOraclejetLib.ojaccordionMod.ojAccordionNs.ojBeforeCollapse, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojaccordionMod.ojAccordionNs.ojBeforeCollapse, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojaccordionMod.ojAccordionNs.ojBeforeExpand, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojaccordionMod.ojAccordionNs.ojBeforeExpand, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojaccordionMod.ojAccordionNs.ojCollapse, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojaccordionMod.ojAccordionNs.ojCollapse, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojaccordionMod.ojAccordionNs.ojExpand, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojaccordionMod.ojAccordionNs.ojExpand, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.expanded): js.Array[atOracleOraclejetLib.Anon_Id] | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_multiple(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple): scala.Boolean = js.native
  def setProperties(properties: ojAccordionSettablePropertiesLenient): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.expanded): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.expanded,
    value: js.Array[atOracleOraclejetLib.Anon_Id | scala.Double | java.lang.String]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_multiple(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple, value: scala.Boolean): scala.Unit = js.native
}

