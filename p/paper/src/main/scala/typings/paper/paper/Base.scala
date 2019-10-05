package typings.paper.paper

import typings.paper.Anon_AsStringFalse
import typings.paper.Anon_AsStringPrecision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class for all library classes.
  */
@JSGlobal("paper.Base")
@js.native
class Base () extends js.Object {
  /**
    * Exports (serializes) this object to a JSON data object or string.
    *
    *
    * @param options [optional] - the serialization options
    * @option [options.asString=true] - whether the JSON is returned as a Object or a String.
    * @option [options.precision=5] - the amount of fractional digits in numbers used in JSON data.
    * @return the exported JSON data
    */
  def exportJSON(): String = js.native
  def exportJSON(options: Anon_AsStringFalse): js.Object | js.Array[_] = js.native
  def exportJSON(options: Anon_AsStringPrecision): String = js.native
  /**
    * Imports (deserializes) the stored JSON data into the object, if the
    * classes match. If they do not match, a newly created object is returned
    * instead.
    */
  def importJSON(json: String): Unit = js.native
  def importJSON[T /* <: Base */](json: T): T = js.native
  /**
    * Same as `exportJSON({ asString: false })`.
    */
  def toJSON(): js.Object | js.Array[_] = js.native
}

/* static members */
@JSGlobal("paper.Base")
@js.native
object Base extends js.Object {
  /**
    * Checks if two values or objects are equals to each other, by using their
    * equals() methods if available, and also comparing elements of arrays and
    * properties of objects.
    */
  def equals(obj1: js.Any, obj2: js.Any): Boolean = js.native
  /**
    * Exports (serializes) object to a JSON data object or string.
    *
    *
    * @param options [optional] - the serialization options
    * @option [options.asString=true] - whether the JSON is returned as a Object or a String.
    * @option [options.precision=5] - the amount of fractional digits in numbers used in JSON data.
    * @return the exported JSON data
    */
  def exportJSON(obj: js.Any): String = js.native
  def exportJSON(obj: js.Any, options: Anon_AsStringFalse): js.Object | js.Array[_] = js.native
  def exportJSON(obj: js.Any, options: Anon_AsStringPrecision): String = js.native
  def importJSON(json: String): js.Any = js.native
  def importJSON(json: String, target: js.Any): js.Any = js.native
  def importJSON(json: js.Array[_]): js.Any = js.native
  def importJSON(json: js.Array[_], target: js.Any): js.Any = js.native
  /**
    * Imports (deserializes) the stored JSON data into the target, if the
    * classes match. If they do not match, a newly created object is returned
    * instead.
    */
  def importJSON(json: js.Object): js.Any = js.native
  def importJSON(json: js.Object, target: js.Any): js.Any = js.native
  def importJSON[T /* <: Base */](json: T): T = js.native
  def importJSON[T /* <: Base */](json: T, target: T): T = js.native
}

