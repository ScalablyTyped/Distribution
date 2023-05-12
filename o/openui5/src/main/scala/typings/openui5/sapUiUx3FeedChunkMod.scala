package typings.openui5

import typings.openui5.anon.Comment
import typings.openui5.anon.Favorite
import typings.openui5.anon.Flagged
import typings.openui5.anon.ItemId
import typings.openui5.anon.Shareed
import typings.openui5.anon.Text
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3FeedChunkMod {
  
  @JSImport("sap/ui/ux3/FeedChunk", JSImport.Default)
  @js.native
  /**
    * Constructor for a new FeedChunk.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FeedChunk {
    def this(/**
      * initial settings for the new control
      */
    mSettings: FeedChunkSettings) = this()
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
    mSettings: FeedChunkSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: FeedChunkSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/FeedChunk", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.FeedChunk with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, FeedChunk]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FeedChunk],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.FeedChunk.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FeedChunk
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some actionMenuItem to the aggregation {@link #getActionMenuItems actionMenuItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addActionMenuItem(
      /**
      * The actionMenuItem to add; if empty, nothing is inserted
      */
    oActionMenuItem: typings.openui5.sapUiCommonsMenuItemMod.default
    ): this.type = js.native
    
    /**
      * Adds some comment to the aggregation {@link #getComments comments}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addComment(/**
      * The comment to add; if empty, nothing is inserted
      */
    oComment: FeedChunk): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:actionItemSelected actionItemSelected} event
      * of this `sap.ui.ux3.FeedChunk`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FeedChunk` itself.
      *
      * Event is fired when an item from the action menu button was selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachActionItemSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachActionItemSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FeedChunk` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:actionItemSelected actionItemSelected} event
      * of this `sap.ui.ux3.FeedChunk`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FeedChunk` itself.
      *
      * Event is fired when an item from the action menu button was selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachActionItemSelected(
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
    def attachActionItemSelected(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FeedChunk` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:commentAdded commentAdded} event of this `sap.ui.ux3.FeedChunk`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FeedChunk` itself.
      *
      * Event is raised when a comment is added to the entry. This event is not supported for comment chunks.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCommentAdded(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachCommentAdded(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FeedChunk` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:commentAdded commentAdded} event of this `sap.ui.ux3.FeedChunk`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FeedChunk` itself.
      *
      * Event is raised when a comment is added to the entry. This event is not supported for comment chunks.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCommentAdded(
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
    def attachCommentAdded(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FeedChunk` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:deleted deleted} event of this `sap.ui.ux3.FeedChunk`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FeedChunk` itself.
      *
      * Event is fired when the deletion button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDeleted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachDeleted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FeedChunk` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:deleted deleted} event of this `sap.ui.ux3.FeedChunk`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FeedChunk` itself.
      *
      * Event is fired when the deletion button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDeleted(
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
    def attachDeleted(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FeedChunk` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:inspect inspect} event of this `sap.ui.ux3.FeedChunk`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FeedChunk` itself.
      *
      * Event is fired when the inspect button was pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachInspect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachInspect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FeedChunk` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:inspect inspect} event of this `sap.ui.ux3.FeedChunk`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FeedChunk` itself.
      *
      * Event is fired when the inspect button was pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachInspect(
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
    def attachInspect(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FeedChunk` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:referenceClicked referenceClicked} event of
      * this `sap.ui.ux3.FeedChunk`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FeedChunk` itself.
      *
      * Click on a @-reference
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachReferenceClicked(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachReferenceClicked(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FeedChunk` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:referenceClicked referenceClicked} event of
      * this `sap.ui.ux3.FeedChunk`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FeedChunk` itself.
      *
      * Click on a @-reference
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachReferenceClicked(
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
    def attachReferenceClicked(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FeedChunk` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:senderClicked senderClicked} event of this `sap.ui.ux3.FeedChunk`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FeedChunk` itself.
      *
      * Event is fired when the thumbnail or the name of the sender is clicked.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSenderClicked(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSenderClicked(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FeedChunk` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:senderClicked senderClicked} event of this `sap.ui.ux3.FeedChunk`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FeedChunk` itself.
      *
      * Event is fired when the thumbnail or the name of the sender is clicked.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSenderClicked(
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
    def attachSenderClicked(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FeedChunk` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggleFavorite toggleFavorite} event of this
      * `sap.ui.ux3.FeedChunk`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FeedChunk` itself.
      *
      * Event is raised when the user clicks to set the entry as favorite. This event is not supported for comment
      * chunks.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggleFavorite(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachToggleFavorite(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FeedChunk` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggleFavorite toggleFavorite} event of this
      * `sap.ui.ux3.FeedChunk`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FeedChunk` itself.
      *
      * Event is raised when the user clicks to set the entry as favorite. This event is not supported for comment
      * chunks.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggleFavorite(
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
    def attachToggleFavorite(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FeedChunk` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggleFlagged toggleFlagged} event of this `sap.ui.ux3.FeedChunk`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FeedChunk` itself.
      *
      * Event is raised when the user clicks to flag the entry. This event is not supported for comment chunks.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggleFlagged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachToggleFlagged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FeedChunk` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggleFlagged toggleFlagged} event of this `sap.ui.ux3.FeedChunk`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FeedChunk` itself.
      *
      * Event is raised when the user clicks to flag the entry. This event is not supported for comment chunks.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggleFlagged(
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
    def attachToggleFlagged(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FeedChunk` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggleShared toggleShared} event of this `sap.ui.ux3.FeedChunk`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FeedChunk` itself.
      *
      * Event is raised when the user clicks to share the entry. This event is not supported for comment chunks.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggleShared(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachToggleShared(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FeedChunk` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggleShared toggleShared} event of this `sap.ui.ux3.FeedChunk`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FeedChunk` itself.
      *
      * Event is raised when the user clicks to share the entry. This event is not supported for comment chunks.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggleShared(
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
    def attachToggleShared(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FeedChunk` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getActionMenuItems actionMenuItems} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindActionMenuItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Binds aggregation {@link #getComments comments} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindComments(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys all the actionMenuItems in the aggregation {@link #getActionMenuItems actionMenuItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyActionMenuItems(): this.type = js.native
    
    /**
      * Destroys all the comments in the aggregation {@link #getComments comments}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyComments(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:actionItemSelected actionItemSelected} event
      * of this `sap.ui.ux3.FeedChunk`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachActionItemSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachActionItemSelected(
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
      * Detaches event handler `fnFunction` from the {@link #event:commentAdded commentAdded} event of this `sap.ui.ux3.FeedChunk`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCommentAdded(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachCommentAdded(
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
      * Detaches event handler `fnFunction` from the {@link #event:deleted deleted} event of this `sap.ui.ux3.FeedChunk`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDeleted(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachDeleted(
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
      * Detaches event handler `fnFunction` from the {@link #event:inspect inspect} event of this `sap.ui.ux3.FeedChunk`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachInspect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachInspect(
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
      * Detaches event handler `fnFunction` from the {@link #event:referenceClicked referenceClicked} event of
      * this `sap.ui.ux3.FeedChunk`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachReferenceClicked(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachReferenceClicked(
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
      * Detaches event handler `fnFunction` from the {@link #event:senderClicked senderClicked} event of this
      * `sap.ui.ux3.FeedChunk`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSenderClicked(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSenderClicked(
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
      * Detaches event handler `fnFunction` from the {@link #event:toggleFavorite toggleFavorite} event of this
      * `sap.ui.ux3.FeedChunk`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachToggleFavorite(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachToggleFavorite(
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
      * Detaches event handler `fnFunction` from the {@link #event:toggleFlagged toggleFlagged} event of this
      * `sap.ui.ux3.FeedChunk`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachToggleFlagged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachToggleFlagged(
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
      * Detaches event handler `fnFunction` from the {@link #event:toggleShared toggleShared} event of this `sap.ui.ux3.FeedChunk`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachToggleShared(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachToggleShared(
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:actionItemSelected actionItemSelected} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireActionItemSelected(): this.type = js.native
    def fireActionItemSelected(/**
      * Parameters to pass along with the event
      */
    mParameters: ItemId): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:commentAdded commentAdded} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCommentAdded(): this.type = js.native
    def fireCommentAdded(/**
      * Parameters to pass along with the event
      */
    mParameters: Comment): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:deleted deleted} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDeleted(): this.type = js.native
    def fireDeleted(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:inspect inspect} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireInspect(): this.type = js.native
    def fireInspect(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:referenceClicked referenceClicked} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireReferenceClicked(): this.type = js.native
    def fireReferenceClicked(/**
      * Parameters to pass along with the event
      */
    mParameters: Text): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:senderClicked senderClicked} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSenderClicked(): this.type = js.native
    def fireSenderClicked(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:toggleFavorite toggleFavorite} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireToggleFavorite(): this.type = js.native
    def fireToggleFavorite(/**
      * Parameters to pass along with the event
      */
    mParameters: Favorite): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:toggleFlagged toggleFlagged} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireToggleFlagged(): this.type = js.native
    def fireToggleFlagged(/**
      * Parameters to pass along with the event
      */
    mParameters: Flagged): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:toggleShared toggleShared} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireToggleShared(): this.type = js.native
    def fireToggleShared(/**
      * Parameters to pass along with the event
      */
    mParameters: Shareed): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getActionMenuItems actionMenuItems}.
      *
      * MenuItems to open when there is a click on the action menu button
      */
    def getActionMenuItems(): js.Array[typings.openui5.sapUiCommonsMenuItemMod.default] = js.native
    
    /**
      * @deprecated (since 1.4.0) - Not longer used. If a chunk is a comment is determined from hierarchy. If
      * the parent is a chunk it's automatically a comment.
      *
      * Gets current value of property {@link #getCommentChunk commentChunk}.
      *
      * This flag changes a FeedChunk into a CommentChunk. In this case, it can not have own comments, furthermore
      * it must be assigned to a FeedChunk.
      *
      * Default value is `false`.
      *
      * @returns Value of property `commentChunk`
      */
    def getCommentChunk(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getComments comments}.
      *
      * Comments on this chunk
      */
    def getComments(): js.Array[FeedChunk] = js.native
    
    /**
      * Gets current value of property {@link #getDeletionAllowed deletionAllowed}.
      *
      * Flag if the deletion of the chunk shall be allowed
      *
      * Default value is `false`.
      *
      * @returns Value of property `deletionAllowed`
      */
    def getDeletionAllowed(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnableComment enableComment}.
      *
      * If true the comment action is enabled.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableComment`
      */
    def getEnableComment(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnableFavorite enableFavorite}.
      *
      * If true the favorite action is enabled.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableFavorite`
      */
    def getEnableFavorite(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnableFlag enableFlag}.
      *
      * If true the flag action is enabled.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableFlag`
      */
    def getEnableFlag(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnableInspect enableInspect}.
      *
      * If true the inspect action is enabled.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableInspect`
      */
    def getEnableInspect(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnableShare enableShare}.
      *
      * If true the share action is enabled.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableShare`
      */
    def getEnableShare(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFavorite favorite}.
      *
      * Defines whether the entry shall be displayed as favorite. This property is not supported for comment
      * chunks.
      *
      * @returns Value of property `favorite`
      */
    def getFavorite(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFeederSender feederSender}.
      *
      * Sender for the comment feeder This property is optional if the chunk is a sub-control of a feed control.
      * In this case the value of the feed control is used if it's not set. So it must be only set once on the
      * feed control.
      *
      * @returns Value of property `feederSender`
      */
    def getFeederSender(): String = js.native
    
    /**
      * Gets current value of property {@link #getFeederThumbnailSrc feederThumbnailSrc}.
      *
      * URL to the thumbnail image for the comment feeder. This property is optional if the chunk is a sub-control
      * of a feed control. In this case the value of the feed control is used if it's not set. So it must be
      * only set once on the feed control.
      *
      * @returns Value of property `feederThumbnailSrc`
      */
    def getFeederThumbnailSrc(): URI = js.native
    
    /**
      * Gets current value of property {@link #getFlagged flagged}.
      *
      * Defines whether the entry is flagged. This property is not supported for comment chunks.
      *
      * Default value is `false`.
      *
      * @returns Value of property `flagged`
      */
    def getFlagged(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSender sender}.
      *
      * Sender of the chunk
      *
      * @returns Value of property `sender`
      */
    def getSender(): String = js.native
    
    /**
      * Gets current value of property {@link #getShared shared}.
      *
      * Defines whether the entry shall be shared. This property is not supported for comment chunks.
      *
      * Default value is `false`.
      *
      * @returns Value of property `shared`
      */
    def getShared(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * The FeedChunk text. @References are supported.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getThumbnailSrc thumbnailSrc}.
      *
      * URL to the thumbnail image.
      *
      * @returns Value of property `thumbnailSrc`
      */
    def getThumbnailSrc(): URI = js.native
    
    /**
      * Gets current value of property {@link #getTimestamp timestamp}.
      *
      * Format is ISO 8601 YYYY-MM-DDThh:mm:ss.sZ, Z meaning the time is in UTC time zone
      *
      * @returns Value of property `timestamp`
      */
    def getTimestamp(): String = js.native
    
    /**
      * Checks for the provided `sap.ui.commons.MenuItem` in the aggregation {@link #getActionMenuItems actionMenuItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfActionMenuItem(
      /**
      * The actionMenuItem whose index is looked for
      */
    oActionMenuItem: typings.openui5.sapUiCommonsMenuItemMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.ux3.FeedChunk` in the aggregation {@link #getComments comments}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfComment(/**
      * The comment whose index is looked for
      */
    oComment: FeedChunk): int = js.native
    
    /**
      * Inserts a actionMenuItem into the aggregation {@link #getActionMenuItems actionMenuItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertActionMenuItem(
      /**
      * The actionMenuItem to insert; if empty, nothing is inserted
      */
    oActionMenuItem: typings.openui5.sapUiCommonsMenuItemMod.default,
      /**
      * The `0`-based index the actionMenuItem should be inserted at; for a negative value of `iIndex`, the actionMenuItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the actionMenuItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a comment into the aggregation {@link #getComments comments}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertComment(
      /**
      * The comment to insert; if empty, nothing is inserted
      */
    oComment: FeedChunk,
      /**
      * The `0`-based index the comment should be inserted at; for a negative value of `iIndex`, the comment
      * is inserted at position 0; for a value greater than the current size of the aggregation, the comment
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    def removeActionMenuItem(/**
      * The actionMenuItem to remove or its index or id
      */
    vActionMenuItem: String): typings.openui5.sapUiCommonsMenuItemMod.default | Null = js.native
    /**
      * Removes a actionMenuItem from the aggregation {@link #getActionMenuItems actionMenuItems}.
      *
      * @returns The removed actionMenuItem or `null`
      */
    def removeActionMenuItem(/**
      * The actionMenuItem to remove or its index or id
      */
    vActionMenuItem: int): typings.openui5.sapUiCommonsMenuItemMod.default | Null = js.native
    def removeActionMenuItem(
      /**
      * The actionMenuItem to remove or its index or id
      */
    vActionMenuItem: typings.openui5.sapUiCommonsMenuItemMod.default
    ): typings.openui5.sapUiCommonsMenuItemMod.default | Null = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getActionMenuItems actionMenuItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllActionMenuItems(): js.Array[typings.openui5.sapUiCommonsMenuItemMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getComments comments}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllComments(): js.Array[FeedChunk] = js.native
    
    def removeComment(/**
      * The comment to remove or its index or id
      */
    vComment: String): FeedChunk | Null = js.native
    /**
      * Removes a comment from the aggregation {@link #getComments comments}.
      *
      * @returns The removed comment or `null`
      */
    def removeComment(/**
      * The comment to remove or its index or id
      */
    vComment: int): FeedChunk | Null = js.native
    def removeComment(/**
      * The comment to remove or its index or id
      */
    vComment: FeedChunk): FeedChunk | Null = js.native
    
    /**
      * @deprecated (since 1.4.0) - Not longer used. If a chunk is a comment is determined from hierarchy. If
      * the parent is a chunk it's automatically a comment.
      *
      * Sets a new value for property {@link #getCommentChunk commentChunk}.
      *
      * This flag changes a FeedChunk into a CommentChunk. In this case, it can not have own comments, furthermore
      * it must be assigned to a FeedChunk.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCommentChunk(): this.type = js.native
    def setCommentChunk(/**
      * New value for property `commentChunk`
      */
    bCommentChunk: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDeletionAllowed deletionAllowed}.
      *
      * Flag if the deletion of the chunk shall be allowed
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDeletionAllowed(): this.type = js.native
    def setDeletionAllowed(/**
      * New value for property `deletionAllowed`
      */
    bDeletionAllowed: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnableComment enableComment}.
      *
      * If true the comment action is enabled.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableComment(): this.type = js.native
    def setEnableComment(/**
      * New value for property `enableComment`
      */
    bEnableComment: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnableFavorite enableFavorite}.
      *
      * If true the favorite action is enabled.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableFavorite(): this.type = js.native
    def setEnableFavorite(/**
      * New value for property `enableFavorite`
      */
    bEnableFavorite: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnableFlag enableFlag}.
      *
      * If true the flag action is enabled.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableFlag(): this.type = js.native
    def setEnableFlag(/**
      * New value for property `enableFlag`
      */
    bEnableFlag: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnableInspect enableInspect}.
      *
      * If true the inspect action is enabled.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableInspect(): this.type = js.native
    def setEnableInspect(/**
      * New value for property `enableInspect`
      */
    bEnableInspect: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnableShare enableShare}.
      *
      * If true the share action is enabled.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableShare(): this.type = js.native
    def setEnableShare(/**
      * New value for property `enableShare`
      */
    bEnableShare: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFavorite favorite}.
      *
      * Defines whether the entry shall be displayed as favorite. This property is not supported for comment
      * chunks.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFavorite(): this.type = js.native
    def setFavorite(/**
      * New value for property `favorite`
      */
    bFavorite: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFeederSender feederSender}.
      *
      * Sender for the comment feeder This property is optional if the chunk is a sub-control of a feed control.
      * In this case the value of the feed control is used if it's not set. So it must be only set once on the
      * feed control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFeederSender(): this.type = js.native
    def setFeederSender(/**
      * New value for property `feederSender`
      */
    sFeederSender: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFeederThumbnailSrc feederThumbnailSrc}.
      *
      * URL to the thumbnail image for the comment feeder. This property is optional if the chunk is a sub-control
      * of a feed control. In this case the value of the feed control is used if it's not set. So it must be
      * only set once on the feed control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFeederThumbnailSrc(): this.type = js.native
    def setFeederThumbnailSrc(/**
      * New value for property `feederThumbnailSrc`
      */
    sFeederThumbnailSrc: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFlagged flagged}.
      *
      * Defines whether the entry is flagged. This property is not supported for comment chunks.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFlagged(): this.type = js.native
    def setFlagged(/**
      * New value for property `flagged`
      */
    bFlagged: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSender sender}.
      *
      * Sender of the chunk
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSender(): this.type = js.native
    def setSender(/**
      * New value for property `sender`
      */
    sSender: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShared shared}.
      *
      * Defines whether the entry shall be shared. This property is not supported for comment chunks.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShared(): this.type = js.native
    def setShared(/**
      * New value for property `shared`
      */
    bShared: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * The FeedChunk text. @References are supported.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getThumbnailSrc thumbnailSrc}.
      *
      * URL to the thumbnail image.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setThumbnailSrc(): this.type = js.native
    def setThumbnailSrc(/**
      * New value for property `thumbnailSrc`
      */
    sThumbnailSrc: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTimestamp timestamp}.
      *
      * Format is ISO 8601 YYYY-MM-DDThh:mm:ss.sZ, Z meaning the time is in UTC time zone
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTimestamp(): this.type = js.native
    def setTimestamp(/**
      * New value for property `timestamp`
      */
    sTimestamp: String): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getActionMenuItems actionMenuItems} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindActionMenuItems(): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getComments comments} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindComments(): this.type = js.native
  }
  
  trait FeedChunkSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Event is fired when an item from the action menu button was selected.
      */
    var actionItemSelected: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * MenuItems to open when there is a click on the action menu button
      */
    var actionMenuItems: js.UndefOr[
        js.Array[typings.openui5.sapUiCommonsMenuItemMod.default] | typings.openui5.sapUiCommonsMenuItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is raised when a comment is added to the entry. This event is not supported for comment chunks.
      */
    var commentAdded: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @deprecated (since 1.4.0) - Not longer used. If a chunk is a comment is determined from hierarchy. If
      * the parent is a chunk it's automatically a comment.
      *
      * This flag changes a FeedChunk into a CommentChunk. In this case, it can not have own comments, furthermore
      * it must be assigned to a FeedChunk.
      */
    var commentChunk: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Comments on this chunk
      */
    var comments: js.UndefOr[
        js.Array[FeedChunk] | FeedChunk | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is fired when the deletion button is pressed.
      */
    var deleted: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Flag if the deletion of the chunk shall be allowed
      */
    var deletionAllowed: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If true the comment action is enabled.
      */
    var enableComment: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If true the favorite action is enabled.
      */
    var enableFavorite: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If true the flag action is enabled.
      */
    var enableFlag: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If true the inspect action is enabled.
      */
    var enableInspect: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If true the share action is enabled.
      */
    var enableShare: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the entry shall be displayed as favorite. This property is not supported for comment
      * chunks.
      */
    var favorite: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sender for the comment feeder This property is optional if the chunk is a sub-control of a feed control.
      * In this case the value of the feed control is used if it's not set. So it must be only set once on the
      * feed control.
      */
    var feederSender: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * URL to the thumbnail image for the comment feeder. This property is optional if the chunk is a sub-control
      * of a feed control. In this case the value of the feed control is used if it's not set. So it must be
      * only set once on the feed control.
      */
    var feederThumbnailSrc: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines whether the entry is flagged. This property is not supported for comment chunks.
      */
    var flagged: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is fired when the inspect button was pressed
      */
    var inspect: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Click on a @-reference
      */
    var referenceClicked: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Sender of the chunk
      */
    var sender: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Event is fired when the thumbnail or the name of the sender is clicked.
      */
    var senderClicked: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines whether the entry shall be shared. This property is not supported for comment chunks.
      */
    var shared: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The FeedChunk text. @References are supported.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * URL to the thumbnail image.
      */
    var thumbnailSrc: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Format is ISO 8601 YYYY-MM-DDThh:mm:ss.sZ, Z meaning the time is in UTC time zone
      */
    var timestamp: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Event is raised when the user clicks to set the entry as favorite. This event is not supported for comment
      * chunks.
      */
    var toggleFavorite: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Event is raised when the user clicks to flag the entry. This event is not supported for comment chunks.
      */
    var toggleFlagged: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Event is raised when the user clicks to share the entry. This event is not supported for comment chunks.
      */
    var toggleShared: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object FeedChunkSettings {
    
    inline def apply(): FeedChunkSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedChunkSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FeedChunkSettings] (val x: Self) extends AnyVal {
      
      inline def setActionItemSelected(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "actionItemSelected", js.Any.fromFunction1(value))
      
      inline def setActionItemSelectedUndefined: Self = StObject.set(x, "actionItemSelected", js.undefined)
      
      inline def setActionMenuItems(
        value: js.Array[typings.openui5.sapUiCommonsMenuItemMod.default] | typings.openui5.sapUiCommonsMenuItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actionMenuItems", value.asInstanceOf[js.Any])
      
      inline def setActionMenuItemsUndefined: Self = StObject.set(x, "actionMenuItems", js.undefined)
      
      inline def setActionMenuItemsVarargs(value: typings.openui5.sapUiCommonsMenuItemMod.default*): Self = StObject.set(x, "actionMenuItems", js.Array(value*))
      
      inline def setCommentAdded(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "commentAdded", js.Any.fromFunction1(value))
      
      inline def setCommentAddedUndefined: Self = StObject.set(x, "commentAdded", js.undefined)
      
      inline def setCommentChunk(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "commentChunk", value.asInstanceOf[js.Any])
      
      inline def setCommentChunkUndefined: Self = StObject.set(x, "commentChunk", js.undefined)
      
      inline def setComments(
        value: js.Array[FeedChunk] | FeedChunk | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setCommentsVarargs(value: FeedChunk*): Self = StObject.set(x, "comments", js.Array(value*))
      
      inline def setDeleted(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "deleted", js.Any.fromFunction1(value))
      
      inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
      
      inline def setDeletionAllowed(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "deletionAllowed", value.asInstanceOf[js.Any])
      
      inline def setDeletionAllowedUndefined: Self = StObject.set(x, "deletionAllowed", js.undefined)
      
      inline def setEnableComment(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableComment", value.asInstanceOf[js.Any])
      
      inline def setEnableCommentUndefined: Self = StObject.set(x, "enableComment", js.undefined)
      
      inline def setEnableFavorite(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableFavorite", value.asInstanceOf[js.Any])
      
      inline def setEnableFavoriteUndefined: Self = StObject.set(x, "enableFavorite", js.undefined)
      
      inline def setEnableFlag(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableFlag", value.asInstanceOf[js.Any])
      
      inline def setEnableFlagUndefined: Self = StObject.set(x, "enableFlag", js.undefined)
      
      inline def setEnableInspect(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableInspect", value.asInstanceOf[js.Any])
      
      inline def setEnableInspectUndefined: Self = StObject.set(x, "enableInspect", js.undefined)
      
      inline def setEnableShare(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableShare", value.asInstanceOf[js.Any])
      
      inline def setEnableShareUndefined: Self = StObject.set(x, "enableShare", js.undefined)
      
      inline def setFavorite(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "favorite", value.asInstanceOf[js.Any])
      
      inline def setFavoriteUndefined: Self = StObject.set(x, "favorite", js.undefined)
      
      inline def setFeederSender(value: String | PropertyBindingInfo): Self = StObject.set(x, "feederSender", value.asInstanceOf[js.Any])
      
      inline def setFeederSenderUndefined: Self = StObject.set(x, "feederSender", js.undefined)
      
      inline def setFeederThumbnailSrc(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "feederThumbnailSrc", value.asInstanceOf[js.Any])
      
      inline def setFeederThumbnailSrcUndefined: Self = StObject.set(x, "feederThumbnailSrc", js.undefined)
      
      inline def setFlagged(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "flagged", value.asInstanceOf[js.Any])
      
      inline def setFlaggedUndefined: Self = StObject.set(x, "flagged", js.undefined)
      
      inline def setInspect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "inspect", js.Any.fromFunction1(value))
      
      inline def setInspectUndefined: Self = StObject.set(x, "inspect", js.undefined)
      
      inline def setReferenceClicked(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "referenceClicked", js.Any.fromFunction1(value))
      
      inline def setReferenceClickedUndefined: Self = StObject.set(x, "referenceClicked", js.undefined)
      
      inline def setSender(value: String | PropertyBindingInfo): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      inline def setSenderClicked(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "senderClicked", js.Any.fromFunction1(value))
      
      inline def setSenderClickedUndefined: Self = StObject.set(x, "senderClicked", js.undefined)
      
      inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
      
      inline def setShared(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setThumbnailSrc(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "thumbnailSrc", value.asInstanceOf[js.Any])
      
      inline def setThumbnailSrcUndefined: Self = StObject.set(x, "thumbnailSrc", js.undefined)
      
      inline def setTimestamp(value: String | PropertyBindingInfo): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setToggleFavorite(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "toggleFavorite", js.Any.fromFunction1(value))
      
      inline def setToggleFavoriteUndefined: Self = StObject.set(x, "toggleFavorite", js.undefined)
      
      inline def setToggleFlagged(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "toggleFlagged", js.Any.fromFunction1(value))
      
      inline def setToggleFlaggedUndefined: Self = StObject.set(x, "toggleFlagged", js.undefined)
      
      inline def setToggleShared(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "toggleShared", js.Any.fromFunction1(value))
      
      inline def setToggleSharedUndefined: Self = StObject.set(x, "toggleShared", js.undefined)
    }
  }
}
