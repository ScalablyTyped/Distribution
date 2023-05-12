package typings.openui5

import typings.openui5.anon.ChangeSetId
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataV2ContextMod {
  
  @JSImport("sap/ui/model/odata/v2/Context", JSImport.Default)
  @js.native
  open class default () extends Context
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/v2/Context", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.v2.Context with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.Context.extend}.
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
    oClassInfo: ClassInfo[T, Context]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Context],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.v2.Context.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Context
    extends typings.openui5.sapUiModelContextMod.default {
    
    /**
      * @SINCE 1.96.0
      *
      * Returns a promise on the creation state of this context if it has been created via {@link sap.ui.model.odata.v2.ODataModel#createEntry}
      * or {@link sap.ui.model.odata.v2.ODataListBinding#create}; otherwise returns `undefined`.
      *
      * As long as the promise is not yet resolved or rejected, the entity represented by this context is transient.
      *
      * Once the promise is resolved, the entity for this context is stored in the back end and {@link #getPath}
      * returns a path including the key predicate of the new entity.
      *
      * If the context has been created via {@link sap.ui.model.odata.v2.ODataListBinding#create} and the entity
      * for this context has been stored in the back end, {@link #created} returns `undefined` after the data
      * has been re-read from the back end and inserted at the right position based on the list binding's filters
      * and sorters. If the context has been created via {@link sap.ui.model.odata.v2.ODataModel#createEntry}
      * and the entity for this context has been stored in the back end, {@link #created} returns `undefined`.
      *
      * @returns A promise for a context which has been created via {@link sap.ui.model.odata.v2.ODataModel#createEntry}
      * or {@link sap.ui.model.odata.v2.ODataListBinding#create}, otherwise `undefined`.
      *
      * When the entity represented by this context has been persisted in the back end, the promise resolves
      * without data.
      *
      * When the entity is deleted before it has been persisted in the back end via {@link sap.ui.model.odata.v2.ODataModel#resetChanges}
      * with the `bDeleteCreatedEntities` parameter set to `true`, the promise rejects with an object `oError`
      * containing the error information, where `oError.aborted === true`.
      */
    def created(): js.UndefOr[js.Promise[js.UndefOr[Any]]] = js.native
    
    /**
      * @SINCE 1.101
      *
      * Deletes the OData entity this context points to. Persisted contexts are only removed from the UI after
      * their successful deletion in the back end. In this case, the `Promise` returned by this method is only
      * resolved when the back-end request has been successful. **Example:** A persisted entry in a table control
      * is deleted by this method. It remains visible on the UI and only disappears upon successful deletion
      * in the back end. **Note:** The context must not be used anymore after successful deletion.
      *
      * @returns A promise resolving with `undefined` in case of successful deletion or rejecting with an error
      * in case the deletion failed
      */
    def delete(): js.Promise[Unit] = js.native
    def delete(
      /**
      * For a persistent context, a map of parameters as specified for {@link sap.ui.model.odata.v2.ODataModel#remove},
      * except that the `groupId` and `changeSetId` parameters default to the values set via {@link sap.ui.model.odata.v2.ODataModel#setChangeGroups}
      * for the type of the entity to be deleted.
      */
    mParameters: ChangeSetId
    ): js.Promise[Unit] = js.native
    
    /**
      * @SINCE 1.98.0
      *
      * Returns whether this context is inactive. An inactive context will not be sent to the server until it
      * is activated. From then on it behaves like any other created context. The result of this function can
      * also be accessed via the "@$ui5.context.isInactive" instance annotation at the entity, see {@link sap.ui.model.odata.v2.ODataModel#getProperty}
      * for details.
      * See:
      * 	sap.ui.model.odata.v2.ODataListBinding#create
      * 	sap.ui.model.odata.v2.ODataModel#createEntry
      *
      * @returns Whether this context is inactive
      */
    def isInactive(): Boolean = js.native
    
    /**
      * @SINCE 1.94.0
      *
      * For a context created using {@link sap.ui.model.odata.v2.ODataModel#createEntry} or {@link sap.ui.model.odata.v2.ODataListBinding#create},
      * the method returns `true` if the context is transient or `false` if the context is not transient. A transient
      * context represents an entity created on the client which has not been persisted in the back end. The
      * result of this function can also be accessed via the "@$ui5.context.isTransient" instance annotation
      * at the entity, see {@link sap.ui.model.odata.v2.ODataModel#getProperty} for details.
      *
      * @returns
      * 	 - `true`: if the context has been created via {@link sap.ui.model.odata.v2.ODataModel#createEntry}
      * 			or {@link sap.ui.model.odata.v2.ODataListBinding#create} and is not yet persisted in the back end,
      * 	 - `false`: if the context has been created via {@link sap.ui.model.odata.v2.ODataListBinding#create},
      * 			data has been successfully persisted in the back end and the data is still displayed in the area of the
      * 			inline creation rows, and
      * 	 - `undefined`: otherwise
      */
    def isTransient(): js.UndefOr[Boolean] = js.native
  }
}
