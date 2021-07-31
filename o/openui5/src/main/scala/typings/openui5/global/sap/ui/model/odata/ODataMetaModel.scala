package typings.openui5.global.sap.ui.model.odata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.model.odata.ODataMetaModel")
@js.native
class ODataMetaModel protected ()
  extends StObject
     with typings.openui5.sap.ui.model.odata.ODataMetaModel {
  /**
    * DO NOT CALL this private constructor for a new <code>ODataMetaModel</code>,but rather use {@link
    * sap.ui.model.odata.ODataModel#getMetaModel getMetaModel} instead!
    * @param oMetadata the OData model's meta data object
    * @param oAnnotations the OData model's annotations object
    * @param oODataModelInterface the private interface object of the OData model which provides friend
    * access to  selected methods
    */
  def this(oMetadata: typings.openui5.sap.ui.model.odata.ODataMetadata) = this()
  def this(
    oMetadata: typings.openui5.sap.ui.model.odata.ODataMetadata,
    oAnnotations: typings.openui5.sap.ui.model.odata.ODataAnnotations
  ) = this()
  def this(
    oMetadata: typings.openui5.sap.ui.model.odata.ODataMetadata,
    oAnnotations: Unit,
    oODataModelInterface: js.Any
  ) = this()
  def this(
    oMetadata: typings.openui5.sap.ui.model.odata.ODataMetadata,
    oAnnotations: typings.openui5.sap.ui.model.odata.ODataAnnotations,
    oODataModelInterface: js.Any
  ) = this()
}
