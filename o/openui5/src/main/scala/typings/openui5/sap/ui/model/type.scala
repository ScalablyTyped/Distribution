package typings.openui5.sap.ui.model

import typings.openui5.sap.ui.model.`type`.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.type")
@js.native
object `type` extends js.Object {
  @js.native
  class Boolean protected () extends SimpleType {
    /**
      * Constructor for a Boolean type.
      * @param oFormatOptions formatting options. Boolean doesn't support any specific format options
      * @param oConstraints value constraints. Boolean doesn't support additional constraints
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class Currency protected () extends CompositeType {
    /**
      * Constructor for a Currency type.
      * @param oFormatOptions formatting options. Supports the same options as {@link
      * sap.ui.core.format.NumberFormat.getCurrencyInstance NumberFormat.getCurrencyInstance}
      * @param oConstraints value constraints.
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    def formatValue(vValue: java.lang.String, sInternalType: java.lang.String): js.Any = js.native
  }
  
  @js.native
  class Date protected () extends SimpleType {
    /**
      * Constructor for a Date type.
      * @param oFormatOptions options used to create a DateFormat for formatting / parsing. Supports the
      * same options as {@link sap.ui.core.format.DateFormat.getDateInstance DateFormat.getDateInstance}
      * @param oConstraints value constraints.
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
    /**
      */
    def getOutputPattern(): Unit = js.native
  }
  
  @js.native
  class DateTime protected () extends Date {
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
  
  @js.native
  class FileSize protected () extends SimpleType {
    /**
      * Constructor for a FileSize type.
      * @param oFormatOptions formatting options. Supports the same options as {@link
      * sap.ui.core.format.FileSizeFormat.getInstance FileSizeFormat.getInstance}
      * @param oConstraints value constraints.
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class Float protected () extends SimpleType {
    /**
      * Constructor for a Float type.
      * @param oFormatOptions formatting options. Supports the same options as {@link
      * sap.ui.core.format.NumberFormat.getFloatInstance NumberFormat.getFloatInstance}
      * @param oConstraints value constraints.
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class Integer protected () extends SimpleType {
    /**
      * Constructor for a Integer type.
      * @param oFormatOptions formatting options. Supports the same options as {@link
      * sap.ui.core.format.NumberFormat.getIntegerInstance NumberFormat.getIntegerInstance}
      * @param oConstraints value constraints.
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class String protected () extends SimpleType {
    /**
      * Constructor for a String type.
      * @param oFormatOptions formatting options. String doesn't support any formatting options
      * @param oConstraints value constraints. All given constraints must be fulfilled by a value to be
      * valid
      */
    def this(oFormatOptions: js.Any) = this()
    def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  }
  
  @js.native
  class Time protected () extends Date {
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

