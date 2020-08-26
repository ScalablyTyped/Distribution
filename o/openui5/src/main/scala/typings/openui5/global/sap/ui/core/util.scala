package typings.openui5.global.sap.ui.core

import typings.openui5.sap.ui.core.mvc.HTMLView
import typings.openui5.sap.ui.core.mvc.XMLView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.util")
@js.native
object util extends js.Object {
  @js.native
  class Export protected ()
    extends typings.openui5.sap.ui.core.util.Export {
    /**
      * Constructor for a new Export.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @js.native
  class ExportCell protected ()
    extends typings.openui5.sap.ui.core.util.ExportCell {
    /**
      * Constructor for a new ExportCell.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @js.native
  class ExportColumn protected ()
    extends typings.openui5.sap.ui.core.util.ExportColumn {
    /**
      * Constructor for a new ExportCell.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @js.native
  class ExportRow protected ()
    extends typings.openui5.sap.ui.core.util.ExportRow {
    /**
      * Constructor for a new ExportRow.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @js.native
  class ExportType protected ()
    extends typings.openui5.sap.ui.core.util.ExportType {
    /**
      * Constructor for a new ExportType.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @js.native
  class ExportTypeCSV protected ()
    extends typings.openui5.sap.ui.core.util.ExportTypeCSV {
    /**
      * Constructor for a new ExportTypeCSV.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @js.native
  abstract class MockServer protected ()
    extends typings.openui5.sap.ui.core.util.MockServer {
    /**
      * Creates a mocked server. This helps to mock all or some backend calls, e.g. for OData/JSON Models or
      * simple XHR calls, withoutchanging the application code. This class can also be used for qunit
      * tests.Accepts an object literal <code>mSettings</code> that defines initialproperty values,
      * aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId id for the new server object; generated automatically if no non-empty id is given    
      * Note: this can be omitted, no matter whether <code>mSettings</code> will be given or not!
      * @param mSettings optional map/JSON-object with initial property values, aggregated objects etc. for
      * the new object
      * @param oScope scope object for resolving string based type and formatter references in bindings
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
    def this(sId: String, mSettings: js.UndefOr[scala.Nothing], oScope: js.Any) = this()
    def this(sId: String, mSettings: js.Any, oScope: js.Any) = this()
  }
  
  @js.native
  object File extends js.Object {
    /**
      * <p>Triggers a download / save action of the given file.</p><p>There are limitations for this feature
      * in some browsers:<p><p><b>Internet Explorer 8 / 9</b><br>Some file extensions on some operating
      * systems are not working due to a bug in IE.Therefore 'txt' will be used as file extension if the
      * problem is occurring.</p><p><b>Safari (OS X / iOS)</b><br>A new window/tab will be opened. In OS X
      * the user has to manually save the file (CMD + S), choose "page source" and specify a filename.In iOS
      * the content can be opened in another app (Mail, Notes, ...) or copied to the clipboard.In case the
      * popup blocker prevents this action, an error will be thrown which can be used to notify the user to
      * disable it.</p><p><b>Android Browser</b><br>Not supported</p>
      * @param sData file content
      * @param sFileName file name
      * @param sFileExtension file extension
      * @param sMimeType file mime-type
      * @param sCharset file charset
      */
    def save(sData: String, sFileName: String, sFileExtension: String, sMimeType: String, sCharset: String): Unit = js.native
  }
  
  @js.native
  object serializer extends js.Object {
    @js.native
    class HTMLViewSerializer protected ()
      extends typings.openui5.sap.ui.core.util.serializer.HTMLViewSerializer {
      /**
        * HTML view serializer class. Serializes a given view.
        * @param oView the view to serialize
        * @param oWindow the window object. Default is the window object the instance of the serializer is
        * running in
        * @param fnGetControlId delegate function which returns the control id
        * @param fnGetEventHandlerName delegate function which returns the event handler name
        */
      def this(oView: HTMLView, oWindow: js.Any, fnGetControlId: js.Any, fnGetEventHandlerName: js.Any) = this()
    }
    
    @js.native
    class Serializer protected ()
      extends typings.openui5.sap.ui.core.util.serializer.Serializer {
      /**
        * Serializer class. Iterates over all controls and call a given serializer delegate.
        * @param oRootControl the root control to serialize
        * @param serializeDelegate the serializer delegate. Has to implement start/middle/end methods.
        * @param bSkipRoot whether to skip the root node or not
        * @param fnSkipAggregations whether to skip aggregations
        * @param fnSkipElement whether to skip an element
        */
      def this(
        oRootControl: typings.openui5.sap.ui.core.Control,
        serializeDelegate: js.Any,
        bSkipRoot: Boolean,
        fnSkipAggregations: js.Any,
        fnSkipElement: js.Any
      ) = this()
      def this(
        oRootControl: typings.openui5.sap.ui.core.UIArea,
        serializeDelegate: js.Any,
        bSkipRoot: Boolean,
        fnSkipAggregations: js.Any,
        fnSkipElement: js.Any
      ) = this()
    }
    
