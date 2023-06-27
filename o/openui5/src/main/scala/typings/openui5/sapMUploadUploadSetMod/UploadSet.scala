package typings.openui5.sapMUploadUploadSetMod

import typings.openui5.float
import typings.openui5.int
import typings.openui5.sapMLibraryMod.ListMode
import typings.openui5.sapMUploadUploaderHttpRequestMethodMod.UploaderHttpRequestMethod
import typings.openui5.sapUiCoreLibraryMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  fnFunction: js.Function1[/* p1 */ UploadSetAfterItemAddedEvent, Unit]
  ): this.type = js.native
  def attachAfterItemAdded(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetAfterItemAddedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetAfterItemAddedEvent, Unit]
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
  fnFunction: js.Function1[/* p1 */ UploadSetAfterItemAddedEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.83
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
  fnFunction: js.Function1[/* p1 */ UploadSetAfterItemEditedEvent, Unit]
  ): this.type = js.native
  def attachAfterItemEdited(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetAfterItemEditedEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * @since 1.83
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
  fnFunction: js.Function1[/* p1 */ UploadSetAfterItemEditedEvent, Unit]
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
  fnFunction: js.Function1[/* p1 */ UploadSetAfterItemEditedEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.83
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
  fnFunction: js.Function1[/* p1 */ UploadSetAfterItemRemovedEvent, Unit]
  ): this.type = js.native
  def attachAfterItemRemoved(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetAfterItemRemovedEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * @since 1.83
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
  fnFunction: js.Function1[/* p1 */ UploadSetAfterItemRemovedEvent, Unit]
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
  fnFunction: js.Function1[/* p1 */ UploadSetAfterItemRemovedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeItemAddedEvent, Unit]
  ): this.type = js.native
  def attachBeforeItemAdded(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeItemAddedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeItemAddedEvent, Unit]
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeItemAddedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeItemEditedEvent, Unit]
  ): this.type = js.native
  def attachBeforeItemEdited(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeItemEditedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeItemEditedEvent, Unit]
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeItemEditedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeItemRemovedEvent, Unit]
  ): this.type = js.native
  def attachBeforeItemRemoved(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeItemRemovedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeItemRemovedEvent, Unit]
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeItemRemovedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeUploadStartsEvent, Unit]
  ): this.type = js.native
  def attachBeforeUploadStarts(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeUploadStartsEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeUploadStartsEvent, Unit]
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeUploadStartsEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Attaches event handler `fnFunction` to the {@link #event:beforeUploadTermination beforeUploadTermination }
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeUploadTerminationEvent, Unit]
  ): this.type = js.native
  def attachBeforeUploadTermination(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeUploadTerminationEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * Attaches event handler `fnFunction` to the {@link #event:beforeUploadTermination beforeUploadTermination }
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeUploadTerminationEvent, Unit]
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeUploadTerminationEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Attaches event handler `fnFunction` to the {@link #event:fileNameLengthExceeded fileNameLengthExceeded }
    * event of this `sap.m.upload.UploadSet`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
    *
    * This event is fired in either of the following cases:
    * 	 - When a file that is selected to be uploaded fails to meet the file name length restriction specified
    *     in the `maxFileNameLength` property.
    * 	 - When the file name length restriction changes, and the file to be uploaded fails to meet the new
    *     restriction.
    * 	 - Listeners can use the item parameter to remove the incomplete item that failed to meet the restriction
    *
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachFileNameLengthExceeded(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetFileNameLengthExceededEvent, Unit]
  ): this.type = js.native
  def attachFileNameLengthExceeded(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetFileNameLengthExceededEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * Attaches event handler `fnFunction` to the {@link #event:fileNameLengthExceeded fileNameLengthExceeded }
    * event of this `sap.m.upload.UploadSet`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.m.upload.UploadSet` itself.
    *
    * This event is fired in either of the following cases:
    * 	 - When a file that is selected to be uploaded fails to meet the file name length restriction specified
    *     in the `maxFileNameLength` property.
    * 	 - When the file name length restriction changes, and the file to be uploaded fails to meet the new
    *     restriction.
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
  fnFunction: js.Function1[/* p1 */ UploadSetFileNameLengthExceededEvent, Unit]
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
  fnFunction: js.Function1[/* p1 */ UploadSetFileNameLengthExceededEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.100.0
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
  fnFunction: js.Function1[/* p1 */ UploadSetFileRenamedEvent, Unit]
  ): this.type = js.native
  def attachFileRenamed(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetFileRenamedEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * @since 1.100.0
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
  fnFunction: js.Function1[/* p1 */ UploadSetFileRenamedEvent, Unit]
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
  fnFunction: js.Function1[/* p1 */ UploadSetFileRenamedEvent, Unit],
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
    *     the `maxFileSize` property.
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
  fnFunction: js.Function1[/* p1 */ UploadSetFileSizeExceededEvent, Unit]
  ): this.type = js.native
  def attachFileSizeExceeded(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetFileSizeExceededEvent, Unit],
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
    *     the `maxFileSize` property.
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
  fnFunction: js.Function1[/* p1 */ UploadSetFileSizeExceededEvent, Unit]
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
  fnFunction: js.Function1[/* p1 */ UploadSetFileSizeExceededEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetFileTypeMismatchEvent, Unit]
  ): this.type = js.native
  def attachFileTypeMismatch(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetFileTypeMismatchEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetFileTypeMismatchEvent, Unit]
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
  fnFunction: js.Function1[/* p1 */ UploadSetFileTypeMismatchEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.99
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
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
  ): this.type = js.native
  def attachItemDragStart(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * @since 1.99
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
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
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
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.99
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
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
  ): this.type = js.native
  def attachItemDrop(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.m.upload.UploadSet` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * @since 1.99
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
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
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
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
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
    *     the `mediaTypes` property.
    * 	 - When the media type restriction changes, and the file to be uploaded fails to meet the new restriction.
    *
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachMediaTypeMismatch(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetMediaTypeMismatchEvent, Unit]
  ): this.type = js.native
  def attachMediaTypeMismatch(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetMediaTypeMismatchEvent, Unit],
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
    *     the `mediaTypes` property.
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
  fnFunction: js.Function1[/* p1 */ UploadSetMediaTypeMismatchEvent, Unit]
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
  fnFunction: js.Function1[/* p1 */ UploadSetMediaTypeMismatchEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetSelectionChangedEvent, Unit]
  ): this.type = js.native
  def attachSelectionChanged(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetSelectionChangedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetSelectionChangedEvent, Unit]
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
  fnFunction: js.Function1[/* p1 */ UploadSetSelectionChangedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetUploadCompletedEvent, Unit]
  ): this.type = js.native
  def attachUploadCompleted(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetUploadCompletedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetUploadCompletedEvent, Unit]
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
  fnFunction: js.Function1[/* p1 */ UploadSetUploadCompletedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetUploadTerminatedEvent, Unit]
  ): this.type = js.native
  def attachUploadTerminated(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetUploadTerminatedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetUploadTerminatedEvent, Unit]
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
  fnFunction: js.Function1[/* p1 */ UploadSetUploadTerminatedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetAfterItemAddedEvent, Unit]
  ): this.type = js.native
  def detachAfterItemAdded(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetAfterItemAddedEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.83
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
  fnFunction: js.Function1[/* p1 */ UploadSetAfterItemEditedEvent, Unit]
  ): this.type = js.native
  def detachAfterItemEdited(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetAfterItemEditedEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.83
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
  fnFunction: js.Function1[/* p1 */ UploadSetAfterItemRemovedEvent, Unit]
  ): this.type = js.native
  def detachAfterItemRemoved(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetAfterItemRemovedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeItemAddedEvent, Unit]
  ): this.type = js.native
  def detachBeforeItemAdded(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeItemAddedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeItemEditedEvent, Unit]
  ): this.type = js.native
  def detachBeforeItemEdited(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeItemEditedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeItemRemovedEvent, Unit]
  ): this.type = js.native
  def detachBeforeItemRemoved(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeItemRemovedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeUploadStartsEvent, Unit]
  ): this.type = js.native
  def detachBeforeUploadStarts(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeUploadStartsEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Detaches event handler `fnFunction` from the {@link #event:beforeUploadTermination beforeUploadTermination }
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
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeUploadTerminationEvent, Unit]
  ): this.type = js.native
  def detachBeforeUploadTermination(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetBeforeUploadTerminationEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Detaches event handler `fnFunction` from the {@link #event:fileNameLengthExceeded fileNameLengthExceeded }
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
  fnFunction: js.Function1[/* p1 */ UploadSetFileNameLengthExceededEvent, Unit]
  ): this.type = js.native
  def detachFileNameLengthExceeded(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetFileNameLengthExceededEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.100.0
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
  fnFunction: js.Function1[/* p1 */ UploadSetFileRenamedEvent, Unit]
  ): this.type = js.native
  def detachFileRenamed(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetFileRenamedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetFileSizeExceededEvent, Unit]
  ): this.type = js.native
  def detachFileSizeExceeded(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetFileSizeExceededEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetFileTypeMismatchEvent, Unit]
  ): this.type = js.native
  def detachFileTypeMismatch(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetFileTypeMismatchEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.99
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
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
  ): this.type = js.native
  def detachItemDragStart(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.99
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
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
  ): this.type = js.native
  def detachItemDrop(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetMediaTypeMismatchEvent, Unit]
  ): this.type = js.native
  def detachMediaTypeMismatch(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetMediaTypeMismatchEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetSelectionChangedEvent, Unit]
  ): this.type = js.native
  def detachSelectionChanged(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetSelectionChangedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetUploadCompletedEvent, Unit]
  ): this.type = js.native
  def detachUploadCompleted(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetUploadCompletedEvent, Unit],
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
  fnFunction: js.Function1[/* p1 */ UploadSetUploadTerminatedEvent, Unit]
  ): this.type = js.native
  def detachUploadTerminated(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ UploadSetUploadTerminatedEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:afterItemAdded afterItemAdded} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireAfterItemAdded(): this.type = js.native
  def fireAfterItemAdded(
    /**
    * Parameters to pass along with the event
    */
  mParameters: UploadSet$AfterItemAddedEventParameters
  ): this.type = js.native
  
  /**
    * @since 1.83
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:afterItemEdited afterItemEdited} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireAfterItemEdited(): this.type = js.native
  def fireAfterItemEdited(
    /**
    * Parameters to pass along with the event
    */
  mParameters: UploadSet$AfterItemEditedEventParameters
  ): this.type = js.native
  
  /**
    * @since 1.83
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:afterItemRemoved afterItemRemoved} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireAfterItemRemoved(): this.type = js.native
  def fireAfterItemRemoved(
    /**
    * Parameters to pass along with the event
    */
  mParameters: UploadSet$AfterItemRemovedEventParameters
  ): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:beforeItemAdded beforeItemAdded} to attached listeners.
    *
    * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
    * event object. The return value of this method indicates whether the default action should be executed.
    *
    * @returns Whether or not to prevent the default action
    */
  def fireBeforeItemAdded(): Boolean = js.native
  def fireBeforeItemAdded(
    /**
    * Parameters to pass along with the event
    */
  mParameters: UploadSet$BeforeItemAddedEventParameters
  ): Boolean = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:beforeItemEdited beforeItemEdited} to attached listeners.
    *
    * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
    * event object. The return value of this method indicates whether the default action should be executed.
    *
    * @returns Whether or not to prevent the default action
    */
  def fireBeforeItemEdited(): Boolean = js.native
  def fireBeforeItemEdited(
    /**
    * Parameters to pass along with the event
    */
  mParameters: UploadSet$BeforeItemEditedEventParameters
  ): Boolean = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:beforeItemRemoved beforeItemRemoved} to attached listeners.
    *
    * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
    * event object. The return value of this method indicates whether the default action should be executed.
    *
    * @returns Whether or not to prevent the default action
    */
  def fireBeforeItemRemoved(): Boolean = js.native
  def fireBeforeItemRemoved(
    /**
    * Parameters to pass along with the event
    */
  mParameters: UploadSet$BeforeItemRemovedEventParameters
  ): Boolean = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:beforeUploadStarts beforeUploadStarts} to attached listeners.
    *
    * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
    * event object. The return value of this method indicates whether the default action should be executed.
    *
    * @returns Whether or not to prevent the default action
    */
  def fireBeforeUploadStarts(): Boolean = js.native
  def fireBeforeUploadStarts(
    /**
    * Parameters to pass along with the event
    */
  mParameters: UploadSet$BeforeUploadStartsEventParameters
  ): Boolean = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:beforeUploadTermination beforeUploadTermination} to attached listeners.
    *
    * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
    * event object. The return value of this method indicates whether the default action should be executed.
    *
    * @returns Whether or not to prevent the default action
    */
  def fireBeforeUploadTermination(): Boolean = js.native
  def fireBeforeUploadTermination(
    /**
    * Parameters to pass along with the event
    */
  mParameters: UploadSet$BeforeUploadTerminationEventParameters
  ): Boolean = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:fileNameLengthExceeded fileNameLengthExceeded} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireFileNameLengthExceeded(): this.type = js.native
  def fireFileNameLengthExceeded(
    /**
    * Parameters to pass along with the event
    */
  mParameters: UploadSet$FileNameLengthExceededEventParameters
  ): this.type = js.native
  
  /**
    * @since 1.100.0
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:fileRenamed fileRenamed} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireFileRenamed(): this.type = js.native
  def fireFileRenamed(
    /**
    * Parameters to pass along with the event
    */
  mParameters: UploadSet$FileRenamedEventParameters
  ): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:fileSizeExceeded fileSizeExceeded} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireFileSizeExceeded(): this.type = js.native
  def fireFileSizeExceeded(
    /**
    * Parameters to pass along with the event
    */
  mParameters: UploadSet$FileSizeExceededEventParameters
  ): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:fileTypeMismatch fileTypeMismatch} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireFileTypeMismatch(): this.type = js.native
  def fireFileTypeMismatch(
    /**
    * Parameters to pass along with the event
    */
  mParameters: UploadSet$FileTypeMismatchEventParameters
  ): this.type = js.native
  
  /**
    * @since 1.99
    * Protected:  Do not call from applications (only from related classes in the framework)
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
    * @since 1.99
    * Protected:  Do not call from applications (only from related classes in the framework)
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
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:mediaTypeMismatch mediaTypeMismatch} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireMediaTypeMismatch(): this.type = js.native
  def fireMediaTypeMismatch(
    /**
    * Parameters to pass along with the event
    */
  mParameters: UploadSet$MediaTypeMismatchEventParameters
  ): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:selectionChanged selectionChanged} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireSelectionChanged(): this.type = js.native
  def fireSelectionChanged(
    /**
    * Parameters to pass along with the event
    */
  mParameters: UploadSet$SelectionChangedEventParameters
  ): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:uploadCompleted uploadCompleted} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireUploadCompleted(): this.type = js.native
  def fireUploadCompleted(
    /**
    * Parameters to pass along with the event
    */
  mParameters: UploadSet$UploadCompletedEventParameters
  ): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:uploadTerminated uploadTerminated} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireUploadTerminated(): this.type = js.native
  def fireUploadTerminated(
    /**
    * Parameters to pass along with the event
    */
  mParameters: UploadSet$UploadTerminatedEventParameters
  ): this.type = js.native
  
  /**
    * @experimental (since 1.106)
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
    * @experimental (since 1.106)
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
    * @experimental (since 1.106)
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
    * @since 1.107
    *
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
    * Defines custom text for the drag and drop description label.
    *
    * @returns Value of property `dragDropDescription`
    */
  def getDragDropDescription(): String = js.native
  
  /**
    * Gets current value of property {@link #getDragDropText dragDropText}.
    *
    * Defines custom text for the drag and drop text label.
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
    * @since 1.90
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
    * @since 1.100.0
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
    * @since 1.100.0
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
    * @since 1.100.0
    *
    * Retrieves the currently selected UploadSetItem.
    *
    * @returns The currently selected item or `null`
    */
  def getSelectedItem(): typings.openui5.sapMUploadUploadSetItemMod.default | Null = js.native
  
  /**
    * @since 1.100.0
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
    * @since 1.99.0
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
    * @since 1.103.0
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
    * @since 1.100.0
    *
    * Select all items in "MultiSelection" mode.
    *
    * @returns this to allow method chaining
    */
  def selectAll(): this.type = js.native
  
  /**
    * @experimental (since 1.106)
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
    * @experimental (since 1.106)
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
    * @experimental (since 1.106)
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
    * @since 1.107
    *
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
    * Defines custom text for the drag and drop description label.
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
    * Defines custom text for the drag and drop text label.
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
    * @since 1.90
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
    * @since 1.100.0
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
    * @since 1.100.0
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
    * @since 1.100.0
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
    * @since 1.100.0
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
    * @since 1.99.0
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
