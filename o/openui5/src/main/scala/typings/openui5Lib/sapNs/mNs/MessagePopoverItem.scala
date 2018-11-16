package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.MessagePopoverItem")
@js.native
class MessagePopoverItem protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Element {
  /**
         * Constructor for a new MessagePopoverItem.Accepts an object literal <code>mSettings</code> that
         * defines initialproperty values, aggregated and associated objects as well as event handlers.See
         * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
         * settings object.
         * @param sId id for the new control, generated automatically if no id is given
         * @param mSettings initial settings for the new control
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new MessagePopoverItem.Accepts an object literal <code>mSettings</code> that
         * defines initialproperty values, aggregated and associated objects as well as event handlers.See
         * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
         * settings object.
         * @param sId id for the new control, generated automatically if no id is given
         * @param mSettings initial settings for the new control
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Destroys the link in the aggregation <code>link</code>.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyLink(): MessagePopoverItem = js.native
  /**
         * Gets current value of property <code>counter</code>.Defines the number of messages for a given
         * message.
         * @returns Value of property <code>counter</code>
        */
  def getCounter(): scala.Double = js.native
  /**
         * Gets current value of property <code>description</code>.Specifies detailed description of the
         * messageDefault value is <code></code>.
         * @returns Value of property <code>description</code>
        */
  def getDescription(): java.lang.String = js.native
  /**
         * Gets content of aggregation <code>link</code>.Adds a sap.m.Link control which will be displayed at
         * the end of the description of a message.
        */
  def getLink(): Link = js.native
  /**
         * Gets current value of property <code>longtextUrl</code>.Specifies long text description location URL
         * @returns Value of property <code>longtextUrl</code>
        */
  def getLongtextUrl(): js.Any = js.native
  /**
         * Gets current value of property <code>markupDescription</code>.Specifies if description should be
         * interpreted as markupDefault value is <code>false</code>.
         * @returns Value of property <code>markupDescription</code>
        */
  def getMarkupDescription(): scala.Boolean = js.native
  /**
         * Gets current value of property <code>subtitle</code>.Specifies the subtitle of the
         * message<b>Note:</b> This is only visible when the <code>title</code> property is not empty.
         * @returns Value of property <code>subtitle</code>
        */
  def getSubtitle(): java.lang.String = js.native
  /**
         * Gets current value of property <code>title</code>.Specifies the title of the messageDefault value is
         * <code></code>.
         * @returns Value of property <code>title</code>
        */
  def getTitle(): java.lang.String = js.native
  /**
         * Gets current value of property <code>type</code>.Specifies the type of the messageDefault value is
         * <code>Error</code>.
         * @returns Value of property <code>type</code>
        */
  def getType(): openui5Lib.sapNs.uiNs.coreNs.MessageType = js.native
  /**
         * Sets a new value for property <code>counter</code>.Defines the number of messages for a given
         * message.When called with a value of <code>null</code> or <code>undefined</code>, the default value
         * of the property will be restored.
         * @param iCounter New value for property <code>counter</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setCounter(iCounter: scala.Double): MessagePopoverItem = js.native
  /**
         * Sets a new value for property <code>description</code>.Specifies detailed description of the
         * messageWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
         * the property will be restored.Default value is <code></code>.
         * @param sDescription New value for property <code>description</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setDescription(sDescription: java.lang.String): MessagePopoverItem = js.native
  /**
         * Sets the aggregated <code>link</code>.
         * @param oLink The link to set
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setLink(oLink: Link): MessagePopoverItem = js.native
  /**
         * Sets a new value for property <code>longtextUrl</code>.Specifies long text description location
         * URLWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of the
         * property will be restored.
         * @param sLongtextUrl New value for property <code>longtextUrl</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setLongtextUrl(sLongtextUrl: js.Any): MessagePopoverItem = js.native
  /**
         * Sets a new value for property <code>markupDescription</code>.Specifies if description should be
         * interpreted as markupWhen called with a value of <code>null</code> or <code>undefined</code>, the
         * default value of the property will be restored.Default value is <code>false</code>.
         * @param bMarkupDescription New value for property <code>markupDescription</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setMarkupDescription(bMarkupDescription: scala.Boolean): MessagePopoverItem = js.native
  /**
         * Sets a new value for property <code>subtitle</code>.Specifies the subtitle of the
         * message<b>Note:</b> This is only visible when the <code>title</code> property is not empty.When
         * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
         * property will be restored.
         * @param sSubtitle New value for property <code>subtitle</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setSubtitle(sSubtitle: java.lang.String): MessagePopoverItem = js.native
  /**
         * Sets a new value for property <code>title</code>.Specifies the title of the messageWhen called with
         * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
         * restored.Default value is <code></code>.
         * @param sTitle New value for property <code>title</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setTitle(sTitle: java.lang.String): MessagePopoverItem = js.native
  /**
         * Sets a new value for property <code>type</code>.Specifies the type of the messageWhen called with a
         * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
         * restored.Default value is <code>Error</code>.
         * @param sType New value for property <code>type</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setType(sType: openui5Lib.sapNs.uiNs.coreNs.MessageType): MessagePopoverItem = js.native
}

