package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait P13nConditionPanel extends Control {
  /**
    * add a single condition.
    * @since 1.26.0
    * @param oCondition the new condition of type { "key": "007", "operation":
    * sap.m.P13nConditionOperation.Ascending, "keyField":       "keyFieldKey", "value1": "", "value2":
    * ""};
    */
  def addCondition(oCondition: js.Any): Unit = js.native
  /**
    * add a single KeyField
    * @since 1.26.0
    * @param oKeyField {key: "CompanyCode", text: "ID"}
    */
  def addKeyField(oKeyField: js.Any): Unit = js.native
  /**
    * add a single operation
    * @since 1.26.0
    * @param oOperation undefined
    * @param sType defines the type for which this operations will be used.
    */
  def addOperation(oOperation: js.Any, sType: String): Unit = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>dataChange</code> event of this
    * <code>sap.m.P13nConditionPanel</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.P13nConditionPanel</code> itself.Workaround for updating the binding
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.P13nConditionPanel</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachDataChange(oData: js.Any, fnFunction: js.Any): P13nConditionPanel = js.native
  def attachDataChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): P13nConditionPanel = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>dataChange</code> event of this
    * <code>sap.m.P13nConditionPanel</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachDataChange(fnFunction: js.Any, oListener: js.Any): P13nConditionPanel = js.native
  /**
    * Fires event <code>dataChange</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireDataChange(mArguments: js.Any): P13nConditionPanel = js.native
  /**
    * Gets current value of property <code>alwaysShowAddIcon</code>.makes the Add icon visible on each
    * condition row. If is set to false the Add is only visible at the end and you can only append anew
    * condition.Default value is <code>true</code>.
    * @returns Value of property <code>alwaysShowAddIcon</code>
    */
  def getAlwaysShowAddIcon(): Boolean = js.native
  /**
    * Gets current value of property <code>autoAddNewRow</code>.adds initial a new empty condition
    * rowDefault value is <code>false</code>.
    * @returns Value of property <code>autoAddNewRow</code>
    */
  def getAutoAddNewRow(): Boolean = js.native
  /**
    * Gets current value of property <code>autoReduceKeyFieldItems</code>.KeyField value can only be
    * selected once. When you set the property to true the ConditionPanel will automatically offers on
    * theKeyField drop down only the keyFields which are not used. The default behavior is that in each
    * keyField dropdown all keyfields arelisted.Default value is <code>false</code>.
    * @returns Value of property <code>autoReduceKeyFieldItems</code>
    */
  def getAutoReduceKeyFieldItems(): Boolean = js.native
  /**
    * returns array of all defined conditions.
    * @since 1.26.0
    * @returns array of Conditions
    */
  def getConditions(): js.Array[_] = js.native
  /**
    * Gets current value of property <code>containerQuery</code>.defines if the mediaQuery or a
    * ContainerResize will be used for layout update. When the P13nConditionPanel is used on a dialog
    * theproperty should be set to true!Default value is <code>false</code>.
    * @returns Value of property <code>containerQuery</code>
    */
  def getContainerQuery(): Boolean = js.native
  /**
    * Gets current value of property <code>disableFirstRemoveIcon</code>.makes the remove icon on the
    * first condition row disabled when only one condition exist.Default value is <code>false</code>.
    * @returns Value of property <code>disableFirstRemoveIcon</code>
    */
  def getDisableFirstRemoveIcon(): Boolean = js.native
  /**
    * Gets current value of property <code>displayFormat</code>.This represents the displayFormat of the
    * condition Values. With the value "UpperCase" the entered value of the condition will beconverted to
    * upperCase.
    * @returns Value of property <code>displayFormat</code>
    */
  def getDisplayFormat(): String = js.native
  /**
    * Gets current value of property <code>exclude</code>.exclude options for filterDefault value is
    * <code>false</code>.
    * @returns Value of property <code>exclude</code>
    */
  def getExclude(): Boolean = js.native
  /**
    * getter for KeyFields array
    * @since 1.26.0
    * @returns array of KeyFields [{key: "CompanyCode", text: "ID"}, {key:"CompanyName", text : "Name"}]
    */
  def getKeyFields(): js.Array[_] = js.native
  /**
    * Gets current value of property <code>layoutMode</code>.can be used to control the layout behavior.
    * Default is "" which will automatically change the layout. With "Desktop", "Table"or"Phone" you can
    * set a fixed layout.
    * @returns Value of property <code>layoutMode</code>
    */
  def getLayoutMode(): String = js.native
  /**
    * Gets current value of property <code>maxConditions</code>.defines the max number of conditions on
    * the ConditionPanelDefault value is <code>-1</code>.
    * @returns Value of property <code>maxConditions</code>
    */
  def getMaxConditions(): String = js.native
  /**
    * returns the default array of operations
    * @since 1.26.0
    * @param sType defines the type for which the operations should be returned.
    * @returns array of operations
    */
  def getOperations(sType: String): js.Array[_] = js.native
  /**
    * Gets current value of property <code>showLabel</code>.show additional labels in the conditionDefault
    * value is <code>false</code>.
    * @returns Value of property <code>showLabel</code>
    */
  def getShowLabel(): Boolean = js.native
  /**
    * Gets current value of property <code>usePrevConditionSetting</code>.new added condition use the
    * settings from the previous condition as default.Default value is <code>true</code>.
    * @returns Value of property <code>usePrevConditionSetting</code>
    */
  def getUsePrevConditionSetting(): Boolean = js.native
  /**
    * Gets current value of property <code>validationExecutor</code>.Calls the validation listener tbd...
    * @returns Value of property <code>validationExecutor</code>
    */
  def getValidationExecutor(): js.Any = js.native
  /**
    * insert a single condition.
    * @since 1.26.0
    * @param oCondition the new condition of type { "key": "007", "operation":
    * sap.m.P13nConditionOperation.Ascending, "keyField":       "keyFieldKey", "value1": "", "value2":
    * ""};
    * @param index of the new condition
    */
  def insertCondition(oCondition: js.Any, index: Double): Unit = js.native
  /**
    * remove all conditions.
    * @since 1.26.0
    */
  def removeAllConditions(): Unit = js.native
  /**
    * removes all KeyFields
    * @since 1.26.0
    */
  def removeAllKeyFields(): Unit = js.native
  /**
    * remove all operations
    * @since 1.26.0
    * @param sType defines the type for which all operations should be removed
    */
  def removeAllOperations(sType: String): Unit = js.native
  /**
    * remove a single condition.
    * @since 1.26.0
    * @param vCondition is the condition which should be removed. can be either a string with the key of
    * the condition of the condition       object itself.
    */
  def removeCondition(vCondition: js.Any): Unit = js.native
  /**
    * removes all invalid conditions.
    * @since 1.28.0
    */
  def removeInvalidConditions(): Unit = js.native
  /**
    * removes all errors/warning states from the value1/2 fields of all conditions.
    * @since 1.28.0
    */
  def removeValidationErrors(): Unit = js.native
  /**
    * Sets a new value for property <code>autoAddNewRow</code>.adds initial a new empty condition rowWhen
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>false</code>.
    * @param bAutoAddNewRow New value for property <code>autoAddNewRow</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAutoAddNewRow(bAutoAddNewRow: Boolean): P13nConditionPanel = js.native
  /**
    * Sets a new value for property <code>autoReduceKeyFieldItems</code>.KeyField value can only be
    * selected once. When you set the property to true the ConditionPanel will automatically offers on
    * theKeyField drop down only the keyFields which are not used. The default behavior is that in each
    * keyField dropdown all keyfields arelisted.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @param bAutoReduceKeyFieldItems New value for property <code>autoReduceKeyFieldItems</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAutoReduceKeyFieldItems(bAutoReduceKeyFieldItems: Boolean): P13nConditionPanel = js.native
  /**
    * This method must be used to assign a list of conditions.
    * @since 1.26.0
    * @param aConditions array of Conditions.
    */
  def setConditions(aConditions: js.Array[_]): Unit = js.native
  /**
    * Sets a new value for property <code>disableFirstRemoveIcon</code>.makes the remove icon on the first
    * condition row disabled when only one condition exist.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @param bDisableFirstRemoveIcon New value for property <code>disableFirstRemoveIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDisableFirstRemoveIcon(bDisableFirstRemoveIcon: Boolean): P13nConditionPanel = js.native
  /**
    * Sets a new value for property <code>displayFormat</code>.This represents the displayFormat of the
    * condition Values. With the value "UpperCase" the entered value of the condition will beconverted to
    * upperCase.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sDisplayFormat New value for property <code>displayFormat</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDisplayFormat(sDisplayFormat: String): P13nConditionPanel = js.native
  /**
    * Sets a new value for property <code>exclude</code>.exclude options for filterWhen called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bExclude New value for property <code>exclude</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setExclude(bExclude: Boolean): P13nConditionPanel = js.native
  /**
    * This method allows you to specify the KeyFields for the conditions. You can set an array of object
    * with Key and Text properties to define thekeyfields.
    * @since 1.26.0
    * @param aKeyFields array of KeyFields [{key: "CompanyCode", text: "ID"}, {key:"CompanyName", text :
    * "Name"}]
    */
  def setKeyFields(aKeyFields: js.Array[_]): Unit = js.native
  /**
    * Sets a new value for property <code>maxConditions</code>.defines the max number of conditions on the
    * ConditionPanelWhen called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>-1</code>.
    * @param sMaxConditions New value for property <code>maxConditions</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxConditions(sMaxConditions: String): P13nConditionPanel = js.native
  /**
    * setter for the supported operations which we show per condition row. This array of "default"
    * operations will only be used when we do not haveon the keyfield itself some specific operations and
    * a keyfield is of not of type date or numeric.
    * @since 1.26.0
    * @param aOperations array of operations [sap.m.P13nConditionOperation.BT,
    * sap.m.P13nConditionOperation.EQ]
    * @param sType defines the type for which this operations will be used. is sType is not defined the
    * operations will be used as default       operations.
    */
  def setOperations(aOperations: js.Array[_], sType: String): Unit = js.native
  /**
    * Sets a new value for property <code>showLabel</code>.show additional labels in the conditionWhen
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>false</code>.
    * @param bShowLabel New value for property <code>showLabel</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowLabel(bShowLabel: Boolean): P13nConditionPanel = js.native
  /**
    * Sets a new value for property <code>usePrevConditionSetting</code>.new added condition use the
    * settings from the previous condition as default.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bUsePrevConditionSetting New value for property <code>usePrevConditionSetting</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUsePrevConditionSetting(bUsePrevConditionSetting: Boolean): P13nConditionPanel = js.native
  /**
    * Sets a new value for property <code>validationExecutor</code>.Calls the validation listener
    * tbd...When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param oValidationExecutor New value for property <code>validationExecutor</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValidationExecutor(oValidationExecutor: js.Any): P13nConditionPanel = js.native
}

