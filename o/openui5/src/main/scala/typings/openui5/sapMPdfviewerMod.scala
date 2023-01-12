package typings.openui5

import typings.openui5.anon.Target
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.PDFViewerDisplayType
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMPdfviewerMod {
  
  @JSImport("sap/m/PDFViewer", JSImport.Default)
  @js.native
  /**
    * Definition of PDFViewer control
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:cd80a8bca4ac450b86547d78f0653330 PDF Viewer}
    */
  open class default () extends PDFViewer {
    def this(/**
      * initial settings for the new control
      */
    mSettings: PDFViewerSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: PDFViewerSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: PDFViewerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/PDFViewer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.PDFViewer with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, PDFViewer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, PDFViewer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.PDFViewer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait PDFViewer
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some popupButton to the aggregation {@link #getPopupButtons popupButtons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addPopupButton(
      /**
      * The popupButton to add; if empty, nothing is inserted
      */
    oPopupButton: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:error error} event of this `sap.m.PDFViewer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PDFViewer` itself.
      *
      * This event is fired when there is an error loading the PDF file.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachError(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachError(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.PDFViewer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:error error} event of this `sap.m.PDFViewer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PDFViewer` itself.
      *
      * This event is fired when there is an error loading the PDF file.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachError(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachError(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.PDFViewer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:loaded loaded} event of this `sap.m.PDFViewer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PDFViewer` itself.
      *
      * This event is fired when a PDF file is loaded. If the PDF is loaded in smaller chunks, this event is
      * fired as often as defined by the browser's plugin. This may happen after a couple chunks are processed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLoaded(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLoaded(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.PDFViewer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:loaded loaded} event of this `sap.m.PDFViewer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PDFViewer` itself.
      *
      * This event is fired when a PDF file is loaded. If the PDF is loaded in smaller chunks, this event is
      * fired as often as defined by the browser's plugin. This may happen after a couple chunks are processed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLoaded(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLoaded(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.PDFViewer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:sourceValidationFailed sourceValidationFailed}
      * event of this `sap.m.PDFViewer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PDFViewer` itself.
      *
      * This event is fired when the PDF viewer control cannot check the loaded content. For example, the default
      * configuration of the Mozilla Firefox browser may not allow checking the loaded content. This may also
      * happen when the source PDF file is stored in a different domain. If you want no error message to be displayed
      * when this event is fired, call the preventDefault() method inside the event handler.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSourceValidationFailed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSourceValidationFailed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.PDFViewer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:sourceValidationFailed sourceValidationFailed}
      * event of this `sap.m.PDFViewer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PDFViewer` itself.
      *
      * This event is fired when the PDF viewer control cannot check the loaded content. For example, the default
      * configuration of the Mozilla Firefox browser may not allow checking the loaded content. This may also
      * happen when the source PDF file is stored in a different domain. If you want no error message to be displayed
      * when this event is fired, call the preventDefault() method inside the event handler.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSourceValidationFailed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSourceValidationFailed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.PDFViewer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the errorPlaceholder in the aggregation {@link #getErrorPlaceholder errorPlaceholder}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyErrorPlaceholder(): this.type = js.native
    
    /**
      * Destroys all the popupButtons in the aggregation {@link #getPopupButtons popupButtons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPopupButtons(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:error error} event of this `sap.m.PDFViewer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachError(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachError(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:loaded loaded} event of this `sap.m.PDFViewer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLoaded(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachLoaded(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:sourceValidationFailed sourceValidationFailed}
      * event of this `sap.m.PDFViewer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSourceValidationFailed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSourceValidationFailed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Downloads the PDF file.
      */
    def downloadPDF(): Unit = js.native
    
    /**
      * Fires event {@link #event:error error} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireError(): this.type = js.native
    def fireError(/**
      * Parameters to pass along with the event
      */
    mParameters: Target): this.type = js.native
    
    /**
      * Fires event {@link #event:loaded loaded} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLoaded(): this.type = js.native
    def fireLoaded(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:sourceValidationFailed sourceValidationFailed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSourceValidationFailed(): this.type = js.native
    def fireSourceValidationFailed(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getDisplayType displayType}.
      *
      * Defines how the PDF viewer should be displayed.
      * 	 - If set to `Link`, the PDF viewer appears as a toolbar with a download button that can be used to
      * 			download the PDF file.
      *  When the {@link #open} method is called, the user can either open the PDF file in a new tab or download
      * it.
      * 	 - If set to `Embedded`, the PDF viewer appears embedded in the parent container and displays either
      * 			the PDF document or the message defined by the `errorPlaceholderMessage` property.
      * 	 - If set to `Auto`, the appearance of the PDF viewer depends on the device being used:
      * 	On mobile devices (phones, tablets), the PDF viewer appears as a toolbar with a download button.
      * 	 - On desktop devices, the PDF viewer is embedded in its parent container.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `displayType`
      */
    def getDisplayType(): PDFViewerDisplayType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PDFViewerDisplayType * / any */ String) = js.native
    
    /**
      * @deprecated (since 1.50.0) - replaced by {@link sap.m.PDFViewer#getErrorPlaceholderMessage}.
      *
      * Gets current value of property {@link #getErrorMessage errorMessage}.
      *
      * A custom error message that is displayed when the PDF file cannot be loaded.
      *
      * @returns Value of property `errorMessage`
      */
    def getErrorMessage(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getErrorPlaceholder errorPlaceholder}.
      *
      * A custom control that can be used instead of the error message specified by the errorPlaceholderMessage
      * property.
      */
    def getErrorPlaceholder(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getErrorPlaceholderMessage errorPlaceholderMessage}.
      *
      * A custom text that is displayed instead of the PDF file content when the PDF file cannot be loaded.
      *
      * @returns Value of property `errorPlaceholderMessage`
      */
    def getErrorPlaceholderMessage(): String = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Defines the height of the PDF viewer control, respective to the height of the parent container. Can be
      * set to a percent, pixel, or em value.
      *
      * Default value is `"100%"`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets content of aggregation {@link #getPopupButtons popupButtons}.
      *
      * A multiple aggregation for buttons that can be added to the footer of the popup dialog. Works only if
      * the PDF viewer is set to open in a popup dialog.
      */
    def getPopupButtons(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * @deprecated (since 1.50.0) - replaced by {@link sap.m.PDFViewer#getTitle}.
      *
      * Gets current value of property {@link #getPopupHeaderTitle popupHeaderTitle}.
      *
      * A custom title for the PDF viewer popup dialog. Works only if the PDF viewer is set to open in a popup
      * dialog.
      *
      * @returns Value of property `popupHeaderTitle`
      */
    def getPopupHeaderTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getShowDownloadButton showDownloadButton}.
      *
      * Shows or hides the download button.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showDownloadButton`
      */
    def getShowDownloadButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSource source}.
      *
      * Specifies the path to the PDF file to display. Can be set to a relative or an absolute path.
      *  Optionally, this property can also be set to a data URI path or a blob URL in all major web browsers
      * except Internet Explorer and Microsoft Edge, provided that this data URI or blob URL is allowed in advance.
      * For more information about URL filtering, see {@link topic:91f3768f6f4d1014b6dd926db0e91070 URLList Validator
      * Filtering}.
      *
      * @returns Value of property `source`
      */
    def getSource(): URI = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * A custom title for the PDF viewer.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the PDF viewer control, respective to the width of the parent container. Can be
      * set to a percent, pixel, or em value.
      *
      * Default value is `"100%"`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.m.Button` in the aggregation {@link #getPopupButtons popupButtons}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfPopupButton(
      /**
      * The popupButton whose index is looked for
      */
    oPopupButton: typings.openui5.sapMButtonMod.default
    ): int = js.native
    
    /**
      * Inserts a popupButton into the aggregation {@link #getPopupButtons popupButtons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertPopupButton(
      /**
      * The popupButton to insert; if empty, nothing is inserted
      */
    oPopupButton: typings.openui5.sapMButtonMod.default,
      /**
      * The `0`-based index the popupButton should be inserted at; for a negative value of `iIndex`, the popupButton
      * is inserted at position 0; for a value greater than the current size of the aggregation, the popupButton
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Opens the PDF viewer in a popup dialog.
      */
    def open(): Unit = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getPopupButtons popupButtons}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllPopupButtons(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    def removePopupButton(/**
      * The popupButton to remove or its index or id
      */
    vPopupButton: String): typings.openui5.sapMButtonMod.default | Null = js.native
    /**
      * Removes a popupButton from the aggregation {@link #getPopupButtons popupButtons}.
      *
      * @returns The removed popupButton or `null`
      */
    def removePopupButton(/**
      * The popupButton to remove or its index or id
      */
    vPopupButton: int): typings.openui5.sapMButtonMod.default | Null = js.native
    def removePopupButton(
      /**
      * The popupButton to remove or its index or id
      */
    vPopupButton: typings.openui5.sapMButtonMod.default
    ): typings.openui5.sapMButtonMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getDisplayType displayType}.
      *
      * Defines how the PDF viewer should be displayed.
      * 	 - If set to `Link`, the PDF viewer appears as a toolbar with a download button that can be used to
      * 			download the PDF file.
      *  When the {@link #open} method is called, the user can either open the PDF file in a new tab or download
      * it.
      * 	 - If set to `Embedded`, the PDF viewer appears embedded in the parent container and displays either
      * 			the PDF document or the message defined by the `errorPlaceholderMessage` property.
      * 	 - If set to `Auto`, the appearance of the PDF viewer depends on the device being used:
      * 	On mobile devices (phones, tablets), the PDF viewer appears as a toolbar with a download button.
      * 	 - On desktop devices, the PDF viewer is embedded in its parent container.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayType(): this.type = js.native
    def setDisplayType(
      /**
      * New value for property `displayType`
      */
    sDisplayType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PDFViewerDisplayType * / any */ String
    ): this.type = js.native
    def setDisplayType(/**
      * New value for property `displayType`
      */
    sDisplayType: PDFViewerDisplayType): this.type = js.native
    
    /**
      * @deprecated (since 1.50.0) - replaced by {@link sap.m.PDFViewer#getErrorPlaceholderMessage}.
      *
      * Sets a new value for property {@link #getErrorMessage errorMessage}.
      *
      * A custom error message that is displayed when the PDF file cannot be loaded.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setErrorMessage(): this.type = js.native
    def setErrorMessage(/**
      * New value for property `errorMessage`
      */
    sErrorMessage: String): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getErrorPlaceholder errorPlaceholder}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setErrorPlaceholder(
      /**
      * The errorPlaceholder to set
      */
    oErrorPlaceholder: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getErrorPlaceholderMessage errorPlaceholderMessage}.
      *
      * A custom text that is displayed instead of the PDF file content when the PDF file cannot be loaded.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setErrorPlaceholderMessage(): this.type = js.native
    def setErrorPlaceholderMessage(/**
      * New value for property `errorPlaceholderMessage`
      */
    sErrorPlaceholderMessage: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Defines the height of the PDF viewer control, respective to the height of the parent container. Can be
      * set to a percent, pixel, or em value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"100%"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * @deprecated (since 1.50.0) - replaced by {@link sap.m.PDFViewer#getTitle}.
      *
      * Sets a new value for property {@link #getPopupHeaderTitle popupHeaderTitle}.
      *
      * A custom title for the PDF viewer popup dialog. Works only if the PDF viewer is set to open in a popup
      * dialog.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPopupHeaderTitle(): this.type = js.native
    def setPopupHeaderTitle(/**
      * New value for property `popupHeaderTitle`
      */
    sPopupHeaderTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowDownloadButton showDownloadButton}.
      *
      * Shows or hides the download button.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowDownloadButton(): this.type = js.native
    def setShowDownloadButton(/**
      * New value for property `showDownloadButton`
      */
    bShowDownloadButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSource source}.
      *
      * Specifies the path to the PDF file to display. Can be set to a relative or an absolute path.
      *  Optionally, this property can also be set to a data URI path or a blob URL in all major web browsers
      * except Internet Explorer and Microsoft Edge, provided that this data URI or blob URL is allowed in advance.
      * For more information about URL filtering, see {@link topic:91f3768f6f4d1014b6dd926db0e91070 URLList Validator
      * Filtering}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSource(): this.type = js.native
    def setSource(/**
      * New value for property `source`
      */
    sSource: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * A custom title for the PDF viewer.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the PDF viewer control, respective to the width of the parent container. Can be
      * set to a percent, pixel, or em value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"100%"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait PDFViewerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines how the PDF viewer should be displayed.
      * 	 - If set to `Link`, the PDF viewer appears as a toolbar with a download button that can be used to
      * 			download the PDF file.
      *  When the {@link #open} method is called, the user can either open the PDF file in a new tab or download
      * it.
      * 	 - If set to `Embedded`, the PDF viewer appears embedded in the parent container and displays either
      * 			the PDF document or the message defined by the `errorPlaceholderMessage` property.
      * 	 - If set to `Auto`, the appearance of the PDF viewer depends on the device being used:
      * 	On mobile devices (phones, tablets), the PDF viewer appears as a toolbar with a download button.
      * 	 - On desktop devices, the PDF viewer is embedded in its parent container.
      */
    var displayType: js.UndefOr[
        PDFViewerDisplayType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PDFViewerDisplayType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * This event is fired when there is an error loading the PDF file.
      */
    var error: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @deprecated (since 1.50.0) - replaced by {@link sap.m.PDFViewer#getErrorPlaceholderMessage}.
      *
      * A custom error message that is displayed when the PDF file cannot be loaded.
      */
    var errorMessage: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * A custom control that can be used instead of the error message specified by the errorPlaceholderMessage
      * property.
      */
    var errorPlaceholder: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * A custom text that is displayed instead of the PDF file content when the PDF file cannot be loaded.
      */
    var errorPlaceholderMessage: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the height of the PDF viewer control, respective to the height of the parent container. Can be
      * set to a percent, pixel, or em value.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event is fired when a PDF file is loaded. If the PDF is loaded in smaller chunks, this event is
      * fired as often as defined by the browser's plugin. This may happen after a couple chunks are processed.
      */
    var loaded: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * A multiple aggregation for buttons that can be added to the footer of the popup dialog. Works only if
      * the PDF viewer is set to open in a popup dialog.
      */
    var popupButtons: js.UndefOr[
        js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.50.0) - replaced by {@link sap.m.PDFViewer#getTitle}.
      *
      * A custom title for the PDF viewer popup dialog. Works only if the PDF viewer is set to open in a popup
      * dialog.
      */
    var popupHeaderTitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Shows or hides the download button.
      */
    var showDownloadButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the path to the PDF file to display. Can be set to a relative or an absolute path.
      *  Optionally, this property can also be set to a data URI path or a blob URL in all major web browsers
      * except Internet Explorer and Microsoft Edge, provided that this data URI or blob URL is allowed in advance.
      * For more information about URL filtering, see {@link topic:91f3768f6f4d1014b6dd926db0e91070 URLList Validator
      * Filtering}.
      */
    var source: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * This event is fired when the PDF viewer control cannot check the loaded content. For example, the default
      * configuration of the Mozilla Firefox browser may not allow checking the loaded content. This may also
      * happen when the source PDF file is stored in a different domain. If you want no error message to be displayed
      * when this event is fired, call the preventDefault() method inside the event handler.
      */
    var sourceValidationFailed: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * A custom title for the PDF viewer.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the width of the PDF viewer control, respective to the width of the parent container. Can be
      * set to a percent, pixel, or em value.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object PDFViewerSettings {
    
    inline def apply(): PDFViewerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PDFViewerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PDFViewerSettings] (val x: Self) extends AnyVal {
      
      inline def setDisplayType(
        value: PDFViewerDisplayType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PDFViewerDisplayType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
      
      inline def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
      
      inline def setError(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorMessage(value: String | PropertyBindingInfo): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setErrorPlaceholder(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "errorPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setErrorPlaceholderMessage(value: String | PropertyBindingInfo): Self = StObject.set(x, "errorPlaceholderMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorPlaceholderMessageUndefined: Self = StObject.set(x, "errorPlaceholderMessage", js.undefined)
      
      inline def setErrorPlaceholderUndefined: Self = StObject.set(x, "errorPlaceholder", js.undefined)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLoaded(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "loaded", js.Any.fromFunction1(value))
      
      inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      inline def setPopupButtons(
        value: js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "popupButtons", value.asInstanceOf[js.Any])
      
      inline def setPopupButtonsUndefined: Self = StObject.set(x, "popupButtons", js.undefined)
      
      inline def setPopupButtonsVarargs(value: typings.openui5.sapMButtonMod.default*): Self = StObject.set(x, "popupButtons", js.Array(value*))
      
      inline def setPopupHeaderTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "popupHeaderTitle", value.asInstanceOf[js.Any])
      
      inline def setPopupHeaderTitleUndefined: Self = StObject.set(x, "popupHeaderTitle", js.undefined)
      
      inline def setShowDownloadButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showDownloadButton", value.asInstanceOf[js.Any])
      
      inline def setShowDownloadButtonUndefined: Self = StObject.set(x, "showDownloadButton", js.undefined)
      
      inline def setSource(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSourceValidationFailed(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "sourceValidationFailed", js.Any.fromFunction1(value))
      
      inline def setSourceValidationFailedUndefined: Self = StObject.set(x, "sourceValidationFailed", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
