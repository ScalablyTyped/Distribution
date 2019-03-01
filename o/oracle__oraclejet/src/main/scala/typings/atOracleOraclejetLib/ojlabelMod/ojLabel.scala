package typings
package atOracleOraclejetLib.ojlabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojLabel
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponent[ojLabelSettableProperties] {
  var `for`: java.lang.String | scala.Null = js.native
  var help: atOracleOraclejetLib.Anon_DefinitionSource = js.native
  var labelId: java.lang.String | scala.Null = js.native
  var onForChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onHelpChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DefinitionSource], 
    _
  ]) | scala.Null = js.native
  var onLabelIdChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onShowRequiredChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean | scala.Null], 
    _
  ]) | scala.Null = js.native
  var showRequired: scala.Boolean | scala.Null = js.native
  @JSName("translations")
  var translations_ojLabel: atOracleOraclejetLib.Anon_TooltipHelp = js.native
  @JSName("addEventListener")
  def addEventListener_forChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.forChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_forChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.forChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.helpChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DefinitionSource], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.helpChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DefinitionSource], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelIdChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelIdChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelIdChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelIdChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_showRequiredChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.showRequiredChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_showRequiredChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.showRequiredChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_for(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.`for`): java.lang.String | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_help(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.help): atOracleOraclejetLib.Anon_DefinitionSource = js.native
  @JSName("getProperty")
  def getProperty_labelId(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelId): java.lang.String | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_showRequired(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.showRequired): scala.Boolean | scala.Null = js.native
  def setProperties(properties: ojLabelSettablePropertiesLenient): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_for(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.`for`): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_for(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.`for`, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_help(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.help,
    value: atOracleOraclejetLib.Anon_DefinitionSource
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_labelId(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelId): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_labelId(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelId, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_showRequired(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.showRequired): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_showRequired(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.showRequired, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_TooltipHelp
  ): scala.Unit = js.native
}

