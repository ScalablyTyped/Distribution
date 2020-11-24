package typings.openui5.global.sap.ui.test

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.test.matchers")
@js.native
object matchers extends js.Object {
  
  @js.native
  class AggregationContainsPropertyEqual protected ()
    extends typings.openui5.sap.ui.test.matchers.AggregationContainsPropertyEqual {
    /**
      * AggregationContainsPropertyEqual - checks if an aggregation contains at least one item that has a
      * Property set to a certain value.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param mSettings optional map/JSON-object with initial settings for the new
      * AggregationContainsPropertyEqualMatcher
      */
    def this(mSettings: js.Any) = this()
  }
  
  @js.native
  class AggregationFilled protected ()
    extends typings.openui5.sap.ui.test.matchers.AggregationFilled {
    /**
      * AggregationFilled - checks if an aggregation contains at least one entry.Accepts an object literal
      * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
      * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
      * of the syntax of the settings object.
      * @param mSettings optional map/JSON-object with initial settings for the new AggregationFilledMatcher
      */
    def this(mSettings: js.Any) = this()
  }
  
  @js.native
  class AggregationLengthEquals protected ()
    extends typings.openui5.sap.ui.test.matchers.AggregationLengthEquals {
    /**
      * AggregationLengthEquals - checks if an aggregation contains at least one entry.Accepts an object
      * literal <code>mSettings</code> that defines initialproperty values, aggregated and associated
      * objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general
      * description of the syntax of the settings object.
      * @param mSettings optional map/JSON-object with initial settings for the new
      * AggregationLengthEqualsMatcher
      */
    def this(mSettings: js.Any) = this()
  }
  
  @js.native
  class Ancestor protected ()
    extends typings.openui5.sap.ui.test.matchers.Ancestor {
    def this(oAncestorControl: js.Any) = this()
    def this(oAncestorControl: js.Any, bDirect: Boolean) = this()
  }
  
  @js.native
  class BindingPath protected ()
    extends typings.openui5.sap.ui.test.matchers.BindingPath {
    /**
      * BindingPath - checks if a control has a binding context with the exact same binding path.Accepts an
      * object literal <code>mSettings</code> that defines initialproperty values, aggregated and associated
      * objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general
      * description of the syntax of the settings object.
      * @param mSettings Map/JSON-object with initial settings for the new BindingPath.
      */
    def this(mSettings: js.Any) = this()
  }
  
  @js.native
  class Interactable ()
    extends typings.openui5.sap.ui.test.matchers.Interactable
  
  @js.native
  abstract class Matcher ()
    extends typings.openui5.sap.ui.test.matchers.Matcher
  
  @js.native
  class Properties protected ()
    extends typings.openui5.sap.ui.test.matchers.Properties {
    def this(oProperties: js.Any) = this()
  }
  
  @js.native
  class PropertyStrictEquals protected ()
    extends typings.openui5.sap.ui.test.matchers.PropertyStrictEquals {
    /**
      * PropertyStrictEquals - checks if a property has the exact same value.Accepts an object literal
      * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
      * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
      * of the syntax of the settings object.
      * @param mSettings optional map/JSON-object with initial settings for the new PropertyStrictEquals
      */
    def this(mSettings: js.Any) = this()
  }
}
