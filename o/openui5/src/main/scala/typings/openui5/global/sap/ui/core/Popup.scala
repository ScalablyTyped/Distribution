package typings.openui5.global.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.Popup")
@js.native
class Popup protected ()
  extends typings.openui5.sap.ui.core.Popup {
  def this(oContent: js.Any) = this()
  /**
    * Creates an instance of <code>sap.ui.core.Popup</code> that can be used to open controls as a
    * Popup,visually appearing in front of other controls.Accepts an object literal <code>mSettings</code>
    * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param oContent the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the
    * content must be present in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup
    * ensures rendering before opening.
    * @param bModal whether the popup should be opened in a modal way (i.e. with blocking background).
    * Setting this to "true" effectively blocks all attempts to focus content outside the modal popup. A
    * modal popup also automatically sets the focus back to whatever was focused when the popup opened.
    * @param bShadow whether the popup should be have a visual shadow underneath (shadow appearance
    * depends on active theme and browser support)
    * @param bAutoClose whether the popup should automatically close when the focus moves out of the popup
    */
  def this(oContent: typings.openui5.sap.ui.core.Control) = this()
  def this(oContent: typings.openui5.sap.ui.core.Element) = this()
  def this(oContent: js.Any, bModal: Boolean) = this()
  def this(oContent: typings.openui5.sap.ui.core.Control, bModal: Boolean) = this()
  def this(oContent: typings.openui5.sap.ui.core.Element, bModal: Boolean) = this()
  def this(oContent: js.Any, bModal: js.UndefOr[scala.Nothing], bShadow: Boolean) = this()
  def this(oContent: js.Any, bModal: Boolean, bShadow: Boolean) = this()
  def this(oContent: typings.openui5.sap.ui.core.Control, bModal: js.UndefOr[scala.Nothing], bShadow: Boolean) = this()
  def this(oContent: typings.openui5.sap.ui.core.Control, bModal: Boolean, bShadow: Boolean) = this()
  def this(oContent: typings.openui5.sap.ui.core.Element, bModal: js.UndefOr[scala.Nothing], bShadow: Boolean) = this()
  def this(oContent: typings.openui5.sap.ui.core.Element, bModal: Boolean, bShadow: Boolean) = this()
  def this(
    oContent: js.Any,
    bModal: js.UndefOr[scala.Nothing],
    bShadow: js.UndefOr[scala.Nothing],
    bAutoClose: Boolean
  ) = this()
  def this(oContent: js.Any, bModal: js.UndefOr[scala.Nothing], bShadow: Boolean, bAutoClose: Boolean) = this()
  def this(oContent: js.Any, bModal: Boolean, bShadow: js.UndefOr[scala.Nothing], bAutoClose: Boolean) = this()
  def this(oContent: js.Any, bModal: Boolean, bShadow: Boolean, bAutoClose: Boolean) = this()
  def this(
    oContent: typings.openui5.sap.ui.core.Control,
    bModal: js.UndefOr[scala.Nothing],
    bShadow: js.UndefOr[scala.Nothing],
    bAutoClose: Boolean
  ) = this()
  def this(
    oContent: typings.openui5.sap.ui.core.Control,
    bModal: js.UndefOr[scala.Nothing],
    bShadow: Boolean,
    bAutoClose: Boolean
  ) = this()
  def this(
    oContent: typings.openui5.sap.ui.core.Control,
    bModal: Boolean,
    bShadow: js.UndefOr[scala.Nothing],
    bAutoClose: Boolean
  ) = this()
  def this(
    oContent: typings.openui5.sap.ui.core.Control,
    bModal: Boolean,
    bShadow: Boolean,
    bAutoClose: Boolean
  ) = this()
  def this(
    oContent: typings.openui5.sap.ui.core.Element,
    bModal: js.UndefOr[scala.Nothing],
    bShadow: js.UndefOr[scala.Nothing],
    bAutoClose: Boolean
  ) = this()
  def this(
    oContent: typings.openui5.sap.ui.core.Element,
    bModal: js.UndefOr[scala.Nothing],
    bShadow: Boolean,
    bAutoClose: Boolean
  ) = this()
  def this(
    oContent: typings.openui5.sap.ui.core.Element,
    bModal: Boolean,
    bShadow: js.UndefOr[scala.Nothing],
    bAutoClose: Boolean
  ) = this()
  def this(
    oContent: typings.openui5.sap.ui.core.Element,
    bModal: Boolean,
    bShadow: Boolean,
    bAutoClose: Boolean
  ) = this()
}

@JSGlobal("sap.ui.core.Popup")
@js.native
object Popup extends js.Object {
  @js.native
  object Dock extends js.Object {
    /**
      */
    var BeginBottom: js.Any = js.native
    /**
      */
    var BeginCenter: js.Any = js.native
    /**
      */
    var BeginTop: js.Any = js.native
    /**
      */
    var CenterBottom: js.Any = js.native
    /**
      */
    var CenterCenter: js.Any = js.native
    /**
      */
    var CenterTop: js.Any = js.native
    /**
      */
    var EndBottom: js.Any = js.native
    /**
      */
    var EndCenter: js.Any = js.native
    /**
      */
    var EndTop: js.Any = js.native
    /**
      */
    var LeftBottom: js.Any = js.native
    /**
      */
    var LeftCenter: js.Any = js.native
    /**
      */
    var LeftTop: js.Any = js.native
    /**
      */
    var RightBottom: js.Any = js.native
    /**
      */
    var RightCenter: js.Any = js.native
    /**
      */
    var RightTop: js.Any = js.native
  }
  
}

