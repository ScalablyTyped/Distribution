package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickViewGroupElement extends Element {
  
  /**
    * Gets current value of property <code>emailSubject</code>.The subject of the email.Works only with
    * QuickViewGroupElement of type email.Default value is <code></code>.
    * @returns Value of property <code>emailSubject</code>
    */
  def getEmailSubject(): String = js.native
  
  /**
    * Gets current value of property <code>label</code>.Specifies the text displayed below the associated
    * label.Default value is <code></code>.
    * @returns Value of property <code>label</code>
    */
  def getLabel(): String = js.native
  
  /**
    * Gets current value of property <code>pageLinkId</code>.Specifies the ID of the QuickViewPage, which
    * is opened from the link in the QuickViewGroupElement.Works only with QuickViewGroupElement of type
    * pageLink.Default value is <code></code>.
    * @returns Value of property <code>pageLinkId</code>
    */
  def getPageLinkId(): String = js.native
  
  /**
    * Gets current value of property <code>target</code>.Specifies the target of the link – it works like
    * the target property of the HTML <a> tag. Works only with QuickViewGroupElement of type link.Default
    * value is <code>_blank</code>.
    * @returns Value of property <code>target</code>
    */
  def getTarget(): String = js.native
  
  /**
    * Gets current value of property <code>type</code>.Specifies the type of the displayed information –
    * phone number, mobile number, e-mail, link, text or a link to another QuickViewPage. Default value is
    * ‘text’.Default value is <code>GroupElementType.text</code>.
    * @returns Value of property <code>type</code>
    */
  def getType(): QuickViewGroupElementType = js.native
  
  /**
    * Gets current value of property <code>url</code>.Specifies the address of the QuickViewGroupElement
    * link. Works only with QuickViewGroupElement of type link.Default value is <code></code>.
    * @returns Value of property <code>url</code>
    */
  def getUrl(): String = js.native
  
  /**
    * Gets current value of property <code>value</code>.Specifies the text of the control that associates
    * with the label.Default value is <code></code>.
    * @returns Value of property <code>value</code>
    */
  def getValue(): String = js.native
  
  /**
    * Gets current value of property <code>visible</code>.Determines whether the element should be visible
    * on the screen.Default value is <code>true</code>.
    * @returns Value of property <code>visible</code>
    */
  def getVisible(): Boolean = js.native
  
  /**
    * Sets a new value for property <code>emailSubject</code>.The subject of the email.Works only with
    * QuickViewGroupElement of type email.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code></code>.
    * @param sEmailSubject New value for property <code>emailSubject</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEmailSubject(sEmailSubject: String): QuickViewGroupElement = js.native
  
  /**
    * Sets a new value for property <code>label</code>.Specifies the text displayed below the associated
    * label.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code></code>.
    * @param sLabel New value for property <code>label</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLabel(sLabel: String): QuickViewGroupElement = js.native
  
  /**
    * Sets a new value for property <code>pageLinkId</code>.Specifies the ID of the QuickViewPage, which
    * is opened from the link in the QuickViewGroupElement.Works only with QuickViewGroupElement of type
    * pageLink.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code></code>.
    * @param sPageLinkId New value for property <code>pageLinkId</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPageLinkId(sPageLinkId: String): QuickViewGroupElement = js.native
  
  /**
    * Sets a new value for property <code>target</code>.Specifies the target of the link – it works like
    * the target property of the HTML <a> tag. Works only with QuickViewGroupElement of type link.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>_blank</code>.
    * @param sTarget New value for property <code>target</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTarget(sTarget: String): QuickViewGroupElement = js.native
  
  /**
    * Sets a new value for property <code>type</code>.Specifies the type of the displayed information –
    * phone number, mobile number, e-mail, link, text or a link to another QuickViewPage. Default value is
    * ‘text’.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>GroupElementType.text</code>.
    * @param sType New value for property <code>type</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setType(sType: QuickViewGroupElementType): QuickViewGroupElement = js.native
  
  /**
    * Sets a new value for property <code>url</code>.Specifies the address of the QuickViewGroupElement
    * link. Works only with QuickViewGroupElement of type link.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sUrl New value for property <code>url</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUrl(sUrl: String): QuickViewGroupElement = js.native
  
  /**
    * Sets a new value for property <code>value</code>.Specifies the text of the control that associates
    * with the label.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code></code>.
    * @param sValue New value for property <code>value</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue(sValue: String): QuickViewGroupElement = js.native
  
  /**
    * Sets a new value for property <code>visible</code>.Determines whether the element should be visible
    * on the screen.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>true</code>.
    * @param bVisible New value for property <code>visible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisible(bVisible: Boolean): QuickViewGroupElement = js.native
}
