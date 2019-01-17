package typings
package atOracleOraclejetLib.ojtoolbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojToolbar
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponent[ojToolbarSettableProperties] {
  var chroming: atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.half | atOracleOraclejetLib.atOracleOraclejetLibStrings.outlined = js.native
  var onChromingChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['chroming'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.chromingChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['chroming'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.chromingChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['chroming'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_chroming(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.chroming): atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.half | atOracleOraclejetLib.atOracleOraclejetLibStrings.outlined = js.native
  def setProperties(properties: ojToolbarSettablePropertiesLenient): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.chroming,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.full
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.chroming,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.half
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.chroming,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.outlined
  ): scala.Unit = js.native
}

