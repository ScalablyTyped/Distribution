package typings.openui5.sap.ui.model

import typings.openui5.TypeofBindingMode
import typings.openui5.sap.ui.core.message.MessageProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.Model")
@js.native
/**
  * Constructor for a new Model.Every Model is a MessageProcessor that is able to handle Messages with
  * the normal binding path syntax in the target.
  */
abstract class Model () extends MessageProcessor {
  /**
    * Attach event-handler <code>fnFunction</code> to the 'parseError' event of this
    * <code>sap.ui.model.Model</code>.<br/>
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, the global context (window)
    * is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachParseError(oData: js.Any, fnFunction: js.Any): Model = js.native
  def attachParseError(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Model = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'propertyChange' event of this
    * <code>sap.ui.model.Model</code>.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, the global context (window)
    * is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachPropertyChange(oData: js.Any, fnFunction: js.Any): Model = js.native
  def attachPropertyChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Model = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'requestCompleted' event of this
    * <code>sap.ui.model.Model</code>.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, the global context (window)
    * is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachRequestCompleted(oData: js.Any, fnFunction: js.Any): Model = js.native
  def attachRequestCompleted(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Model = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'requestFailed' event of this
    * <code>sap.ui.model.Model</code>.<br/>
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, this Model is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachRequestFailed(oData: js.Any, fnFunction: js.Any): Model = js.native
  def attachRequestFailed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Model = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'requestSent' event of this
    * <code>sap.ui.model.Model</code>.
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, the global context (window)
    * is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachRequestSent(oData: js.Any, fnFunction: js.Any): Model = js.native
  def attachRequestSent(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Model = js.native
  /**
    * Create ContextBinding
    * @param sPath the path pointing to the property that should be bound or an object        which
    * contains the following parameter properties: path, context, parameters
    * @param oContext the context object for this databinding (optional)
    * @param mParameters additional model specific parameters (optional)
    * @param oEvents event handlers can be passed to the binding ({change:myHandler})
    */
  def bindContext(sPath: String): ContextBinding = js.native
  def bindContext(sPath: String, oContext: js.Any): ContextBinding = js.native
  def bindContext(sPath: String, oContext: js.Any, mParameters: js.Any): ContextBinding = js.native
  def bindContext(sPath: String, oContext: js.Any, mParameters: js.Any, oEvents: js.Any): ContextBinding = js.native
  def bindContext(sPath: js.Any): ContextBinding = js.native
  def bindContext(sPath: js.Any, oContext: js.Any): ContextBinding = js.native
  def bindContext(sPath: js.Any, oContext: js.Any, mParameters: js.Any): ContextBinding = js.native
  def bindContext(sPath: js.Any, oContext: js.Any, mParameters: js.Any, oEvents: js.Any): ContextBinding = js.native
  /**
    * Implement in inheriting classes
    * @param sPath the path pointing to the list / array that should be bound
    * @param oContext the context object for this databinding (optional)
    * @param aSorters initial sort order (can be either a sorter or an array of sorters) (optional)
    * @param aFilters predefined filter/s (can be either a filter or an array of filters) (optional)
    * @param mParameters additional model specific parameters (optional)
    */
  def bindList(sPath: String): ListBinding = js.native
  def bindList(sPath: String, oContext: Context): ListBinding = js.native
  def bindList(sPath: String, oContext: Context, aSorters: js.Array[Sorter]): ListBinding = js.native
  def bindList(sPath: String, oContext: Context, aSorters: js.Array[Sorter], aFilters: js.Array[Filter]): ListBinding = js.native
  def bindList(
    sPath: String,
    oContext: Context,
    aSorters: js.Array[Sorter],
    aFilters: js.Array[Filter],
    mParameters: js.Any
  ): ListBinding = js.native
  /**
    * Implement in inheriting classes
    * @param sPath the path pointing to the property that should be bound
    * @param oContext the context object for this databinding (optional)
    * @param mParameters additional model specific parameters (optional)
    */
  def bindProperty(sPath: String): PropertyBinding = js.native
  def bindProperty(sPath: String, oContext: js.Any): PropertyBinding = js.native
  def bindProperty(sPath: String, oContext: js.Any, mParameters: js.Any): PropertyBinding = js.native
  /**
    * Implement in inheriting classes
    * @param sPath the path pointing to the tree / array that should be bound
    * @param oContext the context object for this databinding (optional)
    * @param aFilters predefined filter/s contained in an array (optional)
    * @param mParameters additional model specific parameters (optional)
    * @param aSorters predefined sap.ui.model.sorter/s contained in an array (optional)
    */
  def bindTree(sPath: String): TreeBinding = js.native
  def bindTree(sPath: String, oContext: js.Any): TreeBinding = js.native
  def bindTree(sPath: String, oContext: js.Any, aFilters: js.Array[_]): TreeBinding = js.native
  def bindTree(sPath: String, oContext: js.Any, aFilters: js.Array[_], mParameters: js.Any): TreeBinding = js.native
  def bindTree(sPath: String, oContext: js.Any, aFilters: js.Array[_], mParameters: js.Any, aSorters: js.Array[_]): TreeBinding = js.native
  /**
    * Implement in inheriting classes
    * @param sPath the path to create the new context from
    * @param oContext the context which should be used to create the new binding context
    * @param mParameters the parameters used to create the new binding context
    * @param fnCallBack the function which should be called after the binding context has been created
    * @param bReload force reload even if data is already available. For server side models this should   
    *               refetch the data from the server
    * @returns the binding context, if it could be created synchronously
    */
  def createBindingContext(sPath: String): Context = js.native
  def createBindingContext(sPath: String, oContext: js.Any): Context = js.native
  def createBindingContext(sPath: String, oContext: js.Any, mParameters: js.Any): Context = js.native
  def createBindingContext(sPath: String, oContext: js.Any, mParameters: js.Any, fnCallBack: js.Any): Context = js.native
  def createBindingContext(sPath: String, oContext: js.Any, mParameters: js.Any, fnCallBack: js.Any, bReload: Boolean): Context = js.native
  /**
    * Implement in inheriting classes
    * @param oContext to destroy
    */
  def destroyBindingContext(oContext: js.Any): Unit = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'parseError' event of this
    * <code>sap.ui.model.Model</code>.<br/>The passed function and listener object must match the ones
    * previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachParseError(fnFunction: js.Any, oListener: js.Any): Model = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'propertyChange' event of this
    * <code>sap.ui.model.Model</code>.The passed function and listener object must match the ones
    * previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachPropertyChange(fnFunction: js.Any, oListener: js.Any): Model = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'requestCompleted' event of this
    * <code>sap.ui.model.Model</code>.The passed function and listener object must match the ones
    * previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachRequestCompleted(fnFunction: js.Any, oListener: js.Any): Model = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'requestFailed' event of this
    * <code>sap.ui.model.Model</code>.<br/>The passed function and listener object must match the ones
    * previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachRequestFailed(fnFunction: js.Any, oListener: js.Any): Model = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'requestSent' event of this
    * <code>sap.ui.model.Model</code>.The passed function and listener object must match the ones
    * previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachRequestSent(fnFunction: js.Any, oListener: js.Any): Model = js.native
  /**
    * Fire event parseError to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireParseError(mArguments: js.Any): Model = js.native
  /**
    * Fire event propertyChange to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def firePropertyChange(mArguments: js.Any): Model = js.native
  /**
    * Fire event requestCompleted to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireRequestCompleted(mArguments: js.Any): Model = js.native
  /**
    * Fire event requestFailed to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireRequestFailed(mArguments: js.Any): Model = js.native
  /**
    * Fire event requestSent to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireRequestSent(mArguments: js.Any): Model = js.native
  /**
    * Get the default binding mode for the model
    * @returns default binding mode of the model
    */
  def getDefaultBindingMode(): TypeofBindingMode = js.native
  /**
    * Get messages for path
    * @param sPath The binding path
    */
  def getMessagesByPath(sPath: String): Unit = js.native
  /**
    * Returns the meta model associated with this model if it is available for the concretemodel type.
    * @returns The meta model or undefined if no meta model exists.
    */
  def getMetaModel(): MetaModel = js.native
  /**
    * Implement in inheriting classes
    * @param sPath the path to where to read the object
    * @param oContext the context with which the path should be resolved
    * @param mParameters additional model specific parameters
    */
  def getObject(sPath: String): Unit = js.native
  def getObject(sPath: String, oContext: js.Any): Unit = js.native
  def getObject(sPath: String, oContext: js.Any, mParameters: js.Any): Unit = js.native
  /**
    * Returns the original value for the property with the given path and context.The original value is
    * the value that was last responded by a server if using a server model implementation.
    * @param sPath the path/name of the property
    * @param oContext the context if available to access the property value
    * @returns vValue the value of the property
    */
  def getOriginalProperty(sPath: String): js.Any = js.native
  def getOriginalProperty(sPath: String, oContext: js.Any): js.Any = js.native
  /**
    * Implement in inheriting classes
    * @param sPath the path to where to read the attribute value
    * @param oContext the context with which the path should be resolved
    */
  def getProperty(sPath: String): Unit = js.native
  def getProperty(sPath: String, oContext: js.Any): Unit = js.native
  /**
    * Check if the specified binding mode is supported by the model.
    * @param sMode the binding mode to check
    */
  def isBindingModeSupported(sMode: TypeofBindingMode): Unit = js.native
  /**
    * Returns whether legacy path syntax is used
    */
  def isLegacySyntax(): Boolean = js.native
  /**
    * Refresh the model.This will check all bindings for updated data and update the controls if data has
    * been changed.
    * @param bForceUpdate Update controls even if data has not been changed
    */
  def refresh(sGroupIdOrForceUpdate: String): Unit = js.native
  def refresh(sGroupIdOrForceUpdate: Boolean): Unit = js.native
  /**
    * Set the default binding mode for the model. If the default binding mode should be changed,this
    * method should be called directly after model instance creation and before any binding
    * creation.Otherwise it is not guaranteed that the existing bindings will be updated with the new
    * binding mode.
    * @param sMode the default binding mode to set for the model
    * @returns this pointer for chaining
    */
  def setDefaultBindingMode(sMode: TypeofBindingMode): Model = js.native
  /**
    * Enables legacy path syntax handlingThis defines, whether relative bindings, which do not have a
    * definedbinding context, should be compatible to earlier releases which meansthey are resolved
    * relative to the root element or handled strict andstay unresolved until a binding context is set
    * @param bLegacySyntax the path syntax to use
    */
  def setLegacySyntax(bLegacySyntax: Boolean): Unit = js.native
  /**
    * Set the maximum number of entries which are used for list bindings.
    * @param iSizeLimit collection size limit
    */
  def setSizeLimit(iSizeLimit: Double): Unit = js.native
}

