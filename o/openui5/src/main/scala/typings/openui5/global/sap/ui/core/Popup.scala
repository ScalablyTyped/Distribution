package typings.openui5.global.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.core.Popup")
@js.native
class Popup protected ()
  extends StObject
     with typings.openui5.sap.ui.core.Popup {
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
  def this(oContent: js.Any, bModal: Boolean, bShadow: Boolean) = this()
  def this(oContent: js.Any, bModal: Unit, bShadow: Boolean) = this()
  def this(oContent: typings.openui5.sap.ui.core.Control, bModal: Boolean, bShadow: Boolean) = this()
  def this(oContent: typings.openui5.sap.ui.core.Control, bModal: Unit, bShadow: Boolean) = this()
  def this(oContent: typings.openui5.sap.ui.core.Element, bModal: Boolean, bShadow: Boolean) = this()
  def this(oContent: typings.openui5.sap.ui.core.Element, bModal: Unit, bShadow: Boolean) = this()
  def this(oContent: js.Any, bModal: Boolean, bShadow: Boolean, bAutoClose: Boolean) = this()
  def this(oContent: js.Any, bModal: Boolean, bShadow: Unit, bAutoClose: Boolean) = this()
  def this(oContent: js.Any, bModal: Unit, bShadow: Boolean, bAutoClose: Boolean) = this()
  def this(oContent: js.Any, bModal: Unit, bShadow: Unit, bAutoClose: Boolean) = this()
  def this(
    oContent: typings.openui5.sap.ui.core.Control,
    bModal: Boolean,
    bShadow: Boolean,
    bAutoClose: Boolean
  ) = this()
  def this(oContent: typings.openui5.sap.ui.core.Control, bModal: Boolean, bShadow: Unit, bAutoClose: Boolean) = this()
  def this(oContent: typings.openui5.sap.ui.core.Control, bModal: Unit, bShadow: Boolean, bAutoClose: Boolean) = this()
  def this(oContent: typings.openui5.sap.ui.core.Control, bModal: Unit, bShadow: Unit, bAutoClose: Boolean) = this()
  def this(
    oContent: typings.openui5.sap.ui.core.Element,
    bModal: Boolean,
    bShadow: Boolean,
    bAutoClose: Boolean
  ) = this()
  def this(oContent: typings.openui5.sap.ui.core.Element, bModal: Boolean, bShadow: Unit, bAutoClose: Boolean) = this()
  def this(oContent: typings.openui5.sap.ui.core.Element, bModal: Unit, bShadow: Boolean, bAutoClose: Boolean) = this()
  def this(oContent: typings.openui5.sap.ui.core.Element, bModal: Unit, bShadow: Unit, bAutoClose: Boolean) = this()
}
object Popup {
  
  object Dock {
    
    @JSGlobal("sap.ui.core.Popup.Dock")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      */
    @JSGlobal("sap.ui.core.Popup.Dock.BeginBottom")
    @js.native
    def BeginBottom: js.Any = js.native
    inline def BeginBottom_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BeginBottom")(x.asInstanceOf[js.Any])
    
    /**
      */
    @JSGlobal("sap.ui.core.Popup.Dock.BeginCenter")
    @js.native
    def BeginCenter: js.Any = js.native
    inline def BeginCenter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BeginCenter")(x.asInstanceOf[js.Any])
    
    /**
      */
    @JSGlobal("sap.ui.core.Popup.Dock.BeginTop")
    @js.native
    def BeginTop: js.Any = js.native
    inline def BeginTop_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BeginTop")(x.asInstanceOf[js.Any])
    
    /**
      */
    @JSGlobal("sap.ui.core.Popup.Dock.CenterBottom")
    @js.native
    def CenterBottom: js.Any = js.native
    inline def CenterBottom_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CenterBottom")(x.asInstanceOf[js.Any])
    
    /**
      */
    @JSGlobal("sap.ui.core.Popup.Dock.CenterCenter")
    @js.native
    def CenterCenter: js.Any = js.native
    inline def CenterCenter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CenterCenter")(x.asInstanceOf[js.Any])
    
    /**
      */
    @JSGlobal("sap.ui.core.Popup.Dock.CenterTop")
    @js.native
    def CenterTop: js.Any = js.native
    inline def CenterTop_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CenterTop")(x.asInstanceOf[js.Any])
    
    /**
      */
    @JSGlobal("sap.ui.core.Popup.Dock.EndBottom")
    @js.native
    def EndBottom: js.Any = js.native
    inline def EndBottom_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EndBottom")(x.asInstanceOf[js.Any])
    
    /**
      */
    @JSGlobal("sap.ui.core.Popup.Dock.EndCenter")
    @js.native
    def EndCenter: js.Any = js.native
    inline def EndCenter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EndCenter")(x.asInstanceOf[js.Any])
    
    /**
      */
    @JSGlobal("sap.ui.core.Popup.Dock.EndTop")
    @js.native
    def EndTop: js.Any = js.native
    inline def EndTop_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EndTop")(x.asInstanceOf[js.Any])
    
    /**
      */
    @JSGlobal("sap.ui.core.Popup.Dock.LeftBottom")
    @js.native
    def LeftBottom: js.Any = js.native
    inline def LeftBottom_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LeftBottom")(x.asInstanceOf[js.Any])
    
    /**
      */
    @JSGlobal("sap.ui.core.Popup.Dock.LeftCenter")
    @js.native
    def LeftCenter: js.Any = js.native
    inline def LeftCenter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LeftCenter")(x.asInstanceOf[js.Any])
    
    /**
      */
    @JSGlobal("sap.ui.core.Popup.Dock.LeftTop")
    @js.native
    def LeftTop: js.Any = js.native
    inline def LeftTop_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LeftTop")(x.asInstanceOf[js.Any])
    
    /**
      */
    @JSGlobal("sap.ui.core.Popup.Dock.RightBottom")
    @js.native
    def RightBottom: js.Any = js.native
    inline def RightBottom_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RightBottom")(x.asInstanceOf[js.Any])
    
    /**
      */
    @JSGlobal("sap.ui.core.Popup.Dock.RightCenter")
    @js.native
    def RightCenter: js.Any = js.native
    inline def RightCenter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RightCenter")(x.asInstanceOf[js.Any])
    
    /**
      */
    @JSGlobal("sap.ui.core.Popup.Dock.RightTop")
    @js.native
    def RightTop: js.Any = js.native
    inline def RightTop_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RightTop")(x.asInstanceOf[js.Any])
  }
}
