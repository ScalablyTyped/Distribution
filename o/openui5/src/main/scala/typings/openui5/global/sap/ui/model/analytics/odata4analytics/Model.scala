package typings.openui5.global.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.Model")
@js.native
class Model protected ()
  extends typings.openui5.sap.ui.model.analytics.odata4analytics.Model {
  /**
    * Create a representation of the analytical semantics of OData service metadata
    * @param oModelReference An instance of ReferenceByURI, ReferenceByModel or          
    * ReferenceWithWorkaround for locating the OData service.
    * @param mParameter Additional parameters for controlling the model construction. Currently supported
    * are:           <li> sAnnotationJSONDoc - A JSON document providing extra annotations to the elements
    * of the                structure of the given service           </li>           <li> modelVersion -
    * Parameter to define which ODataModel version should be used, in you use               
    * 'odata4analytics.Model.ReferenceByURI': 1 (default), 2                see also:
    * AnalyticalVersionInfo constants           </li>
    */
  def this(oModelReference: js.Any) = this()
  def this(oModelReference: js.Any, mParameter: js.Any) = this()
}

@JSGlobal("sap.ui.model.analytics.odata4analytics.Model")
@js.native
object Model extends js.Object {
  @js.native
  class ReferenceByModel protected ()
    extends typings.openui5.sap.ui.model.analytics.odata4analytics.Model.ReferenceByModel {
    /**
      * Create a reference to an OData model already loaded elsewhere with the helpof SAP UI5.
      * @param oModel holding the OData model.
      */
    def this(oModel: js.Any) = this()
  }
  
  @js.native
  class ReferenceByURI protected ()
    extends typings.openui5.sap.ui.model.analytics.odata4analytics.Model.ReferenceByURI {
    /**
      * Create a reference to an OData model by the URI of the related OData service.
      * @param sURI holding the URI.
      */
    def this(sURI: String) = this()
  }
  
  @js.native
  class ReferenceWithWorkaround protected ()
    extends typings.openui5.sap.ui.model.analytics.odata4analytics.Model.ReferenceWithWorkaround {
    /**
      * Create a reference to an OData model having certain workarounds activated. Aworkaround is an
      * implementation that changes the standard behavior of the APIto overcome some gap or limitation in
      * the OData provider. The workaroundimplementation can be conditionally activated by passing the
      * identifier inthe contructor.Known workaround identifiers are:<li>"CreateLabelsFromTechnicalNames" -
      * If a property has no label text, itgets generated from the property
      * name.</li><li>"IdentifyTextPropertiesByName" -If a dimension property has no text andanother
      * property with the same name and an appended "Name", "Text" etc.exists, they are linked via
      * annotation.</li>
      * @param oModel holding a reference to the OData model, obtained           by
      * odata4analytics.Model.ReferenceByModel or by           sap.odata4analytics.Model.ReferenceByURI.
      * @param aWorkaroundID listing all workarounds to be applied.
      */
    def this(oModel: js.Any, aWorkaroundID: js.Array[String]) = this()
  }
  
}

