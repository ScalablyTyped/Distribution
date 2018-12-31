package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.TablePersoController")
@js.native
class TablePersoController protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.ManagedObject {
  /**
    * The TablePersoController can be used to connect a table that you want to providea personalization
    * dialog for, with a persistence service such as one provided bythe unified shell.Accepts an object
    * literal <code>mSettings</code> that defines initialproperty values, aggregated and associated
    * objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general
    * description of the syntax of the settings object.
    * @param sId optional id for the new control; generated automatically if			no non-empty id is given
    * Note: this can be omitted, no matter			whether <code>mSettings</code> will be given or not!
    * @param mSettings optional map/JSON-object with initial settings for the			new component instance
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Activates the controller, i.e. tries to retrieve existing persistedpersonalizations, creates a
    * TablePersoDialog for the associatedtable and attaches a close handler to apply the personalizations
    * tothe table and persist them.This method should be called when the table to be personalized knowsits
    * columns. Usually, this is when that table's view has set its model,which is typically done in the
    * corresponding controller's init method.For example<pre><code> onInit: function () {		// set explored
    * app's demo model on this sample		var oModel = new
    * JSONModel(jQuery.sap.getModulePath("sap.ui.demo.mock", "/products.json"));		var oGroupingModel = new
    * JSONModel({ hasGrouping: false});		this.getView().setModel(oModel);	
    * this.getView().setModel(oGroupingModel, 'Grouping');		// init and activate controller		this._oTPC =
    * new TablePersoController({			table: this.getView().byId("productsTable"),			//specify the first part
    * of persistence ids e.g. 'demoApp-productsTable-dimensionsCol'			componentName: "demoApp",		
    * persoService: DemoPersoService,		}).activate();	}</code></pre>
    * @returns the TablePersoController instance.
    */
  def activate(): TablePersoController = js.native
  /**
    * Adds some table into the association <code>tables</code>.
    * @param vTable the tables to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addTable(vTable: js.Any): TablePersoController = js.native
  def addTable(vTable: Table): TablePersoController = js.native
  /**
    * Applies the personalizations by getting the existing personalizationsand adjusting to the table.
    * @param oTable the table to be personalized.
    */
  def applyPersonalizations(oTable: Table): scala.Unit = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>personalizationsDone</code> event of
    * this <code>sap.m.TablePersoController</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.TablePersoController</code> itself.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.TablePersoController</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPersonalizationsDone(oData: js.Any, fnFunction: js.Any): TablePersoController = js.native
  def attachPersonalizationsDone(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TablePersoController = js.native
  /**
    * Destroys the persoService in the aggregation <code>persoService</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyPersoService(): TablePersoController = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>personalizationsDone</code> event of
    * this <code>sap.m.TablePersoController</code>.The passed function and listener object must match the
    * ones used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPersonalizationsDone(fnFunction: js.Any, oListener: js.Any): TablePersoController = js.native
  /**
    * Do some clean up: remove event delegates, etc
    */
  def exit(): scala.Unit = js.native
  /**
    * Fires event <code>personalizationsDone</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePersonalizationsDone(mArguments: js.Any): TablePersoController = js.native
  /**
    * Gets current value of property <code>componentName</code>.Available options for the text direction
    * are LTR and RTL. By default the control inherits the text direction from its parent control.
    * @returns Value of property <code>componentName</code>
    */
  def getComponentName(): java.lang.String = js.native
  /**
    * Gets current value of property <code>contentHeight</code>.Default value is <code>20rem</code>.
    * @returns Value of property <code>contentHeight</code>
    */
  def getContentHeight(): js.Any = js.native
  /**
    * Gets current value of property <code>contentWidth</code>.
    * @returns Value of property <code>contentWidth</code>
    */
  def getContentWidth(): js.Any = js.native
  /**
    * Gets current value of property <code>hasGrouping</code>.Default value is <code>false</code>.
    * @returns Value of property <code>hasGrouping</code>
    */
  def getHasGrouping(): scala.Boolean = js.native
  /**
    * Gets content of aggregation <code>persoService</code>.
    */
  def getPersoService(): js.Any = js.native
  /**
    * Gets current value of property <code>showResetAll</code>.Default value is <code>true</code>.
    * @returns Value of property <code>showResetAll</code>
    */
  def getShowResetAll(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>showSelectAll</code>.Default value is <code>true</code>.
    * @returns Value of property <code>showSelectAll</code>
    */
  def getShowSelectAll(): scala.Boolean = js.native
  /**
    * ID of the element which is the current target of the association <code>table</code>, or
    * <code>null</code>.
    */
  def getTable(): js.Any = js.native
  /**
    * Returns a  _tablePersoDialog instance if available. It can be NULL ifthe controller has not been
    * activated yet.This function makes a private aggregate publicly accessable. This isnecessary for
    * downward compatibility reasons: in the first versionsof the tablePersoProvider developers still
    * worked with the TablePersoDialogdirectly, which is now not necessary any longer.
    * @returns the TablePersoDialog instance.
    */
  def getTablePersoDialog(): TablePersoDialog = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>tables</code>.
    */
  def getTables(): js.Array[_] = js.native
  /**
    * Initializes the TablePersoController instance after creation.
    */
  def init(): scala.Unit = js.native
  /**
    * Opens the TablePersoDialog, stores the personalized settings on close,modifies the table columns,
    * and sends them to the persistence service
    */
  def openDialog(): scala.Unit = js.native
  /**
    * Refresh the personalizations: reloads the personalization information from the table persoprovider,
    * applies it to the controller's table and updates the controller's table perso dialog.Use case for a
    * 'refresh' call would be that the table which si personalized changed its columnsduring runtime,
    * after personalization has been activated.
    */
  def refresh(): scala.Unit = js.native
  /**
    * Removes all the controls in the association named <code>tables</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllTables(): js.Array[_] = js.native
  def removeTable(vTable: js.Any): js.Any = js.native
  def removeTable(vTable: Table): js.Any = js.native
  /**
    * Removes an table from the association named <code>tables</code>.
    * @param vTable The table to be removed or its index or ID
    * @returns The removed table or <code>null</code>
    */
  def removeTable(vTable: scala.Double): js.Any = js.native
  /**
    * Persist the personalizations
    */
  def savePersonalizations(): scala.Unit = js.native
  /**
    * Using this method, the first part of tablePerso persistence ids can beprovided, in case the table's
    * app does not provide that part itself.If a component name is set using this method, it will be used,
    * regardless ofwhether the table's app has a different component name or not.
    * @param sCompName the new component name.
    * @returns the TablePersoController instance.
    */
  def setComponentName(sCompName: java.lang.String): TablePersoController = js.native
  /**
    * Reflector for the controller's 'contentHeight' property.
    * @param sHeight the new height of the TablePersoDialog.
    * @returns the TablePersoController instance.
    */
  def setContentHeight(sHeight: js.Any): TablePersoController = js.native
  /**
    * Reflector for the controller's 'contentWidth' property.
    * @param sWidth the new width of the tablePersoDialog
    * @returns the TablePersoController instance.
    */
  def setContentWidth(sWidth: js.Any): TablePersoController = js.native
  /**
    * Reflector for the controller's 'hasGrouping' property.
    * @param bHasGrouping is the tablePersoDialog displayed in grouping mode or not.
    * @returns the TablePersoController instance.
    */
  def setHasGrouping(bHasGrouping: scala.Boolean): TablePersoController = js.native
  /**
    * Sets the aggregated <code>persoService</code>.
    * @param oPersoService The persoService to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPersoService(oPersoService: js.Any): TablePersoController = js.native
  /**
    * Reflector for the controller's 'showResetAll' property.
    * @param bShowResetAll is the tablePersoDialog's 'UndoPersonalization' button displayed or not.
    * @returns the TablePersoController instance.
    */
  def setShowResetAll(bShowResetAll: scala.Boolean): TablePersoController = js.native
  /**
    * Reflector for the controller's 'showSelectAll' property.
    * @param bShowSelectAll is the tablePersoDialog's 'Display All' checkbox displayed or not.
    * @returns the TablePersoController instance.
    */
  def setShowSelectAll(bShowSelectAll: scala.Boolean): TablePersoController = js.native
  /**
    * Sets the associated <code>table</code>.
    * @param oTable ID of an element which becomes the new target of this table association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTable(oTable: js.Any): TablePersoController = js.native
  def setTable(oTable: Table): TablePersoController = js.native
}

