package typings
package atPhosphorPropertiesLib.atPhosphorPropertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/properties", "AttachedProperty")
@js.native
object AttachedPropertyNs extends js.Object {
  /**
    * The options object used to initialize an attached property.
    */
  trait IOptions[T, U] extends js.Object {
    /**
      * A function called when the property value has changed.
      *
      * #### Notes
      * This will be invoked when the property value is changed and the
      * comparator indicates that the old value is not equal to the new
      * value.
      *
      * This will **not** be called for the initial default value.
      */
    var changed: js.UndefOr[js.Function3[/* owner */ T, /* oldValue */ U, /* newValue */ U, scala.Unit]] = js.undefined
    /**
      * A function used to coerce a supplied value into the final value.
      *
      * #### Notes
      * This will be called whenever the property value is changed, or
      * when the property is explicitly coerced. The return value will
      * be used as the final value of the property.
      *
      * This will **not** be called for the initial default value.
      */
    var coerce: js.UndefOr[js.Function2[/* owner */ T, /* value */ U, U]] = js.undefined
    /**
      * A function used to compare two values for equality.
      *
      * #### Notes
      * This is called to determine if the property value has changed.
      * It should return `true` if the given values are equivalent, or
      * `false` if they are different.
      *
      * If this is not provided, it defaults to the `===` operator.
      */
    var compare: js.UndefOr[js.Function2[/* oldValue */ U, /* newValue */ U, scala.Boolean]] = js.undefined
    /**
      * The human readable name for the property.
      *
      * #### Notes
      * By convention, this should be the same as the name used to define
      * the public accessor for the property value.
      *
      * This **does not** have an effect on the property lookup behavior.
      * Multiple properties may share the same name without conflict.
      */
    var name: java.lang.String
    /**
      * A factory function used to create the default property value.
      *
      * #### Notes
      * This will be called whenever the property value is required,
      * but has not yet been set for a given owner.
      */
    def create(owner: T): U
  }
  
  /**
    * Clear the stored property data for the given owner.
    *
    * @param owner - The property owner of interest.
    *
    * #### Notes
    * This will clear all property values for the owner, but it will
    * **not** run the change notification for any of the properties.
    */
  def clearData(owner: js.Any): scala.Unit = js.native
}

