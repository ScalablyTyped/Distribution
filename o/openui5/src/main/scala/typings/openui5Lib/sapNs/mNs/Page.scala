package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.Page")
@js.native
class Page protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
         * Constructor for a new Page.Accepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId id for the new control, generated automatically if no id is given
         * @param mSettings initial settings for the new control
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new Page.Accepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId id for the new control, generated automatically if no id is given
         * @param mSettings initial settings for the new control
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Adds some content to the aggregation <code>content</code>.
         * @param oContent the content to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control): Page = js.native
  /**
         * Adds some headerContent to the aggregation <code>headerContent</code>.
         * @param oHeaderContent the headerContent to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addHeaderContent(oHeaderContent: openui5Lib.sapNs.uiNs.coreNs.Control): Page = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>navButtonPress</code> event of this
         * <code>sap.m.Page</code>.When called, the context of the event handler (its <code>this</code>) will
         * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
         * <code>sap.m.Page</code> itself.this event is fired when Nav Button is pressed
         * @since 1.12.2
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.Page</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachNavButtonPress(oData: js.Any, fnFunction: js.Any): Page = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>navButtonPress</code> event of this
         * <code>sap.m.Page</code>.When called, the context of the event handler (its <code>this</code>) will
         * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
         * <code>sap.m.Page</code> itself.this event is fired when Nav Button is pressed
         * @since 1.12.2
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.Page</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachNavButtonPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Page = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>navButtonTap</code> event of this
         * <code>sap.m.Page</code>.When called, the context of the event handler (its <code>this</code>) will
         * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
         * <code>sap.m.Page</code> itself.this event is fired when Nav Button is tapped
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.Page</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachNavButtonTap(oData: js.Any, fnFunction: js.Any): Page = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>navButtonTap</code> event of this
         * <code>sap.m.Page</code>.When called, the context of the event handler (its <code>this</code>) will
         * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
         * <code>sap.m.Page</code> itself.this event is fired when Nav Button is tapped
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.Page</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachNavButtonTap(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Page = js.native
  /**
         * Destroys all the content in the aggregation <code>content</code>.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyContent(): Page = js.native
  /**
         * Destroys the customHeader in the aggregation <code>customHeader</code>.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyCustomHeader(): Page = js.native
  /**
         * Destroys the footer in the aggregation <code>footer</code>.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyFooter(): Page = js.native
  /**
         * Destroys all the headerContent in the aggregation <code>headerContent</code>.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyHeaderContent(): Page = js.native
  /**
         * Destroys the landmarkInfo in the aggregation <code>landmarkInfo</code>.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyLandmarkInfo(): Page = js.native
  /**
         * Destroys the subHeader in the aggregation <code>subHeader</code>.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroySubHeader(): Page = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>navButtonPress</code> event of this
         * <code>sap.m.Page</code>.The passed function and listener object must match the ones used for event
         * registration.
         * @since 1.12.2
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachNavButtonPress(fnFunction: js.Any, oListener: js.Any): Page = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>navButtonTap</code> event of this
         * <code>sap.m.Page</code>.The passed function and listener object must match the ones used for event
         * registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachNavButtonTap(fnFunction: js.Any, oListener: js.Any): Page = js.native
  /**
         * Fires event <code>navButtonPress</code> to attached listeners.
         * @since 1.12.2
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireNavButtonPress(mArguments: js.Any): Page = js.native
  /**
         * Fires event <code>navButtonTap</code> to attached listeners.
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireNavButtonTap(mArguments: js.Any): Page = js.native
  /**
         * Gets current value of property <code>backgroundDesign</code>.This property is used to set the
         * background color of a page. When a list is placed inside a page, the value "List" should be used to
         * display a gray background. "Standard", with the value white, is used as default if not
         * specified.Default value is <code>Standard</code>.
         * @returns Value of property <code>backgroundDesign</code>
        */
  def getBackgroundDesign(): PageBackgroundDesign = js.native
  /**
         * Gets content of aggregation <code>content</code>.The content of this page
        */
  def getContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
         * Gets current value of property <code>contentOnlyBusy</code>.Decides which area is covered by the
         * local BusyIndicator when <code>page.setBusy()</code> is called. By default the entire page is
         * covered, including headers and footer. When this property is set to "true", only the content area is
         * covered (not header/sub header and footer), which is useful e.g. when there is a SearchField in the
         * sub header and live search continuously updates the content area while the user is still able to
         * type.Default value is <code>false</code>.
         * @since 1.29.0
         * @returns Value of property <code>contentOnlyBusy</code>
        */
  def getContentOnlyBusy(): scala.Boolean = js.native
  /**
         * Gets content of aggregation <code>customHeader</code>.The (optional) custom header of this page.Use
         * this aggregation only when a custom header is constructed where the default header consisting of
         * title text + nav button is not sufficient.If this aggregation is set, the simple properties "title",
         * "showNavButton", "NavButtonText" and "icon" are not used.
        */
  def getCustomHeader(): IBar = js.native
  /**
         * Gets current value of property <code>enableScrolling</code>.Enable vertical scrolling of page
         * contents. Page headers and footers are fixed and do not scroll.If set to false, there will be no
         * scrolling at all.The Page only allows vertical scrolling because horizontal scrolling is discouraged
         * in general for full-page content. If it still needs to be achieved, disable the Page scrolling and
         * use a ScrollContainer as full-page content of the Page. This allows you to freely configure
         * scrolling. It can also be used to create horizontally-scrolling sub-areas of (vertically-scrolling)
         * Pages.Default value is <code>true</code>.
         * @returns Value of property <code>enableScrolling</code>
        */
  def getEnableScrolling(): scala.Boolean = js.native
  /**
         * Gets current value of property <code>floatingFooter</code>.Decides whether the floating footer
         * behavior should be enabled.When the floating footer behavior is used, the content is visible when
         * it's underneath the footer.Default value is <code>false</code>.
         * @returns Value of property <code>floatingFooter</code>
        */
  def getFloatingFooter(): scala.Boolean = js.native
  /**
         * Gets content of aggregation <code>footer</code>.The (optional) footer of this page. It is always
         * located at the bottom of the page
        */
  def getFooter(): IBar = js.native
  /**
         * Gets content of aggregation <code>headerContent</code>.Controls to be added to the right side of the
         * page header. Usually an application would use Button controls and limit the number to one when the
         * application needs to run on smartphones. There is no automatic overflow handling when the space is
         * insufficient.When a customHeader is used, this aggregation will be ignored.
        */
  def getHeaderContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
         * Gets current value of property <code>icon</code>.the icon that is rendered in the page header bar in
         * non-iOS phone/tablet platforms. This property is theme-dependent and only has an effect in the MVI
         * theme.
         * @returns Value of property <code>icon</code>
        */
  def getIcon(): js.Any = js.native
  /**
         * Gets content of aggregation <code>landmarkInfo</code>.Accessible landmark settings to be applied on
         * the containers of the <code>sap.m.Page</code> control.If not set, no landmarks will be written.
        */
  def getLandmarkInfo(): PageAccessibleLandmarkInfo = js.native
  /**
         * Gets current value of property <code>navButtonText</code>.The text of the nav button when running in
         * iOS (if shown) in case it deviates from the default, which is "Back". This property is
         * mvi-theme-dependent and will not have any effect in other themes.
         * @returns Value of property <code>navButtonText</code>
        */
  def getNavButtonText(): java.lang.String = js.native
  /**
         * Gets current value of property <code>navButtonTooltip</code>.The tooltip of the nav buttonSince
         * version 1.34
         * @returns Value of property <code>navButtonTooltip</code>
        */
  def getNavButtonTooltip(): java.lang.String = js.native
  /**
         * Gets current value of property <code>navButtonType</code>.This property is used to set the
         * appearance of the NavButton. By default when showNavButton is set to true, a back button will be
         * shown in iOS and an up button in other platforms. In case you want to show a normal button in the
         * left header area, you can set the value to "Default".Default value is <code>Back</code>.
         * @since 1.12
         * @returns Value of property <code>navButtonType</code>
        */
  def getNavButtonType(): ButtonType = js.native
  /**
         * Gets current value of property <code>showFooter</code>.Whether this page shall have a footerDefault
         * value is <code>true</code>.
         * @since 1.13.1
         * @returns Value of property <code>showFooter</code>
        */
  def getShowFooter(): scala.Boolean = js.native
  /**
         * Gets current value of property <code>showHeader</code>.Whether this page shall have a header.If set
         * to true, either the control under the "customHeader" aggregation is used, or if there is no such
         * control, a Header control is constructed from the properties "title", "showNavButton",
         * "navButtonText" and "icon" depending on the platform.Default value is <code>true</code>.
         * @returns Value of property <code>showHeader</code>
        */
  def getShowHeader(): scala.Boolean = js.native
  /**
         * Gets current value of property <code>showNavButton</code>.A nav button will be rendered on the left
         * area of header bar if this property is set to true.Default value is <code>false</code>.
         * @returns Value of property <code>showNavButton</code>
        */
  def getShowNavButton(): scala.Boolean = js.native
  /**
         * Gets current value of property <code>showSubHeader</code>.Whether this page shall show the
         * subheader.Default value is <code>true</code>.
         * @since 1.28
         * @returns Value of property <code>showSubHeader</code>
        */
  def getShowSubHeader(): scala.Boolean = js.native
  /**
         * Gets content of aggregation <code>subHeader</code>.a subHeader will be rendered directly under the
         * header
        */
  def getSubHeader(): IBar = js.native
  /**
         * Gets current value of property <code>title</code>.The title text appearing in the page header bar.
         * @returns Value of property <code>title</code>
        */
  def getTitle(): java.lang.String = js.native
  /**
         * Gets current value of property <code>titleLevel</code>.Defines the semantic level of the title.
         * Using "Auto" no explicit level information is written.Used for accessibility purposes only.Default
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
         * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
         * <code>headerContent</code>.and returns its index if found or -1 otherwise.
         * @param oHeaderContent The headerContent whose index is looked for
         * @returns The index of the provided control in the aggregation if found, or -1 otherwise
        */
  def indexOfHeaderContent(oHeaderContent: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Double = js.native
  /**
         * Inserts a content into the aggregation <code>content</code>.
         * @param oContent the content to insert; if empty, nothing is inserted
         * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
         * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
         *  greater than the current size of the aggregation, the content is inserted at             the last
         * position
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def insertContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control, iIndex: scala.Double): Page = js.native
  /**
         * Inserts a headerContent into the aggregation <code>headerContent</code>.
         * @param oHeaderContent the headerContent to insert; if empty, nothing is inserted
         * @param iIndex the <code>0</code>-based index the headerContent should be inserted at; for           
         *  a negative value of <code>iIndex</code>, the headerContent is inserted at position 0; for a value  
         *           greater than the current size of the aggregation, the headerContent is inserted at        
         *     the last position
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def insertHeaderContent(oHeaderContent: openui5Lib.sapNs.uiNs.coreNs.Control, iIndex: scala.Double): Page = js.native
  /**
         * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
         * from the hosting UIArea.
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
         * Removes all the controls from the aggregation <code>headerContent</code>.Additionally, it
         * unregisters them from the hosting UIArea.
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllHeaderContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
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
         * Removes a headerContent from the aggregation <code>headerContent</code>.
         * @param vHeaderContent The headerContent to remove or its index or id
         * @returns The removed headerContent or <code>null</code>
        */
  def removeHeaderContent(vHeaderContent: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
         * Removes a headerContent from the aggregation <code>headerContent</code>.
         * @param vHeaderContent The headerContent to remove or its index or id
         * @returns The removed headerContent or <code>null</code>
        */
  def removeHeaderContent(vHeaderContent: openui5Lib.sapNs.uiNs.coreNs.Control): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
         * Removes a headerContent from the aggregation <code>headerContent</code>.
         * @param vHeaderContent The headerContent to remove or its index or id
         * @returns The removed headerContent or <code>null</code>
        */
  def removeHeaderContent(vHeaderContent: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
         * Scrolls to the given position. Only available if enableScrolling is set to "true".
         * @param y The vertical pixel position to scroll to. Scrolling down happens with positive values.
         * @param time The duration of animated scrolling. To scroll immediately without animation, give 0 as
         * value. 0 is also the default value, when this optional parameter is omitted.
        */
  def scrollTo(y: scala.Double, time: scala.Double): Page = js.native
  /**
         * Scrolls to an element(DOM or sap.ui.core.Element) within the page if the element is rendered.
         * @since 1.30
         * @param oElement The element to which should be scrolled.
         * @param iTime The duration of animated scrolling. To scroll immediately without animation, give 0 as
         * value or leave it default.
         * @returns <code>this</code> to facilitate method chaining.
        */
  def scrollToElement(oElement: openui5Lib.sapNs.uiNs.coreNs.Element): Page = js.native
  /**
         * Scrolls to an element(DOM or sap.ui.core.Element) within the page if the element is rendered.
         * @since 1.30
         * @param oElement The element to which should be scrolled.
         * @param iTime The duration of animated scrolling. To scroll immediately without animation, give 0 as
         * value or leave it default.
         * @returns <code>this</code> to facilitate method chaining.
        */
  def scrollToElement(oElement: openui5Lib.sapNs.uiNs.coreNs.Element, iTime: scala.Double): Page = js.native
  /**
         * Scrolls to an element(DOM or sap.ui.core.Element) within the page if the element is rendered.
         * @since 1.30
         * @param oElement The element to which should be scrolled.
         * @param iTime The duration of animated scrolling. To scroll immediately without animation, give 0 as
         * value or leave it default.
         * @returns <code>this</code> to facilitate method chaining.
        */
  def scrollToElement(oElement: stdLib.HTMLElement): Page = js.native
  /**
         * Scrolls to an element(DOM or sap.ui.core.Element) within the page if the element is rendered.
         * @since 1.30
         * @param oElement The element to which should be scrolled.
         * @param iTime The duration of animated scrolling. To scroll immediately without animation, give 0 as
         * value or leave it default.
         * @returns <code>this</code> to facilitate method chaining.
        */
  def scrollToElement(oElement: stdLib.HTMLElement, iTime: scala.Double): Page = js.native
  /**
         * Sets a new value for property <code>backgroundDesign</code>.This property is used to set the
         * background color of a page. When a list is placed inside a page, the value "List" should be used to
         * display a gray background. "Standard", with the value white, is used as default if not
         * specified.When called with a value of <code>null</code> or <code>undefined</code>, the default value
         * of the property will be restored.Default value is <code>Standard</code>.
         * @param sBackgroundDesign New value for property <code>backgroundDesign</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setBackgroundDesign(sBackgroundDesign: PageBackgroundDesign): Page = js.native
  /**
         * Sets a new value for property <code>contentOnlyBusy</code>.Decides which area is covered by the
         * local BusyIndicator when <code>page.setBusy()</code> is called. By default the entire page is
         * covered, including headers and footer. When this property is set to "true", only the content area is
         * covered (not header/sub header and footer), which is useful e.g. when there is a SearchField in the
         * sub header and live search continuously updates the content area while the user is still able to
         * type.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
         * the property will be restored.Default value is <code>false</code>.
         * @since 1.29.0
         * @param bContentOnlyBusy New value for property <code>contentOnlyBusy</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setContentOnlyBusy(bContentOnlyBusy: scala.Boolean): Page = js.native
  /**
         * Sets a new value for property <code>enableScrolling</code>.Enable vertical scrolling of page
         * contents. Page headers and footers are fixed and do not scroll.If set to false, there will be no
         * scrolling at all.The Page only allows vertical scrolling because horizontal scrolling is discouraged
         * in general for full-page content. If it still needs to be achieved, disable the Page scrolling and
         * use a ScrollContainer as full-page content of the Page. This allows you to freely configure
         * scrolling. It can also be used to create horizontally-scrolling sub-areas of (vertically-scrolling)
         * Pages.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
         * the property will be restored.Default value is <code>true</code>.
         * @param bEnableScrolling New value for property <code>enableScrolling</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setEnableScrolling(bEnableScrolling: scala.Boolean): Page = js.native
  /**
         * Sets a new value for property <code>floatingFooter</code>.Decides whether the floating footer
         * behavior should be enabled.When the floating footer behavior is used, the content is visible when
         * it's underneath the footer.When called with a value of <code>null</code> or <code>undefined</code>,
         * the default value of the property will be restored.Default value is <code>false</code>.
         * @param bFloatingFooter New value for property <code>floatingFooter</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setFloatingFooter(bFloatingFooter: scala.Boolean): Page = js.native
  /**
         * Sets the aggregated <code>footer</code>.
         * @param oFooter The footer to set
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setFooter(oFooter: IBar): Page = js.native
  /**
         * Sets a new value for property <code>icon</code>.the icon that is rendered in the page header bar in
         * non-iOS phone/tablet platforms. This property is theme-dependent and only has an effect in the MVI
         * theme.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
         * the property will be restored.
         * @param sIcon New value for property <code>icon</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setIcon(sIcon: js.Any): Page = js.native
  /**
         * Sets the aggregated <code>landmarkInfo</code>.
         * @param oLandmarkInfo The landmarkInfo to set
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setLandmarkInfo(oLandmarkInfo: PageAccessibleLandmarkInfo): Page = js.native
  /**
         * Sets a new value for property <code>navButtonText</code>.The text of the nav button when running in
         * iOS (if shown) in case it deviates from the default, which is "Back". This property is
         * mvi-theme-dependent and will not have any effect in other themes.When called with a value of
         * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
         * @param sNavButtonText New value for property <code>navButtonText</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setNavButtonText(sNavButtonText: java.lang.String): Page = js.native
  /**
         * Sets a new value for property <code>navButtonTooltip</code>.The tooltip of the nav buttonSince
         * version 1.34When called with a value of <code>null</code> or <code>undefined</code>, the default
         * value of the property will be restored.
         * @param sNavButtonTooltip New value for property <code>navButtonTooltip</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setNavButtonTooltip(sNavButtonTooltip: java.lang.String): Page = js.native
  /**
         * Sets a new value for property <code>navButtonType</code>.This property is used to set the appearance
         * of the NavButton. By default when showNavButton is set to true, a back button will be shown in iOS
         * and an up button in other platforms. In case you want to show a normal button in the left header
         * area, you can set the value to "Default".When called with a value of <code>null</code> or
         * <code>undefined</code>, the default value of the property will be restored.Default value is
         * <code>Back</code>.
         * @since 1.12
         * @param sNavButtonType New value for property <code>navButtonType</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setNavButtonType(sNavButtonType: ButtonType): Page = js.native
  /**
         * Sets a new value for property <code>showFooter</code>.Whether this page shall have a footerWhen
         * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
         * property will be restored.Default value is <code>true</code>.
         * @since 1.13.1
         * @param bShowFooter New value for property <code>showFooter</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setShowFooter(bShowFooter: scala.Boolean): Page = js.native
  /**
         * Sets a new value for property <code>showHeader</code>.Whether this page shall have a header.If set
         * to true, either the control under the "customHeader" aggregation is used, or if there is no such
         * control, a Header control is constructed from the properties "title", "showNavButton",
         * "navButtonText" and "icon" depending on the platform.When called with a value of <code>null</code>
         * or <code>undefined</code>, the default value of the property will be restored.Default value is
         * <code>true</code>.
         * @param bShowHeader New value for property <code>showHeader</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setShowHeader(bShowHeader: scala.Boolean): Page = js.native
  /**
         * Sets a new value for property <code>showNavButton</code>.A nav button will be rendered on the left
         * area of header bar if this property is set to true.When called with a value of <code>null</code> or
         * <code>undefined</code>, the default value of the property will be restored.Default value is
         * <code>false</code>.
         * @param bShowNavButton New value for property <code>showNavButton</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setShowNavButton(bShowNavButton: scala.Boolean): Page = js.native
  /**
         * Sets a new value for property <code>showSubHeader</code>.Whether this page shall show the
         * subheader.When called with a value of <code>null</code> or <code>undefined</code>, the default value
         * of the property will be restored.Default value is <code>true</code>.
         * @since 1.28
         * @param bShowSubHeader New value for property <code>showSubHeader</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setShowSubHeader(bShowSubHeader: scala.Boolean): Page = js.native
  /**
         * Sets the aggregated <code>subHeader</code>.
         * @param oSubHeader The subHeader to set
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setSubHeader(oSubHeader: IBar): Page = js.native
  /**
         * Sets a new value for property <code>title</code>.The title text appearing in the page header
         * bar.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
         * the property will be restored.
         * @param sTitle New value for property <code>title</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setTitle(sTitle: java.lang.String): Page = js.native
  /**
         * Sets a new value for property <code>titleLevel</code>.Defines the semantic level of the title. Using
         * "Auto" no explicit level information is written.Used for accessibility purposes only.When called
         * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
         * be restored.Default value is <code>Auto</code>.
         * @param sTitleLevel New value for property <code>titleLevel</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setTitleLevel(sTitleLevel: openui5Lib.sapNs.uiNs.coreNs.TitleLevel): Page = js.native
}

