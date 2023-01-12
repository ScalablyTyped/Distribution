package typings.openui5

import typings.openui5.anon.ReadyState
import typings.openui5.anon.`24`
import typings.openui5.anon.`25`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.ListMode
import typings.openui5.sapMUploadUploaderHttpRequestMethodMod.UploaderHttpRequestMethod
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMUploadUploadSetMod {
  
  @JSImport("sap/m/upload/UploadSet", JSImport.Default)
  @js.native
  /**
    * Constructor for a new UploadSet.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends UploadSet {
    def this(/**
      * Initial settings for the new control.
      */
    mSettings: UploadSetSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given.
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given.
      */
    sId: String,
      /**
      * Initial settings for the new control.
      */
    mSettings: UploadSetSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given.
      */
    sId: Unit,
      /**
      * Initial settings for the new control.
      */
    mSettings: UploadSetSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/upload/UploadSet", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.upload.UploadSet with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, UploadSet]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, UploadSet],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.upload.UploadSet.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait UploadSet
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some headerField to the aggregation {@link #getHeaderFields headerFields}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addHeaderField(
      /**
      * The headerField to add; if empty, nothing is inserted
      */
    oHeaderField: typings.openui5.sapUiCoreItemMod.default
    ): this.type = js.native
    
    /**
      * Adds some incompleteItem to the aggregation {@link #getIncompleteItems incompleteItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addIncompleteItem(
      /**
      * The incompleteItem to add; if empty, nothing is inserted
      */
    oIncompleteItem: typings.openui5.sapMUploadUploadSetItemMod.default
    ): this.type = js.native
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMUploadUploadSetItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterItemAdded afterItemAdded} event of this
      * `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired when a new file is added to the set of items to be uploaded.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterItemAdded(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterItemAdded(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterItemAdded afterItemAdded} event of this
      * `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired when a new file is added to the set of items to be uploaded.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterItemAdded(
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
    def attachAfterItemAdded(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.83
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterItemEdited afterItemEdited} event of this
      * `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired after item edit is confirmed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterItemEdited(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterItemEdited(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.83
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterItemEdited afterItemEdited} event of this
      * `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired after item edit is confirmed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterItemEdited(
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
    def attachAfterItemEdited(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.83
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterItemRemoved afterItemRemoved} event of
      * this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired after the item is removed on click of ok button in confirmation dialog.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterItemRemoved(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterItemRemoved(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.83
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterItemRemoved afterItemRemoved} event of
      * this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired after the item is removed on click of ok button in confirmation dialog.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterItemRemoved(
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
    def attachAfterItemRemoved(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeItemAdded beforeItemAdded} event of this
      * `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired just before a new file is added to the set of items to be uploaded.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeItemAdded(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeItemAdded(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeItemAdded beforeItemAdded} event of this
      * `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired just before a new file is added to the set of items to be uploaded.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeItemAdded(
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
    def attachBeforeItemAdded(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeItemEdited beforeItemEdited} event of
      * this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired when the edit button is clicked for an item and no other item is being edited at
      * the same time.
      * If there is another item that has unsaved changes, the editing of the clicked item cannot be started.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeItemEdited(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeItemEdited(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeItemEdited beforeItemEdited} event of
      * this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired when the edit button is clicked for an item and no other item is being edited at
      * the same time.
      * If there is another item that has unsaved changes, the editing of the clicked item cannot be started.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeItemEdited(
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
    def attachBeforeItemEdited(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeItemRemoved beforeItemRemoved} event of
      * this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired just before the confirmation dialog for 'Remove' action is displayed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeItemRemoved(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeItemRemoved(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeItemRemoved beforeItemRemoved} event of
      * this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired just before the confirmation dialog for 'Remove' action is displayed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeItemRemoved(
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
    def attachBeforeItemRemoved(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeUploadStarts beforeUploadStarts} event
      * of this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired right before the upload process begins.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeUploadStarts(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeUploadStarts(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeUploadStarts beforeUploadStarts} event
      * of this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired right before the upload process begins.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeUploadStarts(
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
    def attachBeforeUploadStarts(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeUploadTermination beforeUploadTermination}
      * event of this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired right before the upload is terminated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeUploadTermination(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeUploadTermination(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeUploadTermination beforeUploadTermination}
      * event of this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired right before the upload is terminated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeUploadTermination(
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
    def attachBeforeUploadTermination(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileNameLengthExceeded fileNameLengthExceeded}
      * event of this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired in either of the following cases:
      * 	 - When a file that is selected to be uploaded fails to meet the file name length restriction specified
      * 			in the `maxFileNameLength` property.
      * 	 - When the file name length restriction changes, and the file to be uploaded fails to meet the new
      * 			restriction.
      * 	 - Listeners can use the item parameter to remove the incomplete item that failed to meet the restriction
      *
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileNameLengthExceeded(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachFileNameLengthExceeded(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileNameLengthExceeded fileNameLengthExceeded}
      * event of this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired in either of the following cases:
      * 	 - When a file that is selected to be uploaded fails to meet the file name length restriction specified
      * 			in the `maxFileNameLength` property.
      * 	 - When the file name length restriction changes, and the file to be uploaded fails to meet the new
      * 			restriction.
      * 	 - Listeners can use the item parameter to remove the incomplete item that failed to meet the restriction
      *
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileNameLengthExceeded(
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
    def attachFileNameLengthExceeded(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.100.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:fileRenamed fileRenamed} event of this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * The event is triggered when the file name is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileRenamed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachFileRenamed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.100.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:fileRenamed fileRenamed} event of this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * The event is triggered when the file name is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileRenamed(
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
    def attachFileRenamed(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileSizeExceeded fileSizeExceeded} event of
      * this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired in either of the following cases:
      * 	 - When a file that is selected to be uploaded fails to meet the file size restriction specified in
      * 			the `maxFileSize` property.
      * 	 - When the file size restriction changes, and the file to be uploaded fails to meet the new restriction.
      *
      * 	 - Listeners can use the item parameter to remove the incomplete item that failed to meet the restriction
      *
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileSizeExceeded(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachFileSizeExceeded(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileSizeExceeded fileSizeExceeded} event of
      * this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired in either of the following cases:
      * 	 - When a file that is selected to be uploaded fails to meet the file size restriction specified in
      * 			the `maxFileSize` property.
      * 	 - When the file size restriction changes, and the file to be uploaded fails to meet the new restriction.
      *
      * 	 - Listeners can use the item parameter to remove the incomplete item that failed to meet the restriction
      *
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileSizeExceeded(
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
    def attachFileSizeExceeded(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileTypeMismatch fileTypeMismatch} event of
      * this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired in either of the following cases:
      * 	 - When a file that is selected to be uploaded fails to meet the file type restriction (`fileType` property).
      *
      * 	 - When the file type restriction changes, and the file to be uploaded fails to meet the new restriction.
      *
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileTypeMismatch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachFileTypeMismatch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:fileTypeMismatch fileTypeMismatch} event of
      * this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired in either of the following cases:
      * 	 - When a file that is selected to be uploaded fails to meet the file type restriction (`fileType` property).
      *
      * 	 - When the file type restriction changes, and the file to be uploaded fails to meet the new restriction.
      *
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFileTypeMismatch(
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
    def attachFileTypeMismatch(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.99
      *
      * Attaches event handler `fnFunction` to the {@link #event:itemDragStart itemDragStart} event of this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired when the user starts dragging an uploaded item.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemDragStart(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemDragStart(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.99
      *
      * Attaches event handler `fnFunction` to the {@link #event:itemDragStart itemDragStart} event of this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired when the user starts dragging an uploaded item.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemDragStart(
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
    def attachItemDragStart(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.99
      *
      * Attaches event handler `fnFunction` to the {@link #event:itemDrop itemDrop} event of this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired when an uploaded item is dropped on the new list position.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemDrop(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemDrop(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.99
      *
      * Attaches event handler `fnFunction` to the {@link #event:itemDrop itemDrop} event of this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired when an uploaded item is dropped on the new list position.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemDrop(
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
    def attachItemDrop(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:mediaTypeMismatch mediaTypeMismatch} event of
      * this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired in either of the following cases:
      * 	 - When a file that is selected to be uploaded fails to meet the media type restriction specified in
      * 			the `mediaTypes` property.
      * 	 - When the media type restriction changes, and the file to be uploaded fails to meet the new restriction.
      *
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMediaTypeMismatch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachMediaTypeMismatch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:mediaTypeMismatch mediaTypeMismatch} event of
      * this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired in either of the following cases:
      * 	 - When a file that is selected to be uploaded fails to meet the media type restriction specified in
      * 			the `mediaTypes` property.
      * 	 - When the media type restriction changes, and the file to be uploaded fails to meet the new restriction.
      *
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMediaTypeMismatch(
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
    def attachMediaTypeMismatch(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChanged selectionChanged} event of
      * this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired simultaneously with the respective event in the inner {@link sap.m.List} control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelectionChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChanged selectionChanged} event of
      * this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired simultaneously with the respective event in the inner {@link sap.m.List} control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChanged(
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
    def attachSelectionChanged(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:uploadCompleted uploadCompleted} event of this
      * `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired right after the upload process is finished.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadCompleted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUploadCompleted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:uploadCompleted uploadCompleted} event of this
      * `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired right after the upload process is finished.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadCompleted(
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
    def attachUploadCompleted(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:uploadTerminated uploadTerminated} event of
      * this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired right after the upload is terminated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadTerminated(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUploadTerminated(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:uploadTerminated uploadTerminated} event of
      * this `sap.m.upload.UploadSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
      *
      * This event is fired right after the upload is terminated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUploadTerminated(
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
    def attachUploadTerminated(
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
      * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the headerFields in the aggregation {@link #getHeaderFields headerFields}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeaderFields(): this.type = js.native
    
    /**
      * Destroys all the incompleteItems in the aggregation {@link #getIncompleteItems incompleteItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyIncompleteItems(): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Destroys the toolbar in the aggregation {@link #getToolbar toolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyToolbar(): this.type = js.native
    
    /**
      * Destroys the uploader in the aggregation {@link #getUploader uploader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyUploader(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:afterItemAdded afterItemAdded} event of this
      * `sap.m.upload.UploadSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterItemAdded(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterItemAdded(
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
      * @SINCE 1.83
      *
      * Detaches event handler `fnFunction` from the {@link #event:afterItemEdited afterItemEdited} event of
      * this `sap.m.upload.UploadSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterItemEdited(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterItemEdited(
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
      * @SINCE 1.83
      *
      * Detaches event handler `fnFunction` from the {@link #event:afterItemRemoved afterItemRemoved} event of
      * this `sap.m.upload.UploadSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterItemRemoved(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterItemRemoved(
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
      * Detaches event handler `fnFunction` from the {@link #event:beforeItemAdded beforeItemAdded} event of
      * this `sap.m.upload.UploadSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeItemAdded(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeItemAdded(
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
      * Detaches event handler `fnFunction` from the {@link #event:beforeItemEdited beforeItemEdited} event of
      * this `sap.m.upload.UploadSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeItemEdited(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeItemEdited(
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
      * Detaches event handler `fnFunction` from the {@link #event:beforeItemRemoved beforeItemRemoved} event
      * of this `sap.m.upload.UploadSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeItemRemoved(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeItemRemoved(
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
      * Detaches event handler `fnFunction` from the {@link #event:beforeUploadStarts beforeUploadStarts} event
      * of this `sap.m.upload.UploadSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeUploadStarts(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeUploadStarts(
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
      * Detaches event handler `fnFunction` from the {@link #event:beforeUploadTermination beforeUploadTermination}
      * event of this `sap.m.upload.UploadSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeUploadTermination(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeUploadTermination(
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
      * Detaches event handler `fnFunction` from the {@link #event:fileNameLengthExceeded fileNameLengthExceeded}
      * event of this `sap.m.upload.UploadSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFileNameLengthExceeded(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachFileNameLengthExceeded(
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
      * @SINCE 1.100.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:fileRenamed fileRenamed} event of this `sap.m.upload.UploadSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFileRenamed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachFileRenamed(
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
      * Detaches event handler `fnFunction` from the {@link #event:fileSizeExceeded fileSizeExceeded} event of
      * this `sap.m.upload.UploadSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFileSizeExceeded(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachFileSizeExceeded(
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
      * Detaches event handler `fnFunction` from the {@link #event:fileTypeMismatch fileTypeMismatch} event of
      * this `sap.m.upload.UploadSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFileTypeMismatch(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachFileTypeMismatch(
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
      * @SINCE 1.99
      *
      * Detaches event handler `fnFunction` from the {@link #event:itemDragStart itemDragStart} event of this
      * `sap.m.upload.UploadSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemDragStart(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemDragStart(
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
      * @SINCE 1.99
      *
      * Detaches event handler `fnFunction` from the {@link #event:itemDrop itemDrop} event of this `sap.m.upload.UploadSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemDrop(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemDrop(
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
      * Detaches event handler `fnFunction` from the {@link #event:mediaTypeMismatch mediaTypeMismatch} event
      * of this `sap.m.upload.UploadSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachMediaTypeMismatch(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachMediaTypeMismatch(
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
      * Detaches event handler `fnFunction` from the {@link #event:selectionChanged selectionChanged} event of
      * this `sap.m.upload.UploadSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelectionChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSelectionChanged(
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
      * Detaches event handler `fnFunction` from the {@link #event:uploadCompleted uploadCompleted} event of
      * this `sap.m.upload.UploadSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUploadCompleted(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachUploadCompleted(
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
      * Detaches event handler `fnFunction` from the {@link #event:uploadTerminated uploadTerminated} event of
      * this `sap.m.upload.UploadSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUploadTerminated(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachUploadTerminated(
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
      * Fires event {@link #event:afterItemAdded afterItemAdded} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterItemAdded(): this.type = js.native
    def fireAfterItemAdded(/**
      * Parameters to pass along with the event
      */
    mParameters: `24`): this.type = js.native
    
    /**
      * @SINCE 1.83
      *
      * Fires event {@link #event:afterItemEdited afterItemEdited} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterItemEdited(): this.type = js.native
    def fireAfterItemEdited(/**
      * Parameters to pass along with the event
      */
    mParameters: `24`): this.type = js.native
    
    /**
      * @SINCE 1.83
      *
      * Fires event {@link #event:afterItemRemoved afterItemRemoved} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterItemRemoved(): this.type = js.native
    def fireAfterItemRemoved(/**
      * Parameters to pass along with the event
      */
    mParameters: `24`): this.type = js.native
    
    /**
      * Fires event {@link #event:beforeItemAdded beforeItemAdded} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireBeforeItemAdded(): Boolean = js.native
    def fireBeforeItemAdded(/**
      * Parameters to pass along with the event
      */
    mParameters: `24`): Boolean = js.native
    
    /**
      * Fires event {@link #event:beforeItemEdited beforeItemEdited} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireBeforeItemEdited(): Boolean = js.native
    def fireBeforeItemEdited(/**
      * Parameters to pass along with the event
      */
    mParameters: `24`): Boolean = js.native
    
    /**
      * Fires event {@link #event:beforeItemRemoved beforeItemRemoved} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireBeforeItemRemoved(): Boolean = js.native
    def fireBeforeItemRemoved(/**
      * Parameters to pass along with the event
      */
    mParameters: `24`): Boolean = js.native
    
    /**
      * Fires event {@link #event:beforeUploadStarts beforeUploadStarts} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireBeforeUploadStarts(): Boolean = js.native
    def fireBeforeUploadStarts(/**
      * Parameters to pass along with the event
      */
    mParameters: `24`): Boolean = js.native
    
    /**
      * Fires event {@link #event:beforeUploadTermination beforeUploadTermination} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireBeforeUploadTermination(): Boolean = js.native
    def fireBeforeUploadTermination(/**
      * Parameters to pass along with the event
      */
    mParameters: `24`): Boolean = js.native
    
    /**
      * Fires event {@link #event:fileNameLengthExceeded fileNameLengthExceeded} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFileNameLengthExceeded(): this.type = js.native
    def fireFileNameLengthExceeded(/**
      * Parameters to pass along with the event
      */
    mParameters: `24`): this.type = js.native
    
    /**
      * @SINCE 1.100.0
      *
      * Fires event {@link #event:fileRenamed fileRenamed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFileRenamed(): this.type = js.native
    def fireFileRenamed(/**
      * Parameters to pass along with the event
      */
    mParameters: `24`): this.type = js.native
    
    /**
      * Fires event {@link #event:fileSizeExceeded fileSizeExceeded} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFileSizeExceeded(): this.type = js.native
    def fireFileSizeExceeded(/**
      * Parameters to pass along with the event
      */
    mParameters: `24`): this.type = js.native
    
    /**
      * Fires event {@link #event:fileTypeMismatch fileTypeMismatch} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFileTypeMismatch(): this.type = js.native
    def fireFileTypeMismatch(/**
      * Parameters to pass along with the event
      */
    mParameters: `24`): this.type = js.native
    
    /**
      * @SINCE 1.99
      *
      * Fires event {@link #event:itemDragStart itemDragStart} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemDragStart(): this.type = js.native
    def fireItemDragStart(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.99
      *
      * Fires event {@link #event:itemDrop itemDrop} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemDrop(): this.type = js.native
    def fireItemDrop(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:mediaTypeMismatch mediaTypeMismatch} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireMediaTypeMismatch(): this.type = js.native
    def fireMediaTypeMismatch(/**
      * Parameters to pass along with the event
      */
    mParameters: `24`): this.type = js.native
    
    /**
      * Fires event {@link #event:selectionChanged selectionChanged} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionChanged(): this.type = js.native
    def fireSelectionChanged(/**
      * Parameters to pass along with the event
      */
    mParameters: `25`): this.type = js.native
    
    /**
      * Fires event {@link #event:uploadCompleted uploadCompleted} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUploadCompleted(): this.type = js.native
    def fireUploadCompleted(/**
      * Parameters to pass along with the event
      */
    mParameters: ReadyState): this.type = js.native
    
    /**
      * Fires event {@link #event:uploadTerminated uploadTerminated} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUploadTerminated(): this.type = js.native
    def fireUploadTerminated(/**
      * Parameters to pass along with the event
      */
    mParameters: `24`): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.106)
      *
      * Gets current value of property {@link #getCloudFilePickerButtonText cloudFilePickerButtonText}.
      *
      * The text of the CloudFile picker button. The default text is "Upload from cloud" (translated to the respective
      * language).
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `cloudFilePickerButtonText`
      */
    def getCloudFilePickerButtonText(): String = js.native
    
    /**
      * @EXPERIMENTAL (since 1.106)
      *
      * Gets current value of property {@link #getCloudFilePickerEnabled cloudFilePickerEnabled}.
      *
      * Enables CloudFile picker feature to upload files from cloud.
      *
      * Default value is `false`.
      *
      * @returns Value of property `cloudFilePickerEnabled`
      */
    def getCloudFilePickerEnabled(): Boolean = js.native
    
    /**
      * @EXPERIMENTAL (since 1.106)
      *
      * Gets current value of property {@link #getCloudFilePickerServiceUrl cloudFilePickerServiceUrl}.
      *
      * Url of the FileShare OData V4 service supplied for CloudFile picker control.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `cloudFilePickerServiceUrl`
      */
    def getCloudFilePickerServiceUrl(): URI = js.native
    
    /**
      * Returns an instance of the default `sap.ui.unified.FileUploader` used for adding files using the operating
      * system's open file dialog, so that it can be customized, for example made invisible or assigned a different
      * icon.
      *
      * @returns Instance of the default `sap.ui.unified.FileUploader`.
      */
    def getDefaultFileUploader(): typings.openui5.sapUiUnifiedFileUploaderMod.default = js.native
    
    /**
      * Gets current value of property {@link #getDirectory directory}.
      *
      * Lets the user upload entire files from directories and sub directories.
      *
      * Default value is `false`.
      *
      * @returns Value of property `directory`
      */
    def getDirectory(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getDragDropDescription dragDropDescription}.
      *
      * Defines custom text for the 'No data' description label.
      *
      * @returns Value of property `dragDropDescription`
      */
    def getDragDropDescription(): String = js.native
    
    /**
      * Gets current value of property {@link #getDragDropText dragDropText}.
      *
      * Defines custom text for the 'No data' text label.
      *
      * @returns Value of property `dragDropText`
      */
    def getDragDropText(): String = js.native
    
    /**
      * Gets current value of property {@link #getFileTypes fileTypes}.
      *
      * Allowed file types for files to be uploaded.
      * If this property is not set, any file can be uploaded.
      *
      * @returns Value of property `fileTypes`
      */
    def getFileTypes(): js.Array[String] = js.native
    
    /**
      * Gets content of aggregation {@link #getHeaderFields headerFields}.
      *
      * Header fields to be included in the header section of an XHR request.
      */
    def getHeaderFields(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * @SINCE 1.90
      *
      * Gets current value of property {@link #getHttpRequestMethod httpRequestMethod}.
      *
      * HTTP request method chosen for file upload.
      *
      * Default value is `Post`.
      *
      * @returns Value of property `httpRequestMethod`
      */
    def getHttpRequestMethod(): UploaderHttpRequestMethod = js.native
    
    /**
      * Gets content of aggregation {@link #getIncompleteItems incompleteItems}.
      *
      * Items representing files yet to be uploaded.
      */
    def getIncompleteItems(): js.Array[typings.openui5.sapMUploadUploadSetItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getInstantUpload instantUpload}.
      *
      * Defines whether the upload process should be triggered as soon as the file is added.
      *  If set to `false`, no upload is triggered when a file is added.
      *
      * Default value is `true`.
      *
      * @returns Value of property `instantUpload`
      */
    def getInstantUpload(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Items representing files that have already been uploaded.
      */
    def getItems(): js.Array[typings.openui5.sapMUploadUploadSetItemMod.default] = js.native
    
    /**
      * Provides access to the instance of the inner {@link sap.m.List} control, so that it can be customized.
      *
      * @returns The inner {@link sap.m.List} control.
      */
    def getList(): typings.openui5.sapMListMod.default = js.native
    
    /**
      * Gets current value of property {@link #getMaxFileNameLength maxFileNameLength}.
      *
      * Maximum length of names of files to be uploaded.
      * If set to `null` or `0`, any files can be uploaded, regardless of their names length.
      *
      * @returns Value of property `maxFileNameLength`
      */
    def getMaxFileNameLength(): int = js.native
    
    /**
      * Gets current value of property {@link #getMaxFileSize maxFileSize}.
      *
      * Size limit in megabytes for files to be uploaded.
      * If set to `null` or `0`, files of any size can be uploaded.
      *
      * @returns Value of property `maxFileSize`
      */
    def getMaxFileSize(): float = js.native
    
    /**
      * Gets current value of property {@link #getMediaTypes mediaTypes}.
      *
      * Allowed media types for files to be uploaded.
      * If this property is not set, any file can be uploaded.
      *
      * @returns Value of property `mediaTypes`
      */
    def getMediaTypes(): js.Array[String] = js.native
    
    /**
      * @SINCE 1.100.0
      *
      * Gets current value of property {@link #getMode mode}.
      *
      * Defines the selection mode of the control (e.g. None, SingleSelect, MultiSelect, SingleSelectLeft, SingleSelectMaster).
      * Since the UploadSet reacts like a list for attachments, the API is close to the ListBase Interface. sap.m.ListMode.Delete
      * mode is not supported and will be automatically set to sap.m.ListMode.None. In addition, if instant upload
      * is set to false the mode sap.m.ListMode.MultiSelect is not supported and will be automatically set to
      * sap.m.ListMode.None.
      *
      * Default value is `MultiSelect`.
      *
      * @returns Value of property `mode`
      */
    def getMode(): ListMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getMultiple multiple}.
      *
      * Lets the user select multiple files from the same folder and then upload them.
      *
      * If multiple property is set to false, the control shows an error message if more than one file is chosen
      * for drag & drop.
      *
      * Default value is `false`.
      *
      * @returns Value of property `multiple`
      */
    def getMultiple(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getNoDataDescription noDataDescription}.
      *
      * Defines custom text for the 'No data' description label.
      *
      * @returns Value of property `noDataDescription`
      */
    def getNoDataDescription(): String = js.native
    
    /**
      * Gets current value of property {@link #getNoDataText noDataText}.
      *
      * Defines custom text for the 'No data' text label.
      *
      * @returns Value of property `noDataText`
      */
    def getNoDataText(): String = js.native
    
    /**
      * @SINCE 1.100.0
      *
      * Gets current value of property {@link #getSameFilenameAllowed sameFilenameAllowed}.
      *
      * Allows the user to use the same name for a file while editing the file name. 'Same name' refers to an
      * already existing file name in the list.
      *
      * Default value is `false`.
      *
      * @returns Value of property `sameFilenameAllowed`
      */
    def getSameFilenameAllowed(): Boolean = js.native
    
    /**
      * @SINCE 1.100.0
      *
      * Retrieves the currently selected UploadSetItem.
      *
      * @returns The currently selected item or `null`
      */
    def getSelectedItem(): typings.openui5.sapMUploadUploadSetItemMod.default | Null = js.native
    
    /**
      * @SINCE 1.100.0
      *
      * Returns an array containing the selected UploadSetItems.
      *
      * @returns Array of all selected items
      */
    def getSelectedItems(): js.Array[typings.openui5.sapMUploadUploadSetItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getShowIcons showIcons}.
      *
      * Defines whether file icons should be displayed.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showIcons`
      */
    def getShowIcons(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTerminationEnabled terminationEnabled}.
      *
      * Defines whether it is allowed to terminate the upload process.
      *
      * Default value is `true`.
      *
      * @returns Value of property `terminationEnabled`
      */
    def getTerminationEnabled(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getToolbar toolbar}.
      *
      * Main toolbar of the `UploadSet` control.
      */
    def getToolbar(): typings.openui5.sapMOverflowToolbarMod.default = js.native
    
    /**
      * @SINCE 1.99.0
      *
      * Gets current value of property {@link #getUploadButtonInvisible uploadButtonInvisible}.
      *
      * If set to true, the button used for uploading files become invisible.
      *
      * Default value is `false`.
      *
      * @returns Value of property `uploadButtonInvisible`
      */
    def getUploadButtonInvisible(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getUploadEnabled uploadEnabled}.
      *
      * Defines whether the upload action is allowed.
      *
      * Default value is `true`.
      *
      * @returns Value of property `uploadEnabled`
      */
    def getUploadEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getUploadUrl uploadUrl}.
      *
      * URL where the uploaded files will be stored.
      *
      * @returns Value of property `uploadUrl`
      */
    def getUploadUrl(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getUploader uploader}.
      *
      * Defines the uploader to be used. If not specified, the default implementation is used.
      */
    def getUploader(): typings.openui5.sapMUploadUploaderMod.default = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Item` in the aggregation {@link #getHeaderFields headerFields}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfHeaderField(
      /**
      * The headerField whose index is looked for
      */
    oHeaderField: typings.openui5.sapUiCoreItemMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.m.upload.UploadSetItem` in the aggregation {@link #getIncompleteItems incompleteItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfIncompleteItem(
      /**
      * The incompleteItem whose index is looked for
      */
    oIncompleteItem: typings.openui5.sapMUploadUploadSetItemMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.m.upload.UploadSetItem` in the aggregation {@link #getItems items}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapMUploadUploadSetItemMod.default
    ): int = js.native
    
    /**
      * Inserts a headerField into the aggregation {@link #getHeaderFields headerFields}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertHeaderField(
      /**
      * The headerField to insert; if empty, nothing is inserted
      */
    oHeaderField: typings.openui5.sapUiCoreItemMod.default,
      /**
      * The `0`-based index the headerField should be inserted at; for a negative value of `iIndex`, the headerField
      * is inserted at position 0; for a value greater than the current size of the aggregation, the headerField
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a incompleteItem into the aggregation {@link #getIncompleteItems incompleteItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertIncompleteItem(
      /**
      * The incompleteItem to insert; if empty, nothing is inserted
      */
    oIncompleteItem: typings.openui5.sapMUploadUploadSetItemMod.default,
      /**
      * The `0`-based index the incompleteItem should be inserted at; for a negative value of `iIndex`, the incompleteItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the incompleteItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMUploadUploadSetItemMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.103.0
      *
      * Opens the FileUploader dialog. When an UploadSetItem is provided, this method can be used to update a
      * file with a new version.
      *
      * @returns this to allow method chaining
      */
    def openFileDialog(
      /**
      * The UploadSetItem to update with a new version. This parameter is mandatory.
      */
    item: typings.openui5.sapMUploadUploadSetItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches all necessary handlers to the given uploader instance, so that the progress and status of the
      * upload can be displayed and monitored. This is necessary in case when custom uploader is used.
      */
    def registerUploaderEvents(
      /**
      * Instance of `sap.m.upload.Uploader` to which the default request handlers are attached.
      */
    oUploader: typings.openui5.sapMUploadUploaderMod.default
    ): Unit = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getHeaderFields headerFields}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllHeaderFields(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getIncompleteItems incompleteItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllIncompleteItems(): js.Array[typings.openui5.sapMUploadUploadSetItemMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapMUploadUploadSetItemMod.default] = js.native
    
    def removeHeaderField(/**
      * The headerField to remove or its index or id
      */
    vHeaderField: String): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    /**
      * Removes a headerField from the aggregation {@link #getHeaderFields headerFields}.
      *
      * @returns The removed headerField or `null`
      */
    def removeHeaderField(/**
      * The headerField to remove or its index or id
      */
    vHeaderField: int): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    def removeHeaderField(
      /**
      * The headerField to remove or its index or id
      */
    vHeaderField: typings.openui5.sapUiCoreItemMod.default
    ): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    def removeIncompleteItem(/**
      * The incompleteItem to remove or its index or id
      */
    vIncompleteItem: String): typings.openui5.sapMUploadUploadSetItemMod.default | Null = js.native
    /**
      * Removes a incompleteItem from the aggregation {@link #getIncompleteItems incompleteItems}.
      *
      * @returns The removed incompleteItem or `null`
      */
    def removeIncompleteItem(/**
      * The incompleteItem to remove or its index or id
      */
    vIncompleteItem: int): typings.openui5.sapMUploadUploadSetItemMod.default | Null = js.native
    def removeIncompleteItem(
      /**
      * The incompleteItem to remove or its index or id
      */
    vIncompleteItem: typings.openui5.sapMUploadUploadSetItemMod.default
    ): typings.openui5.sapMUploadUploadSetItemMod.default | Null = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapMUploadUploadSetItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapMUploadUploadSetItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapMUploadUploadSetItemMod.default
    ): typings.openui5.sapMUploadUploadSetItemMod.default | Null = js.native
    
    /**
      * @SINCE 1.100.0
      *
      * Select all items in "MultiSelection" mode.
      *
      * @returns this to allow method chaining
      */
    def selectAll(): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.106)
      *
      * Sets a new value for property {@link #getCloudFilePickerButtonText cloudFilePickerButtonText}.
      *
      * The text of the CloudFile picker button. The default text is "Upload from cloud" (translated to the respective
      * language).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCloudFilePickerButtonText(): this.type = js.native
    def setCloudFilePickerButtonText(/**
      * New value for property `cloudFilePickerButtonText`
      */
    sCloudFilePickerButtonText: String): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.106)
      *
      * Sets a new value for property {@link #getCloudFilePickerEnabled cloudFilePickerEnabled}.
      *
      * Enables CloudFile picker feature to upload files from cloud.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCloudFilePickerEnabled(): this.type = js.native
    def setCloudFilePickerEnabled(/**
      * New value for property `cloudFilePickerEnabled`
      */
    bCloudFilePickerEnabled: Boolean): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.106)
      *
      * Sets a new value for property {@link #getCloudFilePickerServiceUrl cloudFilePickerServiceUrl}.
      *
      * Url of the FileShare OData V4 service supplied for CloudFile picker control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCloudFilePickerServiceUrl(): this.type = js.native
    def setCloudFilePickerServiceUrl(/**
      * New value for property `cloudFilePickerServiceUrl`
      */
    sCloudFilePickerServiceUrl: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDirectory directory}.
      *
      * Lets the user upload entire files from directories and sub directories.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDirectory(): this.type = js.native
    def setDirectory(/**
      * New value for property `directory`
      */
    bDirectory: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDragDropDescription dragDropDescription}.
      *
      * Defines custom text for the 'No data' description label.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDragDropDescription(): this.type = js.native
    def setDragDropDescription(/**
      * New value for property `dragDropDescription`
      */
    sDragDropDescription: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDragDropText dragDropText}.
      *
      * Defines custom text for the 'No data' text label.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDragDropText(): this.type = js.native
    def setDragDropText(/**
      * New value for property `dragDropText`
      */
    sDragDropText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFileTypes fileTypes}.
      *
      * Allowed file types for files to be uploaded.
      * If this property is not set, any file can be uploaded.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFileTypes(): this.type = js.native
    def setFileTypes(/**
      * New value for property `fileTypes`
      */
    sFileTypes: js.Array[String]): this.type = js.native
    
    /**
      * @SINCE 1.90
      *
      * Sets a new value for property {@link #getHttpRequestMethod httpRequestMethod}.
      *
      * HTTP request method chosen for file upload.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Post`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHttpRequestMethod(): this.type = js.native
    def setHttpRequestMethod(
      /**
      * New value for property `httpRequestMethod`
      */
    sHttpRequestMethod: UploaderHttpRequestMethod
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getInstantUpload instantUpload}.
      *
      * Defines whether the upload process should be triggered as soon as the file is added.
      *  If set to `false`, no upload is triggered when a file is added.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInstantUpload(): this.type = js.native
    def setInstantUpload(/**
      * New value for property `instantUpload`
      */
    bInstantUpload: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxFileNameLength maxFileNameLength}.
      *
      * Maximum length of names of files to be uploaded.
      * If set to `null` or `0`, any files can be uploaded, regardless of their names length.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxFileNameLength(): this.type = js.native
    def setMaxFileNameLength(/**
      * New value for property `maxFileNameLength`
      */
    iMaxFileNameLength: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxFileSize maxFileSize}.
      *
      * Size limit in megabytes for files to be uploaded.
      * If set to `null` or `0`, files of any size can be uploaded.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxFileSize(): this.type = js.native
    def setMaxFileSize(/**
      * New value for property `maxFileSize`
      */
    fMaxFileSize: float): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMediaTypes mediaTypes}.
      *
      * Allowed media types for files to be uploaded.
      * If this property is not set, any file can be uploaded.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMediaTypes(): this.type = js.native
    def setMediaTypes(/**
      * New value for property `mediaTypes`
      */
    sMediaTypes: js.Array[String]): this.type = js.native
    
    /**
      * @SINCE 1.100.0
      *
      * Sets a new value for property {@link #getMode mode}.
      *
      * Defines the selection mode of the control (e.g. None, SingleSelect, MultiSelect, SingleSelectLeft, SingleSelectMaster).
      * Since the UploadSet reacts like a list for attachments, the API is close to the ListBase Interface. sap.m.ListMode.Delete
      * mode is not supported and will be automatically set to sap.m.ListMode.None. In addition, if instant upload
      * is set to false the mode sap.m.ListMode.MultiSelect is not supported and will be automatically set to
      * sap.m.ListMode.None.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `MultiSelect`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMode(): this.type = js.native
    def setMode(
      /**
      * New value for property `mode`
      */
    sMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String
    ): this.type = js.native
    def setMode(/**
      * New value for property `mode`
      */
    sMode: ListMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMultiple multiple}.
      *
      * Lets the user select multiple files from the same folder and then upload them.
      *
      * If multiple property is set to false, the control shows an error message if more than one file is chosen
      * for drag & drop.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMultiple(): this.type = js.native
    def setMultiple(/**
      * New value for property `multiple`
      */
    bMultiple: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNoDataDescription noDataDescription}.
      *
      * Defines custom text for the 'No data' description label.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNoDataDescription(): this.type = js.native
    def setNoDataDescription(/**
      * New value for property `noDataDescription`
      */
    sNoDataDescription: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNoDataText noDataText}.
      *
      * Defines custom text for the 'No data' text label.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNoDataText(): this.type = js.native
    def setNoDataText(/**
      * New value for property `noDataText`
      */
    sNoDataText: String): this.type = js.native
    
    /**
      * @SINCE 1.100.0
      *
      * Sets a new value for property {@link #getSameFilenameAllowed sameFilenameAllowed}.
      *
      * Allows the user to use the same name for a file while editing the file name. 'Same name' refers to an
      * already existing file name in the list.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSameFilenameAllowed(): this.type = js.native
    def setSameFilenameAllowed(/**
      * New value for property `sameFilenameAllowed`
      */
    bSameFilenameAllowed: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.100.0
      *
      * Selects or deselects the given list item.
      *
      * @returns this to allow method chaining
      */
    def setSelectedItem(
      /**
      * The item whose selection is to be changed. This parameter is mandatory.
      */
    uploadSetItem: typings.openui5.sapMUploadUploadSetItemMod.default
    ): this.type = js.native
    def setSelectedItem(
      /**
      * The item whose selection is to be changed. This parameter is mandatory.
      */
    uploadSetItem: typings.openui5.sapMUploadUploadSetItemMod.default,
      /**
      * The selection state of the item.
      */
    select: Boolean
    ): this.type = js.native
    
    /**
      * @SINCE 1.100.0
      *
      * Sets an UploadSetItem to be selected by ID. In single selection mode, the method removes the previous
      * selection.
      *
      * @returns this to allow method chaining
      */
    def setSelectedItemById(/**
      * The ID of the item whose selection is to be changed.
      */
    id: String): this.type = js.native
    def setSelectedItemById(
      /**
      * The ID of the item whose selection is to be changed.
      */
    id: String,
      /**
      * The selection state of the item.
      */
    select: Boolean
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowIcons showIcons}.
      *
      * Defines whether file icons should be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowIcons(): this.type = js.native
    def setShowIcons(/**
      * New value for property `showIcons`
      */
    bShowIcons: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTerminationEnabled terminationEnabled}.
      *
      * Defines whether it is allowed to terminate the upload process.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTerminationEnabled(): this.type = js.native
    def setTerminationEnabled(/**
      * New value for property `terminationEnabled`
      */
    bTerminationEnabled: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getToolbar toolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setToolbar(/**
      * The toolbar to set
      */
    oToolbar: typings.openui5.sapMOverflowToolbarMod.default): this.type = js.native
    
    /**
      * @SINCE 1.99.0
      *
      * Sets a new value for property {@link #getUploadButtonInvisible uploadButtonInvisible}.
      *
      * If set to true, the button used for uploading files become invisible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUploadButtonInvisible(): this.type = js.native
    def setUploadButtonInvisible(/**
      * New value for property `uploadButtonInvisible`
      */
    bUploadButtonInvisible: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUploadEnabled uploadEnabled}.
      *
      * Defines whether the upload action is allowed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUploadEnabled(): this.type = js.native
    def setUploadEnabled(/**
      * New value for property `uploadEnabled`
      */
    bUploadEnabled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUploadUrl uploadUrl}.
      *
      * URL where the uploaded files will be stored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUploadUrl(): this.type = js.native
    def setUploadUrl(/**
      * New value for property `uploadUrl`
      */
    sUploadUrl: String): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getUploader uploader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUploader(/**
      * The uploader to set
      */
    oUploader: typings.openui5.sapMUploadUploaderMod.default): this.type = js.native
    
    /**
      * Starts uploading all files that comply with the restrictions defined in the `fileTypes`, `maxFileNameLength`,
      * `maxFileSize`, and `mediaTypes` properties.
      * This method works only when the `uploadEnabled` property is set to `true`.
      */
    def upload(): Unit = js.native
    
    /**
      * Starts uploading the file if it complies with the restrictions defined in the `fileTypes`, `maxFileNameLength`,
      * `maxFileSize`, and `mediaTypes` properties.
      * This method works only when the `uploadEnabled` property is set to `true`.
      */
    def uploadItem(/**
      * File to upload.
      */
    oItem: js.Object): Unit = js.native
  }
  
  trait UploadSetSettings
    extends StObject
       with ControlSettings {
    
    /**
      * This event is fired when a new file is added to the set of items to be uploaded.
      */
    var afterItemAdded: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.83
      *
      * This event is fired after item edit is confirmed.
      */
    var afterItemEdited: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.83
      *
      * This event is fired after the item is removed on click of ok button in confirmation dialog.
      */
    var afterItemRemoved: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event is fired just before a new file is added to the set of items to be uploaded.
      */
    var beforeItemAdded: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event is fired when the edit button is clicked for an item and no other item is being edited at
      * the same time.
      * If there is another item that has unsaved changes, the editing of the clicked item cannot be started.
      */
    var beforeItemEdited: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event is fired just before the confirmation dialog for 'Remove' action is displayed.
      */
    var beforeItemRemoved: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event is fired right before the upload process begins.
      */
    var beforeUploadStarts: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event is fired right before the upload is terminated.
      */
    var beforeUploadTermination: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.106)
      *
      * The text of the CloudFile picker button. The default text is "Upload from cloud" (translated to the respective
      * language).
      */
    var cloudFilePickerButtonText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.106)
      *
      * Enables CloudFile picker feature to upload files from cloud.
      */
    var cloudFilePickerEnabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.106)
      *
      * Url of the FileShare OData V4 service supplied for CloudFile picker control.
      */
    var cloudFilePickerServiceUrl: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Lets the user upload entire files from directories and sub directories.
      */
    var directory: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines custom text for the 'No data' description label.
      */
    var dragDropDescription: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines custom text for the 'No data' text label.
      */
    var dragDropText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * This event is fired in either of the following cases:
      * 	 - When a file that is selected to be uploaded fails to meet the file name length restriction specified
      * 			in the `maxFileNameLength` property.
      * 	 - When the file name length restriction changes, and the file to be uploaded fails to meet the new
      * 			restriction.
      * 	 - Listeners can use the item parameter to remove the incomplete item that failed to meet the restriction
      */
    var fileNameLengthExceeded: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.100.0
      *
      * The event is triggered when the file name is changed.
      */
    var fileRenamed: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event is fired in either of the following cases:
      * 	 - When a file that is selected to be uploaded fails to meet the file size restriction specified in
      * 			the `maxFileSize` property.
      * 	 - When the file size restriction changes, and the file to be uploaded fails to meet the new restriction.
      *
      * 	 - Listeners can use the item parameter to remove the incomplete item that failed to meet the restriction
      */
    var fileSizeExceeded: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event is fired in either of the following cases:
      * 	 - When a file that is selected to be uploaded fails to meet the file type restriction (`fileType` property).
      *
      * 	 - When the file type restriction changes, and the file to be uploaded fails to meet the new restriction.
      */
    var fileTypeMismatch: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Allowed file types for files to be uploaded.
      * If this property is not set, any file can be uploaded.
      */
    var fileTypes: js.UndefOr[
        js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Header fields to be included in the header section of an XHR request.
      */
    var headerFields: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.90
      *
      * HTTP request method chosen for file upload.
      */
    var httpRequestMethod: js.UndefOr[
        UploaderHttpRequestMethod | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Items representing files yet to be uploaded.
      */
    var incompleteItems: js.UndefOr[
        js.Array[typings.openui5.sapMUploadUploadSetItemMod.default] | typings.openui5.sapMUploadUploadSetItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the upload process should be triggered as soon as the file is added.
      *  If set to `false`, no upload is triggered when a file is added.
      */
    var instantUpload: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.99
      *
      * This event is fired when the user starts dragging an uploaded item.
      */
    var itemDragStart: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.99
      *
      * This event is fired when an uploaded item is dropped on the new list position.
      */
    var itemDrop: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Items representing files that have already been uploaded.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapMUploadUploadSetItemMod.default] | typings.openui5.sapMUploadUploadSetItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Maximum length of names of files to be uploaded.
      * If set to `null` or `0`, any files can be uploaded, regardless of their names length.
      */
    var maxFileNameLength: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Size limit in megabytes for files to be uploaded.
      * If set to `null` or `0`, files of any size can be uploaded.
      */
    var maxFileSize: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event is fired in either of the following cases:
      * 	 - When a file that is selected to be uploaded fails to meet the media type restriction specified in
      * 			the `mediaTypes` property.
      * 	 - When the media type restriction changes, and the file to be uploaded fails to meet the new restriction.
      */
    var mediaTypeMismatch: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Allowed media types for files to be uploaded.
      * If this property is not set, any file can be uploaded.
      */
    var mediaTypes: js.UndefOr[
        js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.100.0
      *
      * Defines the selection mode of the control (e.g. None, SingleSelect, MultiSelect, SingleSelectLeft, SingleSelectMaster).
      * Since the UploadSet reacts like a list for attachments, the API is close to the ListBase Interface. sap.m.ListMode.Delete
      * mode is not supported and will be automatically set to sap.m.ListMode.None. In addition, if instant upload
      * is set to false the mode sap.m.ListMode.MultiSelect is not supported and will be automatically set to
      * sap.m.ListMode.None.
      */
    var mode: js.UndefOr[
        ListMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Lets the user select multiple files from the same folder and then upload them.
      *
      * If multiple property is set to false, the control shows an error message if more than one file is chosen
      * for drag & drop.
      */
    var multiple: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines custom text for the 'No data' description label.
      */
    var noDataDescription: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines custom text for the 'No data' text label.
      */
    var noDataText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.100.0
      *
      * Allows the user to use the same name for a file while editing the file name. 'Same name' refers to an
      * already existing file name in the list.
      */
    var sameFilenameAllowed: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event is fired simultaneously with the respective event in the inner {@link sap.m.List} control.
      */
    var selectionChanged: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines whether file icons should be displayed.
      */
    var showIcons: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether it is allowed to terminate the upload process.
      */
    var terminationEnabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Main toolbar of the `UploadSet` control.
      */
    var toolbar: js.UndefOr[typings.openui5.sapMOverflowToolbarMod.default] = js.undefined
    
    /**
      * @SINCE 1.99.0
      *
      * If set to true, the button used for uploading files become invisible.
      */
    var uploadButtonInvisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event is fired right after the upload process is finished.
      */
    var uploadCompleted: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines whether the upload action is allowed.
      */
    var uploadEnabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event is fired right after the upload is terminated.
      */
    var uploadTerminated: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * URL where the uploaded files will be stored.
      */
    var uploadUrl: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the uploader to be used. If not specified, the default implementation is used.
      */
    var uploader: js.UndefOr[typings.openui5.sapMUploadUploaderMod.default] = js.undefined
  }
  object UploadSetSettings {
    
    inline def apply(): UploadSetSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadSetSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadSetSettings] (val x: Self) extends AnyVal {
      
      inline def setAfterItemAdded(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterItemAdded", js.Any.fromFunction1(value))
      
      inline def setAfterItemAddedUndefined: Self = StObject.set(x, "afterItemAdded", js.undefined)
      
      inline def setAfterItemEdited(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterItemEdited", js.Any.fromFunction1(value))
      
      inline def setAfterItemEditedUndefined: Self = StObject.set(x, "afterItemEdited", js.undefined)
      
      inline def setAfterItemRemoved(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterItemRemoved", js.Any.fromFunction1(value))
      
      inline def setAfterItemRemovedUndefined: Self = StObject.set(x, "afterItemRemoved", js.undefined)
      
      inline def setBeforeItemAdded(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeItemAdded", js.Any.fromFunction1(value))
      
      inline def setBeforeItemAddedUndefined: Self = StObject.set(x, "beforeItemAdded", js.undefined)
      
      inline def setBeforeItemEdited(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeItemEdited", js.Any.fromFunction1(value))
      
      inline def setBeforeItemEditedUndefined: Self = StObject.set(x, "beforeItemEdited", js.undefined)
      
      inline def setBeforeItemRemoved(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeItemRemoved", js.Any.fromFunction1(value))
      
      inline def setBeforeItemRemovedUndefined: Self = StObject.set(x, "beforeItemRemoved", js.undefined)
      
      inline def setBeforeUploadStarts(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeUploadStarts", js.Any.fromFunction1(value))
      
      inline def setBeforeUploadStartsUndefined: Self = StObject.set(x, "beforeUploadStarts", js.undefined)
      
      inline def setBeforeUploadTermination(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeUploadTermination", js.Any.fromFunction1(value))
      
      inline def setBeforeUploadTerminationUndefined: Self = StObject.set(x, "beforeUploadTermination", js.undefined)
      
      inline def setCloudFilePickerButtonText(value: String | PropertyBindingInfo): Self = StObject.set(x, "cloudFilePickerButtonText", value.asInstanceOf[js.Any])
      
      inline def setCloudFilePickerButtonTextUndefined: Self = StObject.set(x, "cloudFilePickerButtonText", js.undefined)
      
      inline def setCloudFilePickerEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "cloudFilePickerEnabled", value.asInstanceOf[js.Any])
      
      inline def setCloudFilePickerEnabledUndefined: Self = StObject.set(x, "cloudFilePickerEnabled", js.undefined)
      
      inline def setCloudFilePickerServiceUrl(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "cloudFilePickerServiceUrl", value.asInstanceOf[js.Any])
      
      inline def setCloudFilePickerServiceUrlUndefined: Self = StObject.set(x, "cloudFilePickerServiceUrl", js.undefined)
      
      inline def setDirectory(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setDragDropDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "dragDropDescription", value.asInstanceOf[js.Any])
      
      inline def setDragDropDescriptionUndefined: Self = StObject.set(x, "dragDropDescription", js.undefined)
      
      inline def setDragDropText(value: String | PropertyBindingInfo): Self = StObject.set(x, "dragDropText", value.asInstanceOf[js.Any])
      
      inline def setDragDropTextUndefined: Self = StObject.set(x, "dragDropText", js.undefined)
      
      inline def setFileNameLengthExceeded(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "fileNameLengthExceeded", js.Any.fromFunction1(value))
      
      inline def setFileNameLengthExceededUndefined: Self = StObject.set(x, "fileNameLengthExceeded", js.undefined)
      
      inline def setFileRenamed(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "fileRenamed", js.Any.fromFunction1(value))
      
      inline def setFileRenamedUndefined: Self = StObject.set(x, "fileRenamed", js.undefined)
      
      inline def setFileSizeExceeded(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "fileSizeExceeded", js.Any.fromFunction1(value))
      
      inline def setFileSizeExceededUndefined: Self = StObject.set(x, "fileSizeExceeded", js.undefined)
      
      inline def setFileTypeMismatch(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "fileTypeMismatch", js.Any.fromFunction1(value))
      
      inline def setFileTypeMismatchUndefined: Self = StObject.set(x, "fileTypeMismatch", js.undefined)
      
      inline def setFileTypes(
        value: js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
      
      inline def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
      
      inline def setFileTypesVarargs(value: String*): Self = StObject.set(x, "fileTypes", js.Array(value*))
      
      inline def setHeaderFields(
        value: js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "headerFields", value.asInstanceOf[js.Any])
      
      inline def setHeaderFieldsUndefined: Self = StObject.set(x, "headerFields", js.undefined)
      
      inline def setHeaderFieldsVarargs(value: typings.openui5.sapUiCoreItemMod.default*): Self = StObject.set(x, "headerFields", js.Array(value*))
      
      inline def setHttpRequestMethod(
        value: UploaderHttpRequestMethod | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "httpRequestMethod", value.asInstanceOf[js.Any])
      
      inline def setHttpRequestMethodUndefined: Self = StObject.set(x, "httpRequestMethod", js.undefined)
      
      inline def setIncompleteItems(
        value: js.Array[typings.openui5.sapMUploadUploadSetItemMod.default] | typings.openui5.sapMUploadUploadSetItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "incompleteItems", value.asInstanceOf[js.Any])
      
      inline def setIncompleteItemsUndefined: Self = StObject.set(x, "incompleteItems", js.undefined)
      
      inline def setIncompleteItemsVarargs(value: typings.openui5.sapMUploadUploadSetItemMod.default*): Self = StObject.set(x, "incompleteItems", js.Array(value*))
      
      inline def setInstantUpload(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "instantUpload", value.asInstanceOf[js.Any])
      
      inline def setInstantUploadUndefined: Self = StObject.set(x, "instantUpload", js.undefined)
      
      inline def setItemDragStart(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemDragStart", js.Any.fromFunction1(value))
      
      inline def setItemDragStartUndefined: Self = StObject.set(x, "itemDragStart", js.undefined)
      
      inline def setItemDrop(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemDrop", js.Any.fromFunction1(value))
      
      inline def setItemDropUndefined: Self = StObject.set(x, "itemDrop", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapMUploadUploadSetItemMod.default] | typings.openui5.sapMUploadUploadSetItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapMUploadUploadSetItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMaxFileNameLength(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxFileNameLength", value.asInstanceOf[js.Any])
      
      inline def setMaxFileNameLengthUndefined: Self = StObject.set(x, "maxFileNameLength", js.undefined)
      
      inline def setMaxFileSize(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      inline def setMediaTypeMismatch(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "mediaTypeMismatch", js.Any.fromFunction1(value))
      
      inline def setMediaTypeMismatchUndefined: Self = StObject.set(x, "mediaTypeMismatch", js.undefined)
      
      inline def setMediaTypes(
        value: js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "mediaTypes", value.asInstanceOf[js.Any])
      
      inline def setMediaTypesUndefined: Self = StObject.set(x, "mediaTypes", js.undefined)
      
      inline def setMediaTypesVarargs(value: String*): Self = StObject.set(x, "mediaTypes", js.Array(value*))
      
      inline def setMode(
        value: ListMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMultiple(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setNoDataDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "noDataDescription", value.asInstanceOf[js.Any])
      
      inline def setNoDataDescriptionUndefined: Self = StObject.set(x, "noDataDescription", js.undefined)
      
      inline def setNoDataText(value: String | PropertyBindingInfo): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
      
      inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
      
      inline def setSameFilenameAllowed(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sameFilenameAllowed", value.asInstanceOf[js.Any])
      
      inline def setSameFilenameAllowedUndefined: Self = StObject.set(x, "sameFilenameAllowed", js.undefined)
      
      inline def setSelectionChanged(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "selectionChanged", js.Any.fromFunction1(value))
      
      inline def setSelectionChangedUndefined: Self = StObject.set(x, "selectionChanged", js.undefined)
      
      inline def setShowIcons(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showIcons", value.asInstanceOf[js.Any])
      
      inline def setShowIconsUndefined: Self = StObject.set(x, "showIcons", js.undefined)
      
      inline def setTerminationEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "terminationEnabled", value.asInstanceOf[js.Any])
      
      inline def setTerminationEnabledUndefined: Self = StObject.set(x, "terminationEnabled", js.undefined)
      
      inline def setToolbar(value: typings.openui5.sapMOverflowToolbarMod.default): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      inline def setUploadButtonInvisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "uploadButtonInvisible", value.asInstanceOf[js.Any])
      
      inline def setUploadButtonInvisibleUndefined: Self = StObject.set(x, "uploadButtonInvisible", js.undefined)
      
      inline def setUploadCompleted(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "uploadCompleted", js.Any.fromFunction1(value))
      
      inline def setUploadCompletedUndefined: Self = StObject.set(x, "uploadCompleted", js.undefined)
      
      inline def setUploadEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "uploadEnabled", value.asInstanceOf[js.Any])
      
      inline def setUploadEnabledUndefined: Self = StObject.set(x, "uploadEnabled", js.undefined)
      
      inline def setUploadTerminated(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "uploadTerminated", js.Any.fromFunction1(value))
      
      inline def setUploadTerminatedUndefined: Self = StObject.set(x, "uploadTerminated", js.undefined)
      
      inline def setUploadUrl(value: String | PropertyBindingInfo): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
      
      inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
      
      inline def setUploader(value: typings.openui5.sapMUploadUploaderMod.default): Self = StObject.set(x, "uploader", value.asInstanceOf[js.Any])
      
      inline def setUploaderUndefined: Self = StObject.set(x, "uploader", js.undefined)
    }
  }
}
