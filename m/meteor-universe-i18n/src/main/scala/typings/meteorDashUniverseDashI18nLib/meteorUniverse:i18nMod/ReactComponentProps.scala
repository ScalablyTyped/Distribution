package typings
package meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactComponentProps extends js.Object {
  var _containerType: js.UndefOr[java.lang.String] = js.undefined
  var _locale: js.UndefOr[java.lang.String] = js.undefined
  var _namespace: js.UndefOr[java.lang.String] = js.undefined
  var _props: js.UndefOr[
    reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.reactMod.Component[js.Object, js.Object, _]]
  ] = js.undefined
  var _tagType: js.UndefOr[java.lang.String] = js.undefined
  var _translateProps: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ReactComponentProps {
  @scala.inline
  def apply(
    _containerType: java.lang.String = null,
    _locale: java.lang.String = null,
    _namespace: java.lang.String = null,
    _props: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.reactMod.Component[js.Object, js.Object, _]] = null,
    _tagType: java.lang.String = null,
    _translateProps: js.Array[java.lang.String] = null
  ): ReactComponentProps = {
    val __obj = js.Dynamic.literal()
    if (_containerType != null) __obj.updateDynamic("_containerType")(_containerType)
    if (_locale != null) __obj.updateDynamic("_locale")(_locale)
    if (_namespace != null) __obj.updateDynamic("_namespace")(_namespace)
    if (_props != null) __obj.updateDynamic("_props")(_props)
    if (_tagType != null) __obj.updateDynamic("_tagType")(_tagType)
    if (_translateProps != null) __obj.updateDynamic("_translateProps")(_translateProps)
    __obj.asInstanceOf[ReactComponentProps]
  }
}

