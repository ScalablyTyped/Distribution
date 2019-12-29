package typings.openui5.sap.ui.test

import typings.openui5.sap.ui.base.ManagedObject
import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.test.matchers")
@js.native
object matchers extends js.Object {
  @js.native
  class AggregationContainsPropertyEqual protected () extends Matcher {
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
    /**
      * Gets current value of property <code>aggregationName</code>.The Name of the aggregation that is used
      * for matching.
      * @returns Value of property <code>aggregationName</code>
      */
    def getAggregationName(): String = js.native
    /**
      * Gets current value of property <code>propertyName</code>.The Name of the property that is used for
      * matching.
      * @returns Value of property <code>propertyName</code>
      */
    def getPropertyName(): String = js.native
    /**
      * Gets current value of property <code>propertyValue</code>.The value of the Property that is used for
      * matching.
      * @returns Value of property <code>propertyValue</code>
      */
    def getPropertyValue(): js.Any = js.native
    /**
      * Sets a new value for property <code>aggregationName</code>.The Name of the aggregation that is used
      * for matching.When called with a value of <code>null</code> or <code>undefined</code>, the default
      * value of the property will be restored.
      * @param sAggregationName New value for property <code>aggregationName</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setAggregationName(sAggregationName: String): AggregationContainsPropertyEqual = js.native
    /**
      * Sets a new value for property <code>propertyName</code>.The Name of the property that is used for
      * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
      * of the property will be restored.
      * @param sPropertyName New value for property <code>propertyName</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setPropertyName(sPropertyName: String): AggregationContainsPropertyEqual = js.native
    /**
      * Sets a new value for property <code>propertyValue</code>.The value of the Property that is used for
      * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
      * of the property will be restored.
      * @param oPropertyValue New value for property <code>propertyValue</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setPropertyValue(oPropertyValue: js.Any): AggregationContainsPropertyEqual = js.native
  }
  
  @js.native
  class AggregationFilled protected () extends Matcher {
    /**
      * AggregationFilled - checks if an aggregation contains at least one entry.Accepts an object literal
      * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
      * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
      * of the syntax of the settings object.
      * @param mSettings optional map/JSON-object with initial settings for the new AggregationFilledMatcher
      */
    def this(mSettings: js.Any) = this()
    /**
      * Gets current value of property <code>name</code>.The name of the aggregation that is used for
      * matching.
      * @returns Value of property <code>name</code>
      */
    def getName(): String = js.native
    /**
      * Sets a new value for property <code>name</code>.The name of the aggregation that is used for
      * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
      * of the property will be restored.
      * @param sName New value for property <code>name</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setName(sName: String): AggregationFilled = js.native
  }
  
  @js.native
  class AggregationLengthEquals protected () extends Matcher {
    /**
      * AggregationLengthEquals - checks if an aggregation contains at least one entry.Accepts an object
      * literal <code>mSettings</code> that defines initialproperty values, aggregated and associated
      * objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general
      * description of the syntax of the settings object.
      * @param mSettings optional map/JSON-object with initial settings for the new
      * AggregationLengthEqualsMatcher
      */
    def this(mSettings: js.Any) = this()
    /**
      * Gets current value of property <code>length</code>.The length that aggregation <code>name</code>
      * should have.
      * @returns Value of property <code>length</code>
      */
    def getLength(): Double = js.native
    /**
      * Gets current value of property <code>name</code>.The name of the aggregation that is used for
      * matching.
      * @returns Value of property <code>name</code>
      */
    def getName(): String = js.native
    /**
      * Sets a new value for property <code>length</code>.The length that aggregation <code>name</code>
      * should have.When called with a value of <code>null</code> or <code>undefined</code>, the default
      * value of the property will be restored.
      * @param iLength New value for property <code>length</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setLength(iLength: Double): AggregationLengthEquals = js.native
    /**
      * Sets a new value for property <code>name</code>.The name of the aggregation that is used for
      * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
      * of the property will be restored.
      * @param sName New value for property <code>name</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setName(sName: String): AggregationLengthEquals = js.native
  }
  
  @js.native
  class Ancestor protected () extends js.Object {
    def this(oAncestorControl: js.Any) = this()
    def this(oAncestorControl: js.Any, bDirect: Boolean) = this()
  }
  
  @js.native
  class BindingPath protected () extends Matcher {
    /**
      * BindingPath - checks if a control has a binding context with the exact same binding path.Accepts an
      * object literal <code>mSettings</code> that defines initialproperty values, aggregated and associated
      * objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general
      * description of the syntax of the settings object.
      * @param mSettings Map/JSON-object with initial settings for the new BindingPath.
      */
    def this(mSettings: js.Any) = this()
    /**
      * Gets current value of property <code>modelName</code>.The name of the binding model that is used for
      * matching.
      * @returns Value of property <code>modelName</code>
      */
    def getModelName(): String = js.native
    /**
      * Gets current value of property <code>path</code>.The value of the binding path that is used for
      * matching.
      * @returns Value of property <code>path</code>
      */
    def getPath(): String = js.native
    /**
      * Sets a new value for property <code>modelName</code>.The name of the binding model that is used for
      * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
      * of the property will be restored.
      * @param sModelName New value for property <code>modelName</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setModelName(sModelName: String): BindingPath = js.native
    /**
      * Sets a new value for property <code>path</code>.The value of the binding path that is used for
      * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
      * of the property will be restored.
      * @param sPath New value for property <code>path</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setPath(sPath: String): BindingPath = js.native
  }
  
  @js.native
  class Interactable () extends Matcher
  
  @js.native
  abstract class Matcher () extends ManagedObject {
    /**
      * Checks if the matcher is matching - will get an instance of sap.ui.Control as parameter.Should be
      * overwritten by subclasses
      * @param oControl the control that is checked by the matcher
      * @returns true if the Control is matching the condition of the matcher
      */
    def isMatching(oControl: Control): Boolean = js.native
  }
  
  @js.native
  class Properties protected () extends js.Object {
    def this(oProperties: js.Any) = this()
  }
  
  @js.native
  class PropertyStrictEquals protected () extends Matcher {
    /**
      * PropertyStrictEquals - checks if a property has the exact same value.Accepts an object literal
      * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
      * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
      * of the syntax of the settings object.
      * @param mSettings optional map/JSON-object with initial settings for the new PropertyStrictEquals
      */
    def this(mSettings: js.Any) = this()
    /**
      * Gets current value of property <code>name</code>.The Name of the property that is used for matching.
      * @returns Value of property <code>name</code>
      */
    def getName(): String = js.native
    /**
      * Gets current value of property <code>value</code>.The value of the property that is used for
      * matching.
      * @returns Value of property <code>value</code>
      */
    def getValue(): js.Any = js.native
    /**
      * Sets a new value for property <code>name</code>.The Name of the property that is used for
      * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
      * of the property will be restored.
      * @param sName New value for property <code>name</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setName(sName: String): PropertyStrictEquals = js.native
    /**
      * Sets a new value for property <code>value</code>.The value of the property that is used for
      * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
      * of the property will be restored.
      * @param oValue New value for property <code>value</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setValue(oValue: js.Any): PropertyStrictEquals = js.native
  }
  
}

