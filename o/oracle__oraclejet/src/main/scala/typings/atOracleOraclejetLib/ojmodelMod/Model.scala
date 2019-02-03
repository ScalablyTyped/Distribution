package typings
package atOracleOraclejetLib.ojmodelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojmodel", "Model")
@js.native
class Model () extends js.Object {
  def this(attributes: js.Object) = this()
  def this(attributes: js.Object, options: js.Object) = this()
  var attributes: js.Object = js.native
  var customURL: (js.Function3[
    /* param0 */ java.lang.String, 
    /* param1 */ this.type, 
    /* param2 */ js.Object, 
    java.lang.String | js.Object | scala.Null
  ]) | scala.Null = js.native
  var defaults: js.Object = js.native
  var id: java.lang.String | scala.Null = js.native
  var idAttribute: java.lang.String | scala.Null = js.native
  var omitLanguageHeader: scala.Boolean = js.native
  var urlRoot: java.lang.String | scala.Null = js.native
  var validate: (js.Function2[
    /* param0 */ js.Object, 
    /* param1 */ js.Object, 
    java.lang.String | js.Object | scala.Null
  ]) | scala.Null = js.native
  var validationError: java.lang.String | js.Object | scala.Null = js.native
  def changedAttributes(): js.Object | scala.Boolean = js.native
  def changedAttributes(attributes: js.Object): js.Object | scala.Boolean = js.native
  def clear(): Model | scala.Boolean = js.native
  def clear(options: js.Object): Model | scala.Boolean = js.native
  def destroy(): scala.Boolean = js.native
  def destroy(options: atOracleOraclejetLib.Anon_ErrorModel): scala.Boolean = js.native
  def fetch(): js.Object = js.native
  def fetch(options: atOracleOraclejetLib.Anon_ErrorModelOptions): js.Object = js.native
  def get(property: java.lang.String): js.Object = js.native
  def has(property: java.lang.String): scala.Boolean = js.native
  def hasChanged(): scala.Boolean = js.native
  def hasChanged(attribute: java.lang.String): scala.Boolean = js.native
  def invert(): js.Object = js.native
  def isNew(): scala.Boolean = js.native
  def isValid(): scala.Boolean = js.native
  def keys(): js.Array[js.Object] = js.native
  def listenTo(
    otherObj: js.Object,
    eventType: java.lang.String,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def listenToOnce(
    otherObj: js.Object,
    eventType: java.lang.String,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def matches(attrs: js.Object): js.Function1[/* param0 */ this.type, scala.Boolean] = js.native
  def off(): js.UndefOr[scala.Nothing] = js.native
  def off(eventType: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def off(
    eventType: java.lang.String,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def off(
    eventType: java.lang.String,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def off(eventType: js.Object): js.UndefOr[scala.Nothing] = js.native
  def off(
    eventType: js.Object,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def off(
    eventType: js.Object,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def omit(keys: js.Array[js.Object]): js.Object = js.native
  def omit(keys: js.Object): js.Object = js.native
  def on(
    eventType: java.lang.String,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def on(
    eventType: java.lang.String,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def on(
    eventType: js.Object,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def on(
    eventType: js.Object,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def once(
    eventType: java.lang.String,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def once(
    eventType: java.lang.String,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def pairs(): js.Object = js.native
  def parse(param0: js.Object): js.Object = js.native
  def parseSave(param0: js.Object): js.Object = js.native
  def pick(keys: js.Array[js.Object]): js.Object = js.native
  def pick(keys: js.Object): js.Object = js.native
  def previous(attr: java.lang.String): js.Object = js.native
  def previousAttributes(): js.Object = js.native
  def save(): js.Object | scala.Boolean = js.native
  def save(attributes: js.Object): js.Object | scala.Boolean = js.native
  def save(attributes: js.Object, options: atOracleOraclejetLib.Anon_Attrs): js.Object | scala.Boolean = js.native
  def set(property: java.lang.String): Model | scala.Boolean = js.native
  def set(property: java.lang.String, value: js.Object): Model | scala.Boolean = js.native
  def set(property: java.lang.String, value: js.Object, options: js.Object): Model | scala.Boolean = js.native
  def set(property: js.Object): Model | scala.Boolean = js.native
  def set(property: js.Object, value: js.Object): Model | scala.Boolean = js.native
  def set(property: js.Object, value: js.Object, options: js.Object): Model | scala.Boolean = js.native
  def stopListening(): js.UndefOr[scala.Nothing] = js.native
  def stopListening(otherObj: js.Object): js.UndefOr[scala.Nothing] = js.native
  def stopListening(otherObj: js.Object, eventType: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def stopListening(
    otherObj: js.Object,
    eventType: java.lang.String,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def sync(method: java.lang.String, model: Model): js.Object = js.native
  def sync(method: java.lang.String, model: Model, options: js.Object): js.Object = js.native
  def toJSON(): js.Object = js.native
  def trigger(eventType: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def unset(property: java.lang.String): scala.Boolean = js.native
  def unset(property: java.lang.String, options: js.Object): scala.Boolean = js.native
  def url(): java.lang.String | scala.Null = js.native
  def values(): js.Array[js.Object] = js.native
}

/* static members */
@JSImport("@oracle/oraclejet/ojmodel", "Model")
@js.native
object Model extends js.Object {
  def extend(): js.Any = js.native
  def extend(properties: atOracleOraclejetLib.Anon_AttributesData): js.Any = js.native
  def extend(properties: atOracleOraclejetLib.Anon_AttributesData, classProperties: js.Object): js.Any = js.native
}

