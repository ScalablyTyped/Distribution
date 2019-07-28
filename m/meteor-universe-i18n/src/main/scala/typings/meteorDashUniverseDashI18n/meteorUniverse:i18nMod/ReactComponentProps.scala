package typings.meteorDashUniverseDashI18n.`meteorUniverse:i18nMod`

import typings.react.reactMod.Component
import typings.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactComponentProps extends js.Object {
  var _containerType: js.UndefOr[String] = js.undefined
  var _locale: js.UndefOr[String] = js.undefined
  var _namespace: js.UndefOr[String] = js.undefined
  var _props: js.UndefOr[HTMLAttributes[Component[js.Object, js.Object, _]]] = js.undefined
  var _tagType: js.UndefOr[String] = js.undefined
  var _translateProps: js.UndefOr[js.Array[String]] = js.undefined
}

object ReactComponentProps {
  @scala.inline
  def apply(
    _containerType: String = null,
    _locale: String = null,
    _namespace: String = null,
    _props: HTMLAttributes[Component[js.Object, js.Object, _]] = null,
    _tagType: String = null,
    _translateProps: js.Array[String] = null
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

