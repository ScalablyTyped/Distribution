package typings.openui5.global.sap.ui.model

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `type` {
  
  @JSGlobal("sap.ui.model.type.Boolean")
  @js.native
  class Boolean protected ()
    extends typings.openui5.sap.ui.model.`type`.Boolean {
    /**
      * Constructor for a Boolean type.
      * @param oFormatOptions formatting options. Boolean doesn't support any specific format options
      * @param oConstraints value constraints. Boolean doesn't support additional constraints
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.model.type.Currency")
  @js.native
  class Currency protected ()
    extends typings.openui5.sap.ui.model.`type`.Currency {
    /**
      * Constructor for a Currency type.
      * @param oFormatOptions formatting options. Supports the same options as {@link
      * sap.ui.core.format.NumberFormat.getCurrencyInstance NumberFormat.getCurrencyInstance}
      * @param oConstraints value constraints.
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.model.type.Date")
  @js.native
  class Date protected ()
    extends typings.openui5.sap.ui.model.`type`.Date {
    /**
      * Constructor for a Date type.
      * @param oFormatOptions options used to create a DateFormat for formatting / parsing. Supports the
      * same options as {@link sap.ui.core.format.DateFormat.getDateInstance DateFormat.getDateInstance}
      * @param oConstraints value constraints.
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.model.type.DateTime")
  @js.native
  class DateTime protected ()
    extends typings.openui5.sap.ui.model.`type`.DateTime {
    /**
      * Constructor for a DateTime type.
      * @param oFormatOptions options used to create a DateFormat for formatting / parsing to/from external
      * values and          optionally for a second DateFormat to convert between the data source format
      * (Model) and the internally used JavaScript Date.format.          For both DateFormat objects, the
      * same options are supported as for {@link sap.ui.core.format.DateFormat.getDateTimeInstance
      * DateFormat.getDateTimeInstance}.          Note that this differs from the base type.
      * @param oConstraints value constraints. Supports the same kind of constraints as its base type Date,
      * but note the different format options (Date vs. DateTime)
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.model.type.FileSize")
  @js.native
  class FileSize protected ()
    extends typings.openui5.sap.ui.model.`type`.FileSize {
    /**
      * Constructor for a FileSize type.
      * @param oFormatOptions formatting options. Supports the same options as {@link
      * sap.ui.core.format.FileSizeFormat.getInstance FileSizeFormat.getInstance}
      * @param oConstraints value constraints.
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.model.type.Float")
  @js.native
  class Float protected ()
    extends typings.openui5.sap.ui.model.`type`.Float {
    /**
      * Constructor for a Float type.
      * @param oFormatOptions formatting options. Supports the same options as {@link
      * sap.ui.core.format.NumberFormat.getFloatInstance NumberFormat.getFloatInstance}
      * @param oConstraints value constraints.
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.model.type.Integer")
  @js.native
  class Integer protected ()
    extends typings.openui5.sap.ui.model.`type`.Integer {
    /**
      * Constructor for a Integer type.
      * @param oFormatOptions formatting options. Supports the same options as {@link
      * sap.ui.core.format.NumberFormat.getIntegerInstance NumberFormat.getIntegerInstance}
      * @param oConstraints value constraints.
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.model.type.String")
  @js.native
  class String protected ()
    extends typings.openui5.sap.ui.model.`type`.String {
    /**
      * Constructor for a String type.
      * @param oFormatOptions formatting options. String doesn't support any formatting options
      * @param oConstraints value constraints. All given constraints must be fulfilled by a value to be
      * valid
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.model.type.Time")
  @js.native
  class Time protected ()
    extends typings.openui5.sap.ui.model.`type`.Time {
    /**
      * Constructor for a Time type.
      * @param oFormatOptions options used to create a DateFormat for formatting / parsing to/from external
      * values and          optionally for a second DateFormat to convert between the data source format
      * (Model) and the internally used JavaScript Date.format.          For both DateFormat objects, the
      * same options are supported as for {@link sap.ui.core.format.DateFormat.getTimeInstance
      * DateFormat.getTimeInstance}.          Note that this differs from the base type.
      * @param oConstraints value constraints. Supports the same kind of constraints as its base type Date,
      * but note the different format options (Date vs. Time)
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
}
