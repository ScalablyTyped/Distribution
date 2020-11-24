package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickViewPage extends Control {
  
  /**
    * Adds some group to the aggregation <code>groups</code>.
    * @param oGroup the group to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addGroup(oGroup: QuickViewGroup): QuickViewPage = js.native
  
  /**
    * Binds aggregation <code>groups</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindGroups(oBindingInfo: js.Any): QuickViewPage = js.native
  
  /**
    * Destroys all the groups in the aggregation <code>groups</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyGroups(): QuickViewPage = js.native
  
  /**
    * Gets current value of property <code>crossAppNavCallback</code>.Specifies the application which
    * provides target and param configuration  for cross-application navigation from the 'page header'.
    * @returns Value of property <code>crossAppNavCallback</code>
    */
  def getCrossAppNavCallback(): js.Any = js.native
  
  /**
    * Gets current value of property <code>description</code>.Specifies the text displayed under the
    * header of the content sectionDefault value is <code></code>.
    * @returns Value of property <code>description</code>
    */
  def getDescription(): String = js.native
  
  /**
    * Gets content of aggregation <code>groups</code>.QuickViewGroup consists of a title (optional) and an
    * entity of group elements.
    */
  def getGroups(): js.Array[QuickViewGroup] = js.native
  
  /**
    * Gets current value of property <code>header</code>.Specifies the text displayed in the header of the
    * control.Default value is <code></code>.
    * @returns Value of property <code>header</code>
    */
  def getHeader(): String = js.native
  
  /**
    * Gets current value of property <code>icon</code>.Specifies the URL of the icon displayed under the
    * header of the pageDefault value is <code></code>.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): String = js.native
  
  /**
    * Gets current value of property <code>pageId</code>.Page idDefault value is <code></code>.
    * @returns Value of property <code>pageId</code>
    */
  def getPageId(): String = js.native
  
  /**
    * Gets current value of property <code>title</code>.Specifies the text displayed in the header of the
    * content section of the control.Default value is <code></code>.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  
  /**
    * Gets current value of property <code>titleUrl</code>.Specifies the URL which opens when the title or
    * the thumbnail is clicked.Default value is <code></code>.
    * @returns Value of property <code>titleUrl</code>
    */
  def getTitleUrl(): String = js.native
  
  /**
    * Checks for the provided <code>sap.m.QuickViewGroup</code> in the aggregation <code>groups</code>.and
    * returns its index if found or -1 otherwise.
    * @param oGroup The group whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfGroup(oGroup: QuickViewGroup): Double = js.native
  
  /**
    * Inserts a group into the aggregation <code>groups</code>.
    * @param oGroup the group to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the group should be inserted at; for             a
    * negative value of <code>iIndex</code>, the group is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the group is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertGroup(oGroup: QuickViewGroup, iIndex: Double): QuickViewPage = js.native
  
  /**
    * Removes all the controls from the aggregation <code>groups</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllGroups(): js.Array[QuickViewGroup] = js.native
  
  def removeGroup(vGroup: String): QuickViewGroup = js.native
  /**
    * Removes a group from the aggregation <code>groups</code>.
    * @param vGroup The group to remove or its index or id
    * @returns The removed group or <code>null</code>
    */
  def removeGroup(vGroup: Double): QuickViewGroup = js.native
  def removeGroup(vGroup: QuickViewGroup): QuickViewGroup = js.native
  
  /**
    * Sets a new value for property <code>crossAppNavCallback</code>.Specifies the application which
    * provides target and param configuration  for cross-application navigation from the 'page
    * header'.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param oCrossAppNavCallback New value for property <code>crossAppNavCallback</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCrossAppNavCallback(oCrossAppNavCallback: js.Any): QuickViewPage = js.native
  
  /**
    * Sets a new value for property <code>description</code>.Specifies the text displayed under the header
    * of the content sectionWhen called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code></code>.
    * @param sDescription New value for property <code>description</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDescription(sDescription: String): QuickViewPage = js.native
  
  /**
    * Sets a new value for property <code>header</code>.Specifies the text displayed in the header of the
    * control.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code></code>.
    * @param sHeader New value for property <code>header</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeader(sHeader: String): QuickViewPage = js.native
  
  /**
    * Sets a new value for property <code>icon</code>.Specifies the URL of the icon displayed under the
    * header of the pageWhen called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code></code>.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: String): QuickViewPage = js.native
  
  /**
    * Sets a new value for property <code>pageId</code>.Page idWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sPageId New value for property <code>pageId</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPageId(sPageId: String): QuickViewPage = js.native
  
  /**
    * Sets a new value for property <code>title</code>.Specifies the text displayed in the header of the
    * content section of the control.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code></code>.
    * @param sTitle New value for property <code>title</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(sTitle: String): QuickViewPage = js.native
  
  /**
    * Sets a new value for property <code>titleUrl</code>.Specifies the URL which opens when the title or
    * the thumbnail is clicked.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code></code>.
    * @param sTitleUrl New value for property <code>titleUrl</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitleUrl(sTitleUrl: String): QuickViewPage = js.native
  
  /**
    * Unbinds aggregation <code>groups</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindGroups(): QuickViewPage = js.native
}
