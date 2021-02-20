package typings.openui5.sap.ui.unified

import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shell extends ShellLayout {
  
  /**
    * Adds some curtainContent to the aggregation <code>curtainContent</code>.
    * @param oCurtainContent the curtainContent to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addCurtainContent(oCurtainContent: Control): Shell = js.native
  
  /**
    * Adds some curtainPaneContent to the aggregation <code>curtainPaneContent</code>.
    * @param oCurtainPaneContent the curtainPaneContent to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addCurtainPaneContent(oCurtainPaneContent: Control): Shell = js.native
  
  /**
    * Adds some headEndItem to the aggregation <code>headEndItems</code>.
    * @param oHeadEndItem the headEndItem to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addHeadEndItem(oHeadEndItem: ShellHeadItem): Shell = js.native
  
  /**
    * Adds some headItem to the aggregation <code>headItems</code>.
    * @param oHeadItem the headItem to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addHeadItem(oHeadItem: ShellHeadItem): Shell = js.native
  
  /**
    * Destroys all the curtainContent in the aggregation <code>curtainContent</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyCurtainContent(): Shell = js.native
  
  /**
    * Destroys all the curtainPaneContent in the aggregation <code>curtainPaneContent</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyCurtainPaneContent(): Shell = js.native
  
  /**
    * Destroys all the headEndItems in the aggregation <code>headEndItems</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyHeadEndItems(): Shell = js.native
  
  /**
    * Destroys all the headItems in the aggregation <code>headItems</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyHeadItems(): Shell = js.native
  
  /**
    * Destroys the search in the aggregation <code>search</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySearch(): Shell = js.native
  
  /**
    * Destroys the user in the aggregation <code>user</code>.
    * @since 1.22.0
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyUser(): Shell = js.native
  
  /**
    * Gets content of aggregation <code>curtainContent</code>.The content to appear in the curtain area.
    */
  def getCurtainContent(): js.Array[Control] = js.native
  
  /**
    * Gets content of aggregation <code>curtainPaneContent</code>.The content to appear in the pane area
    * of the curtain.
    */
  def getCurtainPaneContent(): js.Array[Control] = js.native
  
  /**
    * Gets content of aggregation <code>headEndItems</code>.The buttons shown in the end (right in
    * left-to-right case) of the Shell header. Currently max. 3 visible buttons are supported (when user
    * is set only 1). If a custom header is set this aggregation has no effect.
    */
  def getHeadEndItems(): js.Array[ShellHeadItem] = js.native
  
  /**
    * Gets content of aggregation <code>headItems</code>.The buttons shown in the begin (left in
    * left-to-right case) of the Shell header. Currently max. 3 visible buttons are supported. If a custom
    * header is set this aggregation has no effect.
    */
  def getHeadItems(): js.Array[ShellHeadItem] = js.native
  
  /**
    * Gets current value of property <code>icon</code>.The application icon. If a custom header is set
    * this property has no effect.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  
  /**
    * Gets content of aggregation <code>search</code>.Experimental (This aggregation might change in
    * future!): The search control which should be displayed in the shell header. If a custom header is
    * set this aggregation has no effect.
    */
  def getSearch(): Control = js.native
  
  /**
    * Gets current value of property <code>searchVisible</code>.If set to false, the search area
    * (aggregation 'search') is hidden. If a custom header is set this property has no effect.Default
    * value is <code>true</code>.
    * @since 1.18
    * @returns Value of property <code>searchVisible</code>
    */
  def getSearchVisible(): Boolean = js.native
  
  /**
    * Gets current value of property <code>showCurtain</code>.Shows / Hides the curtain.
    * @returns Value of property <code>showCurtain</code>
    */
  def getShowCurtain(): Boolean = js.native
  
  /**
    * Gets current value of property <code>showCurtainPane</code>.Shows / Hides the side pane on the
    * curtain.
    * @returns Value of property <code>showCurtainPane</code>
    */
  def getShowCurtainPane(): Boolean = js.native
  
  /**
    * Gets content of aggregation <code>user</code>.The user item which is rendered in the shell header
    * beside the items. If a custom header is set this aggregation has no effect.
    * @since 1.22.0
    */
  def getUser(): ShellHeadUserItem = js.native
  
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>curtainContent</code>.and returns its index if found or -1 otherwise.
    * @param oCurtainContent The curtainContent whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfCurtainContent(oCurtainContent: Control): Double = js.native
  
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>curtainPaneContent</code>.and returns its index if found or -1 otherwise.
    * @param oCurtainPaneContent The curtainPaneContent whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfCurtainPaneContent(oCurtainPaneContent: Control): Double = js.native
  
  /**
    * Checks for the provided <code>sap.ui.unified.ShellHeadItem</code> in the aggregation
    * <code>headEndItems</code>.and returns its index if found or -1 otherwise.
    * @param oHeadEndItem The headEndItem whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfHeadEndItem(oHeadEndItem: ShellHeadItem): Double = js.native
  
  /**
    * Checks for the provided <code>sap.ui.unified.ShellHeadItem</code> in the aggregation
    * <code>headItems</code>.and returns its index if found or -1 otherwise.
    * @param oHeadItem The headItem whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfHeadItem(oHeadItem: ShellHeadItem): Double = js.native
  
  /**
    * Inserts a curtainContent into the aggregation <code>curtainContent</code>.
    * @param oCurtainContent the curtainContent to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the curtainContent should be inserted at; for          
    *   a negative value of <code>iIndex</code>, the curtainContent is inserted at position 0; for a value
    *             greater than the current size of the aggregation, the curtainContent is inserted at     
    *        the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertCurtainContent(oCurtainContent: Control, iIndex: Double): Shell = js.native
  
  /**
    * Inserts a curtainPaneContent into the aggregation <code>curtainPaneContent</code>.
    * @param oCurtainPaneContent the curtainPaneContent to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the curtainPaneContent should be inserted at; for      
    *       a negative value of <code>iIndex</code>, the curtainPaneContent is inserted at position 0; for
    * a value             greater than the current size of the aggregation, the curtainPaneContent is
    * inserted at             the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertCurtainPaneContent(oCurtainPaneContent: Control, iIndex: Double): Shell = js.native
  
  /**
    * Inserts a headEndItem into the aggregation <code>headEndItems</code>.
    * @param oHeadEndItem the headEndItem to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the headEndItem should be inserted at; for            
    * a negative value of <code>iIndex</code>, the headEndItem is inserted at position 0; for a value     
    *        greater than the current size of the aggregation, the headEndItem is inserted at            
    * the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertHeadEndItem(oHeadEndItem: ShellHeadItem, iIndex: Double): Shell = js.native
  
  /**
    * Inserts a headItem into the aggregation <code>headItems</code>.
    * @param oHeadItem the headItem to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the headItem should be inserted at; for             a
    * negative value of <code>iIndex</code>, the headItem is inserted at position 0; for a value          
    *   greater than the current size of the aggregation, the headItem is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertHeadItem(oHeadItem: ShellHeadItem, iIndex: Double): Shell = js.native
  
  /**
    * Removes all the controls from the aggregation <code>curtainContent</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllCurtainContent(): js.Array[Control] = js.native
  
  /**
    * Removes all the controls from the aggregation <code>curtainPaneContent</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllCurtainPaneContent(): js.Array[Control] = js.native
  
  /**
    * Removes all the controls from the aggregation <code>headEndItems</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllHeadEndItems(): js.Array[ShellHeadItem] = js.native
  
  /**
    * Removes all the controls from the aggregation <code>headItems</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllHeadItems(): js.Array[ShellHeadItem] = js.native
  
  def removeCurtainContent(vCurtainContent: String): Control = js.native
  /**
    * Removes a curtainContent from the aggregation <code>curtainContent</code>.
    * @param vCurtainContent The curtainContent to remove or its index or id
    * @returns The removed curtainContent or <code>null</code>
    */
  def removeCurtainContent(vCurtainContent: Double): Control = js.native
  def removeCurtainContent(vCurtainContent: Control): Control = js.native
  
  def removeCurtainPaneContent(vCurtainPaneContent: String): Control = js.native
  /**
    * Removes a curtainPaneContent from the aggregation <code>curtainPaneContent</code>.
    * @param vCurtainPaneContent The curtainPaneContent to remove or its index or id
    * @returns The removed curtainPaneContent or <code>null</code>
    */
  def removeCurtainPaneContent(vCurtainPaneContent: Double): Control = js.native
  def removeCurtainPaneContent(vCurtainPaneContent: Control): Control = js.native
  
  def removeHeadEndItem(vHeadEndItem: String): ShellHeadItem = js.native
  /**
    * Removes a headEndItem from the aggregation <code>headEndItems</code>.
    * @param vHeadEndItem The headEndItem to remove or its index or id
    * @returns The removed headEndItem or <code>null</code>
    */
  def removeHeadEndItem(vHeadEndItem: Double): ShellHeadItem = js.native
  def removeHeadEndItem(vHeadEndItem: ShellHeadItem): ShellHeadItem = js.native
  
  def removeHeadItem(vHeadItem: String): ShellHeadItem = js.native
  /**
    * Removes a headItem from the aggregation <code>headItems</code>.
    * @param vHeadItem The headItem to remove or its index or id
    * @returns The removed headItem or <code>null</code>
    */
  def removeHeadItem(vHeadItem: Double): ShellHeadItem = js.native
  def removeHeadItem(vHeadItem: ShellHeadItem): ShellHeadItem = js.native
  
  /**
    * Sets a new value for property <code>icon</code>.The application icon. If a custom header is set this
    * property has no effect.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): Shell = js.native
  
  /**
    * Sets the aggregated <code>search</code>.
    * @param oSearch The search to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSearch(oSearch: Control): Shell = js.native
  
  /**
    * Sets a new value for property <code>searchVisible</code>.If set to false, the search area
    * (aggregation 'search') is hidden. If a custom header is set this property has no effect.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>true</code>.
    * @since 1.18
    * @param bSearchVisible New value for property <code>searchVisible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSearchVisible(bSearchVisible: Boolean): Shell = js.native
  
  /**
    * Sets a new value for property <code>showCurtain</code>.Shows / Hides the curtain.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param bShowCurtain New value for property <code>showCurtain</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowCurtain(bShowCurtain: Boolean): Shell = js.native
  
  /**
    * Sets a new value for property <code>showCurtainPane</code>.Shows / Hides the side pane on the
    * curtain.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param bShowCurtainPane New value for property <code>showCurtainPane</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowCurtainPane(bShowCurtainPane: Boolean): Shell = js.native
  
  /**
    * Sets the aggregated <code>user</code>.
    * @since 1.22.0
    * @param oUser The user to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUser(oUser: ShellHeadUserItem): Shell = js.native
}