    @js.native
    class ViewSerializer protected ()
      extends typings.openui5.sap.ui.core.util.serializer.ViewSerializer {
      /**
        * View serializer class. Iterates over all controls and serializes all found views by calling the
        * corresponding view type serializer.
        * @param oRootControl the root control to serialize
        * @param oWindow the window object. Default is the window object the instance of the serializer is
        * running in.
        * @param sDefaultXmlNamespace defines the default xml namespace
        */
      def this(oRootControl: typings.openui5.sap.ui.core.Control) = this()
      def this(oRootControl: typings.openui5.sap.ui.core.UIArea) = this()
      def this(oRootControl: typings.openui5.sap.ui.core.Control, oWindow: js.Any) = this()
      def this(oRootControl: typings.openui5.sap.ui.core.UIArea, oWindow: js.Any) = this()
      def this(
        oRootControl: typings.openui5.sap.ui.core.Control,
        oWindow: js.UndefOr[scala.Nothing],
        sDefaultXmlNamespace: String
      ) = this()
      def this(oRootControl: typings.openui5.sap.ui.core.Control, oWindow: js.Any, sDefaultXmlNamespace: String) = this()
      def this(
        oRootControl: typings.openui5.sap.ui.core.UIArea,
        oWindow: js.UndefOr[scala.Nothing],
        sDefaultXmlNamespace: String
      ) = this()
      def this(oRootControl: typings.openui5.sap.ui.core.UIArea, oWindow: js.Any, sDefaultXmlNamespace: String) = this()
    }
    
    @js.native
    class XMLViewSerializer protected ()
      extends typings.openui5.sap.ui.core.util.serializer.XMLViewSerializer {
      /**
        * XML view serializer class. Serializes a given view.
        * @param oView the view to serialize
        * @param oWindow the window object. Default is the window object the instance of the serializer is
        * running in
        * @param sDefaultXmlNamespace defines the default XML namespace
        * @param fnGetControlId delegate function which returns the control id
        * @param fnGetEventHandlerName delegate function which returns the event handler name
        */
      def this(
        oView: XMLView,
        oWindow: js.Any,
        sDefaultXmlNamespace: String,
        fnGetControlId: js.Any,
        fnGetEventHandlerName: js.Any
      ) = this()
    }
    
    @js.native
    object delegate extends js.Object {
      @js.native
      /**
        * Abstract serializer delegate class. All delegates must extend from this class and implement the
        * abstract methods.
        */
      abstract class Delegate ()
        extends typings.openui5.sap.ui.core.util.serializer.delegate.Delegate
      
      @js.native
      class HTML protected ()
        extends typings.openui5.sap.ui.core.util.serializer.delegate.HTML {
        /**
          * HTML serializer delegate class. Called by the serializer instance.
          * @param fnGetControlId delegate function which returns the control id
          * @param fnGetEventHandlerName delegate function which returns the event handler name
          */
        def this(fnGetControlId: js.Any) = this()
        def this(fnGetControlId: js.Any, fnGetEventHandlerName: js.Any) = this()
      }
      
      @js.native
      class XML protected ()
        extends typings.openui5.sap.ui.core.util.serializer.delegate.XML {
        /**
          * XML serializer delegate class. Called by the serializer instance.
          * @param sDefaultXmlNamespace defines the default XML namespace
          * @param fnGetControlId delegate function which returns the control id
          * @param fnGetEventHandlerName delegate function which returns the event handler name
          * @param fnMemorizePackage a delegate function to memorize the control packages
          */
        def this(sDefaultXmlNamespace: String) = this()
        def this(sDefaultXmlNamespace: String, fnGetControlId: js.Any) = this()
        def this(
          sDefaultXmlNamespace: String,
          fnGetControlId: js.UndefOr[scala.Nothing],
          fnGetEventHandlerName: js.Any
        ) = this()
        def this(sDefaultXmlNamespace: String, fnGetControlId: js.Any, fnGetEventHandlerName: js.Any) = this()
        def this(
          sDefaultXmlNamespace: String,
          fnGetControlId: js.UndefOr[scala.Nothing],
          fnGetEventHandlerName: js.UndefOr[scala.Nothing],
          fnMemorizePackage: js.Any
        ) = this()
        def this(
          sDefaultXmlNamespace: String,
          fnGetControlId: js.UndefOr[scala.Nothing],
          fnGetEventHandlerName: js.Any,
          fnMemorizePackage: js.Any
        ) = this()
        def this(
          sDefaultXmlNamespace: String,
          fnGetControlId: js.Any,
          fnGetEventHandlerName: js.UndefOr[scala.Nothing],
          fnMemorizePackage: js.Any
        ) = this()
        def this(
          sDefaultXmlNamespace: String,
          fnGetControlId: js.Any,
          fnGetEventHandlerName: js.Any,
          fnMemorizePackage: js.Any
        ) = this()
      }
      
    }
    
  }
  
}

