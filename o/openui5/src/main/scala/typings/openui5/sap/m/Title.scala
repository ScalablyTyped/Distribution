package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.TextAlign
import typings.openui5.sap.ui.core.TitleLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Title
  extends StObject
     with Control {
  
  /**
    * Gets current value of property <code>level</code>.Defines the semantic level of the title.This
    * information is e.g. used by assistive technologies like screenreaders to create a hierarchical site
    * map for faster navigation.Depending on this setting either a HTML h1-h6 element is used or when
    * using level <code>Auto</code> no explicit level information is written (HTML5 header
    * element).Default value is <code>Auto</code>.
    * @returns Value of property <code>level</code>
    */
  def getLevel(): TitleLevel = js.native
  
  /**
    * Gets current value of property <code>text</code>.Defines the text which should be displayed as a
    * title.
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  
  /**
    * Gets current value of property <code>textAlign</code>.Defines the alignment of the text within the
    * title. <b>Note:</b> This property only has an effect if the overall width of the title control
    * islarger than the displayed text.Default value is <code>Initial</code>.
    * @returns Value of property <code>textAlign</code>
    */
  def getTextAlign(): TextAlign = js.native
  
  /**
    * ID of the element which is the current target of the association <code>title</code>, or
    * <code>null</code>.
    */
  def getTitle(): js.Any = js.native
  
  /**
    * Gets current value of property <code>titleStyle</code>.Defines the style of the title.When using the
    * <code>Auto</code> styling, the appearance of the title depends on the current position of the title
    * and the defined level.This automatism can be overridden by setting a different style explicitly.The
    * actual appearance of the title and the different styles always depends on the theme being
    * used.Default value is <code>Auto</code>.
    * @returns Value of property <code>titleStyle</code>
    */
  def getTitleStyle(): TitleLevel = js.native
  
  /**
    * Gets current value of property <code>width</code>.Defines the width of the title.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  
  /**
    * Sets a new value for property <code>level</code>.Defines the semantic level of the title.This
    * information is e.g. used by assistive technologies like screenreaders to create a hierarchical site
    * map for faster navigation.Depending on this setting either a HTML h1-h6 element is used or when
    * using level <code>Auto</code> no explicit level information is written (HTML5 header element).When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>Auto</code>.
    * @param sLevel New value for property <code>level</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLevel(sLevel: TitleLevel): Title = js.native
  
  /**
    * Sets a new value for property <code>text</code>.Defines the text which should be displayed as a
    * title.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): Title = js.native
  
  /**
    * Sets a new value for property <code>textAlign</code>.Defines the alignment of the text within the
    * title. <b>Note:</b> This property only has an effect if the overall width of the title control
    * islarger than the displayed text.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Initial</code>.
    * @param sTextAlign New value for property <code>textAlign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextAlign(sTextAlign: TextAlign): Title = js.native
  
  /**
    * Sets the associated <code>title</code>.
    * @param oTitle ID of an element which becomes the new target of this title association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(oTitle: js.Any): Title = js.native
  def setTitle(oTitle: typings.openui5.sap.ui.core.Title): Title = js.native
  
  /**
    * Sets a new value for property <code>titleStyle</code>.Defines the style of the title.When using the
    * <code>Auto</code> styling, the appearance of the title depends on the current position of the title
    * and the defined level.This automatism can be overridden by setting a different style explicitly.The
    * actual appearance of the title and the different styles always depends on the theme being used.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>Auto</code>.
    * @param sTitleStyle New value for property <code>titleStyle</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitleStyle(sTitleStyle: TitleLevel): Title = js.native
  
  /**
    * Sets a new value for property <code>width</code>.Defines the width of the title.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): Title = js.native
}
