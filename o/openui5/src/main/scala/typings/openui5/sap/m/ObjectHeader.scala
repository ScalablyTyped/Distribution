package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.TextDirection
import typings.openui5.sap.ui.core.TitleLevel
import typings.openui5.sap.ui.core.ValueState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectHeader extends Control {
  
  /**
    * Adds some additionalNumber to the aggregation <code>additionalNumbers</code>.
    * @since 1.38.0
    * @param oAdditionalNumber the additionalNumber to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAdditionalNumber(oAdditionalNumber: ObjectNumber): ObjectHeader = js.native
  
  /**
    * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaDescribedBy(vAriaDescribedBy: js.Any): ObjectHeader = js.native
  def addAriaDescribedBy(vAriaDescribedBy: Control): ObjectHeader = js.native
  
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): ObjectHeader = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): ObjectHeader = js.native
  
  /**
    * Adds some attribute to the aggregation <code>attributes</code>.
    * @param oAttribute the attribute to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAttribute(oAttribute: ObjectAttribute): ObjectHeader = js.native
  
  /**
    * Adds some status to the aggregation <code>statuses</code>.
    * @since 1.16.0
    * @param oStatus the status to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addStatus(oStatus: Control): ObjectHeader = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>iconPress</code> event of this
    * <code>sap.m.ObjectHeader</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.ObjectHeader</code> itself.Event is fired when the title icon is active and the
    * user taps/clicks on it
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ObjectHeader</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachIconPress(oData: js.Any, fnFunction: js.Any): ObjectHeader = js.native
  def attachIconPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ObjectHeader = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>introPress</code> event of this
    * <code>sap.m.ObjectHeader</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.ObjectHeader</code> itself.Event is fired when the intro is active and the user
    * taps/clicks on it
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ObjectHeader</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachIntroPress(oData: js.Any, fnFunction: js.Any): ObjectHeader = js.native
  def attachIntroPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ObjectHeader = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>titlePress</code> event of this
    * <code>sap.m.ObjectHeader</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.ObjectHeader</code> itself.Event is fired when the title is active and the user
    * taps/clicks on it
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ObjectHeader</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachTitlePress(oData: js.Any, fnFunction: js.Any): ObjectHeader = js.native
  def attachTitlePress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ObjectHeader = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>titleSelectorPress</code> event of this
    * <code>sap.m.ObjectHeader</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.ObjectHeader</code> itself.Event is fired when the object header title selector
    * (down-arrow) is pressed
    * @since 1.16.0
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ObjectHeader</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachTitleSelectorPress(oData: js.Any, fnFunction: js.Any): ObjectHeader = js.native
  def attachTitleSelectorPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ObjectHeader = js.native
  
  /**
    * Destroys all the additionalNumbers in the aggregation <code>additionalNumbers</code>.
    * @since 1.38.0
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyAdditionalNumbers(): ObjectHeader = js.native
  
  /**
    * Destroys all the attributes in the aggregation <code>attributes</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyAttributes(): ObjectHeader = js.native
  
  /**
    * Destroys the firstStatus in the aggregation <code>firstStatus</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyFirstStatus(): ObjectHeader = js.native
  
  /**
    * Destroys the headerContainer in the aggregation <code>headerContainer</code>.
    * @since 1.21.1
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyHeaderContainer(): ObjectHeader = js.native
  
  /**
    * Destroys the secondStatus in the aggregation <code>secondStatus</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySecondStatus(): ObjectHeader = js.native
  
  /**
    * Destroys all the statuses in the aggregation <code>statuses</code>.
    * @since 1.16.0
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyStatuses(): ObjectHeader = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>iconPress</code> event of this
    * <code>sap.m.ObjectHeader</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachIconPress(fnFunction: js.Any, oListener: js.Any): ObjectHeader = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>introPress</code> event of this
    * <code>sap.m.ObjectHeader</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachIntroPress(fnFunction: js.Any, oListener: js.Any): ObjectHeader = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>titlePress</code> event of this
    * <code>sap.m.ObjectHeader</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachTitlePress(fnFunction: js.Any, oListener: js.Any): ObjectHeader = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>titleSelectorPress</code> event of
    * this <code>sap.m.ObjectHeader</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @since 1.16.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachTitleSelectorPress(fnFunction: js.Any, oListener: js.Any): ObjectHeader = js.native
  
  /**
    * Fires event <code>iconPress</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>domRef</code> of type <code>object</code>Dom reference of the object
    * header' icon to be used for positioning.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireIconPress(mArguments: js.Any): ObjectHeader = js.native
  
  /**
    * Fires event <code>introPress</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>domRef</code> of type <code>object</code>Dom reference of the object
    * header' intro to be used for positioning.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireIntroPress(mArguments: js.Any): ObjectHeader = js.native
  
  /**
    * Fires event <code>titlePress</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>domRef</code> of type <code>object</code>Dom reference of the object
    * header' title to be used for positioning.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireTitlePress(mArguments: js.Any): ObjectHeader = js.native
  
  /**
    * Fires event <code>titleSelectorPress</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>domRef</code> of type <code>object</code>Dom reference of the object
    * header' titleArrow to be used for positioning.</li></ul>
    * @since 1.16.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireTitleSelectorPress(mArguments: js.Any): ObjectHeader = js.native
  
  /**
    * Gets content of aggregation <code>additionalNumbers</code>.NOTE: Only applied if you set
    * "responsive=false".Additional object numbers and units are managed in this aggregation.The numbers
    * are hidden on tablet and phone size screens.When only one number is provided, it is rendered with
    * additional separator from the main ObjectHeader number.
    * @since 1.38.0
    */
  def getAdditionalNumbers(): js.Array[ObjectNumber] = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaDescribedBy</code>.
    */
  def getAriaDescribedBy(): js.Array[_] = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  
  /**
    * Gets content of aggregation <code>attributes</code>.The list of Object Attributes
    */
  def getAttributes(): js.Array[ObjectAttribute] = js.native
  
  /**
    * Gets current value of property <code>backgroundDesign</code>.This property is used to set the
    * background color of the ObjectHeader. Possible values are "Solid", "Translucent" and
    * "Transparent".NOTE: The different types of ObjectHeader come with different default background.- non
    * responsive ObjectHeader: Transparent- responsive ObjectHeader: Translucent- condensed ObjectHeder:
    * Solid
    * @returns Value of property <code>backgroundDesign</code>
    */
  def getBackgroundDesign(): BackgroundDesign = js.native
  
  /**
    * Gets current value of property <code>condensed</code>.<code>ObjectHeader</code> with title, one
    * attribute, number, and number unit.<br><b>Note:</b> Only applied if the <code>responsive</code>
    * property is set to <code>false</code>.Default value is <code>false</code>.
    * @returns Value of property <code>condensed</code>
    */
  def getCondensed(): Boolean = js.native
  
  /**
    * Gets content of aggregation <code>firstStatus</code>.First status shown on the right side of the
    * attributes above the second status.If it is not set the first attribute will expand to take the
    * entire row.
    */
  def getFirstStatus(): ObjectStatus = js.native
  
  /**
    * Gets current value of property <code>fullScreenOptimized</code>.Optimizes the display of the
    * elements of the <code>ObjectHeader</code>.<br>Set this property to <code>true</code> if your
    * application uses a full-screen layout (as opposed to a master-detail or other split-screen
    * layout).<br><b>Note</b>: Only applied if the <code>responsive</code> property is also set to
    * <code>true</code>.If set to <code>true</code>, the following situations apply:<ul>               
    * <li>On desktop, 1-3 attributes/statuses - positioned as a third block on the right side of the
    * Title/Number group</li>                <li>On desktop, 4+ attributes/statuses - 4 columns below the
    * Title/Number</li>                <li>On tablet (portrait mode), always in 2 columns below the
    * Title/Number</li>                <li>On tablet (landscape mode), 1-2 attributes/statuses - 2 columns
    * below the Title/Number</li>                <li>On tablet (landscape mode), 3+ attributes/statuses -
    * 3 columns below the Title/Number</li></ul>On phone, the attributes and statuses are always
    * positioned in 1 column below the Title/Number of the <code>ObjectHeader</code>.<br>If set to
    * <code>false</code>, the attributes and statuses are being positioned below the Title/Number of the
    * <code>ObjectHeader</code> in 2 or 3 columns depending on their number:<ul>               <li>On
    * desktop, 1-4 attributes/statuses - 2 columns</li>               <li>On desktop, 5+
    * attributes/statuses - 3 columns</li>               <li>On tablet, always in 2
    * columns</li></ul>Default value is <code>false</code>.
    * @since 1.28
    * @returns Value of property <code>fullScreenOptimized</code>
    */
  def getFullScreenOptimized(): Boolean = js.native
  
  /**
    * Gets content of aggregation <code>headerContainer</code>.This aggregation takes only effect when you
    * set "responsive" to true.It can either be filled with an sap.m.IconTabBar or a
    * sap.suite.ui.commons.HeaderContainer control. Overflow handling must be taken care of by the inner
    * control. If used with an IconTabBar control, only the header will be displayed inside the object
    * header, the content will be displayed below the ObjectHeader.
    * @since 1.21.1
    */
  def getHeaderContainer(): ObjectHeaderContainer = js.native
  
  /**
    * Gets current value of property <code>icon</code>.Object header icon.<b>Note:</b> Recursive
    * resolution of binding expressions is not supported by the framework.It works only in ObjectHeader,
    * since it is a composite control and creates an Image control internally.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  
  /**
    * Gets current value of property <code>iconActive</code>.Indicates that the object header icon is
    * clickable
    * @returns Value of property <code>iconActive</code>
    */
  def getIconActive(): Boolean = js.native
  
  /**
    * Gets current value of property <code>iconAlt</code>.Object header icon alternative text that is
    * displayed in case the Image is not available, or cannot be displayed.
    * @returns Value of property <code>iconAlt</code>
    */
  def getIconAlt(): String = js.native
  
  /**
    * Gets current value of property <code>iconDensityAware</code>.By default, this is set to true but
    * then one or more requests are sent trying to get the density perfect version of image if this
    * version of image doesn't exist on the server.If bandwidth is the key for the application, set this
    * value to false.Default value is <code>true</code>.
    * @returns Value of property <code>iconDensityAware</code>
    */
  def getIconDensityAware(): Boolean = js.native
  
  /**
    * Gets current value of property <code>intro</code>.Introductory text for the object header
    * @returns Value of property <code>intro</code>
    */
  def getIntro(): String = js.native
  
  /**
    * Gets current value of property <code>introActive</code>.Indicates that the intro is clickable
    * @returns Value of property <code>introActive</code>
    */
  def getIntroActive(): Boolean = js.native
  
  /**
    * Gets current value of property <code>introHref</code>.The intro link target URI. Supports standard
    * hyperlink behavior. If an action should be triggered, this should not be set, but instead an event
    * handler for the "introPress" event should be registered.
    * @since 1.28
    * @returns Value of property <code>introHref</code>
    */
  def getIntroHref(): js.Any = js.native
  
  /**
    * Gets current value of property <code>introTarget</code>.Options are _self, _top, _blank, _parent,
    * _search. Alternatively, a frame name can be entered.
    * @since 1.28
    * @returns Value of property <code>introTarget</code>
    */
  def getIntroTarget(): String = js.native
  
  /**
    * Gets current value of property <code>introTextDirection</code>.This property specifies the intro
    * text directionality with enumerated options. By default, the control inherits text direction from
    * the DOM.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @returns Value of property <code>introTextDirection</code>
    */
  def getIntroTextDirection(): TextDirection = js.native
  
  /**
    * Gets current value of property <code>markFavorite</code>.Sets the favorite state to true or false.
    * The showMarkers property must be true for this property to take effect.Default value is
    * <code>false</code>.
    * @since 1.16.0
    * @returns Value of property <code>markFavorite</code>
    */
  def getMarkFavorite(): Boolean = js.native
  
  /**
    * Gets current value of property <code>markFlagged</code>.Sets the flagged state to true or false. The
    * showMarkers property must be true for this property to take effect.Default value is
    * <code>false</code>.
    * @since 1.16.0
    * @returns Value of property <code>markFlagged</code>
    */
  def getMarkFlagged(): Boolean = js.native
  
  /**
    * Gets current value of property <code>number</code>.Object header number field
    * @returns Value of property <code>number</code>
    */
  def getNumber(): String = js.native
  
  /**
    * Gets current value of property <code>numberState</code>.Object header number and numberUnit value
    * state.Default value is <code>None</code>.
    * @since 1.16.0
    * @returns Value of property <code>numberState</code>
    */
  def getNumberState(): ValueState = js.native
  
  /**
    * Gets current value of property <code>numberTextDirection</code>.This property specifies the number
    * and unit directionality with enumerated options. By default, the control inherits text direction
    * from the DOM.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @returns Value of property <code>numberTextDirection</code>
    */
  def getNumberTextDirection(): TextDirection = js.native
  
  /**
    * Gets current value of property <code>numberUnit</code>.Object header number units qualifier
    * @returns Value of property <code>numberUnit</code>
    */
  def getNumberUnit(): String = js.native
  
  /**
    * Gets current value of property <code>responsive</code>.If this property is set to true the
    * ObjectHeader is rendered with a different design and reacts responsively to the screen sizes.Be
    * aware that the design and behavior of the responsive ObjectHeader can change without further
    * notification.Default value is <code>false</code>.
    * @since 1.21.1
    * @returns Value of property <code>responsive</code>
    */
  def getResponsive(): Boolean = js.native
  
  /**
    * Gets content of aggregation <code>secondStatus</code>.Second status shown on the right side of the
    * attributes below the first status.If it is not set the second attribute will expand to take the
    * entire row.
    */
  def getSecondStatus(): ObjectStatus = js.native
  
  /**
    * Gets current value of property <code>showMarkers</code>.Indicates if object header supports showing
    * markers such as flagged and favorite.Default value is <code>false</code>.
    * @since 1.16.0
    * @returns Value of property <code>showMarkers</code>
    */
  def getShowMarkers(): Boolean = js.native
  
  /**
    * Gets current value of property <code>showTitleSelector</code>.When set to true, the selector arrow
    * icon/image is shown and can be pressed.Default value is <code>false</code>.
    * @since 1.16.0
    * @returns Value of property <code>showTitleSelector</code>
    */
  def getShowTitleSelector(): Boolean = js.native
  
  /**
    * Gets content of aggregation <code>statuses</code>.The list of Object sap.ui.core.Control. It will
    * only allow sap.m.ObjectStatus and sap.m.ProgressIndicator controls.
    * @since 1.16.0
    */
  def getStatuses(): js.Array[Control] = js.native
  
  /**
    * Gets current value of property <code>title</code>.Object header title
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  
  /**
    * Gets current value of property <code>titleActive</code>.Indicates that the title is clickable and is
    * set only if a title is provided
    * @returns Value of property <code>titleActive</code>
    */
  def getTitleActive(): Boolean = js.native
  
  /**
    * Gets current value of property <code>titleHref</code>.The title link target URI. Supports standard
    * hyperlink behavior. If an action should be triggered, this should not be set, but instead an event
    * handler for the "titlePress" event should be registered.
    * @since 1.28
    * @returns Value of property <code>titleHref</code>
    */
  def getTitleHref(): js.Any = js.native
  
  /**
    * Gets current value of property <code>titleLevel</code>.Defines the semantic level of the title.This
    * information is e.g. used by assistive technologies like screenreaders to create a hierarchical site
    * map for faster navigation.Depending on this setting a HTML h1-h6 element is used.Default value is
    * <code>H1</code>.
    * @returns Value of property <code>titleLevel</code>
    */
  def getTitleLevel(): TitleLevel = js.native
  
  /**
    * Gets current value of property <code>titleSelectorTooltip</code>.Sets custom text for the tooltip of
    * the select title arrow. If not set, a default text of the tooltip will be displayed.Default value is
    * <code>Options</code>.
    * @since 1.30.0
    * @returns Value of property <code>titleSelectorTooltip</code>
    */
  def getTitleSelectorTooltip(): String = js.native
  
  /**
    * Gets current value of property <code>titleTarget</code>.Options are _self, _top, _blank, _parent,
    * _search. Alternatively, a frame name can be entered.
    * @since 1.28
    * @returns Value of property <code>titleTarget</code>
    */
  def getTitleTarget(): String = js.native
  
  /**
    * Gets current value of property <code>titleTextDirection</code>.This property specifies the title
    * text directionality with enumerated options. By default, the control inherits text direction from
    * the DOM.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @returns Value of property <code>titleTextDirection</code>
    */
  def getTitleTextDirection(): TextDirection = js.native
  
  /**
    * Checks for the provided <code>sap.m.ObjectNumber</code> in the aggregation
    * <code>additionalNumbers</code>.and returns its index if found or -1 otherwise.
    * @since 1.38.0
    * @param oAdditionalNumber The additionalNumber whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfAdditionalNumber(oAdditionalNumber: ObjectNumber): Double = js.native
  
  /**
    * Checks for the provided <code>sap.m.ObjectAttribute</code> in the aggregation
    * <code>attributes</code>.and returns its index if found or -1 otherwise.
    * @param oAttribute The attribute whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfAttribute(oAttribute: ObjectAttribute): Double = js.native
  
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>statuses</code>.and returns its index if found or -1 otherwise.
    * @since 1.16.0
    * @param oStatus The status whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfStatus(oStatus: Control): Double = js.native
  
  /**
    * Inserts a additionalNumber into the aggregation <code>additionalNumbers</code>.
    * @since 1.38.0
    * @param oAdditionalNumber the additionalNumber to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the additionalNumber should be inserted at; for        
    *     a negative value of <code>iIndex</code>, the additionalNumber is inserted at position 0; for a
    * value             greater than the current size of the aggregation, the additionalNumber is inserted
    * at             the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertAdditionalNumber(oAdditionalNumber: ObjectNumber, iIndex: Double): ObjectHeader = js.native
  
  /**
    * Inserts a attribute into the aggregation <code>attributes</code>.
    * @param oAttribute the attribute to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the attribute should be inserted at; for             a
    * negative value of <code>iIndex</code>, the attribute is inserted at position 0; for a value         
    *    greater than the current size of the aggregation, the attribute is inserted at             the
    * last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertAttribute(oAttribute: ObjectAttribute, iIndex: Double): ObjectHeader = js.native
  
  /**
    * Inserts a status into the aggregation <code>statuses</code>.
    * @since 1.16.0
    * @param oStatus the status to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the status should be inserted at; for             a
    * negative value of <code>iIndex</code>, the status is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the status is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertStatus(oStatus: Control, iIndex: Double): ObjectHeader = js.native
  
  def removeAdditionalNumber(vAdditionalNumber: String): ObjectNumber = js.native
  /**
    * Removes a additionalNumber from the aggregation <code>additionalNumbers</code>.
    * @since 1.38.0
    * @param vAdditionalNumber The additionalNumber to remove or its index or id
    * @returns The removed additionalNumber or <code>null</code>
    */
  def removeAdditionalNumber(vAdditionalNumber: Double): ObjectNumber = js.native
  def removeAdditionalNumber(vAdditionalNumber: ObjectNumber): ObjectNumber = js.native
  
  /**
    * Removes all the controls from the aggregation <code>additionalNumbers</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @since 1.38.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAdditionalNumbers(): js.Array[ObjectNumber] = js.native
  
  /**
    * Removes all the controls in the association named <code>ariaDescribedBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaDescribedBy(): js.Array[_] = js.native
  
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  
  /**
    * Removes all the controls from the aggregation <code>attributes</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAttributes(): js.Array[ObjectAttribute] = js.native
  
  /**
    * Removes all the controls from the aggregation <code>statuses</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @since 1.16.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllStatuses(): js.Array[Control] = js.native
  
  def removeAriaDescribedBy(vAriaDescribedBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
    * @returns The removed ariaDescribedBy or <code>null</code>
    */
  def removeAriaDescribedBy(vAriaDescribedBy: Double): js.Any = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Control): js.Any = js.native
  
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  
  def removeAttribute(vAttribute: String): ObjectAttribute = js.native
  /**
    * Removes a attribute from the aggregation <code>attributes</code>.
    * @param vAttribute The attribute to remove or its index or id
    * @returns The removed attribute or <code>null</code>
    */
  def removeAttribute(vAttribute: Double): ObjectAttribute = js.native
  def removeAttribute(vAttribute: ObjectAttribute): ObjectAttribute = js.native
  
  def removeStatus(vStatus: String): Control = js.native
  /**
    * Removes a status from the aggregation <code>statuses</code>.
    * @since 1.16.0
    * @param vStatus The status to remove or its index or id
    * @returns The removed status or <code>null</code>
    */
  def removeStatus(vStatus: Double): Control = js.native
  def removeStatus(vStatus: Control): Control = js.native
  
  /**
    * Sets a new value for property <code>backgroundDesign</code>.This property is used to set the
    * background color of the ObjectHeader. Possible values are "Solid", "Translucent" and
    * "Transparent".NOTE: The different types of ObjectHeader come with different default background.- non
    * responsive ObjectHeader: Transparent- responsive ObjectHeader: Translucent- condensed ObjectHeder:
    * SolidWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sBackgroundDesign New value for property <code>backgroundDesign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundDesign(sBackgroundDesign: BackgroundDesign): ObjectHeader = js.native
  
  /**
    * Set the condensed flag
    * @param bCondensed the new value
    * @returns this pointer for chaining
    */
  def setCondensed(bCondensed: Boolean): ObjectHeader = js.native
  
  /**
    * Sets the aggregated <code>firstStatus</code>.
    * @param oFirstStatus The firstStatus to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFirstStatus(oFirstStatus: ObjectStatus): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>fullScreenOptimized</code>.Optimizes the display of the elements
    * of the <code>ObjectHeader</code>.<br>Set this property to <code>true</code> if your application uses
    * a full-screen layout (as opposed to a master-detail or other split-screen layout).<br><b>Note</b>:
    * Only applied if the <code>responsive</code> property is also set to <code>true</code>.If set to
    * <code>true</code>, the following situations apply:<ul>                <li>On desktop, 1-3
    * attributes/statuses - positioned as a third block on the right side of the Title/Number group</li>  
    *              <li>On desktop, 4+ attributes/statuses - 4 columns below the Title/Number</li>         
    *       <li>On tablet (portrait mode), always in 2 columns below the Title/Number</li>               
    * <li>On tablet (landscape mode), 1-2 attributes/statuses - 2 columns below the Title/Number</li>     
    *           <li>On tablet (landscape mode), 3+ attributes/statuses - 3 columns below the
    * Title/Number</li></ul>On phone, the attributes and statuses are always positioned in 1 column below
    * the Title/Number of the <code>ObjectHeader</code>.<br>If set to <code>false</code>, the attributes
    * and statuses are being positioned below the Title/Number of the <code>ObjectHeader</code> in 2 or 3
    * columns depending on their number:<ul>               <li>On desktop, 1-4 attributes/statuses - 2
    * columns</li>               <li>On desktop, 5+ attributes/statuses - 3 columns</li>              
    * <li>On tablet, always in 2 columns</li></ul>When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.28
    * @param bFullScreenOptimized New value for property <code>fullScreenOptimized</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFullScreenOptimized(bFullScreenOptimized: Boolean): ObjectHeader = js.native
  
  /**
    * Sets the aggregated <code>headerContainer</code>.
    * @since 1.21.1
    * @param oHeaderContainer The headerContainer to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeaderContainer(oHeaderContainer: ObjectHeaderContainer): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>icon</code>.Object header icon.<b>Note:</b> Recursive resolution
    * of binding expressions is not supported by the framework.It works only in ObjectHeader, since it is
    * a composite control and creates an Image control internally.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>iconActive</code>.Indicates that the object header icon is
    * clickableWhen called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param bIconActive New value for property <code>iconActive</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconActive(bIconActive: Boolean): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>iconAlt</code>.Object header icon alternative text that is
    * displayed in case the Image is not available, or cannot be displayed.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sIconAlt New value for property <code>iconAlt</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconAlt(sIconAlt: String): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>iconDensityAware</code>.By default, this is set to true but then
    * one or more requests are sent trying to get the density perfect version of image if this version of
    * image doesn't exist on the server.If bandwidth is the key for the application, set this value to
    * false.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>true</code>.
    * @param bIconDensityAware New value for property <code>iconDensityAware</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconDensityAware(bIconDensityAware: Boolean): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>intro</code>.Introductory text for the object headerWhen called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.
    * @param sIntro New value for property <code>intro</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIntro(sIntro: String): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>introActive</code>.Indicates that the intro is clickableWhen
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param bIntroActive New value for property <code>introActive</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIntroActive(bIntroActive: Boolean): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>introHref</code>.The intro link target URI. Supports standard
    * hyperlink behavior. If an action should be triggered, this should not be set, but instead an event
    * handler for the "introPress" event should be registered.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.28
    * @param sIntroHref New value for property <code>introHref</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIntroHref(sIntroHref: js.Any): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>introTarget</code>.Options are _self, _top, _blank, _parent,
    * _search. Alternatively, a frame name can be entered.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.28
    * @param sIntroTarget New value for property <code>introTarget</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIntroTarget(sIntroTarget: String): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>introTextDirection</code>.This property specifies the intro text
    * directionality with enumerated options. By default, the control inherits text direction from the
    * DOM.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @param sIntroTextDirection New value for property <code>introTextDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIntroTextDirection(sIntroTextDirection: TextDirection): ObjectHeader = js.native
  
  /**
    * Sets the visibility value of the Favorite marker.
    * @param bMarked the new value
    * @returns this pointer for chaining
    */
  def setMarkFavorite(bMarked: Boolean): ObjectHeader = js.native
  
  /**
    * Sets the visibility value of the Flagged marker.
    * @param bMarked the new value
    * @returns this pointer for chaining
    */
  def setMarkFlagged(bMarked: Boolean): ObjectHeader = js.native
  
  /**
    * Set the number value to the internal aggregation
    * @param sNumber the new value
    * @returns this pointer for chaining
    */
  def setNumber(sNumber: String): ObjectHeader = js.native
  
  /**
    * Set the number state to the internal aggregation
    * @param sState the new value
    * @returns this pointer for chaining
    */
  def setNumberState(sState: ValueState): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>numberTextDirection</code>.This property specifies the number
    * and unit directionality with enumerated options. By default, the control inherits text direction
    * from the DOM.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @param sNumberTextDirection New value for property <code>numberTextDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNumberTextDirection(sNumberTextDirection: TextDirection): ObjectHeader = js.native
  
  /**
    * Set the number unit to the internal aggregation
    * @param sUnit the new value
    * @returns this pointer for chaining
    */
  def setNumberUnit(sUnit: String): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>responsive</code>.If this property is set to true the
    * ObjectHeader is rendered with a different design and reacts responsively to the screen sizes.Be
    * aware that the design and behavior of the responsive ObjectHeader can change without further
    * notification.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>false</code>.
    * @since 1.21.1
    * @param bResponsive New value for property <code>responsive</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setResponsive(bResponsive: Boolean): ObjectHeader = js.native
  
  /**
    * Sets the aggregated <code>secondStatus</code>.
    * @param oSecondStatus The secondStatus to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSecondStatus(oSecondStatus: ObjectStatus): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>showMarkers</code>.Indicates if object header supports showing
    * markers such as flagged and favorite.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.16.0
    * @param bShowMarkers New value for property <code>showMarkers</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowMarkers(bShowMarkers: Boolean): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>showTitleSelector</code>.When set to true, the selector arrow
    * icon/image is shown and can be pressed.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.16.0
    * @param bShowTitleSelector New value for property <code>showTitleSelector</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowTitleSelector(bShowTitleSelector: Boolean): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>title</code>.Object header titleWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sTitle New value for property <code>title</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(sTitle: String): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>titleActive</code>.Indicates that the title is clickable and is
    * set only if a title is providedWhen called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param bTitleActive New value for property <code>titleActive</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitleActive(bTitleActive: Boolean): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>titleHref</code>.The title link target URI. Supports standard
    * hyperlink behavior. If an action should be triggered, this should not be set, but instead an event
    * handler for the "titlePress" event should be registered.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.28
    * @param sTitleHref New value for property <code>titleHref</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitleHref(sTitleHref: js.Any): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>titleLevel</code>.Defines the semantic level of the title.This
    * information is e.g. used by assistive technologies like screenreaders to create a hierarchical site
    * map for faster navigation.Depending on this setting a HTML h1-h6 element is used.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>H1</code>.
    * @param sTitleLevel New value for property <code>titleLevel</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitleLevel(sTitleLevel: TitleLevel): ObjectHeader = js.native
  
  /**
    * Sets the new text for the tooltip of the select title arrow to the internal aggregation
    * @param sTooltip the new value
    * @returns this pointer for chaining
    */
  def setTitleSelectorTooltip(sTooltip: js.Any): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>titleTarget</code>.Options are _self, _top, _blank, _parent,
    * _search. Alternatively, a frame name can be entered.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.28
    * @param sTitleTarget New value for property <code>titleTarget</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitleTarget(sTitleTarget: String): ObjectHeader = js.native
  
  /**
    * Sets a new value for property <code>titleTextDirection</code>.This property specifies the title text
    * directionality with enumerated options. By default, the control inherits text direction from the
    * DOM.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @param sTitleTextDirection New value for property <code>titleTextDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitleTextDirection(sTitleTextDirection: TextDirection): ObjectHeader = js.native
}
