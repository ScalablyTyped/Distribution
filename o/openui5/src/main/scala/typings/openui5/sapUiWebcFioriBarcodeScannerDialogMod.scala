package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriBarcodeScannerDialogMod {
  
  @JSImport("sap/ui/webc/fiori/BarcodeScannerDialog", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `BarcodeScannerDialog`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends BarcodeScannerDialog {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: BarcodeScannerDialogSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: BarcodeScannerDialogSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: BarcodeScannerDialogSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/BarcodeScannerDialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.BarcodeScannerDialog with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BarcodeScannerDialog]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BarcodeScannerDialog],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.fiori.BarcodeScannerDialog.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait BarcodeScannerDialog
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:scanError scanError} event of this `sap.ui.webc.fiori.BarcodeScannerDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.BarcodeScannerDialog` itself.
      *
      * Fires when the scan fails with error.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachScanError(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ BarcodeScannerDialogScanErrorEvent, Unit]
    ): this.type = js.native
    def attachScanError(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ BarcodeScannerDialogScanErrorEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.BarcodeScannerDialog`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:scanError scanError} event of this `sap.ui.webc.fiori.BarcodeScannerDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.BarcodeScannerDialog` itself.
      *
      * Fires when the scan fails with error.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachScanError(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ BarcodeScannerDialogScanErrorEvent, Unit]
    ): this.type = js.native
    def attachScanError(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ BarcodeScannerDialogScanErrorEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.BarcodeScannerDialog`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:scanSuccess scanSuccess} event of this `sap.ui.webc.fiori.BarcodeScannerDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.BarcodeScannerDialog` itself.
      *
      * Fires when the scan is completed successfuuly.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachScanSuccess(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ BarcodeScannerDialogScanSuccessEvent, Unit]
    ): this.type = js.native
    def attachScanSuccess(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ BarcodeScannerDialogScanSuccessEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.BarcodeScannerDialog`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:scanSuccess scanSuccess} event of this `sap.ui.webc.fiori.BarcodeScannerDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.BarcodeScannerDialog` itself.
      *
      * Fires when the scan is completed successfuuly.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachScanSuccess(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ BarcodeScannerDialogScanSuccessEvent, Unit]
    ): this.type = js.native
    def attachScanSuccess(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ BarcodeScannerDialogScanSuccessEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.BarcodeScannerDialog`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the dialog and the scan session.
      */
    def close(): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:scanError scanError} event of this `sap.ui.webc.fiori.BarcodeScannerDialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachScanError(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ BarcodeScannerDialogScanErrorEvent, Unit]
    ): this.type = js.native
    def detachScanError(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ BarcodeScannerDialogScanErrorEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:scanSuccess scanSuccess} event of this `sap.ui.webc.fiori.BarcodeScannerDialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachScanSuccess(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ BarcodeScannerDialogScanSuccessEvent, Unit]
    ): this.type = js.native
    def detachScanSuccess(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ BarcodeScannerDialogScanSuccessEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:scanError scanError} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireScanError(): this.type = js.native
    def fireScanError(
      /**
      * Parameters to pass along with the event
      */
    mParameters: BarcodeScannerDialog$ScanErrorEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:scanSuccess scanSuccess} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireScanSuccess(): this.type = js.native
    def fireScanSuccess(
      /**
      * Parameters to pass along with the event
      */
    mParameters: BarcodeScannerDialog$ScanSuccessEventParameters
    ): this.type = js.native
    
    /**
      * Shows a dialog with the camera videostream. Starts a scan session.
      */
    def show(): Unit = js.native
  }
  
  trait BarcodeScannerDialog$ScanErrorEventParameters extends StObject {
    
    /**
      * the error message
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object BarcodeScannerDialog$ScanErrorEventParameters {
    
    inline def apply(): BarcodeScannerDialog$ScanErrorEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarcodeScannerDialog$ScanErrorEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BarcodeScannerDialog$ScanErrorEventParameters] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait BarcodeScannerDialog$ScanSuccessEventParameters extends StObject {
    
    /**
      * the scan result as a Uint8Array
      */
    var rawBytes: js.UndefOr[js.Object] = js.undefined
    
    /**
      * the scan result as string
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object BarcodeScannerDialog$ScanSuccessEventParameters {
    
    inline def apply(): BarcodeScannerDialog$ScanSuccessEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarcodeScannerDialog$ScanSuccessEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BarcodeScannerDialog$ScanSuccessEventParameters] (val x: Self) extends AnyVal {
      
      inline def setRawBytes(value: js.Object): Self = StObject.set(x, "rawBytes", value.asInstanceOf[js.Any])
      
      inline def setRawBytesUndefined: Self = StObject.set(x, "rawBytes", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type BarcodeScannerDialogScanErrorEvent = typings.openui5.sapUiBaseEventMod.default[BarcodeScannerDialog$ScanErrorEventParameters]
  
  type BarcodeScannerDialogScanErrorEventParameters = BarcodeScannerDialog$ScanErrorEventParameters
  
  type BarcodeScannerDialogScanSuccessEvent = typings.openui5.sapUiBaseEventMod.default[BarcodeScannerDialog$ScanSuccessEventParameters]
  
  type BarcodeScannerDialogScanSuccessEventParameters = BarcodeScannerDialog$ScanSuccessEventParameters
  
  trait BarcodeScannerDialogSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fires when the scan fails with error.
      */
    var scanError: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[BarcodeScannerDialog$ScanErrorEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Fires when the scan is completed successfuuly.
      */
    var scanSuccess: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[BarcodeScannerDialog$ScanSuccessEventParameters], 
          Unit
        ]
      ] = js.undefined
  }
  object BarcodeScannerDialogSettings {
    
    inline def apply(): BarcodeScannerDialogSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarcodeScannerDialogSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BarcodeScannerDialogSettings] (val x: Self) extends AnyVal {
      
      inline def setScanError(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[BarcodeScannerDialog$ScanErrorEventParameters] => Unit
      ): Self = StObject.set(x, "scanError", js.Any.fromFunction1(value))
      
      inline def setScanErrorUndefined: Self = StObject.set(x, "scanError", js.undefined)
      
      inline def setScanSuccess(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[BarcodeScannerDialog$ScanSuccessEventParameters] => Unit
      ): Self = StObject.set(x, "scanSuccess", js.Any.fromFunction1(value))
      
      inline def setScanSuccessUndefined: Self = StObject.set(x, "scanSuccess", js.undefined)
    }
  }
}
