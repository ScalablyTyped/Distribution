package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.PageAccessibleLandmarkInfo")
@js.native
class PageAccessibleLandmarkInfo protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Element {
  /**
         * Constructor for a new <code>sap.m.PageAccessibleLandmarkInfo</code> element.Accepts an object
         * literal <code>mSettings</code> that defines initialproperty values, aggregated and associated
         * objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general
         * description of the syntax of the settings object.
         * @param sId Id for the new element, generated automatically if no id is given
         * @param mSettings Initial settings for the new element
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new <code>sap.m.PageAccessibleLandmarkInfo</code> element.Accepts an object
         * literal <code>mSettings</code> that defines initialproperty values, aggregated and associated
         * objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general
         * description of the syntax of the settings object.
         * @param sId Id for the new element, generated automatically if no id is given
         * @param mSettings Initial settings for the new element
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Gets current value of property <code>contentLabel</code>.Texts which describes the landmark of the
         * content container of the corresponding <code>sap.m.Page</code> control.If not set (and a landmark
         * different than <code>sap.ui.core.AccessibleLandmarkRole.None</code> is defined), a predefined textis
         * used.
         * @returns Value of property <code>contentLabel</code>
        */
  def getContentLabel(): java.lang.String = js.native
  /**
         * Gets current value of property <code>contentRole</code>.Landmark role of the content container of
         * the corresponding <code>sap.m.Page</code> control.If set to
         * <code>sap.ui.core.AccessibleLandmarkRole.None</code>, no landmark will be added to the
         * container.Default value is <code>Main</code>.
         * @returns Value of property <code>contentRole</code>
        */
  def getContentRole(): openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole = js.native
  /**
         * Gets current value of property <code>footerLabel</code>.Texts which describes the landmark of the
         * header container of the corresponding <code>sap.m.Page</code> control.If not set (and a landmark
         * different than <code>sap.ui.core.AccessibleLandmarkRole.None</code> is defined), a predefined textis
         * used.
         * @returns Value of property <code>footerLabel</code>
        */
  def getFooterLabel(): java.lang.String = js.native
  /**
         * Gets current value of property <code>footerRole</code>.Landmark role of the footer container of the
         * corresponding <code>sap.m.Page</code> control.If set to
         * <code>sap.ui.core.AccessibleLandmarkRole.None</code>, no landmark will be added to the
         * container.Default value is <code>Region</code>.
         * @returns Value of property <code>footerRole</code>
        */
  def getFooterRole(): openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole = js.native
  /**
         * Gets current value of property <code>headerLabel</code>.Texts which describes the landmark of the
         * header container of the corresponding <code>sap.m.Page</code> control.If not set (and a landmark
         * different than <code>sap.ui.core.AccessibleLandmarkRole.None</code> is defined), a predefined textis
         * used.
         * @returns Value of property <code>headerLabel</code>
        */
  def getHeaderLabel(): java.lang.String = js.native
  /**
         * Gets current value of property <code>headerRole</code>.Landmark role of the header container of the
         * corresponding <code>sap.m.Page</code> control.If set to
         * <code>sap.ui.core.AccessibleLandmarkRole.None</code>, no landmark will be added to the
         * container.Default value is <code>Region</code>.
         * @returns Value of property <code>headerRole</code>
        */
  def getHeaderRole(): openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole = js.native
  /**
         * Gets current value of property <code>rootLabel</code>.Texts which describes the landmark of the root
         * container of the corresponding <code>sap.m.Page</code> control.If not set (and a landmark different
         * than <code>sap.ui.core.AccessibleLandmarkRole.None</code> is defined), a predefined textis used.
         * @returns Value of property <code>rootLabel</code>
        */
  def getRootLabel(): java.lang.String = js.native
  /**
         * Gets current value of property <code>rootRole</code>.Landmark role of the root container of the
         * corresponding <code>sap.m.Page</code> control.If set to
         * <code>sap.ui.core.AccessibleLandmarkRole.None</code>, no landmark will be added to the
         * container.Default value is <code>Region</code>.
         * @returns Value of property <code>rootRole</code>
        */
  def getRootRole(): openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole = js.native
  /**
         * Gets current value of property <code>subHeaderLabel</code>.Texts which describes the landmark of the
         * subheader container of the corresponding <code>sap.m.Page</code> control.If not set (and a landmark
         * different than <code>sap.ui.core.AccessibleLandmarkRole.None</code> is defined), a predefined textis
         * used.
         * @returns Value of property <code>subHeaderLabel</code>
        */
  def getSubHeaderLabel(): java.lang.String = js.native
  /**
         * Gets current value of property <code>subHeaderRole</code>.Landmark role of the subheader container
         * of the corresponding <code>sap.m.Page</code> control.If set to
         * <code>sap.ui.core.AccessibleLandmarkRole.None</code>, no landmark will be added to the container.
         * @returns Value of property <code>subHeaderRole</code>
        */
  def getSubHeaderRole(): openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole = js.native
  /**
         * Sets a new value for property <code>contentLabel</code>.Texts which describes the landmark of the
         * content container of the corresponding <code>sap.m.Page</code> control.If not set (and a landmark
         * different than <code>sap.ui.core.AccessibleLandmarkRole.None</code> is defined), a predefined textis
         * used.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
         * the property will be restored.
         * @param sContentLabel New value for property <code>contentLabel</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setContentLabel(sContentLabel: java.lang.String): PageAccessibleLandmarkInfo = js.native
  /**
         * Sets a new value for property <code>contentRole</code>.Landmark role of the content container of the
         * corresponding <code>sap.m.Page</code> control.If set to
         * <code>sap.ui.core.AccessibleLandmarkRole.None</code>, no landmark will be added to the
         * container.When called with a value of <code>null</code> or <code>undefined</code>, the default value
         * of the property will be restored.Default value is <code>Main</code>.
         * @param sContentRole New value for property <code>contentRole</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setContentRole(sContentRole: openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole): PageAccessibleLandmarkInfo = js.native
  /**
         * Sets a new value for property <code>footerLabel</code>.Texts which describes the landmark of the
         * header container of the corresponding <code>sap.m.Page</code> control.If not set (and a landmark
         * different than <code>sap.ui.core.AccessibleLandmarkRole.None</code> is defined), a predefined textis
         * used.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
         * the property will be restored.
         * @param sFooterLabel New value for property <code>footerLabel</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setFooterLabel(sFooterLabel: java.lang.String): PageAccessibleLandmarkInfo = js.native
  /**
         * Sets a new value for property <code>footerRole</code>.Landmark role of the footer container of the
         * corresponding <code>sap.m.Page</code> control.If set to
         * <code>sap.ui.core.AccessibleLandmarkRole.None</code>, no landmark will be added to the
         * container.When called with a value of <code>null</code> or <code>undefined</code>, the default value
         * of the property will be restored.Default value is <code>Region</code>.
         * @param sFooterRole New value for property <code>footerRole</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setFooterRole(sFooterRole: openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole): PageAccessibleLandmarkInfo = js.native
  /**
         * Sets a new value for property <code>headerLabel</code>.Texts which describes the landmark of the
         * header container of the corresponding <code>sap.m.Page</code> control.If not set (and a landmark
         * different than <code>sap.ui.core.AccessibleLandmarkRole.None</code> is defined), a predefined textis
         * used.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
         * the property will be restored.
         * @param sHeaderLabel New value for property <code>headerLabel</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setHeaderLabel(sHeaderLabel: java.lang.String): PageAccessibleLandmarkInfo = js.native
  /**
         * Sets a new value for property <code>headerRole</code>.Landmark role of the header container of the
         * corresponding <code>sap.m.Page</code> control.If set to
         * <code>sap.ui.core.AccessibleLandmarkRole.None</code>, no landmark will be added to the
         * container.When called with a value of <code>null</code> or <code>undefined</code>, the default value
         * of the property will be restored.Default value is <code>Region</code>.
         * @param sHeaderRole New value for property <code>headerRole</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setHeaderRole(sHeaderRole: openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole): PageAccessibleLandmarkInfo = js.native
  /**
         * Sets a new value for property <code>rootLabel</code>.Texts which describes the landmark of the root
         * container of the corresponding <code>sap.m.Page</code> control.If not set (and a landmark different
         * than <code>sap.ui.core.AccessibleLandmarkRole.None</code> is defined), a predefined textis used.When
         * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
         * property will be restored.
         * @param sRootLabel New value for property <code>rootLabel</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setRootLabel(sRootLabel: java.lang.String): PageAccessibleLandmarkInfo = js.native
  /**
         * Sets a new value for property <code>rootRole</code>.Landmark role of the root container of the
         * corresponding <code>sap.m.Page</code> control.If set to
         * <code>sap.ui.core.AccessibleLandmarkRole.None</code>, no landmark will be added to the
         * container.When called with a value of <code>null</code> or <code>undefined</code>, the default value
         * of the property will be restored.Default value is <code>Region</code>.
         * @param sRootRole New value for property <code>rootRole</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setRootRole(sRootRole: openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole): PageAccessibleLandmarkInfo = js.native
  /**
         * Sets a new value for property <code>subHeaderLabel</code>.Texts which describes the landmark of the
         * subheader container of the corresponding <code>sap.m.Page</code> control.If not set (and a landmark
         * different than <code>sap.ui.core.AccessibleLandmarkRole.None</code> is defined), a predefined textis
         * used.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
         * the property will be restored.
         * @param sSubHeaderLabel New value for property <code>subHeaderLabel</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setSubHeaderLabel(sSubHeaderLabel: java.lang.String): PageAccessibleLandmarkInfo = js.native
  /**
         * Sets a new value for property <code>subHeaderRole</code>.Landmark role of the subheader container of
         * the corresponding <code>sap.m.Page</code> control.If set to
         * <code>sap.ui.core.AccessibleLandmarkRole.None</code>, no landmark will be added to the
         * container.When called with a value of <code>null</code> or <code>undefined</code>, the default value
         * of the property will be restored.
         * @param sSubHeaderRole New value for property <code>subHeaderRole</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setSubHeaderRole(sSubHeaderRole: openui5Lib.sapNs.uiNs.coreNs.AccessibleLandmarkRole): PageAccessibleLandmarkInfo = js.native
}

