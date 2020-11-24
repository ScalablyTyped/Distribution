package typings.openui5.sap.ui.layout

import typings.openui5.sap.ui.core.LayoutData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsiveFlowLayoutData extends LayoutData {
  
  /**
    * Gets current value of property <code>linebreak</code>.If this property is set, the control in which
    * the LayoutData is added, will always cause a line break within the ResponsiveFlowLayout.Default
    * value is <code>false</code>.
    * @returns Value of property <code>linebreak</code>
    */
  def getLinebreak(): Boolean = js.native
  
  /**
    * Gets current value of property <code>linebreakable</code>.Shows if an element can be wrapped into a
    * new row. If this value is set to false, the min-width will be set to 0 and the wrapping is up to the
    * previous element.Default value is <code>true</code>.
    * @returns Value of property <code>linebreakable</code>
    */
  def getLinebreakable(): Boolean = js.native
  
  /**
    * Gets current value of property <code>margin</code>.Prevents any margin of the element if set to
    * false.Default value is <code>true</code>.
    * @returns Value of property <code>margin</code>
    */
  def getMargin(): Boolean = js.native
  
  /**
    * Gets current value of property <code>minWidth</code>.Defines the minimal size in px of an
    * ResponsiveFlowLayout element. The element will be shrunk down to this value.Default value is
    * <code>100</code>.
    * @returns Value of property <code>minWidth</code>
    */
  def getMinWidth(): Double = js.native
  
  /**
    * Gets current value of property <code>weight</code>.Defines the weight of the element, that
    * influences the resulting width. If there are several elements within a row of the
    * ResponsiveFlowLayout, each element could have another weight. The bigger the weight of a single
    * element, the wider it will be stretched, i.e. a bigger weight results in a larger width.Default
    * value is <code>1</code>.
    * @returns Value of property <code>weight</code>
    */
  def getWeight(): Double = js.native
  
  /**
    * Sets a new value for property <code>linebreak</code>.If this property is set, the control in which
    * the LayoutData is added, will always cause a line break within the ResponsiveFlowLayout.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>false</code>.
    * @param bLinebreak New value for property <code>linebreak</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLinebreak(bLinebreak: Boolean): ResponsiveFlowLayoutData = js.native
  
  /**
    * Sets a new value for property <code>linebreakable</code>.Shows if an element can be wrapped into a
    * new row. If this value is set to false, the min-width will be set to 0 and the wrapping is up to the
    * previous element.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>true</code>.
    * @param bLinebreakable New value for property <code>linebreakable</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLinebreakable(bLinebreakable: Boolean): ResponsiveFlowLayoutData = js.native
  
  /**
    * Sets a new value for property <code>margin</code>.Prevents any margin of the element if set to
    * false.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>true</code>.
    * @param bMargin New value for property <code>margin</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMargin(bMargin: Boolean): ResponsiveFlowLayoutData = js.native
  
  /**
    * Sets a new value for property <code>minWidth</code>.Defines the minimal size in px of an
    * ResponsiveFlowLayout element. The element will be shrunk down to this value.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>100</code>.
    * @param iMinWidth New value for property <code>minWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMinWidth(iMinWidth: Double): ResponsiveFlowLayoutData = js.native
  
  /**
    * Sets a new value for property <code>weight</code>.Defines the weight of the element, that influences
    * the resulting width. If there are several elements within a row of the ResponsiveFlowLayout, each
    * element could have another weight. The bigger the weight of a single element, the wider it will be
    * stretched, i.e. a bigger weight results in a larger width.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>1</code>.
    * @param iWeight New value for property <code>weight</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWeight(iWeight: Double): ResponsiveFlowLayoutData = js.native
}
