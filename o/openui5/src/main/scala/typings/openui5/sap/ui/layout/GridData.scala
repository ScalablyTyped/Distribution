package typings.openui5.sap.ui.layout

import typings.openui5.sap.ui.core.LayoutData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridData extends LayoutData {
  
  /**
    * Gets current value of property <code>indent</code>.A string type that represents Grid's span values
    * for large, medium and small screens. Allowed values are separated by space Letters L, M or S
    * followed by number of columns from 1 to 12 that the container has to take, for example: "L2 M4 S6",
    * "M12", "s10" or "l4 m4". Note that the parameters has to be provided in the order large medium
    * small.
    * @returns Value of property <code>indent</code>
    */
  def getIndent(): js.Any = js.native
  
  /**
    * Gets current value of property <code>indentL</code>.Optional. Defines a span value for large
    * screens. This value overwrites the value for large screens defined in the parameter "indent".
    * @returns Value of property <code>indentL</code>
    */
  def getIndentL(): Double = js.native
  
  /**
    * Gets current value of property <code>indentLarge</code>.Deprecated. Defines a span value for large
    * screens. This value overwrites the value for large screens defined in the parameter "indent".
    * @returns Value of property <code>indentLarge</code>
    */
  def getIndentLarge(): Double = js.native
  
  /**
    * Gets current value of property <code>indentM</code>.Optional. Defines a span value for medium size
    * screens. This value overwrites the value for medium screens defined in the parameter "indent".
    * @returns Value of property <code>indentM</code>
    */
  def getIndentM(): Double = js.native
  
  /**
    * Gets current value of property <code>indentMedium</code>.Deprecated. Defines a span value for medium
    * size screens. This value overwrites the value for medium screens defined in the parameter "indent".
    * @returns Value of property <code>indentMedium</code>
    */
  def getIndentMedium(): Double = js.native
  
  /**
    * Gets current value of property <code>indentS</code>.Optional. Defines a span value for small
    * screens. This value overwrites the value for small screens defined in the parameter "indent".
    * @returns Value of property <code>indentS</code>
    */
  def getIndentS(): Double = js.native
  
  /**
    * Gets current value of property <code>indentSmall</code>.Deprecated. Defines a span value for small
    * screens. This value overwrites the value for small screens defined in the parameter "indent".
    * @returns Value of property <code>indentSmall</code>
    */
  def getIndentSmall(): Double = js.native
  
  /**
    * Gets current value of property <code>indentXL</code>.Optional. Defines a span value for extra large
    * screens. This value overwrites the value for extra large screens defined in the parameter "indent".
    * @returns Value of property <code>indentXL</code>
    */
  def getIndentXL(): Double = js.native
  
  /**
    * Gets current value of property <code>linebreak</code>.Optional. If this property is set to true, the
    * control on all-size screens causes a line break within the Grid and becomes the first within the
    * next line.Default value is <code>false</code>.
    * @returns Value of property <code>linebreak</code>
    */
  def getLinebreak(): Boolean = js.native
  
  /**
    * Gets current value of property <code>linebreakL</code>.Optional. If this property is set to true,
    * the control on large screens causes a line break within the Grid and becomes the first within the
    * next line.Default value is <code>false</code>.
    * @returns Value of property <code>linebreakL</code>
    */
  def getLinebreakL(): Boolean = js.native
  
  /**
    * Gets current value of property <code>linebreakM</code>.Optional. If this property is set to true,
    * the control on medium sized screens causes a line break within the Grid and becomes the first within
    * the next line.Default value is <code>false</code>.
    * @returns Value of property <code>linebreakM</code>
    */
  def getLinebreakM(): Boolean = js.native
  
  /**
    * Gets current value of property <code>linebreakS</code>.Optional. If this property is set to true,
    * the control on small screens causes a line break within the Grid and becomes the first within the
    * next line.Default value is <code>false</code>.
    * @returns Value of property <code>linebreakS</code>
    */
  def getLinebreakS(): Boolean = js.native
  
  /**
    * Gets current value of property <code>linebreakXL</code>.Optional. If this property is set to true,
    * the control on extra large screens causes a line break within the Grid and becomes the first within
    * the next line.Default value is <code>false</code>.
    * @returns Value of property <code>linebreakXL</code>
    */
  def getLinebreakXL(): Boolean = js.native
  
  /**
    * Gets current value of property <code>moveBackwards</code>.Optional. Moves a cell backwards so many
    * columns as specified.
    * @returns Value of property <code>moveBackwards</code>
    */
  def getMoveBackwards(): js.Any = js.native
  
  /**
    * Gets current value of property <code>moveForward</code>.Optional. Moves a cell forwards so many
    * columns as specified.
    * @returns Value of property <code>moveForward</code>
    */
  def getMoveForward(): js.Any = js.native
  
  /**
    * Gets current value of property <code>span</code>.A string type that represents Grid's span values
    * for large, medium and small screens. Allowed values are separated by space Letters L, M or S
    * followed by number of columns from 1 to 12 that the container has to take, for example: "L2 M4 S6",
    * "M12", "s10" or "l4 m4". Note that the parameters has to be provided in the order large medium
    * small.
    * @returns Value of property <code>span</code>
    */
  def getSpan(): js.Any = js.native
  
  /**
    * Gets current value of property <code>spanL</code>.Optional. Defines a span value for large screens.
    * This value overwrites the value for large screens defined in the parameter "span".
    * @returns Value of property <code>spanL</code>
    */
  def getSpanL(): Double = js.native
  
  /**
    * Gets current value of property <code>spanLarge</code>.Deprecated. Defines a span value for large
    * screens. This value overwrites the value for large screens defined in the parameter "span".
    * @returns Value of property <code>spanLarge</code>
    */
  def getSpanLarge(): Double = js.native
  
  /**
    * Gets current value of property <code>spanM</code>.Optional. Defines a span value for medium size
    * screens. This value overwrites the value for medium screens defined in the parameter "span".
    * @returns Value of property <code>spanM</code>
    */
  def getSpanM(): Double = js.native
  
  /**
    * Gets current value of property <code>spanMedium</code>.Deprecated. Defines a span value for medium
    * size screens. This value overwrites the value for medium screens defined in the parameter "span".
    * @returns Value of property <code>spanMedium</code>
    */
  def getSpanMedium(): Double = js.native
  
  /**
    * Gets current value of property <code>spanS</code>.Optional. Defines a span value for small screens.
    * This value overwrites the value for small screens defined in the parameter "span".
    * @returns Value of property <code>spanS</code>
    */
  def getSpanS(): Double = js.native
  
  /**
    * Gets current value of property <code>spanSmall</code>.Deprecated. Defines a span value for small
    * screens. This value overwrites the value for small screens defined in the parameter "span".
    * @returns Value of property <code>spanSmall</code>
    */
  def getSpanSmall(): Double = js.native
  
  /**
    * Gets current value of property <code>spanXL</code>.Optional. Defines a span value for extra large
    * screens. This value overwrites the value for extra large screens defined in the parameter "span".
    * @returns Value of property <code>spanXL</code>
    */
  def getSpanXL(): Double = js.native
  
  /**
    * Gets current value of property <code>visibleL</code>.Defines if this Control is visible on Large
    * screens.Default value is <code>true</code>.
    * @returns Value of property <code>visibleL</code>
    */
  def getVisibleL(): Boolean = js.native
  
  /**
    * Gets current value of property <code>visibleM</code>.Defines if this Control is visible on Medium
    * size screens.Default value is <code>true</code>.
    * @returns Value of property <code>visibleM</code>
    */
  def getVisibleM(): Boolean = js.native
  
  /**
    * Gets current value of property <code>visibleOnLarge</code>.Deprecated. Defines if this Control is
    * visible on Large screens.Default value is <code>true</code>.
    * @returns Value of property <code>visibleOnLarge</code>
    */
  def getVisibleOnLarge(): Boolean = js.native
  
  /**
    * Gets current value of property <code>visibleOnMedium</code>.Deprecated. Defines if this Control is
    * visible on Medium size screens.Default value is <code>true</code>.
    * @returns Value of property <code>visibleOnMedium</code>
    */
  def getVisibleOnMedium(): Boolean = js.native
  
  /**
    * Gets current value of property <code>visibleOnSmall</code>.Deprecated. Defines if this Control is
    * visible on small screens.Default value is <code>true</code>.
    * @returns Value of property <code>visibleOnSmall</code>
    */
  def getVisibleOnSmall(): Boolean = js.native
  
  /**
    * Gets current value of property <code>visibleS</code>.Defines if this Control is visible on small
    * screens.Default value is <code>true</code>.
    * @returns Value of property <code>visibleS</code>
    */
  def getVisibleS(): Boolean = js.native
  
  /**
    * Gets current value of property <code>visibleXL</code>.Defines if this Control is visible on XL -
    * extra Large screens.Default value is <code>true</code>.
    * @returns Value of property <code>visibleXL</code>
    */
  def getVisibleXL(): Boolean = js.native
  
  /**
    * Sets a new value for property <code>indent</code>.A string type that represents Grid's span values
    * for large, medium and small screens. Allowed values are separated by space Letters L, M or S
    * followed by number of columns from 1 to 12 that the container has to take, for example: "L2 M4 S6",
    * "M12", "s10" or "l4 m4". Note that the parameters has to be provided in the order large medium
    * small.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sIndent New value for property <code>indent</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIndent(sIndent: js.Any): GridData = js.native
  
  /**
    * Sets a new value for property <code>indentL</code>.Optional. Defines a span value for large screens.
    * This value overwrites the value for large screens defined in the parameter "indent".When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param iIndentL New value for property <code>indentL</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIndentL(iIndentL: Double): GridData = js.native
  
  /**
    * Sets a new value for property <code>indentLarge</code>.Deprecated. Defines a span value for large
    * screens. This value overwrites the value for large screens defined in the parameter "indent".When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param iIndentLarge New value for property <code>indentLarge</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIndentLarge(iIndentLarge: Double): GridData = js.native
  
  /**
    * Sets a new value for property <code>indentM</code>.Optional. Defines a span value for medium size
    * screens. This value overwrites the value for medium screens defined in the parameter "indent".When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param iIndentM New value for property <code>indentM</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIndentM(iIndentM: Double): GridData = js.native
  
  /**
    * Sets a new value for property <code>indentMedium</code>.Deprecated. Defines a span value for medium
    * size screens. This value overwrites the value for medium screens defined in the parameter
    * "indent".When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param iIndentMedium New value for property <code>indentMedium</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIndentMedium(iIndentMedium: Double): GridData = js.native
  
  /**
    * Sets a new value for property <code>indentS</code>.Optional. Defines a span value for small screens.
    * This value overwrites the value for small screens defined in the parameter "indent".When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param iIndentS New value for property <code>indentS</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIndentS(iIndentS: Double): GridData = js.native
  
  /**
    * Sets a new value for property <code>indentSmall</code>.Deprecated. Defines a span value for small
    * screens. This value overwrites the value for small screens defined in the parameter "indent".When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param iIndentSmall New value for property <code>indentSmall</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIndentSmall(iIndentSmall: Double): GridData = js.native
  
  /**
    * Sets a new value for property <code>indentXL</code>.Optional. Defines a span value for extra large
    * screens. This value overwrites the value for extra large screens defined in the parameter
    * "indent".When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param iIndentXL New value for property <code>indentXL</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIndentXL(iIndentXL: Double): GridData = js.native
  
  /**
    * Sets a new value for property <code>linebreak</code>.Optional. If this property is set to true, the
    * control on all-size screens causes a line break within the Grid and becomes the first within the
    * next line.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>false</code>.
    * @param bLinebreak New value for property <code>linebreak</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLinebreak(bLinebreak: Boolean): GridData = js.native
  
  /**
    * Sets a new value for property <code>linebreakL</code>.Optional. If this property is set to true, the
    * control on large screens causes a line break within the Grid and becomes the first within the next
    * line.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>false</code>.
    * @param bLinebreakL New value for property <code>linebreakL</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLinebreakL(bLinebreakL: Boolean): GridData = js.native
  
  /**
    * Sets a new value for property <code>linebreakM</code>.Optional. If this property is set to true, the
    * control on medium sized screens causes a line break within the Grid and becomes the first within the
    * next line.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>false</code>.
    * @param bLinebreakM New value for property <code>linebreakM</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLinebreakM(bLinebreakM: Boolean): GridData = js.native
  
  /**
    * Sets a new value for property <code>linebreakS</code>.Optional. If this property is set to true, the
    * control on small screens causes a line break within the Grid and becomes the first within the next
    * line.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>false</code>.
    * @param bLinebreakS New value for property <code>linebreakS</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLinebreakS(bLinebreakS: Boolean): GridData = js.native
  
  /**
    * Sets a new value for property <code>linebreakXL</code>.Optional. If this property is set to true,
    * the control on extra large screens causes a line break within the Grid and becomes the first within
    * the next line.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>false</code>.
    * @param bLinebreakXL New value for property <code>linebreakXL</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLinebreakXL(bLinebreakXL: Boolean): GridData = js.native
  
  /**
    * Sets a new value for property <code>moveBackwards</code>.Optional. Moves a cell backwards so many
    * columns as specified.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @param sMoveBackwards New value for property <code>moveBackwards</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMoveBackwards(sMoveBackwards: js.Any): GridData = js.native
  
  /**
    * Sets a new value for property <code>moveForward</code>.Optional. Moves a cell forwards so many
    * columns as specified.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @param sMoveForward New value for property <code>moveForward</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMoveForward(sMoveForward: js.Any): GridData = js.native
  
  /**
    * Sets a new value for property <code>span</code>.A string type that represents Grid's span values for
    * large, medium and small screens. Allowed values are separated by space Letters L, M or S followed by
    * number of columns from 1 to 12 that the container has to take, for example: "L2 M4 S6", "M12", "s10"
    * or "l4 m4". Note that the parameters has to be provided in the order large medium small.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.
    * @param sSpan New value for property <code>span</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSpan(sSpan: js.Any): GridData = js.native
  
  /**
    * Sets a new value for property <code>spanL</code>.Optional. Defines a span value for large screens.
    * This value overwrites the value for large screens defined in the parameter "span".When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param iSpanL New value for property <code>spanL</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSpanL(iSpanL: Double): GridData = js.native
  
  /**
    * Sets a new value for property <code>spanLarge</code>.Deprecated. Defines a span value for large
    * screens. This value overwrites the value for large screens defined in the parameter "span".When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param iSpanLarge New value for property <code>spanLarge</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSpanLarge(iSpanLarge: Double): GridData = js.native
  
  /**
    * Sets a new value for property <code>spanM</code>.Optional. Defines a span value for medium size
    * screens. This value overwrites the value for medium screens defined in the parameter "span".When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param iSpanM New value for property <code>spanM</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSpanM(iSpanM: Double): GridData = js.native
  
  /**
    * Sets a new value for property <code>spanMedium</code>.Deprecated. Defines a span value for medium
    * size screens. This value overwrites the value for medium screens defined in the parameter
    * "span".When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param iSpanMedium New value for property <code>spanMedium</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSpanMedium(iSpanMedium: Double): GridData = js.native
  
  /**
    * Sets a new value for property <code>spanS</code>.Optional. Defines a span value for small screens.
    * This value overwrites the value for small screens defined in the parameter "span".When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param iSpanS New value for property <code>spanS</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSpanS(iSpanS: Double): GridData = js.native
  
  /**
    * Sets a new value for property <code>spanSmall</code>.Deprecated. Defines a span value for small
    * screens. This value overwrites the value for small screens defined in the parameter "span".When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param iSpanSmall New value for property <code>spanSmall</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSpanSmall(iSpanSmall: Double): GridData = js.native
  
  /**
    * Sets a new value for property <code>spanXL</code>.Optional. Defines a span value for extra large
    * screens. This value overwrites the value for extra large screens defined in the parameter
    * "span".When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param iSpanXL New value for property <code>spanXL</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSpanXL(iSpanXL: Double): GridData = js.native
  
  /**
    * Sets a new value for property <code>visibleL</code>.Defines if this Control is visible on Large
    * screens.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @param bVisibleL New value for property <code>visibleL</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisibleL(bVisibleL: Boolean): GridData = js.native
  
  /**
    * Sets a new value for property <code>visibleM</code>.Defines if this Control is visible on Medium
    * size screens.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>true</code>.
    * @param bVisibleM New value for property <code>visibleM</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisibleM(bVisibleM: Boolean): GridData = js.native
  
  /**
    * Sets a new value for property <code>visibleOnLarge</code>.Deprecated. Defines if this Control is
    * visible on Large screens.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>true</code>.
    * @param bVisibleOnLarge New value for property <code>visibleOnLarge</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisibleOnLarge(bVisibleOnLarge: Boolean): GridData = js.native
  
  /**
    * Sets a new value for property <code>visibleOnMedium</code>.Deprecated. Defines if this Control is
    * visible on Medium size screens.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bVisibleOnMedium New value for property <code>visibleOnMedium</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisibleOnMedium(bVisibleOnMedium: Boolean): GridData = js.native
  
  /**
    * Sets a new value for property <code>visibleOnSmall</code>.Deprecated. Defines if this Control is
    * visible on small screens.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>true</code>.
    * @param bVisibleOnSmall New value for property <code>visibleOnSmall</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisibleOnSmall(bVisibleOnSmall: Boolean): GridData = js.native
  
  /**
    * Sets a new value for property <code>visibleS</code>.Defines if this Control is visible on small
    * screens.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @param bVisibleS New value for property <code>visibleS</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisibleS(bVisibleS: Boolean): GridData = js.native
  
  /**
    * Sets a new value for property <code>visibleXL</code>.Defines if this Control is visible on XL -
    * extra Large screens.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>true</code>.
    * @param bVisibleXL New value for property <code>visibleXL</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisibleXL(bVisibleXL: Boolean): GridData = js.native
}
