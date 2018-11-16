package typings
package openui5Lib.sapNs.uiNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.GridData")
@js.native
class GridData protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.LayoutData {
  /**
           * Constructor for a new GridData.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId id for the new control, generated automatically if no id is given
           * @param mSettings initial settings for the new control
          */
  def this(sId: java.lang.String) = this()
  /**
           * Constructor for a new GridData.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId id for the new control, generated automatically if no id is given
           * @param mSettings initial settings for the new control
          */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
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
  def getIndentL(): scala.Double = js.native
  /**
           * Gets current value of property <code>indentLarge</code>.Deprecated. Defines a span value for large
           * screens. This value overwrites the value for large screens defined in the parameter "indent".
           * @returns Value of property <code>indentLarge</code>
          */
  def getIndentLarge(): scala.Double = js.native
  /**
           * Gets current value of property <code>indentM</code>.Optional. Defines a span value for medium size
           * screens. This value overwrites the value for medium screens defined in the parameter "indent".
           * @returns Value of property <code>indentM</code>
          */
  def getIndentM(): scala.Double = js.native
  /**
           * Gets current value of property <code>indentMedium</code>.Deprecated. Defines a span value for medium
           * size screens. This value overwrites the value for medium screens defined in the parameter "indent".
           * @returns Value of property <code>indentMedium</code>
          */
  def getIndentMedium(): scala.Double = js.native
  /**
           * Gets current value of property <code>indentS</code>.Optional. Defines a span value for small
           * screens. This value overwrites the value for small screens defined in the parameter "indent".
           * @returns Value of property <code>indentS</code>
          */
  def getIndentS(): scala.Double = js.native
  /**
           * Gets current value of property <code>indentSmall</code>.Deprecated. Defines a span value for small
           * screens. This value overwrites the value for small screens defined in the parameter "indent".
           * @returns Value of property <code>indentSmall</code>
          */
  def getIndentSmall(): scala.Double = js.native
  /**
           * Gets current value of property <code>indentXL</code>.Optional. Defines a span value for extra large
           * screens. This value overwrites the value for extra large screens defined in the parameter "indent".
           * @returns Value of property <code>indentXL</code>
          */
  def getIndentXL(): scala.Double = js.native
  /**
           * Gets current value of property <code>linebreak</code>.Optional. If this property is set to true, the
           * control on all-size screens causes a line break within the Grid and becomes the first within the
           * next line.Default value is <code>false</code>.
           * @returns Value of property <code>linebreak</code>
          */
  def getLinebreak(): scala.Boolean = js.native
  /**
           * Gets current value of property <code>linebreakL</code>.Optional. If this property is set to true,
           * the control on large screens causes a line break within the Grid and becomes the first within the
           * next line.Default value is <code>false</code>.
           * @returns Value of property <code>linebreakL</code>
          */
  def getLinebreakL(): scala.Boolean = js.native
  /**
           * Gets current value of property <code>linebreakM</code>.Optional. If this property is set to true,
           * the control on medium sized screens causes a line break within the Grid and becomes the first within
           * the next line.Default value is <code>false</code>.
           * @returns Value of property <code>linebreakM</code>
          */
  def getLinebreakM(): scala.Boolean = js.native
  /**
           * Gets current value of property <code>linebreakS</code>.Optional. If this property is set to true,
           * the control on small screens causes a line break within the Grid and becomes the first within the
           * next line.Default value is <code>false</code>.
           * @returns Value of property <code>linebreakS</code>
          */
  def getLinebreakS(): scala.Boolean = js.native
  /**
           * Gets current value of property <code>linebreakXL</code>.Optional. If this property is set to true,
           * the control on extra large screens causes a line break within the Grid and becomes the first within
           * the next line.Default value is <code>false</code>.
           * @returns Value of property <code>linebreakXL</code>
          */
  def getLinebreakXL(): scala.Boolean = js.native
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
  def getSpanL(): scala.Double = js.native
  /**
           * Gets current value of property <code>spanLarge</code>.Deprecated. Defines a span value for large
           * screens. This value overwrites the value for large screens defined in the parameter "span".
           * @returns Value of property <code>spanLarge</code>
          */
  def getSpanLarge(): scala.Double = js.native
  /**
           * Gets current value of property <code>spanM</code>.Optional. Defines a span value for medium size
           * screens. This value overwrites the value for medium screens defined in the parameter "span".
           * @returns Value of property <code>spanM</code>
          */
  def getSpanM(): scala.Double = js.native
  /**
           * Gets current value of property <code>spanMedium</code>.Deprecated. Defines a span value for medium
           * size screens. This value overwrites the value for medium screens defined in the parameter "span".
           * @returns Value of property <code>spanMedium</code>
          */
  def getSpanMedium(): scala.Double = js.native
  /**
           * Gets current value of property <code>spanS</code>.Optional. Defines a span value for small screens.
           * This value overwrites the value for small screens defined in the parameter "span".
           * @returns Value of property <code>spanS</code>
          */
  def getSpanS(): scala.Double = js.native
  /**
           * Gets current value of property <code>spanSmall</code>.Deprecated. Defines a span value for small
           * screens. This value overwrites the value for small screens defined in the parameter "span".
           * @returns Value of property <code>spanSmall</code>
          */
  def getSpanSmall(): scala.Double = js.native
  /**
           * Gets current value of property <code>spanXL</code>.Optional. Defines a span value for extra large
           * screens. This value overwrites the value for extra large screens defined in the parameter "span".
           * @returns Value of property <code>spanXL</code>
          */
  def getSpanXL(): scala.Double = js.native
  /**
           * Gets current value of property <code>visibleL</code>.Defines if this Control is visible on Large
           * screens.Default value is <code>true</code>.
           * @returns Value of property <code>visibleL</code>
          */
  def getVisibleL(): scala.Boolean = js.native
  /**
           * Gets current value of property <code>visibleM</code>.Defines if this Control is visible on Medium
           * size screens.Default value is <code>true</code>.
           * @returns Value of property <code>visibleM</code>
          */
  def getVisibleM(): scala.Boolean = js.native
  /**
           * Gets current value of property <code>visibleOnLarge</code>.Deprecated. Defines if this Control is
           * visible on Large screens.Default value is <code>true</code>.
           * @returns Value of property <code>visibleOnLarge</code>
          */
  def getVisibleOnLarge(): scala.Boolean = js.native
  /**
           * Gets current value of property <code>visibleOnMedium</code>.Deprecated. Defines if this Control is
           * visible on Medium size screens.Default value is <code>true</code>.
           * @returns Value of property <code>visibleOnMedium</code>
          */
  def getVisibleOnMedium(): scala.Boolean = js.native
  /**
           * Gets current value of property <code>visibleOnSmall</code>.Deprecated. Defines if this Control is
           * visible on small screens.Default value is <code>true</code>.
           * @returns Value of property <code>visibleOnSmall</code>
          */
  def getVisibleOnSmall(): scala.Boolean = js.native
  /**
           * Gets current value of property <code>visibleS</code>.Defines if this Control is visible on small
           * screens.Default value is <code>true</code>.
           * @returns Value of property <code>visibleS</code>
          */
  def getVisibleS(): scala.Boolean = js.native
  /**
           * Gets current value of property <code>visibleXL</code>.Defines if this Control is visible on XL -
           * extra Large screens.Default value is <code>true</code>.
           * @returns Value of property <code>visibleXL</code>
          */
  def getVisibleXL(): scala.Boolean = js.native
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
  def setIndentL(iIndentL: scala.Double): GridData = js.native
  /**
           * Sets a new value for property <code>indentLarge</code>.Deprecated. Defines a span value for large
           * screens. This value overwrites the value for large screens defined in the parameter "indent".When
           * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
           * property will be restored.
           * @param iIndentLarge New value for property <code>indentLarge</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setIndentLarge(iIndentLarge: scala.Double): GridData = js.native
  /**
           * Sets a new value for property <code>indentM</code>.Optional. Defines a span value for medium size
           * screens. This value overwrites the value for medium screens defined in the parameter "indent".When
           * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
           * property will be restored.
           * @param iIndentM New value for property <code>indentM</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setIndentM(iIndentM: scala.Double): GridData = js.native
  /**
           * Sets a new value for property <code>indentMedium</code>.Deprecated. Defines a span value for medium
           * size screens. This value overwrites the value for medium screens defined in the parameter
           * "indent".When called with a value of <code>null</code> or <code>undefined</code>, the default value
           * of the property will be restored.
           * @param iIndentMedium New value for property <code>indentMedium</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setIndentMedium(iIndentMedium: scala.Double): GridData = js.native
  /**
           * Sets a new value for property <code>indentS</code>.Optional. Defines a span value for small screens.
           * This value overwrites the value for small screens defined in the parameter "indent".When called with
           * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
           * restored.
           * @param iIndentS New value for property <code>indentS</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setIndentS(iIndentS: scala.Double): GridData = js.native
  /**
           * Sets a new value for property <code>indentSmall</code>.Deprecated. Defines a span value for small
           * screens. This value overwrites the value for small screens defined in the parameter "indent".When
           * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
           * property will be restored.
           * @param iIndentSmall New value for property <code>indentSmall</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setIndentSmall(iIndentSmall: scala.Double): GridData = js.native
  /**
           * Sets a new value for property <code>indentXL</code>.Optional. Defines a span value for extra large
           * screens. This value overwrites the value for extra large screens defined in the parameter
           * "indent".When called with a value of <code>null</code> or <code>undefined</code>, the default value
           * of the property will be restored.
           * @param iIndentXL New value for property <code>indentXL</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setIndentXL(iIndentXL: scala.Double): GridData = js.native
  /**
           * Sets a new value for property <code>linebreak</code>.Optional. If this property is set to true, the
           * control on all-size screens causes a line break within the Grid and becomes the first within the
           * next line.When called with a value of <code>null</code> or <code>undefined</code>, the default value
           * of the property will be restored.Default value is <code>false</code>.
           * @param bLinebreak New value for property <code>linebreak</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setLinebreak(bLinebreak: scala.Boolean): GridData = js.native
  /**
           * Sets a new value for property <code>linebreakL</code>.Optional. If this property is set to true, the
           * control on large screens causes a line break within the Grid and becomes the first within the next
           * line.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
           * the property will be restored.Default value is <code>false</code>.
           * @param bLinebreakL New value for property <code>linebreakL</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setLinebreakL(bLinebreakL: scala.Boolean): GridData = js.native
  /**
           * Sets a new value for property <code>linebreakM</code>.Optional. If this property is set to true, the
           * control on medium sized screens causes a line break within the Grid and becomes the first within the
           * next line.When called with a value of <code>null</code> or <code>undefined</code>, the default value
           * of the property will be restored.Default value is <code>false</code>.
           * @param bLinebreakM New value for property <code>linebreakM</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setLinebreakM(bLinebreakM: scala.Boolean): GridData = js.native
  /**
           * Sets a new value for property <code>linebreakS</code>.Optional. If this property is set to true, the
           * control on small screens causes a line break within the Grid and becomes the first within the next
           * line.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
           * the property will be restored.Default value is <code>false</code>.
           * @param bLinebreakS New value for property <code>linebreakS</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setLinebreakS(bLinebreakS: scala.Boolean): GridData = js.native
  /**
           * Sets a new value for property <code>linebreakXL</code>.Optional. If this property is set to true,
           * the control on extra large screens causes a line break within the Grid and becomes the first within
           * the next line.When called with a value of <code>null</code> or <code>undefined</code>, the default
           * value of the property will be restored.Default value is <code>false</code>.
           * @param bLinebreakXL New value for property <code>linebreakXL</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setLinebreakXL(bLinebreakXL: scala.Boolean): GridData = js.native
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
  def setSpanL(iSpanL: scala.Double): GridData = js.native
  /**
           * Sets a new value for property <code>spanLarge</code>.Deprecated. Defines a span value for large
           * screens. This value overwrites the value for large screens defined in the parameter "span".When
           * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
           * property will be restored.
           * @param iSpanLarge New value for property <code>spanLarge</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setSpanLarge(iSpanLarge: scala.Double): GridData = js.native
  /**
           * Sets a new value for property <code>spanM</code>.Optional. Defines a span value for medium size
           * screens. This value overwrites the value for medium screens defined in the parameter "span".When
           * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
           * property will be restored.
           * @param iSpanM New value for property <code>spanM</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setSpanM(iSpanM: scala.Double): GridData = js.native
  /**
           * Sets a new value for property <code>spanMedium</code>.Deprecated. Defines a span value for medium
           * size screens. This value overwrites the value for medium screens defined in the parameter
           * "span".When called with a value of <code>null</code> or <code>undefined</code>, the default value of
           * the property will be restored.
           * @param iSpanMedium New value for property <code>spanMedium</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setSpanMedium(iSpanMedium: scala.Double): GridData = js.native
  /**
           * Sets a new value for property <code>spanS</code>.Optional. Defines a span value for small screens.
           * This value overwrites the value for small screens defined in the parameter "span".When called with a
           * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
           * restored.
           * @param iSpanS New value for property <code>spanS</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setSpanS(iSpanS: scala.Double): GridData = js.native
  /**
           * Sets a new value for property <code>spanSmall</code>.Deprecated. Defines a span value for small
           * screens. This value overwrites the value for small screens defined in the parameter "span".When
           * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
           * property will be restored.
           * @param iSpanSmall New value for property <code>spanSmall</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setSpanSmall(iSpanSmall: scala.Double): GridData = js.native
  /**
           * Sets a new value for property <code>spanXL</code>.Optional. Defines a span value for extra large
           * screens. This value overwrites the value for extra large screens defined in the parameter
           * "span".When called with a value of <code>null</code> or <code>undefined</code>, the default value of
           * the property will be restored.
           * @param iSpanXL New value for property <code>spanXL</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setSpanXL(iSpanXL: scala.Double): GridData = js.native
  /**
           * Sets a new value for property <code>visibleL</code>.Defines if this Control is visible on Large
           * screens.When called with a value of <code>null</code> or <code>undefined</code>, the default value
           * of the property will be restored.Default value is <code>true</code>.
           * @param bVisibleL New value for property <code>visibleL</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setVisibleL(bVisibleL: scala.Boolean): GridData = js.native
  /**
           * Sets a new value for property <code>visibleM</code>.Defines if this Control is visible on Medium
           * size screens.When called with a value of <code>null</code> or <code>undefined</code>, the default
           * value of the property will be restored.Default value is <code>true</code>.
           * @param bVisibleM New value for property <code>visibleM</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setVisibleM(bVisibleM: scala.Boolean): GridData = js.native
  /**
           * Sets a new value for property <code>visibleOnLarge</code>.Deprecated. Defines if this Control is
           * visible on Large screens.When called with a value of <code>null</code> or <code>undefined</code>,
           * the default value of the property will be restored.Default value is <code>true</code>.
           * @param bVisibleOnLarge New value for property <code>visibleOnLarge</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setVisibleOnLarge(bVisibleOnLarge: scala.Boolean): GridData = js.native
  /**
           * Sets a new value for property <code>visibleOnMedium</code>.Deprecated. Defines if this Control is
           * visible on Medium size screens.When called with a value of <code>null</code> or
           * <code>undefined</code>, the default value of the property will be restored.Default value is
           * <code>true</code>.
           * @param bVisibleOnMedium New value for property <code>visibleOnMedium</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setVisibleOnMedium(bVisibleOnMedium: scala.Boolean): GridData = js.native
  /**
           * Sets a new value for property <code>visibleOnSmall</code>.Deprecated. Defines if this Control is
           * visible on small screens.When called with a value of <code>null</code> or <code>undefined</code>,
           * the default value of the property will be restored.Default value is <code>true</code>.
           * @param bVisibleOnSmall New value for property <code>visibleOnSmall</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setVisibleOnSmall(bVisibleOnSmall: scala.Boolean): GridData = js.native
  /**
           * Sets a new value for property <code>visibleS</code>.Defines if this Control is visible on small
           * screens.When called with a value of <code>null</code> or <code>undefined</code>, the default value
           * of the property will be restored.Default value is <code>true</code>.
           * @param bVisibleS New value for property <code>visibleS</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setVisibleS(bVisibleS: scala.Boolean): GridData = js.native
  /**
           * Sets a new value for property <code>visibleXL</code>.Defines if this Control is visible on XL -
           * extra Large screens.When called with a value of <code>null</code> or <code>undefined</code>, the
           * default value of the property will be restored.Default value is <code>true</code>.
           * @param bVisibleXL New value for property <code>visibleXL</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setVisibleXL(bVisibleXL: scala.Boolean): GridData = js.native
}

