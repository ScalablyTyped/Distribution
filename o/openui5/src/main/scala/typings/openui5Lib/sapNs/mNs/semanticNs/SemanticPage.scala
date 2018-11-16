package typings
package openui5Lib.sapNs.mNs.semanticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.semantic.SemanticPage")
@js.native
abstract class SemanticPage protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
           * Constructor for a new SemanticPageAccepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId ID for the new control, generated automatically if no ID is given
           * @param mSettings Initial settings for the new control
          */
  def this(sId: java.lang.String) = this()
  /**
           * Constructor for a new SemanticPageAccepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId ID for the new control, generated automatically if no ID is given
           * @param mSettings Initial settings for the new control
          */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
           * Adds some content to the aggregation <code>content</code>.
           * @param oContent the content to add; if empty, nothing is inserted
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def addContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control): SemanticPage = js.native
  /**
           * Adds some customFooterContent to the aggregation <code>customFooterContent</code>.
           * @param oCustomFooterContent the customFooterContent to add; if empty, nothing is inserted
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def addCustomFooterContent(oCustomFooterContent: openui5Lib.sapNs.mNs.Button): SemanticPage = js.native
  /**
           * Adds some customHeaderContent to the aggregation <code>customHeaderContent</code>.
           * @param oCustomHeaderContent the customHeaderContent to add; if empty, nothing is inserted
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def addCustomHeaderContent(oCustomHeaderContent: openui5Lib.sapNs.mNs.Button): SemanticPage = js.native
  /**
           * Attaches event handler <code>fnFunction</code> to the <code>navButtonPress</code> event of this
           * <code>sap.m.semantic.SemanticPage</code>.When called, the context of the event handler (its
           * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
           * to this <code>sap.m.semantic.SemanticPage</code> itself.See {@link sap.m.Page#navButtonPress}
           * @param oData An application-specific payload object that will be passed to the event handler along
           * with the event object when firing the event
           * @param fnFunction The function to be called when the event occurs
           * @param oListener Context object to call the event handler with. Defaults to this
           * <code>sap.m.semantic.SemanticPage</code> itself
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def attachNavButtonPress(oData: js.Any, fnFunction: js.Any): SemanticPage = js.native
  /**
           * Attaches event handler <code>fnFunction</code> to the <code>navButtonPress</code> event of this
           * <code>sap.m.semantic.SemanticPage</code>.When called, the context of the event handler (its
           * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
           * to this <code>sap.m.semantic.SemanticPage</code> itself.See {@link sap.m.Page#navButtonPress}
           * @param oData An application-specific payload object that will be passed to the event handler along
           * with the event object when firing the event
           * @param fnFunction The function to be called when the event occurs
           * @param oListener Context object to call the event handler with. Defaults to this
           * <code>sap.m.semantic.SemanticPage</code> itself
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def attachNavButtonPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SemanticPage = js.native
  /**
           * Destroys all the content in the aggregation <code>content</code>.
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def destroyContent(): SemanticPage = js.native
  /**
           * Destroys all the customFooterContent in the aggregation <code>customFooterContent</code>.
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def destroyCustomFooterContent(): SemanticPage = js.native
  /**
           * Destroys all the customHeaderContent in the aggregation <code>customHeaderContent</code>.
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def destroyCustomHeaderContent(): SemanticPage = js.native
  /**
           * Destroys the landmarkInfo in the aggregation <code>landmarkInfo</code>.
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def destroyLandmarkInfo(): SemanticPage = js.native
  /**
           * Destroys the subHeader in the aggregation <code>subHeader</code>.
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def destroySubHeader(): SemanticPage = js.native
  /**
           * Detaches event handler <code>fnFunction</code> from the <code>navButtonPress</code> event of this
           * <code>sap.m.semantic.SemanticPage</code>.The passed function and listener object must match the ones
           * used for event registration.
           * @param fnFunction The function to be called, when the event occurs
           * @param oListener Context object on which the given function had to be called
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def detachNavButtonPress(fnFunction: js.Any, oListener: js.Any): SemanticPage = js.native
  /**
           * Fires event <code>navButtonPress</code> to attached listeners.
           * @param mArguments The arguments to pass along with the event
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def fireNavButtonPress(mArguments: js.Any): SemanticPage = js.native
  /**
           * Gets content of aggregation <code>content</code>.See {@link sap.m.Page#content}
          */
  def getContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
           * Gets content of aggregation <code>customFooterContent</code>.Custom footer buttons
          */
  def getCustomFooterContent(): js.Array[openui5Lib.sapNs.mNs.Button] = js.native
  /**
           * Gets content of aggregation <code>customHeaderContent</code>.Custom header buttons
          */
  def getCustomHeaderContent(): js.Array[openui5Lib.sapNs.mNs.Button] = js.native
  /**
           * Gets current value of property <code>enableScrolling</code>.See {@link
           * sap.m.Page#enableScrolling}Default value is <code>true</code>.
           * @returns Value of property <code>enableScrolling</code>
          */
  def getEnableScrolling(): scala.Boolean = js.native
  /**
           * Gets current value of property <code>floatingFooter</code>.Determines whether the floating footer
           * behavior is enabled.If set to <code>true</code>, the content is visible when it's underneath the
           * footer.Default value is <code>false</code>.
           * @since 1.40.1
           * @returns Value of property <code>floatingFooter</code>
          */
  def getFloatingFooter(): scala.Boolean = js.native
  /**
           * Gets content of aggregation <code>landmarkInfo</code>.Accessible landmark settings to be applied to
           * the containers of the <code>sap.m.Page</code> control.If not set, no landmarks will be written.
          */
  def getLandmarkInfo(): openui5Lib.sapNs.mNs.PageAccessibleLandmarkInfo = js.native
  /**
           * Gets current value of property <code>showFooter</code>.Hides or shows the page footerDefault value
           * is <code>true</code>.
           * @returns Value of property <code>showFooter</code>
          */
  def getShowFooter(): scala.Boolean = js.native
  /**
           * Gets current value of property <code>showNavButton</code>.See {@link
           * sap.m.Page#showNavButton}Default value is <code>false</code>.
           * @returns Value of property <code>showNavButton</code>
          */
  def getShowNavButton(): scala.Boolean = js.native
  /**
           * Gets current value of property <code>showSubHeader</code>.See {@link
           * sap.m.Page#showSubHeader}Default value is <code>true</code>.
           * @returns Value of property <code>showSubHeader</code>
          */
  def getShowSubHeader(): scala.Boolean = js.native
  /**
           * Gets content of aggregation <code>subHeader</code>.See {@link sap.m.Page#subHeader}
          */
  def getSubHeader(): openui5Lib.sapNs.mNs.IBar = js.native
  /**
           * Gets current value of property <code>title</code>.See {@link sap.m.Page#title}
           * @returns Value of property <code>title</code>
          */
  def getTitle(): java.lang.String = js.native
  /**
           * Gets current value of property <code>titleLevel</code>.See {@link sap.m.Page#titleLevel}Default
           * value is <code>Auto</code>.
           * @returns Value of property <code>titleLevel</code>
          */
  def getTitleLevel(): openui5Lib.sapNs.uiNs.coreNs.TitleLevel = js.native
  /**
           * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>content</code>.and
           * returns its index if found or -1 otherwise.
           * @param oContent The content whose index is looked for
           * @returns The index of the provided control in the aggregation if found, or -1 otherwise
          */
  def indexOfContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Double = js.native
  /**
           * Checks for the provided <code>sap.m.Button</code> in the aggregation
           * <code>customFooterContent</code>.and returns its index if found or -1 otherwise.
           * @param oCustomFooterContent The customFooterContent whose index is looked for
           * @returns The index of the provided control in the aggregation if found, or -1 otherwise
          */
  def indexOfCustomFooterContent(oCustomFooterContent: openui5Lib.sapNs.mNs.Button): scala.Double = js.native
  /**
           * Checks for the provided <code>sap.m.Button</code> in the aggregation
           * <code>customHeaderContent</code>.and returns its index if found or -1 otherwise.
           * @param oCustomHeaderContent The customHeaderContent whose index is looked for
           * @returns The index of the provided control in the aggregation if found, or -1 otherwise
          */
  def indexOfCustomHeaderContent(oCustomHeaderContent: openui5Lib.sapNs.mNs.Button): scala.Double = js.native
  /**
           * Inserts a content into the aggregation <code>content</code>.
           * @param oContent the content to insert; if empty, nothing is inserted
           * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
           * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
           *  greater than the current size of the aggregation, the content is inserted at             the last
           * position
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def insertContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control, iIndex: scala.Double): SemanticPage = js.native
  /**
           * Inserts a customFooterContent into the aggregation <code>customFooterContent</code>.
           * @param oCustomFooterContent the customFooterContent to insert; if empty, nothing is inserted
           * @param iIndex the <code>0</code>-based index the customFooterContent should be inserted at; for     
           *        a negative value of <code>iIndex</code>, the customFooterContent is inserted at position 0;
           * for a value             greater than the current size of the aggregation, the customFooterContent is
           * inserted at             the last position
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def insertCustomFooterContent(oCustomFooterContent: openui5Lib.sapNs.mNs.Button, iIndex: scala.Double): SemanticPage = js.native
  /**
           * Inserts a customHeaderContent into the aggregation <code>customHeaderContent</code>.
           * @param oCustomHeaderContent the customHeaderContent to insert; if empty, nothing is inserted
           * @param iIndex the <code>0</code>-based index the customHeaderContent should be inserted at; for     
           *        a negative value of <code>iIndex</code>, the customHeaderContent is inserted at position 0;
           * for a value             greater than the current size of the aggregation, the customHeaderContent is
           * inserted at             the last position
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def insertCustomHeaderContent(oCustomHeaderContent: openui5Lib.sapNs.mNs.Button, iIndex: scala.Double): SemanticPage = js.native
  /**
           * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
           * from the hosting UIArea.
           * @returns An array of the removed elements (might be empty)
          */
  def removeAllContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
           * Removes all the controls from the aggregation <code>customFooterContent</code>.Additionally, it
           * unregisters them from the hosting UIArea.
           * @returns An array of the removed elements (might be empty)
          */
  def removeAllCustomFooterContent(): js.Array[openui5Lib.sapNs.mNs.Button] = js.native
  /**
           * Removes all the controls from the aggregation <code>customHeaderContent</code>.Additionally, it
           * unregisters them from the hosting UIArea.
           * @returns An array of the removed elements (might be empty)
          */
  def removeAllCustomHeaderContent(): js.Array[openui5Lib.sapNs.mNs.Button] = js.native
  /**
           * Removes a content from the aggregation <code>content</code>.
           * @param vContent The content to remove or its index or id
           * @returns The removed content or <code>null</code>
          */
  def removeContent(vContent: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
           * Removes a content from the aggregation <code>content</code>.
           * @param vContent The content to remove or its index or id
           * @returns The removed content or <code>null</code>
          */
  def removeContent(vContent: openui5Lib.sapNs.uiNs.coreNs.Control): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
           * Removes a content from the aggregation <code>content</code>.
           * @param vContent The content to remove or its index or id
           * @returns The removed content or <code>null</code>
          */
  def removeContent(vContent: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
           * Removes a customFooterContent from the aggregation <code>customFooterContent</code>.
           * @param vCustomFooterContent The customFooterContent to remove or its index or id
           * @returns The removed customFooterContent or <code>null</code>
          */
  def removeCustomFooterContent(vCustomFooterContent: java.lang.String): openui5Lib.sapNs.mNs.Button = js.native
  /**
           * Removes a customFooterContent from the aggregation <code>customFooterContent</code>.
           * @param vCustomFooterContent The customFooterContent to remove or its index or id
           * @returns The removed customFooterContent or <code>null</code>
          */
  def removeCustomFooterContent(vCustomFooterContent: openui5Lib.sapNs.mNs.Button): openui5Lib.sapNs.mNs.Button = js.native
  /**
           * Removes a customFooterContent from the aggregation <code>customFooterContent</code>.
           * @param vCustomFooterContent The customFooterContent to remove or its index or id
           * @returns The removed customFooterContent or <code>null</code>
          */
  def removeCustomFooterContent(vCustomFooterContent: scala.Double): openui5Lib.sapNs.mNs.Button = js.native
  /**
           * Removes a customHeaderContent from the aggregation <code>customHeaderContent</code>.
           * @param vCustomHeaderContent The customHeaderContent to remove or its index or id
           * @returns The removed customHeaderContent or <code>null</code>
          */
  def removeCustomHeaderContent(vCustomHeaderContent: java.lang.String): openui5Lib.sapNs.mNs.Button = js.native
  /**
           * Removes a customHeaderContent from the aggregation <code>customHeaderContent</code>.
           * @param vCustomHeaderContent The customHeaderContent to remove or its index or id
           * @returns The removed customHeaderContent or <code>null</code>
          */
  def removeCustomHeaderContent(vCustomHeaderContent: openui5Lib.sapNs.mNs.Button): openui5Lib.sapNs.mNs.Button = js.native
  /**
           * Removes a customHeaderContent from the aggregation <code>customHeaderContent</code>.
           * @param vCustomHeaderContent The customHeaderContent to remove or its index or id
           * @returns The removed customHeaderContent or <code>null</code>
          */
  def removeCustomHeaderContent(vCustomHeaderContent: scala.Double): openui5Lib.sapNs.mNs.Button = js.native
  /**
           * Sets a new value for property <code>enableScrolling</code>.See {@link
           * sap.m.Page#enableScrolling}When called with a value of <code>null</code> or <code>undefined</code>,
           * the default value of the property will be restored.Default value is <code>true</code>.
           * @param bEnableScrolling New value for property <code>enableScrolling</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setEnableScrolling(bEnableScrolling: scala.Boolean): SemanticPage = js.native
  /**
           * Sets a new value for property <code>floatingFooter</code>.Determines whether the floating footer
           * behavior is enabled.If set to <code>true</code>, the content is visible when it's underneath the
           * footer.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
           * the property will be restored.Default value is <code>false</code>.
           * @since 1.40.1
           * @param bFloatingFooter New value for property <code>floatingFooter</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setFloatingFooter(bFloatingFooter: scala.Boolean): SemanticPage = js.native
  /**
           * Sets the aggregated <code>landmarkInfo</code>.
           * @param oLandmarkInfo The landmarkInfo to set
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setLandmarkInfo(oLandmarkInfo: openui5Lib.sapNs.mNs.PageAccessibleLandmarkInfo): SemanticPage = js.native
  /**
           * Sets a new value for property <code>showFooter</code>.Hides or shows the page footerWhen called with
           * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
           * restored.Default value is <code>true</code>.
           * @param bShowFooter New value for property <code>showFooter</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setShowFooter(bShowFooter: scala.Boolean): SemanticPage = js.native
  /**
           * Sets a new value for property <code>showNavButton</code>.See {@link sap.m.Page#showNavButton}When
           * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
           * property will be restored.Default value is <code>false</code>.
           * @param bShowNavButton New value for property <code>showNavButton</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setShowNavButton(bShowNavButton: scala.Boolean): SemanticPage = js.native
  /**
           * Sets a new value for property <code>showSubHeader</code>.See {@link sap.m.Page#showSubHeader}When
           * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
           * property will be restored.Default value is <code>true</code>.
           * @param bShowSubHeader New value for property <code>showSubHeader</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setShowSubHeader(bShowSubHeader: scala.Boolean): SemanticPage = js.native
  /**
           * Sets the aggregated <code>subHeader</code>.
           * @param oSubHeader The subHeader to set
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setSubHeader(oSubHeader: openui5Lib.sapNs.mNs.IBar): SemanticPage = js.native
  /**
           * Sets a new value for property <code>title</code>.See {@link sap.m.Page#title}When called with a
           * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
           * restored.
           * @param sTitle New value for property <code>title</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setTitle(sTitle: java.lang.String): SemanticPage = js.native
  /**
           * Sets a new value for property <code>titleLevel</code>.See {@link sap.m.Page#titleLevel}When called
           * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
           * be restored.Default value is <code>Auto</code>.
           * @param sTitleLevel New value for property <code>titleLevel</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setTitleLevel(sTitleLevel: openui5Lib.sapNs.uiNs.coreNs.TitleLevel): SemanticPage = js.native
}

